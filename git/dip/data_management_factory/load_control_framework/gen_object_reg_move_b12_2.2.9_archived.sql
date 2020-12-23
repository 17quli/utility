/**********************************************************************************************
18062020  SDZ  initial script migrating object registration data from dev->test->prod
23062020  SDZ  updated logic for TDW History flag update
24062020  SDZ  Resolve issue to do with invalid number, duplicate system_schema_key. Need to backup tables manually as exports not available yet.



		
***********************************************************************************************/
-- Logon to ird74au and check whether the export has completed. This will contain the export dump to be used in Test and Prod in case if you need to rollback the changes.

CREATE TABLE LCF.OBJECT_&date AS SELECT * FROM OBJECT;


/***********************************************************************************************/
-- In the source environment, typically dev, do the following.

DROP TABLE LCF.OBJECT_MOVE;
-- Create a transport table in source db with the rows to be migrated. Convert CLOBs to VARCHAR2(4000). When prompted enter the TARGET enviornment as test or prod


/***********************************************************************************************/
-- Update OBJECT HISTORY_LOADED_FROM TDW flag from OBJECT_REQUEST table
/***********************************************************************************************/
UPDATE OBJECT o
SET HISTORY_LOADED_FROM_TDW=
      (SELECT obr.TDW_HIST_MIGRATION_CMPLTD
       FROM OBJECT_REQUEST obr 
       JOIN SRC_TGT_SCHEMA ss
       ON obr.schema=
       (CASE 
        WHEN   ss.schema_name='NZO_GTAPP' THEN 'GTAPP'
        WHEN   ss.schema_name='NZO_GTREF' THEN 'GTREF'
        WHEN   ss.schema_name='NZO_GTWRQ' THEN 'GTWRQ'
        WHEN   ss.schema_name='NZO_GTWEB' THEN 'GTREF' 
        ELSE   ss.schema_name END)
        AND  obr.SOURCE_OBJECT_NAME=o.SOURCE_OBJECT_NAME 
       AND     o.SYSTEM_SCHEMA_KEY=ss.SYSTEM_SCHEMA_KEY
       AND     o.SAS_LIB_REF=o.SAS_LIB_REF
       )
WHERE  HISTORY_LOADED_FROM_TDW IS NULL;     

COMMIT;

/***********************************************************************************************/
-- Build OBJECT_MOVE table 
/***********************************************************************************************/
CREATE TABLE LCF.OBJECT_MOVE
AS 
SELECT 
CASE WHEN  '&env'='prod' and SCHEMA_NAME like 'NZO%' THEN replace(schema_name,'NZO','NZP' ) 
     WHEN  '&env'='prod' and SCHEMA_NAME like 'NZS%' THEN replace(schema_name,'NZS','NZP' )     --  WHEN  '&env'='prod' and SCHEMA_NAME like 'NZS%' THEN replace(schema_name,'NZS','NZP' ) 
ELSE SCHEMA_NAME  END  SCHEMA_NAME, 
SOURCE_OBJECT_NAME             ,
SOURCE_OBJECT_TYPE,
OBJECT_SHORT_NAME       ,
TARGET_OBJECT_NAME,
o.SAS_LIB_REF                    ,
CAST (PK_COLUMN_NAMES  AS VARCHAR2(4000))  PK_COLUMN_NAMES   ,    
CAST (NK_COLUMN_NAMES  AS VARCHAR2(4000))  NK_COLUMN_NAMES   ,   
CAST (EXCLUDED_COLUMNS AS VARCHAR2(4000))  EXCLUDED_COLUMNS  ,       
CASE WHEN '&env'='test' then replace  (TARGET_DB,'dev_raw','test_raw') 
     WHEN '&env'='prod' then replace  (TARGET_DB,'dev_raw','prod_raw')
