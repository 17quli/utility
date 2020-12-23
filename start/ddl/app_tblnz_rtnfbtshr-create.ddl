CREATE TABLE ${var:target_db}.app_tblnz_rtnfbtshr (                                                                                 
flngDocKey INT,                                                                                                                     
fcurTaxableBenefits DECIMAL(19,4),                                                                                                  
fcurFBTTaxRate DECIMAL(19,4),                                                                                                       
fblnAlternateCalc SMALLINT,                                                                                                         
fcurFringeTaxCalculation DECIMAL(19,4),                                                                                             
fcurExemptFringeBenefits DECIMAL(19,4),                                                                                             
fblnGSTAmended SMALLINT,                                                                                                            
fcurGSTPayable DECIMAL(19,4),                                                                                                       
fcurTotalAmount DECIMAL(19,4),                                                                                                      
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;      