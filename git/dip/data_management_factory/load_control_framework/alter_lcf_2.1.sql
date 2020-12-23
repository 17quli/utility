/***********************************************************************************************************
			lcf2.1.sql
				
			This script contains all the DDL changes required for rebuilding the LCF.OBJECTs to migrate object registration from the Excel sheet to the Oracle database, 
			general tidy up, Release 2.1 changes.
				
			When the script is run it will prompt for two parameters.
            For &env - supply test or prod 
            For &today - supply 20200214 (yyyymmdd) e.g. current date

		    11/02/20 ird0sxd Minor updates to LCF tables and trigger.
			17/2/2020 ird0dxm comment out revoke statements from load_control. 
			18/02/20 ird0sxd Added RO_LCF_ROLE grants so that ro_lcf can read lcf tables
			18/02/20 ird0sxd Comment out trigger for extract_object which goes and update the audit name, date fields for all rows.
      20/02/20 ird0dxm Change date format to yyyymmdd and any changes necessary for prod release.

************************************************************************************************************/


/* --------------------------------------------------------------------------------------------------------------------------------------------------*/
 EXTRACT_OBJECT  changes
/* --------------------------------------------------------------------------------------------------------------------------------------------------*/
DROP TABLE LCF.EXTRACT_OBJECT_NEW;
CREATE TABLE LCF.EXTRACT_OBJECT_NEW(
SYSTEM_NAME                              VARCHAR2(30) NOT NULL , 
SYSTEM_TYPE                              VARCHAR2(30) NOT NULL ,
SCHEMA_NAME                              VARCHAR2(30) NOT NULL ,
SOURCE_OBJECT_NAME                       VARCHAR2(30) NOT NULL ,
TARGET_OBJECT_SHORT_NAME                 VARCHAR2(25)   ,
SAS_LIB_REF                              VARCHAR2(30)   ,
PK_COLUMN_NAMES                          CLOB           ,
NK_COLUMN_NAMES                          CLOB          ,
EXCLUDED_COLUMNS                         CLOB           ,
TARGET_DB                                VARCHAR2(30)   ,
SENSITIVE_DATA_FLAG                      VARCHAR2(64)   ,--NOT NULL ,
PII_COLUMNS                              CLOB           ,
DATA_DOMAIN                              CLOB           ,
RETENTION_PERIOD                         NUMBER         ,
CUSTOM_SQL                               CLOB           ,
HISTORY_LOADED_FROM_TDW                  VARCHAR2(1)    ,
ROW_COUNT                                NUMBER         ,
LOAD_PATTERN_NAME                        VARCHAR2(30)   ,
HISTORY_TYPE                             VARCHAR2(5)    ,
CHANGE_CAPTURE_TIMESTAMP_COLUMN          VARCHAR2(4000) ,
EFFECTIVE_FROM_TIMESTAMP_COLUMN          VARCHAR2(4000) ,
EFFECTIVE_TO_TIMESTAMP_COLUMN            VARCHAR2(4000) ,
EFFECTIVE_TIMESTAMP_GRAIN                VARCHAR2(30)   ,
PURGE_GRAIN                              VARCHAR2(30)   ,
DUPLICATION_TIMESTAMP_GRAIN              VARCHAR2(30)   ,
LAYER                                    VARCHAR2(15)   ,
COL1                                     VARCHAR2(10)   ,
COL2                                     VARCHAR2(10)   ,
COL3                                     VARCHAR2(10)   ,
SYSTEM_SCHEMA_KEY                        NUMBER         ,
OBJECT_KEY                               NUMBER         ,
RETENTION_KEY                            NUMBER         ,
PRIMARY_DOMAIN_KEY                       NUMBER         ,
SUB_DOMAIN_KEY                           NUMBER         ,
GENERIC_SYSTEM_NAME                      VARCHAR2(10)    ,
DATA_DOMAIN_EXPANDED_KEY                 NUMBER         ,
CREATED_BY                               VARCHAR2(10)   ,
CREATED_ON                               TIMESTAMP(6)   ,
UPDATED_BY                               VARCHAR2(10),
UPDATED_ON                               TIMESTAMP(6) );


