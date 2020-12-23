/*****************************************************************************************************************
-- ird0sxd 05/04/20 Initial script. This script contains the LCF changes requierd to be implemented to cater for new functionality/enhance existing functionality.
-- ird0sxd 07/04/20 Updated name of the LCF.LARGE_TABLE_STRATIFY_LEVELS tables
-- ird0sxd 09/04/20 Added code to decommission PRIMARY_DOMAIN,SUB_DOMIAN,DOMAIN_BRIDGE. Create new DATA_DOMAIN, DATA_DOMAIN_OBJECT_REL tables.
-- ird0sxd 14/04/20 updated the where clause for pre_insert trigger on lcf.object to update only one row (not the entire table)
*****************************************************************************************************************/


/**********************************************************************************************
TASK
**********************************************************************************************/
-- Create task table
CREATE TABLE TASK 
(
TASK_KEY                          NUMBER(10) NOT NULL,
OBJECT_KEY                        NUMBER(10) NOT NULL,     
SYSTEM_SCHEMA_KEY                 NUMBER(10) NOT NULL, 
TARGET_OBJECT_NAME                VARCHAR2(30), 
REQUESTOR_EMAIL                   VARCHAR2(50),
BATCH_NUM                         NUMBER(5),
TASK_TYPE                         VARCHAR2(15) ,
DESCRIPTION                       VARCHAR2(100),
DEVELOPER_DIS                     VARCHAR2(20),   
DEV_CMPLTD                        VARCHAR2(2),
DEV_PRIORITY                      NUMBER(3),    
DEV_VALIDATION_CMPLTD             VARCHAR2(2),   
PEER_REVIEWER                     VARCHAR2(20),  
PEER_REVIEW_CMPLTD                VARCHAR2(1) , 
MIGRATED_TO_TEST                  VARCHAR2(2) ,
FULL_TEST_RUN_CMPLTD              VARCHAR2(2) ,
MIGRATED_TO_PROD                  VARCHAR2(2) ,
PROD_JOB_SCHEDULED                VARCHAR2(2),
COMMENTS                          VARCHAR2(2000),
CREATED_BY                        VARCHAR2(10) ,   
CREATED_ON                        TIMESTAMP(6) ,  
UPDATED_BY                        VARCHAR2(10) , 
UPDATED_ON                        TIMESTAMP(6));    

-- Drop LCF.seq_TASK_KEY if it exists

/**********************************************************************************************
seq_TASK_KEY
**********************************************************************************************/
DROP SEQUENCE LCF.seq_TASK_KEY ;
-- Create LCF.seq_TASK_KEY
CREATE SEQUENCE LCF.seq_TASK_KEY START WITH 1;

-- Add primary constraint and other check constraints to TASK table
ALTER TABLE TASK ADD CONSTRAINT TASK_PK                  PRIMARY KEY (TASK_KEY);
ALTER TABLE TASK add CONSTRAINT TASK_TYPE_CK    CHECK (TASK_TYPE IN ('STRUCTURECHANGE', 'BUGFIX', 'FASTCOPY','PATTERNCHANGE','JOBCHANGE','OTHER','DATAFIX'));
ALTER TABLE TASK ADD CONSTRAINT DEV_CMPLTD_CK            CHECK (DEV_CMPLTD IN ('Y','N','NA','S'));
ALTER TABLE TASK ADD CONSTRAINT DEV_VALIDATION_CMPLTD_CK CHECK (DEV_VALIDATION_CMPLTD IN ('Y','N','NA'));
ALTER TABLE TASK ADD CONSTRAINT PEER_REVIEW_CMPLTD_CK    CHECK (PEER_REVIEW_CMPLTD IN ('Y','N','NA','S','X'));
ALTER TABLE TASK ADD CONSTRAINT MIGRATED_TO_TEST_CK      CHECK (MIGRATED_TO_TEST IN ('Y','N','NA'));
ALTER TABLE TASK ADD CONSTRAINT FULL_TEST_RUN_CMPLTD_CK  CHECK (FULL_TEST_RUN_CMPLTD IN ('Y','N','NA'));
ALTER TABLE TASK ADD CONSTRAINT MIGRATED_TO_PROD_CK      CHECK (MIGRATED_TO_PROD IN ('Y','N','NA'));
ALTER TABLE TASK ADD CONSTRAINT PROD_JOB_SCHEDULED_CK    CHECK (PROD_JOB_SCHEDULED IN ('Y','N','NA'));

