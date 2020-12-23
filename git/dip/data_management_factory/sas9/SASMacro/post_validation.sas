 %macro  post_validation(schema=,Object_Name=, Target_table_name=,pattern_historisation=, EffectiveToTimestamp=,flngver_col=flngver)/ minoperator mindelimiter=',';
/*
 
Checks the timings of initial and subsequent runs.
Checks if a subsequent run was completed with records written.
Checks if active row counts match between source and target.


OUTPUT:
     "/sso/biconfig/940/Lev1/Logs/Validation_outputs/&Target_table_name.._post_validation.txt"

Usage:
 
Must select  a valid schema:
 
If  source object is longer than 25 chars then pass the target name.  Otherwise no need.
    %post_validation(schema=NZO_GTAPP,Object_Name=tblAccountTransfer,pattern_historisation=P2H2)
    
====================================================================
Change History in REVERSE CHRONOLOGICAL ORDER

Date      Who               what
28/04/2020 ird0nxl    Included LCF.SRC_TGT_SCHEMA when deciding the target table
05/03/2020 ird0nxl     Added NZS_GTAPP, NZS_GTREF, NZS_GTWRQ, NZS_GTWEB, NZS_GTWRQ  schema to whitelist
02/12/2019 Aaron Scoble Added NZO GTWEB schema to whitelist
09/10/2019 Dan Ikonnikov    changed target table name length test from 24 to 25
07/10/2019 Daniel Moore     Code for new SUMMARY schema
18/09/2019 Nalaka Lamahewa  first written
===========================================================================*/


%let source_sys= ;
%let AUTHDOMAIN  =;
%let PATH  = ; 
%let Datasrc  = ;  
%let SYSTEM_NAME = ;
%let trgtblpfx= ;
%let schema =%upcase(&schema.);
%let schema_name =%upcase(&schema.);
%let pattern_historisation=%upcase(&pattern_historisation.);
%let Incremental_run_success= ;
%let inc_object_run_key =;
%let source_row_count =;


proc datasets lib=work nolist nodetails;
    delete reg:;
quit;
 
%if  &pattern_historisation. =       %then
%do;
   %put "Invalid pattern_historisation =&pattern_historisation..  Please select one of the following or update the macro to include the new value:";
   %put "P0, P1, P2H1, P2H2, P2H3, P2H4";
   %abort;
%end;
%else %if  &pattern_historisation. =   or  NOT( &pattern_historisation. in (P0, P1, P2H1,P2H2,P2H3,P2H4,P3) )    %then
%do;
   %put "Invalid pattern_historisation =&pattern_historisation..  Please select one of the following or update the macro to include the new value:";
   %put "P0, P1, P2H1,P2H2,P2H2,P2H4,P3";
   %abort;
%end;

LIBNAME t_lib SASIOIMP  DATABASE=dev_raw  DBMAX_TEXT=32767  DSN=ClouderaImpala64  SCHEMA=dev_raw ;


%let alczr_schemas=PROPERTY,DIA_DEATHS,COMPANIES;
%let dip_schemas=DSS, 67AWCH,SXT4,BESSOWN,DSSMART,17THHO,SUMMARY, KXT5,CMEOWN;
%let sql_schemas=NZO_GTAPP, NZO_GTFRD,NZO_GTREF,NZO_GTWRQ,NZO_GTSTC,NZO_GTWEB,NZS_GTAPP, NZS_GTREF, NZS_GTWRQ, NZS_GTWEB, NZS_GTWRQ;

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
   %if %length(&Object_Name.)  le 25   %then
   %do;
      %let Target_table_name= %lowcase(&trgtblpfx.&Object_Name.);
   %end;   
   %else 
   %do;
      %put " Source table name &Object_Name. is longer than 25 chars.  Please provide an appropriate target table name.";
      %abort;
   %end;  
%end;
%else 
%do;
   %if %length(&Object_Name.)  gt 25 %then
   %do;
      %if %length(&Target_table_name.)  gt 25   %then
      %do;
         %put " Target table name &Target_table_name. is longer than 25 chars.  Please provide an appropriate target table name.";
         %abort;
      %end;
      %else
      %do;
         %let Target_table_name= %lowcase(&trgtblpfx.&Target_table_name.);
      %end;
   %end;
   %else
   %do;
      %let Target_table_name= %lowcase(&trgtblpfx.&Target_table_name.);
   %end; 
%end;