INSERT INTO  LCF.EXTRACT_OBJECT_NEW
(SYSTEM_NAME                             , 
SYSTEM_TYPE                              ,
SCHEMA_NAME                              ,
SOURCE_OBJECT_NAME                       ,
TARGET_OBJECT_SHORT_NAME                 ,
SAS_LIB_REF                              ,
PK_COLUMN_NAMES                          ,
NK_COLUMN_NAMES                          ,
EXCLUDED_COLUMNS                         ,
TARGET_DB                                ,
DATA_DOMAIN                              ,
SENSITIVE_DATA_FLAG                      ,
PII_COLUMNS                              ,
RETENTION_PERIOD                         ,
CUSTOM_SQL                               ,
CHANGE_CAPTURE_TIMESTAMP_COLUMN          ,
HISTORY_LOADED_FROM_TDW                  ,
ROW_COUNT                                ,
LOAD_PATTERN_NAME                        ,
HISTORY_TYPE                             ,
EFFECTIVE_FROM_TIMESTAMP_COLUMN          ,
EFFECTIVE_TO_TIMESTAMP_COLUMN            ,
EFFECTIVE_TIMESTAMP_GRAIN                ,
PURGE_GRAIN                              ,
DUPLICATION_TIMESTAMP_GRAIN              ,
LAYER                                     ,
COL1                                     ,
COL2                                     ,
COL3                                     ,
SYSTEM_SCHEMA_KEY                        ,
OBJECT_KEY                               ,
RETENTION_KEY                            ,
PRIMARY_DOMAIN_KEY                       ,
SUB_DOMAIN_KEY                           ,
GENERIC_SYSTEM_NAME                      ,
DATA_DOMAIN_EXPANDED_KEY                 ,
CREATED_BY                               ,
CREATED_ON                             ,
UPDATED_BY                               ,
UPDATED_ON                             )
SELECT 
SYSTEM_NAME                             , 
SYSTEM_TYPE                              ,
SCHEMA_NAME                              ,
SOURCE_OBJECT_NAME                       ,
TARGET_OBJECT_SHORT_NAME                 ,
SAS_LIB_REF                              ,
PK_COLUMN_NAMES                          ,
NK_COLUMN_NAMES                          ,
EXCLUDED_COLUMNS                         ,
TARGET_DB                                ,
DATA_DOMAIN                              ,
SENSITIVE_DATA_FLAG                      ,
NULL AS PII_COLUMNS                              ,
RETENTION_PERIOD                         ,
CUSTOM_SQL                               ,
CHANGE_CAPTURE_TIMESTAMP_COLUMN          ,
HISTORY_LOADED_FROM_TDW                  ,
NULL AS ROW_COUNT                                ,
LOAD_PATTERN_NAME                        ,
HISTORY_TYPE                             ,
EFFECTIVE_FROM_TIMESTAMP_COLUMN          ,
EFFECTIVE_TO_TIMESTAMP_COLUMN            ,
EFFECTIVE_TIMESTAMP_GRAIN                ,
PURGE_GRAIN                              ,
DUPLICATION_TIMESTAMP_GRAIN              ,
'RAW'                                     ,
NULL                                     ,
NULL                                     ,
NULL                                     ,
SYSTEM_SCHEMA_KEY                        ,
OBJECT_KEY                               ,
RETENTION_KEY                            ,
PRIMARY_DOMAIN_KEY                       ,
SUB_DOMAIN_KEY                           ,
GENERIC_SYSTEM_NAME                      ,
DATA_DOMAIN_EXPANDED_KEY                 ,
NULL AS CREATED_BY                       ,
NULL AS CREATED_ON                       ,
NULL AS UPDATED_BY                       ,
NULL AS UPDATED_ON                       
FROM EXTRACT_OBJECT;

COMMIT;

select count(*) from extract_object;

ALTER TABLE LCF.EXTRACT_OBJECT 
DROP CONSTRAINT EXTRACT_OBJECT_PK;

