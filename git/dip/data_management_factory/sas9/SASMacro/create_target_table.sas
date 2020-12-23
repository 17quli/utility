/*
Macro to  generate ddl and create impala target table.:
src_connect and tgt_connect must mask the special chars 
example
 	 
%create_target_table(src_engine=ORACLE, src_connect =%nrstr(path=DIP_VIP.external readbuff=200000  authdomain=edw_prod),src_table=corp_filing_groups,tgt_engine=SASIOIMP, tgt_connect=%nrstr(DBMAX_TEXT=32767 DATABASE=dev_raw DSN=ClouderaImpala64),tgt_schema=dev_raw,tgt_table=abc_o);
%create_target_table(src_engine=SQLSVR, src_connect =%nrstr(Datasrc=NZS_GTAPP readbuff=32767 authdomain=start_qual),src_table=tblAccountTransfer,tgt_engine=SASIOIMP, tgt_connect=%nrstr(DBMAX_TEXT=32767 DATABASE=dev_raw DSN=ClouderaImpala64),tgt_schema=dev_raw,tgt_table=abc_s);
====================================================================
Change History in REVERSE CHRONOLOGICAL ORDER

Date      Who               what
24/06/2020 Nalaka Lamahewa added escape chars to all traget table and view column names #224
27/05/2020 Nalaka Lamahewa  changed datatype to DOUBLE when the numeric column in SAS source table has decimal value gt  .4
06/04/2020 Nalaka Lamahewa added step to generate metadata for SAS source tables 
13/03/2020 Nalaka Lamahewa added step to create the restrcited view
05/11/2019 Nalaka Lamahewa  first written
*/

%macro rcSet(error); 
   %if (&error gt &trans_rc) %then 
      %let trans_rc = &error;
   %if (&error gt &job_rc) %then 
      %let job_rc = &error;
%mend rcSet;

%macro create_target_table(src_engine=, src_connect =,src_table=,tgt_engine=, tgt_connect=,tgt_schema=, tgt_table=)/ minoperator mindelimiter=',';

%let src_table = %upcase(&src_table.);
%let src_engine = %upcase(&src_engine.);
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
	   dtc.COLUMN_NAME 	   AS COLUMN_NAME,
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
                   '`'||  dtc.COLUMN_NAME || '` ' || 'INT'
                else 
                   '`'||  dtc.COLUMN_NAME || '` ' || 'BIGINT'
              end   
          when dtc.data_type = 'NUMBER' AND 0 <= dtc.data_scale AND dtc.data_scale <= dtc.DATA_PRECISION AND dtc.DATA_PRECISION <= 38  THEN
	          '`'||  dtc.COLUMN_NAME || '` ' || 'DECIMAL(' || (dtc.DATA_PRECISION +dtc.data_scale +1) || ',' || dtc.data_scale || ')'
	      WHEN dtc.DATA_TYPE = 'NUMBER' AND 0 <= dtc.DATA_PRECISION AND dtc.DATA_PRECISION <= 38 AND dtc.data_scale < 0 AND dtc.DATA_PRECISION - dtc.data_scale <= 38 THEN 
	         '`'||  dtc.COLUMN_NAME || '` ' || 'DECIMAL(' || dtc.DATA_PRECISION - dtc.data_scale || ',0)'
          WHEN dtc.DATA_TYPE = 'NUMBER' AND 0 <= dtc.DATA_PRECISION AND dtc.DATA_PRECISION < dtc.data_scale AND dtc.data_scale <= 38  THEN
             '`'||  dtc.COLUMN_NAME || '` ' || 'DECIMAL(' || dtc.data_scale || ',' || dtc.data_scale || ')'
	      WHEN dtc.DATA_TYPE = 'FLOAT' THEN 
	         '`'||  dtc.COLUMN_NAME || '` ' || 'DOUBLE' 
          WHEN dtc.DATA_TYPE = 'CLOB'  THEN  
	         '`'||  dtc.COLUMN_NAME || '` ' || 'STRING'
          WHEN dtc.DATA_TYPE = 'BLOB'  THEN 
	         '`'||  dtc.COLUMN_NAME || '` ' || 'STRING'
          WHEN dtc.DATA_TYPE LIKE '%CHAR%'  THEN
	         '`'||  dtc.COLUMN_NAME || '` ' || 'VARCHAR(' || dtc.DATA_LENGTH *2 || ')'
	      WHEN dtc.DATA_TYPE = 'DATE' THEN  
	         '`'||  dtc.COLUMN_NAME || '` ' || 'TIMESTAMP' 
          WHEN dtc.DATA_TYPE LIKE 'TIMESTAMP%'  THEN 
             '`'||  dtc.COLUMN_NAME || '` ' || 'TIMESTAMP'   
          ELSE 
             '`'||  dtc.COLUMN_NAME || '` ' || 'UNMAPPED' 
          END AS IMPALA_NAME_DATATYPE,
		  'z.`'|| dtc.COLUMN_NAME||'`'  AS IMPALA_COLS
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
	   upper(dt.TABLE_NAME) =%str(%')&src_table.%str(%')