ELSE  TARGET_DB END AS TARGET_DB,
SENSITIVE_DATA_FLAG                    ,  
CAST (CUSTOM_SQL   AS VARCHAR2(4000))    CUSTOM_SQL ,                              
HISTORY_LOADED_FROM_TDW                  , 
LOAD_PATTERN_NAME                        , 
HISTORY_TYPE                             ,
CHANGE_CAPTURE_TIMESTAMP_COLUMN          ,
EFFECTIVE_FROM_TIMESTAMP_COLUMN          ,
EFFECTIVE_TO_TIMESTAMP_COLUMN            ,
EFFECTIVE_TIMESTAMP_GRAIN                ,
PURGE_GRAIN                              ,   
DUPLICATION_TIMESTAMP_GRAIN              ,   
LAYER                                    ,
PARTITION_KEY                            , --new field
ss.SYSTEM_SCHEMA_KEY                        ,      
OBJECT_KEY                               ,    
RETENTION_KEY                            ,       
SCHEMA_PREFIX                      ,  
CREATED_BY                               ,
CREATED_ON                               ,
UPDATED_BY                               ,
UPDATED_ON    
FROM OBJECT o
JOIN SRC_TGT_SCHEMA ss
ON ss.SYSTEM_SCHEMA_KEY=ss.SYSTEM_SCHEMA_KEY 
AND ss.SAS_LIB_REF=o.SAS_LIB_REF
WHERE o.SOURCE_OBJECT_NAME IN 
-- Add START/DSS/TDW tables for the current batch here
(
'TBLNZ_INCOME',
'CORRESPONDENCE_INBOUND',
'TBLADDRESSPROFILE',
'TBLCUSTOMEREMAIL',
'TBLEMAIL',
'TBLEMAILS',
'TBLMAILCATEGORY',
'TBLMAILTEMPLATE',
'TBLMAILTYPE',
'TBLNZ_AUDCASETOCUSTOMER',
'TBLNZ_EOTATTRIBUTES',
'TBLNZ_FAMABATEMENTS',
'TBLNZ_FAMINCOMECALCULATION',
'TBLNZ_FAMINCOMEDETAILS',
'TBLNZ_FAMRELATIONSHIPPERIODS',
'TBLNZ_ICABALANCE',
'TBLNZ_INCOMEBENATTRIBUTES',
'TBLNZ_INCOMEBUSATTRIBUTES',
'TBLNZ_INCOMEDWTATTRIBUTES',
'TBLNZ_INCOMELTCATTRIBUTES',
'TBLNZ_MSDWAGESUBSIDY',
'TBLNZ_RTNFIF',
'TBLNZ_RTNFIFINC',
'TBLNZ_RTNICAANN',
'TBLNZ_RTNIPSEINCOMEINFO',
'TBLNZ_RTNIPSELINEITEM',
'TBLNZ_RTNMACAMAFDP',
'TBLNZ_RTNNRTE',
'TBLNZ_RTNNRTS',
'TBLNZ_RTNPIEANN',
'TBLNZ_RTNPRSSUMMARY',
'TBLNZ_RTNRLTSUMMARY',
'TBLNZ_RTNSOA',
'TBLNZ_SUMMARYOFEARNINGS',
'TBLNZ_VISITOUTBOUNDCALL',
'TBLTASKGROUPQUEUE',
'TBLTRANSADJUSTDETAIL',
--'TBLTRANSSTAGE',
'TBLUSERINFO',
'TBLVISITACTION',
'LANNZ_CORRIESORT',
'LANTITLEUSER',
'LANUSER',
'LANWEBREQTYPE',
'TBLNZ_CLIENTLISTTOWEBLOGON',
'TBLNZ_WEBLOGONPASSWORDRESET',
'TBLNZ_WEBLOGONRESERVED',
'TBLNZ_WEBNOTICENOTIFICATION',
'TBLWEBNOTICEEMAIL',
'TBLNZ_FAMENTITLEMENTPERIODS',
'TBLNZ_FAMPROTECTEDFTC',
-- TDW tables
'TBL_NZ_ICABALANCE',
'TBL_NZ_RTNFIF',
'TBL_NZ_RTNFIFINC',
'TBL_NZ_RTNICAANN',
'TBLNZ_RTNNRTE',
'TBL_NZ_RTNNRTS',
'TBL_NZ_RTNPRSSUMMARY',
'TBLNZ_RTNRLTSUMMARY',
'TBL_USERINFO'
)
AND SCHEMA_NAME not like 'NZS%';