RENAME  EXTRACT_OBJECT
TO EXTRACT_OBJECT_&today;

RENAME EXTRACT_OBJECT_NEW 
TO EXTRACT_OBJECT;


ALTER TABLE LCF.EXTRACT_OBJECT 
ADD CONSTRAINT  EXTRACT_OBJECT_PK 
PRIMARY KEY (SYSTEM_NAME,SYSTEM_TYPE,SCHEMA_NAME,SOURCE_OBJECT_NAME);

select * from extract_object

--ALTER TABLE EXTRACT_OBJECT MODIFY DATA_DOMAIN NULL;
--ALTER TABLE EXTRACT_OBJECT MODIFY LOAD_PATTERN_NAME NULL;
--ALTER TABLE EXTRACT_OBJECT MODIFY NK_COLUMN_NAMES NULL;
  
ALTER TABLE LCF.EXTRACT_OBJECT MODIFY CREATED_BY DEFAULT sys_context( 'userenv', 'os_user' ) ;  
ALTER TABLE LCF.EXTRACT_OBJECT MODIFY UPDATED_BY DEFAULT sys_context( 'userenv', 'os_user' ) ;
ALTER TABLE LCF.EXTRACT_OBJECT MODIFY CREATED_ON DEFAULT sysdate ;  


ALTER TABLE  LCF.EXTRACT_OBJECT
ADD  CONSTRAINT LOAD_PATTERN_CK 
CHECK (LOAD_PATTERN_NAME IN ('FULLREPLACEMENT','FULLCOMPARISON','CHANGEEXTRACT','BATCHEXTRACT','EVENTEXTRACT'));


--DROP TRIGGER TRG_EXTRACT_OBJECT;
-- This trigger change will be deferred until later. If the system_schema_key, source_object_name is not specified during the object registration, this trigger updates audit fields to the current username/datestamp.
--CREATE OR REPLACE TRIGGER TRG_EXTRACT_OBJECT
--BEFORE UPDATE ON lcf.EXTRACT_OBJECT
--FOR EACH ROW
--BEGIN
--    SELECT SYSTIMESTAMP INTO :NEW.UPDATED_ON from dual;
--    SELECT sys_context( 'userenv', 'os_user' ) INTO :NEW.UPDATED_BY FROM DUAL;
--END;
--/
/* --------------------------------------------------------------------------------------------------------------------------------------------------*/

SYSTEM_SCHEMA and SYSTEM_SCHEMA_HIST  changes

/* --------------------------------------------------------------------------------------------------------------------------------------------------*/
ALTER TABLE LCF.SYSTEM_SCHEMA 
ADD GENERIC_SYSTEM_NAME VARCHAR2(10);

CREATE TABLE SYSTEM_SCHEMA_&today 
AS SELECT * FROM SYSTEM_SCHEMA;

RENAME SYSTEM_SCHEMA_HIST 
TO SYSTEM_SCHEMA_HIST_&today;

CREATE TABLE LCF.SYSTEM_SCHEMA_HIST (
SYSTEM_SCHEMA_KEY         NUMBER(10) NOT NULL,  
	SYSTEM_NAME           VARCHAR2(30),    
	SYSTEM_TYPE           VARCHAR2(30),    
	SCHEMA_NAME           VARCHAR2(30),   
	SAS_LIB_REF           VARCHAR2(30), 
  GENERIC_SYSTEM_NAME     VARCHAR2(10),
  LAST_UPDATE_TIME        TIMESTAMP
  );
  
-- Recreate LCF.TRG_SYSTEM_HIST
CREATE OR REPLACE TRIGGER  LCF.TRG_SCHEMA_HIST
AFTER  
INSERT OR UPDATE ON LCF.SYSTEM_SCHEMA
FOR EACH ROW 
BEGIN
IF INSERTING THEN 
INSERT INTO LCF.SYSTEM_SCHEMA_HIST
( SYSTEM_SCHEMA_KEY      ,  
	SYSTEM_NAME            ,
	SYSTEM_TYPE            , 
	SCHEMA_NAME            , 
	SAS_LIB_REF            ,
  GENERIC_SYSTEM_NAME    ,
  LAST_UPDATE_TIME               
  )
