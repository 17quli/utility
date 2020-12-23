
/*

Macro to  generate 
 
scripts to create  
  -impala target table
  - dev_raw_full_access view for a source table 
INPUTS:
    LCF.OBJECT
    LCF.SYSTEM_SCHEMAS

OUTPUT:
     "/sso/biconfig/940/Lev1/Logs/Validation_outputs/create_impala_tables.txt"
     "/sso/biconfig/940/Lev1/Logs/Validation_outputs/create_impala_full_access_views.txt"
  
====================================================================
Change History in REVERSE CHRONOLOGICAL ORDER

Date      Who               what

22/08/2019 Nalaka Lamahewa  first written
=====================================================================*/

%macro  create_table_view_sql_script(schema=,Object_Name= , Target_table_name= ,pattern=  ,table_num=1)/ minoperator mindelimiter=','; 
%put &=schema.;
/* max row count if source table is to be analyesed */
%let max_anl_row_cnt =2000000;
%let source_sys= ;
%let AUTHDOMAIN  =;
%let PATH  = ; 
%let Datasrc  = ;  
%let SYSTEM_NAME = ;
%let trgtblpfx= ;
%let schema =%upcase(&schema.);

%let pattern= '';
%if %sysfunc(exist(reg1)) %then 
%do;
   proc datasets lib=work nolist nodetails;
    delete reg:;
  quit;
%end;


%if   %upcase(&schema.) in (PROPERTY,DIA_DEATHS,COMPANIES)   %then
%do;
   %let source_sys=ORACLE_S;
   %let AUTHDOMAIN= alczr_prd;
   %let PATH=DIP_ALC.external;
   
   %If %upcase(&schema.)=PROPERTY %then
   %do;
      %let SYSTEM_NAME=PTY;
      %let trgtblpfx=pty_;
   %end;   
   %else %if %upcase(&schema.)=DIA_DEATHS %then
   %do;
      %let SYSTEM_NAME=DTH;
      %let trgtblpfx=dth_;  
   %end;  
   %else %if %upcase(&schema.)=COMPANIES %then
   %do;
      %let SYSTEM_NAME=CMP;
      %let trgtblpfx=cmp_;  
   %end;    
%end;
%else %if  %eval(%upcase(&schema.) in (DSS, 67AWCH,SXT4,BESSOWN,DSSMART,17THHO,SUMMARY))  %then
%do;
   %let source_sys=ORACLE_S;
   %let AUTHDOMAIN= edw_prod;
   %let PATH=DIP_VIP.external;
   
   %If %upcase(&schema.)=DSS %then
   %do;
      %let SYSTEM_NAME=DSS;
      %let trgtblpfx=dss_;  
   %end;
   %else %If %upcase(&schema.)=67AWCH %then
   %do;
      %let SYSTEM_NAME=WCH;
      %let trgtblpfx=wch_;  
   %end;
   %else %if %upcase(&schema.)=SXT4 %then
   %do;
      %let SYSTEM_NAME=XT4;
      %let trgtblpfx=xt4_;  
   %end;  
   %else %if %upcase(&schema.)=BESSOWN %then
   %do;
      %let SYSTEM_NAME=OWN;
      %let trgtblpfx=own_;  
   %end;  
   %else %if %upcase(&schema.)=DSSMART %then
   %do;
      %let SYSTEM_NAME=MRT;
      %let trgtblpfx=mrt_;  
   %end; 
   %else %if %upcase(&schema.)= SUMMARY   %then
   %do;
      %let SYSTEM_NAME=SMY;
      %let trgtblpfx=smy_;  
   %end;
   %else %if %upcase(&schema.)=17THHO %then%do;
      %let SYSTEM_NAME=HHO;
      %let trgtblpfx=hho_;  
   %end;  
        
