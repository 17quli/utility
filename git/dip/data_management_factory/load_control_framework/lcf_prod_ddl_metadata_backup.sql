
 
/*-------------------------------------------------------------------------------------------------------*/



Purpose: Script to manually backup the LCF objercts prior to release 2.1. 

Instructions:   There are several types of objects to be backed up.

				tables - Use CREATE TABLE AS SELECT to backup.
				sequences - We need to run the dbms_metadata.get_ddl command to get the DDL of the 
							sequences just before we do the change and copy it here, so we know for sure the
							what the sequence current values  were prior to release 2.1 deploment started.
			    triggers - use the create trigger command given below
				pl/sql packages - use the pl/sql code for UPDATE_OBJ below.
				constraints - use the ALTER TABLE commands given below.
			  

 
/*-------------------------------------------------------------------------------------------------------*/

-- Backup the tables prior to the pre-21 release 

SELECT table_name from user_tables;

-- DIP_CONFIG
CREATE TABLE DIP_CONFIG_PRE21_BKP_&today 
AS SELECT * FROM DIP_CONFIG;

--SYSTEM_SCHEMA
CREATE TABLE SYSTEM_SCHEMA_PRE21_BKP_&today
AS SELECT * FROM SYSTEM_SCHEMA;

--OBJECT
CREATE TABLE OBJECT_PRE21_BKP_&today 
AS SELECT * FROM OBJECT;

--OBJECT_HIST
CREATE TABLE OBJECT_HIST_PRE21_BKP_&today
AS SELECT * FROM OBJECT_HIST;


--EXTRACT_OBJECT
CREATE TABLE EXTRACT_OBJECT_PRE21_BKP_&today
AS SELECT * FROM EXTRACT_OBJECT;

--OBJECT_RUN
CREATE TABLE OBJECT_RUN_PRE21_BKP_&today
AS SELECT * FROM OBJECT_RUN;


--SYSTEM_SCHEMA_HIST
CREATE TABLE SYSTEM_SCHEMA_HIST_PRE21_BKP_&today 
AS SELECT * FROM SYSTEM_SCHEMA_HIST; 


--DIP_OBJECT_RUN
CREATE TABLE DIP_OBJECT_RUN_PRE21_BKP_&today
AS SELECT * FROM DIP_OBJECT_RUN;


-- Following tables are not touched by this release. Have included these tables for completeness.

--RETENTION_PERIOD
CREATE TABLE RETENTION_PERIOD_PRE21_BKP_&today
AS SELECT * FROM RETENTION_PREIOD;

--DOMAIN
CREATE TABLE DOMAIN_PRE21_BKP_&today
AS SELECT * FROM DOMAIN;

--SUB_DOMAIN
CREATE TABLE SUB_DOMAIN_PRE21_BKP_&today
AS SELECT * FROM SUB_DOMAIN;

--DOMAIN_BRIDGE
CREATE TABLE DOMAIN_BRIDGE_PRE21_BKP_&today
AS SELECT * FROM DOMAIN_BRIDGE;

--DATA_DOMAIN_EXPANDED
CREATE TABLE DATA_DOMAIN_EXPANDED_PRE21_BKP_&today
AS SELECT * FROM DATA_DOMAIN_EXPANDED;

--LCF_LOG
CREATE TABLE LCF_LOG_PRE21_BKP_&today
AS SELECT * FROM LCF_LOG;

/*
SELECT table_name, num_rows from user_tables 
where table_name like '%20200220%' to check we've 
backed up all tables 
 
EXTRACT_OBJECT_PRE21_BKP_20200220	161
OBJECT_RUN_PRE21_BKP_20200220	10197
DIP_OBJECT_RUN_PRE21_BKP_20200220	1076
RETENTION_PERIOD_PRE21_BKP_20200220	1
DIP_CONFIG_PRE21_BKP_20200220	6
SYSTEM_SCHEMA_PRE21_BKP_20200220	26
OBJECT_PRE21_BKP_20200220	162
OBJECT_HIST_PRE21_BKP_20200220	2551
DOMAIN_PRE21_BKP_20200220	12
SUB_DOMAIN_PRE21_BKP_20200220	55
DOMAIN_BRIDGE_PRE21_BKP_20200220	246
DATA_DOMAIN_EXPANDED_PRE21_BKP_20200220	235
LCF_LOG_PRE21_BKP_20200220	44
SYSTEM_SCHEMA_HIST_PRE21_BKP_20200220	0
*/


/*-------------------------------------------------------------------------------------------------------*/

-- Query user indexes as lcf user and run the dbms_metadata command to get the sequence DDL with the correct current values.

SELECT * FROM USER_SEQUENCES;


select dbms_metadata.get_ddl('SEQUENCE','SEQ_DIP_OBJECT_RUN_KEY','LCF') FROM DUAL ;

CREATE SEQUENCE  "LCF"."SEQ_DIP_OBJECT_RUN_KEY"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1541 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL;

select dbms_metadata.get_ddl('SEQUENCE','SEQ_DOMAIN_BRIDGE_KEY','LCF') FROM DUAL ;

CREATE SEQUENCE  "LCF"."SEQ_DOMAIN_BRIDGE_KEY"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 341 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL

select dbms_metadata.get_ddl('SEQUENCE','SEQ_LCF_LOG_KEY','LCF') FROM DUAL ;
CREATE SEQUENCE  "LCF"."SEQ_LCF_LOG_KEY"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 161 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL

select dbms_metadata.get_ddl('SEQUENCE','SEQ_OBJECT_KEY','LCF') FROM DUAL ;
CREATE SEQUENCE  "LCF"."SEQ_OBJECT_KEY"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 241 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL

select dbms_metadata.get_ddl('SEQUENCE','SEQ_OBJECT_RUN_KEY','LCF') FROM DUAL ;
CREATE SEQUENCE  "LCF"."SEQ_OBJECT_RUN_KEY"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 10701 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL

select dbms_metadata.get_ddl('SEQUENCE','SEQ_SUB_DOMAIN_KEY','LCF') FROM DUAL ;
CREATE SEQUENCE  "LCF"."SEQ_SUB_DOMAIN_KEY"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL

select dbms_metadata.get_ddl('SEQUENCE','SEQ_SYSTEM_SCHEMA_KEY','LCF') FROM DUAL ;
CREATE SEQUENCE  "LCF"."SEQ_SYSTEM_SCHEMA_KEY"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 61 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL

select dbms_metadata.get_ddl('SEQUENCE','SEQ_DOMAIN_KEY','LCF') FROM DUAL ;
CREATE SEQUENCE  "LCF"."SEQ_DOMAIN_KEY"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL

 
/*-------------------------------------------------------------------------------------------------------*/

--Below are the triggers currently in Prod - pre2.1

create or replace TRIGGER DOMAIN_BRIDGE_KEY
BEFORE INSERT ON LCF.DOMAIN_BRIDGE
FOR EACH ROW
BEGIN
	SELECT seq_DOMAIN_BRIDGE_KEY.nextval
		INTO :NEW.DOMAIN_BRIDGE_KEY
		FROM DUAL;
END;


create or replace TRIGGER TRG_DIP_OBJECT_RUN_KEY
BEFORE INSERT ON LCF.DIP_OBJECT_RUN
FOR EACH ROW
BEGIN
	SELECT seq_DIP_OBJECT_RUN_KEY.nextval
		INTO :NEW.OBJECT_RUN_KEY
		FROM DUAL;
END;
/


create or replace TRIGGER TRG_LCF_LOG_KEY
BEFORE INSERT ON LCF.LCF_LOG
FOR EACH ROW
BEGIN
	SELECT seq_LCF_LOG_KEY.nextval
		INTO :NEW.LOG_KEY
		FROM DUAL;
END;
/


create or replace TRIGGER  LCF.TRG_OBJECT_HIST
AFTER  
INSERT OR UPDATE ON LCF.OBJECT 
FOR EACH ROW 
BEGIN
IF INSERTING THEN 
INSERT INTO LCF.OBJECT_HIST
( OBJECT_KEY , 
	SYSTEM_SCHEMA_KEY , 
	TARGET_OBJECT_NAME , 
	OBJECT_SHORT_NAME , 
	TARGET_DB , 
	SOURCE_OBJECT_NAME , 
	SOURCE_OBJECT_TYPE , 
	SAS_LIB_REF , 
	PK_COLUMN_NAMES , 
	NK_COLUMN_NAMES , 
	EXCLUDED_COLUMNS , 
	LOAD_PATTERN_NAME , 
	SENSITIVE_DATA_FLAG , 
	RETENTION_KEY , 
	CUSTOM_SQL, 
	CHANGE_CAPTURE_TIMESTAMP_COLUMN,
  HISTORY_LOADED_FROM_TDW ,
	CREATED_DATE , 
	CREATED_BY , 
  LAST_UPDATE_TIME,
  HISTORY_TYPE,
  EFFECTIVE_FROM_TIMESTAMP_COLUMN,
  EFFECTIVE_TO_TIMESTAMP_COLUMN 
  )
VALUES
  (
  :new.OBJECT_KEY , 
	:new.SYSTEM_SCHEMA_KEY , 
	:new.TARGET_OBJECT_NAME , 
	:new.OBJECT_SHORT_NAME , 
	:new.TARGET_DB , 
	:new.SOURCE_OBJECT_NAME , 
	:new.SOURCE_OBJECT_TYPE , 
	:new.SAS_LIB_REF , 
	:new.PK_COLUMN_NAMES , 
	:new.NK_COLUMN_NAMES , 
	:new.EXCLUDED_COLUMNS , 
	:new.LOAD_PATTERN_NAME , 
	:new.SENSITIVE_DATA_FLAG , 
	:new.RETENTION_KEY , 
	:new.CUSTOM_SQL, 
	:new.CHANGE_CAPTURE_TIMESTAMP_COLUMN , 
  :new.HISTORY_LOADED_FROM_TDW ,
	:new.CREATED_DATE , 
	:new.CREATED_BY, 
  SYSDATE,
  :new.HISTORY_TYPE ,
  :new.EFFECTIVE_FROM_TIMESTAMP_COLUMN,
  :new.EFFECTIVE_TO_TIMESTAMP_COLUMN );
  END IF;
  IF UPDATING THEN 
  INSERT INTO LCF.OBJECT_HIST
  ( OBJECT_KEY , 
	SYSTEM_SCHEMA_KEY , 
	TARGET_OBJECT_NAME , 
	OBJECT_SHORT_NAME , 
	TARGET_DB , 
	SOURCE_OBJECT_NAME , 
	SOURCE_OBJECT_TYPE , 
	SAS_LIB_REF , 
	PK_COLUMN_NAMES , 
	NK_COLUMN_NAMES , 
	EXCLUDED_COLUMNS , 
	LOAD_PATTERN_NAME , 
	SENSITIVE_DATA_FLAG , 
	RETENTION_KEY , 
	CUSTOM_SQL, 
	CHANGE_CAPTURE_TIMESTAMP_COLUMN , 
  HISTORY_LOADED_FROM_TDW ,
	CREATED_DATE , 
	CREATED_BY , 
  LAST_UPDATE_TIME,
  HISTORY_TYPE ,
  EFFECTIVE_FROM_TIMESTAMP_COLUMN,
  EFFECTIVE_TO_TIMESTAMP_COLUMN)
  VALUES 
  (
  :old.OBJECT_KEY , 
	:old.SYSTEM_SCHEMA_KEY , 
	:old.TARGET_OBJECT_NAME , 
	:old.OBJECT_SHORT_NAME , 
	:old.TARGET_DB , 
	:old.SOURCE_OBJECT_NAME , 
	:old.SOURCE_OBJECT_TYPE , 
	:old.SAS_LIB_REF , 
	:old.PK_COLUMN_NAMES , 
	:old.NK_COLUMN_NAMES , 
	:old.EXCLUDED_COLUMNS , 
	:old.LOAD_PATTERN_NAME ,  
	:old.SENSITIVE_DATA_FLAG , 
	:old.RETENTION_KEY , 
	:old.CUSTOM_SQL, 
	:old.CHANGE_CAPTURE_TIMESTAMP_COLUMN , 
  :old.HISTORY_LOADED_FROM_TDW ,
	:old.CREATED_DATE , 
	:old.CREATED_BY , 
  SYSDATE,
  :old.HISTORY_TYPE ,
  :old.EFFECTIVE_FROM_TIMESTAMP_COLUMN,
  :old.EFFECTIVE_TO_TIMESTAMP_COLUMN);
