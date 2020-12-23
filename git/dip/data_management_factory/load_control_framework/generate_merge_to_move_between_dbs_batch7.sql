/**********************************************************************************************
12022020  SDZ  Bulk merge script to merge extract_object data. 
               Since we decommissioned the object registration excel sheet, 
               we need an interim table for merging data to the EXTRACT_OBJECT between Dev, Test and Prod.
	       We first Create a LCF.EXTRACT_OBJECT_MOVE in source, load existing data from LCF.EXTRACT_OBJECT to LCF.EXTRACT_OBJECT_MOVE. Then using SQL Developer, generate
	       insert statements from the LCF.EXTACT_OBJECT_MOVE and save to a .sql file. In target enviornment, load the data to empty LCF.EXTRACT_OBJECT_MOVE. In Target, run the merge 
               statement given below. 


04032020  SDZ  Update logic to replace schema_name in prod, add logic to handle target_db if there is a value, update target_db in the merge statement to get value from mv.target_db

18032020 DRM Update logic to include this for the batch 7 tables.
		
***********************************************************************************************/
-- In the source environment, typically dev, do the following.

DROP TABLE LCF.EXTRACT_OBJECT_MOVE;
-- Create a transport table in source db with the rows to be migrated. Convert CLOBs to VARCHAR2(4000). When prompted enter the TARGET enviornment as test or prod
CREATE TABLE LCF.EXTRACT_OBJECT_MOVE
AS 
SELECT 
SYSTEM_NAME                    , 
SYSTEM_TYPE                    ,  
--SCHEMA_NAME                    ,
CASE WHEN '&env'='prod' and SCHEMA_NAME like 'NZO%' THEN replace(schema_name,'NZO','NZP' ) else SCHEMA_NAME  END  SCHEMA_NAME, -- for dev,test we use NZO_GTAPP, for prod we use NZP_GTAPP schema.
SOURCE_OBJECT_NAME             ,
TARGET_OBJECT_SHORT_NAME       ,
SAS_LIB_REF                    ,
CAST (PK_COLUMN_NAMES  AS VARCHAR2(4000))  PK_COLUMN_NAMES   ,    
CAST (NK_COLUMN_NAMES  AS VARCHAR2(4000))  NK_COLUMN_NAMES   ,   
CAST (EXCLUDED_COLUMNS AS VARCHAR2(4000))  EXCLUDED_COLUMNS  ,       
CASE WHEN '&env'='test' then replace  (TARGET_DB,'dev_raw','test_raw') 
     WHEN '&env'='prod' then replace  (TARGET_DB,'dev_raw','prod_raw')
ELSE  TARGET_DB END AS TARGET_DB,
SENSITIVE_DATA_FLAG                    ,  
CAST (PII_COLUMNS  AS VARCHAR2(4000))   PII_COLUMNS  ,        
CAST (DATA_DOMAIN  AS VARCHAR2(4000))   DATA_DOMAIN,                           
RETENTION_PERIOD                        ,      
CAST (CUSTOM_SQL   AS VARCHAR2(4000))    CUSTOM_SQL ,                              
HISTORY_LOADED_FROM_TDW                  ,
ROW_COUNT                                ,     
LOAD_PATTERN_NAME                        , 
HISTORY_TYPE                             ,
CHANGE_CAPTURE_TIMESTAMP_COLUMN          ,
EFFECTIVE_FROM_TIMESTAMP_COLUMN          ,
EFFECTIVE_TO_TIMESTAMP_COLUMN            ,
EFFECTIVE_TIMESTAMP_GRAIN                ,
PURGE_GRAIN                              ,   
DUPLICATION_TIMESTAMP_GRAIN              ,   
LAYER                                    ,
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
CREATED_ON                               ,
UPDATED_BY                               ,
UPDATED_ON    
from EXTRACT_OBJECT WHERE SOURCE_OBJECT_NAME IN 
(

-- Add START/EDW tables for the current batch here
'RETURNS_KEYPOINTS_IR4',
'RETURNS_KEYPOINTS_IR7',
'RETURNS_ATTACHMENTS_IR10',
'RETURNS_ATTACHMENTS_IR20',
'RETURNS_KEYPOINTS_IR3NR',
'RETURNS_KEYPOINTS_FS1',
'RETURNS_KEYPOINTS_IR6',
'TBLNZ_FAMENTITLEMENT',
'TBLNZ_RTNNITCLB',
'TBLNZ_RTNNITPRT',
'TBLNZ_RTNNITEST',
'TBLNZ_RTNNITMA',
'TBLNZ_RTNPROPERTYSALE',
'TBLTRANSACTION',
'TBLNZ_RTNPSOEMPLOYEESUMMARY',
'TBLNZ_RTNIITNR',
'LANRTNSTATUS',
--
-- Add TDW history tables here, comma separated 
'TDW_TBL_NZ_RTNIITNR',
'TDW_TBL_NZ_RTNNITCLB',
'TDW_TBL_NZ_RTNNITMA',
'TDW_TBL_NZ_RTNNITPRT',
'TDW_TBL_NZ_RTNPROPERTYSALE'
);

