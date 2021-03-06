/**************************************************************************** 
 * Job:             app_tblcustomer P2H2                  A5IKCEC7.BR000011 * 
 * Description:     The customer table in Start suffers from silent         * 
 *                  updates. This process does as good a job as possible    * 
 *                  to ameliorate that, picking up as many changes as it    * 
 *                   is able.                                               * 
 *                                                                          * 
 * Metadata Server: ird10119au.vsp.sas.com                                  * 
 * Port:            8561                                                    * 
 * Location:        /IRD/DIP Data Management/5000 Processes/10 Raw          * 
 *                   Ingestion                                              * 
 *                                                                          * 
 * Server:          SASApp                                A5IKCEC7.AS000002 * 
 *                                                                          * 
 * Source Tables:   tblCustomer - strapp.tblCUSTOMER      A5IKCEC7.BE000027 * 
 *                  tblCustomerInfo -                     A5IKCEC7.BE000028 * 
 *                   strapp.tblCustomerInfo                                 * 
 *                  app_tblcustomer -                     A5IKCEC7.BE000017 * 
 *                   impraw.app_tblcustomer                                 * 
 * Target Table:    app_tblcustomer -                     A5IKCEC7.BE000017 * 
 *                   impraw.app_tblcustomer                                 * 
 *                                                                          * 
 * Generated on:    Wednesday, October 30, 2019 2:44:50 PM NZDT             * 
 * Generated by:    ird0nxa                                                 * 
 * Version:         SAS Data Integration Studio 4.903                       * 
 ****************************************************************************/ 

/* Generate the process id for job  */ 
%put Process ID: &SYSJOBID;

/* General macro variables  */ 
%let jobID = %quote(A5IKCEC7.BR000011);
%let etls_jobName = %nrquote(app_tblcustomer P2H2);
%let etls_userID = %nrquote(ird0nxa);

/* Setup to capture return codes  */ 
%global job_rc trans_rc sqlrc;
%let sysrc = 0;
%let job_rc = 0;
%let trans_rc = 0;
%let sqlrc = 0;
%global etls_stepStartTime; 
/* initialize syserr to 0 */ 
data _null_; run;

%macro rcSet(error); 
   %if (&error gt &trans_rc) %then 
      %let trans_rc = &error;
   %if (&error gt &job_rc) %then 
      %let job_rc = &error;
%mend rcSet; 

%macro rcSetDS(error); 
   if &error gt input(symget('trans_rc'),12.) then 
      call symput('trans_rc',trim(left(put(&error,12.))));
   if &error gt input(symget('job_rc'),12.) then 
      call symput('job_rc',trim(left(put(&error,12.))));
%mend rcSetDS; 

/* Setup for capturing job status  */ 
%let etls_startTime = %sysfunc(datetime(),datetime.);
%let etls_recordsBefore = 0;
%let etls_recordsAfter = 0;
%let etls_lib = 0;
%let etls_table = 0;

%global etls_debug; 
%macro etls_setDebug; 
   %if %str(&etls_debug) ne 0 %then 
      OPTIONS MPRINT%str(;); 
%mend; 
%etls_setDebug; 

/*---- Start of Pre-Process Code  ----*/ 

option nosymbolgen nomlogic nofullstimer bufno=3000 bufsize=65535;
/*---- End of Pre-Process Code  ----*/ 

%rcSet(&syserr); 
%rcSet(&sqlrc); 

/*==========================================================================* 
 * Step:            High Watermark                        A5IKCEC7.BT0003KK * 
 * Transform:       High Watermark                                          * 
 * Description:                                                             * 
 *                                                                          * 
 * Source Table:    app_tblcustomer -                     A5IKCEC7.BE000017 * 
 *                   impraw.app_tblcustomer                                 * 
 *==========================================================================*/ 

%let transformID = %quote(A5IKCEC7.BT0003KK);
%let trans_rc = 0;
%let etls_stepStartTime = %sysfunc(datetime(), datetime20.); 

/* Access the data for DIP Impala RAW (impraw)  */ 
LIBNAME impraw SASIOIMP  DATABASE=dev_raw  DBMAX_TEXT=32767  DSN=ClouderaImpala64  SCHEMA=dev_raw ;
%rcSet(&syslibrc); 

%let SYSLAST = %nrquote(impraw.app_tblcustomer); 

%let _INPUT_count = 1; 
%let _INPUT = impraw.app_tblcustomer;
%let _INPUT_connect =  DBMAX_TEXT=32767 DATABASE=dev_raw DSN=ClouderaImpala64
;
%let _INPUT_engine = SASIOIMP;
%let _INPUT_memtype = DATA;
%let _INPUT_options = %nrquote();
%let _INPUT_alter = %nrquote();
%let _INPUT_path = %nrquote(/IRD/DIP Data Management/3000 Repositories/DIP/DIP Impala Raw/app_tblcustomer%(Table%));
%let _INPUT_type = 1;
%let _INPUT_label = %nrquote();

%let _INPUT0 = impraw.app_tblcustomer;
%let _INPUT0_connect =  DBMAX_TEXT=32767 DATABASE=dev_raw DSN=ClouderaImpala64
;
%let _INPUT0_engine = SASIOIMP;
%let _INPUT0_memtype = DATA;
%let _INPUT0_options = %nrquote();
%let _INPUT0_alter = %nrquote();
%let _INPUT0_path = %nrquote(/IRD/DIP Data Management/3000 Repositories/DIP/DIP Impala Raw/app_tblcustomer%(Table%));
%let _INPUT0_type = 1;
%let _INPUT0_label = %nrquote();

%let _OUTPUT_count = 0; 