-- Modify TASK table default values for CREATED_BY, CREATED_ON
ALTER TABLE TASK 
MODIFY CREATED_BY 
DEFAULT SYS_CONTEXT( 'USERENV', 'OS_USER' ) ;  
ALTER TABLE TASK 
MODIFY CREATED_ON DEFAULT SYSDATE ;  

/**********************************************************************************************
TRG_TASK_PRE_INSERT
***********************************************************************************************/
-- When we enter the TARGET_OBJECT_NAME and save it this trigger validates whether the TARGET_OBJECT_NAME exists in LCF.OBJECT.
-- If not it will fail
CREATE OR REPLACE TRIGGER TRG_TASK_PRE_INSERT
BEFORE INSERT ON LCF.TASK
FOR EACH ROW
DECLARE  
   lv_rowcount          NUMBER(5):=0;
   lv_system_schema_key NUMBER(5);
   lv_object_key        NUMBER(5);
   MISSING_TARGET       EXCEPTION;
BEGIN
  NULL;
   
   
   SELECT COUNT(*)
   INTO lv_rowcount
   FROM OBJECT
   WHERE TARGET_OBJECT_NAME=:NEW.TARGET_OBJECT_NAME;
 
  IF lv_rowcount<1 THEN 
   RAISE MISSING_TARGET;
   END IF;
  
  SELECT SYSTEM_SCHEMA_KEY,OBJECT_KEY
  INTO lv_system_schema_key,lv_object_key
  FROM OBJECT WHERE TARGET_OBJECT_NAME=:NEW.TARGET_OBJECT_NAME;
   
  :NEW.SYSTEM_SCHEMA_KEY:=lv_system_schema_key;
  :NEW.OBJECT_KEY:=lv_object_key;
   
	SELECT seq_TASK_KEY.nextval
		INTO :NEW.TASK_KEY
		FROM DUAL;
 
 EXCEPTION
     WHEN MISSING_TARGET THEN
        RAISE_APPLICATION_ERROR (-20000,' Target table not found in LCF.OBJECT aborting ...' ); 

END;
/
 
/**********************************************************************************************
TRG_TASK_PRE_UPDATE
***********************************************************************************************/
-- This trigger will update the UPDATED_ON, UPDATED_BY columns
CREATE OR REPLACE TRIGGER LCF.TRG_TASK_PRE_UPDATE
BEFORE UPDATE ON LCF.TASK
FOR EACH ROW
BEGIN
    SELECT SYSTIMESTAMP INTO :NEW.UPDATED_ON from dual;
    SELECT sys_context( 'userenv', 'os_user' ) INTO :NEW.UPDATED_BY FROM DUAL;
END;
/


 
/**********************************************************************************************
OBJECT_CONTROL
***********************************************************************************************/
-- Create OBJECT_CONTROL table
CREATE TABLE OBJECT_CONTROL
( 
SYSTEM_SCHEMA_KEY                NUMBER(10) NOT NULL,   
OBJECT_KEY                       NUMBER(10) NOT NULL,  
TARGET_OBJECT_NAME               VARCHAR2(30),
CAS_UPLOAD                       VARCHAR2(1),
INGESTION_MODE                   VARCHAR2(10),   
READ_FROM_PRIMARY                VARCHAR2(1),
STATUS                           VARCHAR2(10) ,
CAS_UPLOAD_ENVIRONMENT           VARCHAR2(20),   
CAS_UPLOAD_LIBRARY               VARCHAR2(20),   
DESCRIPTION                      VARCHAR2(100),
CREATED_BY                       VARCHAR2(10),   
CREATED_ON                       TIMESTAMP(6), 
UPDATE_BY                        VARCHAR2(10),
UPDATED_ON                       TIMESTAMP(6)
);    


