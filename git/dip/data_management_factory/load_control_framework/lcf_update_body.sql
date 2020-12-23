 CREATE OR REPLACE PACKAGE BODY     LCF_UPDATE IS

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
  13/12/19 SDZ Updated the way we derive the prefix for target table name e.g. STRAPP - APP, STRREF - REF
  03/02/20 SDZ Remove the above prefix change and added code to handle all start systems - this is a interim fix until we move to Apex
  04/02/20 SDZ Remove references to LCF_LOG. We will only display messages on the screen
  10/02/20 SDZ Update merge statement to reference new LCF.EXTRACT_OBJECT.CREATED_ON field, update validations to check on LAYER='RAW'
  11/02/20 SDZ Move generic system_Schema name to system_schema table so that we do not have to hard code the table prefixes bases on the sas lib ref name
  27/03/20 SDZ Add eo.SYSTEM_SCHEMA_KEY=o.SYSTEM_sCHEMA_KEY to the update statement that updates extract_object and set object_key to avoid duplicate object_keys picked up from object 
  08/04/20 SDZ Remove references to LCF.OBJECT, LCF.DATA_DOMAIN_BRIDGE, LCF.SUB_DOMAIN. These tables are replaced by DATA_DOMAIN or DATA_DOMAIN_REL
  25/04/20 SDZ Remove references to LCF.SYSTEM_SCHEMA, update code for latest OBJECT structural changes



  

  

  
  

  
  
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
lv_row_count10 NUMBER:=0;
lv_row_count11 NUMBER:=0;
lv_row_count12 NUMBER:=0;
lv_row_count99 NUMBER:=0;

VALIDATION_FAILED EXCEPTION;

BEGIN

DBMS_OUTPUT.PUT_LINE( 'Validating the table registration data'); 


 
/*--------------------------------------------------------------------------------*/
 
 SELECT COUNT(*) 
 INTO lv_row_count1
 FROM LCF.EXTRACT_OBJECT
 WHERE NK_COLUMN_NAMES IS NULL AND LAYER='RAW';
 
  IF lv_row_count1 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'NK_COLUMN_NAMES is null'); 

    RAISE VALIDATION_FAILED;
  END IF;
/*--------------------------------------------------------------------------------*/
 SELECT COUNT(*) 
 INTO lv_row_count2
 FROM LCF.EXTRACT_OBJECT
 WHERE LOAD_PATTERN_NAME in ('CHANGEEXTRACT','EVENTEXTRACT') AND 
 CHANGE_CAPTURE_TIMESTAMP_COLUMN IS NULL
 AND LAYER='RAW';
 
 IF lv_row_count2 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'For Change/Event Extract EFFECTIVE_TIMESTAMP_COLUMN must not be null'); 
    
    RAISE VALIDATION_FAILED;
 END IF;
  
 /*--------------------------------------------------------------------------------*/
SELECT COUNT(*)
INTO lv_row_count5
FROM  LCF.EXTRACT_OBJECT
WHERE INSTR(EXCLUDED_COLUMNS,NK_COLUMN_NAMES) >1
AND LAYER='RAW';


 IF lv_row_count3 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'Natural keys are in excluded columns'); 
   
    RAISE VALIDATION_FAILED;
 END IF;
 /*--------------------------------------------------------------------------------*/  
SELECT COUNT(*)
INTO lv_row_count3
FROM  LCF.EXTRACT_OBJECT
WHERE INSTR(EXCLUDED_COLUMNS,CHANGE_CAPTURE_TIMESTAMP_COLUMN) >1 AND LAYER='RAW' ;


 IF lv_row_count4 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'Effective_timestamp_columns are in excluded columns'); 
    
    RAISE VALIDATION_FAILED;
 END IF;
/*--------------------------------------------------------------------------------*/
SELECT COUNT(*)
INTO lv_row_count4
FROM  LCF.EXTRACT_OBJECT
WHERE INSTR(EXCLUDED_COLUMNS,PK_COLUMN_NAMES) >1 AND LAYER='RAW' ;


 IF lv_row_count4 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'Primary Keys are in excluded columns'); 
   
    RAISE VALIDATION_FAILED;
 END IF;