SELECT * FROM LCF.EXTRACT_OBJECT_MOVE;

1. In SQL Developer, click on View, Connections
2. Right Click on EXTRACT_OBJECT_MOVE table,  
2. Select Export 
3. Export LCF.EXTRACT_OBJECT_MOVE to E:\GIT\2.2.1\data_management_factory\load_control_framework\load_EOMOVE_batch<n_env>.sql
4. EXTRACT_OBJECT_MOVE DLL and a bunch of insert statements will be generated and written to the above file.



-- Open SQL Developer, connect to the target database. e.g. test or prod

DROP TABLE LCF.EXTRACT_OBJECT_MOVE PURGE;
In SQL Developer, while connected to the target database run 

load_EOMOVE_batch<n_env>.sql
COMMIT; 


--In the target database, run the SQL statement in Test to generate merge statements.

SELECT 
'MERGE INTO LCF.EXTRACT_OBJECT   eo
USING LCF.EXTRACT_OBJECT_MOVE    mv 
ON  ( eo.SYSTEM_NAME        =mv.SYSTEM_NAME AND 
      eo.SOURCE_OBJECT_NAME =mv.SOURCE_OBJECT_NAME AND
      eo.SYSTEM_TYPE        =mv.SYSTEM_TYPE
		 )
WHEN NOT MATCHED THEN 
INSERT  
(
SYSTEM_NAME ,
SYSTEM_TYPE ,
SCHEMA_NAME,
SOURCE_OBJECT_NAME, 
TARGET_OBJECT_SHORT_NAME,
SAS_LIB_REF,
PK_COLUMN_NAMES, 
NK_COLUMN_NAMES ,
EXCLUDED_COLUMNS,
TARGET_DB,
SENSITIVE_DATA_FLAG, 
PII_COLUMNS,    
DATA_DOMAIN,     
RETENTION_PERIOD, 
CUSTOM_SQL,    
HISTORY_LOADED_FROM_TDW ,
ROW_COUNT, 
LOAD_PATTERN_NAME , 
HISTORY_TYPE , 
CHANGE_CAPTURE_TIMESTAMP_COLUMN ,
EFFECTIVE_FROM_TIMESTAMP_COLUMN ,
EFFECTIVE_TO_TIMESTAMP_COLUMN ,
EFFECTIVE_TIMESTAMP_GRAIN ,
PURGE_GRAIN,
DUPLICATION_TIMESTAMP_GRAIN,
LAYER ,
SYSTEM_SCHEMA_KEY ,
OBJECT_KEY ,    
RETENTION_KEY ,     
PRIMARY_DOMAIN_KEY  ,     
SUB_DOMAIN_KEY,      
GENERIC_SYSTEM_NAME , 
DATA_DOMAIN_EXPANDED_KEY ,     
CREATED_BY,
CREATED_ON , 
UPDATED_BY,
UPDATED_ON ) 
VALUES
'
||	
'(
mv.SYSTEM_NAME,
mv.SYSTEM_TYPE,
mv.SCHEMA_NAME ,
mv.SOURCE_OBJECT_NAME, 
mv.TARGET_OBJECT_SHORT_NAME ,
mv.SAS_LIB_REF ,
mv.PK_COLUMN_NAMES, 
mv.NK_COLUMN_NAMES ,       
mv.EXCLUDED_COLUMNS ,      
mv.TARGET_DB,
mv.SENSITIVE_DATA_FLAG, 
mv.PII_COLUMNS,    
mv.DATA_DOMAIN ,     
mv.RETENTION_PERIOD, 
mv.CUSTOM_SQL,    
mv.HISTORY_LOADED_FROM_TDW,
mv.ROW_COUNT, 
mv.LOAD_PATTERN_NAME, 
mv.HISTORY_TYPE , 
mv.CHANGE_CAPTURE_TIMESTAMP_COLUMN  ,
mv.EFFECTIVE_FROM_TIMESTAMP_COLUMN,
mv.EFFECTIVE_TO_TIMESTAMP_COLUMN ,
mv.EFFECTIVE_TIMESTAMP_GRAIN,
mv.PURGE_GRAIN,
mv.DUPLICATION_TIMESTAMP_GRAIN,
mv.LAYER ,
mv.SYSTEM_SCHEMA_KEY ,
mv.OBJECT_KEY ,    
mv.RETENTION_KEY ,     
mv.PRIMARY_DOMAIN_KEY ,     
mv.SUB_DOMAIN_KEY ,      
mv.GENERIC_SYSTEM_NAME , 
mv.DATA_DOMAIN_EXPANDED_KEY ,     
mv.CREATED_BY ,
mv.CREATED_ON , 
mv.UPDATED_BY,
mv.UPDATED_ON )
WHEN MATCHED THEN
UPDATE  SET 
--eo.SYSTEM_NAME                   =mv.SYSTEM_NAME ,
--eo.SYSTEM_TYPE                   =mv.SYSTEM_TYPE ,
--eo.SCHEMA_NAME                   =mv.SCHEMA_NAME ,
--eo.SOURCE_OBJECT_NAME            =mv.SOURCE_OBJECT_NAME, 
eo.TARGET_OBJECT_SHORT_NAME        =mv.TARGET_OBJECT_SHORT_NAME ,
eo.SAS_LIB_REF                     =mv.SAS_LIB_REF    ,
eo.PK_COLUMN_NAMES                 =mv.PK_COLUMN_NAMES , 
eo.NK_COLUMN_NAMES                 =mv.NK_COLUMN_NAMES  ,       
eo.EXCLUDED_COLUMNS                =mv.EXCLUDED_COLUMNS ,      
eo.TARGET_DB                       =mv.TARGET_DB, 
eo.PII_COLUMNS                     =mv.PII_COLUMNS ,    
eo.DATA_DOMAIN                     =mv.DATA_DOMAIN  ,     
eo.RETENTION_PERIOD                =mv.RETENTION_PERIOD         , 
eo.CUSTOM_SQL                      =mv.CUSTOM_SQL      ,    
eo.HISTORY_LOADED_FROM_TDW         =mv.HISTORY_LOADED_FROM_TDW,
eo.ROW_COUNT                       =mv.ROW_COUNT   , 
eo.LOAD_PATTERN_NAME               =mv.LOAD_PATTERN_NAME , 
eo.HISTORY_TYPE                    =mv.HISTORY_TYPE, 
eo.CHANGE_CAPTURE_TIMESTAMP_COLUMN =mv.CHANGE_CAPTURE_TIMESTAMP_COLUMN,
eo.EFFECTIVE_FROM_TIMESTAMP_COLUMN =mv.EFFECTIVE_FROM_TIMESTAMP_COLUMN ,
eo.EFFECTIVE_TO_TIMESTAMP_COLUMN   =mv.EFFECTIVE_TO_TIMESTAMP_COLUMN,
eo.EFFECTIVE_TIMESTAMP_GRAIN       =mv.EFFECTIVE_TIMESTAMP_GRAIN,
eo.PURGE_GRAIN                     =mv.PURGE_GRAIN,
eo.DUPLICATION_TIMESTAMP_GRAIN     =mv.DUPLICATION_TIMESTAMP_GRAIN,
eo.LAYER                           =mv.LAYER,
eo.CREATED_BY=mv.CREATED_BY ,
eo.CREATED_ON=mv.CREATED_ON , 
eo.UPDATED_BY=mv.UPDATED_BY ,
eo.UPDATED_ON=mv.UPDATED_ON;
WHERE 
	( 
	  eo.SOURCE_OBJECT_NAME =eo.SOURCE_OBJECT_NAME AND 
    eo.SYSTEM_NAME        =eo.SYSTEM_NAME        AND 
    eo.SYSTEM_TYPE        =eo.SYSTEM_TYPE        AND 
    eo.SOURCE_OBJECT_NAME =eo.SOURCE_OBJECT_NAME
    );'
