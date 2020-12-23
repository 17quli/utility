-- Load data manually from RAW TDW tables into RAW START table
select count(1) from  ${var:target_db}.${var:app_tbl_name};

INSERT INTO TABLE  ${var:target_db}.${var:app_tbl_name} 
SELECT
CAST(FLNGDOCKEY AS INT) AS flngDocKey,
CAST(FSTRAUDCUSTOMERGROUP AS VARCHAR(12)) AS fstrAudCustomerGroup,
CAST(FSTRAUDCOMPLIANCEBEHAVIOUR AS VARCHAR(12)) AS fstrAudComplianceBehaviour,
CAST(FSTRAUDRISKDESCRIPTION AS VARCHAR(40)) AS fstrAudRiskDescription,
CAST(FSTRAUDCOSTCENTRE AS VARCHAR(12)) AS fstrAudCostCentre,
CAST(FSTRWHO AS VARCHAR(20)) AS fstrWho,
CAST(effective_from AS TIMESTAMP) AS fdtmwhen,
CAST(record_effective_timestamp AS TIMESTAMP) AS record_effective_timestamp,
CAST(record_expiry_timestamp AS TIMESTAMP) AS record_expiry_timestamp,
CAST(CURRENT_REC_FLAG AS VARCHAR(1)) AS record_active_flag,
CAST('N' AS VARCHAR(1)) AS record_deleted_flag,
CAST(insert_object_run_key AS INT) AS insert_object_run_key,
CAST(update_object_run_key AS INT) AS update_object_run_key
FROM  ${var:target_db}.${var:tdw_tbl_name}; 

-- Check row counts of RAW tables with TDW history loaded:
select count(*) as raw_new_count from  ${var:target_db}.${var:app_tbl_name};
select count(distinct flngdockey) as distinct_keys_count FROM  ${var:target_db}.${var:app_tbl_name};
select count(*) as low_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_effective_timestamp = '1800-01-01 00:00:00';
select count(*) as high_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_expiry_timestamp = '9000-12-31 00:00:00';