/*--------------------------------------------------------------------------------*/
SELECT COUNT(*)
INTO lv_row_count5
FROM  LCF.EXTRACT_OBJECT
WHERE CHANGE_CAPTURE_TIMESTAMP_COLUMN IS NOT NULL 
AND LOAD_PATTERN_NAME 
NOT IN  ('CHANGEEXTRACT','EVENTEXTRACT','BATCHEXTRACT')  AND LAYER='RAW' ;


 IF lv_row_count5 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'Effective timestamp column set  for FULLCOMPARISON'); 
   
    RAISE VALIDATION_FAILED;
 END IF;
/*--------------------------------------------------------------------------------*/

SELECT COUNT(*)
INTO lv_row_count6
FROM  LCF.EXTRACT_OBJECT
WHERE PK_COLUMN_NAMES IS  NULL AND LOAD_PATTERN_NAME =   'FULLCOMAPRISON' AND LAYER='RAW' ;


 IF lv_row_count6 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'Primary Key Columns are NULL for  FullCompairson'); 
       
    RAISE VALIDATION_FAILED;
 END IF;
 
/*--------------------------------------------------------------------------------*/ 
SELECT COUNT(*)
INTO lv_row_count7
FROM  LCF.EXTRACT_OBJECT
WHERE DATA_DOMAIN IS NULL AND LAYER='RAW';


 IF lv_row_count7 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'Domain.subdomain NULL for some rows');
    
 END IF;
 /*--------------------------------------------------------------------------------*/ 
 



/*WITH  DOMINFO (DOM_SUBDOM)
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
INSTR(DOMINFO.DOM_SUBDOM,X.DATA_DOMAIN) <1;*/




WITH  DOMINFO (DOM_SUBDOM)
AS 
(SELECT TO_CHAR(DBMS_XMLGEN.CONVERT(RTRIM (XMLAGG (XMLELEMENT (e, PRIMARY_DOMAIN_NAME||'.'||SUB_DOMAIN_NAME|| ',') ORDER BY PRIMARY_DOMAIN_NAME  ).extract ('//text()').GetClobVal(),','),1)) DOM_SUBDOM
 FROM  DATA_DOMAIN)
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
   
     
    RAISE VALIDATION_FAILED;
 END IF;
/*--------------------------------------------------------------------------------*/ 
SELECT  COUNT(*)
INTO lv_row_count10
FROM EXTRACT_OBJECT
WHERE LOAD_PATTERN_NAME='CHANGEEXTRACT' AND HISTORY_TYPE='H1'  AND DUPLICATION_TIMESTAMP_GRAIN IS NULL;

 IF lv_row_count10 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'DUPLICATON_TIMESTAMP_GRAIN IS NULL P2H1'); 
    
    
    COMMIT;
     
    RAISE VALIDATION_FAILED;
 END IF; 
 
/*--------------------------------------------------------------------------------*/ 
 
SELECT  COUNT(*)
INTO lv_row_count11
FROM EXTRACT_OBJECT
WHERE (LOAD_PATTERN_NAME='CHANGEEXTRACT' AND HISTORY_TYPE='H1' ) AND NK_COLUMN_NAMES LIKE '%FLNGVER%';


 IF lv_row_count11 >=1 THEN    
    RAISE VALIDATION_FAILED;
 END IF; 


/*--------------------------------------------------------------------------------*/
SELECT  COUNT(*)
INTO lv_row_count12
FROM EXTRACT_OBJECT
WHERE (LOAD_PATTERN_NAME='BATCHEXTRACT') AND 
(EFFECTIVE_FROM_TIMESTAMP_COLUMN IS NULL OR 
 EFFECTIVE_TO_TIMESTAMP_COLUMN IS NULL OR 
 EFFECTIVE_TIMESTAMP_GRAIN IS NULL OR 
 PURGE_GRAIN IS NULL OR 
 CHANGE_CAPTURE_TIMESTAMP_COLUMN  IS NULL);

 IF lv_row_count12 >=1 THEN 
    DBMS_OUTPUT.PUT_LINE( 'EFFECTIVE_FROM_TIMESTAMP_COLUMN,EFFECTIVE_TO_TIMESTAMP_COLUMN,EFFECTIVE_TIMESTAMP_GRAIN , PURGE_GRAIN are mandatory fields for BATCHEXTRACT '); 
  
  
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
  

  
    
	 DBMS_OUTPUT.PUT_LINE('Starting UPDATE_OBJ');

	
  
	DBMS_OUTPUT.PUT_LINE('Validating incoming parameters to UPDATE_OBJ');

	IF (p_INITIALIZE ='N' AND 
		p_system_schema_key IS NULL AND
		p_SOURCE_OBJECT_NAME IS NULL) THEN
		RAISE PARAMETERS_NULL; 
	  
	END IF;   

	
	DBMS_OUTPUT.PUT_LINE('Updating EXTRACT_OBJECT system_key, object_key');
  