%let effective_column = fdtmwhen_info;
%let effective_column_count = 1;
%let effective_column0 = 1;
%let effective_column1 = fdtmwhen_info;
%let pattern = %nrquote(Change Extract);
%let lcf = lcf.OBJECT;
%let lcf_connect =  DBMAX_TEXT=32767 DEFER=YES encoding="utf-8" READBUFF=20000 dbclient_max_bytes=2 PATH="irddev20.vsp.sas.com" AUTHDOMAIN="lcf_dev" 
;
%let lcf_engine = ORACLE;
%let lcf_memtype = DATA;
%let lcf_options = %nrquote();
%let lcf_alter = %nrquote();
%let lcf_path = %nrquote(/IRD/DIP Data Management/3000 Repositories/DIP/DIP LCF/OBJECT%(Table%));
%let lcf_type = 1;
%let lcf_label = %nrquote();

%hwm;
%put &=hwm_max;

%rcSet(&syserr); 
%rcSet(&sysrc); 
%rcSet(&sqlrc); 



/** Step end High Watermark **/

/*==========================================================================* 
 * Step:            Customer                              A5IKCEC7.BT0000KC * 
 * Transform:       Join                                                    * 
 * Description:     Get customers, but also customer info's when timestamp  * 
 *                   (to cover silent updates on the customer table)        * 
 *                                                                          * 
 * Source Tables:   tblCustomer - strapp.tblCUSTOMER      A5IKCEC7.BE000027 * 
 *                  tblCustomerInfo -                     A5IKCEC7.BE000028 * 
 *                   strapp.tblCustomerInfo                                 * 
 * Target Table:    Join - work.tblcustomer               A5IKCEC7.BW000016 * 
 *==========================================================================*/ 

%let transformID = %quote(A5IKCEC7.BT0000KC);
%let trans_rc = 0;
%let etls_stepStartTime = %sysfunc(datetime(), datetime20.); 

/* Access the data for START GTAPP (strapp)  */ 
LIBNAME strapp SQLSVR  PRESERVE_TAB_NAMES=YES  DBMAX_TEXT=32767  PRESERVE_COL_NAMES=YES  Datasrc=NZO_GTAPP  SCHEMA=dbo  AUTHDOMAIN="start_operations" ;
%rcSet(&syslibrc); 

%global etls_sql_pushDown;
%let etls_sql_pushDown = -1;
option DBIDIRECTEXEC;

proc datasets lib = work nolist nowarn memtype = (data view);
   delete tblcustomer;
quit;

proc sql;
   connect to SQLSVR
   ( 
       DBMAX_TEXT=32767 DATASRC=NZO_GTAPP AUTHDOMAIN="start_operations" 
   ); 
   create table work.tblcustomer as
   select
      flngCustomerKey length = 8
                      label = 'flngCustomerKey',
      flngVer length = 8
              label = 'flngVer',
      flngVerLast length = 8
                  label = 'flngVerLast',
      fstrCustomerType length = 12
                       label = 'fstrCustomerType',
      fdtmCommence length = 8
                   format = datetime26.3
                   label = 'fdtmCommence',
      fdtmCease length = 8
                format = datetime26.3
                label = 'fdtmCease',
      flngCustomerLevel length = 8
                        label = 'flngCustomerLevel',
      flngDocKey length = 8
                 label = 'flngDocKey',
      flngFolderKey length = 8
                    label = 'flngFolderKey',
      flngRefreshVer length = 8
                     label = 'flngRefreshVer',
      flngCustomerVersion length = 8
                          label = 'flngCustomerVersion',
      flngWebVersion length = 8
                     label = 'flngWebVersion',
      fdtmWebPublished length = 8
                       format = datetime26.3
                       label = 'fdtmWebPublished',
      fdtmCreated length = 8
                  format = datetime26.3
                  label = 'fdtmCreated',
      fstrWho length = 20
              label = 'fstrWho',
      fdtmWhen length = 8
               format = datetime26.3
               label = 'fdtmWhen',
      fdtmWhen_info length = 8
                    format = DATETIME22.3
                    informat = DATETIME22.3
                    label = 'fdtmWhen'
   from connection to SQLSVR
   (
      select
      cust.flngCustomerKey,
      cust.flngVer,
      cust.flngVerLast,
      cust.fstrCustomerType,
      cust.fdtmCommence,
      cust.fdtmCease,
      cust.flngCustomerLevel,
      cust.flngDocKey,
      cust.flngFolderKey,
      cust.flngRefreshVer,
      cust.flngCustomerVersion,
      cust.flngWebVersion,
      cust.fdtmWebPublished,
      cust.fdtmCreated,
      cust.fstrWho,
      cust.fdtmWhen,
      case 
         when custinfo.fdtmWhen > cust.fdtmWhen
            then custinfo.fdtmWhen
      else cust.fdtmWhen
      end as fdtmWhen_info
   from
      dbo.tblCUSTOMER as cust left join 
      dbo.tblCustomerInfo as custinfo
         on
         (
            cust.flngCustomerKey = custinfo.flngCustomerKey
         )
   where
      case 
         when custinfo.fdtmWhen > cust.fdtmWhen
            then custinfo.fdtmWhen
      else cust.fdtmWhen
      end
      >= &hwm_max
   order by
      flngCustomerKey

   );
   
   %rcSet(&sqlrc); 
   
   disconnect from SQLSVR; 
quit;

%global etls_sql_pushDown;
%let etls_sql_pushDown = &sys_sql_ip_all;

%rcSet(&sqlrc); 



/** Step end Customer **/

/*==========================================================================* 
 * Step:            Change Extract                        A5IKCEC7.BT00009S * 
 * Transform:       Change Extract                                          * 
 * Description:                                                             * 
 *                                                                          * 
 * Source Table:    Join - work.tblcustomer               A5IKCEC7.BW000016 * 
 * Target Table:    app_tblcustomer -                     A5IKCEC7.BE000017 * 
 *                   impraw.app_tblcustomer                                 * 
 *==========================================================================*/ 

%let transformID = %quote(A5IKCEC7.BT00009S);
%let trans_rc = 0;
%let etls_stepStartTime = %sysfunc(datetime(), datetime20.); 

%let SYSLAST = %nrquote(work.tblcustomer); 

