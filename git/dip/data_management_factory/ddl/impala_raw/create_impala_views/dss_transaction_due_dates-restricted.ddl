CREATE VIEW ${var:view_db}.dss_transaction_due_dates
AS SELECT
z.IRD_NUMBER,
z.LOCATION_NUMBER,
z.TAX_TYPE,
z.RETURN_PERIOD_DATE,
z.SEQ_NO,
z.DATE_DUE,
z.DATE_DUE_NUMBER,
z.DATE_APPLIED,
z.DUE_AMOUNT,
z.USER_ID,
z.PENALTY_AND_INTEREST_AMOUNT,
z.BALANCE,
z.TRANSACTION_CODE,
z.DUE_DATE_REASON_CODE,
z.DATE_UPDATED,
z.DATE_CEASED,
z.`TIMESTAMP`,
z.LATEST_INDICATOR,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.dss_transaction_due_dates z
LEFT OUTER JOIN ${var:source_db}.dss_special_clients_all sc 
ON CAST(z.IRD_NUMBER AS INT) = CAST(sc.IRD_NUMBER as INT)  
WHERE nvl(sc.special_classification, 'STD')='STD' 
AND nvl( sc.record_active_flag,'Y')='Y' 
AND nvl(sc.record_deleted_flag, 'N') = 'N' 
; 