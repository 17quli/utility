%macro  pre_registration_validation(schema=,Object_Name=, Target_table_name=, analyse_YN=N,pattern=,PARTITIONED_BY=,SORTED_BY=)/ minoperator mindelimiter=',';
/*
Macro to  generate 
information required for registration of a source table:
	- system
	- SourceName
    - SCHEMA_DB,
    - OBJECT_NAME
    - target_tablename
    - NATURAL_KEYS
    - PRIMARY_KEY_COLUMN_NAMES
    - Load-Pattern
    - ChangeCaptureTimestamp
    - EffectiveFromTimestamp
    - EffectiveToTimestamp
    - HistoryType
    - Job name
    - Approx_Num_Records      
    - max_count_per_NK        
    - max_count_per_PK   
    - maximum vlue for flngvar
    - unique indexes
    
scripts to create  
  -impala target table
  - dev_raw_full_access view for a source table 

OUTPUT:
     "/sso/biconfig/940/Lev1/Logs/Validation_outputs/&target._1_pre_registration_validation.txt"

Usage:
Must select a valid schema:
If  source object is longer than 25 chars then pass the target name.  Otherwise no need.
     %pre_registration_validation(schema=NZS_GTAPP,Object_Name=tblNz_CustomerTaxResidency, Target_table_name= tblNz_CustTaxResidency);

If pattern P1 (or any other pattern) then run with pattern=P1  Otherwise  no need. 
 %pre_registration_validation(schema=DSS,Object_Name=RADC_SVOC, pattern=P1);
 
If the target table has more than 2 million rows, and need analysis 
such as rows per natural key done  on table, run with analyse_YN=Y
     %pre_registration_validation(schema=NZS_GTAPP,Object_Name=tblACCOUNT, analyse_YN=Y);
====================================================================
Change History in REVERSE CHRONOLOGICAL ORDER

Date      Who               what

28/05/2020 Nalaka Lamahewa Added code to include PARTITIONED_BY and SORTED_BY info into DDL for P3
05/03/2020 Nalaka Lamahewa Added NZS_GTAPP, NZS_GTREF, NZS_GTWRQ, NZS_GTWEB, NZS_GTWRQ  schema to whitelist
18/02/2020 Aaron Scoble Additional changes to Impala DDL.
27/01/2020 Aaron Scoble Re-modified impala DDL statements as previous changes broke variable instantiation in the Hue GUI.
						The script will now display instructions which the developer can follow when copying the DDL to 
						files for version control.
24/01/2020 Aaron Scoble Modified impala DDL statements to align with new file format
26/11/2019 Aaron Scoble Added NZO_GTWEB schema to whitelist
30/10/2019 Dan Ikonnikov Added KXT5 schema as part of EDW checks
22/10/2019 Dan Ikonnikov Updated auth domain on nzo_gtwrq to start_operations
21/10/2019 Daniel Moore Allowed the length of source table name to be 25 rather than 24
08/10/2019 Sandamali De Zoysa Update GTSCT to GTSTC
02/10/2019 Daniel Moore     Added 'SUMMARY' to the list of schemas
22/08/2019 Nalaka Lamahewa  first written
*/
%put &=schema.;
/* max row count if source table is to be analyesed */
%let max_anl_row_cnt =2000000;
%let source_sys= ;
%let AUTHDOMAIN  =;
%let PATH  = ; 
%let Datasrc  = ;  
%let SYSTEM_NAME = ;
%let trgtblpfx= ;
%let nk_cols= ;
%let pk_cols= ;
%let BLOBS_CLOBS_VARBINARY= ;
%let P_H_vars= ;
%let Approx_Num_Records= ; 
%let nobs_ui= ;
%let nobs_ui_sql =;
%let max_count_per_NK= ;
%let max_count_per_PK= ;
%let max_flngver= .;
%let max_flngVerlast= .;
%let count_DATE_APPLIED_not_null =0;
%let count_FDTMEFFECTIVEFROM_not_null = 0;
%let schema =%upcase(&schema.);
%let PARTITIONED_BY =%upcase(&PARTITIONED_BY.);
%let jobname=;

/* following tables got special columns derived in the job.
      So add them to the create table script.
*/
  %let extra_col_tgt_tbls=app_tblcustomer, app_tblcustomerlevel,app_tblcrmextendedlog, app_tblaccount, stc_tblnz_deliveryaddress,special_clients_all;

%if %sysfunc(exist(reg1)) %then 
%do;
   proc datasets lib=work nolist nodetails;
    delete reg:;
  quit;
%end;

%let alczr_schemas=PROPERTY,DIA_DEATHS,COMPANIES;
%let dip_schemas=DSS, 67AWCH,SXT4,BESSOWN,DSSMART,17THHO,SUMMARY, KXT5, CMEOWN;
%let sql_schemas=NZO_GTAPP, NZO_GTFRD,NZO_GTREF,NZO_GTWRQ,NZO_GTSTC,NZO_GTWEB,NZS_GTAPP,NZS_GTREF,NZS_GTWRQ,NZS_GTWEB,NZS_GTWRQ ;

%if   %upcase(&schema.) in (&alczr_schemas.)   %then
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
%else %if  %eval(%upcase(&schema.) in (&dip_schemas))  %then
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
   %else %if %upcase(&schema.)=17THHO %then
   %do;
      %let SYSTEM_NAME=HHO;
      %let trgtblpfx=hho_;  
   %end;  
   %else %if %upcase(&schema.)=KXT5 %then 
   %do;
      %let SYSTEM_NAME=XT5;
      %let trgtblpfx=xt5_;  
   %end; 
   %else %if %upcase(&schema.)=CMEOWN %then 
   %do;
      %let SYSTEM_NAME=CME;
      %let trgtblpfx=cme_;  
   %end; 
        
