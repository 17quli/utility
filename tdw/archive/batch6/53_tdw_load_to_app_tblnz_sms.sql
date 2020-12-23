-- Load data manually from RAW TDW tables into RAW START table
select count(1) from  ${var:target_db}.${var:app_tbl_name};

INSERT INTO TABLE  ${var:target_db}.${var:app_tbl_name} (
flngSMSKey,
fstrSMSType,
fstrDestinationNumber,
fstrContent,
flngCustomerKey,
flngAccountKey,
flngWebLogonKey,
flngAppointmentKey,
flngFolderKey,
fstrExternalId,
fdtmRequested,
fdtmProcessed,
fdtmDelay,
fdtmLastSent,
fstrLastExternalMessageId,
fstrLastExternalMessageStatus,
fstrWho,
fdtmWhen,
record_effective_timestamp,
record_expiry_timestamp,
record_active_flag,
record_deleted_flag,
insert_object_run_key,
update_object_run_key,
fblnCanceled,
fstrBatch
)
SELECT
CAST(z.FLNGSMSKEY AS INT) AS flngSMSKey,
CAST(z.FSTRSMSTYPE AS VARCHAR(24)) AS fstrSMSType,
CAST(z.FSTRDESTINATIONNUMBER AS VARCHAR(48)) AS fstrDestinationNumber,
CAST(z.FSTRCONTENT AS VARCHAR(3200)) AS fstrContent,
CAST(z.FLNGCUSTOMERKEY AS INT) AS flngCustomerKey,
CAST(z.FLNGACCOUNTKEY AS INT) AS flngAccountKey,
CAST(z.FLNGWEBLOGONKEY AS INT) AS flngWebLogonKey,
CAST(z.FLNGAPPOINTMENTKEY AS INT) AS flngAppointmentKey,
CAST(z.FLNGFOLDERKEY AS INT) AS flngFolderKey,
CAST(z.FSTREXTERNALID AS VARCHAR(100)) AS fstrExternalId,
CAST(z.FDTMREQUESTED AS TIMESTAMP) AS fdtmRequested,
CAST(z.FDTMPROCESSED AS TIMESTAMP) AS fdtmProcessed,
CAST(z.FDTMDELAY AS TIMESTAMP) AS fdtmDelay,
CAST(z.FDTMLASTSENT AS TIMESTAMP) AS fdtmLastSent,
CAST(z.FSTRLASTEXTERNALMESSAGEID AS VARCHAR(32)) AS fstrLastExternalMessageId,
CAST(z.FSTRLASTEXTERNALMESSAGESTATUS AS VARCHAR(20)) AS fstrLastExternalMessageStatus,
CAST(z.FSTRWHO AS VARCHAR(20)) AS fstrWho,
CAST(z.EFFECTIVE_FROM AS TIMESTAMP) AS FDTMWHEN,
CAST(z.record_effective_timestamp AS TIMESTAMP) AS record_effective_timestamp,
CAST(z.record_expiry_timestamp AS TIMESTAMP) AS record_expiry_timestamp,
CAST(z.record_active_flag AS VARCHAR(1)) AS record_active_flag,
CAST(z.record_deleted_flag AS VARCHAR(1)) AS record_deleted_flag,
CAST(z.insert_object_run_key AS INT) AS insert_object_run_key,
CAST(z.update_object_run_key AS INT) AS update_object_run_key,
nvl(a.fblnCanceled,0),
case 
when z.record_active_flag='Y' then a.fstrBatch
else null
end 
FROM  ${var:target_db}.${var:tdw_tbl_name} z
left outer join ${var:target_db}.app_tblnz_sms_${var:yyyymmdd} a
on CAST(z.FLNGSMSKEY AS INT) =a.flngsmskey;

-- Check row counts of RAW tables with TDW history loaded:
select count(*) as raw_new_count from  ${var:target_db}.${var:app_tbl_name};
select count(distinct flngsmskey) as distinct_keys_count FROM  ${var:target_db}.${var:app_tbl_name};
select count(*) as low_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_effective_timestamp = '1800-01-01 00:00:00';
select count(*) as high_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_expiry_timestamp = '9000-12-31 00:00:00';