%let _INPUT_count = 1; 
%let _INPUT = work.tblcustomer;
%let _INPUT_connect = ;
%let _INPUT_engine = ;
%let _INPUT_memtype = DATA;
%let _INPUT_options = %nrquote();
%let _INPUT_alter = %nrquote();
%let _INPUT_path = %nrquote(/Join_A5IKCEC7.BW000016%(WorkTable%));
%let _INPUT_type = 1;
%let _INPUT_label = %nrquote();

%let _Source = work.tblcustomer;
%let _Source_connect = ;
%let _Source_engine = ;
%let _Source_memtype = DATA;
%let _Source_options = %nrquote();
%let _Source_alter = %nrquote();
%let _Source_path = %nrquote(/Join_A5IKCEC7.BW000016%(WorkTable%));
%let _Source_type = 1;
%let _Source_label = %nrquote();

%let _OUTPUT_count = 1; 
%let _OUTPUT = impraw.app_tblcustomer;
%let _OUTPUT_connect =  DBMAX_TEXT=32767 DATABASE=dev_raw DSN=ClouderaImpala64
;
%let _OUTPUT_engine = SASIOIMP;
%let _OUTPUT_memtype = DATA;
%let _OUTPUT_options = %nrquote();
%let _OUTPUT_alter = %nrquote();
%let _OUTPUT_path = %nrquote(/IRD/DIP Data Management/3000 Repositories/DIP/DIP Impala Raw/app_tblcustomer%(Table%));
%let _OUTPUT_type = 1;
%let _OUTPUT_label = %nrquote();
/* List of target columns to keep  */ 
%let _OUTPUT_keep = flngcustomerkey flngver flngverlast fstrcustomertype fdtmcommence 
        fdtmcease flngcustomerlevel flngdockey flngfolderkey flngrefreshver 
        flngcustomerversion flngwebversion fdtmwebpublished fdtmcreated 
        fstrwho fdtmwhen fdtmwhen_info record_effective_timestamp 
        record_expiry_timestamp record_active_flag record_deleted_flag 
        insert_object_run_key update_object_run_key;
