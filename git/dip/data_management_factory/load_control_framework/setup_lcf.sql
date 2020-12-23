 /**********************************************************************************************
LCF: CREATE TABLES AND VIEWS


***********************************************************************************************

The following script contains the objects required for the LCF schema.
As part of this script  a series of tables, views, sequences and triggers
are built. The script has been maintained with changes over time.

Modification History:
 16/04/19 Initial Script
 27/05/19 Add CAS_OBJECT_RUN, TRG_CAS_OBJECT_RUN_KEY
 28/05/19 Change sequence/file name ON CAS_OBJECT_RUN to OBJECT_RUN_KEY, Increate EFFECTIVE_TIMESTAMP_COLUMN to varchar2(4000)
 31/05/19 Create DIP_OBJECT_RUN, associated sequence and trigger
 05/06/19 Recreate DIP_OBJECT_RUN table
 07/06/19 Remove STATUS_MESSAGE from DIP_OBJECT_RUN
 12/06/19 Add DAYS_TO_BACKFILL to objet table, remove from system_schema
 14/06/19 Remove DAYS_TO_BACKFILL from system_schema triggers
 18/06/19 Add dip_config
 15/07/19 DNI/SDZ: Updated create statements for ExtrObj, Obj, Obj_Hist, Obj Trigger to incl history type and history from tdw  
 22/07/19 Add new columns for EFFECTIVE_TO_TIMESTAMP_COLUMN, EFFECTIVE_TIMESTAMP_FROM_COLUMN and rename EFFECTIVE_TIMESTAMP_COLUMN to be CHANGE_CAPTURE_TIMESTAMP_COLUMN
 25/07/19 Change datatype of object_run table to TIMESTAMP
 29/07/19 Defaulted DAYS_TO_BACKFILL to 0
 18/09/19 Add unique index to EXTRACT_OBJECT
 20/09/19 Moved drop system schema command to  end of all drop statements - due to ref constraint
 28/09/19 Added task7 fields to object_run
 17/10/19 Added additional dip_config_entries
 18/10/19 Added start_cut_off date
 05/11/19 Change DIP_OBJECT_RUN varchar2(512) to VARCHAR2(40000)
 06/11/19 Drop COL1, COL2, COL3 columns, specify size for number columns, days_to_backfill for raw ingestion
 24/11/19 Add new values to DIP_CONFIG
 17/12/19 Update email address for dip email
 29/01/20 Updated lcf.object_run for journaling
 02/02/20 Altered the size of key field for DIP_CONFIG, added R3a dashboard config values, 
 12/02/20 added GENERIC_SYSTEM_NAME to SYSTEM_SCHEMA, SYSTEM_SCHEMA_HIST
 14/02/20 Updated TRG_SYSTEM_SCHEMA_HIST
 25/02/20 Add email sender values to DIP_CONFIG
 04/02/20 Add R3A dashboard related settings mainly for keeping changes in one place
 04/04/20 Add RECORDS_WRITTEN to DIP_OBJECT_RUN
 20/04/20 grant permission on  STG_LSF_EVENT_LOG to LCF_ROLE

*********************************************************************************************
                                    !!!   WARNING   !!!
          This script should only be run when load control objects needs to be reinitialized.
          This script will drop the LCM tables and recreate them
**********************************************************************************************/


-- Dropping LCF tables



-- Uncomment  when ready to drop the tables 



DROP TABLE LCF.OBJECT;
DROP TABLE LCF.OBJECT_HIST;
DROP TABLE LCF.DOMAIN_BRIDGE;
DROP TABLE LCF.SUB_DOMAIN;
DROP TABLE LCF.DOMAIN;
DROP TABLE LCF.OBJECT_RUN;
DROP TABLE LCF.RETENTION_PERIOD;
DROP TABLE LCF.DOMAIN;
DROP TABLE LCF.SUB_DOMAIN;
DROP TABLE LCF.DIP_CONFIG;
DROP TABLE LCF.EXTRACT_OBJECT;
DROP TABLE LCF.DIP_OBJECT_RUN;
DROP TABLE LCF.DATA_DOMAIN_EXPANDED;
DROP TABLE LCF.LCF_LOG;
DROP TABLE LCF.SYSTEM_SCHEMA;
DROP TABLE LCF.SYSTEM_SCHEMA_HIST;
DROP VIEW  LCF.V_DOMAIN_INFO;



/**********************************************************************************************
LCF.SYSTEM_SCHEMA
**********************************************************************************************/
CREATE TABLE  LCF.DIP_CONFIG
(KEY   VARCHAR2(30),
 VALUE VARCHAR2 (250));

