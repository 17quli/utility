CREATE TABLE ${var:target_db}.app_tblnz_rtnitnbenlineitem (                                                                         
fi64LineItemKey BIGINT,                                                                                                             
flngVer INT,                                                                                                                        
flngVerLast INT,                                                                                                                    
fstrBeneficiaryName VARCHAR(200),                                                                                                   
fdtmBeneficiaryDOB TIMESTAMP,                                                                                                       
fstrBeneficiaryAddress VARCHAR(510),                                                                                                
fstrBeneficiaryIRD VARCHAR(18),                                                                                                     
fblnBeneficiaryIsNonResident SMALLINT,                                                                                              
fcurBeneficiaryInterest DECIMAL(19,4),                                                                                              
fcurBeneficiaryDividends DECIMAL(19,4),                                                                                             
fcurBeneficiaryMaoriAuthority DECIMAL(19,4),                                                                                        
fcurBeneficiaryOverseas DECIMAL(19,4),                                                                                              
fcurBeneficiaryOther DECIMAL(19,4),                                                                                                 
fcurBeneficiaryTaxableIncome DECIMAL(19,4),                                                                                         
fblnBeneficiaryTrustPayingTax SMALLINT,                                                                                             
fcurBeneficiaryNonComplying DECIMAL(19,4),                                                                                          
fcurBeneficiaryTaxOnTaxableInc DECIMAL(19,4),                                                                                       
fcurBeneficiaryOverseasTaxPaid DECIMAL(19,4),                                                                                       
fcurBeneficiaryTaxLessOverseas DECIMAL(19,4),                                                                                       
fcurBeneficiaryImputation DECIMAL(19,4),                                                                                            
fcurBeneficiaryAfterImputation DECIMAL(19,4),                                                                                       
fcurBeneficiaryTaxCredits DECIMAL(19,4),                                                                                            
fcurBeneficiaryTaxLessCredits DECIMAL(19,4),                                                                                        
fcurBeneficiaryTaxNonComplying DECIMAL(19,4),                                                                                       
fcurBeneficiaryTotalTaxPayable DECIMAL(19,4),                                                                                       
fcurBeneficiaryDeductions DECIMAL(19,4),                                                                                            
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET; 