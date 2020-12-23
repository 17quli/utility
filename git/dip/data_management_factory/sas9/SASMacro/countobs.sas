%macro countobs(dsn=, dbms=, where=, weight=, debug=n, pass=, distinct=, authdomain=)
       / des='Get number of obs in a dataset or view';
/*
        Macro name:                         countobs
        Source:                             countobs.sas under ~flemingl
        Author:                             Laurie Fleming
        Date written:                       12 February 1997
        Purpose:                            Count observations in a SAS dataset or view.

        Parameters:                         dsn - dataset name.
                                            dbms - Generate query to count rows from view
        Macros required:                    putmsg - display error messages

        Method:
        %global/%local/%let                 Define variables and initialise them.
        %if &dsn...                         Parse parameters
        %if &sybase = Y and %eval...        If it's a Sybase table and the dsn is a view,
                                            get the connection information from the view
                                            description. From this, generate an sql
                                            connection and get Sybase to count the number
                                            of rows. This could be a security issue, if the
                                            table is owned by somebody else.
        %if %sysfunc(exist...               Check existence and member type.
        attrn(&dsn, nlobs)                  Get the number of logical observations,
                                            if available. This is the total observations
                                            minus the deleted observations. If not available,
        data _null_                         physically read and count observations.
        %EndMac                             That's the end...

        Modification history                (reverse chronological order)
        Laurie Fleming                      Stopped verbose logging (symbolgen/mlogic)
        13 March 2020 
        
        Laurie Fleming                      Converted gencount from cat to temporary file. The catalogue
        9 August 2019                       entry was splitting rows at the linesize limit. The temporary
                                            file (probably) won't do the same at 32767 bytes...
        
        Laurie Fleming                      Added IMPALA as a DBMS
        17 April 2019

        Laurie Fleming                      Allowed for a password on a SAS dataset, rather than just a
        31 July 2012                        DBMS pass-through.

        Laurie Fleming                      Added new parameter 'distinct' - it takes a
        4 September 2002                    single variable name. Doesn't work with Sybase/Oracle yet.

        Laurie Fleming, 18 March 2002       Added _last_ as a permissible dsn value.

        Laurie Fleming, 8 January 2001      First change for the new millennium. Modified password
                                            replacement for Oracle/Sybase - in the 'describe view'
                                            the password is replaced with 'XXXXX', no matter what the
                                            length of the view's actual required password. Using the
                                            tranwrd function makes the replacement simpler and more
                                            reliable.

        Laurie Fleming, 1 November 2000     Added new parameter password, because version 8 no longer
                                            displays the password as plain text in the view description.

        Laurie Fleming, 12 April 2000       Added Oracle funtionality.

        Laurie Fleming, 26 April 1999       Allowed for sequential-engined XPORT datasets to be counted.

        Laurie Fleming, 11 March 1998       Changed counter from 'count' to '_count' - this reduces
                                            the chances of undefined results because of the source
                                            data having a variable used by the 'data _null_'.

        Laurie Fleming, 24 August 1997      Allowed 'where' processing to be done on a Sybase view.

        Laurie Fleming, 13 August 1997      Added new parameter 'where', to subset the dataset.

        Laurie Fleming, 4 July 1997         Changed name of global variable __error to __cnterr,
                                            to avoid conflicting with __error in sybload.

        Laurie Fleming, 9 May 1997          Changed reset of 'proc printto' log to standard log.
                                            When SAS runs in background this doesn't work very
                                            well otherwise (with just 'proc printto'). Corrected
                                            bug in scanning of Sybase view where the 'from ' and
                                            Sybase table name are split over two lines. SAS was
                                            trying to read past the end of the variable.

        2 May 1997                          Included Sybase row counting - faster than SAS's
                                            counting of rows in a Sybase view by several orders
                                            of magnitude.

        April 1997                          First written.
*/

/*
      Declare global and local variables.
*/
%global _nobs _dbase _table __cnterr;
%let __cnterr = 1;
run;
quit;
%local notes mprint symbolgen mlogic ls source2 fn saverc memtype engine libname dbms;

/*
     Get option information.
*/
%let mprint = %sysfunc(getoption(mprint));
%let notes = %sysfunc(getoption(notes));
%let symbolgen = %sysfunc(getoption(symbolgen));
%let mlogic = %sysfunc(getoption(mlogic));
%let source2 = %sysfunc(getoption(source2));
%let ls = %sysfunc(getoption(linesize));
%if &debug =
    %then %let debug = N;
    %else %let debug = %upcase(%substr(&debug, 1, 1));