-- Find the correct SYSTEM_SCHEMA_KEY for the SYSTEM_TYPE, SCHEMA_NAME and SYSTEM_KEY and update EXTRACT_OBJECT


	UPDATE LCF.EXTRACT_OBJECT   eo
	SET (SYSTEM_SCHEMA_KEY)=
	(
  SELECT DISTINCT schm.system_schema_key
	FROM  SRC_TGT_SCHEMA schm
  JOIN  SRC_TGT_SYSTEM syst
  ON syst.SYSTEM_KEY=schm.SYSTEM_KEY
	WHERE syst.SYSTEM_TYPE=eo.SYSTEM_TYPE
	AND schm.SCHEMA_NAME=eo.SCHEMA_NAME)
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
	FROM  SRC_TGT_SCHEMA schm
  JOIN  SRC_TGT_SYSTEM syst
  ON syst.SYSTEM_KEY=schm.SYSTEM_KEY
	WHERE syst.SYSTEM_TYPE=eo.SYSTEM_TYPE
	AND schm.SCHEMA_NAME=eo.SCHEMA_NAME);
  
  COMMIT;

  
  UPDATE  LCF.EXTRACT_OBJECT eo
	SET SCHEMA_PREFIX= (SELECT DISTINCT SCHEMA_PREFIX 
  FROM  SRC_TGT_SCHEMA schm
  JOIN  SRC_TGT_SYSTEM syst
  ON syst.SYSTEM_KEY=schm.SYSTEM_KEY
	WHERE syst.SYSTEM_TYPE=eo.SYSTEM_TYPE
	AND schm.SCHEMA_NAME=eo.SCHEMA_NAME);


  COMMIT;
      
-- Update the EXTRACT_OBJECT.OBJECT_KEY from OBJECT (first time no objects are updated)

	UPDATE 	LCF.EXTRACT_OBJECT eo
	SET 	OBJECT_KEY=(SELECT o.OBJECT_KEY
						FROM OBJECT  O
						WHERE eo.SOURCE_OBJECT_NAME=o.SOURCE_OBJECT_NAME  AND eo.SYSTEM_SCHEMA_KEY=o.SYSTEM_SCHEMA_KEY  AND o.SAS_LIB_REF=eo.SAS_LIB_REF );

 
 

 
--COMMIT;


  
	DBMS_OUTPUT.PUT_LINE('Updating EXTRACT_OBJECT retention_key');

-- Updaet EXTRACT_OBJECT.RETENTION_KEY 

-- Update EXTRACT_OBJECT.RETENTION_KEY 

	UPDATE LCF.EXTRACT_OBJECT eo 
	SET RETENTION_KEY=
	(SELECT RETENTION_KEY
   FROM RETENTION_PERIOD rp 
	 WHERE rp.RETENTION_NUM_DAYS=EO.RETENTION_PERIOD);

	
   
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
  PARTITION_KEY                             ,
	CREATED_ON              								,
	CREATED_BY                   ,
  LAYER
	)
	VALUES
	   (
	eo.SYSTEM_SCHEMA_KEY,                                                          
	CASE WHEN EO.TARGET_OBJECT_SHORT_NAME IS NOT NULL THEN 		NVL(eo.schema_prefix,eo.SYSTEM_NAME)||'_'||eo.TARGET_OBJECT_SHORT_NAME 	ELSE NVL(eo.schema_prefix,eo.SYSTEM_NAME)||'_'||EO.SOURCE_OBJECT_NAME  END  		,
  /*CASE WHEN EO.TARGET_OBJECT_SHORT_NAME IS NOT NULL AND LAYER='RAW' THEN NVL(eo.GENERIC_SYSTEM_NAME,eo.SYSTEM_NAME)||'_'||eo.TARGET_OBJECT_SHORT_NAME 	
      WHEN EO.TARGET_OBJECT_SHORT_NAME IS NOT NULL AND LAYER='REFINED' THEN eo.TARGET_OBJECT_SHORT_NAME
     ELSE NVL(eo.GENERIC_SYSTEM_NAME,eo.SYSTEM_NAME)||'_'||EO.TARGET_OBJECT_SHORT_NAME  END  */		
  eo.TARGET_OBJECT_SHORT_NAME ,                          	
	NVL(eo.TARGET_DB,'&p_env'||'_raw')                    	,
	eo.SOURCE_OBJECT_NAME  ,
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
  eo.PARTITION_KEY                                        ,
	eo.CREATED_ON                                       	  ,
	eo.CREATED_BY                ,
  eo.LAYER
	)
	WHEN MATCHED THEN
	UPDATE  SET  