END IF;
END;



create or replace TRIGGER LCF.TRG_OBJECT_KEY
BEFORE INSERT ON LCF.OBJECT
FOR EACH ROW
BEGIN
	SELECT seq_OBJECT_KEY.nextval
		INTO :NEW.OBJECT_KEY
		FROM DUAL;
END;



create or replace TRIGGER TRG_SYSTEM_SCHEMA_KEY
BEFORE INSERT ON LCF.SYSTEM_SCHEMA
FOR EACH ROW
BEGIN
	SELECT seq_SYSTEM_SCHEMA_KEY.nextval
		INTO :NEW.SYSTEM_SCHEMA_KEY
		FROM DUAL;
END;


 
/*-------------------------------------------------------------------------------------------------------*/
- -Below are the views in Prod.
-- These views exists in Prod (Some of them may not be in Test. They are used by dashboards?? )

-- V_CATALOGUE_LATEST

CREATE OR REPLACE FORCE EDITIONABLE VIEW "LCF"."V_CATALOGUE_LATEST" ("OBJECT_NAME", "OBJECT_KEY", "LATEST_START", "LATEST_END", "LATEST_RUN_KEY", "LAST_SUCCESS") AS 
  with
last_success as 
(select 
  object_key,
  max(end_time) as last_success
from lcf.object_run
where 
upper(status) like upper('%success%')
OR upper(status) like upper('%warn%')
group by
  object_key
),
last_run as
(
select 
 object_name,
 object_key,
 max(start_time) as latest_start,
 max(end_time) as latest_end,
 max(object_run_key) as latest_run_key
from lcf.object_run run
WHERE
object_name is not null
and upper(object_name) not like 'TDW%'
group by 
 object_name,
 object_key
 )
 SELECT
 last_run.object_name,
 last_run.object_key,
 last_run.latest_start,
 last_run.latest_end,
 last_run.latest_run_key,
 last_success.last_success
FROM
last_run LEFT JOIN last_success
on last_run.object_key=last_success.object_key;

/*-------------------------------------------------------------------------------------------------------*/
  CREATE OR REPLACE FORCE EDITIONABLE VIEW "LCF"."V_DOMAIN_INFO" ("TARGET_OBJECT_NAME", "DOMAIN_NAME", "SUB_DOMAIN_NAME") AS 
  SELECT DISTINCT  O.TARGET_OBJECT_NAME,  D.DOMAIN_NAME , SD.SUB_DOMAIN_NAME
 FROM DOMAIN_BRIDGE DB
 LEFT JOIN OBJECT O
 ON O.OBJECT_KEY=DB.OBJECT_KEY
 inner JOIN DOMAIN D
 ON DB.PRIMARY_DOMAIN_KEY=D.PRIMARY_DOMAIN_KEY
 inner JOIN   SUB_DOMAIN SD
 ON DB.SUB_DOMAIN_KEY=SD.SUB_DOMAIN_KEY
 AND DB.PRIMARY_DOMAIN_KEY=SD.PRIMARY_DOMAIN_KEY
 AND TARGET_OBJECT_NAME IS NOT NULL AND DOMAIN_NAME IS NOT NULL;
 
/*-------------------------------------------------------------------------------------------------------*/
   CREATE OR REPLACE FORCE EDITIONABLE VIEW "LCF"."V_DOMAIN_OBJECT" ("OBJECT_KEY", "OBJECT_NAME", "DOMAIN_NAME", "SUB_DOMAIN_NAME") AS 
  select
  obj.object_key,
  obj.object_name,
  domain.domain_name,
  subdomain.sub_domain_name
from
  lcf.domain domain
join lcf.sub_domain subdomain
  on  domain.PRIMARY_DOMAIN_KEY = subdomain.PRIMARY_DOMAIN_KEY
join lcf.domain_bridge bridge
  on domain.PRIMARY_DOMAIN_KEY = bridge.PRIMARY_DOMAIN_KEY
join  
  (select 
     objectrun.object_name,
     objectrun.object_key
  from
     lcf.object_run objectrun
   left join
      lcf.dip_object_run dipobjectrun
    on upper(objectrun.object_name) = upper(dipobjectrun.object_name)
    group by objectrun.object_name, objectrun.object_key
    ) obj
  on bridge.OBJECT_KEY = obj.object_key;

/*-------------------------------------------------------------------------------------------------------*/
CREATE OR REPLACE FORCE EDITIONABLE VIEW "LCF"."V_MOST_RECENT_DIP_OBJECT_RUN" ("OBJECT_RUN_KEY", "LIB_NAME", "OBJECT_NAME", "CATEGORY", "START_TIME", "END_TIME", "STATUS", "TASK1", "TASK1_START_TIME", "TASK1_END_TIME", "TASK1_STATUS", "TASK1_STATUS_MESSAGE", "TASK2", "TASK2_START_TIME", "TASK2_END_TIME", "TASK2_STATUS", "TASK2_STATUS_MESSAGE", "TASK3", "TASK3_START_TIME", "TASK3_END_TIME", "TASK3_STATUS", "TASK3_STATUS_MESSAGE", "TASK4", "TASK4_START_TIME", "TASK4_END_TIME", "TASK4_STATUS", "TASK4_STATUS_MESSAGE", "CT", "AVG", "STDDEV", "MIN", "MAX") AS 
  select 
    run.object_run_key,
    run.lib_name,
    run.object_name,
    run.category,
    run.start_time,
    run.end_time,
    run.status,
    run.task1,
    run.task1_start_time,
    run.task1_end_time,
    run.task1_status,
    run.task1_status_message,
    run.task2,
    run.task2_start_time,
    run.task2_end_time,
    run.task2_status,
    run.task2_status_message,
    run.task3,
    run.task3_start_time,
    run.task3_end_time,
    run.task3_status,
    run.task3_status_message,
    run.task4,
    run.task4_start_time,
    run.task4_end_time,
    run.task4_status,
    run.task4_status_message,
    mx.ct,
    mx.avg,
    mx.stddev,
    mx.min,
    mx.max
from 
(
    select 
        object_name, 
        max(start_time) as max_time, 
        max (object_run_key) as max_run_key,
        count(*) as ct,
        avg (extract(SECOND FROM(end_time-start_time))) as avg,
        stddev (extract(SECOND FROM(end_time-start_time))) as stddev,
        min(extract(SECOND FROM(end_time-start_time))) as min,
        max(extract(SECOND FROM(end_time-start_time))) as max
    from lcf.dip_object_run
    group by object_name
) mx
left join 
    lcf.dip_object_run run 
on 
    mx.object_name=run.object_name 
and 
    mx.max_time = run.start_time
and 
    mx.max_run_key=run.object_run_key;


/*-------------------------------------------------------------------------------------------------------*/
  CREATE OR REPLACE FORCE EDITIONABLE VIEW "LCF"."V_MOST_RECENT_OBJECT_RUN" ("OBJECT_RUN_KEY", "OBJECT_NAME", "OBJECT_KEY", "START_TIME", "END_TIME", "STATUS", "STATUS_MESSAGE", "RECORDS_READ", "RECORDS_WRITTEN", "OBJECT_LOG_NAME", "OBJECT_PRG_NAME", "PREV_HIGH_WATER_MARK_VALUE", "HIGH_WATER_MARK_VALUE", "LOAD_PATTERN_NAME", "TASK1", "TASK1_START_TIME", "TASK1_END_TIME", "TASK2", "TASK2_START_TIME", "TASK2_END_TIME", "TASK3", "TASK3_START_TIME", "TASK3_END_TIME", "TASK4", "TASK4_START_TIME", "TASK4_END_TIME", "TASK5", "TASK5_START_TIME", "TASK5_END_TIME", "TASK6", "TASK6_START_TIME", "TASK6_END_TIME", "LAST_ENDED", "CT", "AVG", "STDDEV", "MIN", "MAX") AS 
  select 
    run.object_run_key,
    run.object_name,
    run.object_key,
    run.start_time,
    run.end_time,
    run.status,
    run.status_message,
    run.records_read,
    run.records_written,
    run.object_log_name,
    run.object_prg_name,
    run.prev_high_water_mark_value,
    run.high_water_mark_value,
    run.load_pattern_name,
    run.task1,
    run.task1_start_time,
    run.task1_end_time,
    run.task2,
    run.task2_start_time,
    run.task2_end_time,
    run.task3,
    run.task3_start_time,
    run.task3_end_time,
    run.task4,
    run.task4_start_time,
    run.task4_end_time,
    run.task5,
    run.task5_start_time,
    run.task5_end_time,
    run.task6,
    run.task6_start_time,
    run.task6_end_time,
    mx.last_ended,
    mx.ct,
    mx.avg,
    mx.stddev,
    mx.min,
    mx.max
from 
(
    select 
        object_key, 
        --object_prg_name,
        max(start_time) as max_time, 
        max(end_time) as last_ended,
        max (object_run_key) as max_run_key,
        count(*) as ct,
        avg (extract(SECOND FROM(end_time-start_time))) as avg,
        stddev (extract(SECOND FROM(end_time-start_time))) as stddev,
        min(extract(SECOND FROM(end_time-start_time))) as min,
        max(extract(SECOND FROM(end_time-start_time))) as max
    from lcf.object_run
    group by object_key
) mx
left join 
    lcf.object_run run 
on 
    mx.object_key=run.object_key 
and 
    mx.max_time = run.start_time
and 
    mx.max_run_key=run.object_run_key
where
    load_pattern_name is not null
    or run.object_run_key is not null
    or run.object_name is not null
    or run.object_prg_name is not null;

/*-------------------------------------------------------------------------------------------------------*/
-- PL/SQL Package header in Prod.


create or replace PACKAGE     LCF_UPDATE IS

/*--------------------------------------------------------------------------------
This package header contains the references to procedures that contain the logic to 
maintain the metadata for the Load Control framework.  
  
  From SQL Developer login as LCF to dev or test or prod  and invoke the correct procedure.
  One or more parameters are used by these parameters. They are outlined below.
  
  p_system_key - a system_key that matches the source system you are trying to ingest the data from
  p_source_table_name - is the name of the source table in uppercase 
  p_initialize - A  Y/N to say whether to merge all rows to OBJECT table or not
  p_env - dev or test or prod depending on the enviornment you are working on
  p_user - your userid allocated by SAS Global Hosting
  
  
  PROCEDURE  VALIDATE_OBJ is to load the data arriving from Object Registration.
  
  to validate registration data:
  
  set serveroutput on
  clear screen
  lCF.LCF_UPDATE.VALIDATE_OBJ ( p_env=>'dev',
                                p_user=>'ird0sxd');
  
  
  
  
 
  
  PROCEDURE  UPDATE_OBJ will update OBJECT_COLUMN and INSERT/UPDATE OBJECT. 

  to MERGE all data:
 
  set serveroutput on
  clear screen

  lCF.LCF_UPDATE.UPDATE_OBJ    (p_system_schema_key=>NULL,
                                p_source_object_object_name=>NULL,                                  
                                p_initialize=>'Y',
                                p_env=>'dev',
                                p_user=>'ird0sxd');
 
 
   to MERGE one table's data:
    
    set serveroutput on
    clear screen
    lCF.LCF_UPDATE.UPDATE_OBJ  (p_system_schema_key=>10,   --10 corresponds to the  system_schema key  associated with this table
                                p_source_object_object_name=>'TBLACCOUNT',                                  
                                p_initialize=>'N',
                                p_env=>'dev',
                                p_user=>'ird0sxd');
 
    
 Note:
  Error messages:
        ORA-20001: E) Invalid parameter vaue for p_ENV - Allowed values DEV, TEST, PROD
        ORA-20002: E) SYSTEM_SCHEMA has '|| lv_row_count||' rows. Please check whether they are correct)
        ORA-20003: E) An error has occurred loading the setup data
        ORA-20004: E) One or more incoming parameters are null, aborting ...
        ORA-20005: E) Table registration data validation failed
        ORA-20006: E) Missing System Schema Keys found, aborting ...
        
  Modification History:
  26/04/19 SDZ Initial Build
  16/05/19 SDZ Added comments for clarity
  20/09/19 SDZ Removed system_init procedure as it is not needed here.
    
*/    
-------------------------------------------------------------------------------
-- PROCEDURE VALIDATEE_REG_DATA
-- Validate table registration data
--------------------------------------------------------------------------------

