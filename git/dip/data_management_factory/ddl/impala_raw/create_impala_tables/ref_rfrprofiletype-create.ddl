CREATE TABLE ${var:target_db}.ref_rfrprofiletype (   
fstrprofiletype VARCHAR(12),   
fblnoneforcustomer SMALLINT,   
fblnupdateprofileinfo SMALLINT,   
fblncanbeparent SMALLINT,   
fblncanbechild SMALLINT,   
fblncantransfer SMALLINT,   
fblncommencecease SMALLINT,   
fstrdoctype VARCHAR(24),   
fintdocver SMALLINT,   
fstrattributeprepop VARCHAR(60),   
fstrpostprocessbo VARCHAR(60),   
flngfunction INT,   
fblnactive SMALLINT,   
record_effective_timestamp TIMESTAMP,   
record_expiry_timestamp TIMESTAMP,   
checksum VARCHAR(32),   
record_active_flag VARCHAR(1),   
record_deleted_flag VARCHAR(1),   
insert_object_run_key INT,   
update_object_run_key INT 
) STORED AS PARQUET 
;
