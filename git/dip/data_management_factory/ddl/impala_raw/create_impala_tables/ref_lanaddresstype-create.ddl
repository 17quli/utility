CREATE TABLE ${var:target_db}.ref_lanaddresstype (   
fstrlanguage VARCHAR(6),   
fstraddresstype VARCHAR(40),   
fstrdecode1 VARCHAR(60),   
fstrdecode2 VARCHAR(510),   
fstrdecodeweb1 VARCHAR(60),   
fstrdecodeweb2 VARCHAR(510),   
fstrdescription VARCHAR(2000),   
record_effective_timestamp TIMESTAMP,   
record_expiry_timestamp TIMESTAMP,   
checksum VARCHAR(32),   
record_active_flag VARCHAR(1),   
record_deleted_flag VARCHAR(1),   
insert_object_run_key INT,   
update_object_run_key INT 
) STORED AS PARQUET 
;