VALUES
  (
  :new.SYSTEM_SCHEMA_KEY      ,  
	:new.SYSTEM_NAME            ,
	:new.SYSTEM_TYPE            , 
	:new.SCHEMA_NAME            , 
	:new.SAS_LIB_REF            ,
  :new.GENERIC_SYSTEM_NAME    ,
  sysdate );
  END IF;
  IF UPDATING THEN 
  INSERT INTO LCF.SYSTEM_SCHEMA_HIST
  ( 
  SYSTEM_SCHEMA_KEY      ,  
	SYSTEM_NAME            ,
	SYSTEM_TYPE            , 
	SCHEMA_NAME            , 
	SAS_LIB_REF            ,
  GENERIC_SYSTEM_NAME    ,
  LAST_UPDATE_TIME               )
  VALUES 
  (
  :old.SYSTEM_SCHEMA_KEY      ,  
	:old.SYSTEM_NAME           , 
	:old.SYSTEM_TYPE            ,
	:old.SCHEMA_NAME            , 
	:old.SAS_LIB_REF            ,
  :old.GENERIC_SYSTEM_NAME    ,
 sysdate);
END IF;
END;
/

-- Update generic system_name
UPDATE SYSTEM_SCHEMA SET GENERIC_SYSTEM_NAME=CASE  WHEN SAS_LIB_REF='STRSTC' THEN 'STC'
                                 WHEN SAS_LIB_REF='STRAPP' THEN 'APP'
                                 WHEN SAS_LIB_REF='STRREF' THEN 'REF'
                                 WHEN SAS_LIB_REF='STRWRQ' THEN 'WRQ'
                                 WHEN SAS_LIB_REF='STRFRD' THEN 'FRD'
                                 WHEN SAS_LIB_REF='STRWEB' THEN 'WEB'
                                 WHEN SAS_LIB_REF='PEDWDSS' THEN 'PDSS'
                                 WHEN SAS_LIB_REF='PTDW'   THEN 'PTDW'
                                 WHEN SAS_LIB_REF='EDWDSS' THEN 'DSS'
                                 WHEN SAS_LIB_REF='EDWTDW' THEN 'TDW'
                                 WHEN SAS_LIB_REF='IMPRAW' AND SCHEMA_NAME='INTERMEDIATE' THEN 'INT'
                                 WHEN SAS_LIB_REF='IMPRFN'AND SCHEMA_NAME='REFINED' THEN NULL
                                 WHEN SAS_LIB_REF='IMPRAW' AND SCHEMA_NAME='RAW' THEN NULL
                                 ELSE SYSTEM_NAME END;
                                 
COMMIT;

/* --------------------------------------------------------------------------------------------------------------------------------------------------*/

LCF.DIP_CONFIG changes

/* --------------------------------------------------------------------------------------------------------------------------------------------------*/
ALTER TABLE LCF.DIP_CONFIG
MODIFY KEY   VARCHAR2(30);
RENAME LCF_LOG to LCF_LOG_&today;


/* --------------------------------------------------------------------------------------------------------------------------------------------------*/

OBJECT and OBJECT_HIST changes

/* --------------------------------------------------------------------------------------------------------------------------------------------------*/

-- Add new column for OBJECT table for journaling and add constraint to check the values
ALTER TABLE OBJECT 
ADD INGESTION_MODE VARCHAR2(10 ) DEFAULT 'ALL';
ALTER TABLE OBJECT 
ADD CONSTRAINT ING_MODE CHECK (INGESTION_MODE IN ('JNL', 'ALL', 'ING'));

RENAME OBJECT_HIST TO OBJECT_HIST_&today;