PROCEDURE VALIDATE_REG_DATA (p_env IN VARCHAR2, p_user IN VARCHAR2) ;

--------------------------------------------------------------------------------
-- PROCEDURE SYSTEM_INIT
-- Load initial data to system tables
--------------------------------------------------------------------------------


--------------------------------------------------------------------------------
-- PROCEDURE UPDATE_OBJ
-- Load Object table and other tables
--------------------------------------------------------------------------------

PROCEDURE UPDATE_OBJ (p_system_schema_key IN NUMBER,
                     p_source_object_name IN VARCHAR2,
                     p_initialize  IN VARCHAR2,
                     p_env         IN VARCHAR2,
                     p_user        IN VARCHAR2);
END;

/

/*-------------------------------------------------------------------------------------------------------*/


PL/SQL package body for UPDATE_OBJ in Prod.


create or replace PACKAGE BODY     LCF_UPDATE IS

/*--------------------------------------------------------------------------------
  This package body contains the logic required to maintain the metadata for Load Control
  Framework. When the MERGE SQL statements generated from the Object Registration Excel 
  sheet is run, the EXTRACT_OBJECT table is populated. EXTRACT_OBJECT 
  table is a landing table for incoming data. Ideally we would load the incoming data
  directly to the OBJECT table. However due to an Oracle bug
  which surfaces when there are POST-INSERT-UPDATE triggers on a table with CLOBs
  being MERGED an ORA-600 is generated terminating the current session.
  Therefore EXTRACT_OBJECT is introduced without any post ISNERT-UPDATE triggers
  to accept the incoming registration data.
  
  From SQL Developer login as LCF to dev or test or prod  and invoke the correct procedure.
  One or more parameters are used by these parameters. They are outlined below.
  
  p_system_key - a system_key that matches the source system you are trying to ingest the data from
  p_source_table_name - is the name of the source table in uppercase 
  p_initialize - A  Y/N to say whether to merge all rows to OBJECT table or not
  p_env - dev or test or prod depending on the enviornment you are working on
  p_user - your userid allocated by SAS Global Hosting
  
  
  PROCEDURE  VALIDATE_OBJ is to load the data arriving from Object Registration.
  
  to validate registration data:
  
  set serveroutput on
  clear screen
  lCF.LCF_UPDATE.VALIDATE_OBJ ( p_env=>'dev',
                                p_user=>'ird0sxd');
  
  
  
  
  PROCEDURE  SYSTEM_INIT  is to load the initial data to SYSTEM_SCHEMA.
  
  
  set serveroutput on
  clear screen
  lCF.LCF_UPDATE.SYSTEM_INIT  (p_env=>'dev',
                               p_user=>'ird0sxd');
  
  
  PROCEDURE  UPDATE_OBJ will update OBJECT_COLUMN and INSERT/UPDATE OBJECT. 

  to MERGE all data:
 
  set serveroutput on
  clear screen

  lCF.LCF_UPDATE.UPDATE_OBJ    (p_system_schema_key=>NULL,
                                p_source_object_object_name=>NULL,                                  
                                p_initialize=>'Y',
                                p_env=>'dev',
                                p_user=>'ird0sxd');
 
 
   to MERGE one table's data:
    
    set serveroutput on
    clear screen
    lCF.LCF_UPDATE.UPDATE_OBJ  (p_system_schema_key=>10,   --10 corresponds to the  system_schema key  associated with this table
                                p_source_object_object_name=>'TBLACCOUNT',                                  
                                p_initialize=>'N',
                                p_env=>'dev',
                                p_user=>'ird0sxd');
 
    
 Note:
   
  Error messages:
        ORA-20001: E) Invalid parameter vaue for p_ENV - Allowed values DEV, TEST, PROD
        ORA-20002: E) SYSTEM_SCHEMA has '|| lv_row_count||' rows. Please check whether they are correct)
        ORA-20003: E) An error has occurred loading the setup data
        ORA-20004: E) One or more incoming parameters are null, aborting ...
        ORA-20005: E) Table registration data validation failed
        ORA-20006: E) 
        	
  Modification History:
  26/04/19 SDZ Initial Build
  16/05/19 SDZ Added comments for clarity
  19/05/19 SDZ Updated code to handle miltiple domain.subdomain using XMLTABLE
  22/05/19 SDZ Notes and comments
  31/05/19 SDZ Added sref check
  06/06/19 SDZ Update merge statement for OBJECT to include OBJECT_SHORT_NAME
  13/06/19 DIK Remove references to DAYS_TO_BACKFILL
  14/06/19 SDZ Change logic to derive GENERIC_SYSTEM_NAME 
  14/06/19 SDZ Add o.SAS_LIB_REF=eo.SAS_LIB_REF to update for OBJECT_KEY
  10/07/19 SDZ Modify validation code to accomodate multiple domain/subdomains
  11/07/19 SDZ Change fullcomparison validation check
  16/07/19 DIK Add TDW_HISTORY, HISTORY_TYPE columns
  22/07/19 SDZ Updated to accomdate sub pattern changes, EFFECTIVE_TO_TIMESTAMP, EFFECTIVE_FROM_TIMESTAMP and CHANGE_CAPTURE_TIMESTAMP
  16/08/19 DIK Minor fix - sensitive data flag
  03/09/19 SDZ Added grain columns to the merge statement
  18/09/19 SDZ Added validation checks for P2H1, P2H3, updated SYSTEM_SCHEMA, Changed format of LCF_LOG to write one line for each run
  06/11/19 SDZ Add validation for P2H1 and P1 jobs to exclude FLNGVER, FLNGVERLAST from nk_column_names
  02/12/19 SDZ Updated for SWEB
  
  

  
  
  !!!!!!!!!!!!!!!!!!!!!!! IMPORTANT !!!!!!!!!!!!!!!!!!!!
  When recreating this package remember to enter the envionment when prompted. e.g. dev, test, prod. 
  Failure to enter this value will corrupt the  fields with substitution variables.
  

--------------------------------------------------------------------------------*/
PROCEDURE VALIDATE_REG_DATA (p_env IN VARCHAR2, p_user IN VARCHAR2)
AS 

/*
The puprose of this procedure is to validate the incoming data from Object Registration
to EXTRACT_OBJECT table. 

*/

/*
Declare variables and exceptions
*/

lv_row_count1  NUMBER:=0;
lv_row_count2  NUMBER:=0;
lv_row_count3  NUMBER:=0;
lv_row_count4  NUMBER:=0;
lv_row_count5  NUMBER:=0;
lv_row_count6  NUMBER:=0;
lv_row_count7  NUMBER:=0;
lv_row_count8  NUMBER:=0;
lv_row_count9  NUMBER:=0;
lv_row_count10  NUMBER:=0;
lv_row_count11  NUMBER:=0;
lv_row_count99  NUMBER:=0;

VALIDATION_FAILED EXCEPTION;

BEGIN

DBMS_OUTPUT.PUT_LINE( 'Validating the table registration data'); 
INSERT INTO LCF.LCF_LOG (TASK1,LOG_TIME,USERNAME,LOG_TYPE) 
VALUES ('Validating the table registration data',sysdate,p_user,'VALIDATION');

COMMIT;

SELECT MAX(LOG_KEY) 
INTO lv_row_count99
FROM LCF.LCF_LOG;
 
/*--------------------------------------------------------------------------------*/
 
 SELECT COUNT(*) 
 INTO lv_row_count1
 FROM LCF.EXTRACT_OBJECT
 WHERE NK_COLUMN_NAMES IS NULL;
 
  IF lv_row_count1 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'NK_COLUMN_NAMES is null'); 
  /*  INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	VALUES ('NK_COLUMN_NAMES is null',sysdate,p_user);*/
    UPDATE LCF.LCF_LOG 
    SET TASK2='NK_COLUMN_NAMES is null'
    WHERE LOG_KEY=lv_row_count99;
    
    COMMIT;
    RAISE VALIDATION_FAILED;
  END IF;
/*--------------------------------------------------------------------------------*/
 SELECT COUNT(*) 
 INTO lv_row_count2
 FROM LCF.EXTRACT_OBJECT
 WHERE LOAD_PATTERN_NAME in ('CHANGEEXTRACT','EVENTEXTRACT') AND 
 CHANGE_CAPTURE_TIMESTAMP_COLUMN IS NULL;
 
 IF lv_row_count2 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'For Change/Event Extract EFFECTIVE_TIMESTAMP_COLUMN must not be null'); 
     /*INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	   VALUES ('For Change/Event Extract EFFECTIVE_TIMESTAMP_COLUMN must not be null',sysdate,p_user);*/
     
    UPDATE LCF.LCF_LOG 
    SET TASK2='For Change/Event Extract EFFECTIVE_TIMESTAMP_COLUMN must not be null'
    WHERE LOG_KEY=lv_row_count99;
    COMMIT;
    RAISE VALIDATION_FAILED;
 END IF;
  
 /*--------------------------------------------------------------------------------*/
SELECT COUNT(*)
INTO lv_row_count5
FROM  LCF.EXTRACT_OBJECT
WHERE INSTR(EXCLUDED_COLUMNS,NK_COLUMN_NAMES) >1 ;


 IF lv_row_count3 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'Natural keys are in excluded columns'); 
    /* INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	   VALUES ('Natural keys are in excluded columns',sysdate,p_user);*/
    UPDATE LCF.LCF_LOG 
    SET TASK3='Natural keys are in excluded columns'
    WHERE LOG_KEY=lv_row_count99;
    RAISE VALIDATION_FAILED;
    
    RAISE VALIDATION_FAILED;
 END IF;
 /*--------------------------------------------------------------------------------*/  
SELECT COUNT(*)
INTO lv_row_count3
FROM  LCF.EXTRACT_OBJECT
WHERE INSTR(EXCLUDED_COLUMNS,CHANGE_CAPTURE_TIMESTAMP_COLUMN) >1 ;


 IF lv_row_count4 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'Effective_timestamp_columns are in excluded columns'); 
    /* INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	   VALUES ('Effective_timestamp_columns are in excluded columns',sysdate,p_user);*/ 
    UPDATE LCF.LCF_LOG 
    SET TASK4='Effective_timestamp_columns are in excluded columns'
    WHERE LOG_KEY=lv_row_count99;
    COMMIT;
    RAISE VALIDATION_FAILED;
 END IF;
/*--------------------------------------------------------------------------------*/
SELECT COUNT(*)
INTO lv_row_count4
FROM  LCF.EXTRACT_OBJECT
WHERE INSTR(EXCLUDED_COLUMNS,PK_COLUMN_NAMES) >1 ;


 IF lv_row_count4 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'Primary Keys are in excluded columns'); 
   /* INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	  VALUES ('Primary keys are in excluded columns',sysdate,p_user);*/
     
    UPDATE LCF.LCF_LOG 
    SET TASK5='Primary Keys are in excluded columns'
    WHERE LOG_KEY=lv_row_count99;
     
    RAISE VALIDATION_FAILED;
 END IF;
/*--------------------------------------------------------------------------------*/
SELECT COUNT(*)
INTO lv_row_count5
FROM  LCF.EXTRACT_OBJECT
WHERE CHANGE_CAPTURE_TIMESTAMP_COLUMN IS NOT NULL 
AND LOAD_PATTERN_NAME 
NOT IN  ('CHANGEEXTRACT','EVENTEXTRACT') ;


 IF lv_row_count5 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'Effective timestamp column set  for FULLCOMPARISON'); 
    /*INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	   VALUES  ('Effective timestamp column set  for FULLCOMPARISON',sysdate,p_user);*/
     
    UPDATE LCF.LCF_LOG 
    SET TASK6='Effective timestamp column set  for FULLCOMPARISON'
    WHERE LOG_KEY=lv_row_count99; 
    COMMIT;
    RAISE VALIDATION_FAILED;
 END IF;
