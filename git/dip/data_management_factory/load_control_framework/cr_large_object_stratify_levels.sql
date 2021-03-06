-- 03062020 ird0sxd script created


/**********************************************************************************************
-- LARGE_OBJECT_STRATIFY_LEVELS
***********************************************************************************************/



  CREATE TABLE LCF.LARGE_OBJECT_STRATIFY_LEVELS 
   (	OBJECT_KEY NUMBER(10,0), 
	SOURCE_LIBRARY VARCHAR2(10 BYTE), 
	SOURCE_TABLE VARCHAR2(30 BYTE), 
	PERCENTILE NUMBER(10,0), 
	MIN_VALUE TIMESTAMP (6), 
	MAX_VALUE TIMESTAMP (6), 
	PERCENTILE_SUM NUMBER(10,0), 
	STRATIFY_COLUMN_NAME VARCHAR2(30 BYTE), 
	STRATIFICATION_TIMESTAMP TIMESTAMP (6), 
	 CONSTRAINT LARGE_OBJECT_STRATIFY_LEVELS_PK PRIMARY KEY (OBJECT_KEY, PERCENTILE);

ALTER TABLE LARGE_OBJECT_STRATIFY_LEVELS ADD CONSTRAINT LARGE_OBJECT_STRATIFY_LEVELS_PK PRIMARY KEY (OBJECT_KEY,PERCENTILE);

GRANT SELECT ON LARGE_OBJECT_STRATIFY_LEVELS TO RO_LCF_ROLE; 