GRANT ALL ON  LCF.DIP_CONFIG TO LCF_ROLE;




-- For Dev
/*INSERT INTO DIP_CONFIG
VALUES ('DIP_ETL_EMAIL','dipetldev@ird.govt.nz');*/


-- For Test
--INSERT INTO DIP_CONFIG VALUES ('DIP_ETL_EMAIL','Michael.Danusantoso@ird.govt.nz');
-- For Prod
/*INSERT INTO DIP_CONFIG VALUES ('DIP_ETL_EMAIL','dip_etl@ird.govt.nz');*/

/*INSERT INTO DIP_CONFIG (KEY,VALUE) VALUES ('RFN_SNAPSHOT_TIME','1:00:00');
INSERT INTO  DIP_CONFIG (KEY,VALUE) values ('START_CUTOFF_DATE','2017-02-05');
INSERT INTO DIP_CONFIG (KEY,VALUE) VALUES ('DAYS_TO_BACKFILL','0');*/



-- For Dev R3A dashboard industrialisation values


INSERT INTO DIP_CONFIG values  ('USER_BATCH_SOURCE_CASLIB','EP_DEV_SILVER_WORK');
INSERT INTO DIP_CONFIG values  ('USER_BATCH_MODEL_CASLIB','ModelStore');
INSERT INTO DIP_CONFIG values  ('USER_BATCH_RAW_CASLIB','EP_DEV_CAS_VIEWS');
INSERT INTO DIP_CONFIG values  ('USER_BATCH_REPORTING_CASLIB','EP_DEV_SILVER_PUBLISH');

INSERT INTO DIP_CONFIG values  ('USER_BATCH_SOURCE_IMPALA','dev_silver_work');
INSERT INTO DIP_CONFIG  VALUES ('USER_BATCH_DSN','ClouderaImpala64');

INSERT INTO DIP_CONFIG values  ('USER_BATCH_TARGET_CASHOST','ird45au.vsp.sas.com');
INSERT INTO DIP_CONFIG values  ('USER_BATCH_TARGET_CASPORT','5572');


INSERT INTO DIP_CONFIG values  ('USER_BATCH_REPORTING_IMPALA','dev_silver_publish');

INSERT INTO DIP_CONFIG values  ('USER_BATCH_RAW_IMPALA','prod_raw_restricted_access');
INSERT INTO DIP_CONFIG VALUES  ('USER_BATCH_REFINED_IMPALA','prod_refined_restricted_access');



COMMIT;



-- For Test R3A dashboard industrialisation values

INSERT INTO DIP_CONFIG values  ('USER_BATCH_SOURCE_CASLIB','EP_TEST_SILVER_WORK');
INSERT INTO DIP_CONFIG values  ('USER_BATCH_MODEL_CASLIB','ModelStore');
INSERT INTO DIP_CONFIG values  ('USER_BATCH_RAW_CASLIB','EP_TEST_CAS_VIEWS');
INSERT INTO DIP_CONFIG values  ('USER_BATCH_REPORTING_CASLIB','EP_TEST_SILVER_PUBLISH');

INSERT INTO DIP_CONFIG values  ('USER_BATCH_SOURCE_IMPALA','test_silver_work');
INSERT INTO DIP_CONFIG  VALUES ('USER_BATCH_DSN','ClouderaImpala64');

INSERT INTO DIP_CONFIG values   ('USER_BATCH_TARGET_CASHOST','ird45au.vsp.sas.com');
INSERT INTO DIP_CONFIG values   ('USER_BATCH_TARGET_CASPORT','5572');
INSERT INTO DIP_CONFIG values   ('USER_BATCH_REPORTING_IMPALA','test_silver_publish');

INSERT INTO DIP_CONFIG values  ('USER_BATCH_RAW_IMPALA','prod_raw_restricted_access');
INSERT INTO DIP_CONFIG VALUES  ('USER_BATCH_REFINED_IMPALA','prod_refined_restricted_access');



-- For Prod R3A dashboard industrilisation values

INSERT INTO DIP_CONFIG values  ('USER_BATCH_SOURCE_CASLIB','EP_PROD_SILVER_WORK');
INSERT INTO DIP_CONFIG values  ('USER_BATCH_MODEL_CASLIB','ModelStore');
INSERT INTO DIP_CONFIG values  ('USER_BATCH_RAW_CASLIB','EP_PROD_CAS_VIEWS');
INSERT INTO DIP_CONFIG values  ('USER_BATCH_REPORTING_CASLIB','EP_PROD_SILVER_PUBLISH');

