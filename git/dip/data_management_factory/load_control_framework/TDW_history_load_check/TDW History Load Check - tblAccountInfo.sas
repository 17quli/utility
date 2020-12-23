/********************************************************************************/
/*TDW History Analysis for migration of data from TDW tables into DIP Raw tables*/
/********************************************************************************/

/********************************************************************************/
/*Define Libraries - CHANGE to TEST_RAW or PROD_RAW IF REQUIRED!*/
/********************************************************************************/
/*TDW*/
LIBNAME edwtdw ORACLE  DBCOMMIT=0  DBMAX_TEXT=32767  DEFER=YES  PRESERVE_COL_NAMES=YES  PRESERVE_TAB_NAMES=YES  READBUFF=20000
encoding="utf-8" dbclient_max_bytes=2  PATH="DIP_VIP.external"  SCHEMA=TDW  AUTHDOMAIN="edw_prod" ;

/*START NZO*/
LIBNAME strapp SQLSVR  PRESERVE_TAB_NAMES=YES  DBMAX_TEXT=32767  PRESERVE_COL_NAMES=YES
Datasrc=NZO_GTAPP  SCHEMA=dbo  AUTHDOMAIN="start_operations" ;

/*DIP Impala RAW (dev_raw)*/
/*LIBNAME impraw SASIOIMP  DATABASE=dev_raw  DBMAX_TEXT=32767  DSN=ClouderaImpala64  SCHEMA=dev_raw;*/

/*DIP Impala RAW (test_raw)*/
LIBNAME impraw SASIOIMP  DATABASE=test_raw  DBMAX_TEXT=32767  DSN=ClouderaImpala64  SCHEMA=test_raw;

/*DIP Impala RAW (prod_raw)*/
/*LIBNAME impraw SASIOIMP  DATABASE=prod_raw  DBMAX_TEXT=32767  DSN=ClouderaImpala64  SCHEMA=prod_raw;*/


/********************************************************************************/
/*Define tables for analysis and their natural keys*/
/*Once this is done the code will run without any other changes needed*/
/********************************************************************************/
/*TDW*/
%let tdw_table_name = TBL_ACCOUNTINFO; 
%let tdw_table_key = ACCOUNT_KEY;

/*START*/
%let start_table_name = tblAccountInfo; 
%let start_table_key = flngAccountKey;

/*DIP Raw*/
%let raw_table_name = app_tblAccountInfo; 
%let raw_table_key = flngAccountKey;

/*Define main title for the outputs*/
title1 "TDW History Load Checks for table: &raw_table_name.";


/********************************************************************************/
/********************************************************************************/
/*History Analysis - STEP 1*/
/********************************************************************************/
/********************************************************************************/

/*Check: confirm if TDW table has history and check for MIN and MAX value of effective_from*/
proc sql;
	create table tdw_key_count as
	select &tdw_table_key.,
    	   count(&tdw_table_key.) as key_count,
		   min(effective_from) as tdw_min_effective_from,
		   max(effective_from) as tdw_max_effective_from
	from edwtdw.&tdw_table_name.
	group by &tdw_table_key.
	;
quit;

title2 'TDW Table - Keys Count';
proc sql;
	select sum(key_count) as TDW_total_number_of_records format=comma15.0,
		   count(*) as TDW_unique_key_count format=comma15.0
	from tdw_key_count 
	;
	select count(*) as TDW_multiple_key_count format=comma15.0,
		   case
		      when calculated TDW_multiple_key_count = 0 then 'No'
			  else 'Yes'
		   end as TDW_history_YN
	from tdw_key_count  
	where key_count ne 1
	;
quit;

title2 'TDW Table - MIN and MAX value of effective_from';
proc sql;
	select min(tdw_min_effective_from) as tdw_min_effective_from format datetime27.6,
		   max(tdw_max_effective_from) as tdw_max_effective_from format datetime27.6
	from tdw_key_count 
	;
quit;


/*Check: confirm if START table has history and check for MIN and MAX value of fdtmWhen*/
proc sql;
	create table start_key_count as
	select &start_table_key.,
    	   count(&start_table_key.) as key_count,
		   min(fdtmWhen) as start_min_fdtmWhen,
		   max(fdtmWhen) as start_max_fdtmWhen
	from strapp.&start_table_name.
	group by &start_table_key.
	;
quit;

title2 'START Table - Keys Count';
proc sql;
	select sum(key_count) as START_total_number_of_records format=comma15.0,
		   count(*) as START_unique_key_count format=comma15.0
	from start_key_count 
	;
	select count(*) as START_multiple_key_count format=comma15.0,
		   case
		      when calculated START_multiple_key_count = 0 then 'No'
			  else 'Yes'
		   end as START_history_YN
	from start_key_count  
	where key_count ne 1
	;
quit;

title2 'START Table - MIN and MAX value of fdtmWhen';
proc sql;
	select min(start_min_fdtmWhen) as start_min_fdtmWhen format datetime27.6,
		   max(start_max_fdtmWhen) as start_max_fdtmWhen format datetime27.6
	from start_key_count 
	;
quit;
/********************************************************************************/
/*END of History Analysis - STEP 1*/
/********************************************************************************/



/********************************************************************************/
/********************************************************************************/
/*History Analysis - STEP 2*/
/********************************************************************************/
/********************************************************************************/
/*Check: confirm if DIP RAW table has history and check for MIN and MAX value of fdtmWhen*/
proc sql;
	create table raw_key_count as
	select &raw_table_key.,
    	   count(&raw_table_key.) as key_count,
		   min(fdtmWhen) as min_fdtmWhen,
		   max(fdtmWhen) as max_fdtmWhen,
		   min(record_effective_timestamp) as min_record_effective_timestamp,
		   max(record_effective_timestamp) as max_record_effective_timestamp
	from impraw.&raw_table_name.
	group by &raw_table_key.
	;