%let _OUTPUT_col_count = 23;
%let _OUTPUT_col0_name = flngcustomerkey;
%let _OUTPUT_col0_table = impraw.app_tblcustomer;
%let _OUTPUT_col0_length = 8;
%let _OUTPUT_col0_type = ;
%let _OUTPUT_col0_format = 11.;
%let _OUTPUT_col0_informat = 11.;
%let _OUTPUT_col0_label = %nrquote(flngcustomerkey);
%let _OUTPUT_col0_input0 = flngCustomerKey;
%let _OUTPUT_col0_input0_table = work.tblcustomer;
%let _OUTPUT_col0_exp = ;
%let _OUTPUT_col0_input = flngCustomerKey;
%let _OUTPUT_col0_input_count = 1;
%let _OUTPUT_col1_name = flngver;
%let _OUTPUT_col1_table = impraw.app_tblcustomer;
%let _OUTPUT_col1_length = 8;
%let _OUTPUT_col1_type = ;
%let _OUTPUT_col1_format = 11.;
%let _OUTPUT_col1_informat = 11.;
%let _OUTPUT_col1_label = %nrquote(flngver);
%let _OUTPUT_col1_input0 = flngVer;
%let _OUTPUT_col1_input0_table = work.tblcustomer;
%let _OUTPUT_col1_exp = ;
%let _OUTPUT_col1_input = flngVer;
%let _OUTPUT_col1_input_count = 1;
%let _OUTPUT_col2_name = flngverlast;
%let _OUTPUT_col2_table = impraw.app_tblcustomer;
%let _OUTPUT_col2_length = 8;
%let _OUTPUT_col2_type = ;
%let _OUTPUT_col2_format = 11.;
%let _OUTPUT_col2_informat = 11.;
%let _OUTPUT_col2_label = %nrquote(flngverlast);
%let _OUTPUT_col2_input0 = flngVerLast;
%let _OUTPUT_col2_input0_table = work.tblcustomer;
%let _OUTPUT_col2_exp = ;
%let _OUTPUT_col2_input = flngVerLast;
%let _OUTPUT_col2_input_count = 1;
%let _OUTPUT_col3_name = fstrcustomertype;
%let _OUTPUT_col3_table = impraw.app_tblcustomer;
%let _OUTPUT_col3_length = 12;
%let _OUTPUT_col3_type = $;
%let _OUTPUT_col3_format = $12.;
%let _OUTPUT_col3_informat = $12.;
%let _OUTPUT_col3_label = %nrquote(fstrcustomertype);
%let _OUTPUT_col3_input0 = fstrCustomerType;
%let _OUTPUT_col3_input0_table = work.tblcustomer;
%let _OUTPUT_col3_exp = ;
%let _OUTPUT_col3_input = fstrCustomerType;
%let _OUTPUT_col3_input_count = 1;
%let _OUTPUT_col4_name = fdtmcommence;
%let _OUTPUT_col4_table = impraw.app_tblcustomer;
%let _OUTPUT_col4_length = 8;
%let _OUTPUT_col4_type = ;
%let _OUTPUT_col4_format = DATETIME29.9;
%let _OUTPUT_col4_informat = DATETIME29.9;
%let _OUTPUT_col4_label = %nrquote(fdtmcommence);
%let _OUTPUT_col4_input0 = fdtmCommence;
%let _OUTPUT_col4_input0_table = work.tblcustomer;
%let _OUTPUT_col4_exp = ;
%let _OUTPUT_col4_input = fdtmCommence;
%let _OUTPUT_col4_input_count = 1;
%let _OUTPUT_col5_name = fdtmcease;
%let _OUTPUT_col5_table = impraw.app_tblcustomer;
%let _OUTPUT_col5_length = 8;
%let _OUTPUT_col5_type = ;
%let _OUTPUT_col5_format = DATETIME29.9;
%let _OUTPUT_col5_informat = DATETIME29.9;
%let _OUTPUT_col5_label = %nrquote(fdtmcease);
%let _OUTPUT_col5_input0 = fdtmCease;
%let _OUTPUT_col5_input0_table = work.tblcustomer;
%let _OUTPUT_col5_exp = ;
%let _OUTPUT_col5_input = fdtmCease;
%let _OUTPUT_col5_input_count = 1;
%let _OUTPUT_col6_name = flngcustomerlevel;
%let _OUTPUT_col6_table = impraw.app_tblcustomer;
%let _OUTPUT_col6_length = 8;
%let _OUTPUT_col6_type = ;
%let _OUTPUT_col6_format = 11.;
%let _OUTPUT_col6_informat = 11.;
%let _OUTPUT_col6_label = %nrquote(flngcustomerlevel);
%let _OUTPUT_col6_input0 = flngCustomerLevel;
%let _OUTPUT_col6_input0_table = work.tblcustomer;
%let _OUTPUT_col6_exp = ;
%let _OUTPUT_col6_input = flngCustomerLevel;
%let _OUTPUT_col6_input_count = 1;
%let _OUTPUT_col7_name = flngdockey;
%let _OUTPUT_col7_table = impraw.app_tblcustomer;
%let _OUTPUT_col7_length = 8;
%let _OUTPUT_col7_type = ;
%let _OUTPUT_col7_format = 11.;
%let _OUTPUT_col7_informat = 11.;
%let _OUTPUT_col7_label = %nrquote(flngdockey);
%let _OUTPUT_col7_input0 = flngDocKey;
%let _OUTPUT_col7_input0_table = work.tblcustomer;
%let _OUTPUT_col7_exp = ;
%let _OUTPUT_col7_input = flngDocKey;
%let _OUTPUT_col7_input_count = 1;
%let _OUTPUT_col8_name = flngfolderkey;
%let _OUTPUT_col8_table = impraw.app_tblcustomer;
%let _OUTPUT_col8_length = 8;
%let _OUTPUT_col8_type = ;
%let _OUTPUT_col8_format = 11.;
%let _OUTPUT_col8_informat = 11.;
%let _OUTPUT_col8_label = %nrquote(flngfolderkey);
%let _OUTPUT_col8_input0 = flngFolderKey;
%let _OUTPUT_col8_input0_table = work.tblcustomer;
%let _OUTPUT_col8_exp = ;
%let _OUTPUT_col8_input = flngFolderKey;
%let _OUTPUT_col8_input_count = 1;
%let _OUTPUT_col9_name = flngrefreshver;
%let _OUTPUT_col9_table = impraw.app_tblcustomer;
%let _OUTPUT_col9_length = 8;
%let _OUTPUT_col9_type = ;
%let _OUTPUT_col9_format = 11.;
%let _OUTPUT_col9_informat = 11.;
%let _OUTPUT_col9_label = %nrquote(flngrefreshver);
%let _OUTPUT_col9_input0 = flngRefreshVer;
%let _OUTPUT_col9_input0_table = work.tblcustomer;
%let _OUTPUT_col9_exp = ;
%let _OUTPUT_col9_input = flngRefreshVer;
%let _OUTPUT_col9_input_count = 1;
%let _OUTPUT_col10_name = flngcustomerversion;
%let _OUTPUT_col10_table = impraw.app_tblcustomer;
%let _OUTPUT_col10_length = 8;
%let _OUTPUT_col10_type = ;
%let _OUTPUT_col10_format = 11.;
%let _OUTPUT_col10_informat = 11.;
%let _OUTPUT_col10_label = %nrquote(flngcustomerversion);
%let _OUTPUT_col10_input0 = flngCustomerVersion;
%let _OUTPUT_col10_input0_table = work.tblcustomer;
%let _OUTPUT_col10_exp = ;
%let _OUTPUT_col10_input = flngCustomerVersion;
%let _OUTPUT_col10_input_count = 1;
%let _OUTPUT_col11_name = flngwebversion;
%let _OUTPUT_col11_table = impraw.app_tblcustomer;
%let _OUTPUT_col11_length = 8;
%let _OUTPUT_col11_type = ;
%let _OUTPUT_col11_format = 11.;
%let _OUTPUT_col11_informat = 11.;
%let _OUTPUT_col11_label = %nrquote(flngwebversion);
%let _OUTPUT_col11_input0 = flngWebVersion;
%let _OUTPUT_col11_input0_table = work.tblcustomer;
%let _OUTPUT_col11_exp = ;
%let _OUTPUT_col11_input = flngWebVersion;
%let _OUTPUT_col11_input_count = 1;
%let _OUTPUT_col12_name = fdtmwebpublished;
%let _OUTPUT_col12_table = impraw.app_tblcustomer;
%let _OUTPUT_col12_length = 8;
%let _OUTPUT_col12_type = ;
%let _OUTPUT_col12_format = DATETIME29.9;
%let _OUTPUT_col12_informat = DATETIME29.9;
%let _OUTPUT_col12_label = %nrquote(fdtmwebpublished);
%let _OUTPUT_col12_input0 = fdtmWebPublished;
%let _OUTPUT_col12_input0_table = work.tblcustomer;
%let _OUTPUT_col12_exp = ;
%let _OUTPUT_col12_input = fdtmWebPublished;
%let _OUTPUT_col12_input_count = 1;
%let _OUTPUT_col13_name = fdtmcreated;
%let _OUTPUT_col13_table = impraw.app_tblcustomer;
%let _OUTPUT_col13_length = 8;
%let _OUTPUT_col13_type = ;
%let _OUTPUT_col13_format = DATETIME29.9;
%let _OUTPUT_col13_informat = DATETIME29.9;
%let _OUTPUT_col13_label = %nrquote(fdtmcreated);
%let _OUTPUT_col13_input0 = fdtmCreated;
%let _OUTPUT_col13_input0_table = work.tblcustomer;
%let _OUTPUT_col13_exp = ;
%let _OUTPUT_col13_input = fdtmCreated;
%let _OUTPUT_col13_input_count = 1;
%let _OUTPUT_col14_name = fstrwho;
%let _OUTPUT_col14_table = impraw.app_tblcustomer;
%let _OUTPUT_col14_length = 20;
%let _OUTPUT_col14_type = $;
%let _OUTPUT_col14_format = $20.;
%let _OUTPUT_col14_informat = $20.;
%let _OUTPUT_col14_label = %nrquote(fstrwho);
%let _OUTPUT_col14_input0 = fstrWho;
%let _OUTPUT_col14_input0_table = work.tblcustomer;
%let _OUTPUT_col14_exp = ;
%let _OUTPUT_col14_input = fstrWho;
%let _OUTPUT_col14_input_count = 1;
%let _OUTPUT_col15_name = fdtmwhen;
%let _OUTPUT_col15_table = impraw.app_tblcustomer;
%let _OUTPUT_col15_length = 8;
%let _OUTPUT_col15_type = ;
%let _OUTPUT_col15_format = DATETIME29.9;
%let _OUTPUT_col15_informat = DATETIME29.9;
%let _OUTPUT_col15_label = %nrquote(fdtmwhen);
%let _OUTPUT_col15_input0 = fdtmWhen;
%let _OUTPUT_col15_input0_table = work.tblcustomer;
%let _OUTPUT_col15_exp = ;
%let _OUTPUT_col15_input = fdtmWhen;
%let _OUTPUT_col15_input_count = 1;
%let _OUTPUT_col16_name = fdtmwhen_info;
%let _OUTPUT_col16_table = impraw.app_tblcustomer;
%let _OUTPUT_col16_length = 8;
%let _OUTPUT_col16_type = ;
%let _OUTPUT_col16_format = DATETIME29.9;
%let _OUTPUT_col16_informat = DATETIME29.9;
%let _OUTPUT_col16_label = %nrquote(fdtmwhen_info);
%let _OUTPUT_col16_input0 = fdtmWhen_info;
%let _OUTPUT_col16_input0_table = work.tblcustomer;
%let _OUTPUT_col16_exp = ;
%let _OUTPUT_col16_input = fdtmWhen_info;
%let _OUTPUT_col16_input_count = 1;
%let _OUTPUT_col17_name = record_effective_timestamp;
%let _OUTPUT_col17_table = impraw.app_tblcustomer;
%let _OUTPUT_col17_length = 8;
%let _OUTPUT_col17_type = ;
%let _OUTPUT_col17_format = DATETIME29.9;
%let _OUTPUT_col17_informat = DATETIME29.9;
%let _OUTPUT_col17_label = %nrquote(record_effective_timestamp);
%let _OUTPUT_col17_exp = ;
%let _OUTPUT_col17_input_count = 0;
%let _OUTPUT_col18_name = record_expiry_timestamp;
%let _OUTPUT_col18_table = impraw.app_tblcustomer;
%let _OUTPUT_col18_length = 8;
%let _OUTPUT_col18_type = ;
%let _OUTPUT_col18_format = DATETIME29.9;
%let _OUTPUT_col18_informat = DATETIME29.9;
%let _OUTPUT_col18_label = %nrquote(record_expiry_timestamp);
%let _OUTPUT_col18_exp = ;
%let _OUTPUT_col18_input_count = 0;
%let _OUTPUT_col19_name = record_active_flag;
%let _OUTPUT_col19_table = impraw.app_tblcustomer;
%let _OUTPUT_col19_length = 1;
%let _OUTPUT_col19_type = $;
%let _OUTPUT_col19_format = $1.;
%let _OUTPUT_col19_informat = $1.;
%let _OUTPUT_col19_label = %nrquote(record_active_flag);
%let _OUTPUT_col19_exp = ;
%let _OUTPUT_col19_input_count = 0;
%let _OUTPUT_col20_name = record_deleted_flag;
%let _OUTPUT_col20_table = impraw.app_tblcustomer;
%let _OUTPUT_col20_length = 1;
%let _OUTPUT_col20_type = $;
%let _OUTPUT_col20_format = $1.;
%let _OUTPUT_col20_informat = $1.;
%let _OUTPUT_col20_label = %nrquote(record_deleted_flag);
%let _OUTPUT_col20_exp = ;
%let _OUTPUT_col20_input_count = 0;
%let _OUTPUT_col21_name = insert_object_run_key;
%let _OUTPUT_col21_table = impraw.app_tblcustomer;
%let _OUTPUT_col21_length = 8;
%let _OUTPUT_col21_type = ;
%let _OUTPUT_col21_format = 11.;
%let _OUTPUT_col21_informat = 11.;
%let _OUTPUT_col21_label = %nrquote(insert_object_run_key);
%let _OUTPUT_col21_exp = ;
%let _OUTPUT_col21_input_count = 0;
%let _OUTPUT_col22_name = update_object_run_key;
%let _OUTPUT_col22_table = impraw.app_tblcustomer;
%let _OUTPUT_col22_length = 8;
%let _OUTPUT_col22_type = ;
%let _OUTPUT_col22_format = 11.;
%let _OUTPUT_col22_informat = 11.;
%let _OUTPUT_col22_label = %nrquote(update_object_run_key);
%let _OUTPUT_col22_exp = ;
%let _OUTPUT_col22_input_count = 0;

