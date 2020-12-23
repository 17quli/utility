%macro ct_skip_no_rows;


/*

Macro used by Custom Transformation to check if there are any records in the input dataset.


Usage:
This custom transformation return 1 for the variable dip_skip_ind if no rows are found in the
input data set.  A condition transformation can be used to check its value to determine the 
next step (e.g. skip all the remain steps).

@author				Max Wang <yang.wang@ird.govt.nz>
@first written		01/06/2019

*/

	%global dip_skip_ind;
	%local input_lib input_table table_cnt;
	%let dip_skip_ind = 0;
	
	%if %eval(&job_rc > 4) %then %goto EXIT;

	%let input_lib=%scan(&_INPUT0,1,'.');
	%let input_table=%scan(&_INPUT0,2,'.');
	%let table_cnt=0;	
	
	/* Get row count from the source table. */
	proc sql noprint;
	   select count(1) into:table_cnt trimmed 
	   from &input_lib..&input_table;
	quit;
	%rcSet(&sqlrc);

	/* Set dip_skip_ind to 1 if the row count is 0. */
	%if %eval(&table_cnt=0 OR &job_rc > 4) %then
	%do;
		%let dip_skip_ind = 1;
	%end;
	
%EXIT: 
%mend ct_skip_no_rows;