CREATE TABLE OBJECT_&today 
AS SELECT * FROM OBJECT;

  
  CREATE TABLE LCF.OBJECT_HIST 
   (	
    OBJECT_KEY NUMBER(10) NOT NULL ENABLE, 
	SYSTEM_SCHEMA_KEY NUMBER(10) NOT NULL ENABLE, 
	TARGET_OBJECT_NAME VARCHAR2(30 ), 
	OBJECT_SHORT_NAME VARCHAR2(25 ), 
	TARGET_DB VARCHAR2(30 ) DEFAULT '&env'||'_raw', 
	SOURCE_OBJECT_NAME VARCHAR2(30), 
	SOURCE_OBJECT_TYPE VARCHAR2(5)  DEFAULT 'TABLE', 
	SAS_LIB_REF VARCHAR2(30 ), 
	PK_COLUMN_NAMES CLOB, 
	NK_COLUMN_NAMES CLOB, 
	EXCLUDED_COLUMNS CLOB, 
	LOAD_PATTERN_NAME VARCHAR2(30 ) DEFAULT 'FULLCOMPARISON', 
	SENSITIVE_DATA_FLAG VARCHAR2(1 ), 
	RETENTION_KEY NUMBER(10), 
	CUSTOM_SQL CLOB, 
	CHANGE_CAPTURE_TIMESTAMP_COLUMN VARCHAR2(4000 ), 
	HISTORY_LOADED_FROM_TDW VARCHAR2(1 ), 
	HISTORY_TYPE VARCHAR2(5 ), 
	EFFECTIVE_FROM_TIMESTAMP_COLUMN VARCHAR2(4000 ), 
	EFFECTIVE_TO_TIMESTAMP_COLUMN VARCHAR2(4000 ), 
	EFFECTIVE_TIMESTAMP_GRAIN VARCHAR2(30 ), 
	PURGE_GRAIN VARCHAR2(30 ), 
	DUPLICATION_TIMESTAMP_GRAIN VARCHAR2(30), 
	CREATED_DATE TIMESTAMP (6), 
	CREATED_BY VARCHAR2(10 ), 
	BATCH_NAME VARCHAR2(15 ), 
	CAS_UPLOAD VARCHAR2(1 ) DEFAULT 'N', 
	LAYER VARCHAR2(15)  DEFAULT 'RAW', 
	INGESTION_MODE VARCHAR2(10 ) DEFAULT 'ALL',
    LAST_UPDATE_TIME   TIMESTAMP  );

  

CREATE OR REPLACE TRIGGER  LCF.TRG_OBJECT_HIST
AFTER  
INSERT OR UPDATE ON LCF.OBJECT 
FOR EACH ROW 
BEGIN
IF INSERTING THEN 
INSERT INTO LCF.OBJECT_HIST
( 
OBJECT_KEY , 
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
EFFECTIVE_TO_TIMESTAMP_COLUMN ,
PURGE_GRAIN  ,
DUPLICATION_TIMESTAMP_GRAIN  ,
BATCH_NAME   , 
CAS_UPLOAD   , 
LAYER   ,
INGESTION_MODE                     
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
  :new.EFFECTIVE_TO_TIMESTAMP_COLUMN,
  :new.PURGE_GRAIN                             ,
  :new.DUPLICATION_TIMESTAMP_GRAIN             ,
  :new.BATCH_NAME                              , 
  :new.CAS_UPLOAD                              , 
  :new.LAYER                                   ,
  :new.INGESTION_MODE                     );
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
    EFFECTIVE_TO_TIMESTAMP_COLUMN,
    PURGE_GRAIN                             ,
    DUPLICATION_TIMESTAMP_GRAIN             ,
    BATCH_NAME                              , 
    CAS_UPLOAD                              , 
    LAYER                                   ,
    INGESTION_MODE                        )
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
  :old.EFFECTIVE_TO_TIMESTAMP_COLUMN,
  :old.PURGE_GRAIN                           ,
  :old.DUPLICATION_TIMESTAMP_GRAIN             ,
  :old.BATCH_NAME                              , 
  :old.CAS_UPLOAD                              , 
  :old.LAYER                                   ,
  :old.INGESTION_MODE                           );
END IF;
END;
/


/* --------------------------------------------------------------------------------------------------------------------------------------------------*/

Cleanup LOAD Control privileges