%let _target = impraw.app_tblcustomer;
%let _target_connect =  DBMAX_TEXT=32767 DATABASE=dev_raw DSN=ClouderaImpala64
;
%let _target_engine = SASIOIMP;
%let _target_memtype = DATA;
%let _target_options = %nrquote();
%let _target_alter = %nrquote();
%let _target_path = %nrquote(/IRD/DIP Data Management/3000 Repositories/DIP/DIP Impala Raw/app_tblcustomer%(Table%));
%let _target_type = 1;
%let _target_label = %nrquote();
/* List of target columns to keep  */ 
%let _target_keep = flngcustomerkey flngver flngverlast fstrcustomertype fdtmcommence 
        fdtmcease flngcustomerlevel flngdockey flngfolderkey flngrefreshver 
        flngcustomerversion flngwebversion fdtmwebpublished fdtmcreated 
        fstrwho fdtmwhen fdtmwhen_info record_effective_timestamp 
        record_expiry_timestamp record_active_flag record_deleted_flag 
        insert_object_run_key update_object_run_key;
%let _target_col_count = 23;
%let _target_col0_name = flngcustomerkey;
%let _target_col0_table = impraw.app_tblcustomer;
%let _target_col0_length = 8;
%let _target_col0_type = ;
%let _target_col0_format = 11.;
%let _target_col0_informat = 11.;
%let _target_col0_label = %nrquote(flngcustomerkey);
%let _target_col0_input0 = flngCustomerKey;
%let _target_col0_input0_table = work.tblcustomer;
%let _target_col0_exp = ;
%let _target_col0_input = flngCustomerKey;
%let _target_col0_input_count = 1;
%let _target_col1_name = flngver;
%let _target_col1_table = impraw.app_tblcustomer;
%let _target_col1_length = 8;
%let _target_col1_type = ;
%let _target_col1_format = 11.;
%let _target_col1_informat = 11.;
%let _target_col1_label = %nrquote(flngver);
%let _target_col1_input0 = flngVer;
%let _target_col1_input0_table = work.tblcustomer;
%let _target_col1_exp = ;
%let _target_col1_input = flngVer;
%let _target_col1_input_count = 1;
%let _target_col2_name = flngverlast;
%let _target_col2_table = impraw.app_tblcustomer;
%let _target_col2_length = 8;
%let _target_col2_type = ;
%let _target_col2_format = 11.;
%let _target_col2_informat = 11.;
%let _target_col2_label = %nrquote(flngverlast);
%let _target_col2_input0 = flngVerLast;
%let _target_col2_input0_table = work.tblcustomer;
%let _target_col2_exp = ;
%let _target_col2_input = flngVerLast;
%let _target_col2_input_count = 1;
%let _target_col3_name = fstrcustomertype;
%let _target_col3_table = impraw.app_tblcustomer;
%let _target_col3_length = 12;
%let _target_col3_type = $;
%let _target_col3_format = $12.;
%let _target_col3_informat = $12.;
%let _target_col3_label = %nrquote(fstrcustomertype);
%let _target_col3_input0 = fstrCustomerType;
%let _target_col3_input0_table = work.tblcustomer;
%let _target_col3_exp = ;
%let _target_col3_input = fstrCustomerType;
%let _target_col3_input_count = 1;
%let _target_col4_name = fdtmcommence;
%let _target_col4_table = impraw.app_tblcustomer;
%let _target_col4_length = 8;
%let _target_col4_type = ;
%let _target_col4_format = DATETIME29.9;
%let _target_col4_informat = DATETIME29.9;
%let _target_col4_label = %nrquote(fdtmcommence);
%let _target_col4_input0 = fdtmCommence;
%let _target_col4_input0_table = work.tblcustomer;
%let _target_col4_exp = ;
%let _target_col4_input = fdtmCommence;
%let _target_col4_input_count = 1;
%let _target_col5_name = fdtmcease;
%let _target_col5_table = impraw.app_tblcustomer;
%let _target_col5_length = 8;
%let _target_col5_type = ;
%let _target_col5_format = DATETIME29.9;
%let _target_col5_informat = DATETIME29.9;
%let _target_col5_label = %nrquote(fdtmcease);
%let _target_col5_input0 = fdtmCease;
%let _target_col5_input0_table = work.tblcustomer;
%let _target_col5_exp = ;
%let _target_col5_input = fdtmCease;
%let _target_col5_input_count = 1;
%let _target_col6_name = flngcustomerlevel;
%let _target_col6_table = impraw.app_tblcustomer;
%let _target_col6_length = 8;
%let _target_col6_type = ;
%let _target_col6_format = 11.;
%let _target_col6_informat = 11.;
%let _target_col6_label = %nrquote(flngcustomerlevel);
%let _target_col6_input0 = flngCustomerLevel;
%let _target_col6_input0_table = work.tblcustomer;
%let _target_col6_exp = ;
%let _target_col6_input = flngCustomerLevel;
%let _target_col6_input_count = 1;
%let _target_col7_name = flngdockey;
%let _target_col7_table = impraw.app_tblcustomer;
%let _target_col7_length = 8;
%let _target_col7_type = ;
%let _target_col7_format = 11.;
%let _target_col7_informat = 11.;
%let _target_col7_label = %nrquote(flngdockey);
%let _target_col7_input0 = flngDocKey;
%let _target_col7_input0_table = work.tblcustomer;
%let _target_col7_exp = ;
%let _target_col7_input = flngDocKey;
%let _target_col7_input_count = 1;
%let _target_col8_name = flngfolderkey;
%let _target_col8_table = impraw.app_tblcustomer;
%let _target_col8_length = 8;
%let _target_col8_type = ;
%let _target_col8_format = 11.;
%let _target_col8_informat = 11.;
%let _target_col8_label = %nrquote(flngfolderkey);
%let _target_col8_input0 = flngFolderKey;
%let _target_col8_input0_table = work.tblcustomer;
%let _target_col8_exp = ;
%let _target_col8_input = flngFolderKey;
%let _target_col8_input_count = 1;
%let _target_col9_name = flngrefreshver;
%let _target_col9_table = impraw.app_tblcustomer;
%let _target_col9_length = 8;
%let _target_col9_type = ;
%let _target_col9_format = 11.;
%let _target_col9_informat = 11.;
%let _target_col9_label = %nrquote(flngrefreshver);
%let _target_col9_input0 = flngRefreshVer;
%let _target_col9_input0_table = work.tblcustomer;
%let _target_col9_exp = ;
%let _target_col9_input = flngRefreshVer;
%let _target_col9_input_count = 1;
%let _target_col10_name = flngcustomerversion;
%let _target_col10_table = impraw.app_tblcustomer;
%let _target_col10_length = 8;
%let _target_col10_type = ;
%let _target_col10_format = 11.;
%let _target_col10_informat = 11.;
%let _target_col10_label = %nrquote(flngcustomerversion);
%let _target_col10_input0 = flngCustomerVersion;
%let _target_col10_input0_table = work.tblcustomer;
%let _target_col10_exp = ;
%let _target_col10_input = flngCustomerVersion;
%let _target_col10_input_count = 1;
%let _target_col11_name = flngwebversion;
%let _target_col11_table = impraw.app_tblcustomer;
%let _target_col11_length = 8;
%let _target_col11_type = ;
%let _target_col11_format = 11.;
%let _target_col11_informat = 11.;
%let _target_col11_label = %nrquote(flngwebversion);
%let _target_col11_input0 = flngWebVersion;
%let _target_col11_input0_table = work.tblcustomer;
%let _target_col11_exp = ;
%let _target_col11_input = flngWebVersion;
%let _target_col11_input_count = 1;
%let _target_col12_name = fdtmwebpublished;
%let _target_col12_table = impraw.app_tblcustomer;
%let _target_col12_length = 8;
%let _target_col12_type = ;
%let _target_col12_format = DATETIME29.9;
%let _target_col12_informat = DATETIME29.9;
%let _target_col12_label = %nrquote(fdtmwebpublished);
%let _target_col12_input0 = fdtmWebPublished;
%let _target_col12_input0_table = work.tblcustomer;
%let _target_col12_exp = ;
%let _target_col12_input = fdtmWebPublished;
%let _target_col12_input_count = 1;
%let _target_col13_name = fdtmcreated;
%let _target_col13_table = impraw.app_tblcustomer;
%let _target_col13_length = 8;
%let _target_col13_type = ;
%let _target_col13_format = DATETIME29.9;
%let _target_col13_informat = DATETIME29.9;
%let _target_col13_label = %nrquote(fdtmcreated);
%let _target_col13_input0 = fdtmCreated;
%let _target_col13_input0_table = work.tblcustomer;
%let _target_col13_exp = ;
%let _target_col13_input = fdtmCreated;
%let _target_col13_input_count = 1;
%let _target_col14_name = fstrwho;
%let _target_col14_table = impraw.app_tblcustomer;
%let _target_col14_length = 20;
%let _target_col14_type = $;
%let _target_col14_format = $20.;
%let _target_col14_informat = $20.;
%let _target_col14_label = %nrquote(fstrwho);
%let _target_col14_input0 = fstrWho;
%let _target_col14_input0_table = work.tblcustomer;
%let _target_col14_exp = ;
%let _target_col14_input = fstrWho;
%let _target_col14_input_count = 1;
%let _target_col15_name = fdtmwhen;
%let _target_col15_table = impraw.app_tblcustomer;
%let _target_col15_length = 8;
%let _target_col15_type = ;
%let _target_col15_format = DATETIME29.9;
%let _target_col15_informat = DATETIME29.9;
%let _target_col15_label = %nrquote(fdtmwhen);
%let _target_col15_input0 = fdtmWhen;
%let _target_col15_input0_table = work.tblcustomer;
%let _target_col15_exp = ;
%let _target_col15_input = fdtmWhen;
%let _target_col15_input_count = 1;
%let _target_col16_name = fdtmwhen_info;
%let _target_col16_table = impraw.app_tblcustomer;
%let _target_col16_length = 8;
%let _target_col16_type = ;
%let _target_col16_format = DATETIME29.9;
%let _target_col16_informat = DATETIME29.9;
%let _target_col16_label = %nrquote(fdtmwhen_info);
%let _target_col16_input0 = fdtmWhen_info;
%let _target_col16_input0_table = work.tblcustomer;
%let _target_col16_exp = ;
%let _target_col16_input = fdtmWhen_info;
%let _target_col16_input_count = 1;
%let _target_col17_name = record_effective_timestamp;
%let _target_col17_table = impraw.app_tblcustomer;
%let _target_col17_length = 8;
%let _target_col17_type = ;
%let _target_col17_format = DATETIME29.9;
%let _target_col17_informat = DATETIME29.9;
%let _target_col17_label = %nrquote(record_effective_timestamp);
%let _target_col17_exp = ;
%let _target_col17_input_count = 0;
%let _target_col18_name = record_expiry_timestamp;
%let _target_col18_table = impraw.app_tblcustomer;
%let _target_col18_length = 8;
%let _target_col18_type = ;
%let _target_col18_format = DATETIME29.9;
%let _target_col18_informat = DATETIME29.9;
%let _target_col18_label = %nrquote(record_expiry_timestamp);
%let _target_col18_exp = ;
%let _target_col18_input_count = 0;
%let _target_col19_name = record_active_flag;
%let _target_col19_table = impraw.app_tblcustomer;
%let _target_col19_length = 1;
%let _target_col19_type = $;
%let _target_col19_format = $1.;
%let _target_col19_informat = $1.;
%let _target_col19_label = %nrquote(record_active_flag);
%let _target_col19_exp = ;
%let _target_col19_input_count = 0;
%let _target_col20_name = record_deleted_flag;
%let _target_col20_table = impraw.app_tblcustomer;
%let _target_col20_length = 1;
%let _target_col20_type = $;
%let _target_col20_format = $1.;
%let _target_col20_informat = $1.;
%let _target_col20_label = %nrquote(record_deleted_flag);
%let _target_col20_exp = ;
%let _target_col20_input_count = 0;
%let _target_col21_name = insert_object_run_key;
%let _target_col21_table = impraw.app_tblcustomer;
%let _target_col21_length = 8;
%let _target_col21_type = ;
%let _target_col21_format = 11.;
%let _target_col21_informat = 11.;
%let _target_col21_label = %nrquote(insert_object_run_key);
%let _target_col21_exp = ;
%let _target_col21_input_count = 0;
%let _target_col22_name = update_object_run_key;
%let _target_col22_table = impraw.app_tblcustomer;
%let _target_col22_length = 8;
%let _target_col22_type = ;
%let _target_col22_format = 11.;
%let _target_col22_informat = 11.;
%let _target_col22_label = %nrquote(update_object_run_key);
%let _target_col22_exp = ;
%let _target_col22_input_count = 0;


