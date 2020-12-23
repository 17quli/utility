%macro source_table_structures(src_engine=, src_connect =)/ minoperator mindelimiter=',';
/*
Extracts metadata of Source tables from ORACLE and SQL data sources and populates
LCF.ALL_SOURCE_COLUMNS 
    

====================================================================
Change History in REVERSE CHRONOLOGICAL ORDER

Date      Who               what

29/05/2020 Nalaka Lamahewa  first written
=======================================================================*/

%let Datasrc=;
%global job_rc trans_rc sqlrc;
%let sysrc = 0;
%let job_rc = 0;
%let trans_rc = 0;
%let sqlrc = 0;

%if  &src_engine.=ORACLE %then
%do;
   proc sql;
      connect to oracle
      ( 
             &src_connect.
       );
       create table tbl_str1 as
      select * 
      from connection to oracle
      ( 
      SELECT 
	   'ORACLE' AS SYSTEM_TYPE   ,  
	   CASE
	     WHEN dt.OWNER ='TDW' THEN
	        'TDW'
	     ELSE 'EDW'
	  END AS	  SYSTEM_NAME   ,
       dt.OWNER as TABLE_CATALOG    ,
	   dt.OWNER as Tbl_CATALOG1,
       dt.TABLE_NAME AS TABLE_NAME     ,
	   dtc.COLUMN_NAME AS COLUMN_NAME      ,	
	   dtc.data_type AS DATA_TYPE    ,
	   dtc.DATA_LENGTH AS CHARACTER_MAXIMUM_LENGTH    , 
	   dtc.DATA_PRECISION AS NUMERIC_PRECISION     , 
	   dtc.DATA_SCALE  AS NUMERIC_SCALE    ,
	   dtc.NULLABLE AS IS_NULLABLE     , 
	   dtc.COLUMN_ID   AS ORDINAL_POSITION    ,
	   CASE 
          WHEN acc.POSITION IS NOT NULL THEN 'Y' 
          ELSE 'N' 
       END AS PK_FLAG   

      FROM
       ALL_TABLES dt 
	   INNER JOIN
	   ALL_TAB_COLUMNS dtc 
	   ON 
		   dt.OWNER = dtc.OWNER
		   AND
		   dt.TABLE_NAME = dtc.TABLE_NAME
	   LEFT JOIN
	   ALL_CONSTRAINTS ac
	   ON 
		   ac.CONSTRAINT_TYPE = 'P'
		   AND
		   dt.OWNER = ac.OWNER
		   AND
		   dt.TABLE_NAME = ac.TABLE_NAME
	   LEFT JOIN
	   ALL_CONS_COLUMNS acc 
	   ON 
	   	ac.CONSTRAINT_NAME = acc.CONSTRAINT_NAME
		   AND
		   dt.OWNER = acc.OWNER
		   AND
		   dt.TABLE_NAME = acc.TABLE_NAME
		   AND
		   dtc.COLUMN_NAME = acc.COLUMN_NAME
       ORDER BY dt.TABLE_NAME, dtc.COLUMN_ID
      ); 
     disconnect from oracle; 
   quit;