%end; 
%else %if   %upcase(&schema.) in (&sql_schemas.)   %then
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
   %else %if  %upcase(&schema.) = NZS_GTWRQ  %then
   %do;
      %let SYSTEM_NAME=SWRQ;
      %let trgtblpfx=wrq_;
      %let AUTHDOMAIN=start_qual ;
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
  %else %if %upcase(&schema.)=NZS_GTREF %then
   %do;
      %let SYSTEM_NAME=SREF;
      %let trgtblpfx=ref_;  
	  %let AUTHDOMAIN= start_qual;
   %end; 
   %else %if %upcase(&schema.)=NZO_GTSTC %then
   %do;
      %let SYSTEM_NAME=SSCT;
      %let trgtblpfx=stc_;  
   %end;   
   %else %if %upcase(&schema.)=NZO_GTWEB %then
   %do;
      %let SYSTEM_NAME=SWEB;
      %let trgtblpfx=web_;  
   %end; 
   %else %if %upcase(&schema.)=NZS_GTWEB %then
   %do;
      %let SYSTEM_NAME=SWEB;
      %let trgtblpfx=web_;  
	  %let AUTHDOMAIN= start_qual;
   %end;  
   /*this line must be last*/
  
   %let SCHEMA=dbo;
%end;
%else
%do;
   %put "Invalid Schema name.  Please select one of the following or update the macro to include schema for new data soure:";
   %put "Schemas for ORACLE Sources:";
   %put "&alczr_schemas";
   %put "&dip_schemas";
   %put "Schemas for SQL Sources:";
   %put "&sql_schemas.";
   %abort;
%end;

%let Object_Name=%upcase(&Object_Name.);

%if &Target_table_name  =  %then 
%do;
   %if %length(&Object_Name)  le 25   %then
   %do;
      %let target= %lowcase(&trgtblpfx.&Object_Name.);
   %end;   
   %else 
   %do;
      %put " Source table name &Object_Name. is longer than 25 chars.  Please provide an appropriate target table name.";
      %abort;
   %end;  
