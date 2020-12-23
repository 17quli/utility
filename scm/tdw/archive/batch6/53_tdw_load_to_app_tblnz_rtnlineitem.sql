-- Load data manually from RAW TDW tables into RAW START table
select count(1) from  ${var:target_db}.${var:app_tbl_name};

INSERT INTO TABLE  ${var:target_db}.${var:app_tbl_name} 
SELECT
CAST(FI64LINEITEMKEY AS BIGINT) AS fi64LineItemKey,
CAST(FLNGRETURNKEY AS INT) AS flngReturnKey,
CAST(FSTRGATEWAYREFERENCEID AS VARCHAR(40)) AS fstrGatewayReferenceId,
CAST(FLNGACCOUNTKEY AS INT) AS flngAccountKey,
CAST(FDTMFILINGPERIOD AS TIMESTAMP) AS fdtmFilingPeriod,
CAST(FSTRRETURNDOCTYPE AS VARCHAR(24)) AS fstrReturnDocType,
CAST(FINTRETURNDOCVER AS SMALLINT) AS fintReturnDocVer,
CAST(FSTRID AS VARCHAR(60)) AS fstrId,
CAST(FSTRIDTYPE AS VARCHAR(12)) AS fstrIdType,
CAST(FSTRIRDNUMBER AS VARCHAR(18)) AS fstrIRDNumber,
CAST(FSTRNAME AS VARCHAR(510)) AS fstrName,
CAST(FLNGBATCHKEY AS INT) AS flngBatchKey,
CAST(FINTBATCHSEQUENCE AS SMALLINT) AS fintBatchSequence,
CAST(FBLNINERROR AS SMALLINT) AS fblnInError,
CAST(FDTMDELETED AS TIMESTAMP) AS fdtmDeleted,
CAST(FBLNPROCESSED AS SMALLINT) AS fblnProcessed,
CAST(FSTRWHO AS VARCHAR(20)) AS fstrWho,
CAST(EFFECTIVE_FROM AS TIMESTAMP) AS FDTMWHEN,
CAST(record_effective_timestamp AS TIMESTAMP) AS record_effective_timestamp,
CAST(record_expiry_timestamp AS TIMESTAMP) AS record_expiry_timestamp,
CAST(RECORD_ACTIVE_FLAG AS VARCHAR(1)) AS record_active_flag,
CAST('N' AS VARCHAR(1)) AS record_deleted_flag,
CAST(insert_object_run_key AS INT) AS insert_object_run_key,
CAST(update_object_run_key AS INT) AS update_object_run_key
FROM  ${var:target_db}.${var:tdw_tbl_name}; 

-- Check row counts of RAW tables with TDW history loaded:
select count(*) as raw_new_count from  ${var:target_db}.${var:app_tbl_name};
select count(distinct FI64LINEITEMKEY) as distinct_keys_count FROM  ${var:target_db}.${var:app_tbl_name};
select count(*) as low_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_effective_timestamp = '1800-01-01 00:00:00';
select count(*) as high_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_expiry_timestamp = '9000-12-31 00:00:00';