%if &debug = N
    %then %str(option nomprint nonotes nosymbolgen nomlogic nosource2;);
    %else %str(option mprint nosymbolgen nomlogic notes source2;);

/*
       Parse parameters.
*/
%if &dsn = %then %do;
    %putmsg(msg=DSN is a compulsory parameter.);
    %let _nobs = ERROR;
    %goto EndMac;
    %end;

%if %upcase(&dsn) = _LAST_ %then %do;
    %let dsn = %sysfunc(getoption(_last_));
    %if &dsn = _NULL_ %then %do;
        %putmsg(msg=There is no _last_ dataset.);
        %goto EndMac;
        %end;
    %end;

%if &dbms ne %then %do;
    %let dbms = %upcase(&dbms);
    %if &dbms ne ORACLE and &dbms ne SYBASE and &dbms ne ODBC and &dbms ne IMPALA and &dbms ne SASIOIMP and &dbms ne HADOOP %then
        %let dbms =;
    %end;

%let where = %quote(%unquote(&where));
%let weight = %quote(%unquote(&weight));

%if %eval(%index(&dsn, .) = 0)
    %then %let libname = work;
    %else %do;
          %let libname = %scan(&dsn, 1, .);
          %let dsn = %scan(&dsn, 2, .);
          %end;

/*
      Initialise number of observations, in case no number can be found.
*/
%let _nobs = .;
/*
      Check if dataset or view exists, and what memtype (data or view) it is.
*/
proc sql noprint;
select memtype, engine
  into :memtype trimmed, 
       :engine trimmed
  from dictionary.members
 where libname = "%sysfunc(upcase(&libname))" and lowcase(memname) = "%sysfunc(lowcase(&dsn))";
quit;
%if &memtype = %then %do;
    %putmsg(type=error, msg=Dataset &libname..&dsn does not exist);
    %let _nobs = ERROR;
    %goto EndMac;
    %end;

%if &dbms ne and &memtype = VIEW %then %do;
    %if &pass = %then %do;
        %putmsg(type=error, msg=Missing password);
        %goto EndMac;
        %end;
/*
        Set up file references to contain log from view description,
        and code generated from examining the description.
*/
    filename descview catalog 'work.countobs.descview.log';
    filename gencount temp lrecl=32767;
/*
        Change linesize to 200, to make scanning of log more reliable (it works better, and faster,
        with long record lengths).
*/
    option ls=32767;
/*
        Move log to descview (see above), instead of the log window.
*/
    proc printto log=descview new;

/*
        Put description of view into the log. Part of what it contains is the connection
        information, including Sybase user id and password (!). This could be a security
        issue.

        From version 8, the password is blanked out.
*/
    proc sql;
    describe view &libname..&dsn;
    quit;

/*
        Reset the log and put the linesize back to what it was.
*/
    proc printto log=log;
    run;

    option ls=32767;

/*
        Read the log and from it pick out the salient data, reformatting it and
        generating the code to count the number of rows in the Sybase/Oracle table referenced
        by the SAS view.
*/
    data _null_;
    infile descview flowover n=2 column=colnum line=linenum ls=200 length=linelen;
    file gencount ls=32767;
    retain m1 -1 spltline 0;
    length connect record $ 200 tablenme $ 30;
/*
        Read through the log until the string 'options=' is found.
        Since version 8 of SAS, the 'connect to' options in the described view have
        the password blanked out (about time!). It's obviously not possible now to
        take advantage of the password being in displayed in plain text in the view,
        so the parameter 'pass' has been included - this is replaced, via some
        jiggery-pokery, in the connect string.
*/
    input @'options=' @;
    index1 = colnum;                        /* Save the column position. */
    input @1 connect $varying200. linelen;
    index2 = indexc(connect, ')') - index1 + 1; /* Get the length of the connection string. */
    connect = substr(connect, index1, index2) || ';';