%end;
%else 
%do;
   %if %length(&Object_Name)  gt 25 %then
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
		     CASE 
	            WHEN dtc.COLUMN_NAME ='DESC' THEN 
	              '`'||  dtc.COLUMN_NAME || '` ' || 'STRING,'
	            ELSE
                   dtc.COLUMN_NAME || ' ' || 'STRING,'
				END
          WHEN dtc.DATA_TYPE = 'BLOB'  THEN 
		     CASE 
		        WHEN dtc.COLUMN_NAME ='DESC' THEN 
	              '`'||  dtc.COLUMN_NAME || '` ' || 'STRING,'
	            ELSE
                   dtc.COLUMN_NAME || ' ' || 'STRING,'   
			  END
          WHEN dtc.DATA_TYPE LIKE '%CHAR%'  THEN
		     CASE 
		        WHEN dtc.COLUMN_NAME ='DESC' THEN 
	              '`'||  dtc.COLUMN_NAME || '` ' || 'VARCHAR(' || dtc.DATA_LENGTH *2 || '),'
	            ELSE
                   dtc.COLUMN_NAME || ' ' || 'VARCHAR(' || dtc.DATA_LENGTH *2 || '),' 
			  END
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
         CASE 
         WHEN  dtc.COLUMN_NAME ='TIMESTAMP' THEN
            'z.`'|| dtc.COLUMN_NAME||'`,'
         WHEN  dtc.COLUMN_NAME ='DESC' THEN
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
    
   %if &target. in (&extra_col_tgt_tbls.)%then
   %do;
       data reg1;
          set reg1;
          output;
          if  "&target." in ("special_clients_all") and column_name = 'IRD_NUMBER'   then
          do;
             column_name='special_classification';
             IMPALA_NAME_DATATYPE ='special_classification (varchar(20)),';
             IMPALA_COLS='z.special_classification,';
             output;
          end;
       run;
    %end;
   %let nk_cols=;
   proc sql noprint;
      select COLUMN_NAME into :nk_cols separated by ','
      from reg1
      where PK_IND ='Y' and upcase(COLUMN_NAME) ne 'DATE_APPLIED'
     ;
   quit;
   %put &=nk_cols.;

   %let  pk_cols=;
   proc sql noprint;
      select COLUMN_NAME into :pk_cols separated by ','
      from reg1
      where PK_IND ='Y'
      ;
   quit;
   %put &=pk_cols.;

   %let BLOBS_CLOBS_VARBINARY =;
   proc sql noprint;
      select COLUMN_NAME into :BLOBS_CLOBS_VARBINARY separated by ','
      from reg1
      where  COLUMN_DATA_TYPE in ('BLOB','CLOB' , 'VARBINARY')
      ;
   quit;
   %put &=BLOBS_CLOBS_VARBINARY.;

   %let P_H_vars= ;
   proc sql noprint;
      select COLUMN_NAME into :P_H_vars separated by ','
      from reg1
      where COLUMN_NAME in ('TIMESTAMP','DATE_APPLIED','DATE_CEASED')
     ;
   quit;
   %put &=P_H_vars.;

   %let Approx_Num_Records =.;
   proc sql noprint;
      select num_rows    into :Approx_Num_Records
      from reg1
     ;
   quit;

   %put &=Approx_Num_Records. ;
   %if &Approx_Num_Records. le 0 %then
   %do;
      proc sql  noprint;
         connect to oracle
         ( 
          path=&path. readbuff=200000  authdomain=&authdomain.
         ); 
         create table reg_rcount as
         select * 
         from connection to oracle
         (
             select count(*) as rcount
              from &schema..&Object_Name
         ); 
         disconnect from oracle; 
      quit;
      proc sql noprint;
         select rcount into :Approx_Num_Records
         from reg_rcount
      ;
      quit;
      
   %end;
   %put &=Approx_Num_Records. ; 

   %if  &PK_COLS ne  and(&Approx_Num_Records.  lt &max_anl_row_cnt.  or %upcase(&analyse_YN)=Y)   %then
   %do;
      proc sql noprint;
         connect to oracle
         ( 
          path=&path. readbuff=200000  authdomain=&authdomain.
         ); 
         create table reg_count_UK as
         select * 
         from connection to oracle
         (   
            SELECT
	       &nk_cols, count(*) ,count(*) as cc
 
         FROM &schema..&Object_Name
         GROUP BY &nk_cols.
         ); 
         disconnect from oracle; 
      quit;
      
      %let max_count_per_NK =;
      proc sql noprint;
         select max (cc) into :max_count_per_Nk from
         reg_count_UK;
      quit;
   
      proc sql noprint;
         connect to oracle
         ( 
             path=&path. readbuff=200000  authdomain=&authdomain.
         ); 
         create table reg_count_PK as
         select * 
         from connection to oracle
         (
            SELECT   
	       &pk_cols,count(*) ,count(*) as cc
         FROM &schema..&Object_Name
         GROUP BY &pk_cols
        ); 
         disconnect    from oracle; 
      quit;
      
      %let max_count_per_PK =;
      proc sql noprint;
         select max (cc) into :max_count_per_PK
         from
         reg_count_pK;
      quit;
   %end;
   proc sql;
      connect to oracle
      ( 
          path=&path. readbuff=200000  authdomain=&authdomain.
      ); 
      create table reg_ui as
      select * 
      from connection to oracle
      (
       SELECT 
       i.owner ,
       i.table_name,
       i.index_name,  
       c.column_position,  
       c.column_name,  
       i.uniqueness
   FROM sys.all_indexes i, 
       sys.all_ind_columns c  
    WHERE 
      upper(i.TABLE_NAME) =%str(%')&Object_Name.%str(%') 
      AND i.owner       =  %str(%')&schema.%str(%')   
      AND i.uniqueness  = 'UNIQUE'
      AND i.index_name  = c.index_name  
      AND i.table_owner = c.table_owner  
      AND i.table_name  = c.table_name  
      AND i.owner       = c.index_owner
      AND c.index_name IN (SELECT index_name FROM sys.all_ind_columns 
      WHERE column_position = 2)
      order by index_name
      ); 
      disconnect from oracle; 
   quit;
    
    %let nobs_ui  =;
   proc sql noprint;
      select count(*) into :nobs_ui  from reg_ui;
   quit;
   %put &=nobs_ui.;
   
   %if %sysfunc(findw (%quote(&P_H_vars.),   DATE_APPLIED )) %then
   %do;
   
      proc sql  noprint;
         connect to oracle
         ( 
          path=&path. readbuff=200000  authdomain=&authdomain.
         ); 
         create table reg_DATE_APPLIED  as
         select * 
         from connection to oracle
         (
             select count(*) as count_DATE_APPLIED
              from &schema..&Object_Name
              where DATE_APPLIED is not null
               
         ); 
         disconnect from oracle; 
      quit;
      proc sql  noprint;
         select count_DATE_APPLIED into :count_DATE_APPLIED_not_null
         from reg_DATE_APPLIED
      ;
      quit;
      %put &=count_DATE_APPLIED_not_null;
   %end;
   
   proc sql;
      create table reg2
      as select distinct
      SYSTEM_TYPE as SYSTEM,
      "&SYSTEM_NAME." as SOURCENAME,
      SCHEMA_NAME as SCHEMA_DB,
       OBJECT_NAME as OBJECT_NAME,
      "&target." as target_table_name,
      "&nk_cols." as NATURAL_KEYS,
      "&pk_cols." as PRIMARY_KEY_COLUMN_NAMES,
      "&BLOBS_CLOBS_VARBINARY." as BLOBS_CLOBS_VARBINARY ,
      case  
         when findw("&P_H_vars.",'TIMESTAMP')   OR  &count_DATE_APPLIED_not_null. ne 0 then
            'ChangeExtract' 
         when %upcase("&pattern.") =  "P1" then
            'FullComparison'   
         when %upcase("&pattern.") =  "P3" then
            'EventExtract'   
         else   
            'FullReplacement   (could be FullComparison or EventExtract or ChangeExtract ).  DEVELOPER TO VERIFY!!!.  Ensure there is no other date column that can be used as Change_Capture_Timestamp.  If it is a FullComparison or EventExtract, rerun the macro with pattern=P0 or pattern=P3'
      end as Load_Pattern,
   
      case  
         when findw("&P_H_vars.",'TIMESTAMP')  then  
            'TIMESTAMP' 
         when &count_DATE_APPLIED_not_null. ne 0 then
                  'DATE_APPLIED'   
         else 
            ' '
      end as Change_Capture_Timestamp,
   
      case 
         when findw("&P_H_vars." , 'DATE_APPLIED')  then
            case 
               when &count_DATE_APPLIED_not_null. ne 0 then
                  'DATE_APPLIED' 
               else
                  'DATE_APPLIED is null for all observations- Please check the data and consider another pattern/historisation.'
             end
         else     
           ' '
      end as Effective_From_Timestamp,
   
      case  when findw("&P_H_vars.",'DATE_CEASED')  then  
         'DATE_CEASED'  
      else 
        ' '
      end as Effective_To_Timestamp,
      
      case 
         when findw("&P_H_vars.",'DATE_APPLIED') 
         and findw("&P_H_vars.",'DATE_CEASED')  
         and (findw("&P_H_vars.",'TIMESTAMP') or &count_DATE_APPLIED_not_null. ne 0)  then  
            case 
               when &count_DATE_APPLIED_not_null. ne 0 then
                  'H3' 
               else
                  'DATE_APPLIED is null for all observations- Please check the data and consider another pattern/historisation.'
             end       
         when findw("&P_H_vars.",'TIMESTAMP')   then  
            'H2' 
        else 
            ' '
      end as History_Type,

      case  
         when %upcase("&pattern.") =  "P1" then
            "&target._P1"
         when %upcase("&pattern.") =  "P3" then
            "&target._P3"   
         when findw("&P_H_vars.",'DATE_APPLIED') and 
         findw("&P_H_vars.",'DATE_CEASED')  and
           (findw("&P_H_vars.",'TIMESTAMP') or &count_DATE_APPLIED_not_null. ne 0)  then 
            case 
               when &count_DATE_APPLIED_not_null. ne 0 then
                  "&target._P2H3" 
               else
                  'DATE_APPLIED is null for all observations- Please check the data and consider another pattern/historisation.'
             end    
         when findw("&P_H_vars.",'TIMESTAMP')   then  
            "&target._P2H2"  
         else 
           "&target._P0"      
      end as job_name,
      &Approx_Num_Records. as Approx_Num_Records
   
    %if (&Approx_Num_Records.  le &max_anl_row_cnt.) or %upcase(&analyse_YN)=Y   %then
      %do;
         ,
         "&max_count_per_NK."  as max_count_per_NK,
         "&max_count_per_PK."  as max_count_per_PK
      %end;
      from reg1;
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
         CONCAT(c.COLUMN_NAME,' VARCHAR(32767),') 
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
   
   /* following tables got special columns derived in the job.
      So add them to the create table script.
   
   */
   %if &target. in (&extra_col_tgt_tbls.)%then
   %do;
       data reg1;
       set reg1;
       output;
       if  "&target." in ("app_tblaccount", "tblcustomer") and column_name = 'FDTMWHEN'   then
       do;
          column_name='dtmwhen_info';
          IMPALA_NAME_DATATYPE ='fdtmwhen_info TIMESTAMP,';
          IMPALA_COLS='z.fdtmwhen_info,';
          output;
       end;
       else if  "&target." in("app_tblcrmextendedlog") and column_name = 'FDTMWHEN'   then
       do;
          column_name='change_capture';
          IMPALA_NAME_DATATYPE ='change_capture TIMESTAMP,';
          IMPALA_COLS='z.change_capture,';
          output;
       end;
       else if  "&target." in("app_tblcustomerlevel") and column_name = 'FLNGDOCKEY'   then
       do;
          column_name='flngCustomerKey';
          IMPALA_NAME_DATATYPE ='flngcustomerkey INT,';
          IMPALA_COLS='z.flngcustomerkey,';
          output;
       end;
       else if  "&target." in("stc_tblnz_deliveryaddress") and column_name = 'FINTRECORDUSAGEID'   then
       do;
          column_name='latitude';
          IMPALA_NAME_DATATYPE ='latitude  DOUBLE,';
           IMPALA_COLS='z.latitude,';
          output;
          column_name='longitude';
          IMPALA_NAME_DATATYPE ='longitude  DOUBLE,';
          IMPALA_COLS='z.longitude,';
          output;
       end;
      run;
   %end;
   %let nk_cols=;
   proc sql noprint;
      select COLUMN_NAME into :nk_cols separated by ','
      from reg1
      where PK_IND ='Y' and  upcase(COLUMN_NAME) NOT IN ('FLNGVER'  ,'FLNGVERLAST')
      and upcase(COLUMN_NAME) ne 'FDTMEFFECTIVETO'
     ;
   quit;
   %put &=nk_cols.;

   %let  pk_cols=;
   proc sql noprint;
      select COLUMN_NAME into :pk_cols separated by ','
      from reg1
      where PK_IND ='Y'
      ;
   quit;
   %put &=pk_cols.;

   %let BLOBS_CLOBS_VARBINARY =;
   proc sql noprint;
      select COLUMN_NAME into :BLOBS_CLOBS_VARBINARY separated by ','
      from reg1
      where  upcase(COLUMN_DATA_TYPE) in ('BLOB','CLOB' , 'VARBINARY')
      ;
   quit;
   %put &=BLOBS_CLOBS_VARBINARY.;

   %let P_H_vars= ;
   proc sql noprint;
      select COLUMN_NAME into :P_H_vars separated by ','
      from reg1
      where upcase(COLUMN_NAME) in ('FDTMWHEN','FDTMEFFECTIVEFROM','FDTMEFFECTIVETO','FINTSEQ','FLNGVER','FLNGVERLAST','FLNGSEQUENCE')
     ;
   quit;
   %put &=P_H_vars.;	 

   %let Approx_Num_Records =.;

   proc sql;
	  connect to SQLSVR
       (Datasrc=&Datasrc. readbuff=32767 authdomain=&authdomain.);
       create table reg_num_row as
	  select * from connection to SQLSVR
      (SELECT 
      t.name,
      p.rows 
      from sys.partitions p
      inner join
      sys.tables t
      on p.object_id=t.object_id
      where upper(t.name) like "&Object_Name." 
      and p.index_id <2;
      );	
	  disconnect from SQLSVR;
   quit;
   proc sql noprint;
      select rows into :Approx_Num_Records
      from reg_num_row;
   quit;
   %put &=Approx_Num_Records. ;

   %if &Approx_Num_Records. le 0 %then
   %do;
      proc sql;
	     connect to SQLSVR
         (Datasrc=&Datasrc. readbuff=32767 authdomain=&authdomain.);
         create table reg_sqrc as
	     select * from connection to SQLSVR
         (select count(*) as rcount
         FROM &Datasrc..&schema..&Object_Name.);
	     disconnect from SQLSVR;
      quit;
      proc sql noprint;
	    select rcount into  :Approx_Num_Records
	    from reg_sqrc;
      quit;
   %end;
   %put &=Approx_Num_Records. ; 
   %let max_flngver=.;

   %if %sysfunc(findw (%quote(&P_H_vars.),   FLNGVER )) %then
   %do;
      proc sql;
	     connect to SQLSVR
         (Datasrc=&Datasrc. readbuff=32767 authdomain=&authdomain.);
         create table reg_flngVer_max as
	     select * from connection to SQLSVR
         (   
           SELECT DISTINCT flngVer  
         FROM &schema..&Object_Name
         ); 
         disconnect from SQLSVR; 
      quit;
   
      proc sql noprint;
         select max (flngVer) into :max_flngver
         from
         reg_flngVer_max;
      quit;
      
   %end;
   %put &=max_flngver;
   %if %sysfunc(findw (%quote(&P_H_vars.),   FLNGVERLAST )) and &max_flngver =. %then
   %do;
      proc sql;
	     connect to SQLSVR
         (Datasrc=&Datasrc. readbuff=32767 authdomain=&authdomain.);
         create table reg_flngVerlast_max as
	     select * from connection to SQLSVR
         (   
           SELECT DISTINCT flngVerlast  
         FROM &schema..&Object_Name
         ); 
         disconnect from SQLSVR; 
      quit;
   
      proc sql noprint;
         select max (flngVerlast) into :max_flngVerlast
         from
         reg_flngVerlast_max;
      quit;
      
   %end;
   %put &=max_flngVerlast;
   %if &pk_cols. ne and  (&Approx_Num_Records.  lt &max_anl_row_cnt.or %upcase(&analyse_YN)=Y)    %then
   %do;
      proc sql;
	     connect to SQLSVR
         (Datasrc=&Datasrc. readbuff=32767 authdomain=&authdomain.);
         create table reg_count_UK as
	     select * from connection to SQLSVR
         (   
            SELECT
	       &nk_cols,count(*) ,count(*) as cc
 
         FROM &schema..&Object_Name
         GROUP BY &nk_cols.
         ); 
         disconnect from SQLSVR; 
      quit;
      
      %let max_count_per_NK =;
      proc sql noprint;
         select max (cc) into :max_count_per_Nk from
         reg_count_UK;
      quit;
   
      proc sql;
	     connect to SQLSVR
         (Datasrc=&Datasrc. readbuff=32767 authdomain=&authdomain.);
         create table reg_count_PK as
	     select * from connection to SQLSVR
         (   
            SELECT
	       &nk_cols,count(*) ,count(*) as cc
 
         FROM &schema..&Object_Name
         GROUP BY &pk_cols.
         ); 
         disconnect from SQLSVR; 
      quit;
      
      %let max_count_per_PK =;
      proc sql noprint;
         select max (cc) into :max_count_per_PK
         from
         reg_count_pK;
      quit;
   %end; 
   
   proc sql;
      connect to SQLSVR
      (Datasrc=&Datasrc. readbuff=32767 authdomain=&authdomain.);
      create table reg_ui_sql as
      select * from connection to SQLSVR
      (   
      select schema_name(t.schema_id) + '.' + t.[name] as object_name, 
      case
         when t.[type] = 'U' then 
            'Table'
         when t.[type] = 'V' then 
            'View'
      end as [object_type],
      case
         when c.[type] = 'PK' then
            'Primary key'
         when c.[type] = 'UQ' then
            'Unique constraint'
         when i.[type] = 1 then 
            'Unique clustered index'
         when i.type = 2 then 
            'Unique index'
      end as constraint_type, 
      substring(column_names, 1, len(column_names)-1) as [columns],
      i.[name] as index_name,
      case 
         when i.[type] = 1 then 
            'Clustered index'
         when i.type = 2 then 
            'Index'
      end as index_type
      from 
       sys.objects t
       left outer join sys.indexes i
       on t.object_id = i.object_id
       left outer join sys.key_constraints c
       on i.object_id = c.parent_object_id 
       and i.index_id = c.unique_index_id
      cross apply 
      (
         select col.[name] + ', '
         from sys.index_columns ic
         inner join sys.columns col
         on ic.object_id = col.object_id
         and ic.column_id = col.column_id
         where 
         ic.object_id = t.object_id
         and ic.index_id = i.index_id
         order by col.column_id
         for xml path ('') 
       ) D (column_names)
         where is_unique = 1
         and t.is_ms_shipped <> 1
        and is_primary_key = 0
         and  upper(t.[name] ) LIKE "&Object_Name."
      order by schema_name(t.schema_id) + '.' + t.[name]
       ;
     );
      disconnect from SQLSVR;
   quit;
   %let nobs_ui_sql  =;
   proc sql noprint;
      select count(*) into :nobs_ui_sql  from reg_ui_sql;
   quit;
   %put &=nobs_ui_sql.;
   %if %sysfunc(findw (%quote(&P_H_vars.),   FDTMEFFECTIVEFROM )) %then
   %do;
      proc sql;
	     connect to SQLSVR
         (Datasrc=&Datasrc. readbuff=32767 authdomain=&authdomain.);
         create table reg_FDTMEFFECTIVEFROM as
	     select * from connection to SQLSVR
         (select count(*) as count_FDTMEFFECTIVEFROM
         FROM &Datasrc..&schema..&Object_Name.
         where FDTMEFFECTIVEFROM is not null);
	     disconnect from SQLSVR;
      quit;
   
      proc sql  noprint;
         select count_FDTMEFFECTIVEFROM into :count_FDTMEFFECTIVEFROM_not_null
         from reg_FDTMEFFECTIVEFROM
      ;
      quit;
   %end;   
      %put &=count_FDTMEFFECTIVEFROM_not_null.;
      
   proc sql;
      create table reg2
      as select distinct
      SYSTEM_TYPE as SYSTEM,
      "&SYSTEM_NAME." as SOURCENAME,
      SCHEMA_NAME as SCHEMA_DB,
       OBJECT_NAME as OBJECT_NAME,
      "&target." as target_table_name,
      "&nk_cols." as NATURAL_KEYS,
      "&pk_cols." as PRIMARY_KEY_COLUMN_NAMES,
      "&BLOBS_CLOBS_VARBINARY." as BLOBS_CLOBS_VARBINARY ,
      case  
         when %upcase("&pattern.") =  "P0" then
            'FullReplacement'  
         when %upcase("&pattern.") =  "P1" then
            'FullComparison'   
         when %upcase("&pattern.") =  "P3" then
            'EventExtract'
         when findw("&P_H_vars.",'FDTMWHEN')  then  
            'ChangeExtract'    
         else   
            'FullReplacement   (could be FullComparison or EventExtract or ChangeExtract).  DEVELOPER TO VERIFY!!!.  Ensure there is no other date column that can be used as Change_Capture_Timestamp.  If it is a FullComparison or EventExtract, rerun the macro with pattern=P1 or pattern=P3'
      end as Load_Pattern,
   
      case  
         when findw("&P_H_vars.",'FDTMWHEN')  then  
            'FDTMWHEN'   
         else 
            ' '
      end as Change_Capture_Timestamp,
   
      case 
         when findw("&P_H_vars." , 'FDTMEFFECTIVEFROM')  then  
             case 
                when  &count_FDTMEFFECTIVEFROM_not_null. ne 0 then    
                  'FDTMEFFECTIVEFROM' 
                else 
                   ' FDTMEFFECTIVEFROM is null for all observations- Please check the data and consider another pattern/historisation.'
             end   
         else 
         ' '
      end as Effective_From_Timestamp,
   
      case  
         when findw("&P_H_vars.",'FDTMEFFECTIVETO')  then  
            'FDTMEFFECTIVETO'   
         else 
           ' '
      end as Effective_To_Timestamp,
      
      case 
         when %upcase("&pattern.") in ("P0", "P1", "P3") then
           ''
         when findw("&P_H_vars.",'FDTMEFFECTIVEFROM')=0
         and findw("&P_H_vars.",'FDTMEFFECTIVETO')=0
         and findw("&P_H_vars.",'FDTMWHEN')   
         and (&MAX_FLNGVER. gt  0 /* or &max_flngVerlast. gt 0*/)then   
            'H1'  
         when findw("&P_H_vars.",'FDTMEFFECTIVEFROM')
         and findw("&P_H_vars.",'FDTMEFFECTIVETO')  
         and findw("&P_H_vars.",'FDTMWHEN')   
         and &MAX_FLNGVER. = 0 then  
            case 
                when  &count_FDTMEFFECTIVEFROM_not_null. ne 0 then    
                  'H3' 
                else 
                   ' FDTMEFFECTIVEFROM is null for all observations- Please check the data and consider another pattern/historisation.'
             end             
         when findw("&P_H_vars.",'FDTMEFFECTIVEFROM')=0
         and findw("&P_H_vars.",'FDTMEFFECTIVETO')=0
         and findw("&P_H_vars.",'FLNGVER')=0
         and (findw("&P_H_vars.",'FLNGSEQUENCE') or findw("&P_H_vars.",'FINTSEQ'))
         and findw("&P_H_vars.",'FDTMWHEN')  
         /*and &MAX_FLNGVER. = .*/  then   
            'H4'    
         when findw("&P_H_vars.",'FDTMWHEN')  
         and (&MAX_FLNGVER. =. /*or &MAX_FLNGVER. =  0*/)  then  
            'H2'   
         else 
            ' '
      end as History_Type,

      case  
         when %upcase("&pattern.") =  "P0" then
            "&target._P0"
         when %upcase("&pattern.") =  "P1"   then
            "&target._P1" 
         when %upcase("&pattern.") =  "P3" then
            "&target._P3"    
         when findw("&P_H_vars.",'FDTMEFFECTIVEFROM')=0
         and findw("&P_H_vars.",'FDTMEFFECTIVETO')=0
         and findw("&P_H_vars.",'FDTMWHEN')   
         and (&MAX_FLNGVER. gt  0 /*or &max_flngVerlast. gt 0*/) then   
            "&target._P2H1"  
         when findw("&P_H_vars.",'FDTMEFFECTIVEFROM')
         and findw("&P_H_vars.",'FDTMEFFECTIVETO')  
         and findw("&P_H_vars.",'FDTMWHEN')   
         and &MAX_FLNGVER. = 0 then  
            case 
                when  &count_FDTMEFFECTIVEFROM_not_null. ne 0 then    
                  "&target._P2H3"  
                else 
                   ' FDTMEFFECTIVEFROM is null for all observations- Please check the data and consider another pattern/historisation.'
             end            
         when findw("&P_H_vars.",'FDTMEFFECTIVEFROM')=0
         and findw("&P_H_vars.",'FDTMEFFECTIVETO')=0
         and findw("&P_H_vars.",'FLNGVER')=0
         and (findw("&P_H_vars.",'FLNGSEQUENCE') or findw("&P_H_vars.",'FINTSEQ'))
         and findw("&P_H_vars.",'FDTMWHEN')  
         and &MAX_FLNGVER. = .  then   
            "&target._P2H4"    
         when findw("&P_H_vars.",'FDTMWHEN')  
         and (&MAX_FLNGVER. =. or &MAX_FLNGVER. =  0)  then  
            "&target._P2H2"   
         else 
           "&target._P0"      
      end as job_name,
      &Approx_Num_Records. as Approx_Num_Records
   
    %if (&Approx_Num_Records.  le &max_anl_row_cnt.) or %upcase(&analyse_YN)=Y   %then
      %do;
         ,
         "&max_count_per_NK."  as max_count_per_NK,
         "&max_count_per_PK."  as max_count_per_PK
      %end;
      from reg1;
   quit;
