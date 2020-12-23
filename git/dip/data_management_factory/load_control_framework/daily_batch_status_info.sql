/**********************************************************************************************
Script to set up the tables and views needed for generating the text of an email/report 
which is intended to be sent out daily letting the dip developers know how the overnight batch runs
have gone. This may be extended to the wider userbase at some stage.

The two tables provide a list of all jobs for which the status is checked. This list will need to be updated every time 
new jobs are added into an environment.


13032020  ird0dxm  Initial release
14-42020  ird0dxm  Changes for 2.2.4 updated list of objects and filtering out null objects
             

***********************************************************************************************/
-- DDL for tables

--------------------------------------------------------
--  DDL for Table DIP_OBJECT_RUNNING_IN_THIS_ENV
--------------------------------------------------------

  CREATE TABLE "LCF"."DIP_OBJECT_RUNNING_IN_THIS_ENV" 
   (	"TARGET_OBJECT_NAME" VARCHAR2(30 BYTE)
   ) 
   

   
   
truncate table "LCF"."DIP_OBJECT_RUNNING_IN_THIS_ENV" 
   --------------------------------------------------------
--  DDL for Table OBJECT_RUNNING_IN_THIS_ENV
--------------------------------------------------------

  CREATE TABLE "LCF"."OBJECT_RUNNING_IN_THIS_ENV" 
   (	"TARGET_OBJECT_NAME" VARCHAR2(30 BYTE)
   ) 
   
 
-- Insert data into tables

truncate table  dip_object_running_in_this_env;

insert into dip_object_running_in_this_env
select 'rfn_ps_bankruptcy' from dual
union all select 'crw_ps_tblindicator_sec' from dual
union all select 'party' from dual
union all select 'crw_ps_tblid' from dual
union all select 'crw_ps_tblid_ird' from dual
union all select 'crw_ps_tblnz_cstcominfo' from dual
union all select 'APP_TBLNZ_CUSTOMERSTD' from dual
union all select 'ccsitxtdashboard' from dual
union all select 'INDIVIDUAL_DIM' from dual
union all select 'rfn_ps_timeline' from dual
union all select 'crw_ps_tblindicator_insolv' from dual
union all select 'APP_TBLACCOUNT' from dual
union all select 'APP_TBLCUSTOMERINFO' from dual
union all select 'crw_ps_tblnz_customerstd' from dual
union all select 'crw_ps_tblnz_accidgedu' from dual
union all select 'rfn_ps_organisation' from dual
union all select 'crw_ps_tblcustomerstd' from dual
union all select 'crw_ps_tblcustomerinfo' from dual
union all select 'WRQ_TBLWEBNOTICE' from dual
union all select 'APP_TBLACCOUNTINFO' from dual
union all select 'crw_ps_tblnz_custsegmenthist' from dual
union all select 'crw_ps_tblnaics' from dual
union all select 'APP_TBLINDICATOR' from dual
union all select 'organisation' from dual
union all select 'crw_ps_lancustomersubtype' from dual
union all select 'crw_ps_lan_indicator' from dual
union all select 'crw_ps_tblindicator' from dual
union all select 'crw_ps_lancustomerlevel' from dual
union all select 'APP_TBLDOCPOSTTRANSACTION' from dual
union all select 'rfn_ps_individual' from dual
union all select 'crw_ps_lanofficelocation' from dual
union all select 'ORGANISATION_DIM' from dual
union all select 'crw_ps_tblcustomer' from dual
union all select 'PARTY_DIM' from dual
union all select 'APP_TBLMAILITEM' from dual
union all select 'app_tblcustomerinfo' from dual
union all select 'APP_TBLCUSTOMERMAIL' from dual
union all select 'individual' from dual
union all select 'app_tblnz_customerstd' from dual
union all select 'crw_ps_lannz_customerclass' from dual
union all select 'crw_ps_tblcustomerlevel' from dual
union all select 'crw_ps_lannz_customersegments' from dual
union all select 'crw_ps_lancustomertype' from dual
union all select 'crw_ps_tblnamerecord' from dual
union all select 'crw_ps_tblnz_accidgovr' from dual;

commit;

truncate table  object_running_in_this_env;