/*--------------------------------------------------------------------------------*/

SELECT COUNT(*)
INTO lv_row_count6
FROM  LCF.EXTRACT_OBJECT
WHERE PK_COLUMN_NAMES IS  NULL AND LOAD_PATTERN_NAME =   'FULLCOMAPRISON' ;


 IF lv_row_count6 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'Primary Key Columns are NULL for  FullCompairson'); 
     /*INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	   VALUES  ('Primary Key Columns are NULL for  FullCompairson',sysdate,p_user);*/
     
    UPDATE LCF.LCF_LOG 
    SET TASK7='Primary Key Columns are NULL for  FullCompairson'
    WHERE LOG_KEY=lv_row_count99; 
    
    RAISE VALIDATION_FAILED;
 END IF;
 
/*--------------------------------------------------------------------------------*/ 
SELECT COUNT(*)
INTO lv_row_count7
FROM  LCF.EXTRACT_OBJECT
WHERE DATA_DOMAIN IS NULL;


 IF lv_row_count7 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'Domain.subdomain NULL for some rows'); 
    /* INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	   VALUES  ('Domain.subdomain NULL for some rows',sysdate,p_user);*/
    
    UPDATE LCF.LCF_LOG 
    SET TASK8='Domain.subdomain NULL for some rows'
    WHERE LOG_KEY=lv_row_count99;
    COMMIT;
    RAISE VALIDATION_FAILED;
 END IF;
 /*--------------------------------------------------------------------------------*/ 
 
/*WITH  DOMINFO (DOM_SUBDOM)
AS 
(SELECT TO_CHAR(DBMS_XMLGEN.CONVERT(RTRIM (XMLAGG (XMLELEMENT (e, DOMAIN_NAME||'.'||SUB_DOMAIN_NAME|| ',') ORDER BY DOMAIN_NAME  ).extract ('//text()').GetClobVal(),','),1)) DOM_SUBDOM
 FROM   DOMAIN d,
        SUB_DOMAIN sd
WHERE d.PRIMARY_DOMAIN_KEY=sd.PRIMARY_DOMAIN_KEY)
SELECT COUNT(*)
INTO lv_row_count8
FROM EXTRACT_OBJECT ,
     DOMINFO
--WHERE instr(DATA_DOMAIN,DOMINFO.DOM_SUBDOM) >1;
WHERE REGEXP_INSTR(DOMINFO.DOM_SUBDOM,DATA_DOMAIN) <1;*/


WITH  DOMINFO (DOM_SUBDOM)
AS 
(SELECT TO_CHAR(DBMS_XMLGEN.CONVERT(RTRIM (XMLAGG (XMLELEMENT (e, DOMAIN_NAME||'.'||SUB_DOMAIN_NAME|| ',') ORDER BY DOMAIN_NAME  ).extract ('//text()').GetClobVal(),','),1)) DOM_SUBDOM
 FROM   DOMAIN d,
        SUB_DOMAIN sd
WHERE d.PRIMARY_DOMAIN_KEY=sd.PRIMARY_DOMAIN_KEY)
SELECT  COUNT(*)--X.SOURCE_OBJECT_NAME, X.DATA_DOMAIN
INTO lv_row_count8
FROM  
     DOMINFO,
     	(SELECT  
           SOURCE_OBJECT_NAME, TRIM(COLUMN_VALUE) DATA_DOMAIN
    FROM LCF.EXTRACT_OBJECT,
      XMLTABLE(('"'
      || REPLACE(DATA_DOMAIN, ',', '","')
      || '"')) ) X 
WHERE -- REGEXP_INSTR(DOMINFO.DOM_SUBDOM,x.data_domain) <1
INSTR(DOMINFO.DOM_SUBDOM,X.DATA_DOMAIN) <1;



IF lv_row_count8 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'DATA_DOMAIN contains Invalid values'); 
     /*INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	   VALUES  ('DATA_DOMAIN contains Invalid values',sysdate,p_user);*/
     
    UPDATE LCF.LCF_LOG 
    SET TASK9='DATA_DOMAIN contains Invalid values'
    WHERE LOG_KEY=lv_row_count99;
    
    RAISE VALIDATION_FAILED;
 END IF;
/*--------------------------------------------------------------------------------*/ 
SELECT  COUNT(*)
INTO lv_row_count9
FROM EXTRACT_OBJECT
WHERE LOAD_PATTERN_NAME='CHANGEEXTRACT' AND HISTORY_TYPE='H3'  AND
(EFFECTIVE_FROM_TIMESTAMP_COLUMN IS NULL OR 
 EFFECTIVE_TO_TIMESTAMP_COLUMN IS NULL OR 
 EFFECTIVE_TIMESTAMP_GRAIN IS NULL OR 
 PURGE_GRAIN IS NULL 
);



 IF lv_row_count9 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'EFFECTIVE_FROM_TIMESTAMP, EFFECTIVE_TO_TIMESTAMP, EFFECTIVE_TIMESTAMP_GRAIN, PURGE_GRAIN  are mandatory FOR P2H3'); 
    /*   INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	   VALUES  ('Effective to/from timestamp, purge/effective_timestamp_grain columns may be null for P2H3 ',sysdate,p_user);*/
    UPDATE LCF.LCF_LOG 
    SET TASK10='EFFECTIVE_FROM_TIMESTAMP, EFFECTIVE_TO_TIMESTAMP, EFFECTIVE_TIMESTAMP_GRAIN, PURGE_GRAIN are mandatory for P2H3'
    WHERE LOG_KEY=lv_row_count99;
    
    COMMIT;
     
    RAISE VALIDATION_FAILED;
 END IF;
/*--------------------------------------------------------------------------------*/ 
SELECT  COUNT(*)
INTO lv_row_count10
FROM EXTRACT_OBJECT
WHERE LOAD_PATTERN_NAME='CHANGEEXTRACT' AND HISTORY_TYPE='H1'  AND DUPLICATION_TIMESTAMP_GRAIN IS NULL;

 IF lv_row_count10 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'DUPLICATON_TIMESTAMP_GRAIN IS NULL P2H1'); 
    /*   INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	   VALUES  ('Duplicaton timestamp grain is null for  P2H1 ',sysdate,p_user);*/
    UPDATE LCF.LCF_LOG 
    SET TASK11='DUPLICATON_TIMESTAMP_GRAIN IS NULL P2H1'
    WHERE LOG_KEY=lv_row_count99;
    
    COMMIT;
     
    RAISE VALIDATION_FAILED;
 END IF; 
 
/*--------------------------------------------------------------------------------*/ 
 
SELECT  COUNT(*)
INTO lv_row_count11
FROM EXTRACT_OBJECT
WHERE (LOAD_PATTERN_NAME='CHANGEEXTRACT' AND HISTORY_TYPE='H1' ) AND NK_COLUMN_NAMES LIKE '%FLNGVER%';


 IF lv_row_count11 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'P2H1 has FLNGVER/FLNGVERLAST'); 
    /*   INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	   VALUES  ('Duplicaton timestamp grain is null for  P2H1 ',sysdate,p_user);*/
    UPDATE LCF.LCF_LOG 
    SET TASK11='P2H1 has FLNGVER/FLNGVERLAST'
    WHERE LOG_KEY=lv_row_count99;
    
    COMMIT;
     
    RAISE VALIDATION_FAILED;
 END IF; 
 END;

 
 
/*--------------------------------------------------------------------------------*/

PROCEDURE UPDATE_OBJ (p_system_schema_key  IN NUMBER,
                      p_source_object_name IN VARCHAR2,
                      p_initialize  IN VARCHAR2,
                      p_env         IN VARCHAR2,
                      p_user        IN VARCHAR2)

AS 
/*
Declare variables and exceptions
*/
lv_row_count1 NUMBER :=0;
lv_row_count2 NUMBER :=0;
lv_row_count3 NUMBER :=0;
lv_row_count99 NUMBER :=0;


PARAMETERS_NULL EXCEPTION;
INVALID_DOMAIN EXCEPTION;
MISSING_SYSTEM_SCHEMA_KEY EXCEPTION;

BEGIN
  INSERT INTO LCF.LCF_LOG (TASK1,LOG_TIME,USERNAME,LOG_TYPE) 
  VALUES ('Starting UPDATE_OBJ',sysdate,p_user,'METADATA_UPDATE');
  COMMIT;
  
   SELECT MAX(LOG_KEY)
   INTO lv_row_count99
   FROM  LCF.LCF_LOG ;
  
   UPDATE LCF.LCF_LOG
   SET TASK1='Starting UPDATE_OBJ'
   WHERE LOG_KEY=lv_row_count99;
   COMMIT;
    
	 DBMS_OUTPUT.PUT_LINE('Starting UPDATE_OBJ');

	/*INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) VALUES ('Validating incoming parameters to UPDATE_OBJ',sysdate,p_user);*/
   UPDATE LCF.LCF_LOG
   SET TASK2='Validating incoming parameters to UPDATE_OBJ'
   WHERE LOG_KEY=lv_row_count99;
   
   COMMIT;
  
	DBMS_OUTPUT.PUT_LINE('Validating incoming parameters to UPDATE_OBJ');

	IF (p_INITIALIZE ='N' AND 
		p_system_schema_key IS NULL AND
		p_SOURCE_OBJECT_NAME IS NULL) THEN
		RAISE PARAMETERS_NULL; 
	  
	END IF;   

	/*INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) VALUES ('Updating EXTRACT_OBJECT system_key, object_key',sysdate,p_user);*/
	DBMS_OUTPUT.PUT_LINE('Updating EXTRACT_OBJECT system_key, object_key');
  
   UPDATE LCF.LCF_LOG
   SET TASK3='Updating EXTRACT_OBJECT system_key, object_key'
   WHERE LOG_KEY=lv_row_count99;
   COMMIT;

-- Find the correct SYSTEM_SCHEMA_KEY for the SYSTEM_NAME, SYSTEM_TYPE, SCHEMA_NAME and update EXTRACT_OBJECT

	UPDATE LCF.EXTRACT_OBJECT   eo
	SET (SYSTEM_SCHEMA_KEY)=
	(SELECT DISTINCT ss.system_schema_key
	FROM  SYSTEM_SCHEMA ss
	WHERE ss.SYSTEM_NAME=eo.SYSTEM_NAME 
	AND ss.SYSTEM_TYPE=eo.SYSTEM_TYPE
	AND ss.SCHEMA_NAME=eo.SCHEMA_NAME)
	;
  
  COMMIT;

-- When we have a mismatch between object_registration schema, system_name, system_type against system_schema table, 
-- there will be null system_schema keys in extract_object. We need to fail the registration at this point

 SELECT count(*)
 INTO lv_row_count3
 FROM LCF.EXTRACT_OBJECT
 WHERE SYSTEM_SCHEMA_KEY IS NULL;
 
  IF lv_row_count3 IS NULL THEN
    DBMS_OUTPUT.PUT_LINE('Missing system_schema_keys found. ');
    RAISE MISSING_SYSTEM_SCHEMA_KEY;
  END IF;
--COMMIT;


--Update the SAS_LIB_REF in EXTRACT_OBJECT
  
	UPDATE  LCF.EXTRACT_OBJECT eo
	SET SAS_LIB_REF= (SELECT DISTINCT trim(SAS_LIB_REF) 
	FROM SYSTEM_SCHEMA  ss 
	WHERE ss.SYSTEM_NAME=eo.SYSTEM_NAME 
	AND ss.SYSTEM_TYPE=eo.SYSTEM_TYPE AND SS.SCHEMA_NAME=eo.SCHEMA_NAME);
  

