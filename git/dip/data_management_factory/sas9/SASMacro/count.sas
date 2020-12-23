%macro count(dsn=, dbms=, where=, weight=, debug=N, pass=, distinct=, authdomain=)
     / des='Format number of obs in a dataset/view';
/*       Macro:                     count.sas
         Author:                    Laurie Fleming, Daemons Ltd (c)
         Date-written:              December 3, 1997
         Remarks:                   Provides a formatted display of the  number of rows
                                    in a dataset or view.
         Macros called:             putmsg - display messages in log
                                    refnumv - reformat a numeric value
                                    countobs - actually do the counting.

         Modification history       (in reverse chronological order)
         Laurie Fleming             Stopped verbose logging (symbolgen/mlogic)
         13 March 2020 
         
         Laurie Fleming             Added IMPALA as a DBMS
         17 April 2019
         
         Laurie Fleming             Added new parameter 'distinct' - it takes a
         4 September 2002           single variable name.

         Laurie Fleming             Allowed dsn to be _last_.
         18 March 2002

         Laurie Fleming             Added new parameter 'pass', because version 8 now
         1 November 2000            no longer displays the password in pass-thru[sic] views.

         Laurie Fleming             Added Oracle option - same functionality as Sybase.
         12 April 2000

         Laurie Fleming             If the weight option is used, especially if
         31 Jan 2000                the result is non-integer, comparing the result
                                    with another number produces macro errors. By
                                    using the %sysevalf (floating-point evaluation)
                                    function, this is obviated. Similar problem found
                                    in %refnumv.

         Laurie Fleming             Added coping with XPORT engines.
         26 April 1999

         Laurie Fleming             Added new parameter 'weight' - this is passed
         30 July 1998               directly to countobs. It effectively sums the
                                    weight variable/column's value, instead of counting
                                    single observations.

         Laurie Fleming             Documentation updated
         15 April 1998

         Laurie Fleming             First written
         3 December 1997.
*/
%global __error _nobs _dbase _table;
%local count mprint notes obs areis countfmt libname type symbolgen mlogic dbms;
%local wghtsfx;        /* Description added to end of output. */
%let mprint = %sysfunc(getoption(mprint));
%let notes = %sysfunc(getoption(notes));
%let symbolgen = %sysfunc(getoption(symbolgen));
%let mlogic = %sysfunc(getoption(mlogic));
/*
       Make sure any previous steps have completed.
*/
run;
quit;
/*       Check status of debug parameter.
*/
%if &debug =
    %then %let debug = N;
    %else %do;
          %let debug = %upcase(%substr(&debug, 1, 1));
          %if &debug ne Y %then
              %let debug = N;
          %end;
/*
       Set up local and global variables.
*/
option
%if &debug = N
    %then %do;
          nomprint nonotes
          %end;
    %else %do;
          mprint notes
          %end;
    nosymbolgen nomlogic;
%if &dsn = %then %do;
    %putmsg(msg=Dataset name (dsn) cannot be defaulted.);
    %goto EndMac;
    %end;

%if %upcase(&dsn) = _LAST_ %then %do;
    %let dsn = %sysfunc(lowcase(%sysfunc(getoption(_last_))));
    %if &dsn = _NULL_ %then %do;
        %putmsg(msg=There is no _last_ dataset.);
        %goto EndMac;
        %end;
    %end;
    
%let __error = 1;
%if %eval(%index(&dsn, .) = 0)
    %then %let libname = work;
    %else %do;
          %let libname = %scan(&dsn, 1, .);
          %let dsn = %scan(&dsn, 2, .);
          %end;
/*
       Does the dataset or view actually exist?
*/
proc sql noprint;
select memtype, engine
  into :type trimmed,
       :engine trimmed
  from dictionary.members
 where libname = "%sysfunc(upcase(&libname))" and lowcase(memname) = "%sysfunc(lowcase(&dsn))";
quit;
%if &type = %then %do;
    %put Dataset/view &libname..&dsn does not exist.;
    %goto EndMac;
    %end;
    
/*
       Check if the view is a dbms one. If it is, optimise the count.
*/
%if &dbms ne %then %do;
    %let dbms = %upcase(&dbms);
    %if &dbms ne SYBASE and &dbms ne ORACLE and &dbms ne ODBC and &dbms ne IMPALA and &dbms ne SASIOIMP and &dbms ne HADOOP %then
        %let dbms =;
    %end;

%let weight = %quote(&weight);

/*
       Go off and do the counting.
*/
%countobs(dsn=&libname..&dsn, dbms=&dbms, where=&where, weight=&weight, debug=&debug, pass=&pass,
          distinct=&distinct, authdomain=&authdomain);

%if &dbms ne 
    %then %if &_dbase ne
              %then %let dsn = &libname..&dsn (&_dbase..&_table);
              %else %let dsn = &libname..&dsn (&_table);
    %else %let dsn = &libname..&dsn;
/*
       Format and display the count.
*/
%let count = &_nobs;
%if %sysevalf(&count = 1)
    %then %do;
          %let areis = is;
          %if &distinct ne
              %then %let obs = distinct value of &distinct;
              %else %if &dbms ne
              %then %let obs = observation;
              %else %let obs = row;
          %end;
    %else %do;
          %let areis = are;
          %if &distinct ne
              %then %let obs = distinct values of &distinct;
              %else %if &dbms ne
              %then %let obs = observations;
              %else %let obs = rows;
          %end;
%if %sysevalf(&count = 0)
    %then %let count = no;
    %else %let count = %refnumv(val=&count);
%let where = %quote(&where);
%if &where ne %then
    %let where = %str( where &where);
%if &weight ne %then
    %let weight = %str(, weighted by &weight);
%put There &areis &count &obs in &dsn.&where.&weight..;
%let __error = 0;
%EndMac:
/*
       Reset the tracing options.
*/
option &notes &mprint &symbolgen &mlogic;
%mend count;