insert into object_running_in_this_env
union all select 'DSS_RETURNS_KEYPOINTS_IR4' from dual
union all select 'DSS_RETURNS_KEYPOINTS_IR7' from dual
union all select 'DSS_RETURNS_ATTACHMENTS_IR10' from dual
union all select 'DSS_RETURNS_ATTACHMENTS_IR20' from dual
union all select 'DSS_RETURNS_KEYPOINTS_IR3NR' from dual
union all select 'DSS_RETURNS_KEYPOINTS_FS1' from dual
union all select 'DSS_RETURNS_KEYPOINTS_IR6' from dual
union all select 'APP_TBLNZ_FAMENTLMNT' from dual
union all select 'APP_TBLNZ_RTNNITCLB' from dual
union all select 'APP_TBLNZ_RTNNITPRT' from dual
union all select 'APP_TBLNZ_RTNNITEST' from dual
union all select 'APP_TBLNZ_RTNNITMA' from dual
union all select 'APP_TBLNZ_RTNPROPERTYSALE' from dual
union all select 'APP_TBLTRANSACTION' from dual
union all select 'APP_TBLNZ_RTNPSOEMPLOYEESMRY' from dual
union all select 'APP_TBLNZ_RTNIITNR' from dual
union all select 'REF_LANRTNSTATUS' from dual
union all select 'LCF_OBJECT_RUN' from dual
union all select 'LCF_DIP_OBJECT_RUN' from dual
union all select 'APP_TBLNZ_FAMDISBURSEMENT' from dual
union all select 'APP_TBLNZ_FAMDISBURSEMENT' from dual
union all select 'APP_TBLWORKDETAILCOMPLETED' from dual
union all select 'APP_TBLCUSTOMERLEVEL' from dual
union all select 'REF_RFRPROFILETYPE' from dual
union all select 'REF_RFRCOUNTRY' from dual
union all select 'REF_LANCOUNTRY' from dual
union all select 'APP_TBLWORKDETAIL' from dual
union all select 'APP_TBLNZ_SMS' from dual
union all select 'APP_TBLNZ_RTNPIEANNLINEITEM' from dual
union all select 'APP_TBLNZ_RTNNIT' from dual
union all select 'APP_TBLNZ_RTNLINEITEM' from dual
union all select 'APP_TBLNZ_RTNITNSHRLINEITEM' from dual
union all select 'APP_TBLNZ_RTNFINANSTMTS' from dual
union all select 'APP_TBLNZ_RTNFAMSQUAREUP' from dual
union all select 'APP_TBLNZ_FAMENTITLMNTPRDS' from dual
union all select 'APP_TBLNZ_BCMPAYERINFO' from dual
union all select 'APP_TBLNZ_AUDSELECTIONATT' from dual
union all select 'APP_TBLNZ_ACCGSTACCNTNGBASIS' from dual
union all select 'APP_TBLBCMCERTIFICATETOENTITY' from dual
union all select 'APP_TBLBCMCERTIFICATE' from dual
union all select 'APP_TBLAUDITGROUPDETAIL' from dual
union all select 'APP_TBLAUDITDETAIL' from dual
union all select 'APP_TBLAUDIT' from dual
union all select 'APP_TBLAUDITGROUP' from dual
union all select 'APP_TBLAUDITGROUPCUSTOMER' from dual
union all select 'WRQ_TBLWEBLOGONACTIVITY' from dual
union all select 'WRQ_TBLNZ_EMPLOYEREMPLOYEES' from dual
union all select 'REF_RFRNZ_FILING' from dual
union all select 'REF_RFRADDRESSTYPE' from dual
union all select 'REF_LANLINKTYPE' from dual
union all select 'REF_LANADDRESSTYPE' from dual
union all select 'APP_TBLNZ_TAXPREPLINK' from dual
union all select 'APP_TBLNZ_RELATNSHPCHLDTOPCG' from dual
union all select 'APP_TBLNZ_RELATIONSHIPPARTNER' from dual
union all select 'APP_TBLNZ_INCOME' from dual
union all select 'APP_TBLNAMEPROFILE' from dual
union all select 'APP_TBLCONTACT' from dual
union all select 'APP_TBLNZ_RTNIITINCOMESELECT' from dual
union all select 'APP_TBLNZ_RELATIONSHIPCHILD' from dual
union all select 'APP_TBLNZ_LEDCCACTIONS' from dual
union all select 'APP_TBLLINK' from dual
union all select 'APP_TBLADDRESSRECORD' from dual
union all select 'FRD_TBLFRDRULES' from dual
union all select 'FRD_TBLFRDRULERESULT' from dual
union all select 'APP_TBLPERIODBILLITEM' from dual
union all select 'APP_TBLPERIOD' from dual
union all select 'APP_TBLNZ_INSTLMENTAGMTDFLT' from dual
union all select 'APP_TBLNZ_CAMPAIGN' from dual
union all select 'APP_TBLLEAD' from dual
union all select 'APP_TBLCOLLECTPERIOD' from dual
union all select 'APP_TBLCOLLECTPAYMENTPLAN' from dual
union all select 'APP_TBLCOLLECT' from dual
union all select 'WRQ_TBLWEBLOGON' from dual
union all select 'REF_LANPROFILETYPE' from dual
union all select 'REF_LANNZ_INCTAXEXEMPTIONRSN' from dual
union all select 'REF_LANNZ_EMPLOYERGROUP' from dual
union all select 'REF_LANLISTITEM' from dual
union all select 'REF_LANACCOUNTTYPE' from dual
union all select 'REF_LANNZ_EMPLOYERTYPE' from dual
union all select 'REF_LANFILING' from dual
union all select 'REF_LANCLOSEREASON' from dual
union all select 'FRD_TBLFRDPLANDATA' from dual
union all select 'FRD_TBLFRDPLANDATA_1336541184' from dual
union all select 'APP_TBLTASKALL' from dual
union all select 'FRD_TBLFRDACTIONS' from dual
union all select 'FRD_TBLFRDACTIONRESULTS' from dual
union all select 'APP_TBLRETURN' from dual
union all select 'APP_TBLPAYMENT' from dual
union all select 'APP_TBLNZ_RTNPSOEMPLOYEEINFO' from dual
union all select 'APP_TBLNZ_RTNIIT' from dual
union all select 'APP_TBLNZ_RTNGST' from dual
union all select 'APP_TBLNZ_CASPAPERCORRESPND' from dual
union all select 'APP_TBLNZ_ACCPSO' from dual
union all select 'APP_TBLNZ_ACCPIEINFO' from dual
union all select 'APP_TBLNZ_ACCOUNTSTD' from dual
union all select 'APP_TBLNZ_ACCITN' from dual
union all select 'APP_TBLNZ_ACCINCOME' from dual
union all select 'APP_TBLALLOCATION' from dual
union all select 'APP_TBLNZ_ACCGSTINFO' from dual
union all select 'APP_TBLACASEALL' from dual
union all select 'APP_TBLPROFILE' from dual
union all select 'APP_TBLNZ_RTNATTRIBUTES' from dual
union all select 'APP_TBLNZ_GSTREG' from dual
union all select 'APP_TBLNZ_CASFDBKCAUSEDET' from dual
union all select 'APP_TBLNZ_ACCIPE' from dual
union all select 'APP_TBLDOCSETDOC' from dual
union all select 'APP_TBLBANKACCOUNTREFUND' from dual
union all select 'WRQ_TBLWEBNOTICE' from dual
union all select 'REF_LANOFFICELOCATION' from dual
union all select 'REF_LANNZ_CUSTOMERSEGMENTS' from dual
union all select 'REF_LANNZ_CUSTOMERCLASS' from dual
union all select 'REF_LANCUSTOMERTYPE' from dual
union all select 'REF_LANCUSTOMERSUBTYPE' from dual
union all select 'REF_LANCUSTOMERLEVEL' from dual
union all select 'REF_LANINDICATOR' from dual
union all select 'APP_TBLVISIT' from dual
union all select 'APP_TBLNZ_VISITMANAGEDCALL' from dual
union all select 'APP_TBLNZ_CUSTTAXRESIDENCY' from dual
union all select 'APP_TBLNZ_CUSTSEGMENTHIST' from dual
union all select 'APP_TBLNZ_CUSTOMERSTD' from dual
union all select 'APP_TBLNZ_CSTCOMINFO' from dual
union all select 'APP_TBLNZ_CALLLOG' from dual
union all select 'APP_TBLNZ_ACCIDGOVR' from dual
union all select 'APP_TBLNZ_ACCIDGEDU' from dual
union all select 'APP_TBLNAMERECORD' from dual
union all select 'APP_TBLNAICS' from dual
union all select 'APP_TBLMAILITEM' from dual
union all select 'APP_TBLINDICATOR' from dual
union all select 'APP_TBLID' from dual
union all select 'APP_TBLDOCPOSTTRANSACTION' from dual
union all select 'APP_TBLCUSTOMERSTD' from dual
union all select 'APP_TBLCUSTOMERMAIL' from dual
union all select 'APP_TBLCUSTOMER' from dual
union all select 'APP_TBLCRMEXTENDEDLOG' from dual
union all select 'APP_TBLCUSTOMERINFO' from dual
union all select 'APP_TBLACCOUNT' from dual
union all select 'APP_TBLCUSTOMERHISTORY' from dual
union all select 'APP_TBLACCOUNTINFO' from dual
union all select 'DSS_CS_ELIGIBLE_CHILDREN' from dual
union all select 'DSS_CS_CHILDREN' from dual
union all select 'DSS_PAYMENT_REFERENCES' from dual
union all select 'DSS_CLIENT_AGENTS' from dual
union all select 'DSS_TAX_REG_STATUS_CODES' from dual
union all select 'DSS_RETURNS_ATTACHMENTS_IR4S' from dual
union all select 'DSS_RETURNS_ATTACHMENTS_IR7L' from dual
union all select 'DSS_RETURNS_ATTACHMENTS_IR43' from dual
union all select 'DSS_RETURNS_ATTACHMENTS_IR20' from dual
union all select 'DSS_GST_FILING_GRP_TYPES' from dual
union all select 'DSS_CORP_FILING_GROUPS' from dual
union all select 'DSS_CORP_FILING_GROUP_MEMBRS' from dual
union all select 'DSS_CLIENTS_AGENTS_HISTORY' from dual
union all select 'DSS_ADDRESS_TYPES' from dual
union all select 'DSS_NOMINATED_PERSONS' from dual
union all select 'DSS_GST_FILING_GRP_REPS' from dual
union all select 'DSS_GST_FILING_GRP_MEMBERS' from dual
union all select 'DSS_CS_RELATIONSHIPS' from dual
union all select 'DSS_CS_RELATIONSHIP_TYPES' from dual
union all select 'DSS_CS_RELATIONSHIP_STATUS' from dual
union all select 'DSS_CS_REL_END_REASONS' from dual
union all select 'DSS_CASES' from dual
union all select 'DSS_CS_REL_CO_END_REASONS' from dual
union all select 'DSS_CS_NCP_ASSESSMENTS' from dual
union all select 'DSS_CROSS_REFERENCE_TYPES' from dual
union all select 'DSS_POLICING_PROFILES' from dual
union all select 'DSS_ELEMENTS' from dual
union all select 'DSS_CLIENT_CONTACTS' from dual
union all select 'DSS_ADDRESSES' from dual
union all select 'DSS_CASE_ACTIONS' from dual
union all select 'DSS_TAX_TYPES' from dual
union all select 'DSS_TAX_CSA' from dual
union all select 'DSS_CROSS_REFERENCES' from dual
union all select 'DSS_CM_AUDIT_CASES' from dual
union all select 'DSS_TAX_REGISTRATIONS' from dual
union all select 'DSS_TAX_PIE' from dual
union all select 'DSS_TAX_PAY' from dual
union all select 'DSS_TAX_GST' from dual
union all select 'DSS_TAX_FILING_FREQUENCIES' from dual
union all select 'DSS_TAX_EXEMPTION_REASONS' from dual
union all select 'DSS_TAX_CESSATION_REASONS' from dual
union all select 'DSS_CM_AUDIT_PERIODS' from dual
union all select 'DSS_CLIENT_CODES' from dual
union all select 'DSS_ACCOUNT_HALTS' from dual
union all select 'DSS_SPECIAL_CLIENTS_ALL' from dual
union all select 'DSS_OLD_SYSTEM_NUMBERS' from dual
union all select 'DSS_OFFICES' from dual
union all select 'DSS_EXTERNAL_REFERENCES' from dual
union all select 'DSS_ENTITY_TYPES' from dual
union all select 'DSS_ENTITY_CLASSES' from dual
union all select 'DSS_CUSTOMERS' from dual
union all select 'DSS_CLIENTS' from dual
union all select 'DSS_CLIENT_NAMES' from dual
union all select 'DSS_AGENTS' from dual;