-- For deployment purposes we want to maintain generic names.
-- Here anything with STR gets changed to APP or WRQ or FRD
   
    UPDATE LCF.EXTRACT_OBJECT eo
    SET GENERIC_SYSTEM_NAME= CASE WHEN SAS_LIB_REF='STRAPP' THEN 'APP' 
                         WHEN SAS_LIB_REF='STRWRQ' THEN 'WRQ'
                         WHEN SAS_LIB_REF='STRFRD' THEN 'FRD'
                         WHEN SAS_LIB_REF='STRREF' THEN  'REF'
                         WHEN SAS_LIB_REF= 'STRWEB' THEN 'WEB'
                         WHEN SAS_LIB_REF='PEDWDSS' THEN 'PDSS'
                         WHEN SAS_LIB_REF='PTDW' THEN 'PTDW'
                         WHEN SAS_LIB_REF='EDWDSS' THEN 'DSS'
                         WHEN SAS_LIB_REF='EDWTDW' THEN 'TDW'
                         ELSE  SYSTEM_NAME  END;

--COMMIT;

-- Update the EXTRACT_OBJECT.OBJECT_KEY from OBJECT (first time no objects are updated)

	UPDATE 	LCF.EXTRACT_OBJECT eo
	SET 	OBJECT_KEY=(SELECT o.OBJECT_KEY
						FROM OBJECT o
						WHERE eo.SOURCE_OBJECT_NAME=o.SOURCE_OBJECT_NAME AND o.SAS_LIB_REF=eo.SAS_LIB_REF );
	  
--COMMIT;

  
	/*INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	VALUES ('Updating EXTRACT_OBJECT retention_key',SYSDATE,p_user);*/
  
   UPDATE LCF.LCF_LOG
   SET TASK4='Updating EXTRACT_OBJECT retention_key'
   WHERE LOG_KEY=lv_row_count99;
  
	DBMS_OUTPUT.PUT_LINE('Updating EXTRACT_OBJECT retention_key');

-- Updaet EXTRACT_OBJECT.RETENTION_KEY 

-- Update EXTRACT_OBJECT.RETENTION_KEY 

	UPDATE LCF.EXTRACT_OBJECT eo 
	SET RETENTION_KEY=
	(SELECT RETENTION_KEY
   FROM RETENTION_PERIOD rp 
	 WHERE rp.RETENTION_NUM_DAYS=EO.RETENTION_PERIOD);

	/*INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	VALUES ('Merging object registration data',sysdate,p_user);*/
  
   UPDATE LCF.LCF_LOG
   SET TASK5='Merging object registration data'
   WHERE LOG_KEY=lv_row_count99;
   
	DBMS_OUTPUT.PUT_LINE('Merging OBJECT registration data');


--COMMIT;

-- MERGE data to EXTRACT_OBJECT (Merge will handle both new records and changes to existing records)

	MERGE INTO LCF.OBJECT o 
	USING LCF.EXTRACT_OBJECT eo
	ON  ( eo.SYSTEM_SCHEMA_KEY=o.SYSTEM_SCHEMA_KEY 
		  AND EO.OBJECT_KEY=o.OBJECT_KEY
		 )
	WHEN NOT MATCHED THEN 
	INSERT  
	(
	SYSTEM_SCHEMA_KEY                 			  ,                 
	TARGET_OBJECT_NAME        								,
	OBJECT_SHORT_NAME        							    ,
	TARGET_DB                  								,
	SOURCE_OBJECT_NAME         								,
	SOURCE_OBJECT_TYPE     									  ,
	SAS_LIB_REF                							 	,
	PK_COLUMN_NAMES        									  ,
	NK_COLUMN_NAMES          							   	,
	EXCLUDED_COLUMNS           								,
	LOAD_PATTERN_NAME        								  ,
	SENSITIVE_DATA_FLAG      								  ,
	--DOMAIN_BRIDGE_KEY       								,
	HISTORY_TYPE											        ,
	HISTORY_LOADED_FROM_TDW									  ,
	RETENTION_KEY            								  ,
	CUSTOM_SQL                								,
  CHANGE_CAPTURE_TIMESTAMP_COLUMN           ,
	EFFECTIVE_FROM_TIMESTAMP_COLUMN 					,
  EFFECTIVE_TO_TIMESTAMP_COLUMN 						,
  EFFECTIVE_TIMESTAMP_GRAIN                 ,    
  PURGE_GRAIN                               ,   
  DUPLICATION_TIMESTAMP_GRAIN               ,  
	CREATED_DATE               								,
	CREATED_BY                 
	)
	VALUES
	   (
	eo.SYSTEM_SCHEMA_KEY                                     ,                       
	CASE WHEN EO.TARGET_OBJECT_SHORT_NAME IS NOT NULL THEN 		NVL(eo.GENERIC_SYSTEM_NAME,eo.SYSTEM_NAME)||'_'||eo.TARGET_OBJECT_SHORT_NAME 	ELSE NVL(eo.GENERIC_SYSTEM_NAME,eo.SYSTEM_NAME)||'_'||EO.SOURCE_OBJECT_NAME  END  		,
	eo.TARGET_OBJECT_SHORT_NAME                           	,
	NVL(eo.TARGET_DB,'prod'||'_raw')                    	,
	eo.SOURCE_OBJECT_NAME                                 	,
	'TABLE'                                 		        		,
	eo.SAS_LIB_REF                                        	,
	eo.PK_COLUMN_NAMES                                    	,
	eo.NK_COLUMN_NAMES                                    	,
	eo.EXCLUDED_COLUMNS                                   	,
	eo.LOAD_PATTERN_NAME                                  	,
	eo.SENSITIVE_DATA_FLAG                                	,
	eo.HISTORY_TYPE											              			,
	eo.HISTORY_LOADED_FROM_TDW									            ,	
  eo.RETENTION_KEY                                      	,
	eo.CUSTOM_SQL                                         	,
  eo.CHANGE_CAPTURE_TIMESTAMP_COLUMN                      ,
	eo.EFFECTIVE_FROM_TIMESTAMP_COLUMN 								      ,
  eo.EFFECTIVE_TO_TIMESTAMP_COLUMN 								        ,
  eo.EFFECTIVE_TIMESTAMP_GRAIN                            ,    
  eo.PURGE_GRAIN                                          ,   
  eo.DUPLICATION_TIMESTAMP_GRAIN                          ,  
	eo.CREATED_DATE                                       	,
	eo.CREATED_BY                
	)
	WHEN MATCHED THEN
	UPDATE  SET  
	o.TARGET_OBJECT_NAME                = CASE WHEN TARGET_OBJECT_SHORT_NAME IS NOT NULL THEN NVL(eo.GENERIC_SYSTEM_NAME,eo.SYSTEM_NAME)||'_'||TARGET_OBJECT_SHORT_NAME ELSE NVL(eo.GENERIC_SYSTEM_NAME,eo.SYSTEM_NAME)||'_'||eo.SOURCE_OBJECT_NAME END  , 
  o.OBJECT_SHORT_NAME                 =eo.TARGET_OBJECT_SHORT_NAME                   ,
	o.SAS_LIB_REF                       =eo.SAS_LIB_REF							                   ,
	o.NK_COLUMN_NAMES                   =eo.NK_COLUMN_NAMES                    	       ,    
	o.PK_COLUMN_NAMES                   =eo.PK_COLUMN_NAMES                    	       ,   
	o.EXCLUDED_COLUMNS                  =eo.EXCLUDED_COLUMNS                           ,        
	o.LOAD_PATTERN_NAME                 =UPPER(eo.LOAD_PATTERN_NAME)           	       ,
	o.CUSTOM_SQL                        =eo.CUSTOM_SQL                         	       ,      
  o.CHANGE_CAPTURE_TIMESTAMP_COLUMN   =eo.CHANGE_CAPTURE_TIMESTAMP_COLUMN            ,
	o.EFFECTIVE_FROM_TIMESTAMP_COLUMN 	=eo.EFFECTIVE_FROM_TIMESTAMP_COLUMN			       ,
  o.EFFECTIVE_TO_TIMESTAMP_COLUMN     =eo.EFFECTIVE_TO_TIMESTAMP_COLUMN				       ,
  o.EFFECTIVE_TIMESTAMP_GRAIN         =eo.EFFECTIVE_TIMESTAMP_GRAIN                  ,    
  o.PURGE_GRAIN                       =eo.PURGE_GRAIN                                ,   
  o.DUPLICATION_TIMESTAMP_GRAIN       =eo.DUPLICATION_TIMESTAMP_GRAIN                , 
  o.TARGET_DB                         = nvl(eo.TARGET_DB,'prod'||'_raw')           ,
  o.SENSITIVE_DATA_FLAG               =eo.SENSITIVE_DATA_FLAG                        ,
	o.HISTORY_TYPE     			            =eo.HISTORY_TYPE							                 ,
	o.HISTORY_LOADED_FROM_TDW 	        =eo.HISTORY_LOADED_FROM_TDW				             ,
	o.CREATED_BY                        =eo.CREATED_BY                         	       ,
	o.CREATED_DATE                      =eo.CREATED_DATE  						                 ,   
	o.RETENTION_KEY                     =eo.RETENTION_KEY
	WHERE  p_initialize='Y' OR 
	( o.SYSTEM_SCHEMA_KEY=p_system_schema_key AND
	  o.SOURCE_OBJECT_NAME=p_source_object_name
	  );
	  
	COMMIT;

  -- DATA_DOMAIN_EXPANDED is a temporary table which gets truncated each time
  
	EXECUTE IMMEDIATE 'TRUNCATE TABLE LCF.DATA_DOMAIN_EXPANDED' ;

	/*MERGE INTO LCF.DATA_DOMAIN_EXPANDED ddt
	USING (
	SELECT  
           OBJECT_KEY,
           TRIM(COLUMN_VALUE) DATA_DOMAIN
    FROM LCF.EXTRACT_OBJECT,
      xmltable(('"'
      || REPLACE(DATA_DOMAIN, ',', '","')
      || '"'))
           ) q
	ON (ddt.DATA_DOMAIN_EXPANDED_KEY = q.DATA_DOMAIN_EXPANDED_KEY)
	WHEN MATCHED THEN UPDATE 
	SET 
	ddt.DATA_DOMAIN=q.DATA_DOMAIN
	WHEN NOT MATCHED THEN INSERT 
	(OBJECT_KEY,
		DATA_DOMAIN)
		VALUES 
    (q.OBJECT_KEY,
     q.DATA_DOMAIN)*/
     
-- 	Unable to get a stable set of rows for update
-- 	Instead we truncate and insert this table each time

-- 	Update EXTRACT_OBJECT.OBJECT_KEY after the MERGE to pick up any new OBJECT_KEYs
	UPDATE 	LCF.EXTRACT_OBJECT eo
	SET 	OBJECT_KEY=(SELECT o.OBJECT_KEY
						FROM OBJECT o
						WHERE eo.SOURCE_OBJECT_NAME=o.SOURCE_OBJECT_NAME AND eo.SYSTEM_SCHEMA_KEY=o.SYSTEM_SCHEMA_KEY AND eo.SAS_LIB_REF=o.SAS_LIB_REF);


-- DATA_DOMAIN_EXPANDED is used to handle  multiple domain.subdomain entries, comma separated
-- Here XMLTABLE is used to convert the entries to rows.
	INSERT INTO DATA_DOMAIN_EXPANDED (OBJECT_KEY,DATA_DOMAIN)
	SELECT  
           OBJECT_KEY,
           TRIM(COLUMN_VALUE) DATA_DOMAIN
    FROM LCF.EXTRACT_OBJECT,
      XMLTABLE(('"'
      || REPLACE(DATA_DOMAIN, ',', '","')
      || '"'));
           

 
	/*INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	VALUES ('Updating EXTRACT_OBJECT primary_domain_key, sub_domain_key',sysdate,p_user);*/
  
   UPDATE LCF.LCF_LOG
   SET TASK6='Updating EXTRACT_OBJECT primary_domain_key, sub_domain_key'
   WHERE LOG_KEY=lv_row_count99;
	 DBMS_OUTPUT.PUT_LINE('Updating EXTRACT_OBJECT primary_domain_key, sub_domain_key');
	 
   -- Update DATA_DOMAIN_EXPANDED with the PRIMARY_DOMAIN_KEY
	UPDATE LCF.DATA_DOMAIN_EXPANDED dde
	SET dde.PRIMARY_DOMAIN_KEY=(SELECT PRIMARY_DOMAIN_KEY FROM LCF.DOMAIN  d 
	WHERE d.DOMAIN_NAME=TO_CHAR(SUBSTR(dde.DATA_DOMAIN,1,INSTR(dde.DATA_DOMAIN,'.')-1)));

     -- Update DATA_DOMAIN_EXPANDED with the SUB_DOMAIN_KEY
	UPDATE LCF.DATA_DOMAIN_EXPANDED dde
	SET dde.SUB_DOMAIN_KEY=(SELECT SUB_DOMAIN_KEY FROM LCF.SUB_DOMAIN  sd 
	WHERE sd.SUB_DOMAIN_NAME= TO_CHAR(SUBSTR(dde.DATA_DOMAIN,INSTR(dde.DATA_DOMAIN,'.')+1)) AND 
    dde.PRIMARY_DOMAIN_KEY=sd.PRIMARY_DOMAIN_KEY );

