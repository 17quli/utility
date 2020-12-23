CREATE TABLE ${var:target_db}.app_tblnz_visitmanagedcall (
`flngDocKey` INT,
`fstrCallerIrdNumber` VARCHAR(20),
`fstrAuthorisedIrdNumber` VARCHAR(20),
`fstrAuthorisedRelationshipType` VARCHAR(12),
`fstrTaxAgentName` VARCHAR(100),
`fstrVoiceEnrolStatus` VARCHAR(2),
`fstrVoiceOptOutStatus` VARCHAR(2),
`fstrTransferReason` VARCHAR(510),
`fstrCallerIntentCorrect` VARCHAR(6),
`fstrCallerIntent` VARCHAR(100),
`fstrCorrectedIntent` VARCHAR(100),
`fstrCallQueue` VARCHAR(100),
`fstrStageOneFeedback` VARCHAR(24),
`fblnVirtualHold` SMALLINT,
`fblnContactDetailsChecked` SMALLINT,
`fstrWho` VARCHAR(20),
`fdtmWhen` TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 )

  STORED AS PARQUET;