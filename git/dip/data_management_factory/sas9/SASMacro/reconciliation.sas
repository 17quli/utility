%macro reconciliation / minoperator mindelimiter=',';
/*
    Macro name:                                     Reconciliation
    Author:                                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                                   April-May 2019
    Remarks:                                        Compare the source data against the (_new) target to check the
                                                    inserts (new rows) and updates (new rows that have caused old rows
                                                    to be changed).

    Modification history:                           (in reverse chronological order)
    Laurie Fleming                                  Correction for P2 calculations, caused by changes to the H1 sub-pattern.
    12 June 2020                                     
    
    Laurie Fleming                                  First written
    April 2019
*/    
%let status_msg =;
/*
    The different patterns have different ways of reconciling the source against the target. Most are fairly 
    obvious, but Change Extract's counts are as complicated as the creation of the _new table itself.
*/
%if &pattern = Full Comparison %then %do;
    proc sql noprint;
    connect to &_target_engine(&_target_connect);
    select count
      into :right_count
      from connection to &_target_engine
      (select count(*) as `count`
         from &jnl_schema..&hadoop_table_new
        where record_active_flag = 'Y');
    disconnect from &_target_engine;
    quit;
    %end;
%if &pattern in(Full Replacement, Full Comparison, Event Extract) %then %do;
    data _null_;
    retain m1 -1;
    attrib left_count right_count length=8 format=comma14.;
    attrib status_msg length=$ 100;
    left_count = symgetn('left_count');
    right_count = symgetn('right_count');
    if left_count = right_count
       then putlog 'INFO: Source and target counts match: ' left_count +m1 '.';         /* Success - reconciled */
       else do;
            status_msg = cat('ERROR: Row counts do not match: Source: ', strip(putn(left_count, 'comma14.')),
                             '; Target: ', strip(putn(right_count, 'comma14.')), '.');
            putlog status_msg;
            call symputx('status_msg', strip(status_msg), 'g');
            call execute('%rcset(8);');
            end;
     run;
     %end;
     %else %if &pattern in(Change Extract, Record Batch Extract) %then %do;
     proc datasets lib=work nolist nowarn mt=(data view);
     delete count_source_v count_target_v;
     quit;
 
     %select_cols(include_timestamp=No);
     proc sql;
     connect to &_target_engine(&_target_connect);
     %if &pattern = Change Extract %then %do;
         create view count_source_v as                          /* Source counts */
            select 'Source' as type length=6,
                   measure length=6,
                   count as source_count format=comma14.
              from connection to &_target_engine
              (select cast('insert' as varchar(6)) as measure,
                      count(*) as count
                 from &stg_schema..&hadoop_table_nr             /* Count source records that aren't in the target as inserts */
        
                union all

               select cast('update' as varchar(6)) as measure,  /* Number of unique business keys that are in source and target */
                      count(*) as `count`
                 from &tgt_schema..&hadoop_table as _l
                inner join (select distinct &select_key_cols
                              from &stg_schema..&hadoop_table_nr) as _r
                   on &join_cols
                where _l.`record_active_flag` = 'Y');
                       
         create view count_target_v as                         /* Target counts */
            select 'Target' as type length=6,
                   measure length=6,
                   count as target_count format=comma14.
              from connection to &_target_engine
              (select cast('insert' as varchar(6)) as measure, /* Number of target rows where the insert object run key matches the change transactions */
                      count(*) as count                        /* (non-obvious, but accurate) */
                 from &tgt_schema..&hadoop_table_new as _l
                inner join (select distinct `insert_object_run_key`
                              from &stg_schema..&hadoop_table_chgt
                             where operation = 'I') as _r
                   on _l.`insert_object_run_key` = _r.`insert_object_run_key`
                     
             union all

            select cast('update' as varchar) as measure,
                   count(*) as count
              from &tgt_schema..&hadoop_table_new as _l    /* Number of target rows where the *update* object run key matches the change transactions */
             inner join (select distinct `update_object_run_key`
                           from &stg_schema..&hadoop_table_chgt) as _r
                on _l.`update_object_run_key` = _r.`update_object_run_key`               
             where _l.`update_object_run_key` != _l.`insert_object_run_key`);
         %end;
    %else %if &pattern = Record Batch Extract %then %do;
         create view count_source_v as 
            select 'Source' as type length=6,
                   measure length=6,
                   count as source_count format=comma14.
              from connection to &_target_engine
              (select cast('insert' as varchar(6)) as measure,
                      count(*) as `count`
                 from &stg_schema..&hadoop_table_nr             /* Count source records that aren't in the target as inserts */

                union all
                
               select cast('update' as varchar(6)) as measure,  /* Number of unique business keys that are in source and target */
                      count(*) as `count`
                 from &tgt_schema..&hadoop_table as _l
                inner join (select distinct &select_key_cols
                              from &stg_schema..&hadoop_table_nr) as _r
                   on &join_cols
                where _l.record_active_flag = 'Y');
                
         create view count_target_v as                         /* Target counts */
            select 'Target' as type length=6,
                   measure length=6,
                   count as target_count format=comma14.
              from connection to sasioimp
              (select cast('insert' as varchar(6)) as measure, /* Number of target rows where the insert object run key matches the change transactions */
                      count(*) as `count`                      
                 from &tgt_schema..&hadoop_table_new as _l
                 left join (select distinct 
                                   &select_key_cols, 
                                   `&change_capture_timestamp`
                              from &tgt_schema..&hadoop_table) as _r
                   on &join_cols
                  and _l.`&change_capture_timestamp` = _r.`&change_capture_timestamp`
                where _r.&first_key_col is null

                union all

               select cast('update' as varchar(6)) as measure,  /* Number of unique business keys that are in source and target */
                           count(*) as `count`
                 from &tgt_schema..&hadoop_table as _l
                inner join (select distinct 
                                   &select_key_cols,
                                   `&change_capture_timestamp`
                              from &tgt_schema..&hadoop_table_new
                             where `record_active_flag` = 'Y') as _r
                    on &join_cols
                 where _l.`record_active_flag` = 'Y'
                   and _l.`&change_capture_timestamp` != _r.`&change_capture_timestamp`);
         %end;
    %check_status;
    disconnect from &_target_engine;
    quit;
    
    data _null_;
/*
    Merge these two datasets together, analyse and publish the results.
*/
    merge count_source_v(in=in_source)
          count_target_v(in=in_target);
    by measure;
    format source_count target_count comma14.;
    retain m1 -1
           error 0;
    attrib status_msg length=$ 32767;
    if source_count ne target_count 
       then do;
            status_msg = cat('ERROR: Mismatch on ', strip(measure), 
                            ': Source count ', strip(putn(source_count, 'comma14.')),
                            '; Target count: ', strip(putn(target_count, 'comma14.')), '.');
            putlog status_msg;
            call symputx('status_msg', strip(status_msg), 'g');
            call execute('%rcset(8);'); 
            stop;
            end;
       else putlog 'Matched on ' measure +m1 ': rows ' source_count;
    run;
    %end;
%EndMac:
%if &debug = No %then %do;
    proc datasets lib=work nolist nowarn mt=(data view);
    delete count_source_v
           count_target_v;
    quit;
    %end;
%mend reconciliation;