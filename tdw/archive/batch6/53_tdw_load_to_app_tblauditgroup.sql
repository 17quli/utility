-- Load data manually from RAW TDW tables into RAW START table
select count(1) from  ${var:target_db}.${var:app_tbl_name};

INSERT INTO TABLE  ${var:target_db}.${var:app_tbl_name} 
SELECT
CAST(FLNGAUDITGROUPKEY AS INT) AS flngAuditGroupKey,
CAST(FSTRAUDITGROUPID AS VARCHAR(60)) AS fstrAuditGroupId,
CAST(FSTRAUDITGROUPTYPE AS VARCHAR(24)) AS fstrAuditGroupType,
CAST(FLNGCUSTOMERKEY AS INT) AS flngCustomerKey,
CAST(FLNGFOLDERKEY AS INT) AS flngFolderKey,
CAST(FLNGDOCKEY AS INT) AS flngDocKey,
CAST(FLNGTEAMKEY AS INT) AS flngTeamKey,
CAST(FSTRAPPROVEDBY AS VARCHAR(20)) AS fstrApprovedBy,
CAST(FDTMAPPROVEDWHEN AS TIMESTAMP) AS fdtmApprovedWhen,
CAST(FDTMCREATEDWHEN AS TIMESTAMP) AS fdtmCreatedWhen,
CAST(FSTRCREATEDBY AS VARCHAR(20)) AS fstrCreatedBy,
CAST(FDTMCLOSEDWHEN AS TIMESTAMP) AS fdtmClosedWhen,
CAST(FSTRCLOSEDBY AS VARCHAR(20)) AS fstrClosedby,
CAST(FSTRWHO AS VARCHAR(20)) AS fstrWho,
CAST(EFFECTIVE_FROM AS TIMESTAMP) AS FDTMWHEN,
CAST(record_effective_timestamp AS TIMESTAMP) AS record_effective_timestamp,
CAST(record_expiry_timestamp AS TIMESTAMP) AS record_expiry_timestamp,
CAST(record_active_flag AS VARCHAR(1)) AS record_active_flag,
CAST(record_deleted_flag AS VARCHAR(1)) AS record_deleted_flag,
CAST(insert_object_run_key AS INT) AS insert_object_run_key,
CAST(update_object_run_key AS INT) AS update_object_run_key
FROM  ${var:target_db}.${var:tdw_tbl_name}; 

-- Check row counts of RAW tables with TDW history loaded:
select count(*) as raw_new_count from  ${var:target_db}.${var:app_tbl_name};
select count(distinct flngauditgroupkey) as distinct_keys_count FROM  ${var:target_db}.${var:app_tbl_name};
select count(*) as low_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_effective_timestamp = '1800-01-01 00:00:00';
select count(*) as high_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_expiry_timestamp = '9000-12-31 00:00:00';