proc sql noprint;
   select TARGET_OBJECT_NAME, NK_COLUMN_NAMES , 
   upcase(LOAD_PATTERN_NAME) ,  upcase(HISTORY_TYPE)  
   into :lcf_TARGET_OBJECT_NAME, :lcf_NK_COLUMN_NAMES
   , :lcf_LOAD_PATTERN_NAME,  :lcf_HISTORY_TYPE
   FROM LCF.OBJECT o
   inner join LCF.SRC_TGT_SCHEMA sts
   on o.SYSTEM_SCHEMA_KEY= sts.SYSTEM_SCHEMA_KEY
   where %upcase(o.SOURCE_OBJECT_NAME) like "&Object_Name." 
   and  o.SAS_LIB_REF ne 'EDWTDW'
   and  %upcase(sts.SCHEMA_NAME) =%upcase("&schema_name.")
 ;
quit;

%put &=AUTHDOMAIN.;
%put &=PATH.; 
%put &=Datasrc.;  
%put &=schema.;  
%put&=Object_Name.; 
%put &=Target_table_name;
%put &=pattern_historisation.;
%put &=lcf_TARGET_OBJECT_NAME.;
%put &=lcf_NK_COLUMN_NAMES.;
%put &=lcf_LOAD_PATTERN_NAME.;
%put &=lcf_HISTORY_TYPE.;

%if  %lowcase(&lcf_TARGET_OBJECT_NAME.) ne %lowcase(&Target_table_name.) %then
%do; 
   %put " Target table name &Target_table_name. does not match the taget table name &lcf_TARGET_OBJECT_NAME. registered in LCF.OBJECT.  Please provide the correct target table name.";
   %abort;
%end;

PROC SQL;
   CREATE TABLE reg_rts AS
   SELECT 
   OBJECT_PRG_NAME ,
   round((END_TIME-START_TIME)/60) as duration_min,
   START_TIME,
   END_TIME, 
   'STATUS'n , 
   RECORDS_READ , 
   RECORDS_WRITTEN, 
   case 
      when  year(datepart(PREV_HIGH_WATER_MARK_VALUE))=1800  then
         'Y'
      else 'N'   
   end   as first_run  ,
   object_run_key,
   PREV_HIGH_WATER_MARK_VALUE
   FROM LCF.OBJECT_RUN 
   where lowcase(TARGET_OBJECT_NAME) like "&Target_table_name."
   and (
/*         compress(lowcase(OBJECT_PRG_NAME)) = %sysfunc(compress(%lowcase('&Target_table_name.' || '&pattern_historisation.')))  or */
        strip(lowcase(OBJECT_PRG_NAME)) = %sysfunc(compress(%lowcase('&Target_table_name.'||'_' || '&pattern_historisation.')))
      )
   and
   ('STATUS'n  = 'Job Successful'
   or 
   STATUS contains 'Job Ended with Warnings'
   )
/*    and RECORDS_WRITTEN > 0 */
   ORDER BY  START_TIME desc;
RUN;
data _NULL_;
	if 0 then set reg_rts nobs=n;
	call symputx('reg_nrows',n);
	stop;
run;
%put &=reg_nrows;

%if &reg_nrows =0 %then
%do;
   %put "There are no  successfull job runs for the job &Target_table_name._&pattern_historisation..  Please check the DIS job name /source object name /target object name (both without the prefix) / pattern_historisation is correct ";
   %abort;
%end;

%put &=pattern_historisation.;
%put &=lcf_TARGET_OBJECT_NAME.;
%put &=lcf_NK_COLUMN_NAMES.;
%put &=lcf_LOAD_PATTERN_NAME.;
%put &=lcf_HISTORY_TYPE.;


%if &pattern_historisation. = P0 and &lcf_LOAD_PATTERN_NAME.   ne FULLREPLACEMENT and &lcf_HISTORY_TYPE ne    %then
%do; 
   %put "&=pattern_historisation. do not match with LCF.OBJECT.LOAD_PATTERN_NAME =&LOAD_PATTERN_NAME. and/or LCF.OBJECT.HISTORY_TYPE =&lcf_HISTORY_TYPE";
   %put "Please check your merge statement and correct the LCF registration.";
   %abort;
%end; 
%else %if &pattern_historisation. = P1 and &lcf_LOAD_PATTERN_NAME.   ne FULLCOMPARISON  and &lcf_HISTORY_TYPE ne %then
%do; 
   %put "&=pattern_historisation. do not match with LCF.OBJECT.LOAD_PATTERN_NAME =&LOAD_PATTERN_NAME. and/or LCF.OBJECT.HISTORY_TYPE =&lcf_HISTORY_TYPE";
   %put "Please check your merge statement and correct the LCF registration.";
   %abort;
