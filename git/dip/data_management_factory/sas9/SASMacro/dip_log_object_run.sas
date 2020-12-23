%macro dip_log_object_run(category=, lib_name=, object_name=, task=, phase=, is_last_task=);
/*
This Macro logs SAS DI Job statistics to the DIP_OBJECT_RUN table

Options:
    category: This populates DIP_OBJECT_RUN.category.
    lib_name: This populates DIP_OBJECT_RUN.lib_name.
    object_name: This populates DIP_OBJECT_RUN.object_name.
    task:(1-4) The number of the task.
    phase:(start, end) To indicate the current phase of the task.
    is_last_task:(Y,"") To indicate if this is the last task. It updates the run status if it is
				 the end phase of the last task.
    
@author				Max Wang <yang.wang@ird.govt.nz>
@first written		20/06/2019
*/

	%global dip_object_run_key;
	%local syntaxcheck mprint notes all_tasks status_msg insert_cnt;
	%let syntaxcheck = %sysfunc(getoption(syntaxcheck));
	%let mprint = %sysfunc(getoption(mprint));
	%let notes = %sysfunc(getoption(notes));
	options syntaxcheck mprint notes DBIDIRECTEXEC;
	

/* resume job execution if the job has failed.*/
	options obs=max;
	proc sql;
		reset exec;
	quit;
	

/* Initiate the run if it is the start of the first task.*/
	%if &task=1 and &phase=start %then
		%do;
			proc sql noprint;
				insert into lcf.DIP_OBJECT_RUN
		  		 set category="&category",lib_name="&lib_name", object_name="&object_name", 
					start_time=datetime(), status='Unfinished';
			quit;
		%end;


/* Get the key of this object run.*/	
	proc sql noprint;
		select max(object_run_key) format=best.
      			into :dip_object_run_key trimmed from lcf.DIP_OBJECT_RUN
		where category="&category" and lib_name="&lib_name" and object_name="&object_name";
		
	quit;
	

/* Initiate the current task.*/		
	%if &phase=start %then
	%do;
			proc sql noprint;
				update lcf.DIP_OBJECT_RUN
		   		set task&task="&etls_jobName",
		   		task&task._status="Unfinished",
		   		task&task._start_time=datetime()
				where object_run_key=&dip_object_run_key;
			quit;	
	%end;
	
/* Log statistics for the end phase of the current task.*/	
	%if %eval(&job_rc=0) %then
		%do;
			%let jobstat = Success;
			%let status_msg = ;
		%end;
	%else %if %eval(&job_rc <=4) %then
		%do;
			%let jobstat = Warning;
			%let status_msg = %nrbquote(&syswarningtext.);
		%end;
	%else
		%do;
			%let jobstat = Error;
			%let status_msg = %nrbquote(&syserrortext);
			%let is_last_task=Y;
	%end;


	%if &phase=end %then
	%do;
			proc sql noprint;
				update lcf.DIP_OBJECT_RUN
		   		set task&task._end_time=datetime(),
		   		task&task._status="&jobstat",
		   		task&task._status_message="&status_msg"
				where object_run_key=&dip_object_run_key;
			quit;	
	%end;


/* Log statistics and end the job run if it is the end phase of the last task.*/	
	%if &is_last_task=Y and &phase=end %then
		%do;
	        proc sql noprint;
				select catx('~',task1_status, task2_status, task3_status, task4_status) 
				 into :all_tasks trimmed 
				from lcf.DIP_OBJECT_RUN
				where object_run_key=&dip_object_run_key;
			quit;
	
			%if %index(&all_tasks,Error) ge 1 %then
			%do;
				%let status=Error;
			%end; 	
		    %else %if %index(&all_tasks,Warning) ge 1 %then
			%do;
				%let status=Warning;
			%end; 			
			%else %do;
			   	%let status=Success;
			%end;
			
			%let insert_cnt=.;

			%if %symexist(or_insert_cnt) %then
			%do;
				%let insert_cnt = &or_insert_cnt;
			%end;

			proc sql noprint;
				update lcf.DIP_OBJECT_RUN
		   		set end_time=datetime(),
		   		status="&status",
				records_written = &insert_cnt
				where object_run_key=&dip_object_run_key;
			quit;
		%end;
	
	option &syntaxcheck &mprint &notes;
	
		
/* Abort the job to return the correct exit code in case the error is created explicitly.*/	
	%if %symexist(dip_manual_abort) and &phase=end %then
	%do;
		%if %eval(&dip_manual_abort = 1) %then
		%do;
			data _null_;
				abort;	
			run;
		%end;
	%end;

/* Abort the job if the original return code is an error.*/	
	%if %eval(&job_rc > 4) %then
	%do;
		data _null_;
			abort;	
		run;
	%end;

	
%mend dip_log_object_run;
