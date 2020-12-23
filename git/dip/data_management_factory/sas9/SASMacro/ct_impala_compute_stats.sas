%macro ct_impala_compute_stats;


/*

Macro used by Custom Transformation to compute stats of an input table.


Usage:
This custom transformation should be used for any hive tables which are inserted
/ updated by an out of box DI transformation.

@author				Max Wang <yang.wang@ird.govt.nz>
@first written		20/12/2019

*/

	%global or_insert_cnt;

	%if %eval(&job_rc > 4) %then %goto EXIT;
	%dip_ct_prep_cols;
	%if %eval(&job_rc > 4) %then %goto EXIT; 

	proc sql noprint;
	connect to &_INPUT0_engine(&_INPUT0_connect);	
	/* Compute stats. */						
	execute (
		compute stats &input_table;
	)
	by &_INPUT0_engine;
	disconnect from &_INPUT0_engine;
	quit;
	%rcSet(&sqlrc);
	%if %eval(&job_rc > 4) %then %goto EXIT; 

	proc sql noprint;
	   select
	         count(1) into:or_insert_cnt trimmed 
	   from &_INPUT
	   ;
	   %rcSet(&sqlrc);
	quit;
	%if %eval(&job_rc > 4) %then %goto EXIT; 

	
%EXIT: 
%mend ct_impala_compute_stats;