/* --------------------------------------------------------------------------------------------------------------------------------------------------*/
-

-- Revoke permissions from LOAD_CONTROL as it is not being used.
-- Commented out on 17/2/2020 by ird0dxm. 

--REVOKE ALL ON OBJECT 
--FROM LOAD_CONTROL;
--REVOKE ALL ON SYSTEM_SCHEMA 
--FROM LOAD_CONTROL;
--REVOKE ALL ON OBJECT_RUN 
--FROM LOAD_CONTROL;
--REVOKE ALL ON DIP_OBJECT_RUN
--FROM LOAD_CONTROL;


--REVOKE  ALL  ON  Z_TEST$_P1 
--FROM  LOAD_CONTROL;
--REVOKE  ALL  ON   Z_TEST$_P3 
--FROM  LOAD_CONTROL;
--REVOKE ALL ON OBJECT 
--FROM  LOAD_CONTROL;

--REVOKE  SELECT ON lcf.seq_object_run_key 
--FROM  LOAD_CONTROL;
--REVOKE  ALL on lcf.object_run
--FROM  LOAD_CONTROL;
--REVOKE SELECT ON LCF.SYSTEM_SCHEMA 
--FROM  LOAD_CONTROL;



/* --------------------------------------------------------------------------------------------------------------------------------------------------*/

Regrant LCF privileges

/* --------------------------------------------------------------------------------------------------------------------------------------------------*/
-


-- For tables that got rebuilt, we need to grant privileges again


GRANT ALL ON  OBJECT_RUN TO LCF_ROLE;
GRANT SELECT ON OBJECT TO LCF_ROLE;
GRANT SELECT ON SYSTEM_SCHEMA TO LCF_ROLE;
GRANT ALL ON  DIP_OBJECT_RUN TO LCF_ROLE;
GRANT SELECT ON seq_object_run_key TO LCF_ROLE;
GRANT SELECT ON  seq_dip_object_run_key TO LCF_ROLE;
GRANT SELECT ON V_DOMAIN_INFO TO LCF_ROLE;
GRANT SELECT ON DOMAIN_BRIDGE TO LCF_ROLE;

--RO_LF_ROLE is granted to ro_lcf;
GRANT SELECT ON DIP_CONFIG TO RO_LCF_ROLE;
GRANT SELECT ON SYSTEM_SCHEMA TO RO_LCF_ROLE;
GRANT SELECT ON OBJECT TO RO_LCF_ROLE;
GRANT SELECT ON OBJECT_HIST TO RO_LCF_ROLE;
GRANT SELECT ON OBJECT_RUN TO LCF_ROLE; 
GRANT SELECT ON DIP_OBJECT_RUN TO LCF_ROLE;
GRANT SELECT ON RETENTION_PERIOD TO LCF_ROLE;
GRANT SELECT ON DOMAIN TO LCF_ROLE;
GRANT SELECT ON SUB_DOMAIN TO LCF_ROLE;


/* --------------------------------------------------------------------------------------------------------------------------------------------------*/

Update metadata for P4 tables

/* --------------------------------------------------------------------------------------------------------------------------------------------------*/
-

UPDATE EXTRACT_OBJECT
SET LOAD_PATTERN_NAME='BATCHEXTRACT',
NK_COLUMN_NAMES='FI64NAMEKEY,FLNGVER'
WHERE SOURCE_OBJECT_NAME='TBLNAMERECORD';

UPDATE EXTRACT_OBJECT
SET LOAD_PATTERN_NAME='BATCHEXTRACT',
NK_COLUMN_NAMES='FI64ADDRESSKEY,FLNGVER'
WHERE SOURCE_OBJECT_NAME='TBLADDRESSRECORD';

UPDATE EXTRACT_OBJECT
SET LOAD_PATTERN_NAME='FULLREPLACEMENT'
WHERE SOURCE_OBJECT_NAME='OBJECT_RUN';

COMMIT;
/* --------------------------------------------------------------------------------------------------------------------------------------------------*/

The end

/* --------------------------------------------------------------------------------------------------------------------------------------------------*/
-