commit;

-- Create views (these are still being modified)

--------------------------------------------------------
--  DDL for View V_ALL_DAILY_BATCH_EMAIL
--------------------------------------------------------

--------------------------------------------------------
--  DDL for View V_ALL_DAILY_BATCH_EMAIL
--------------------------------------------------------

  CREATE OR REPLACE FORCE EDITIONABLE VIEW "LCF"."V_ALL_DAILY_BATCH_EMAIL" ("ERROR_CODE", "TEXT") AS 
  select 
case  concat(d.error, e.warning ) 
when  '00' then 0 
when  '01' then 1
when  '10' then 2
when  '11' then 2
else 3 end as error_code,
'EARLIEST RUNTIME OF ANY JOB : ' || c.MIN_START_TIME ||
'|| || ||STATUS BY CATEGORY IN LAST 12HRS ||________________________________||' ||  b.text_body || 
'|| || ||LIST OF JOBS WITH ERROR/WARNING IN LAST 12HRS || _____________________________________________||' || a.objects  as text
from
(select listagg (object_status,'||') within group (order by object_status) as objects 
from (select object_name || ' "' || status ||'"' as object_status 
from lcf.v_all_ob_run_12hr where status in ('ERROR','WARNING','INCOMPLETE') order by status asc)) a,
(select listagg (totals, '||' ) within group (order by totals) as text_body from 
(select '1' as first, category || ' (' || listagg (status_count,';')
within group (order by status_count) || ')' as totals 
from LCF.V_ALL_OB_RUN_CAT_STAT_COUNT_12 group by category order by category )
group by first order by first) b,  v_all_ob_run_min_time_single c,
(select case when count(*) = 0 THEN 0 ELSE 1 END  as error from v_all_ob_run_12hr where status = 'ERROR') d,
(select case when count(*) = 0 THEN 0 ELSE 1 END  as warning from v_all_ob_run_12hr where status = 'WARNING')  e;

   COMMENT ON TABLE "LCF"."V_ALL_DAILY_BATCH_EMAIL"  IS '


