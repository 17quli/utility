%macro concatenated_values(variable=, columns=, formats=) / des="Create a catx function's string for primary and natural key contents";
%local mprint notes;
%let mprint = %sysfunc(getoption(mprint));
%let notes = %sysfunc(getoption(notes));
%if &debug = No
    %then %do;
          option nomprint nonotes;                                           /* Turn off logging, just for this data step */
          %end;
    %else %do;
          option mprint notes;
          %end;
data _null_;
array columns $ 1 &columns;                                                  /* All variables */
retain formats "&formats";                                                   /* All variables' formats */
length catx put_var format $ 32767;                                          /* As long as possible... */
do over columns;
   var_name = nliteral(vname(columns));                                      /* If non-standard name, put quotes around it and suffix with 'n' */
   format = scan(formats, _i_, ' ');                                         /* Get the variable's format */
   select;
      when(format =: '$char')                                                /* Not *strictly* accurate, but as good as anyone would need. */
         put_var = var_name;
      when(format =: '$')                                                    /* Character variable */
         put_var = cat('putc(', strip(var_name), ", ", quote(strip(format)), ')'); /* Create the putc function for the variable with its format */
      otherwise                                                              /* Numeric variable */
         put_var = cat('putn(', strip(var_name), ", ", quote(strip(format)), ')'); /* putn function */
      end;
   catx = catx(',', catx, put_var);                                          /* Concatenate them together with a comma separator */
   end; 
catx = cats('catx("~",', catx, ')');                                         /* Construct the catx function */
call symputx("&variable", strip(catx), 'g');                                 /* Expose the value as a global macro variable */
run;
option &mprint &notes;
%mend concatenated_values;