%end; 
%else %if   %upcase(&schema.) in (NZO_GTAPP, NZO_GTFRD,NZO_GTREF,NZO_GTWRQ,NZO_GTSTC)   %then
%do;
   %let source_sys=MSSQL_S;
   %let AUTHDOMAIN= start_operations;
   %let Datasrc=&SCHEMA.;
   
   %if  %upcase(&schema.) = NZO_GTAPP  %then
   %do;
      %let SYSTEM_NAME=SAPP;
      %let trgtblpfx=app_; 
   %end;
   %else %If %upcase(&schema.)=NZS_GTAPP %then
   %do;
      %let SYSTEM_NAME=SAPP;
      %let trgtblpfx=app_; 
       %let AUTHDOMAIN= start_qual;
   %end;
   %else %if  %upcase(&schema.) = NZO_GTWRQ  %then
   %do;
      %let SYSTEM_NAME=SWRQ;
      %let trgtblpfx=wrq_;
      %let AUTHDOMAIN=start_operations ;
   %end;
   %else %if %upcase(&schema.)=NZO_GTFRD %then
   %do;
      %let SYSTEM_NAME=SFRD;
      %let trgtblpfx=frd_;  
   %end;  
   %else %if %upcase(&schema.)=NZO_GTREF %then
   %do;
      %let SYSTEM_NAME=SREF;
      %let trgtblpfx=ref_;  
   %end;  
   %else %if %upcase(&schema.)=NZO_GTSTC %then
   %do;
      %let SYSTEM_NAME=SSCT;
      %let trgtblpfx=sct_;  
   %end;   
   /*this line must be last*/
  
   %let SCHEMA=dbo;
%end;
%else
%do;
   %put "Invalid Schema name.  Please select one of the following or update the macro to include schema for new data soure:";
   %put "Schemas for ORACLE Sources:";
   %put "PROPERTY, DIA_DEATHS, COMPANIES, DSS, 67AWCH, SXT4, BESSOWN, DSSMART, 17THHO, SUMMARY";
 
   %put "Schemas for SQL Sources:";
   %put "NZO_GTAPP,NZO_GTFRD, NZO_GTREF, NZO_GTSTC, NZO_GTWRQ";
   %abort;
%end;

%let Object_Name=%upcase(&Object_Name.);

%let target= %lowcase(&trgtblpfx.&Object_Name.);
%if %eval(%sysfunc(length(&target)) > 32) %then
%do;
   %let target = %sysfunc(substr(&target,1,32));
%end;




%put &=AUTHDOMAIN.;
%put &=PATH.; 
%put &=Datasrc.;  
%put &=schema.;  
%put&=Object_Name.; 
%put &=target;
%put &=pattern;

%if  &source_sys.=ORACLE_S %then
%do;
   proc sql;
      connect to oracle
      ( 
             path=&path. readbuff=200000  authdomain=&authdomain.
         ); 
       create table reg1 as
      select * 
      from connection to oracle
      ( 
      SELECT 
	   'ORACLE' AS SYSTEM_TYPE, 
       dt.OWNER AS SCHEMA_NAME,
	   dt.TABLE_NAME AS OBJECT_NAME,
	   dt.num_rows,
	   dt.OWNER || '.' || dt.TABLE_NAME AS QUALIFIED_TN,
	   dtc.COLUMN_ID AS SEQUENCE,
	   dtc.COLUMN_NAME AS COLUMN_NAME,
	   CASE WHEN acc.POSITION IS NOT NULL THEN 'Y' ELSE 'N' END AS PK_IND,
	   dtc.NULLABLE AS COLUMN_NULLABLE,
	   dtc.DATA_TYPE AS COLUMN_DATA_TYPE,
	   dtc.DATA_DEFAULT,
	   dtc.DATA_LENGTH AS COLUMN_DATA_LENGTH, 
	   dtc.DATA_PRECISION, 
	   dtc.DATA_SCALE,
	   dt.TABLESPACE_NAME, 
	   dt.PARTITIONED,
	   CASE
          when dtc.data_type = 'NUMBER' AND (dtc.data_scale = 0 or dtc.data_scale is null) then 
             case 
                when dtc.DATA_PRECISION <10 then
                   dtc.COLUMN_NAME || ' ' || 'INT'||','
                else 
                   dtc.COLUMN_NAME || ' ' || 'BIGINT'||','
              end   
          when dtc.data_type = 'NUMBER' AND 0 <= dtc.data_scale AND dtc.data_scale <= dtc.DATA_PRECISION AND dtc.DATA_PRECISION <= 38  THEN
	          dtc.COLUMN_NAME || ' ' || 'DECIMAL(' || (dtc.DATA_PRECISION +dtc.data_scale +1) || ',' || dtc.data_scale || ')'||','
	      WHEN dtc.DATA_TYPE = 'NUMBER' AND 0 <= dtc.DATA_PRECISION AND dtc.DATA_PRECISION <= 38 AND dtc.data_scale < 0 AND dtc.DATA_PRECISION - dtc.data_scale <= 38 THEN 
	         dtc.COLUMN_NAME || ' ' || 'DECIMAL(' || dtc.DATA_PRECISION - dtc.data_scale || ',0)'||','
          WHEN dtc.DATA_TYPE = 'NUMBER' AND 0 <= dtc.DATA_PRECISION AND dtc.DATA_PRECISION < dtc.data_scale AND dtc.data_scale <= 38  THEN
             dtc.COLUMN_NAME || ' ' || 'DECIMAL(' || dtc.data_scale || ',' || dtc.data_scale || ')'||','
	      WHEN dtc.DATA_TYPE = 'FLOAT' THEN 
	         dtc.COLUMN_NAME || ' ' || 'DOUBLE' ||','
          WHEN dtc.DATA_TYPE = 'CLOB'  THEN 
             dtc.COLUMN_NAME || ' ' || 'STRING' ||','
          WHEN dtc.DATA_TYPE LIKE '%CHAR%'  THEN
             dtc.COLUMN_NAME || ' ' || 'VARCHAR(' || dtc.DATA_LENGTH *2 || ')' ||','
	      WHEN dtc.DATA_TYPE = 'DATE'THEN 
	         CASE 
	            WHEN dtc.COLUMN_NAME ='TIMESTAMP' THEN 
	                '`TIMESTAMP`' || ' ' || 'TIMESTAMP' ||','
	            ELSE
                    dtc.COLUMN_NAME || ' ' || 'TIMESTAMP' ||','
	         END   
          WHEN dtc.DATA_TYPE LIKE 'TIMESTAMP%'  THEN 
          CASE 
             WHEN dtc.COLUMN_NAME ='TIMESTAMP' THEN
                '`TIMESTAMP`' || ' ' || 'TIMESTAMP' ||','
		     ELSE
		        dtc.COLUMN_NAME || ' ' || 'TIMESTAMP' ||','
          END  
          ELSE 
             dtc.COLUMN_NAME || ' ' || 'UNMAPPED' ||','
          END AS IMPALA_NAME_DATATYPE,
         CASE WHEN  dtc.COLUMN_NAME ='TIMESTAMP' THEN
            'z.`'|| dtc.COLUMN_NAME||'`,'
         ELSE   
            'z.'|| dtc.COLUMN_NAME||','
         END AS IMPALA_COLS
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
      WHERE
	   upper(dt.TABLE_NAME) =%str(%')&Object_Name.%str(%')
       ORDER BY dt.TABLE_NAME, dtc.COLUMN_ID
      ); 
     disconnect from oracle; 
   quit;   