%end;
%else %if &pattern_historisation. = P3 and &lcf_LOAD_PATTERN_NAME.   ne EVENTEXTRACT   and &lcf_HISTORY_TYPE ne  %then
%do; 
   %put "&=pattern_historisation. do not match with LCF.OBJECT.LOAD_PATTERN_NAME =&LOAD_PATTERN_NAME. and/or LCF.OBJECT.HISTORY_TYPE =&lcf_HISTORY_TYPE";
   %put "Please check your merge statement and correct the LCF registration.";
   %abort;
%end;
%else %if &pattern_historisation. in (P2H1, P2H2, P2H3, P2H4) %then
%do;
   %if &lcf_LOAD_PATTERN_NAME. ne CHANGEEXTRACT %then
   %do; 
      %put "&=pattern_historisation. do not match with LCF.OBJECT.LOAD_PATTERN_NAME =&LOAD_PATTERN_NAME..";
      %put "Please check your merge statement and correct the LCF registration.";
      %abort;
   %end;
   %else %if (&pattern_historisation. =P2H1) and (&lcf_HISTORY_TYPE ne H1)  %then
   %do; 
      %put "&=pattern_historisation. do not match with LCF.OBJECT.HISTORY_TYPE =&lcf_HISTORY_TYPE";
      %put "Please check your merge statement and correct the LCF registration.";
      %abort;
   %end;
   %else %if (&pattern_historisation. =P2H2) and (&lcf_HISTORY_TYPE ne H2)  %then
   %do; 
      %put "&=pattern_historisation. do not match with LCF.OBJECT.HISTORY_TYPE =&lcf_HISTORY_TYPE";
      %put "Please check your merge statement and correct the LCF registration.";
      %abort;
   %end;
   %else %if (&pattern_historisation. =P2H3) and (&lcf_HISTORY_TYPE ne H3)  %then
   %do; 
      %put "&=pattern_historisation. do not match with LCF.OBJECT.HISTORY_TYPE =&lcf_HISTORY_TYPE";
      %put "Please check your merge statement and correct the LCF registration.";
      %abort;
   %end;
   %else %if (&pattern_historisation. =P2H4) and (&lcf_HISTORY_TYPE ne H4)  %then
   %do; 
      %put "&=pattern_historisation. do not match with LCF.OBJECT.HISTORY_TYPE =&lcf_HISTORY_TYPE";
      %put "Please check your merge statement and correct the LCF registration.";
      %abort;
   %end;
%end;      
 

data reg_rts1;
   set reg_rts ;
   by  descending  START_TIME;
   NK_cols="&lcf_NK_COLUMN_NAMES.";
   if _n_ =1 then
   do;
      if first_run ='Y'  then
      do;
        call symput('Incremental_run_success','NO records incrementally updated for the Job-');
        output;
        stop;
      end;
      else if first_run ='N' and RECORDS_WRITTEN >0 then
      do;
         call symput('Incremental_run_success','Incremental update done for the job -');
         call symput('inc_object_run_key',object_run_key);
         output;
      end;
      else if first_run ='N' and RECORDS_WRITTEN =0 then
      do;
         call symput('Incremental_run_success','NO Incremental update done for the job -');
         call symput('inc_object_run_key',object_run_key);
         output;
      end;
   end;  
   else
   do;
      if first_run ='Y' then 
      do;
         output;
         stop;
      end;
      if first_run ='N' and RECORDS_WRITTEN >0 then
      do;
         call symput('Incremental_run_success','Incremental update done for the job-');
         call symput('inc_object_run_key',object_run_key);
         output;
      end;
      *output;
   end;
run;

%put &=Incremental_run_success.;
Proc sort data =reg_rts1;
   by START_TIME;
run;
 