select * from object_move;

/***********************************************************************************************/
-- Build OBJECT_MOVE table 
/***********************************************************************************************/



1. In SQL Developer, click on View, Connections
2. Right Click onOBJECT_MOVE table,  
2. Select Export 
3. Export LCF.OBJECT_MOVE to E:\GIT\dip\data_management_factory\load_control_framework\load_OMOVE_batch<n_env>.sql
4. OBJECT_MOVE DDL and a bunch of insert statements will be generated and written to the above file.


/***********************************************************************************************/
-- Load the object registration data to the target database
/***********************************************************************************************/

-- Open SQL Developer, connect to the target database. e.g. test or prod

-- In SQL Developer, while connected to the target database run 
drop table LCF.OBJECT_MOVE;

load_OMOVE_<batch_num>_TEST.sql
COMMIT; 


/***********************************************************************************************/
-- Load the object registration data to the target database
/***********************************************************************************************/

select * FROM LCF.OBJECT_MOVE ;
SELECT * FROM SRC_TGT_SCHEMA;

/***********************************************************************************************/
--Update target OBJECT_MOVE.SYSTEM_SCHEMA_KEY  - system_schema_key in the 3 environmens are different
/***********************************************************************************************/
UPDATE  OBJECT_MOVE OM
SET SYSTEM_SCHEMA_KEY=
(SELECT SYSTEM_SCHEMA_KEY FROM SRC_TGT_SCHEMA SS WHERE SS.SCHEMA_NAME=OM.SCHEMA_NAME);

commit;

--In the target database, run the SQL statement  to generate merge statements.

SELECT 
'MERGE INTO LCF.OBJECT   o
USING LCF.OBJECT_MOVE    om 
ON  ( o.SYSTEM_SCHEMA_KEY=om.SYSTEM_SCHEMA_KEY AND
      o.SOURCE_OBJECT_NAME =om.SOURCE_OBJECT_NAME
		 )