%end;   
%else %if &src_engine.=SQLSVR %then
%do;
   %let src_connect=%upcase(&src_connect);
   %put &=src_connect;
   %LET POS=%index(&src_connect, DATASRC);
   %PUT &=POS;
   %let Datasrc= %scan(%scan(%substr(&src_connect,&pos),2,=),1);
   %put &=Datasrc.;
   proc sql;
      connect to SQLSVR
      (&src_connect.);
      create table tbl_str1 as
	  select * from connection to SQLSVR
      (SELECT
	  'MSSQL' AS SYSTEM_TYPE    , 
	  CONCAT(substring(t.TABLE_CATALOG,3,1) , right(t.TABLE_CATALOG,3))
      AS SYSTEM_NAME  ,
      concat(t.TABLE_CATALOG, '.',t.TABLE_SCHEMA) as TABLE_CATALOG  ,
	  t.TABLE_CATALOG as Tbl_CATALOG1,
	  t.TABLE_NAME AS TABLE_NAME  ,
	  c.COLUMN_NAME AS COLUMN_NAME   ,	 
	  c.DATA_TYPE AS DATA_TYPE  ,
	  c.CHARACTER_MAXIMUM_LENGTH AS CHARACTER_MAXIMUM_LENGTH   ,
	  c.NUMERIC_PRECISION AS  NUMERIC_PRECISION   ,
	  c.NUMERIC_SCALE AS NUMERIC_SCALE    ,
	  c.IS_NULLABLE AS IS_NULLABLE    ,
	  c.ORDINAL_POSITION AS ORDINAL_POSITION   ,
	  CASE 
	     WHEN (kcu.ORDINAL_POSITION IS NOT NULL) THEN
	        'Y'
	     ELSE 'N' 
	  END AS PK_FLAG  
      FROM 
		&Datasrc..information_schema.tables t INNER JOIN
        &Datasrc..information_schema.columns c ON 
        t.TABLE_CATALOG=c.TABLE_CATALOG 
        AND t.TABLE_SCHEMA=c.TABLE_SCHEMA 
        AND t.TABLE_NAME=c.TABLE_NAME
        LEFT JOIN
        &Datasrc..information_schema.key_column_usage kcu ON 
		t.TABLE_CATALOG=kcu.TABLE_CATALOG AND
        t.TABLE_SCHEMA=kcu.TABLE_SCHEMA AND 
		t.TABLE_NAME=kcu.TABLE_NAME AND 
        c.COLUMN_NAME=kcu.COLUMN_NAME AND 
        OBJECTPROPERTY(OBJECT_ID(kcu.CONSTRAINT_SCHEMA + '.' + QUOTENAME(kcu.CONSTRAINT_NAME)), 
		'IsPrimaryKey')=1
		 
		 );
	  disconnect from SQLSVR;
   quit;
%end;

PROC SQL;
   CREATE TABLE tbl_str2
   AS SELECT 
      STS.SYSTEM_SCHEMA_KEY AS SCHEMA_KEY LENGTH=8  , 
	  TBS.SYSTEM_NAME as SYSTEM_NAME LENGTH=30  ,
      TBS.SYSTEM_TYPE  as SYSTEM_TYPE LENGTH=30  ,
	  TBS.TABLE_CATALOG as TABLE_CATALOG LENGTH=800,
      TBS.TABLE_NAME as TABLE_NAME LENGTH=500  ,
	  TBS.COLUMN_NAME as COLUMN_NAME LENGTH=500   ,	 
	  TBS.DATA_TYPE as DATA_TYPE LENGTH=500  ,
	  TBS.CHARACTER_MAXIMUM_LENGTH as CHARACTER_MAXIMUM_LENGTH LENGTH=8   ,
	  TBS.NUMERIC_PRECISION as NUMERIC_PRECISION LENGTH=8   ,
	  TBS.NUMERIC_SCALE as NUMERIC_SCALE LENGTH=8   ,
	  TBS.IS_NULLABLE  as IS_NULLABLE LENGTH=5   ,
	  TBS.ORDINAL_POSITION  as ORDINAL_POSITION  LENGTH=8 ,
	  TBS.PK_FLAG as PK_FLAG LENGTH=1 
   FROM tbl_str1 TBS
   LEFT JOIN 
   LCF.SRC_TGT_SCHEMA STS
   ON STS.SCHEMA_NAME=tbl_str1.Tbl_CATALOG1
   where TABLE_CATALOG not in ( 'CTXSYS','EXFSYS','MDSYS','SYS','SYSTEM','XDB');
quit;   
   
%if %sysfunc(exist(all_sources)) %then 
%do;
   proc append base=all_sources data=tbl_str2 ;
  quit;
%end;
%else
%do;
   data all_sources;
      set tbl_str2 ;    
	  format  _all_ ;
	  informat _all_;
   run;
%end;
%mend;
