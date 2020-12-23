%macro setup_journal / minoperator mindelimiter=',';
/*
    Name:                           Setup journal
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   December 2019
    Remarks:                        Check existence of primary (prod) and environmental
                                    journals. If the schemas match, the job is running in
                                    production. For further details, see load_journal.sas.
    
    Modification History:           (in reverse chronological order)
    Laurie Fleming                  Clarified processing of primary journal.
    4 February 2002
    
    Laurie Fleming                  First written
    December 2019
*/
%local jnl_nobs primary_jnl_nobs journal_columns;
%let jnl_nobs = 0;
%let primary_jnl_nobs = 0;
%let primary_journal_exist = No;

%if &pjnl_schema = &jnl_schema                                  /* This will only happen when this is run in Production */
    %then %let environment = Primary;
    %else %let environment = NotPrimary;

%if &read_primary_journal = No %then
    %goto Environment_Journal;
%hadoop_exist(schema=%sysfunc(compress(&pjnl_schema, %str(`))), table=&sas_table);
%let primary_journal_exist = &_exist; /* primary_journal_exist and journal_exist are defined in the top-level macro */
%if &primary_journal_exist = No %then
    %goto Environment_Journal;
%if &primary_journal_exist = Yes %then %do;
    %count(dsn=&primary_jnl_library..&sas_table, dbms=impala, debug=&debug);
    %let primary_jnl_nobs = &_nobs;
    %if %eval(&primary_jnl_nobs = 0) %then           /* If empty, treat as if it doesn't exist. */
        %let primary_journal_exist = No;
    %end;
%Environment_Journal:
%if &primary_journal_exist = No %then %do;
    libname &primary_jnl_library clear;
    %end;
%hadoop_exist(schema=%sysfunc(compress(&jnl_schema, %str(`))), table=&sas_table);
%let journal_exist = &_exist;
%if &journal_exist = Yes %then %do;
    %count(dsn=&jnl_library..&sas_table, dbms=impala, debug=&debug);
    %let jnl_nobs = &_nobs;
    %if %eval(&jnl_nobs = 0) %then
        %let journal_exist = No;
    %end;
%mend setup_journal;