--	o.TARGET_OBJECT_NAME                = CASE WHEN TARGET_OBJECT_SHORT_NAME IS NOT NULL THEN NVL(eo.GENERIC_SYSTEM_NAME,eo.SYSTEM_NAME)||'_'||TARGET_OBJECT_SHORT_NAME ELSE NVL(eo.GENERIC_SYSTEM_NAME,eo.SYSTEM_NAME)||'_'||eo.SOURCE_OBJECT_NAME END  , 
  o.TARGET_OBJECT_NAME    =                                                         
	CASE WHEN EO.TARGET_OBJECT_SHORT_NAME IS NOT NULL THEN 		NVL(eo.SCHEMA_PREFIX,eo.SYSTEM_NAME)||'_'||eo.TARGET_OBJECT_SHORT_NAME 	ELSE NVL(eo.SCHEMA_PREFIX,eo.SYSTEM_NAME)||'_'||EO.SOURCE_OBJECT_NAME  END  		,
  /*CASE WHEN EO.TARGET_OBJECT_SHORT_NAME IS NOT NULL AND LAYER='RAW' THEN NVL(eo.GENERIC_SYSTEM_NAME,eo.SYSTEM_NAME)||'_'||eo.TARGET_OBJECT_SHORT_NAME 	WHEN EO.TARGET_OBJECT_SHORT_NAME IS NOT NULL AND LAYER='REFINED' THEN eo.TARGET_OBJECT_SHORT_NAME
     ELSE NVL(eo.GENERIC_SYSTEM_NAME,eo.SYSTEM_NAME)||'_'||EO.TARGET_OBJECT_SHORT_NAME  END, */    
  o.OBJECT_SHORT_NAME                 = eo.TARGET_OBJECT_SHORT_NAME  ,      
  o.SOURCE_OBJECT_NAME=  eo.SOURCE_OBJECT_NAME ,
	o.SAS_LIB_REF                       =eo.SAS_LIB_REF							                   ,
	o.NK_COLUMN_NAMES                   =eo.NK_COLUMN_NAMES                    	       ,    
	o.PK_COLUMN_NAMES                   =eo.PK_COLUMN_NAMES                    	       ,   
	o.EXCLUDED_COLUMNS                  =eo.EXCLUDED_COLUMNS                           ,        
	o.LOAD_PATTERN_NAME                 =UPPER(eo.LOAD_PATTERN_NAME)           	       ,
	o.CUSTOM_SQL                        =eo.CUSTOM_SQL                         	       ,      
  o.CHANGE_CAPTURE_TIMESTAMP_COLUMN   =substr(eo.CHANGE_CAPTURE_TIMESTAMP_COLUMN,1,50)            ,
	o.EFFECTIVE_FROM_TIMESTAMP_COLUMN 	=substr(eo.EFFECTIVE_FROM_TIMESTAMP_COLUMN,1,50)			       ,
  o.EFFECTIVE_TO_TIMESTAMP_COLUMN     =eo.EFFECTIVE_TO_TIMESTAMP_COLUMN				       ,
  o.EFFECTIVE_TIMESTAMP_GRAIN         =eo.EFFECTIVE_TIMESTAMP_GRAIN                  ,    
  o.PURGE_GRAIN                       =eo.PURGE_GRAIN                                ,   
  o.DUPLICATION_TIMESTAMP_GRAIN       =eo.DUPLICATION_TIMESTAMP_GRAIN                , 
  o.TARGET_DB                         = nvl(eo.TARGET_DB,'&p_env'||'_raw')           ,
  o.SENSITIVE_DATA_FLAG               =eo.SENSITIVE_DATA_FLAG                        ,
	o.HISTORY_TYPE     			            =eo.HISTORY_TYPE							                 ,
	o.HISTORY_LOADED_FROM_TDW 	        =eo.HISTORY_LOADED_FROM_TDW				             ,
  o.PARTITION_KEY                     =eo.PARTITION_KEY                              ,
	o.CREATED_BY                        =eo.CREATED_BY                         	       ,
	o.CREATED_ON                      =eo.CREATED_ON  						                   ,   
	o.RETENTION_KEY                     =eo.RETENTION_KEY                              ,
  o.LAYER                             =eo.LAYER
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
						WHERE eo.SOURCE_OBJECT_NAME=o.SOURCE_OBJECT_NAME AND eo.SYSTEM_SCHEMA_KEY=o.SYSTEM_SCHEMA_KEY and  o.SAS_LIB_REF=eo.SAS_LIB_REF);




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

