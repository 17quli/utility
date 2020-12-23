%macro ct_check_run_status;
	
/*
This Macro works with the custom transformation to check dependent workflows/jobs from current or
previous workflow runs and abort the rest of the process accordingly.

Options:
    last_workflows: Workflows to check for last workflow run.
    current_workflows: Workflows to check for current workflow run.    
	last_jobs: Jobs to check for last workflow run.
    current_jobs: Jobs to check for current workflow run.    
    grouping_condition: 1 - OR, 2 -AND
    wait_secs: Time to wait before checking (Seconds)	
    	
@author				Max Wang <yang.wang@ird.govt.nz>
@first written		09/06/2020
*/
	

	%local last_workflows_str last_jobs_str current_workflows_str current_jobs_str
			overall_failure_score failed_flows disabled	;
	
	/* retrieve the DISABLE_DEPENDENCY_CHK value for the environment, stop if disabled */
	proc sql noprint;
		select value
		into :disabled trimmed 
		from lcf.DIP_CONFIG
		where key="DISABLE_DEPENDENCY_CHK";
	quit;
	%if %eval(&job_rc > 4) %then %goto EXIT; 	

	%if %eval(&disabled) %then
	%do;
		%goto EXIT;  
	%end;
	
	
	/* Wait for the deined internal before starting */
	data _null_;
		sleep=sleep(&wait_secs, 1);
	run;	
	
	/* Build workflow string for last batch run. */
	%let last_workflows_str=;
	
	data _null_;
	  	length last_workflows_str $32767;
	  	last_workflows_count = symget('last_workflows_count');
		esp_char = "'";	  	
	  	/* loop through the workflow list */
		do i=1 to last_workflows_count;
			var = cats('last_workflows',i);
			val = symget(var);
			esp_val = cats(esp_char,val,esp_char);
			if i ^= 1  then last_workflows_str= cats(last_workflows_str ,',' ,esp_val );
			if i = 1  then last_workflows_str= cats(esp_val);				
		end;
	  	call symputx('last_workflows_str',last_workflows_str) ;
	run;	

	%if %eval(&last_workflows_str=%str()) %then
	%do;
		%let last_workflows_str = %nrbquote('');
	%end;

	/* Build workflow string for current batch run.	 */
	%let current_workflows_str=;
	
	data _null_;
	  	length current_workflows_str $32767;
	  	current_workflows_count = symget('current_workflows_count');
		esp_char = "'";	  	
	  	/* loop through the workflow list */
		do i=1 to current_workflows_count;
			var = cats('current_workflows',i);
			val = symget(var);
			esp_val = cats(esp_char,val,esp_char);
			if i ^= 1  then current_workflows_str= cats(current_workflows_str ,',' ,esp_val );
			if i = 1  then current_workflows_str= cats(esp_val);				
		end;
	  	call symputx('current_workflows_str',current_workflows_str) ;
	run;	

	%if %eval(&current_workflows_str=%str()) %then
	%do;
		%let current_workflows_str = %nrbquote('');
	%end;
	
	/* Build workflow string for last batch run. */	
	%let last_jobs_str=;
	
	data _null_;
	  	length last_jobs_str $32767;
	  	last_jobs_count = symget('last_jobs_count');
		esp_char = "'";	  	
	  	/* loop through the workflow list */
		do i=1 to last_jobs_count;
			var = cats('last_jobs',i);
			val = symget(var);
			esp_val = cats(esp_char,val,esp_char);
			if i ^= 1  then last_jobs_str= cats(last_jobs_str ,',' ,esp_val );
			if i = 1  then last_jobs_str= cats(esp_val);				
		end;
	  	call symputx('last_jobs_str',last_jobs_str) ;
	run;	
	

	%if %eval(&last_jobs_str=%str()) %then
	%do;
		%let last_jobs_str = %nrbquote('');
	%end;
	
	/* Build workflow string for current batch run. */	
	%let current_jobs_str=;
	
	data _null_;
	  	length current_jobs_str $32767;
	  	current_jobs_count = symget('current_jobs_count');
		esp_char = "'";	  	
	  	/* loop through the workflow list */
		do i=1 to current_jobs_count;
			var = cats('current_jobs',i);
			val = symget(var);
			esp_val = cats(esp_char,val,esp_char);
			if i ^= 1  then current_jobs_str= cats(current_jobs_str ,',' ,esp_val );
			if i = 1  then current_jobs_str= cats(esp_val);				
		end;
	  	call symputx('current_jobs_str',current_jobs_str) ;
	run;	
	
	%if %eval(&current_jobs_str=%str()) %then
	%do;
		%let current_jobs_str = %nrbquote('');
	%end;

	/* Create a table to hold all the statuses. */
	proc sql;
		create table work.last_run_status
			(
				run_unit char(510),
				failed num
			);
		
	/* Get workflow statuses	 */
	proc sql;
	   connect to &lcf_lib_engine
	   ( 
	       &lcf_lib_connect
	   ); 
	   insert into work.last_run_status
	   select * 
	   from connection to &lcf_lib_engine
	   (
			SELECT 
				RUN_UNIT,
				CASE WHEN LAST_STATUS IN (%nrbquote('Success')) THEN 0
					ELSE 1 END FAILED
			FROM 
			(
				SELECT 
				DISTINCT WORKFLOW AS RUN_UNIT ,LAST_VALUE(WORKFLOW_STATUS) OVER (PARTITION BY WORKFLOW 
					ORDER BY COALESCE(WORKFLOW_END_TIME ,WORKFLOW_START_TIME , RUN_DATE_TIME) 
					ROWS BETWEEN CURRENT ROW AND UNBOUNDED FOLLOWING ) AS LAST_STATUS
				FROM LCF.V_WORKFLOW_STATUS 
				WHERE ( WORKFLOW IN (&last_workflows_str)
							AND LSF_WORKFLOW_RUN_ID <> (SELECT Max(LSF_WORKFLOW_RUN_ID ) FROM LCF.V_WORKFLOW_STATUS)
							AND WORKFLOW_STATUS <> %nrbquote('Unscheduled'))
				OR  ( WORKFLOW IN (&current_workflows_str)
					AND LSF_WORKFLOW_RUN_ID =
						(SELECT COALESCE (max(LSF_WORKFLOW_RUN_ID),-1)
							FROM LCF.V_WORKFLOW_STATUS
							WHERE WORKFLOW_STATUS = 'Running'
							AND WORKFLOW IN (SELECT DISTINCT WORKFLOW_LEVEL_1 FROM LCF.V_WORKFLOW_ALL WHERE WORKFLOW IN (&current_workflows_str))
					)
				)
			) all_run
		);
		%rcSet(&sqlrc);
		disconnect from &lcf_lib_engine; 
	quit;
	%if %eval(&job_rc > 4) %then %goto EXIT; 	

	/* Get job statuses. */
	proc sql;
	   connect to &lcf_lib_engine
	   ( 
	       &lcf_lib_connect
	   ); 
	   insert into work.last_run_status
	   select * 
	   from connection to &lcf_lib_engine
	   (
			SELECT 
				RUN_UNIT,
				CASE WHEN LAST_STATUS IN (%nrbquote('Success')) THEN 0
					ELSE 1 END FAILED
			FROM 
			(
				SELECT 
					DISTINCT JOB_NAME AS RUN_UNIT,
					LAST_VALUE(JOB_STATUS ) OVER (PARTITION BY JOB_NAME ORDER BY 
						COALESCE(JOB_END_TIME ,JOB_START_TIME , RUN_DATE_TIME)  
						ROWS BETWEEN CURRENT ROW AND UNBOUNDED FOLLOWING ) AS LAST_STATUS
				FROM LCF.WORKFLOW_JOB_RUN wjr 
				WHERE (JOB_NAME IN (&last_jobs_str)
							AND LSF_WORKFLOW_RUN_ID <> (SELECT Max(LSF_WORKFLOW_RUN_ID ) FROM LCF.WORKFLOW_JOB_RUN)
							AND JOB_STATUS <> %nrbquote('Unscheduled')
					)
					OR (JOB_NAME IN (&current_jobs_str)
						AND LSF_WORKFLOW_RUN_ID =
							(SELECT COALESCE (max(LSF_WORKFLOW_RUN_ID),-1)
								FROM LCF.V_WORKFLOW_STATUS
								WHERE WORKFLOW_STATUS = 'Running'
								AND WORKFLOW IN (SELECT DISTINCT WORKFLOW_LEVEL_1 FROM LCF.WORKFLOW_JOB_RUN WHERE JOB_NAME IN (&current_jobs_str))
							)
					)
			) all_run
		);
		%rcSet(&sqlrc);
		disconnect from &lcf_lib_engine; 
	quit;
	%if %eval(&job_rc > 4) %then %goto EXIT; 	
	