quit;


title2 'DIP Raw Table - Keys Count';
proc sql;
	select sum(key_count) as RAW_total_number_of_records format=comma15.0,
		   count(*) as RAW_unique_key_count format=comma15.0
	from raw_key_count 
	;
	select count(*) as RAW_multiple_key_count format=comma15.0,
		   case
		      when calculated RAW_multiple_key_count = 0 then 'No'
			  else 'Yes'
		   end as RAW_history_YN
	from raw_key_count  
	where key_count ne 1
	;
quit;

title2 'DIP Raw Table - MIN and MAX value of fdtmWhen';
proc sql;
	select min(min_fdtmWhen) as min_fdtmWhen format datetime27.6,
		   max(max_fdtmWhen) as max_fdtmWhen format datetime27.6,
		   min(min_record_effective_timestamp) as min_record_effective_timestamp format datetime27.6,
		   max(max_record_effective_timestamp) as max_record_effective_timestamp format datetime27.6
	from raw_key_count 
	;
quit;
/********************************************************************************/
/*END of History Analysis - STEP 2*/
/********************************************************************************/


/********************************************************************************/
/********************************************************************************/
/*History Analysis - STEP 3*/
/********************************************************************************/
/********************************************************************************/
/*Check RAW table for anomalies*/
proc sort data=impraw.&raw_table_name. (keep=&raw_table_key. record_effective_timestamp record_expiry_timestamp record_active_flag) out = raw_&raw_table_name._sorted;
	by &raw_table_key. record_effective_timestamp;
run;

data raw_&raw_table_name._check (drop = previous_effective_temp previous_expiry_temp);
	format previous_effective previous_expiry datetime27.6;
	format effective_is_populated effective_is_before_expiry effective_ne_expiry
		   expiry_is_populated last_expiry_is_high
		   effective_seq_correct effective_eq_previous_expiry
		   $30.;
	set raw_&raw_table_name._sorted;
	by &raw_table_key. record_effective_timestamp;

	retain previous_effective_temp previous_expiry_temp;

	/*check: record_effective_timestamp is populated*/
	if record_effective_timestamp ne .
	then effective_is_populated = 'Yes - Good';
	else effective_is_populated = 'No - Bad';

	/*check: effective is before expiry*/
	if record_effective_timestamp ne . and record_effective_timestamp < record_expiry_timestamp
	then effective_is_before_expiry = 'Yes - Good';
	else effective_is_before_expiry = 'No - Bad'; 

	/*check: effective not equal expiry*/
	if record_effective_timestamp ne record_expiry_timestamp 
	then effective_ne_expiry = 'Yes - Good';
	else effective_ne_expiry = 'No - Bad'; 

	/*check: expiry is populated*/
	if record_expiry_timestamp ne .
	then expiry_is_populated = 'Yes - Good';
	else expiry_is_populated = 'No - Bad';

	/*check: last expiry is high date*/
	if last.&raw_table_key. and datepart(record_expiry_timestamp) eq '31DEC9000'd then last_expiry_is_high = 'Yes - Good';
	else if last.&raw_table_key. and datepart(record_expiry_timestamp) ne '31DEC9000'd then last_expiry_is_high = 'No - Bad';
	else last_expiry_is_high = 'N/A - not a last record';

	/*check: timeline is continuous:
	  1: for a given key each effective is greater than previous effective (except first record)
	  2: for a given key each effective is equal to previous expiry - millisecond (except first record)
	*/
	if first.&raw_table_key. then
	do;
		previous_effective_temp = record_effective_timestamp;
		previous_expiry_temp = record_expiry_timestamp;

		effective_seq_correct = 'N/A - first record';
		effective_eq_previous_expiry = 'N/A - first record';

	end;

	if not first.&raw_table_key. then
	do;
		previous_effective = previous_effective_temp;
		previous_effective_temp = record_effective_timestamp;

		previous_expiry = previous_expiry_temp;
		previous_expiry_temp = record_expiry_timestamp;
		
		/*1: for a given key each effective is greater than previous effective*/
		if record_effective_timestamp > previous_effective then effective_seq_correct = 'Yes - Good';
		else effective_seq_correct = 'No - Bad';

		/*2: for a given key each effective is equal to previous expiry - millisecond*/
		if round((record_effective_timestamp - previous_expiry)*1000, 0.001) = 1 then effective_eq_previous_expiry = 'Yes - Good';
		else effective_eq_previous_expiry = 'No - Bad';
	end;

run;


title2 'Raw Dates Checks';
proc freq data=raw_&raw_table_name._check;
	tables effective_is_populated effective_is_before_expiry effective_ne_expiry
		   expiry_is_populated last_expiry_is_high
		   effective_seq_correct effective_eq_previous_expiry / nopercent;
run;


/*Check of CURRENT_REC_FLAG*/
title2 'Check CURRENT_REC_FLAG and expiry';
proc sql;
	select record_active_flag,
		   count(*) as count format comma15.
	from raw_&raw_table_name._check
	where datepart(record_expiry_timestamp) eq '31DEC9000'd
	group by record_active_flag
	;

	select record_expiry_timestamp,
		   count(*) as count format comma15.
	from raw_&raw_table_name._check
	where record_active_flag = 'Y'
	group by record_expiry_timestamp
	;
quit;
/********************************************************************************/
/*END of History Analysis - STEP 3*/
/********************************************************************************/