%end;



/* filename tempfile temp lrecl=256;    */
%if %sysfunc(fileexist(/sso/biconfig/940/Lev1/Logs/Validation_outputs/&target._1_pre_registration_validation.txt)) ge 1 %then 
%do;
    
   %let rc=%sysfunc(fdelete(tempfile));
%end;
filename tempfile "/sso/biconfig/940/Lev1/Logs/Validation_outputs/&target._1_pre_registration_validation.txt" lrecl=256 new; 

TITLE;
FOOTNOTE;

data _null_;            
   set reg2 end=lastrow ;  

   file tempfile ;
  call symput('jobname' ,job_name);   
   if _n_=1 then do;   
      put /"Pre-registration details for Source table &Object_Name..  DEVELOPER TO VERIYFY or  use at (one's) own peril :-)"  ;
   end; 
   put // '=============================================================================';
   put 'SYSTEM                         =  ' SYSTEM;
   put 'SOURCE_NAME                    =  ' SOURCENAME;
   put 'SCHEMA_DB                      =  ' SCHEMA_DB;
   put 'OBJECT_NAME                    =  ' OBJECT_NAME;
   put 'TARGET_TABLE_NAME              =  ' TARGET_TABLE_NAME;
   put 'NATURAL_KEYS                   =  ' NATURAL_KEYS;
   put 'PRIMARY_KEY_COLUMN_NAMES       =  ' PRIMARY_KEY_COLUMN_NAMES;
   put 'BLOBS/CLOBS/VARBINARY COLUMNS  =  ' BLOBS_CLOBS_VARBINARY;
 

   put // '===============================================================================';
   put //;
   put 'Load_Pattern                   =  ' Load_Pattern;
   put 'Change_Capture_Timestamp       =  ' Change_Capture_Timestamp;
   put 'Effective_From_Timestamp       =  ' Effective_From_Timestamp;
   put 'Effective_To_Timestamp         =  ' Effective_To_Timestamp;
   put //;
   put 'History_Type                   =  ' History_Type;
   put 'Job_name                       =  ' job_name;
   put 'Approx_Num_Records             =  ' Approx_Num_Records;
   
   %if (&Approx_Num_Records.  gt &max_anl_row_cnt.) and %upcase("&analyse_YN.") ne "Y" %then
   %do;
       put /;
       put "#records in the tables is greater than  &max_anl_row_cnt. Please re-run the macro with analyse_YN=Y, if you wnat to analyse the source table";
   %end;

   put / '=================================================================================================================================';
   put //;
   %if (&Approx_Num_Records.  le &max_anl_row_cnt.) or %upcase(&analyse_YN)=Y   %then
   %do;
      put  'Analysis of the source table: Row counts by Natural key and Primary key.';
      put /;
      put  / 'max_count_per_NK         =  ' max_count_per_NK;
      put     'max_count_per_PK         =  ' max_count_per_PK;     
      put / '=========================================================================';
   %end;
   %if  &max_flngver.  ge 0  %then
   %do;
      put //;
      put  // "Maximum value for flngver         =  &max_flngver.";
      put / '=================================================================================================================================';
      put //;
   %end;      