WHEN NOT MATCHED THEN 
INSERT  
(

SYSTEM_SCHEMA_KEY ,  
OBJECT_SHORT_NAME,
TARGET_DB,
SOURCE_OBJECT_NAME,
SOURCE_OBJECT_TYPE,
TARGET_OBJECT_NAME,
SAS_LIB_REF,
PK_COLUMN_NAMES,
NK_COLUMN_NAMES,
EXCLUDED_COLUMNS,   
LOAD_PATTERN_NAME,
SENSITIVE_DATA_FLAG,
RETENTION_KEY,
CUSTOM_SQL,  
CHANGE_CAPTURE_TIMESTAMP_COLUMN,
HISTORY_LOADED_FROM_TDW,
HISTORY_TYPE,
EFFECTIVE_FROM_TIMESTAMP_COLUMN,
EFFECTIVE_TO_TIMESTAMP_COLUMN,
EFFECTIVE_TIMESTAMP_GRAIN,
PURGE_GRAIN,
DUPLICATION_TIMESTAMP_GRAIN,
LAYER ,
PARTITION_KEY,
CREATED_BY,
CREATED_ON,
UPDATED_BY,
UPDATED_ON
) 
VALUES
'
||	
'(
om.SYSTEM_SCHEMA_KEY,  
om.OBJECT_SHORT_NAME,
om.TARGET_DB ,
om.SOURCE_OBJECT_NAME,
om.SOURCE_OBJECT_TYPE,
om.TARGET_OBJECT_NAME,
om.SAS_LIB_REF,
om.PK_COLUMN_NAMES,
om.NK_COLUMN_NAMES,
om.EXCLUDED_COLUMNS,   
om.LOAD_PATTERN_NAME,
om.SENSITIVE_DATA_FLAG ,
om.RETENTION_KEY,
om.CUSTOM_SQL ,  
om.CHANGE_CAPTURE_TIMESTAMP_COLUMN ,
om.HISTORY_LOADED_FROM_TDW,
om.HISTORY_TYPE,
om.EFFECTIVE_FROM_TIMESTAMP_COLUMN,
om.EFFECTIVE_TO_TIMESTAMP_COLUMN,
om.EFFECTIVE_TIMESTAMP_GRAIN,
om.PURGE_GRAIN,
om.DUPLICATION_TIMESTAMP_GRAIN,
om.LAYER ,
om.PARTITION_KEY ,
om.CREATED_BY ,
om.CREATED_ON ,
om.UPDATED_BY ,
om.UPDATED_ON  )
WHEN MATCHED THEN
UPDATE  SET 
TARGET_OBJECT_NAME                   = TARGET_OBJECT_NAME            , 
OBJECT_SHORT_NAME                    = OBJECT_SHORT_NAME             ,
TARGET_DB                            = TARGET_DB                     ,
SOURCE_OBJECT_TYPE                   = SOURCE_OBJECT_TYPE            ,
SAS_LIB_REF                          = SAS_LIB_REF                   ,
PK_COLUMN_NAMES                      = PK_COLUMN_NAMES               ,
NK_COLUMN_NAMES                      = NK_COLUMN_NAMES               ,
EXCLUDED_COLUMNS                     = EXCLUDED_COLUMNS              ,   
LOAD_PATTERN_NAME                    = LOAD_PATTERN_NAME             ,
SENSITIVE_DATA_FLAG                  = SENSITIVE_DATA_FLAG           ,
RETENTION_KEY                        = RETENTION_KEY           ,
CUSTOM_SQL                           = CUSTOM_SQL                        ,  
CHANGE_CAPTURE_TIMESTAMP_COLUMN      = CHANGE_CAPTURE_TIMESTAMP_COLUMN   ,
HISTORY_LOADED_FROM_TDW              = HISTORY_LOADED_FROM_TDW           ,
HISTORY_TYPE                         = HISTORY_TYPE                      ,
EFFECTIVE_FROM_TIMESTAMP_COLUMN      = EFFECTIVE_FROM_TIMESTAMP_COLUMN   ,
EFFECTIVE_TO_TIMESTAMP_COLUMN        = EFFECTIVE_TO_TIMESTAMP_COLUMN     ,
EFFECTIVE_TIMESTAMP_GRAIN            = EFFECTIVE_TIMESTAMP_GRAIN         ,
PURGE_GRAIN                          = PURGE_GRAIN                       ,
DUPLICATION_TIMESTAMP_GRAIN          = DUPLICATION_TIMESTAMP_GRAIN       ,
LAYER                                = LAYER                             ,
PARTITION_KEY                        = PARTITION_KEY                     ,
CREATED_BY                           = CREATED_BY                        ,
CREATED_ON                           = CREATED_ON                        ,
UPDATED_BY                           = UPDATED_BY                        ,
UPDATED_ON                           = UPDATED_ON                        
WHERE 
	( 
	  om.SOURCE_OBJECT_NAME =o.SOURCE_OBJECT_NAME AND  
    om.SYSTEM_SCHEMA_KEY =o.SYSTEM_SCHEMA_KEY
    );'
FROM OBJECT_MOVE om
where rownum=1;

--Copy the generated output and run it into the SQL Developer screen of the target database as a statement (running as a script may strip out the spaces). You may need to remove the "  " around the generated SQL before runnint it.


