CREATE TABLE ${var:target_db}.app_tblemail (
flngEmailKey INT,
fstrEmailType VARCHAR(12),
fstrFrom VARCHAR(200),
fstrTo VARCHAR(510),
fstrCc VARCHAR(510),
fstrSubject VARCHAR(510),
fstrMessage VARCHAR(32767),
flngCustomerKey INT,
flngAccountKey INT,
fdtmFilingPeriod TIMESTAMP,
flngFolderKey INT,
flngCrmKey INT,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
insert_object_run_key INT

 ) STORED AS PARQUET;