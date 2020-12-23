%macro timer / des='Calcuate execution times';
%global _start_time _end_time _elapsed;
%if &_start_time = 
    %then %do;
          %let _start_time = %sysfunc(datetime());
          %putmsg(type=info, msg=Process started at %sysfunc(strip(%sysfunc(putn(&_start_time, datetime26.3)))).)
          %end;
    %else %do;
          %let _end_time = %sysfunc(datetime());
          %let _elapsed = %sysevalf(&_end_time - &_start_time);
          %putmsg(type=info, msg=Process ended at %sysfunc(strip(%sysfunc(putn(&_end_time, datetime26.3)))).)
          %putmsg(type=info, msg=Elapsed time: %sysfunc(strip(%sysfunc(putn(&_elapsed, time15.3)))).)
          %let _start_time =;
          %end;
%mend timer;
