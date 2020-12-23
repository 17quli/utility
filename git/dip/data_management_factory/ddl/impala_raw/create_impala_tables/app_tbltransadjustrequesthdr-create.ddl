CREATE TABLE ${var:target_db}.app_tbltransadjustrequesthdr (                                                                        
flngRequestKey INT,                                                                                                                 
flngVer INT,                                                                                                                        
flngVerLast INT,                                                                                                                    
fstrAdjustType VARCHAR(12),                                                                                                         
fstrRequestStatus VARCHAR(12),                                                                                                      
flngCustomerKey INT,                                                                                                                
flngAccountKey INT,                                                                                                                 
fdtmFilingPeriod TIMESTAMP,                                                                                                         
flngWorkKey INT,                                                                                                                    
flngCaseKey INT,                                                                                                                    
flngFolderKey INT,                                                                                                                  
fcurRequestAmount DECIMAL(19,4),                                                                                                    
fstrRequestedBy VARCHAR(20),                                                                                                        
fdtmRequested TIMESTAMP,                                                                                                            
fstrRejectedBy VARCHAR(20),                                                                                                         
fdtmRejected TIMESTAMP,                                                                                                             
fstrWithdrawnBy VARCHAR(20),                                                                                                        
fdtmWithdrawn TIMESTAMP,                                                                                                            
fstrApprovedBy VARCHAR(20),                                                                                                         
fdtmApproved TIMESTAMP,                                                                                                             
fstrReversedBy VARCHAR(20),                                                                                                         
fdtmReversed TIMESTAMP,                                                                                                             
flngCRMKey INT,                                                                                                                     
fstrDescription VARCHAR(4000),                                                                                                      
fcurOriginalRequest DECIMAL(19,4),                                                                                                  
fcurOriginalRequestPenalty DECIMAL(19,4),                                                                                           
fcurOriginalRequestInterest DECIMAL(19,4),                                                                                          
fstrAdjustReason VARCHAR(12),                                                                                                       
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;