%macro exit_return_code;
/*
	Using %abort appears to be the only way of passing a return code to the outside world. It'd be preferable
	to have a more graceful method.
*/
%if %eval(&job_rc = 4)
    %then %do;
          %let job_rc = 0;
          data _null_;
          run;
          %end;
    %else %if %eval(&job_rc > 4) %then %do;		
          %abort abend &job_rc;
          %end;
%mend exit_return_code;