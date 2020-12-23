%macro check_status;
/*
    Name:                           check_status
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   April 2019
    Remarks:                        Picks up on changes in return codes. 8 and above is
                                    a fatal error; 4 is a warning; zero is normal. The
                                    result is placed in job_rc;
                                
    Method:
    %if %eval(not %symexist(...     If the status_msg variable doesn't exist, make it global.
    %if %symexist(sqlxrc)           If sqlxrc (pass-through SQL return code) exists, get the
                                    maximum of sysrc, syscc, syserr, sqlrc and sqlxrc; otherwise
                                    don't include sqlxrc.
    %if %symexist(sqlxmsg) %then... Set status_msg to the contents of sqlxmsg, if it exists.
    %if %nrbquote(&status_msg) ...  If status_msg hasn't been set, replace it with sysmsg.
    %if %eval(&job_rc > 4)...       If warning or worse, dump the message to the log.
    
    Modification History:           (in reverse chronological order)
    Laurie Fleming                  Automated the population of warning_label when job_rc = 4.
    10 March 2020
    
    28 February 2020                Added job_rc's value to the log output.
    
    Laurie Fleming                  Added syslibrc (libname return code) to list of variables to check.
    6 August 2019
    
    Laurie Fleming                  First written
    April 2019
*/          

/*
    sqlxrc and sqlxmsg disappear on an sql disconnect statement. By checking for their existence, this code
    won't fail.
*/
%if %eval(not %symexist(status_msg)) %then %do;
    %global status_msg;
    %end;
%if %symexist(sqlxrc) 
    %then %do;
          %rcset(%sysfunc(max(&sysrc, &syscc, &syserr, &sqlrc, &sqlxrc, &syslibrc)));
          %end;
    %else %do;
          %rcset(%sysfunc(max(&sysrc, &syscc, &syserr, &sqlrc, &syslibrc)));
          %end;
%if %symexist(sqlxmsg) %then %do;
    %if %nrbquote(&sqlxmsg) ne %then
        %let status_msg = &sqlxmsg;
    %end;
%if %nrbquote(&status_msg) = %then %do;          /* In case status_msg contains special characters, it has to be quoted */
    %let status_msg = %qsysfunc(sysmsg());
    %end;
%if %eval(&job_rc > 4) %then %do;                   /* Dump the message in the log if an error */
    %putmsg(type=error, msg=%nrbquote(&status_msg - &job_rc));
    %end;
    %else %if %eval(&job_rc > 0 and %symexist(first_warning) = 0) %then %do;
              %global first_warning;
              %let warning_label = &task_label;
              %putmsg(type=warning, msg=&warning_label: %nrbquote(&status_msg));
              %end;
%mend check_status;