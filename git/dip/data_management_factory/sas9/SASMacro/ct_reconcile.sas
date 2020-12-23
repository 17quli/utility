%macro ct_reconcile;

/*

Macro used by Custom Transformation to  compares the two input datasets 
by the measure names and report any difference on the values.


Usage:
It should be used before committing changes to the main table.  If any difference 
is found, it will throw an error and stop the job.  You can have as many measures as 
needed to input into this transformation as long as the measures exist in both inputs.


Options: 

Source Measure Name (source_measure_name): The name column for the source measure dataset.
Source Measure Value (source_measure_value): The value column for the source measure dataset.
Target Measure Name (target_measure_name): The name column for the target measure dataset.
Target Measure Value (target_mesure_value): The value column for the target measure dataset.

@author				Max Wang <yang.wang@ird.govt.nz>
@first written		01/07/2019

*/

	%local all_msg;
	%global dip_manual_abort;
	%let dip_manual_abort=0;

	
	%if %eval(&job_rc > 4) %then %goto EXIT;

	/* create a work table to merge the source and target measures. */		
	proc sql noprint;
		create table work.recon_data
		as
		select source.&source_measure_name as m1, source.&source_measure_value as v1, 
			target.&target_measure_name as m2, target.&target_measure_value as v2
		from &_INPUT0 source full join &_INPUT1 target
		on source.&source_measure_name = target.&target_measure_name;
	quit;
	%rcSet(&sqlrc);
	%if %eval(&job_rc > 4) %then %goto EXIT;

	/* Create a new work table to compaure the measure values and capture any differences. */	
	proc sql noprint;
		create table work.recon_result
		as
		select 
			*,
			case
				when m1 is null then catx(" ",m2,"for source is missing.")
				when m2 is null then catx(" ",m1,"for target is missing.")
				when v1 = v2 then ""
				when v1 ^= v2 then cats(m1) || " is different between the source and target tables. Source: " || cats(v1) || "  Target: " || cats(v2) || "."
			end as message
		from work.recon_data;
	quit;
	%rcSet(&sqlrc);
	%if %eval(&job_rc > 4) %then %goto EXIT;

	/* Concatnate all error messages. */
	data _null_;
		length all_msg $32767.;
		do until(eod);
			set work.recon_result end=eod;
			all_msg = catx(" ",cats(all_msg),message);			
		end;
		call symputx('all_msg',all_msg);
		stop;
	run;
	
	/* Set abort flag if any errors are found. */
	%if %nrbquote(&all_msg) ^= %nrbquote()  %then
	%do;
		%put ERROR: &all_msg;
		%let job_rc = 5;
		%let sysrc = 2;
		%let dip_manual_abort = 1;	
		options nosyntaxcheck;
		options obs=0;
	%end;

%EXIT: %mend ct_reconcile;