run;
%if &nobs_ui gt 0 %then
%do;
   data _null_;            
      set reg_ui end=lastrow ;  
      by Index_Name;
      file tempfile mod ;
      if _n_=1 then 
      do;
         put /;
         put //'Unique Indexes';
         put //;
         put / @7 'Index_Name'  @26 'Column_Name' @  ;
         put / @7 '----------'  @26 '-----------' @;
      end;
      if first.Index_Name then
         put / @7 index_name @;
      put    @26 Column_Name;

    if lastrow then
    do;
       put /;
       put / '=================================================================================================================================';
    end;
   run; 
%end;
%if &nobs_ui_sql. gt 0 %then
%do;
   data _null_;
      file tempfile mod ; 
      set reg_ui_sql end=lastrow ; ;
      by index_name;
      if _n_ =1 then
      do;
         put /;
         put // 'Unique Indexes';
         put //;
         put / @7 'index_name'  @26 'constraint_type' @53  'columns' @;
         put / @7 '----------' @26 '---------------' @53  '-------' @;
      end;
      if first.index_name then
      do;
         put / @7 index_name @;
      end;  
      put    @26 constraint_type @53  columns;
      if lastrow then
     do;
        put /;
        put / '=================================================================================================================================';
    end;
   run;
%end;
data _null_;            
   set reg1 end=lastrow ; 
  
   where  upcase(COLUMN_DATA_TYPE) not in ('BLOB','CLOB' , 'VARBINARY')  ;
   file tempfile mod ;
   if _n_=1 then 
   do;  
  	   put /"Create table DDL."  ;
       put /"When development is complete, please copy the DDL into a file in the release folder"  ;
       put /"   File name format is &target-create.ddl"  ;
       put /"--------------------------------------------------------------"  ;
       put /"CREATE TABLE ${var:target_db}.&target. ("  ;
   end; 
   if COLUMN_NAME ne "&PARTITIONED_BY." then 
      put IMPALA_NAME_DATATYPE;
   if COLUMN_NAME= "&PARTITIONED_BY."  then
      call symput("PARTITIONED_BY_dt", substr(strip(IMPALA_NAME_DATATYPE),1, length(IMPALA_NAME_DATATYPE)-1));