Views that need to be included
LCF.V_ALL_OB_RUN_CAT_STAT_COUNT_12
lcf.v_all_ob_run_12hr
v_all_ob_run_min_time_single';


--------------------------------------------------------
--  DDL for View V_ALL_OB_RUN_CAT_STAT_COUNT_12
--------------------------------------------------------

--------------------------------------------------------
--  DDL for View V_ALL_OB_RUN_CAT_STAT_COUNT_12
--------------------------------------------------------

  CREATE OR REPLACE FORCE EDITIONABLE VIEW "LCF"."V_ALL_OB_RUN_CAT_STAT_COUNT_12" ("CATEGORY", "STATUS_COUNT") AS 
  select category, status || ' ' || count as status_count from
(select category,status , count(*) as count from (
(select * from 
(with max_ork as (select object_name, max(object_run_key) as ork from lcf.dip_object_run group by object_name)
  select 
    run.lib_name,
    run.object_name,
    run.category,
    run.start_time,
   case
      when upper(status) like upper('%success%') then 'SUCCESS'
      when upper(status) like upper('%error%') then 'ERROR'
      when upper(status) like upper('%warn%') then 'WARNING'
      when upper(status) like upper('%incomplete%') then 'INCOMPLETE'
      else 'UNDEFINED'
      end
      as status
from 
    lcf.dip_object_run run
    join max_ork on max_ork.ork = run.object_run_key
where

(start_time < sysdate
    and 
  start_time >sysdate-7200/1440)
and
  
  run.object_name in (select * from dip_object_running_in_this_env))
)
UNION 
SELECT * FROM (

with max_ork as (select object_key, max(object_run_key) as ork  from lcf.object_run where object_key is not null group by object_key)
  SELECT
    'RAW Ingestion' as lib_name,
    run.target_object_name as object_name,
    'RAW Ingestion' as category,
    run.start_time,
    case
      when upper(status) like upper('%success%') then 'SUCCESS'
      when upper(status) like upper('%error%') then 'ERROR'
      when upper(status) like upper('%warn%') then 'WARNING'
      when upper(status) like upper('%incomplete%') then 'INCOMPLETE'
      else 'UNDEFINED'
      end
      as status
from 
    lcf.object_run run
    join max_ork on max_ork.ork = run.object_run_key
where run.target_object_name in 
  (select * from object_running_in_this_env)
and
    (load_pattern_name is not null
    or object_run_key is not null
    or target_object_name is not null
    or run.object_key is not null)
and
(
start_time < sysdate
    and 
  start_time >sysdate-7200/1440
)
    )
    )
    
    group by category,status order by category,status);