-- Add primary key constraint to OBJECT_CONTROL
ALTER TABLE LCF.OBJECT_CONTROL 
ADD CONSTRAINT OBJECT_CONTROL_PK PRIMARY KEY (OBJECT_KEY);

ALTER TABLE OBJECT ADD CONSTRAINT OBJECT_PK  PRIMARY KEY (OBJECT_KEY) ;

ALTER TABLE LCF.OBJECT_CONTROL
    ADD CONSTRAINT OBJECT_OBJECT_CONTROL_FK FOREIGN KEY (OBJECT_KEY )
        REFERENCES LCF.OBJECT ( OBJECT_KEY )
  DEFERRABLE;
  
-- Modify OBJECT_CONTROL table default values for CREATED_BY, CREATED_ON
ALTER TABLE LCF.OBJECT_CONTROL 
MODIFY CREATED_BY DEFAULT SYS_CONTEXT( 'USERENV', 'OS_USER' ) ;  

ALTER TABLE LCF.OBJECT_CONTROL 
MODIFY CREATED_ON DEFAULT SYSDATE ;

-- Initial data load OBJECT_CONTROL from OBJECT table  
INSERT INTO OBJECT_CONTROL
(SYSTEM_SCHEMA_KEY,
 OBJECT_KEY,
 TARGET_OBJECT_NAME,
 CAS_UPLOAD ,
 INGESTION_MODE,
 CREATED_ON,
 CREATED_BY)
SELECT  SYSTEM_SCHEMA_KEY,
OBJECT_KEY, 
TARGET_OBJECT_NAME,
CAS_UPLOAD,
INGESTION_MODE,
SYSDATE,
SYS_CONTEXT( 'USERENV', 'OS_USER' )
FROM OBJECT;

COMMIT; 
/**********************************************************************************************
TRG_OBJECT_CONTROL_PRE_UPDATE
***********************************************************************************************/
-- Thist trigger will populate the UPDATE_BY,UPDATED_ON fields
CREATE OR REPLACE TRIGGER LCF.TRG_OBJECT_CONTROL_PRE_UPDATE
BEFORE UPDATE ON LCF.TASK
FOR EACH ROW
BEGIN
    SELECT SYSTIMESTAMP INTO :NEW.UPDATED_ON from dual;
    SELECT sys_context( 'userenv', 'os_user' ) INTO :NEW.UPDATED_BY FROM DUAL;
END;
/

/**********************************************************************************************
TRG_OBJECT_CONTROL_LOAD
***********************************************************************************************/
-- This trigger will load OBJECT_CONTROL everytime a new row isnerted to OBJECT or updated in OBJECT
CREATE OR REPLACE TRIGGER  LCF.TRG_OBJECT_CONTROL_LOAD
AFTER  
INSERT OR UPDATE ON LCF.OBJECT
 
FOR EACH ROW 
BEGIN
IF INSERTING THEN 
INSERT INTO LCF.OBJECT_CONTROL
( SYSTEM_SCHEMA_KEY      ,  
  OBJECT_KEY,
  TARGET_OBJECT_NAME  )
VALUES
  (
:new.SYSTEM_SCHEMA_KEY      ,  
:new.OBJECT_KEY,
:new.TARGET_OBJECT_NAME   );
END IF;
IF UPDATING THEN 
      UPDATE LCF.OBJECT_CONTROL
       SET TARGET_OBJECT_NAME=:new.TARGET_OBJECT_NAME
       WHERE :old.OBJECT_KEY=OBJECT_CONTROL.OBJECT_KEY;
END IF;

END;
/

 

/**********************************************************************************************
DIP_OBJECT_RUN
***********************************************************************************************/
-- Add new column for DIP_OBJECT_RUN
ALTER TABLE DIP_OBJECT_RUN 
ADD RECORDS_WRITTEN  NUMBER(10)  ; 