run;


data _null_;            
   file tempfile mod ;
   if (upcase("&pattern.") = " "   or   upcase("&pattern.") = "P1"   or  upcase("&pattern.") = "P2" ) and    
        (findw("&P_H_vars.",'TIMESTAMP')  or findw("&P_H_vars.",'FDTMWHEN')  
        ) then
   do;
      PUT 'record_effective_timestamp TIMESTAMP,';
      PUT 'record_expiry_timestamp TIMESTAMP,';
      PUT 'record_active_flag VARCHAR(1), ' ;
      PUT 'record_deleted_flag VARCHAR(1),';
      %if %upcase("&pattern.") = "P1" %then
      %do;
         PUT 'checksum VARCHAR(32),';
      %end;
      PUT 'insert_object_run_key INT,';
      PUT 'update_object_run_key INT ';
   end;
   else if (upcase("&pattern.") = "P0"   or  upcase("&pattern.") = "P3")  or "&jobname." = "&target._P0"  then
   do;
       PUT 'insert_object_run_key INT';
   end;
   else
   do;
      PUT 'record_effective_timestamp TIMESTAMP,';
      PUT 'record_expiry_timestamp TIMESTAMP,';
      PUT 'record_active_flag VARCHAR(1), ' ;
      PUT 'record_deleted_flag VARCHAR(1),';
      %if %upcase("&pattern.") = "P1" %then
      %do;
         PUT 'checksum VARCHAR(32),';
      %end;
      PUT 'insert_object_run_key INT,';
      PUT 'update_object_run_key INT ';
   end;
   %if %upcase("&pattern.") = "P3"  and "&PARTITIONED_BY." ne "" 
   and "&SORTED_BY"  ne "" %then 
   %do;
     PUT / " ) PARTITIONED BY (&PARTITIONED_BY_dt.) SORT BY (&SORTED_BY.) STORED AS PARQUET;" ; 
   %end;
   %else
   %do;
       PUT / ' ) STORED AS PARQUET;' ; 
   %end; 