--------------------------------------------------------
--  DDL for View V_ALL_OB_RUN_12HR
--------------------------------------------------------

  CREATE OR REPLACE FORCE EDITIONABLE VIEW "LCF"."V_ALL_OB_RUN_12HR" ("LIB_NAME", "OBJECT_NAME", "CATEGORY", "START_TIME", "STATUS") AS 
  select "LIB_NAME","OBJECT_NAME","CATEGORY","START_TIME","STATUS"  from
(
(select * from 
(with max_ork as (select object_name, max(object_run_key) as ork from lcf.dip_object_run group by object_name)
  select 
    run.lib_name,
    run.object_name,
    run.category,
    run.start_time,
   case
      when upper(status) like upper('%success%') then 'SUCCESS'
      when upper(status) like upper('%error%') then 'ERROR'
      when upper(status) like upper('%warn%') then 'WARNING'
      when upper(status) like upper('%incomplete%') then 'INCOMPLETE'
      else 'UNDEFINED'
      end
      as status
from 
    lcf.dip_object_run run
    join max_ork on max_ork.ork = run.object_run_key
where
  run.object_name in (select * from DIP_OBJECT_RUNNING_IN_THIS_ENV)
and (start_time < sysdate
    and 
  start_time >sysdate-740/1440) -- 12hrs
)
)
UNION 
SELECT * FROM (

with max_ork as (select object_key, max(object_run_key) as ork from lcf.object_run group by object_key)
  SELECT
    'RAW Ingestion' as lib_name,
    run.target_object_name as object_name,
    'RAW Ingestion' as category,
    run.start_time,
    case
      when upper(status) like upper('%success%') then 'SUCCESS'
      when upper(status) like upper('%error%') then 'ERROR'
      when upper(status) like upper('%warn%') then 'WARNING'
      when upper(status) like upper('%incomplete%') then 'INCOMPLETE'
      else 'UNDEFINED'
      end
      as status
from 
    lcf.object_run run
    join max_ork on max_ork.ork = run.object_run_key
where run.target_object_name in 
  (select * from OBJECT_RUNNING_IN_THIS_ENV)
and
    (load_pattern_name is not null
    and object_run_key is not null
    and target_object_name is not null
    and run.object_key is not null)
 and (start_time < sysdate
    and 
  start_time >sysdate-740/1440) --12hrs
  ) 
    );