/**********************************************************************************************
OBJECT
***********************************************************************************************/
-- Remove BATCH_NAME from OBJECT
ALTER TABLE OBJECT 
DROP COLUMN BATCH_NAME;


/**********************************************************************************************
OBJECT_HIST
***********************************************************************************************/
-- Remove BATCH_NAME from OBJECT_HIST
ALTER TABLE OBJECT_HIST DROP COLUMN BATCH_NAME;

/**********************************************************************************************
TRG_OBJECT_HIST
***********************************************************************************************/
-- Recreate trigger TRG_OBJECT_HIST as we have removed BATCH_NAME

CREATE OR REPLACE TRIGGER  LCF.TRG_OBJECT_HIST
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
  EFFECTIVE_TO_TIMESTAMP_COLUMN ,
  PURGE_GRAIN                             ,
  DUPLICATION_TIMESTAMP_GRAIN             ,
  CAS_UPLOAD                              , 
  LAYER                                   ,
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
:old.CAS_UPLOAD                              , 
:old.LAYER                                   ,
:old.INGESTION_MODE                           );
END IF;
END;




/**********************************************************************************************
--DOMAIN, SUB_DOMAIN, DOMAIN_BRIDGE
***********************************************************************************************/
-- Rename existing DOMAIN,SUB_DOMAIN tables

ALTER TABLE  DOMAIN RENAME       TO DOMAIN_DROP;
ALTER TABLE  SUB_DOMAIN RENAME    TO SUB_DOMAIN_DROP;
ALTER TABLE  DOMAIN_BRIDGE RENAME TO DOMAIN_BRIDGE_DROP;
ALTER TABLE  DATA_DOMAIN_EXPANDED RENAME TO  DATA_DOMAIN_EXPANDED_DROP;

DROP SEQUENCE  LCF.seq_SUB_DOMAIN_KEY;
DROP SEQUENCE  LCF.seq_PRIMARY_DOMAIN_KEY;

CREATE SEQUENCE LCF.seq_DATA_DOMAIN_KEY;

ALTER TABLE SUB_DOMAIN_DROP 
DROP CONSTRAINT SUB_DOMAIN_PK;

/**********************************************************************************************
--DATA_DOMAIN
***********************************************************************************************/
-- Create DATA_DOMAIN
CREATE TABLE DATA_DOMAIN
( 
DATA_DOMAIN_KEY NUMBER(10),
PRIMARY_DOMAIN_NAME VARCHAR2(100),
PRIMARY_DOMAIN_DESCRIPTION VARCHAR2(2000),
SUB_DOMAIN_NAME VARCHAR2(100),
SUB_DOMAIN_DESCRIPTION VARCHAR2(2000));

-- Create Primary key on DATA_DOMAIN
ALTER TABLE DATA_DOMAIN ADD CONSTRAINT 
DATA_DOMAIN_PK PRIMARY KEY (DATA_DOMAIN_KEY);

-- Create unique key on PRIMARY_DOMAIN_NAME,SUB_DOMAIN_NAME
CREATE UNIQUE INDEX DATA_DOMAIN_UK 
ON DATA_DOMAIN (PRIMARY_DOMAIN_NAME,SUB_DOMAIN_NAME);

/**********************************************************************************************
--TRG_DATA_DOMAIN_KEY
***********************************************************************************************/
-- This trigger will populate the DATA_DOMAIN_KEY
CREATE OR REPLACE TRIGGER TRG_DATA_DOMAIN_KEY
BEFORE INSERT ON LCF.DATA_DOMAIN
FOR EACH ROW
BEGIN
	SELECT seq_DATA_DOMAIN_KEY.nextval
		INTO :NEW.DATA_DOMAIN_KEY
		FROM DUAL;
END;
/

