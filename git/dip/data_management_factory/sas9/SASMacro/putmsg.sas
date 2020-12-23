%macro putmsg(msg=, type=ERROR) / des='Display macro error messages in the log';
%if &type =
    %then %let type = ERROR;
    %else %let type = %sysfunc(upcase(&type));
%put;
%let msg = %quote(&msg);
%if &msg =
    %then %put &type: (No further information);
    %else %put &type: &msg;
%mend putmsg;