UPDATE DATA_DOMAIN_EXPANDED dde
SET DATA_DOMAIN_KEY=
      (SELECT DATA_DOMAIN_KEY 
       FROM LCF.DATA_DOMAIN dd 
       WHERE  dd.PRIMARY_DOMAIN_NAME= TO_CHAR(SUBSTR(dde.DATA_DOMAIN,1,INSTR(dde.DATA_DOMAIN,'.')-1)) AND
              dd.SUB_DOMAIN_NAME   = TO_CHAR(SUBSTR(dde.DATA_DOMAIN,INSTR(dde.DATA_DOMAIN,'.')+1)) );

--COMMIT;
  

/* Update DATA_DOMAIN_EXPANDED.DOMAIN_OBJEC__REL_KEY Before Merge*/

	UPDATE LCF.DATA_DOMAIN_EXPANDED dde
	SET dde.DATA_DOMAIN_OBJECT_REL_KEY = 
                        (SELECT DISTINCT ddr.DATA_DOMAIN_OBJECT_REL_KEY 
                         FROM LCF.DATA_DOMAIN_OBJECT_REL ddr
	                       WHERE ddr.DATA_DOMAIN_KEY=dde.DATA_DOMAIN_KEY 
                         AND ddr.OBJECT_KEY=dde.OBJECT_KEY  
                         ) 
  ;


	--DBMS_OUTPUT.PUT_LINE('Updating DATA_DOMAIN_OBJECT_REL');*/
 

	MERGE INTO    LCF.DATA_DOMAIN_OBJECT_REL ddr 
	USING         LCF.DATA_DOMAIN_EXPANDED dde
	ON            (dde.DATA_DOMAIN_OBJECT_REL_KEY=ddr.DATA_DOMAIN_OBJECT_REL_KEY)
	WHEN          NOT MATCHED THEN
	INSERT   
	(OBJECT_KEY,
	 DATA_DOMAIN_KEY
	 ) 
	VALUES
	(dde.OBJECT_KEY,
	 dde.DATA_DOMAIN_KEY)
	WHEN MATCHED THEN 
	UPDATE SET
	 ddr.OBJECT_KEY=dde.OBJECT_KEY,
	 ddr.DATA_DOMAIN_KEY=dde.DATA_DOMAIN_KEY
	WHERE dde.DATA_DOMAIN_KEY=ddr.DATA_DOMAIN_KEY;



--COMMIT;

-- Update DATA_DOMAIN_EXPANDED.DATA_DOMAIN_OBJECT_REL_KEY After Merge

	UPDATE LCF.DATA_DOMAIN_EXPANDED dde
	SET dde.DATA_DOMAIN_OBJECT_REL_KEY = 
                        (SELECT DISTINCT ddr.DATA_DOMAIN_OBJECT_REL_KEY 
                         FROM LCF.DATA_DOMAIN_OBJECT_REL ddr
	                       WHERE ddr.DATA_DOMAIN_KEY=dde.DATA_DOMAIN_KEY 
                         AND ddr.OBJECT_KEY=dde.OBJECT_KEY  
                         ) 
  ;
  
  
--COMMIT;



  
	 DBMS_OUTPUT.PUT_LINE('Leaving UPDATE_OBJ ');

	EXCEPTION
 
    WHEN PARAMETERS_NULL THEN
   
    RAISE_APPLICATION_ERROR (-20004,' One or more incoming parameters are null, aborting ...' ); 
   
    
    WHEN MISSING_SYSTEM_SCHEMA_KEY THEN 

    RAISE_APPLICATION_ERROR (-20006,' Missing system_schema_keys found, aborting ...' ); 
    
    END;
    
   /* WHEN INVALID_DOMAIN  THEN
    RAISE_APPLICATION_ERROR (-20006,' Invalid Domain/Sub Domain supplied ' ); 
    INSERT INTO LCF.LCF_LOG (DESCRIPTION,LOG_TIME,USERID) VALUES ('-20006 Invalid Domain/Sub Domain supplied , aborting ...',sysdate,p_user);
    END;*/
END;