-- Initial load to DATA_DOMAIN table. We still have to update the SUB_DOMAIN_DESCRIPTIONS
INSERT INTO DATA_DOMAIN (PRIMARY_DOMAIN_NAME,PRIMARY_DOMAIN_DESCRIPTION,SUB_DOMAIN_NAME)
SELECT   D.DOMAIN_NAME , d.DOMAIN_COMMENTS AS DOMAIN_DESCRIPTION, SD.SUB_DOMAIN_NAME
FROM SUB_DOMAIN_DROP SD
JOIN DOMAIN_DROP D
ON D.PRIMARY_DOMAIN_KEY=SD.PRIMARY_DOMAIN_KEY;

COMMIT;

SELECT * FROM DATA_DOMAIN;


/**********************************************************************************************
--TRG_DATA_DOMAIN_OBJECT_REL
***********************************************************************************************/
 -- Create DATA_DOMAIN_OBJECT_REL



DROP TABLE DATA_DOMAIN_OBJECT_REL;

 CREATE TABLE DATA_DOMAIN_OBJECT_REL
 (DATA_DOMAIN_OBJECT_REL_KEY NUMBER(10),
  DATA_DOMAIN_KEY NUMBER(10),
  OBJECT_KEY  NUMBER(10));

-- Add primary key constraint to DATA_DOMAIN_OBJECT_REL 
ALTER TABLE DATA_DOMAIN_OBJECT_REL 
ADD CONSTRAINT DATA_DOMAIN_OBJECT_REL_PK 
PRIMARY KEY (DATA_DOMAIN_OBJECT_REL_KEY);

-- Create unique index on DATA_DOMAIN_KEY, OBJECT_KEY


CREATE UNIQUE INDEX  DATA_DOMAIN_OBJECT_REL_UK 
ON DATA_DOMAIN_OBJECT_REL (DATA_DOMAIN_KEY,OBJECT_KEY);



/**********************************************************************************************
--seq_DATA_DOMAIN_OBJECT_REL_KEY
***********************************************************************************************/ 
DROP SEQUENCE seq_DATA_DOMAIN_OBJECT_REL_KEY;
CREATE SEQUENCE LCF.seq_DATA_DOMAIN_OBJECT_REL_KEY START WITH 1; 

/**********************************************************************************************
--TRG_DATA_DOMAIN_OBJECT_REL_KEY
***********************************************************************************************/ 
CREATE OR REPLACE TRIGGER TRG_DATA_DOMAIN_OBJECT_REL_KEY
BEFORE INSERT ON LCF.DATA_DOMAIN_OBJECT_REL
FOR EACH ROW
BEGIN
	SELECT seq_DATA_DOMAIN_OBJECT_REL_KEY.nextval
		INTO :NEW.DATA_DOMAIN_OBJECT_REL_KEY
		FROM DUAL;
END;
/

/**********************************************************************************************
--V_DOMAIN_INFO
***********************************************************************************************/ 
 
 CREATE OR REPLACE FORCE EDITIONABLE VIEW LCF.V_DOMAIN_INFO (TARGET_OBJECT_NAME, PRIMARY_DOMAIN_NAME, SUB_DOMAIN_NAME) AS 
 SELECT DISTINCT  O.TARGET_OBJECT_NAME,  DD.PRIMARY_DOMAIN_NAME , DD.SUB_DOMAIN_NAME
 FROM DATA_DOMAIN_OBJECT_REL DDR
 LEFT JOIN OBJECT O
 ON O.OBJECT_KEY=DDR.OBJECT_KEY
 INNER JOIN DATA_DOMAIN DD
 ON DDR.DATA_DOMAIN_KEY=DD.DATA_DOMAIN_KEY
 WHERE TARGET_OBJECT_NAME IS NOT NULL AND DD.PRIMARY_DOMAIN_NAME IS NOT NULL;

/**********************************************************************************************
--DATA_DOMAIN_EXPANDED
***********************************************************************************************/ 
-- Recreate DATA_DOMAIN_EXPANDED


  CREATE TABLE LCF.DATA_DOMAIN_EXPANDED
   (	
      OBJECT_KEY NUMBER(10), 
      DATA_DOMAIN VARCHAR2(100),
      DATA_DOMAIN_KEY NUMBER(10),
      DATA_DOMAIN_OBJECT_REL_KEY NUMBER(10)
   ) ;