--COMMIT;
  


	/*INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	VALUES ('Merging data to DOMAIN_BRIDGE',sysdate,p_user);
	DBMS_OUTPUT.PUT_LINE('Merging data to  DOMAIN_BRDIGE');*/


-- Update DATA_DOMAIN_EXPANDED.DOMAIN_BRIDGE_KEY Before Merge

	UPDATE LCF.DATA_DOMAIN_EXPANDED dde
	SET dde.DOMAIN_BRIDGE_KEY = (SELECT DISTINCT db.DOMAIN_BRIDGE_KEY 
                         FROM LCF.DOMAIN_BRIDGE db
	                       WHERE db.PRIMARY_DOMAIN_KEY=dde.PRIMARY_DOMAIN_KEY AND 
                         db.SUB_DOMAIN_KEY=dde.SUB_DOMAIN_KEY 
                         AND dde.OBJECT_KEY=db.OBJECT_KEY
                         
                         ) 
  ;
  

	COMMIT;

-- Update DOMAIN_BRIDGE

	MERGE INTO    LCF.DOMAIN_BRIDGE db 
	USING         LCF.DATA_DOMAIN_EXPANDED eo
	ON            (eo.domain_bridge_key=db.DOMAIN_BRIDGE_KEY )
	WHEN       NOT MATCHED THEN
	INSERT   
	(OBJECT_KEY,
	 PRIMARY_DOMAIN_KEY,
	 SUB_DOMAIN_KEY) 
	VALUES
	(eo.OBJECT_KEY,
	 eo.PRIMARY_DOMAIN_KEY,
	 eo.SUB_DOMAIN_KEY)
	WHEN MATCHED THEN 
	UPDATE SET
	-- db.OBJECT_KEY=eo.OBJECT_KEY,
	 db.PRIMARY_DOMAIN_KEY=eo.PRIMARY_DOMAIN_KEY,
	 db.SUB_DOMAIN_KEY=eo.SUB_DOMAIN_KEY
	WHERE db.PRIMARY_DOMAIN_KEY=eo.PRIMARY_DOMAIN_KEY AND 
	db.SUB_DOMAIN_KEY=eo.SUB_DOMAIN_KEY;

--COMMIT;

-- Update DATA_DOMAIN_EXPANDED.DOMAIN_BRIDGE_KEY After Merge
	UPDATE LCF.DATA_DOMAIN_EXPANDED dde
	SET DOMAIN_BRIDGE_KEY = (SELECT distinct db.DOMAIN_BRIDGE_KEY 
                           FROM LCF.DOMAIN_BRIDGE db
	                         WHERE db.PRIMARY_DOMAIN_KEY=dde.PRIMARY_DOMAIN_KEY 
                           AND   db.SUB_DOMAIN_KEY=dde.SUB_DOMAIN_KEY 
                           AND   dde.OBJECT_KEY=db.OBJECT_KEY
                         ) 
  ;
  
	DBMS_OUTPUT.PUT_LINE('Updating DATA_DOMAIN_EXPANDED');

  
--COMMIT;



	/*INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) 
	VALUES ('Leaving UPDATE_OBJ',sysdate,p_user);*/
  
   UPDATE LCF.LCF_LOG
   SET TASK7='Leaving UPDATE_OBJ'
   WHERE LOG_KEY=lv_row_count99;
	 DBMS_OUTPUT.PUT_LINE('Updating EXTRACT_OBJECT primary_domain_key, sub_domain_key');
   
	 DBMS_OUTPUT.PUT_LINE('Leaving UPDATE_OBJ ');

	EXCEPTION
 
    WHEN PARAMETERS_NULL THEN
   
    RAISE_APPLICATION_ERROR (-20004,' One or more incoming parameters are null, aborting ...' ); 
    /*INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) VALUES ('-20004 One or more incoming parameters are null, aborting ...',sysdate,p_user);*/
    
    UPDATE LCF.LCF_LOG
    SET TASK8='-20004, One or more incoming parameters are null, aborting ...'
    WHERE LOG_KEY=lv_row_count99;
    COMMIT;
    
    
  
    
    WHEN MISSING_SYSTEM_SCHEMA_KEY THEN 
    
    UPDATE LCF.LCF_LOG
    SET TASK3='Missing system_schema_keys found. '
    WHERE LOG_KEY=lv_row_count99;
    COMMIT;
   
    RAISE_APPLICATION_ERROR (-20006,' Missing system_schema_keys found, aborting ...' ); 
    
    END;
    
   /* WHEN INVALID_DOMAIN  THEN
    RAISE_APPLICATION_ERROR (-20006,' Invalid Domain/Sub Domain supplied ' ); 
    INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) VALUES ('-20006 Invalid Domain/Sub Domain supplied , aborting ...',sysdate,p_user);
    END;*/
END;




 
/*-------------------------------------------------------------------------------------------------------*/

-- Below are the actual DDLs extracted from Prod database. These also reside in setup.lcf.sql in GIT.