put /;
put / '=======================================================';
run;


data _null_;            
   set reg1 end=lastrow ;  
    where  upcase(COLUMN_DATA_TYPE) not in ('BLOB','CLOB' , 'VARBINARY');
   file tempfile mod ;
   if _n_=1 then 
   do;  
       put /"Create views DDL."  ;
       put /"When development is complete, please copy the DDL into files in the release folder"  ;
       put /"With the following modifications:"  ;
       put /"1. Full views" ;
       put /"   File name format is &target-full.ddl"  ;
       put /"2. Restricted views" ;
       put /"   File name format is &target-restricted.ddl"  ;
       put /"--------------------------------------------------------------"  ;
      put //;
      PUT /"CREATE VIEW ${var:view_db}.&target.";
      put 'AS SELECT ' ;
   end;   
   put IMPALA_COLS;
   
run;
 
data _null_;            
   file tempfile mod ;
   if (upcase("&pattern") =  " "  or upcase("&pattern") =  "P1"  or upcase("&pattern.") = "P2") and
    (findw("&P_H_vars.",'TIMESTAMP')   or   findw("&P_H_vars.",'FDTMWHEN') )then
   do;
   PUT 'z.record_effective_timestamp,';
   PUT 'z.record_expiry_timestamp,';
   PUT 'z.record_active_flag, ' ;
   PUT 'z.record_deleted_flag,';
   PUT 'z.insert_object_run_key,';
   PUT 'z.update_object_run_key';
   end;
   else if (upcase("&pattern.") = "P0"   or  upcase("&pattern.") = "P3" or "&jobname." = "&target._P0" ) then
   do;
       PUT 'z.insert_object_run_key';
   end;
   else
   do;
   PUT 'z.record_effective_timestamp,';
   PUT 'z.record_expiry_timestamp,';
   PUT 'z.record_active_flag, ' ;
   PUT 'z.record_deleted_flag,';
   PUT 'z.insert_object_run_key,';
   PUT 'z.update_object_run_key';
   end;
   PUT  " FROM ${var:source_db}.&target. z;" ; 
put /;
put / '=======================================================';

put "Generated by &sysuserid %left(%sysfunc(putn(%sysfunc(datetime()),datetime20.))).";

run;

title;                                                                                                                                 
  data _null_;                                                                                                                           
    infile tempfile;                                                                                                                     
    file print notitles;                                                                                                                 
    input @;                                                                                                                             
    put _infile_;                                                                                                                        
run;   


%mend;
 