/* 	   and dtc.DATA_TYPE not in ('BLOB','CLOB' , 'VARBINARY') */
       ORDER BY dt.TABLE_NAME, dtc.COLUMN_ID
      ); 
     disconnect from oracle; 
   quit;
   %rcSet(&sqlrc);
   %if %eval(&job_rc > 4) %then %goto EXIT;
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
	        CONCAT('`',c.COLUMN_NAME,'`' , ' SMALLINT') 
         WHEN c.DATA_TYPE='smallint' THEN
            CONCAT('`',c.COLUMN_NAME,'`' , ' SMALLINT') 
         WHEN c.DATA_TYPE='int' THEN 
            CONCAT('`',c.COLUMN_NAME,'`' , ' INT') 
         WHEN  c.DATA_TYPE='bigint' THEN 
            CONCAT('`',c.COLUMN_NAME,'`' , ' BIGINT') 
         WHEN c.DATA_TYPE='numeric' THEN
            CONCAT('`',c.COLUMN_NAME,'`' , ' DECIMAL(', 
            c.NUMERIC_PRECISION, ',', c.NUMERIC_SCALE, ')') 
         WHEN c.DATA_TYPE='money' THEN
            CONCAT('`',c.COLUMN_NAME,'`' , ' DECIMAL(19,4)') 
         WHEN c.DATA_TYPE='float' THEN 
         CONCAT('`',c.COLUMN_NAME,'`' , ' DOUBLE') 
         WHEN c.DATA_TYPE='datetime' THEN
            CONCAT('`',c.COLUMN_NAME,'`' , ' TIMESTAMP') 
         WHEN c.DATA_TYPE LIKE '%char%' AND 	c.CHARACTER_MAXIMUM_LENGTH <> -1 THEN 
            CONCAT('`',c.COLUMN_NAME,'`' , ' VARCHAR(', c.CHARACTER_MAXIMUM_LENGTH*2, ')')
         WHEN c.DATA_TYPE LIKE '%char%' AND  c.CHARACTER_MAXIMUM_LENGTH=-1 THEN
        CONCAT('`',c.COLUMN_NAME,'`' ,' VARCHAR(32767)') 
         WHEN c.DATA_TYPE LIKE '%clob%'  THEN
            CONCAT('`',c.COLUMN_NAME,'`' ,'STRING') 
         WHEN c.DATA_TYPE LIKE '%blob%'  THEN
            CONCAT('`',c.COLUMN_NAME,'`' ,'STRING') 
         WHEN c.DATA_TYPE LIKE 'varbinary%'  THEN
            CONCAT('`',c.COLUMN_NAME,'`' ,' VARCHAR(32767)')   
         ELSE 
            CONCAT('`',c.COLUMN_NAME,'`' , ' UNMAPPED') 
         END AS IMPALA_NAME_DATATYPE,
		  CONCAT('z.`',c.COLUMN_NAME,'`') AS IMPALA_COLS
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
		WHERE UPPER(t.TABLE_NAME) LIKE "&src_table." 
/* 		and c.DATA_TYPE not in ('BLOB','CLOB' , 'VARBINARY') */
		 );
	  disconnect from SQLSVR;
   quit;
 %end;  
%if  &src_engine.=SAS %then
%do;  
  proc sql;
   create table reg1 as 
      select 
       libname , memname ,name, type, xtype,length, varnum , format,
      case when  type = 'num' then      
         case
          when lower(xtype) ="decimal" then 
            '`'|| strip(name) || '`' || ' DECIMAL(19,4)'
          when lower(xtype) ="datetime" then 
            '`'|| strip(name) || '`' || ' TIMESTAMP'
          when substr(lower(format),1,8)='datetime' then 
             '`'|| strip(name) || '`' || ' TIMESTAMP'   
         when input(format ,best.) = . then     
            '`'|| strip(name) || '`' || ' INT'   
          when input(format ,best.) le 6 then
            '`'|| strip(name) || '`' || ' SMALLINT'
          when input(format ,best.) le 11 then 
            '`'|| strip(name) || '`' || ' INT'     
          when input(scan(format,2,'.'),best.) >4 then 
             '`'|| strip(name) || '`' || ' DOUBLE'
          else
            '`'|| strip(name) || '`' || ' BIGINT'
         end
      else
         '`'|| strip(name) || '`' || ' varchar('|| strip(put(length ,best.))||')'
      end as IMPALA_NAME_DATATYPE,
       'Z.`' || strip(name) || '`' as IMPALA_COLS
            
       from dictionary.columns
       where %upcase(libname) =  %upcase("&src_lib.")  and upcase(memname) =upcase("&src_table.")
       order by varnum;
   quit;
%end;
proc sql  noprint;
      select    IMPALA_NAME_DATATYPE into :tgt_cols separated by ',' from reg1 ;
quit;
proc sql  noprint;
      select    IMPALA_COLS into :vw_cols separated by ',' from reg1 ;
quit;
 
%rcSet(&sqlrc);

%put &=tgt_cols.;

 
%if %eval(&job_rc > 4) %then %goto EXIT;
	
 
proc sql;
	   connect to  &tgt_engine
	   ( 
		  &tgt_connect
	   );    
	   	execute
	   (
		 drop table if exists &tgt_schema..&tgt_table
	   ) by &tgt_engine;
	   execute
	   (
			create table &tgt_schema..&tgt_table  
			( 
			 &tgt_cols.
			 ) STORED AS PARQUET ;
	   ) by &tgt_engine;
	   execute
	   (
			compute stats &tgt_schema..&tgt_table;
	   ) by &tgt_engine; 
	    
	   disconnect from &tgt_engine;
	quit;

%if &vw_schema = %str() %then
%do; 
%end;
%else
%do;
   proc sql;
	   connect to  &tgt_engine
	   ( 
		  &tgt_connect
	   );    
	   	execute
	   (
		 drop view if exists &vw_schema..&tgt_view
	   ) by &tgt_engine;
	   execute
	   (
			create view &vw_schema..&tgt_view  
			
			  as select 
			   &vw_cols.
                      from &tgt_schema..&tgt_table z
			 ;
	   ) by &tgt_engine;    
	   disconnect from &tgt_engine;
   quit;
%end;  
	
%EXIT:	
%mend;
