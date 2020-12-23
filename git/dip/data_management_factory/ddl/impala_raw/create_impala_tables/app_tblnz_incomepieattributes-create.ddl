CREATE TABLE ${var:target_db}.app_tblnz_incomepieattributes (                                                                       
fi64IncomeKey BIGINT,                                                                                                               
flngVer INT,                                                                                                                        
flngVerLast INT,                                                                                                                    
fcurNetTaxPaid DECIMAL(19,4),                                                                                                       
fcurTotalTaxCredits DECIMAL(19,4),                                                                                                  
fcurRateYearEnd DECIMAL(19,4),                                                                                                      
fcurJointAccountPercentage DECIMAL(19,4),                                                                                           
fblnJointAccountIndicator SMALLINT,                                                                                                 
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;