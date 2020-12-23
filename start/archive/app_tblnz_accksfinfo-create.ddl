CREATE TABLE ${var:target_db}.app_tblnz_accksfinfo (
`flngDocKey` INT,
`fstrSchemeType` VARCHAR(510),
`fstrWebsite` VARCHAR(510),
`fstr0800Number` VARCHAR(60),
`fblnCheckDefault` SMALLINT,
`fblnCheckRestricted` SMALLINT,
`fblnCheckWebsite` SMALLINT,
`fstrInvestmentProduct` VARCHAR(104),
`fstrTradingPartner` VARCHAR(200),
`fstrB2BType` VARCHAR(12),
`flngB2BBatchSize` INT,
`fblnThrottle` SMALLINT,
`flngThrottle` INT,
`fblnStopRefunds` SMALLINT,
`fblnStopAllMessages` SMALLINT,
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