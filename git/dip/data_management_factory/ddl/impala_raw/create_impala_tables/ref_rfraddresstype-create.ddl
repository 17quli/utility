CREATE TABLE ${var:target_db}.ref_rfraddresstype (   
fstraddresstype VARCHAR(40),   
fstrsource VARCHAR(40),   
fstrdistrictofficerule VARCHAR(12),  
 fblncancai SMALLINT,   
 fblnlocationcode SMALLINT,  
 fstrlocationcodemask VARCHAR(100),  
 fstrformatstring VARCHAR(100),  
 fintallowblank SMALLINT,   
 fblnsearchindex SMALLINT,   
 fblncaninactivate SMALLINT,   
 fblncommenceinfuture SMALLINT,   
 fblnceaseinfuture SMALLINT,   
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