FROM extract_object eo
where rownum=1
;

--Copy the generated output and run it into the SQL Developer screen of the target database as a statement (running as a script may strip out the spaces). You may need to remove the "  " around the generated SQL before runnint it.

--This should merge any changes to target database LCF.EXTRACT_OBJECT table.


COMMIT;

SELECT * FROM  extract_object
WHERE  source_object_name IN  (
'RETURNS_KEYPOINTS_IR4',
'RETURNS_KEYPOINTS_IR7',
'RETURNS_ATTACHMENTS_IR10',
'RETURNS_ATTACHMENTS_IR20',
'RETURNS_KEYPOINTS_IR3NR',
'RETURNS_KEYPOINTS_FS1',
'RETURNS_KEYPOINTS_IR6',
'TBLNZ_FAMENTITLEMENT',
'TBLNZ_RTNNITCLB',
'TBLNZ_RTNNITPRT',
'TBLNZ_RTNNITEST',
'TBLNZ_RTNNITMA',
'TBLNZ_RTNPROPERTYSALE',
'TBLTRANSACTION',
'TBLNZ_RTNPSOEMPLOYEESUMMARY',
'TBLNZ_RTNIITNR',
'LANRTNSTATUS',
'TDW_TBL_NZ_RTNIITNR',
'TDW_TBL_NZ_RTNNITCLB',
'TDW_TBL_NZ_RTNNITMA',
'TDW_TBL_NZ_RTNNITPRT',
'TDW_TBL_NZ_RTNPROPERTYSALE');
    
    

Now run the Script to invoke PL/SQL procs that validate and load metadata  to LCF.OBJECT
CLEAR SCREEN;
SET SERVEROUTPUT  ON 

BEGIN
LCF.LCF_UPDATE.VALIDATE_REG_DATA(p_env=>'&env',
                                 p_user=>'&userid');
Commit;                       
END;

CLEAR SCREEN;
SET SERVEROUTPUT  ON 

BEGIN
LCF.LCF_UPDATE.UPDATE_OBJ(p_system_schema_key=>NULL,
                                p_source_object_name=>NULL,                                  
                                p_initialize=>'Y',
                                p_env=>'&env',
                                p_user=>'&userid');
Commit;                       
END;