%if  &source_sys.=ORACLE_S %then
%do; 
   LIBNAME s_lib ORACLE  DBCOMMIT=0  DBMAX_TEXT=32767  DEFER=YES  PRESERVE_COL_NAMES=YES  PRESERVE_TAB_NAMES=YES  READBUFF=20000  encoding="utf-8" dbclient_max_bytes=2  PATH="&PATH." SCHEMA="&SCHEMA." AUTHDOMAIN="&AUTHDOMAIN." ;
   /*add more P/H values separted by a comma.   in (P2H3,P2H1)*/
   %if &pattern_historisation. in (P2H3) %then 
   %do;
      %if &EffectiveToTimestamp.=  %then
      %do;
        %let EffectiveToTimestamp=DATE_CEASED;
      %end;
           
      %let dsid = %sysfunc(open(s_lib.&Object_Name));
      %let varnum = %sysfunc(varnum(&dsid, &EffectiveToTimestamp));
      %let rc = %sysfunc(close(&dsid));
      %put &=dsid.;
      %put &=varnum.;
      %if &varnum. gt 0 %then
      %do;
         proc sql  noprint;
            create table reg_rcount_s as
            select count(*) as s_rcount format=32.
              from s_lib.&Object_Name
             where     &EffectiveToTimestamp =.;
           ; 
         quit;
         %let varnum= ;
      %end;
      %else
      %do;
        %put "DATE_CEASED Column does not exists in the  source object &Object_Name. ";
        %put "Please check pattern_historisation= &pattern_historisation. is correct for the job or rerun the macro with an appropriate EffectiveToTimestamp column assigned to EffectiveToTimestamp= ";
        %abort;
      %end;
   %end;    
   %else
   %do;
      proc sql  noprint;
         create table reg_rcount_s as
         select count(*) as s_rcount format=32.
              from s_lib.&Object_Name
        ; 
      quit;
   %end; 
%end;   
/* process source tables from SQL servers */
%else %if  &source_sys.=MSSQL_S %then
%do; 
   LIBNAME s_lib SQLSVR Datasrc="&Datasrc." schema="&schema." readbuff=32767 authdomain="&authdomain."; 
  /*add more P/H values separted by a comma.   in (P2H3,P2H1)*/
   %if &pattern_historisation. in (P2H1) %then 
   %do;         
      %let dsid = %sysfunc(open(s_lib.&Object_Name));
      %let varnum1 = %sysfunc(varnum(&dsid, &flngver_col));
      %let varnum2 = %sysfunc(varnum(&dsid, FDTMEFFECTIVETO));
      %let rc = %sysfunc(close(&dsid));
      %put &=dsid.;
      %put &=varnum1.;
      %put &=varnum2.;
      %if &varnum1. gt 0 and &varnum2. le 0 %then
      %do;
         proc sql  noprint;
            create table reg_rcount_s as
            select count(*) as s_rcount format=32.
              from s_lib.&Object_Name
             where  flngver =0 /*and datepart(fdtmwhen)<=today()*/
             ;
           ; 
         quit;
         %let varnum1= ;
      %end;
      %else 
      %do;
         %let dsid = %sysfunc(open(s_lib.&Object_Name));
         %let varnum3 = %sysfunc(varnum(&dsid, FLNGVERLAST));
         %let rc = %sysfunc(close(&dsid));
         %put &=dsid.;
         %put &=varnum2.;
         %put &=varnum3.;
         %if &varnum3. gt 0 and &varnum2. le 0 %then
         %do;
            proc sql  noprint;
               create table reg_rcount_s as
               select count(*) as s_rcount format=32.
               from s_lib.&Object_Name
               where  FLNGVERLAST =0 /*and datepart(fdtmwhen)<=today()*/
              ;
              ; 
            quit;
           %let varnum3= ;
         %end;
         %else
         %do;
            %if &varnum2. gt 0 %then
            %do;
               %put "FDTMEFFECTIVETO column exist in the source object &Object_Name. Please check pattern_historisation= &pattern_historisation. is correct for the job";   
               %let varnum2= ;
               %abort;
            %end;
            %else %do;
               %put "Neither &flngver_col.  nor FLNGVERLAST Columns exists in the  source object &Object_Name. ";
               %put "Please check pattern_historisation= &pattern_historisation. is correct for the job or rerun the macro with an appropriate EffectiveToTimestamp column assigned to EffectiveToTimestamp= ";
               %let varnum2= ;
               %abort;
            %end;   
         %end;
      %end;   
   %end;
   %else %if &pattern_historisation. in (P2H3) %then 
   %do;
      %if &EffectiveToTimestamp.=  %then
      %do;
        %let EffectiveToTimestamp=FDTMEFFECTIVETO ;
      %end;
           
      %let dsid = %sysfunc(open(s_lib.&Object_Name));
      %let varnum4 = %sysfunc(varnum(&dsid, &EffectiveToTimestamp));
      %let rc = %sysfunc(close(&dsid));
      %put &=dsid.;
      %put &=varnum4.;
      %if &varnum4. gt 0 %then
      %do;
         proc sql  noprint;
            create table reg_rcount_s as
            select count(*) as s_rcount format=32.
              from s_lib.&Object_Name
             where  year(datepart(&EffectiveToTimestamp.)) =9999   
             or &EffectiveToTimestamp. = . ; 
         quit;
         %let varnum4= ;
      %end;
      %else
      %do;
        %put "FDTMEFFECTIVETO Column does not exist in the  source object &Object_Name. ";
        %put "Please check pattern_historisation= &pattern_historisation. is correct for the job or rerun the macro with an appropriate EffectiveToTimestamp column assigned to EffectiveToTimestamp= ";
         %abort;
      %end;
   %end;
   %else
   %do;
      proc sql  noprint;
         create table reg_rcount_s as
         select count(*) as s_rcount format=32.
              from s_lib.&Object_Name
        ; 
      quit;
   %end; 
