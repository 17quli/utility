CREATE TABLE ${var:target_db}.app_tblnz_accgstinfohistory (                                                                         
flngDocKey INT,                                                                                                                     
flngVerlast INT,                                                                                                                    
fblnPricesIncGST SMALLINT,                                                                                                          
fblnExemptSupplies SMALLINT,                                                                                                        
fblnImporter SMALLINT,                                                                                                              
fblnExporter SMALLINT,                                                                                                              
fstrRegCircumstance VARCHAR(12),                                                                                                    
fblnUnpolicedFiler SMALLINT,                                                                                                        
fblnSelfInvoicing SMALLINT,                                                                                                         
fblnHospiceFiler SMALLINT,                                                                                                          
fstrHospiceType VARCHAR(12),                                                                                                        
fstrLastAccountingBasis VARCHAR(6),                                                                                                 
fblnGSTOnElectronicServices SMALLINT,                                                                                               
fstrGORSType VARCHAR(12),                                                                                                           
fblnGSTOnLVIG SMALLINT,                                                                                                             
fstrLVIGType VARCHAR(12),                                                                                                           
fblnLVIG1K SMALLINT,                                                                                                                
fblnZeroRatedFinancialServices SMALLINT,                                                                                            
fdtmReopened TIMESTAMP,                                                                                                             
fblnNonResBusinessClaimant SMALLINT,                                                                                                
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET; 