INSERT INTO DIP_CONFIG values  ('USER_BATCH_SOURCE_IMPALA','prod_silver_work');
INSERT INTO DIP_CONFIG  VALUES ('USER_BATCH_DSN','ClouderaImpala64');

INSERT INTO DIP_CONFIG values  ('USER_BATCH_TARGET_CASHOST','ird45au.vsp.sas.com');
INSERT INTO DIP_CONFIG values  ('USER_BATCH_TARGET_CASPORT','5572');
INSERT INTO DIP_CONFIG values  ('USER_BATCH_REPORTING_IMPALA','prod_silver_publish');

INSERT INTO DIP_CONFIG values  ('USER_BATCH_RAW_IMPALA','prod_raw_restricted_access');
INSERT INTO DIP_CONFIG VALUES  ('USER_BATCH_REFINED_IMPALA','prod_refined_restricted_access');


COMMIT;

-- Do not truncate the DIP_CONFIG table at any time.


insert into DIP_CONFIG (KEY,VALUE) values ('DIP_EMAIL_SENDER','dip-factory-'&dev'@sas.com');
Insert into DIP_CONFIG (KEY,VALUE) values ('DIP_ETL_EMAIL','dipetl@ird.govt.nz');
Insert into DIP_CONFIG (KEY,VALUE) values ('DASHBOARD_URL','https://discovery.dip-lab.ird.govt.nz/SASReportViewer/?reportUri=%2Freports%2Freports%2F130079d1-9498-400e-ab89-0ba9dfd04ab3&page=vi6');
Insert into DIP_CONFIG (KEY,VALUE) values ('START_CUTOFF_DATE_R3','2019-04-21');
Insert into DIP_CONFIG (KEY,VALUE) values ('START_CUTOFF_DATE_R1','2017-02-05');
Insert into DIP_CONFIG (KEY,VALUE) values ('START_CUTOFF_DATE_R2','2018-04-18');
Insert into DIP_CONFIG (KEY,VALUE) values ('DAYS_TO_BACKFILL','0');

COMMIT;





/**********************************************************************************************
LCF.SYSTEM_SCHEMA
**********************************************************************************************/
CREATE TABLE LCF.SYSTEM_SCHEMA (
	SYSTEM_SCHEMA_KEY       NUMBER (10) NOT NULL,  -- Auto generated by trigger using sequence
	SYSTEM_NAME             VARCHAR2(30),    -- Eg SAPP,PAPP, PWRQ, EDW, TDW 
	SYSTEM_TYPE             VARCHAR2(30),    -- Eg Oracle, SQL Server
	SCHEMA_NAME             VARCHAR2(30),    -- 
	SAS_LIB_REF             VARCHAR2(30),
  GENERIC_SYSTEM_NAME     VARCHAR2(10)
);
   


ALTER TABLE LCF.SYSTEM_SCHEMA 
ADD CONSTRAINT SYSTEM_SCHEMA_PK PRIMARY KEY ( system_schema_key );

CREATE UNIQUE INDEX SYSTEM_SCHEMA_UK ON SYSTEM_SCHEMA (SYSTEM_NAME,SYSTEM_TYPE,SCHEMA_NAME);

/**********************************************************************************************
LCF.SYSTEM_SCHEMA_HIST
**********************************************************************************************/
CREATE TABLE LCF.SYSTEM_SCHEMA_HIST (
SYSTEM_SCHEMA_KEY         NUMBER(10) NOT NULL,  -- Auto generated by trigger using sequence
	SYSTEM_NAME             VARCHAR2(30),    -- Eg SAPP,PAPP, PWRQ, EDW, TDW 
	SYSTEM_TYPE             VARCHAR2(30),    -- Eg Oracle, SQL Server
	SCHEMA_NAME             VARCHAR2(30),    -- 
	SAS_LIB_REF             VARCHAR2(30), 
  GENERIC_SYSTEM_NAME     VARCHAR2(10),
  LAST_UPDATE_TIME        TIMESTAMP
  );



/**********************************************************************************************
LCF.OBJECT
**********************************************************************************************/
CREATE TABLE LCF.OBJECT 
   (	
  OBJECT_KEY NUMBER(10) NOT NULL ENABLE, 
	SYSTEM_SCHEMA_KEY NUMBER(10) NOT NULL ENABLE, 
	TARGET_OBJECT_NAME VARCHAR2(30 ), 
	OBJECT_SHORT_NAME VARCHAR2(25 ), 
	TARGET_DB VARCHAR2(30 ) DEFAULT 'dev'||'_raw', 
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
	INGESTION_MODE VARCHAR2(10 ) DEFAULT 'ALL');
  
  ALTER TABLE OBJECT ADD CONSTRAINT OBJECT_PK  PRIMARY KEY (OBJECT_KEY) ;
  ALTER TABLE OBJECT ADD CONSTRAINT ING_MODE CHECK (INGESTION_MODE IN ('JNL', 'ALL', 'ING'));