-- Drop constraint as it has been moved to the _drop table
ALTER TABLE  DATA_DOMAIN_EXPANDED_DROP DROP CONSTRAINT DATA_DOMAIN_EXPANDED_PK;
-- Add    Primary key constraint to DATA_DOMAIN_EXPANDED
ALTER TABLE  DATA_DOMAIN_EXPANDED 
ADD CONSTRAINT DATA_DOMAIN_EXPANDED_PK PRIMARY KEY ( OBJECT_KEY,DATA_DOMAIN);




/**********************************************************************************************
EXTRACT_OBJECT
***********************************************************************************************/
-- Backup EXTRACT_OBJECT table
CREATE TABLE EXTRACT_OBJECT_DROP
AS SELECT  * FROM EXTRACT_OBJECT;

-- Remove PRIMARY_DOMAIN_KEY, SBU_DOMAIN_KEY from EXTRACT_OBJECT

ALTER TABLE EXTRACT_OBJECT DROP COLUMN PRIMARY_DOMAIN_KEY;
ALTER TABLE EXTRACT_OBJECT DROP COLUMN SUB_DOMAIN_KEY;

-- Rename GENERIC_SYSTEM_NAME TO SCHEMA_PREFIX
ALTER TABLE EXTRACT_OBJECT RENAME COLUMN  GENERIC_SYSTEM_NAME TO SCHEMA_PREFIX;

/**********************************************************************************************
SYSTEM_SCHEMA 
***********************************************************************************************/

-- Rename GENERIC_SYSTEM_NAME to SCHEMA_PREFIX
ALTER TABLE SYSTEM_SCHEMA 
RENAME COLUMN GENERIC_SYSTEM_NAME TO SCHEMA_PREFIX;

ALTER TABLE SYSTEM_SCHEMA_HIST 
RENAME  COLUMN GENERIC_SYSTEM_NAME TO SCHEMA_PREFIX;

/**********************************************************************************************
--TRG_SCHEMA_HIST 
***********************************************************************************************/
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
  SCHEMA_PREFIX   ,
  LAST_UPDATE_TIME               
  )
VALUES
  (
  :new.SYSTEM_SCHEMA_KEY      ,  
	:new.SYSTEM_NAME            ,
	:new.SYSTEM_TYPE            , 
	:new.SCHEMA_NAME            , 
	:new.SAS_LIB_REF            ,
  :new.SCHEMA_PREFIX    ,
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
  SCHEMA_PREFIX    ,
  LAST_UPDATE_TIME               )
  VALUES 
  (
  :old.SYSTEM_SCHEMA_KEY      ,  
	:old.SYSTEM_NAME           , 
	:old.SYSTEM_TYPE            ,
	:old.SCHEMA_NAME            , 
	:old.SAS_LIB_REF            ,
  :old.SCHEMA_PREFIX    ,
 sysdate);
END IF;
END;


-- Grant permissions to LCF_ROLE and RO_LCF_ROLE. If these permissions are not done then we cannot run DI jobs and users who use read only account see the tables.

GRANT SELECT ON  LCF.OBJECT_CONTROL TO RO_LCF_ROLE;
GRANT SELECT ON  LCF.TASK TO   RO_LCF_ROLE;
GRANT SELECT on  LCF.DATA_DOMAIN TO RO_LCF_ROLE;
GRANT SELECT ON  LCF.DATA_DOMAIN_OBJECT_REL TO RO_LCF_ROLE;

GRANT SELECT ON  LCF.OBJECT_CONTROL TO lcf_ROLE;
GRANT SELECT ON  LCF.TASK TO   lcf_ROLE;
GRANT SELECT on  LCF.DATA_DOMAIN TO LCF_ROLE;
GRANT SELECT ON  LCF.DATA_DOMAIN_OBJECT_REL TO LCF_ROLE;



-- Check key tables

SELECT * FROM LCF.OBJECT;
SELECT * FROM LCF.OBJECT_CONTROL;

-- The END