/* 	proc print data=work.last_run_status; */
/* 	run; */
	
	%let overall_failure_score=0;
	%let failed_flows=;

	/* calculate the overall failure score	 */
	proc sql;
		select avg(failed) into:overall_failure_score 
		from work.last_run_status;
	quit;
	
	/* Get the list of all the failed ones.	 */
	data want;
		length failed_flows $32767.;
		set work.last_run_status;
		by run_unit failed notsorted;
		retain failed_flows;
		if failed = 1 then failed_flows=catx(', ',failed_flows,run_unit);
		output;
		call symputx('failed_flows',failed_flows);
	run;
	
	
	/* 	run this if grouping condition is OR */
	%if %eval(&grouping_condition = 1 and &overall_failure_score > 0) %then
	%do;
		%put ERROR: Dependent flows/jobs failed: &failed_flows;
		%let job_rc = 5;
		%let sysrc = 2;		
		data _null_;
			abort;	
		run;
	%end;
	
	
	/* 	run this if grouping condition is AND*/
	%if %eval(&grouping_condition = 2 and &overall_failure_score =1) %then
	%do;
		%put ERROR: Dependent flows/jobs failed: &failed_flows;
		%let job_rc = 5;
		%let sysrc = 2;		
		data _null_;
			abort;	
		run;
	%end;


%EXIT: %mend ct_check_run_status;