COMMIT;

/***********************************************************************************************/
--Check Object table has got the correct registration details. Check the target_db, system_schema_key which are normally affected by move from env to env
/***********************************************************************************************/
SELECT * 
FROM  OBJECT
WHERE  source_object_name IN 
(
'TBLNZ_INCOME',
'CORRESPONDENCE_INBOUND',
'TBLADDRESSPROFILE',
'TBLCUSTOMEREMAIL',
'TBLEMAIL',
'TBLEMAILS',
'TBLMAILCATEGORY',
'TBLMAILTEMPLATE',
'TBLMAILTYPE',
'TBLNZ_AUDCASETOCUSTOMER',
'TBLNZ_EOTATTRIBUTES',
'TBLNZ_FAMABATEMENTS',
'TBLNZ_FAMINCOMECALCULATION',
'TBLNZ_FAMINCOMEDETAILS',
'TBLNZ_FAMRELATIONSHIPPERIODS',
'TBLNZ_ICABALANCE',
'TBLNZ_INCOMEBENATTRIBUTES',
'TBLNZ_INCOMEBUSATTRIBUTES',
'TBLNZ_INCOMEDWTATTRIBUTES',
'TBLNZ_INCOMELTCATTRIBUTES',
'TBLNZ_MSDWAGESUBSIDY',
'TBLNZ_RTNFIF',
'TBLNZ_RTNFIFINC',
'TBLNZ_RTNICAANN',
'TBLNZ_RTNIPSEINCOMEINFO',
'TBLNZ_RTNIPSELINEITEM',
'TBLNZ_RTNMACAMAFDP',
'TBLNZ_RTNNRTE',
'TBLNZ_RTNNRTS',
'TBLNZ_RTNPIEANN',
'TBLNZ_RTNPRSSUMMARY',
'TBLNZ_RTNRLTSUMMARY',
'TBLNZ_RTNSOA',
'TBLNZ_SUMMARYOFEARNINGS',
'TBLNZ_VISITOUTBOUNDCALL',
'TBLTASKGROUPQUEUE',
'TBLTRANSADJUSTDETAIL',
'TBLTRANSSTAGE',
'TBLUSERINFO',
'TBLVISITACTION',
'LANNZ_CORRIESORT',
'LANTITLEUSER',
'LANUSER',
'LANWEBREQTYPE',
'TBLNZ_CLIENTLISTTOWEBLOGON',
'TBLNZ_WEBLOGONPASSWORDRESET',
'TBLNZ_WEBLOGONRESERVED',
'TBLNZ_WEBNOTICENOTIFICATION',
'TBLWEBNOTICEEMAIL',
'TBLNZ_FAMENTITLEMENTPERIODS',
'TBLNZ_FAMPROTECTEDFTC',
-- TDW tables
'TBL_NZ_ICABALANCE',
'TBL_NZ_RTNFIF',
'TBL_NZ_RTNFIFINC',
'TBL_NZ_RTNICAANN',
'TBLNZ_RTNNRTE',
'TBL_NZ_RTNNRTS',
'TBL_NZ_RTNPRSSUMMARY',
'TBLNZ_RTNRLTSUMMARY',
'TBL_USERINFO'
);

--UPDATE object SET LAYER='RAW' where target_db like 'dev_raw%';
--COMMT;


	UPDATE 	LCF.OBJECT_MOVE om
	SET 	OBJECT_KEY=(SELECT o.OBJECT_KEY
						FROM OBJECT o
						WHERE om.SOURCE_OBJECT_NAME=o.SOURCE_OBJECT_NAME AND om.SYSTEM_SCHEMA_KEY=o.SYSTEM_SCHEMA_KEY and  om.SAS_LIB_REF=o.SAS_LIB_REF);

COMMIT;

/***********************************************************************************************/
--The End
/***********************************************************************************************/