%end;
%else %if &source_sys.=MSSQL_S %then
%do;
   proc sql;
      connect to SQLSVR
      (Datasrc=&Datasrc. readbuff=32767 authdomain=&authdomain.);
      create table reg1 as
	  select * from connection to SQLSVR
      (SELECT
      'MSSQL' AS SYSTEM_TYPE, 
/*       upper(t.TABLE_SCHEMA) AS SCHEMA_NAME, */
      "&Datasrc." AS SCHEMA_NAME,
      upper(t.TABLE_NAME) AS OBJECT_NAME, 
	  c.ORDINAL_POSITION AS SEQ, 
	  upper(c.COLUMN_NAME) AS COLUMN_NAME, 
	  upper(c.DATA_TYPE) AS COLUMN_DATA_TYPE,
	  CASE 
	     WHEN (kcu.ORDINAL_POSITION IS NOT NULL) THEN
	        'Y'
	     ELSE 'N' 
	  END AS PK_IND,
	  CASE 
	     WHEN c.DATA_TYPE='tinyint' THEN 
	        CONCAT(c.COLUMN_NAME, ' SMALLINT', ',') 
         WHEN c.DATA_TYPE='smallint' THEN
            CONCAT(c.COLUMN_NAME, ' SMALLINT', ',') 
         WHEN c.DATA_TYPE='int' THEN 
            CONCAT(c.COLUMN_NAME, ' INT', ',') 
         WHEN  c.DATA_TYPE='bigint' THEN 
            CONCAT(c.COLUMN_NAME, ' BIGINT', ',') 
         WHEN c.DATA_TYPE='numeric' THEN
            CONCAT(c.COLUMN_NAME, ' DECIMAL(', 
            c.NUMERIC_PRECISION, ',', c.NUMERIC_SCALE, ')', ',') 
         WHEN c.DATA_TYPE='money' THEN
            CONCAT(c.COLUMN_NAME, ' DECIMAL(19,4)', ',') 
         WHEN c.DATA_TYPE='float' THEN 
         CONCAT(c.COLUMN_NAME, ' DOUBLE', ',') 
         WHEN c.DATA_TYPE='datetime' THEN
            CONCAT(c.COLUMN_NAME, ' TIMESTAMP', ',') 
         WHEN c.DATA_TYPE LIKE '%char%' AND 	c.CHARACTER_MAXIMUM_LENGTH <> -1 THEN 
            CONCAT(c.COLUMN_NAME, ' VARCHAR(', c.CHARACTER_MAXIMUM_LENGTH*2, '),')
         WHEN c.DATA_TYPE LIKE '%char%' AND  c.CHARACTER_MAXIMUM_LENGTH=-1 THEN
         CONCAT(c.COLUMN_NAME,' VARCHAR(32767)') 
         ELSE 
            CONCAT(c.COLUMN_NAME, ' UNMAPPED', ',') 
         END AS IMPALA_NAME_DATATYPE,
         CONCAT('z.',c.COLUMN_NAME,  ',') AS IMPALA_COLS
      FROM 
		&Datasrc..information_schema.tables t INNER JOIN
        &Datasrc..information_schema.columns c ON 
        t.TABLE_CATALOG=c.TABLE_CATALOG 
        AND t.TABLE_SCHEMA=c.TABLE_SCHEMA 
        AND t.TABLE_NAME=c.TABLE_NAME
        LEFT JOIN
        &Datasrc..information_schema.key_column_usage kcu ON 
		t.TABLE_CATALOG=kcu.TABLE_CATALOG AND t.TABLE_SCHEMA=kcu.TABLE_SCHEMA AND 
		t.TABLE_NAME=kcu.TABLE_NAME AND c.COLUMN_NAME=kcu.COLUMN_NAME AND OBJECTPROPERTY(OBJECT_ID(kcu.CONSTRAINT_SCHEMA + '.' + QUOTENAME(kcu.CONSTRAINT_NAME)), 
		'IsPrimaryKey')=1
		WHERE UPPER(t.TABLE_NAME) LIKE "&Object_Name." 
		 );
	  disconnect from SQLSVR;
   quit;
