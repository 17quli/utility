create table ${var:target_db}.app_tblworkdetailcompleted 
(
flngWorkKey INT,

fstrWorkType VARCHAR(12),

fstrWorkCategory VARCHAR(12),

flngVer INT,

flngVerLast INT,

fdtmCreated TIMESTAMP,

fdtmAssigned TIMESTAMP,

fdtmCompleted TIMESTAMP,

fdtmAborted TIMESTAMP,

fdtmDue TIMESTAMP,

fdtmDueTime TIMESTAMP,

fdtmAvailable TIMESTAMP,

fdtmExpire TIMESTAMP,

fstrOwner VARCHAR(20),

fstrSubscriber VARCHAR(20),

fstrNote VARCHAR(8000),

fstrReason VARCHAR(60),

fstrSource VARCHAR(12),

fblnHasWorkData SMALLINT,

fblnValid SMALLINT,

flngCustomerKey INT,

fintProfile SMALLINT,

flngAccountKey INT,

fdtmPeriod TIMESTAMP,

fstrAccountType VARCHAR(12),

fstrStage VARCHAR(12),

fcurAmount DECIMAL(19,4),

fstrExternalID VARCHAR(60),

flngDocKey INT,

flngIndicatorKey INT,

fstrIndicator VARCHAR(12),

flngCRMKey INT,

fstrWho VARCHAR(20),

fdtmWhen TIMESTAMP,

record_effective_timestamp TIMESTAMP,

record_expiry_timestamp TIMESTAMP,

record_active_flag VARCHAR(1),

record_deleted_flag VARCHAR(1),

insert_object_run_key INT,

update_object_run_key INT

 ) STORED AS PARQUET;