--------------------------------------------------------
--  DDL for View V_ALL_OB_RUN_MIN_TIME_SINGLE
--------------------------------------------------------

--------------------------------------------------------
--  DDL for View V_ALL_OB_RUN_MIN_TIME_SINGLE
--------------------------------------------------------

  CREATE OR REPLACE FORCE EDITIONABLE VIEW "LCF"."V_ALL_OB_RUN_MIN_TIME_SINGLE" ("MIN_START_TIME") AS 
  select to_char(min(max_start_time),'YYYY-MM-DD HH:MI AM') as MIN_START_TIME from 
(
SELECT object_name, max(start_time) as max_start_time FROM
(
(select * from 
(with max_ork as (select object_name, max(object_run_key) as ork from lcf.dip_object_run group by object_name)
  select 
    run.lib_name,
    run.object_name,
    run.category,
    run.start_time,
   case
      when upper(status) like upper('%success%') then 'SUCCESS'
      when upper(status) like upper('%error%') then 'ERROR'
      when upper(status) like upper('%warn%') then 'WARNING'
      when upper(status) like upper('%incomplete%') then 'INCOMPLETE'
      else 'UNDEFINED'
      end
      as status
from 
    lcf.dip_object_run run
    join max_ork on max_ork.ork = run.object_run_key
where
  run.object_name in (select * from dip_object_running_in_this_env)
  and not 
   (run.lib_name = 'casfvws' and run.object_name in ('app_tblnz_customerstd','app_tblcustomerinfo'))  
  
  )
)
UNION 
SELECT * FROM (

with max_ork as (select object_key, max(object_run_key) as ork from lcf.object_run group by object_key)
  SELECT
    'RAW Ingestion' as lib_name,
    run.target_object_name as object_name,
    'RAW Ingestion' as category,
    run.start_time,
    case
      when upper(status) like upper('%success%') then 'SUCCESS'
      when upper(status) like upper('%error%') then 'ERROR'
      when upper(status) like upper('%warn%') then 'WARNING'
      when upper(status) like upper('%incomplete%') then 'INCOMPLETE'
      else 'UNDEFINED'
      end
      as status
from 
    lcf.object_run run
    join max_ork on max_ork.ork = run.object_run_key
where run.target_object_name in 
  (select * from object_running_in_this_env  where target_object_name not like 'TDW_%')
and
    (load_pattern_name is not null
    or object_run_key is not null
    or target_object_name is not null
    or run.object_key is not null))
    ) group by object_name );