ALTER TABLE LCF.OBJECT
    ADD CONSTRAINT SYSTEM_SCHEMA_OBJECT_FK  FOREIGN KEY ( SYSTEM_SCHEMA_KEY )
        REFERENCES LCF.SYSTEM_SCHEMA ( SYSTEM_SCHEMA_KEY )
  DEFERRABLE;
/**********************************************************************************************
LCF.OBJECT_HIST
**********************************************************************************************/


  CREATE TABLE LCF.OBJECT_HIST 
   (	
  OBJECT_KEY NUMBER(10) NOT NULL ENABLE, 
	SYSTEM_SCHEMA_KEY NUMBER(10) NOT NULL ENABLE, 
	TARGET_OBJECT_NAME VARCHAR2(30 ), 
	OBJECT_SHORT_NAME VARCHAR2(25 ), 
	TARGET_DB VARCHAR2(30 ) DEFAULT 'dev'||'_raw', 
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
  LAST_UPDATE_TIME              TIMESTAMP  );




/**********************************************************************************************
LCF.EXTRACT_OBJECT
**********************************************************************************************/
CREATE TABLE LCF.EXTRACT_OBJECT (
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




ALTER TABLE LCF.EXTRACT_OBJECT MODIFY CREATED_BY DEFAULT sys_context( 'userenv', 'os_user' ) ;  
ALTER TABLE LCF.EXTRACT_OBJECT MODIFY UPDATED_BY DEFAULT sys_context( 'userenv', 'os_user' ) ;
ALTER TABLE LCF.EXTRACT_OBJECT MODIFY CREATED_ON DEFAULT sysdate ;  


ALTER TABLE  LCF.EXTRACT_OBJECT
ADD  CONSTRAINT LOAD_PATTERN_CK 
CHECK (LOAD_PATTERN_NAME IN ('FULLREPLACEMENT','FULLCOMPARISON','CHANGEEXTRACT','BATCHEXTRACT','EVENTEXTRACT'));

 
  
/**********************************************************************************************
LCF.OBJECT_RUN
**********************************************************************************************/ 
 CREATE TABLE LCF.OBJECT_RUN
  (OBJECT_RUN_KEY NUMBER(10), 
  TARGET_OBJECT_NAME VARCHAR2(30), 
  OBJECT_KEY NUMBER(10), 
  START_TIME TIMESTAMP (6), 
  END_TIME TIMESTAMP (6), 
  STATUS VARCHAR2(512), 
  STATUS_MESSAGE VARCHAR2(4000), 
  RECORDS_READ NUMBER(10), 
  RECORDS_WRITTEN NUMBER(10), 
  OBJECT_LOG_NAME VARCHAR2(2048), 
  OBJECT_PRG_NAME VARCHAR2(2048), 
  INGESTION_MODE VARCHAR2(10),
  PREV_HIGH_WATER_MARK_VALUE TIMESTAMP, 
  HIGH_WATER_MARK_VALUE_JNL TIMESTAMP,
  HIGH_WATER_MARK_VALUE TIMESTAMP, 
  LOAD_PATTERN_NAME VARCHAR2(30), 
  TASK1 VARCHAR2(50), 
  TASK1_START_TIME TIMESTAMP, 
  TASK1_END_TIME TIMESTAMP, 
  TASK2 VARCHAR2(50), 
  TASK2_START_TIME TIMESTAMP, 
  TASK2_END_TIME TIMESTAMP, 
  TASK3 VARCHAR2(50), 
  TASK3_START_TIME TIMESTAMP, 
  TASK3_END_TIME TIMESTAMP, 
  TASK4 VARCHAR2(50), 
  TASK4_START_TIME TIMESTAMP, 
  TASK4_END_TIME TIMESTAMP, 
  TASK5 VARCHAR2(50), 
  TASK5_START_TIME TIMESTAMP, 
  TASK5_END_TIME TIMESTAMP, 
  TASK6 VARCHAR2(50), 
  TASK6_START_TIME TIMESTAMP, 
  TASK6_END_TIME TIMESTAMP,
  TASK7 VARCHAR(50),
  TASK7_START_TIME TIMESTAMP,
  TASK7_END_TIME TIMESTAMP,
  TASK8 VARCHAR(50),
  TASK8_START_TIME TIMESTAMP,
  TASK8_END_TIME TIMESTAMP,
  TASK9 VARCHAR(50),
  TASK9_START_TIME TIMESTAMP,
  TASK9_END_TIME TIMESTAMP,
  TASK10 VARCHAR(50),
  TASK10_START_TIME TIMESTAMP,
  TASK10_END_TIME TIMESTAMP,
  TASK11 VARCHAR(50),
  TASK11_START_TIME TIMESTAMP,
  TASK11_END_TIME TIMESTAMP  );

ALTER TABLE LCF.OBJECT_RUN
ADD CONSTRAINT OBJECT_RUN_PK PRIMARY KEY ( OBJECT_RUN_KEY );



/**********************************************************************************************
LCF.CAS_OBJECT_RUN
**********************************************************************************************/ 


CREATE TABLE LCF.DIP_OBJECT_RUN 
   (  
      OBJECT_RUN_KEY NUMBER(10), 
      LIB_NAME VARCHAR2(30), 
      OBJECT_NAME VARCHAR2(50), 
      CATEGORY VARCHAR2(30), 
      START_TIME TIMESTAMP (6), 
      END_TIME TIMESTAMP (6), 
      STATUS VARCHAR2(20), 
      TASK1 VARCHAR2(50), 
      TASK1_START_TIME TIMESTAMP, 
      TASK1_END_TIME TIMESTAMP, 
      TASK1_STATUS VARCHAR2(50), 
      TASK1_STATUS_MESSAGE VARCHAR2(4000), 
      TASK2 VARCHAR2(50), 
      TASK2_START_TIME TIMESTAMP, 
      TASK2_END_TIME TIMESTAMP, 
      TASK2_STATUS VARCHAR2(50), 
      TASK2_STATUS_MESSAGE VARCHAR2(4000), 
      TASK3 VARCHAR2(50), 
      TASK3_START_TIME TIMESTAMP, 
      TASK3_END_TIME TIMESTAMP, 
      TASK3_STATUS VARCHAR2(50), 
      TASK3_STATUS_MESSAGE VARCHAR2(4000), 
      TASK4 VARCHAR2(50), 
      TASK4_START_TIME TIMESTAMP, 
      TASK4_END_TIME TIMESTAMP, 
      TASK4_STATUS VARCHAR2(50), 
      TASK4_STATUS_MESSAGE VARCHAR2(4000),
      RECORDS_WRITTEN   NUMBER(10)   
   );

      
    
ALTER TABLE LCF.DIP_OBJECT_RUN 
ADD CONSTRAINT OBJECT_RUN_KEY PRIMARY KEY ( OBJECT_RUN_KEY );



/**********************************************************************************************
LCF.RETENTION_PERIOD
**********************************************************************************************/
CREATE TABLE LCF.RETENTION_PERIOD
   (	RETENTION_KEY NUMBER(10), 
	    RETENTION_NUM_DAYS NUMBER(10)
   );

ALTER TABLE LCF.RETENTION_PERIOD 
ADD CONSTRAINT RETENTION_PERIOD_PK PRIMARY KEY ( RETENTION_KEY );



/**********************************************************************************************
LCF.DOMAIN
**********************************************************************************************/
CREATE TABLE LCF.DOMAIN
   (	PRIMARY_DOMAIN_KEY NUMBER(10), 
	    DOMAIN_NAME VARCHAR2(100 BYTE), 
	    DOMAIN_COMMENTS CLOB
   ) ;

ALTER TABLE LCF.DOMAIN 
ADD CONSTRAINT PRIMARY_DOMAIN_PK PRIMARY KEY ( PRIMARY_DOMAIN_KEY );





/**********************************************************************************************
LCF.SUB_DOMAIN
**********************************************************************************************/
CREATE TABLE SUB_DOMAIN
( PRIMARY_DOMAIN_KEY NUMBER(10),
  SUB_DOMAIN_KEY  NUMBER(10),
  SUB_DOMAIN_NAME VARCHAR2(100));


ALTER TABLE LCF.SUB_DOMAIN
    ADD CONSTRAINT DOMAIN_SUB_DOMAIN_FK FOREIGN KEY (PRIMARY_DOMAIN_KEY )
        REFERENCES LCF.DOMAIN ( PRIMARY_DOMAIN_KEY )
  DEFERRABLE;
  
  
  
/**********************************************************************************************
LCF.DOMAIN_BRIDGE
**********************************************************************************************/



CREATE TABLE DOMAIN_BRIDGE
(DOMAIN_BRIDGE_KEY NUMBER(10),
 OBJECT_KEY NUMBER,
 PRIMARY_DOMAIN_KEY NUMBER(10),
 SUB_DOMAIN_KEY NUMBER(10)
 );
 

 
ALTER TABLE LCF.DOMAIN_BRIDGE
ADD CONSTRAINT DOMAIN_BRIDGE_PK PRIMARY KEY ( DOMAIN_BRIDGE_KEY );
 



 /*CREATE OR REPLACE VIEW V_DOMAIN_INFO AS
 SELECT DISTINCT  O.TARGET_OBJECT_NAME,  D.DOMAIN_NAME , SD.SUB_DOMAIN_NAME
 FROM DOMAIN_BRIDGE DB
 LEFT JOIN OBJECT O
 ON O.OBJECT_KEY=DB.OBJECT_KEY
 LEFT JOIN DOMAIN D
 ON DB.PRIMARY_DOMAIN_KEY=D.PRIMARY_DOMAIN_KEY
 LEFT JOIN   SUB_DOMAIN SD
 ON DB.SUB_DOMAIN_KEY=SD.SUB_DOMAIN_KEY
 AND DB.PRIMARY_DOMAIN_KEY=SD.PRIMARY_DOMAIN_KEY;*/
 
 
 CREATE OR REPLACE FORCE EDITIONABLE VIEW LCF.V_DOMAIN_INFO (TARGET_OBJECT_NAME, DOMAIN_NAME, SUB_DOMAIN_NAME) AS 
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
 
 
 /**********************************************************************************************
LCF.DATA_DOMAIN_EXPANDED
**********************************************************************************************/
 
 
  CREATE TABLE LCF.DATA_DOMAIN_EXPANDED
   (	
      OBJECT_KEY NUMBER(10), 
	    DATA_DOMAIN VARCHAR2(100),
      PRIMARY_DOMAIN_KEY NUMBER(10),
      SUB_DOMAIN_KEY NUMBER(10),
      DOMAIN_BRIDGE_KEY NUMBER(10)
   ) ;
   
   
ALTER TABLE LCF.DATA_DOMAIN_EXPANDED 
ADD CONSTRAINT DATA_DOMAIN_EXPANDED_PK PRIMARY KEY ( OBJECT_KEY,DATA_DOMAIN );



/**********************************************************************************************
--LCF.LCF_LOG
**********************************************************************************************/
 11/02/20 This table is no longer used.

/* CREATE TABLE  LCF_LOG
 (LOG_KEY NUMBER,
  DESCRIPTION VARCHAR2 (4000),
  LOG_TIME TIMESTAMP,
  USERID VARCHAR2(10));*/
  
  
/*CREATE TABLE LCF_LOG
(LOG_KEY NUMBER(10),
LOG_TIME TIMESTAMP,
USERNAME VARCHAR2(10),
LOG_TYPE VARCHAR2(20),
TASK1 VARCHAR2(500),
TASK2 VARCHAR2(500),
TASK3 VARCHAR2(500),
TASK4 VARCHAR2(500),
TASK5 VARCHAR2(500),
TASK6 VARCHAR2(500),
TASK7 VARCHAR2(500),
TASK8 VARCHAR2(500),
TASK9 VARCHAR2(500),
TASK10 VARCHAR2(500),
TASK11 VARCHAR2(500),
TASK12 VARCHAR2(500),
TASK13 VARCHAR2(500),
TASK14 VARCHAR2(500));*/

/**********************************************************************************************
seq_SCHEMA_KEY
***********************************************************************************************/
DROP SEQUENCE  LCF.seq_LCF_LOG_KEY;
CREATE SEQUENCE LCF.seq_LCF_LOG_KEY START WITH 1;



/**********************************************************************************************
seq_SCHEMA_KEY
***********************************************************************************************/
DROP SEQUENCE LCF.seq_SYSTEM_SCHEMA_KEY ;
CREATE SEQUENCE LCF.seq_SYSTEM_SCHEMA_KEY START WITH 1;

/**********************************************************************************************
seq_OBJECT_KEY
***********************************************************************************************/
DROP SEQUENCE LCF.seq_OBJECT_KEY;
CREATE SEQUENCE LCF.seq_OBJECT_KEY START WITH 1;


/**********************************************************************************************
seq_DOMIN_KEY
***********************************************************************************************/
DROP SEQUENCE LCF.seq_DOMAIN_KEY ;
CREATE SEQUENCE LCF.seq_DOMAIN_KEY START WITH 1;


/**********************************************************************************************
seq_SUB_DOMIN_KEY
***********************************************************************************************/
DROP SEQUENCE  LCF.seq_SUB_DOMAIN_KEY;
CREATE SEQUENCE LCF.seq_SUB_DOMAIN_KEY START WITH 1;

/**********************************************************************************************
seq_OBJECT_RUN_KEY
***********************************************************************************************/
DROP SEQUENCE LCF.seq_OBJECT_RUN_KEY;
CREATE SEQUENCE LCF.seq_OBJECT_RUN_KEY START WITH 1;

/**********************************************************************************************
seq_DOMAIN_BRIDGE_KEY
***********************************************************************************************/

DROP SEQUENCE LCF.seq_DOMAIN_BRIDGE_KEY ;
CREATE SEQUENCE LCF.seq_DOMAIN_BRIDGE_KEY START WITH 1;

/**********************************************************************************************
seq_CAS_OBJECT_RUN_KEY
***********************************************************************************************/


DROP SEQUENCE LCF.seq_DIP_OBJECT_RUN_KEY;
CREATE SEQUENCE LCF.seq_DIP_OBJECT_RUN_KEY START WITH 1;


/**********************************************************************************************
TRG_LCF_LOG_KEY
***********************************************************************************************/
CREATE OR REPLACE TRIGGER TRG_DIP_OBJECT_RUN_KEY
BEFORE INSERT ON LCF.DIP_OBJECT_RUN
FOR EACH ROW
BEGIN
	SELECT seq_DIP_OBJECT_RUN_KEY.nextval
		INTO :NEW.OBJECT_RUN_KEY
		FROM DUAL;
END;
/

/**********************************************************************************************
TRG_LCF_LOG_KEY
***********************************************************************************************/
/*CREATE OR REPLACE TRIGGER TRG_LCF_LOG_KEY
BEFORE INSERT ON LCF.LCF_LOG
FOR EACH ROW
BEGIN
	SELECT seq_LCF_LOG_KEY.nextval
		INTO :NEW.LOG_KEY
		FROM DUAL;
END;
/

*/




/**********************************************************************************************
TRG_SCHEMA_KEY
***********************************************************************************************/

CREATE OR REPLACE TRIGGER TRG_SYSTEM_SCHEMA_KEY
BEFORE INSERT ON LCF.SYSTEM_SCHEMA
FOR EACH ROW
BEGIN
	SELECT seq_SYSTEM_SCHEMA_KEY.nextval
		INTO :NEW.SYSTEM_SCHEMA_KEY
		FROM DUAL;
END;
/

/**********************************************************************************************
TRG_OBJECT_KEY
***********************************************************************************************/
DROP TRIGGER LCF.TRG_OBJECT_KEY;

CREATE OR REPLACE TRIGGER LCF.TRG_OBJECT_KEY
BEFORE INSERT ON LCF.OBJECT
FOR EACH ROW
BEGIN
	SELECT seq_OBJECT_KEY.nextval
		INTO :NEW.OBJECT_KEY
		FROM DUAL;
END;
/

/**********************************************************************************************
TRG_DOMAIN_KEY
***********************************************************************************************/

/*
CREATE OR REPLACE TRIGGER TRG_DOMAIN_KEY
BEFORE INSERT ON LCF.DOMAIN
FOR EACH ROW
BEGIN
	SELECT seq_DOMAIN_KEY.nextval
		INTO :NEW.DOMAIN_KEY
		FROM DUAL;
END;

*/
/**********************************************************************************************
TRG_SUB_DOMAIN_KEY
***********************************************************************************************/
 /*DROP TRIGGER TRG_SUB_DOMAIN_KEY;
CREATE OR REPLACE TRIGGER TRG_SUB_DOMAIN_KEY
BEFORE INSERT ON LCF.SUB_DOMAIN
FOR EACH ROW
BEGIN
	SELECT seq_SUB_DOMAIN_KEY.nextval
		INTO :NEW.SUB_DOMAIN_KEY
		FROM DUAL;
END;
/ 
*/

/**********************************************************************************************
TRG_DOMAIN_BRIDGE_KEY
***********************************************************************************************/

CREATE OR REPLACE TRIGGER DOMAIN_BRIDGE_KEY
BEFORE INSERT ON LCF.DOMAIN_BRIDGE
FOR EACH ROW
BEGIN
	SELECT seq_DOMAIN_BRIDGE_KEY.nextval
		INTO :NEW.DOMAIN_BRIDGE_KEY
		FROM DUAL;
END;
/ 


  
/***********************************************************************************************
TRG_OBJECT_HIST
***********************************************************************************************/
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


/**********************************************************************************************
TRG_SYSTEM_SCHEMA_HIST
**********************************************************************************************/
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

  

/**********************************************************************************************
TRG_EXTRACT_OBJECT
**********************************************************************************************/
 

CREATE OR REPLACE TRIGGER TRG_EXTRACT_OBJECT
BEFORE UPDATE ON lcf.EXTRACT_OBJECT
FOR EACH ROW
BEGIN
    SELECT SYSTIMESTAMP INTO :NEW.UPDATED_ON from dual;
    SELECT sys_context( 'userenv', 'os_user' ) INTO :NEW.UPDATED_BY FROM DUAL;
END;
/


--- Grant permissions. LOAD_CONTROL will be decommissioned with Release 1

--GRANT  ALL  ON  Z_TEST$_P1 TO LOAD_CONTROL;
--GRANT  ALL  ON   Z_TEST$_P2 TO LOAD_CONTROL;
--GRANT  ALL  ON   Z_TEST$_P3 TO LOAD_CONTROL;
--GRANT SELECT ON OBJECT TO LOAD_CONTROL;

--GRANT  SELECT on lcf.seq_object_run_key TO LOAD_CONTROL;
--GRANT  ALL on lcf.object_run TO LOAD_CONTROL;
--GRANT SELECT ON LCF.SYSTEM_SCHEMA TO LOAD_CONTROL;

GRANT ALL ON  OBJECT_RUN TO LCF_ROLE;
GRANT SELECT ON OBJECT TO LCF_ROLE;
GRANT SELECT ON SYSTEM_SCHEMA TO LCF_ROLE;
GRANT ALL ON  DIP_OBJECT_RUN TO LCF_ROLE;
GRANT SELECT ON seq_object_run_key TO LCF_ROLE;
GRANT SELECT ON  seq_dip_object_run_key TO LCF_ROLE;
GRANT SELECT ON V_DOMAIN_INFO TO LCF_ROLE;
--GRANT SELECT ON DOMAIN_BRIDGE TO LCF_ROLE;
GRANT SELECT ON SRC_TGT_SYSTEM TO LCF_ROLE;
GRANT SELECT ON SRC_TGT_SCHEMA TO LCF_ROLE;

grant insert on lcf.all_source_columns to lcf_role;
grant update on lcf.all_source_columns to lcf_role;
grant delete on lcf.all_source_columns to lcf_role;
grant select on lcf.all_source_columns to lcf_role;



GRANT SELECT ON SRC_TGT_SYSTEM TO RO_LCF_ROLE;
GRANT SELECT ON SRC_TGT_SCHEMA TO RO_LCF_ROLE;
GRANT SELECT ON OBJECT TO RO_LCF_ROLE;
GRANT SELECT ON OBJECT_CONTROL TO RO_LCF_ROLE;

grant select on lcf.all_source_columns to ro_lcf_role;

 
 

GRANT ALL ON STG_LSF_EVENT_LOG TO LCF_ROLE; 

--GRANT ALL ON OBJECT TO LOAD_CONTROL;
--GRANT ALL ON SYSTEM_SCHEMA TO LOAD_CONTROL;
--GRANT ALL ON OBJECT_RUN TO LOAD_CONTROL;
--GRANT ALL ON DIP_OBJECT_RUN TO LOAD_CONTROL;



/* Test only:
--GRANT SELECT ON Z_TEST$_P3 TO LCF_ROLE;
--GRANT SELECT ON Z_TEST$_P3_CS TO LCF_ROLE;
--GRANT SELECT ON Z_TEST$_P1 TO LCF_ROLE;
--GRANT SELECT ON Z_TEST$_P1_CS TO LCF_ROLE; 
--GRANT SELECT ON Z_TEST$_P2 TO LCF_ROLE;
--GRANT SELECT ON Z_TEST$_P2_CS TO LCF_ROLE; 
--GRANT SELECT ON Z_TEST$_P3 TO LCF_ROLE;
--GRANT SELECT ON Z_TEST$_P1 TO LCF_ROLE;
--GRANT SELECT ON Z_TEST$_P2 TO LCF_ROLE;
--GRANT SELECT ON Z_TEST$_P1_CS TO LCF_ROLE;
--GRANT SELECT ON Z_TEST$_P2_CS TO LCF_ROLE;
--GRANT SELECT ON Z_TEST$_P3_CS TO LCF_ROLE;
--GRANT SELECT ON Z_TEST$_P2H1 TO LCF_ROLE;
--GRANT SELECT ON Z_TEST$_P2H3 TO LCF_ROLE;
*/





/**********************************************************************************************
                                            THE END!!!
**********************************************************************************************/
 
 
 