CREATE TABLE "LCF"."DATA_DOMAIN_EXPANDED" 
   (	"OBJECT_KEY" NUMBER(10,0), 
	"DATA_DOMAIN" VARCHAR2(100 BYTE), 
	"PRIMARY_DOMAIN_KEY" NUMBER(10,0), 
	"SUB_DOMAIN_KEY" NUMBER(10,0), 
	"DOMAIN_BRIDGE_KEY" NUMBER(10,0), 
	 CONSTRAINT "DATA_DOMAIN_EXPANDED_PK" PRIMARY KEY ("OBJECT_KEY", "DATA_DOMAIN")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"   NO INMEMORY ;
  
  
  CREATE TABLE "LCF"."DIP_CONFIG" 
   (	"KEY" VARCHAR2(20 BYTE), 
	"VALUE" VARCHAR2(250 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"   NO INMEMORY ;
CREATE TABLE "LCF"."DIP_OBJECT_RUN" 
   (	"OBJECT_RUN_KEY" NUMBER(10,0), 
	"LIB_NAME" VARCHAR2(30 BYTE), 
	"OBJECT_NAME" VARCHAR2(50 BYTE), 
	"CATEGORY" VARCHAR2(30 BYTE), 
	"START_TIME" TIMESTAMP (6), 
	"END_TIME" TIMESTAMP (6), 
	"STATUS" VARCHAR2(20 BYTE), 
	"TASK1" VARCHAR2(50 BYTE), 
	"TASK1_START_TIME" TIMESTAMP (6), 
	"TASK1_END_TIME" TIMESTAMP (6), 
	"TASK1_STATUS" VARCHAR2(50 BYTE), 
	"TASK1_STATUS_MESSAGE" VARCHAR2(4000 BYTE), 
	"TASK2" VARCHAR2(50 BYTE), 
	"TASK2_START_TIME" TIMESTAMP (6), 
	"TASK2_END_TIME" TIMESTAMP (6), 
	"TASK2_STATUS" VARCHAR2(50 BYTE), 
	"TASK2_STATUS_MESSAGE" VARCHAR2(4000 BYTE), 
	"TASK3" VARCHAR2(50 BYTE), 
	"TASK3_START_TIME" TIMESTAMP (6), 
	"TASK3_END_TIME" TIMESTAMP (6), 
	"TASK3_STATUS" VARCHAR2(50 BYTE), 
	"TASK3_STATUS_MESSAGE" VARCHAR2(4000 BYTE), 
	"TASK4" VARCHAR2(50 BYTE), 
	"TASK4_START_TIME" TIMESTAMP (6), 
	"TASK4_END_TIME" TIMESTAMP (6), 
	"TASK4_STATUS" VARCHAR2(50 BYTE), 
	"TASK4_STATUS_MESSAGE" VARCHAR2(4000 BYTE), 
	 CONSTRAINT "OBJECT_RUN_KEY" PRIMARY KEY ("OBJECT_RUN_KEY")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"   NO INMEMORY ;

  CREATE OR REPLACE EDITIONABLE TRIGGER "LCF"."TRG_DIP_OBJECT_RUN_KEY" 
BEFORE INSERT ON LCF.DIP_OBJECT_RUN
FOR EACH ROW
BEGIN
	SELECT seq_DIP_OBJECT_RUN_KEY.nextval
		INTO :NEW.OBJECT_RUN_KEY
		FROM DUAL;
END;
/
ALTER TRIGGER "LCF"."TRG_DIP_OBJECT_RUN_KEY" ENABLE;



  CREATE TABLE "LCF"."DOMAIN" 
   (	"PRIMARY_DOMAIN_KEY" NUMBER(10,0), 
	"DOMAIN_NAME" VARCHAR2(100 BYTE), 
	"DOMAIN_COMMENTS" CLOB, 
	 CONSTRAINT "PRIMARY_DOMAIN_PK" PRIMARY KEY ("PRIMARY_DOMAIN_KEY")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"   NO INMEMORY 
 LOB ("DOMAIN_COMMENTS") STORE AS SECUREFILE (
  TABLESPACE "LOAD_CONTROL_DATA" ENABLE STORAGE IN ROW CHUNK 8192
  NOCACHE LOGGING  NOCOMPRESS  KEEP_DUPLICATES 
  STORAGE(INITIAL 106496 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) ;



 CREATE TABLE "LCF"."DOMAIN_BRIDGE" 
   (	"DOMAIN_BRIDGE_KEY" NUMBER(10,0), 
	"OBJECT_KEY" NUMBER, 
	"PRIMARY_DOMAIN_KEY" NUMBER(10,0), 
	"SUB_DOMAIN_KEY" NUMBER(10,0), 
	 CONSTRAINT "DOMAIN_BRIDGE_PK" PRIMARY KEY ("DOMAIN_BRIDGE_KEY")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"   NO INMEMORY ;

  CREATE OR REPLACE EDITIONABLE TRIGGER "LCF"."DOMAIN_BRIDGE_KEY" 
BEFORE INSERT ON LCF.DOMAIN_BRIDGE
FOR EACH ROW
BEGIN
	SELECT seq_DOMAIN_BRIDGE_KEY.nextval
		INTO :NEW.DOMAIN_BRIDGE_KEY
		FROM DUAL;
END;
/
ALTER TRIGGER "LCF"."DOMAIN_BRIDGE_KEY" ENABLE;



  CREATE TABLE "LCF"."EXTRACT_OBJECT" 
   (	"SYSTEM_NAME" VARCHAR2(30 BYTE), 
	"SYSTEM_TYPE" VARCHAR2(30 BYTE), 
	"SCHEMA_NAME" VARCHAR2(30 BYTE), 
	"SOURCE_OBJECT_NAME" VARCHAR2(30 BYTE), 
	"TARGET_OBJECT_SHORT_NAME" VARCHAR2(25 BYTE), 
	"SAS_LIB_REF" VARCHAR2(30 BYTE), 
	"PK_COLUMN_NAMES" CLOB, 
	"NK_COLUMN_NAMES" CLOB, 
	"EXCLUDED_COLUMNS" CLOB, 
	"TARGET_DB" VARCHAR2(30 BYTE), 
	"LOAD_PATTERN_NAME" VARCHAR2(30 BYTE), 
	"SENSITIVE_DATA_FLAG" VARCHAR2(64 BYTE), 
	"DATA_DOMAIN" CLOB, 
	"RETENTION_PERIOD" NUMBER(10,0), 
	"CUSTOM_SQL" CLOB, 
	"CHANGE_CAPTURE_TIMESTAMP_COLUMN" VARCHAR2(4000 BYTE), 
	"HISTORY_LOADED_FROM_TDW" VARCHAR2(1 BYTE), 
	"SYSTEM_SCHEMA_KEY" NUMBER(10,0), 
	"OBJECT_KEY" NUMBER(10,0), 
	"RETENTION_KEY" NUMBER(10,0), 
	"PRIMARY_DOMAIN_KEY" NUMBER(10,0), 
	"SUB_DOMAIN_KEY" NUMBER(10,0), 
	"GENERIC_SYSTEM_NAME" VARCHAR2(5 BYTE), 
	"DATA_DOMAIN_EXPANDED_KEY" NUMBER(10,0), 
	"HISTORY_TYPE" VARCHAR2(5 BYTE), 
	"EFFECTIVE_FROM_TIMESTAMP_COLUMN" VARCHAR2(4000 BYTE), 
	"EFFECTIVE_TO_TIMESTAMP_COLUMN" VARCHAR2(4000 BYTE), 
	"EFFECTIVE_TIMESTAMP_GRAIN" VARCHAR2(30 BYTE), 
	"PURGE_GRAIN" VARCHAR2(30 BYTE), 
	"DUPLICATION_TIMESTAMP_GRAIN" VARCHAR2(30 BYTE), 
	"CREATED_DATE" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(10 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"   NO INMEMORY 
 LOB ("PK_COLUMN_NAMES") STORE AS SECUREFILE (
  TABLESPACE "LOAD_CONTROL_DATA" ENABLE STORAGE IN ROW CHUNK 8192
  NOCACHE LOGGING  NOCOMPRESS  KEEP_DUPLICATES 
  STORAGE(INITIAL 106496 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) 
 LOB ("NK_COLUMN_NAMES") STORE AS SECUREFILE (
  TABLESPACE "LOAD_CONTROL_DATA" ENABLE STORAGE IN ROW CHUNK 8192
  NOCACHE LOGGING  NOCOMPRESS  KEEP_DUPLICATES 
  STORAGE(INITIAL 106496 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) 
 LOB ("EXCLUDED_COLUMNS") STORE AS SECUREFILE (
  TABLESPACE "LOAD_CONTROL_DATA" ENABLE STORAGE IN ROW CHUNK 8192
  NOCACHE LOGGING  NOCOMPRESS  KEEP_DUPLICATES 
  STORAGE(INITIAL 106496 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) 
 LOB ("DATA_DOMAIN") STORE AS SECUREFILE (
  TABLESPACE "LOAD_CONTROL_DATA" ENABLE STORAGE IN ROW CHUNK 8192
  NOCACHE LOGGING  NOCOMPRESS  KEEP_DUPLICATES 
  STORAGE(INITIAL 106496 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) 
 LOB ("CUSTOM_SQL") STORE AS SECUREFILE (
  TABLESPACE "LOAD_CONTROL_DATA" ENABLE STORAGE IN ROW CHUNK 8192
  NOCACHE LOGGING  NOCOMPRESS  KEEP_DUPLICATES 
  STORAGE(INITIAL 106496 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) ;
  
  
  
  CREATE TABLE "LCF"."LCF_LOG" 
   (	"LOG_KEY" NUMBER(10,0), 
	"LOG_TIME" TIMESTAMP (6), 
	"USERNAME" VARCHAR2(10 BYTE), 
	"LOG_TYPE" VARCHAR2(20 BYTE), 
	"TASK1" VARCHAR2(500 BYTE), 
	"TASK2" VARCHAR2(500 BYTE), 
	"TASK3" VARCHAR2(500 BYTE), 
	"TASK4" VARCHAR2(500 BYTE), 
	"TASK5" VARCHAR2(500 BYTE), 
	"TASK6" VARCHAR2(500 BYTE), 
	"TASK7" VARCHAR2(500 BYTE), 
	"TASK8" VARCHAR2(500 BYTE), 
	"TASK9" VARCHAR2(500 BYTE), 
	"TASK10" VARCHAR2(500 BYTE), 
	"TASK11" VARCHAR2(500 BYTE), 
	"TASK12" VARCHAR2(500 BYTE), 
	"TASK13" VARCHAR2(500 BYTE), 
	"TASK14" VARCHAR2(500 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"   NO INMEMORY ;

  CREATE OR REPLACE EDITIONABLE TRIGGER "LCF"."TRG_LCF_LOG_KEY" 
BEFORE INSERT ON LCF.LCF_LOG
FOR EACH ROW
BEGIN
	SELECT seq_LCF_LOG_KEY.nextval
		INTO :NEW.LOG_KEY
		FROM DUAL;
END;
/
ALTER TRIGGER "LCF"."TRG_LCF_LOG_KEY" ENABLE;


CREATE TABLE "LCF"."OBJECT" 
   (	"OBJECT_KEY" NUMBER(10,0), 
	"SYSTEM_SCHEMA_KEY" NUMBER(10,0), 
	"TARGET_OBJECT_NAME" VARCHAR2(30 BYTE), 
	"OBJECT_SHORT_NAME" VARCHAR2(25 BYTE), 
	"TARGET_DB" VARCHAR2(30 BYTE) DEFAULT 'prod'||'_raw', 
	"SOURCE_OBJECT_NAME" VARCHAR2(30 BYTE), 
	"SOURCE_OBJECT_TYPE" VARCHAR2(5 BYTE) DEFAULT 'TABLE', 
	"SAS_LIB_REF" VARCHAR2(30 BYTE), 
	"PK_COLUMN_NAMES" CLOB, 
	"NK_COLUMN_NAMES" CLOB, 
	"EXCLUDED_COLUMNS" CLOB, 
	"LOAD_PATTERN_NAME" VARCHAR2(30 BYTE) DEFAULT 'FULLCOMPARISON', 
	"SENSITIVE_DATA_FLAG" VARCHAR2(1 BYTE), 
	"RETENTION_KEY" NUMBER(10,0), 
	"CUSTOM_SQL" CLOB, 
	"CHANGE_CAPTURE_TIMESTAMP_COLUMN" VARCHAR2(4000 BYTE), 
	"HISTORY_LOADED_FROM_TDW" VARCHAR2(1 BYTE), 
	"HISTORY_TYPE" VARCHAR2(5 BYTE), 
	"EFFECTIVE_FROM_TIMESTAMP_COLUMN" VARCHAR2(4000 BYTE), 
	"EFFECTIVE_TO_TIMESTAMP_COLUMN" VARCHAR2(4000 BYTE), 
	"EFFECTIVE_TIMESTAMP_GRAIN" VARCHAR2(30 BYTE), 
	"PURGE_GRAIN" VARCHAR2(30 BYTE), 
	"DUPLICATION_TIMESTAMP_GRAIN" VARCHAR2(30 BYTE), 
	"CREATED_DATE" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(10 BYTE), 
	"CAS_UPLOAD" VARCHAR2(1 BYTE) DEFAULT 'N', 
	"BATCH_NAME" VARCHAR2(15 BYTE), 
	"LAYER" VARCHAR2(15 BYTE) DEFAULT 'RAW', 
	 CONSTRAINT "SYSTEM_SCHEMA_OBJECT_FK" FOREIGN KEY ("SYSTEM_SCHEMA_KEY")
	  REFERENCES "LCF"."SYSTEM_SCHEMA" ("SYSTEM_SCHEMA_KEY") DEFERRABLE ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"   NO INMEMORY 
 LOB ("PK_COLUMN_NAMES") STORE AS SECUREFILE (
  TABLESPACE "LOAD_CONTROL_DATA" ENABLE STORAGE IN ROW CHUNK 8192
  NOCACHE LOGGING  NOCOMPRESS  KEEP_DUPLICATES 
  STORAGE(INITIAL 106496 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) 
 LOB ("NK_COLUMN_NAMES") STORE AS SECUREFILE (
  TABLESPACE "LOAD_CONTROL_DATA" ENABLE STORAGE IN ROW CHUNK 8192
  NOCACHE LOGGING  NOCOMPRESS  KEEP_DUPLICATES 
  STORAGE(INITIAL 106496 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) 
 LOB ("EXCLUDED_COLUMNS") STORE AS SECUREFILE (
  TABLESPACE "LOAD_CONTROL_DATA" ENABLE STORAGE IN ROW CHUNK 8192
  NOCACHE LOGGING  NOCOMPRESS  KEEP_DUPLICATES 
  STORAGE(INITIAL 106496 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) 
 LOB ("CUSTOM_SQL") STORE AS SECUREFILE (
  TABLESPACE "LOAD_CONTROL_DATA" ENABLE STORAGE IN ROW CHUNK 8192
  NOCACHE LOGGING  NOCOMPRESS  KEEP_DUPLICATES 
  STORAGE(INITIAL 106496 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) ;

  CREATE OR REPLACE EDITIONABLE TRIGGER "LCF"."TRG_OBJECT_KEY" 
BEFORE INSERT ON LCF.OBJECT
FOR EACH ROW
BEGIN
	SELECT seq_OBJECT_KEY.nextval
		INTO :NEW.OBJECT_KEY
		FROM DUAL;
END;
/
ALTER TRIGGER "LCF"."TRG_OBJECT_KEY" ENABLE;

  CREATE OR REPLACE EDITIONABLE TRIGGER "LCF"."TRG_OBJECT_HIST" 
AFTER  
INSERT OR UPDATE ON LCF.OBJECT 
FOR EACH ROW 
BEGIN
IF INSERTING THEN 
INSERT INTO LCF.OBJECT_HIST
( OBJECT_KEY , 
	SYSTEM_SCHEMA_KEY , 
	TARGET_OBJECT_NAME , 
	OBJECT_SHORT_NAME , 
	TARGET_DB , 
	SOURCE_OBJECT_NAME , 
	SOURCE_OBJECT_TYPE , 
	SAS_LIB_REF , 
	PK_COLUMN_NAMES , 
	NK_COLUMN_NAMES , 
	EXCLUDED_COLUMNS , 
	LOAD_PATTERN_NAME , 
	SENSITIVE_DATA_FLAG , 
	RETENTION_KEY , 
	CUSTOM_SQL, 
	CHANGE_CAPTURE_TIMESTAMP_COLUMN,
  HISTORY_LOADED_FROM_TDW ,
	CREATED_DATE , 
	CREATED_BY , 
  LAST_UPDATE_TIME,
  HISTORY_TYPE,
  EFFECTIVE_FROM_TIMESTAMP_COLUMN,
  EFFECTIVE_TO_TIMESTAMP_COLUMN 
  )
VALUES
  (
  :new.OBJECT_KEY , 
	:new.SYSTEM_SCHEMA_KEY , 
	:new.TARGET_OBJECT_NAME , 
	:new.OBJECT_SHORT_NAME , 
	:new.TARGET_DB , 
	:new.SOURCE_OBJECT_NAME , 
	:new.SOURCE_OBJECT_TYPE , 
	:new.SAS_LIB_REF , 
	:new.PK_COLUMN_NAMES , 
	:new.NK_COLUMN_NAMES , 
	:new.EXCLUDED_COLUMNS , 
	:new.LOAD_PATTERN_NAME , 
	:new.SENSITIVE_DATA_FLAG , 
	:new.RETENTION_KEY , 
	:new.CUSTOM_SQL, 
	:new.CHANGE_CAPTURE_TIMESTAMP_COLUMN , 
  :new.HISTORY_LOADED_FROM_TDW ,
	:new.CREATED_DATE , 
	:new.CREATED_BY, 
  SYSDATE,
  :new.HISTORY_TYPE ,
  :new.EFFECTIVE_FROM_TIMESTAMP_COLUMN,
  :new.EFFECTIVE_TO_TIMESTAMP_COLUMN );
  END IF;
  IF UPDATING THEN 
  INSERT INTO LCF.OBJECT_HIST
  ( OBJECT_KEY , 
	SYSTEM_SCHEMA_KEY , 
	TARGET_OBJECT_NAME , 
	OBJECT_SHORT_NAME , 
	TARGET_DB , 
	SOURCE_OBJECT_NAME , 
	SOURCE_OBJECT_TYPE , 
	SAS_LIB_REF , 
	PK_COLUMN_NAMES , 
	NK_COLUMN_NAMES , 
	EXCLUDED_COLUMNS , 
	LOAD_PATTERN_NAME , 
	SENSITIVE_DATA_FLAG , 
	RETENTION_KEY , 
	CUSTOM_SQL, 
	CHANGE_CAPTURE_TIMESTAMP_COLUMN , 
  HISTORY_LOADED_FROM_TDW ,
	CREATED_DATE , 
	CREATED_BY , 
  LAST_UPDATE_TIME,
  HISTORY_TYPE ,
  EFFECTIVE_FROM_TIMESTAMP_COLUMN,
  EFFECTIVE_TO_TIMESTAMP_COLUMN)
  VALUES 
  (
  :old.OBJECT_KEY , 
	:old.SYSTEM_SCHEMA_KEY , 
	:old.TARGET_OBJECT_NAME , 
	:old.OBJECT_SHORT_NAME , 
	:old.TARGET_DB , 
	:old.SOURCE_OBJECT_NAME , 
	:old.SOURCE_OBJECT_TYPE , 
	:old.SAS_LIB_REF , 
	:old.PK_COLUMN_NAMES , 
	:old.NK_COLUMN_NAMES , 
	:old.EXCLUDED_COLUMNS , 
	:old.LOAD_PATTERN_NAME ,  
	:old.SENSITIVE_DATA_FLAG , 
	:old.RETENTION_KEY , 
	:old.CUSTOM_SQL, 
	:old.CHANGE_CAPTURE_TIMESTAMP_COLUMN , 
  :old.HISTORY_LOADED_FROM_TDW ,
	:old.CREATED_DATE , 
	:old.CREATED_BY , 
  SYSDATE,
  :old.HISTORY_TYPE ,
  :old.EFFECTIVE_FROM_TIMESTAMP_COLUMN,
  :old.EFFECTIVE_TO_TIMESTAMP_COLUMN);
END IF;
END;
/
ALTER TRIGGER "LCF"."TRG_OBJECT_HIST" ENABLE;


CREATE TABLE "LCF"."OBJECT_HIST" 
   (	"OBJECT_KEY" NUMBER(10,0), 
	"SYSTEM_SCHEMA_KEY" NUMBER(10,0), 
	"TARGET_OBJECT_NAME" VARCHAR2(30 BYTE), 
	"OBJECT_SHORT_NAME" VARCHAR2(25 BYTE), 
	"TARGET_DB" VARCHAR2(30 BYTE) DEFAULT 'prod'||'_raw', 
	"SOURCE_OBJECT_NAME" VARCHAR2(30 BYTE), 
	"SOURCE_OBJECT_TYPE" VARCHAR2(5 BYTE) DEFAULT 'TABLE', 
	"SAS_LIB_REF" VARCHAR2(30 BYTE), 
	"PK_COLUMN_NAMES" CLOB, 
	"NK_COLUMN_NAMES" CLOB, 
	"EXCLUDED_COLUMNS" CLOB, 
	"LOAD_PATTERN_NAME" VARCHAR2(30 BYTE) DEFAULT 'FULLCOMPARISON', 
	"SENSITIVE_DATA_FLAG" VARCHAR2(64 BYTE), 
	"RETENTION_KEY" NUMBER(10,0), 
	"CUSTOM_SQL" CLOB, 
	"CHANGE_CAPTURE_TIMESTAMP_COLUMN" VARCHAR2(4000 BYTE), 
	"HISTORY_LOADED_FROM_TDW" VARCHAR2(1 BYTE), 
	"HISTORY_TYPE" VARCHAR2(5 BYTE), 
	"EFFECTIVE_FROM_TIMESTAMP_COLUMN" VARCHAR2(4000 BYTE), 
	"EFFECTIVE_TO_TIMESTAMP_COLUMN" VARCHAR2(4000 BYTE), 
	"EFFECTIVE_TIMESTAMP_GRAIN" VARCHAR2(30 BYTE), 
	"PURGE_GRAIN" VARCHAR2(30 BYTE), 
	"DUPLICATION_TIMESTAMP_GRAIN" VARCHAR2(30 BYTE), 
	"CREATED_DATE" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(10 BYTE), 
	"LAST_UPDATE_TIME" TIMESTAMP (6)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"   NO INMEMORY 
 LOB ("PK_COLUMN_NAMES") STORE AS SECUREFILE (
  TABLESPACE "LOAD_CONTROL_DATA" ENABLE STORAGE IN ROW CHUNK 8192
  NOCACHE LOGGING  NOCOMPRESS  KEEP_DUPLICATES 
  STORAGE(INITIAL 106496 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) 
 LOB ("NK_COLUMN_NAMES") STORE AS SECUREFILE (
  TABLESPACE "LOAD_CONTROL_DATA" ENABLE STORAGE IN ROW CHUNK 8192
  NOCACHE LOGGING  NOCOMPRESS  KEEP_DUPLICATES 
  STORAGE(INITIAL 106496 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) 
 LOB ("EXCLUDED_COLUMNS") STORE AS SECUREFILE (
  TABLESPACE "LOAD_CONTROL_DATA" ENABLE STORAGE IN ROW CHUNK 8192
  NOCACHE LOGGING  NOCOMPRESS  KEEP_DUPLICATES 
  STORAGE(INITIAL 106496 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) 
 LOB ("CUSTOM_SQL") STORE AS SECUREFILE (
  TABLESPACE "LOAD_CONTROL_DATA" ENABLE STORAGE IN ROW CHUNK 8192
  NOCACHE LOGGING  NOCOMPRESS  KEEP_DUPLICATES 
  STORAGE(INITIAL 106496 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) ;
  
  
  CREATE TABLE "LCF"."OBJECT_RUN" 
   (	"OBJECT_RUN_KEY" NUMBER(10,0), 
	"OBJECT_NAME" VARCHAR2(30 BYTE), 
	"OBJECT_KEY" NUMBER(10,0), 
	"START_TIME" TIMESTAMP (6), 
	"END_TIME" TIMESTAMP (6), 
	"STATUS" VARCHAR2(512 BYTE), 
	"STATUS_MESSAGE" VARCHAR2(4000 BYTE), 
	"RECORDS_READ" NUMBER(10,0), 
	"RECORDS_WRITTEN" NUMBER(10,0), 
	"OBJECT_LOG_NAME" VARCHAR2(2048 BYTE), 
	"OBJECT_PRG_NAME" VARCHAR2(2048 BYTE), 
	"PREV_HIGH_WATER_MARK_VALUE" TIMESTAMP (6), 
	"HIGH_WATER_MARK_VALUE" TIMESTAMP (6), 
	"LOAD_PATTERN_NAME" VARCHAR2(30 BYTE), 
	"TASK1" VARCHAR2(50 BYTE), 
	"TASK1_START_TIME" TIMESTAMP (6), 
	"TASK1_END_TIME" TIMESTAMP (6), 
	"TASK2" VARCHAR2(50 BYTE), 
	"TASK2_START_TIME" TIMESTAMP (6), 
	"TASK2_END_TIME" TIMESTAMP (6), 
	"TASK3" VARCHAR2(50 BYTE), 
	"TASK3_START_TIME" TIMESTAMP (6), 
	"TASK3_END_TIME" TIMESTAMP (6), 
	"TASK4" VARCHAR2(50 BYTE), 
	"TASK4_START_TIME" TIMESTAMP (6), 
	"TASK4_END_TIME" TIMESTAMP (6), 
	"TASK5" VARCHAR2(50 BYTE), 
	"TASK5_START_TIME" TIMESTAMP (6), 
	"TASK5_END_TIME" TIMESTAMP (6), 
	"TASK6" VARCHAR2(50 BYTE), 
	"TASK6_START_TIME" TIMESTAMP (6), 
	"TASK6_END_TIME" TIMESTAMP (6), 
	"TASK7" VARCHAR2(50 BYTE), 
	"TASK7_START_TIME" TIMESTAMP (6), 
	"TASK7_END_TIME" TIMESTAMP (6), 
	"TASK8" VARCHAR2(50 BYTE), 
	"TASK9" VARCHAR2(50 BYTE), 
	"TASK10" VARCHAR2(50 BYTE), 
	"TASK8_START_TIME" TIMESTAMP (6), 
	"TASK9_START_TIME" TIMESTAMP (6), 
	"TASK10_START_TIME" TIMESTAMP (6), 
	"TASK8_END_TIME" TIMESTAMP (6), 
	"TASK9_END_TIME" TIMESTAMP (6), 
	"TASK10_END_TIME" TIMESTAMP (6), 
	 CONSTRAINT "OBJECT_RUN_PK" PRIMARY KEY ("OBJECT_RUN_KEY")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"   NO INMEMORY ;
  
  
  
  CREATE TABLE "LCF"."RETENTION_PERIOD" 
   (	"RETENTION_KEY" NUMBER(10,0), 
	"RETENTION_NUM_DAYS" NUMBER(10,0), 
	 CONSTRAINT "RETENTION_PERIOD_PK" PRIMARY KEY ("RETENTION_KEY")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"   NO INMEMORY ;
  
  
  
  CREATE TABLE "LCF"."SUB_DOMAIN" 
   (	"PRIMARY_DOMAIN_KEY" NUMBER(10,0), 
	"SUB_DOMAIN_KEY" NUMBER(10,0), 
	"SUB_DOMAIN_NAME" VARCHAR2(100 BYTE), 
	 CONSTRAINT "DOMAIN_SUB_DOMAIN_FK" FOREIGN KEY ("PRIMARY_DOMAIN_KEY")
	  REFERENCES "LCF"."DOMAIN" ("PRIMARY_DOMAIN_KEY") DEFERRABLE ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"   NO INMEMORY ;



  CREATE TABLE "LCF"."SYSTEM_SCHEMA" 
   (	"SYSTEM_SCHEMA_KEY" NUMBER(10,0) NOT NULL ENABLE, 
	"SYSTEM_NAME" VARCHAR2(30 BYTE), 
	"SYSTEM_TYPE" VARCHAR2(30 BYTE), 
	"SCHEMA_NAME" VARCHAR2(30 BYTE), 
	"SAS_LIB_REF" VARCHAR2(30 BYTE), 
	 CONSTRAINT "SYSTEM_SCHEMA_PK" PRIMARY KEY ("SYSTEM_SCHEMA_KEY")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA"   NO INMEMORY ;

  CREATE UNIQUE INDEX "LCF"."SYSTEM_SCHEMA_UK" ON "LCF"."SYSTEM_SCHEMA" ("SYSTEM_NAME", "SYSTEM_TYPE", "SCHEMA_NAME") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOAD_CONTROL_DATA" ;

  CREATE OR REPLACE EDITIONABLE TRIGGER "LCF"."TRG_SYSTEM_SCHEMA_KEY" 
BEFORE INSERT ON LCF.SYSTEM_SCHEMA
FOR EACH ROW
BEGIN
	SELECT seq_SYSTEM_SCHEMA_KEY.nextval
		INTO :NEW.SYSTEM_SCHEMA_KEY
		FROM DUAL;
END;
/
ALTER TRIGGER "LCF"."TRG_SYSTEM_SCHEMA_KEY" ENABLE;




  CREATE TABLE "LCF"."SYSTEM_SCHEMA_HIST" 
   (	"SYSTEM_SCHEMA_KEY" NUMBER NOT NULL ENABLE, 
	"SYSTEM_NAME" VARCHAR2(30 BYTE), 
	"SYSTEM_TYPE" VARCHAR2(30 BYTE), 
	"SCHEMA_NAME" VARCHAR2(30 BYTE), 
	"SAS_LIB_REF" VARCHAR2(30 BYTE), 
	"LAST_UPDATE_TIME" TIMESTAMP (6)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "LOAD_CONTROL_DATA"   NO INMEMORY ;



 
/*-------------------------------------------------------------------------------------------------------*/