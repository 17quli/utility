%macro get_impala_details(engine=, connect=, table=);
/*
    Macro name:                                     Get Impala Details
    Author:                                         Laurie Fleming
    Date-written:                                   9 June 2020
    Remarks:                                        Inspect Impala metadata (show create table output) and return parition, sort and
                                                    numrows values.

    Modification history:                           (in reverse chronological order)
    Laurie Fleming                                  First written.
    9 June 2020
*/    
%local create_table find;
%let partitioned_by =;                              /* These columns have to be defined in the primary pattern macros */
%let sort_by =;
%let numrows =;
proc sql noprint;
connect to &engine(&connect);
%if &sysuserid ne irdrun %then %do;
    execute (set buffer_pool_limit = 12g)
       by &staging_library_engine;
    execute (set mem_limit = 0)
       by &staging_library_engine;
    %end;
/*
    This returns (for example) PARTITIONED BY (   tax_type VARCHAR(6) ) SORT BY (   return_period_date ) ... 
    TBLPROPERTIES ('DO_NOT_UPDATE_STATS'='true', 'STATS_GENERATED_VIA_STATS_TASK'='true', 'numRows'='895850787', 'totalSize'='35853316396')
*/
select * into :create_table trimmed
   from connection to sasioimp(show create table &tgt_schema..&hadoop_table);

%let find = %sysfunc(find(&create_table, PARTITIONED BY));
%if %eval(&find) %then %do;
    %let partitioned_by = %qsysfunc(substr(&create_table, &find));
    %let partitioned_by = %sysfunc(compbl(%qsysfunc(strip(%qsysfunc(scan(&partitioned_by, 2, %str(%(%))))))));
    %put &partitioned_by;
    %end;

%let find = %sysfunc(find(&create_table, SORT BY));
%if %eval(&find) %then %do;
    %let sort_by =  %qsysfunc(substr(&create_table, &find));
    %let sort_by = %sysfunc(compbl(%qsysfunc(strip(%qsysfunc(scan(&sort_by, 2, %str(%(%))))))));
    %put &sort_by;
    %end;

%let find = %sysfunc(find(&create_table, numRows));
%if %eval(&find) %then %do;
    %let numrows = %qsysfunc(substr(&create_table, &find));
    %let numrows = %unquote(%sysfunc(scan(&numrows, 3, %nrstr(%'))));
    %put &=numrows;
    %end;
disconnect from &engine;
quit;
%mend get_impala_details;