/*
        Find the password (displayed as xxxxs, or even as plain text), and replace it with
        the 'pass' parameter, bounded by *single* quotes.
*/
    passstrt = index(connect, 'pass=') + 5;
    if passstrt = 5 then
       passstrt = index(connect, 'pw=') + 3;
    if passstrt = 3 then                        /* 'pass=' not found */
       passstrt = index(connect, 'password=') + 9;
    if passstrt = 9 then
       passstrt = index(connect, 'pwd=') + 4;
    if passstrt = 4 then
       passstrt = index(connect, 'required=') + 10;
    if substr(connect, passstrt, 1) = ' ' then
       passstrt + 1;
    passend = verify(substr(connect, passstrt), 'X''') - 1;
    connect = tranwrd(connect, repeat('X', passend - 1), "'&pass'");
    %if &dbms = SYBASE
        %then %do;
              length database $ 30;
              database = substr(connect, index(connect, 'database="') + 10, 30);
              call symput('_dbase', scan(database, 1, '"'));
              %end;
        %else %if &dbms = ODBC
        %then %do;
              length database $ 30
                     delimiter $ 2;
              src_strt = index(connect, 'datasrc=') + 8;
              if src_strt = 8 then
                 src_strt = index(connect, 'dsn=') + 4;
              if src_strt = 4 then
                 src_strt = index(connect, 'uid=') + 4;
              if substr(connect, src_strt, 1) in("'", '"') /* If it starts with a quote mark */
                 then do;
                      src_strt + 1;
                      delimiter = '''"';
                      end;
                 else delimiter = ' ';
              database = scan(substr(connect, src_strt, 30), 1, delimiter);
              call symput('_dbase', trim(database));
              %end;
/*
        Start generating the SAS SQL code to count the rows.
*/
        put 'proc sql noprint;'
          / "connect to &dbms"
             connect
          / 'select count format=best20.'
          / '   into :_nobs trimmed'
          / "   from connection to &dbms";
/*
        Scan further through the log to find the string 'from '; the word after this string
        is the name of the Sybase table.
        Save the column position, because it will be overwritten with the next input.
*/
        input @'from ' @;
        index1 = colnum;
/*
        It's possible for the 'from' and the Sybase table name to be split over two lines. If
        they are, the column position that the pointer is set at is greater than the line
        length, so this has to be flagged and the current line to be finished with.
*/
        if index1 ge linelen then do;
           spltline = 1;
           input;
           end;
        input @1 record $varying200. linelen;
        if spltline then                 /* Find the first non-space, non-parenthetical character. */
           index1 = verify(record, ' )(');
/*
        Pick up the tablename from the record.
*/
        tablenme = scan(substr(record, index1), 1, ' )(');
        call symput('_table', trim(tablenme));
        %if &weight ne
            %then %do;
                  %if &dbms = SYBASE or &dbms = ODBC
                      %then %do;
                            put @4 "(select sum(&weight) as 'count' "
                            %end;
                      %else %do;
                            put @4 "(select sum(&weight) as count "
                            %end;
                  %end;
            %else %if &distinct ne
            %then %do;
                  %if &dbms = SYBASE or &dbms = ODBC
                      %then %do;
                            put @4 "(select count(distinct &distinct) as 'count' "
                            %end;
                      %else %do;
                            put @4 "(select count(distinct &distinct) as count "
                            %end;
                  %end;
            %else %do;
                  %if &dbms = SYBASE or &dbms = ODBC
                      %then %do;
                            put @4 "(select count(*) as 'count' "
                            %end;
                      %else %do;
                            put @4 "(select count(*) as count "
                            %end;
                  %end;
          / @7  'from ' tablenme +m1 @;
        %if &where ne %then %do;
            put / @6 "where &where" @;
            %end;
        put ');'
          / "disconnect from &dbms;"
          / 'quit;';
    stop;
    run;

/*
        Now that the code has been generated and stored in the catalog(ue),
        include (execute) it. The result (count) is placed in the global
        macro variable _nobs.
*/
    %inc gencount;
    %let saverc = &sqlrc;

/*
        Purge the catalog(ue) which contains the log and source.
*/
    filename descview clear;
    filename gencount clear;

    %if &debug = N %then %do;
        proc datasets lib=work nolist nowarn mt=catalog;
        delete countobs;
        quit;
        %end;
/*
        Drop out...
*/
    %goto Success;
    %end;
    %else %if &dbms ne %then %do;
    proc sql noprint;
    select engine,
           path,
           sysvalue
      into :engine trimmed,
           :path trimmed,
           :_dbase trimmed
      from dictionary.libnames
     where libname = "%sysfunc(upcase(&libname))"
       and sysname like 'Schema%';
     quit;
     
     filename gencount temp lrecl=32767;
     
     data _null_;
     file gencount;
     retain m1 -1;
/*
        Start generating the SAS SQL code to count the rows.
*/
      %if &authdomain ne %then
          %let authdomain = %quote(authdomain = &authdomain);
      put 'proc sql noprint;'
        / "connect to &engine(dsn=&path database=&_dbase &authdomain);"
        / 'select count format=best20.'
        / '   into :_nobs trimmed'
        / "   from connection to &dbms"; 
        %if &weight ne
            %then %do;
                  %if &dbms = SYBASE or &dbms = ODBC
                      %then %do;
                            put @4 "(select sum(&weight) as 'count' "
                            %end;
                      %else %do;
                            put @4 "(select sum(&weight) as count "
                            %end;
                  %end;
            %else %if &distinct ne
            %then %do;
                  %if &dbms = SYBASE or &dbms = ODBC
                      %then %do;
                            put @4 "(select count(distinct &distinct) as 'count' "
                            %end;
                      %else %do;
                            put @4 "(select count(distinct &distinct) as count "
                            %end;
                  %end;
            %else %do;
                  %if &dbms = SYBASE or &dbms = ODBC
                      %then %do;
                            put @4 "(select count(*) as 'count' "
                            %end;
                      %else %do;
                            put @4 "(select count(*) as count "
                            %end;
                  %end;
          / @7  "from &_dbase..&dsn" @;
        %if &where ne %then %do;
            put / @6 "where &where" @;
            %end;
        put ');'
          / "disconnect from &dbms;"
          / 'quit;';
    stop;
    run;
    %let _table = &dsn;
/*
        Now that the code has been generated and stored in the catalog(ue),
        include (execute) it. The result (count) is placed in the global
        macro variable _nobs.
*/
    %inc gencount;
    %let saverc = &sqlrc;

/*
        Purge the catalog(ue) which contains the log and source.
*/
    filename gencount clear;

    %if &debug = N %then %do;
        proc datasets lib=work nolist nowarn mt=catalog;
        delete countobs;
        quit;
        %end;
/*
        Drop out...
*/
    %goto Success;
    %end;
    

/*
      If it's a dataset, get number of total and deleted observations, if available.
*/
%if &engine ne XPORT and &memtype = DATA and &dbms = %then %do;
    %if &pass =
        %then %let fn = %sysfunc(open(&libname..&dsn, i));            /* Create an open tag to the dataset/view */
        %else %let fn = %sysfunc(open(&libname..&dsn(pw=&pass), i));
    %if %eval(&fn = 0) %then %do;
        %putmsg(msg=Cannot open dataset/view &libname..&dsn..);
        %let _nobs = ERROR;
        %goto EndMac;
        %end;

    %let _nobs = %sysfunc(attrn(&fn, nlobs));     /* Get the number of logical observations */
    %let fn = %sysfunc(close(&fn));               /* Close the dataset/view */
    %end;

%if &distinct ne %then %do;
    proc sql noprint;
    select count(distinct &distinct) format=best20.
      into :_nobs trimmed
      from &libname..&dsn
%if &pass ne %then %do;
    (pw=&pass)
    %end;
%if &where ne %then %do;
     where &where
    %end;
    ;
    quit;
    %goto Success;
    %end;

/*
        If the result is '-1' the number of logical observations cannot be ascertained,
        so a data step (as opposed to an SQL query - that'd be slightly less efficient)
        is generated to count the rows.
*/
%if &engine = XPORT or &memtype = VIEW or %eval(&_nobs = -1) or &_nobs = . or &where ne or &weight ne %then %do;
    %if &weight = %then
        %let weight = 1;
    %let _nobs = 0;
    data _null_;
    set &libname..&dsn(
%if &where = and &weight = 1 and &engine = %then %do;
    drop=_all_
    %end;
%if &pass ne %then %do;
    pw=&pass
    %end;
    )
    end=eof;
    %if &where ne %then %do;
        where &where;
        %end;
    retain _count 0;
    _count + &weight;
    if eof then
       call symput('_nobs', left(put(_count, best20.)));
    run;
    %end;
%Success:
%let __cnterr = 0;

%EndMac:
option &source2 &notes &symbolgen &mlogic &mprint;
%mend countobs;