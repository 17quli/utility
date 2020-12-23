CREATE TABLE ${var:target_db}.wrq_tblwebattachments (
flngWebAttachmentKey INT,
fstrWebAttachmentType VARCHAR(24),
flngWebReqKey INT,
fstrName VARCHAR(510),
flngCheckSum INT,
flngSize INT,
flngSizeCompressed INT,
fstrDescription VARCHAR(510),
fi64BinaryDataKey BIGINT,
fblnForcedPDF SMALLINT,
fi64DocEditInProgressKey BIGINT,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;
