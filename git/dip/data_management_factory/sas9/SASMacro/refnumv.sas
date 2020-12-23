%macro refnumv(val=) / des='Reformat numeric value for display';
/*
        Wee macro to take a (numeric) value, and reformat it
        by putting in commas, or converting into words.

       Modification history       (reverse chronological order).
       Laurie Fleming             Fixed bug where val has a negative value.
       31 Jan 2000                The minus sign was being interpreted as
                                  an attempted subtraction, and the parser was
                                  getting upset.

       Laurie Fleming             Included multiples of ten up to
       4 Feb 1998                 ninety as words.

       Laurie Fleming             First written
       August 1997
*/
%local format;
%if %quote(&val) =
    %then null;
    %else %if %sysevalf(%sysfunc(verify(&val, 0123456789+-.)) ne 0)
    %then &val;
    %else %do;
          %if %sysevalf(%sysfunc(int(&val)) ne &val)
              %then %let format = comma17.2;
              %else %if %eval(&val ge -20 and &val le 20)
              %then %let format = words17.;
              %else %if %eval(&val < 100 and %sysfunc(mod(&val, 10)) = 0)
              %then %let format = words17.;
              %else %let format = comma17.;
           %qsysfunc(trim(%qsysfunc(left(%qsysfunc(putn(&val, &format))))))
           %end;
%mend refnumv;