%end;


proc sql noprint;
      select s_rcount into :source_row_count
   from reg_rcount_s
   ;
quit;
%put &=source_row_count.;  


/* get target counts*/
%if &pattern_historisation. in (P0, P3) %then 
%do;
   proc sql  noprint;
      create table reg_rcount_t as
      select count(*) as t_rcount format=32.
      from t_lib.&Target_table_name.
      ; 
   quit;
%end;   
%else 
%do;
   proc sql  noprint;
      create table reg_rcount_t as
      select count(*) as t_rcount format=32.
      from t_lib.&Target_table_name.
      where  record_active_flag = 'Y' ; 
   quit;
%end;
  /* compare source count and target counts*/ 
proc sql   ;
   create table counts_s_t as
   select 
   &source_row_count. as source_row_count ,
   t_rcount  as target_row_count,
   case
    when &source_row_count. = target_row_count then
       'Pass'
    else   'Fail'   
    end as source_target_row_count_compare
    from reg_rcount_t
     ; 
quit; 

filename tempfile "/sso/biconfig/940/Lev1/Logs/Validation_outputs/&Target_table_name._2_post_validation.txt" lrecl=256 new; 
TITLE;
FOOTNOTE;

data _null_;            
   set REG_RTS1 end=lastrow ;  
   by OBJECT_PRG_NAME;
   file tempfile ;
   if _n_=1 then
      do;
         put /"Post-Job Implementation validation results for Source table &Object_Name.." ;
         put // ;
         put "Pattern/Historisation =   &pattern_historisation";
         put "Target_table_name =&Target_table_name.";
         put // '=============================================================================';
         put // ;
         if ("&pattern_historisation." = "P2H1" or "&pattern_historisation." = "P2H2" or "&pattern_historisation." = "P2H3") and    
        (findw("&lcf_NK_COLUMN_NAMES.",'FLNGVER',,'spit') or findw("&lcf_NK_COLUMN_NAMES.",'FLNGVERLAST',,'spit')or findw("&lcf_NK_COLUMN_NAMES.",'FDTMEFFECTIVETO',,'spit') or findw("&lcf_NK_COLUMN_NAMES.",'DATE_APPLIED',,'spit')) then
         do;
            put // "WARNING: Check the Natural Key in LCF.OBJECT as it contains one or more of FLNGVER/FLNGVERLAST/FDTMEFFECTIVETO/DATE_APPLIED " ;
            put / "Natural Key =  " NK_cols;
            put // '=============================================================================';
         end;
         put // ;
         put // "&Incremental_run_success. " OBJECT_PRG_NAME;
         put /;
         put // "Successfull Job Runs for " OBJECT_PRG_NAME;
         put //;
         PUT / @2 'FIRST_RUN   '  @16 'DURATION_IN_MINUTES'  @36 'RECORDS_READ' @50 'RECORDS_WRITTEN' @66 'START_TIME' @ ;
         put / @2 '------------'  @16 '-------------------'  @36 '------------' @50 '---------------' @66 '---------'@;
         put /;
      end;
    
      put    @2 first_run  @16  duration_min @36 RECORDS_READ @50 RECORDS_WRITTEN @66 START_TIME;
      if lastrow then
     do;
        put /;
        put / '=================================================================================================================================';
    end;  
   run;
data _null_;            
   set counts_s_t end=lastrow ;  
 
   file tempfile mod;
   if _n_=1 
then
      do;
        put // ;
         put / "Active record counts comparison between Source table &Object_Name. and Target Table &&Target_table_name.." ;
         put // ;
         put /;
         PUT / @2 'Records Count-Source'  @28 'Records Count-Target'  @56 'RESULT' @;
         put / @2 '--------------------'  @28 '-------------------'   @56 '--------' @;
         put /;
      end;
   
      put    @2 source_row_count  @28  target_row_count @56 source_target_row_count_compare @;
      if lastrow then
     do;
        put /;
        put / '=================================================================================================================================';
    end;  
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
 