%let ep_key_cols = flngcustomerkey;
%let ep_key_cols_count = 1;
%let ep_key_cols0 = 1;
%let ep_key_cols1 = flngcustomerkey;
%let where = ;
%let change_capture_timestamp = fdtmWhen_info;
%let change_capture_timestamp_count = 1;
%let change_capture_timestamp0 = 1;
%let change_capture_timestamp1 = fdtmWhen_info;
%let history_type = %nrquote(H2);
%let duplication_grain = %nrquote(1);
%let h2_effective_column = fdtmWhen_info;
%let h2_effective_column_count = 1;
%let h2_effective_column0 = 1;
%let h2_effective_column1 = fdtmWhen_info;
%let effective_column = ;
%let effective_column_count = 0;
%let effective_column0 = 0;
%let to_timestamp = ;
%let to_timestamp_count = 0;
%let to_timestamp0 = 0;
%let effective_timestamp_grain = %nrquote(Seconds);
%let purge_grain = %nrquote(1);
%let debug = %nrquote(No);
%let ep_db_create_opts = %nrquote(with serdeproperties %(%'field.delim%'=%'\u0006%', %'line.delim%'=%'\u0007%', %'serialization.format%'=%'\u0006%',%'serialization.escape.crlf%'=%'true%'%) stored as textfile);
%let lcf = lcf.OBJECT;
%let lcf_connect =  DBMAX_TEXT=32767 DEFER=YES encoding="utf-8" READBUFF=20000 dbclient_max_bytes=2 PATH="irddev20.vsp.sas.com" AUTHDOMAIN="lcf_dev" 
;
%let lcf_engine = ORACLE;
%let lcf_memtype = DATA;
%let lcf_options = %nrquote();
%let lcf_alter = %nrquote();
%let lcf_path = %nrquote(/IRD/DIP Data Management/3000 Repositories/DIP/DIP LCF/OBJECT%(Table%));
%let lcf_type = 1;
%let lcf_label = %nrquote();
%let ep_db_opts_count = %nrquote(1);
%let ep_db_opts = %nrquote(stored as parquet);
%let ep_db_opts1 = %nrquote(stored as parquet);
%let logging = lcf.OBJECT_RUN;
%let logging_connect =  DBMAX_TEXT=32767 DEFER=YES encoding="utf-8" READBUFF=20000 dbclient_max_bytes=2 PATH="irddev20.vsp.sas.com" AUTHDOMAIN="lcf_dev" 
;
%let logging_engine = ORACLE;
%let logging_memtype = DATA;
%let logging_options = %nrquote();
%let logging_alter = %nrquote();
%let logging_path = %nrquote(/IRD/DIP Data Management/3000 Repositories/DIP/DIP LCF/OBJECT_RUN%(Table%));
%let logging_type = 1;
%let logging_label = %nrquote();
/* Access the data for DIP Hive Staging (hivestg)  */ 
LIBNAME hivestg HADOOP  URI="jdbc:hive2://ird26au.vsp.sas.com:10001/;principal=hive/ird26au.vsp.sas.com@VSP.SAS.COM;ssl=true;sslTrustStore=/sso/sfw/sas/940/hadoopfiles/DigiAndSAS-CA.jks"  HDFS_TEMPDIR="/env/1_dev/landing/" LOGIN_TIMEOUT=0  DEFER=YES  
PORT=10001 SERVER="ird26au.vsp.sas.com"  SCHEMA=dev_staging ;
%rcSet(&syslibrc); 