%end;

;
%put &=table_num.;
%if &table_num = 1 %then
%do;
   filename tmpfile1 "/sso/biconfig/940/Lev1/Logs/Validation_outputs/create_impala_tables.txt" lrecl=256 new; 
   filename tmpfile2 "/sso/biconfig/940/Lev1/Logs/Validation_outputs/create_impala_full_access_views.txt" lrecl=256 new;
    TITLE;
    FOOTNOTE;
%end;
%else 
%do;
   filename tmpfile1 "/sso/biconfig/940/Lev1/Logs/Validation_outputs/create_impala_tables.txt" lrecl=256 ; 
   filename tmpfile2 "/sso/biconfig/940/Lev1/Logs/Validation_outputs/create_impala_full_access_views.txt" lrecl=256 ; 
%end;
 
 
quit;
title;  

 
data _null_;            
   set reg1 end=lastrow ; 
   where  upcase(COLUMN_DATA_TYPE) not in ('BLOB','CLOB' , 'VARBINARY');
  %if &table_num. = 1 %then
   %do;
      file tmpfile2 ;
   %end;
   %else %if &table_num. > 1 %then
   %do;
      file tmpfile2 mod;
   %end;
   if _n_=1 then 
   do;  
      put  "DROP VIEW if exists ${target_db=Enter the target database name here}.&target.;";
      PUT  "CREATE VIEW ${target_db=Enter the target database name here}.&target";
      put 'AS SELECT ' ;
   end;   
   
   if lastrow then
 
  IMPALA_COLS= compress(IMPALA_COLS,',');
 

   put IMPALA_COLS;
   
run;
 
data _null_;            
   file tmpfile2 mod ;

   PUT  " FROM ${source_db=Enter the source database name here}.&target. z" ; 
   PUT ";";
run;
 quit;
 title; 
%mend;


   
/*
data tbl_list;
length SOURCE_OBJECT_NAME  SCHEMA_NAME $32;
input SOURCE_OBJECT_NAME $ SCHEMA_NAME $;
datalines;


tblnz_rtniitexcludedoverseas  NZO_GTAPP
TBLWEBNOTICE NZO_GTWRQ
;
run;
quit;





data t;
   set tbl_list  ;
   call symputx('schema1', SCHEMA_NAME );
   call symputx('Object_Name1', SOURCE_OBJECT_NAME );
   call symputx('table_num1',_n_ );
   rc = dosubl( '%create_table_view_sql_scrip(schema=&schema1.,Object_Name=&Object_Name1.,table_num=&table_num1.)');  
run;
quit;
