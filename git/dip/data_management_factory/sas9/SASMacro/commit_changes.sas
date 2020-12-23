%macro commit_changes / minoperator mindelimiter=',';
/*
    Name:                           Commit Chanes
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   April 2019
    Remarks:                        Rename the existing table (or journal) to _old, rename _new to 
                                    existing table then drop _old.

    Modification History:           (in reverse chronological order)
    Laurie Fleming                  Call get_impala-details, to check numrows - don't compute stats if this
    19 June 2020                    is not null. The partition value may be useful in future iterations.
    
    Laurie Fleming                  Changed to accomodate the schema being journal, not target, for
    6 Feb 2020                      Full Comparison.
    
    Laurie Fleming                  First written
    April 2019
*/          
/*
    Rename the existing table (or journal) to _old, rename _new to existing table then drop _old.
*/
%local schema;
%if &pattern = Full Comparison
    %then %let schema = &jnl_schema;
    %else %let schema = &tgt_schema;
%if %eval(&job_rc > 4) %then %do;
    %putmsg(type=ERROR, msg=%quote(Cannot commit because of errors: &=job_rc));
    %goto EndMac;
    %end;
%if %eval(&pattern in(Full Comparison, Change Extract, Record Batch Extract)) %then %do; /* Full Replacement and Event Extract do straight inserts to the target */
    %get_impala_details(engine=&_target_engine, connect=&_target_connect, table=&schema..&hadoop_table_new);

    proc sql noprint;
    connect to &_target_engine(&_target_connect);
    %put &=journal_exist;
    %if &pattern = Full Comparison and &journal_exist = No
        %then %do;
              execute(drop table if exists &schema..&hadoop_table purge)          /* It may exist, but be empty, hence the 'if exists' */
                 by &_target_engine;
              %end;
        %else %do;
              execute(alter table &schema..&hadoop_table                      /* Not Full Comparison (target), or is FC and journal does exist */
                        rename to &schema..&hadoop_table_old)
                 by &_target_engine;
              %end;
    %check_status;
    %if %eval(&job_rc > 4) %then 
        %goto EndMac;
    execute(alter table &schema..&hadoop_table_new
               rename to &schema..&hadoop_table)
       by &_target_engine;
    %check_status;
    %if %eval(&job_rc > 4) %then                                              /* The most critical evaluation in the whole process! */
        %goto EndMac;
    execute(drop table if exists &schema..&hadoop_table_old purge)                  /* Only delete the existing target if everything's all right */
       by &_target_engine;
    %check_status;
    %if %eval(&job_rc le 4) %then %do;
        execute(refresh &schema..&hadoop_table)
           by &_target_engine;
        %check_status;
        %if &numrows = %then %do;
            execute(compute stats &schema..&hadoop_table)
               by &_target_engine;
            %check_status;
            %end;
        %end;
    %end;
%check_status;
%EndMac:
disconnect from &_target_engine;
quit;
%mend commit_changes;