%let stg_hive_connect =  DEFER=YES URI="jdbc:hive2://ird26au.vsp.sas.com:10001/;principal=hive/ird26au.vsp.sas.com@VSP.SAS.COM;ssl=true;sslTrustStore=/sso/sfw/sas/940/hadoopfiles/DigiAndSAS-CA.jks" HDFS_TEMPDIR="/env/1_dev/landing/" LOGIN_TIMEOUT=0 SERVER="ird26au.vsp.sas.com"  PORT=10001
;
%let stg_hive_engine = HADOOP;
%let stg_hive_path = /IRD/DIP Data Management/1000 Libraries/DIP Hive Staging (hivestg)(Library);
%let stg_hive = hivestg;
/* Access the data for DIP Impala Staging (impstg)  */ 
LIBNAME impstg SASIOIMP  DATABASE=dev_staging  HDFS_TEMPDIR="/env/1_dev/landing/"  DSN=ClouderaImpala64  SCHEMA=dev_staging ;
%rcSet(&syslibrc); 

%let ep_staging_library_connect =  DATABASE=dev_staging DSN=ClouderaImpala64
;
%let ep_staging_library_engine = SASIOIMP;
%let ep_staging_library = impstg;
%let ep_staging_library_path = /IRD/DIP Data Management/1000 Libraries/DIP Impala Staging (impstg)(Library);
%let Source_table_type = %nrquote(view);
%let tagsort = %nrquote(No);

/* List of target columns to keep  */ 
%let _keep = flngcustomerkey flngver flngverlast fstrcustomertype fdtmcommence 
        fdtmcease flngcustomerlevel flngdockey flngfolderkey flngrefreshver 
        flngcustomerversion flngwebversion fdtmwebpublished fdtmcreated 
        fstrwho fdtmwhen fdtmwhen_info record_effective_timestamp 
        record_expiry_timestamp record_active_flag record_deleted_flag 
        insert_object_run_key update_object_run_key;
/* List of target columns to keep  */ 
%let keep = flngcustomerkey flngver flngverlast fstrcustomertype fdtmcommence 
        fdtmcease flngcustomerlevel flngdockey flngfolderkey flngrefreshver 
        flngcustomerversion flngwebversion fdtmwebpublished fdtmcreated 
        fstrwho fdtmwhen fdtmwhen_info record_effective_timestamp 
        record_expiry_timestamp record_active_flag record_deleted_flag 
        insert_object_run_key update_object_run_key;
%change_extract;

%rcSet(&syserr); 
%rcSet(&sysrc); 
%rcSet(&sqlrc); 



/** Step end Change Extract **/

%let etls_endTime = %sysfunc(datetime(),datetime.);


