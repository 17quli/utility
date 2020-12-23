

CREATE TABLE ${var:target_db}.dss_correspondence_inbound (
IRD_NUMBER INT,
LOCATION_NUMBER INT,
TAX_TYPE VARCHAR(6),
DATE_RECEIVED TIMESTAMP,
DOC_LODGE_NBR_PREFIX INT,
DOC_LODGE_NBR INT,
PROCESSING_OFFICE_CODE INT,
DATE_LODGED TIMESTAMP,
LODGE_USER_ID VARCHAR(16),
CORRESPONDENCE_TYPE_CODE VARCHAR(2),
DATE_WRITTEN TIMESTAMP,
SUBJECT_CODE INT,
DIFFICULTY_CODE INT,
NUMBER_OF_ACTION_POINTS INT,
FUNCTION_CODE INT,
CUST_OFFICE_CODE VARCHAR(4),
CUST_SERVICE_CENTRE_CODE VARCHAR(6),
SEGMENT_CODE VARCHAR(2),
MICRO_SEGMENT_CODE VARCHAR(4),
ITEM_STATUS_CODE VARCHAR(6),
DELETED_INDICATOR VARCHAR(2),
ACTION_FUNCTION_CODE INT,
ACTION_OFFICE_UNIT_CODE VARCHAR(6),
ACTION_SERVICE_CENTRE_CODE VARCHAR(6),
ACTION_OFFICE_CODE VARCHAR(4),
DATE_ASSIGNED TIMESTAMP,
ACTION_SEGMENT_CODE VARCHAR(2),
ACTION_MICRO_SEGMENT_CODE VARCHAR(4),
DATE_TARGETED TIMESTAMP,
DATE_RESPONDED TIMESTAMP,
DATE_COMPLETED TIMESTAMP,
ACTION_USER_ID VARCHAR(16),
SUPERVISOR_USER_ID VARCHAR(16),
`TIMESTAMP` TIMESTAMP,
RELATED_ITEM_STATUS_CODE VARCHAR(6),
BATCH_NUMBER INT,
INTERIM_CORRESPONDENCE_DATE TIMESTAMP,
FILING_OFFICER_USER_ID VARCHAR(16),
DATE_FILED TIMESTAMP,
NUMBER_OF_BOX INT,
DATE_DOCUMENT_LOST TIMESTAMP,
DOCUMENT_SEQ_NBR_WITHIN_BOX INT,
FILE_TRACKING_DOC_STATUS_CODE VARCHAR(2),
STATUS_DATE TIMESTAMP,
CASE_NUMBER INT,
CASE_TYPE_CODE VARCHAR(6),
TIME_RECEIVED INT,
IP_ADDRESS VARCHAR(72),
PROCESS_DATE TIMESTAMP,
ACCOUNT_OPENED_DATE TIMESTAMP,
PAYLOAD_ID VARCHAR(82),
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;