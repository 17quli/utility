CREATE TABLE ${var:target_db}.app_tblnz_rtncfc (                                                                                    
flngDocKey INT,                                                                                                                     
fintSeq SMALLINT,                                                                                                                   
fstrName VARCHAR(510),                                                                                                              
fdtmBalanceDate TIMESTAMP,                                                                                                          
fstrPrimaryActivity VARCHAR(24),                                                                                                    
fstrPrimaryActivityOther VARCHAR(100),                                                                                              
fstrJurisdiction VARCHAR(6),                                                                                                        
fstrJurisdictionOther VARCHAR(100),                                                                                                 
fstrCurrency VARCHAR(6),                                                                                                            
fstrCurrencyOther VARCHAR(100),                                                                                                     
fcurGrossRevenue DECIMAL(19,4),                                                                                                     
fcurRoyaltyIncome DECIMAL(19,4),                                                                                                    
fcurProfitBeforeTax DECIMAL(19,4),                                                                                                  
fcurTotalAssets DECIMAL(19,4),                                                                                                      
fstrAustralianCFC VARCHAR(6),                                                                                                       
fstrActiveCFC VARCHAR(6),                                                                                                           
flngEmployees INT,                                                                                                                  
fcurEarnings DECIMAL(19,4),                                                                                                         
fcurAssetsLessFinancial DECIMAL(19,4),                                                                                              
fcurIncomeInterest DECIMAL(19,4),                                                                                                   
fcurAttributedIncome DECIMAL(19,4),                                                                                                 
fcurIncomeAfterLoss DECIMAL(19,4),                                                                                                  
fcurCreditsEarned DECIMAL(19,4),                                                                                                    
fcurCreditsUsed DECIMAL(19,4),                                                                                                      
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;