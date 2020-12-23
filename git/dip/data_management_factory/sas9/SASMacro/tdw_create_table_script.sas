 
%macro tdw_create_table_script(tdw_table=, Target_table_name= );
/*
Macro to create the scripts to generate impala table for a source table from 
Oracle TDW schema ;

 
START table= tblaccount
TDW table is tbl_account. 
%tdw_create_table_script(tdw_table=tbl_account);

21/10/2019 Nalaka L first written

*/

%let trgtblpfx=tdw_; 
%let tdw_table=%upcase(&tdw_table.);

%if &Target_table_name  =  %then 
%do;
   %if %length(&tdw_table)  le 25   %then
   %do;
      %let target= %lowcase(&trgtblpfx.&tdw_table.);
   %end;   
   %else 
   %do;
      %put " Source table name &tdw_table. is longer than 25 chars.  Please provide an appropriate target table name.";
      %abort;
   %end;  
%end;
%else 
%do;
   %if %length(&tdw_table)  gt 25 %then
   %do;
      %if %length(&Target_table_name)  gt 25   %then
      %do;
         %put " Target table name &Target_table_name. is longer than 25 chars.  Please provide an appropriate target table name.";
         %abort;
      %end;
      %else
      %do;
         %let target= %lowcase(&trgtblpfx.&Target_table_name.);
      %end;
   %end;
   %else
   %do;
      %let target= %lowcase(&trgtblpfx.&Target_table_name.);
   %end; 
%end;
   
%put &=tdw_table ;
%put &=target = ;  

proc sql;
      connect to oracle
      ( 
             path=DIP_VIP.external readbuff=200000  authdomain=edw_prod
         ); 
       create table t as
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
	   upper(dt.TABLE_NAME) =%str(%')&tdw_table.%str(%')
       ORDER BY dt.TABLE_NAME, dtc.COLUMN_ID
      ); 
     disconnect from oracle; 
   quit;


proc sql;
   connect to oracle
   ( 
          path=DIP_VIP.external readbuff=200000  authdomain=edw_prod
   ); 
   create table tv as
   select * 
   from connection to oracle
   (
SELECT 
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
WHERE
	upper(dt.TABLE_NAME) =%str(%')&tdw_table.%str(%')
ORDER BY dtc.COLUMN_ID

); 
   disconnect from oracle; 
quit;





filename tempfile "/sso/biconfig/940/Lev1/Logs/Validation_outputs/&target._1_create_table_script.txt" lrecl=256 new; 
TITLE;
FOOTNOTE;

data _null_;            
   set t end=lastrow ;  
   file tempfile   ;
   if _n_=1 then do;   
      put / "DROP TABLE if exists ${target_db=Enter the target database name here}.&target.;";
      put /"CREATE TABLE ${target_db=Enter the target database name here}.&target. ("  ;
   end; 
   put IMPALA_NAME_DATATYPE;
run;

data _null_;            
   file tempfile mod ;
      PUT /'record_effective_timestamp TIMESTAMP,';
      PUT /'record_expiry_timestamp TIMESTAMP,';
      PUT /'record_active_flag VARCHAR(1), ' ;
      PUT /'record_deleted_flag VARCHAR(1),';
      PUT /'insert_object_run_key INT,';
      PUT /'update_object_run_key INT '; 
PUT / ' ) STORED AS PARQUET;' ; 
put /;
put / '=======================================================';
run;

title;                                                                                                                                 
  data _null_;                                                                                                                           
    infile tempfile;                                                                                                                     
    file print notitles;                                                                                                                 
    input @;                                                                                                                             
    put _infile_;                                                                                                                        
run;   


%mend;
 
