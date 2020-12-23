CREATE TABLE ${var:target_db}.app_tblnz_slsunlinkeddeduct (                                                                         
flngTransKey INT,                                                                                                                   
fdtmTransEffect TIMESTAMP,                                                                                                          
fstrTransType VARCHAR(40),                                                                                                          
fcurTransAmount DECIMAL(19,4),                                                                                                      
flngReturnKey INT,                                                                                                                  
flngLineItemNumber INT,                                                                                                             
fstrEmployerIRD VARCHAR(40),                                                                                                        
fstrEmployerLocation VARCHAR(510),                                                                                                  
flngEmployerAccountKey INT,                                                                                                         
fdtmEmployerFilingPeriod TIMESTAMP,                                                                                                 
fstrDLNPrefix VARCHAR(40),                                                                                                          
fstrDLNBody VARCHAR(60),                                                                                                            
fstrDLNSuffix VARCHAR(40),                                                                                                          
fdtmLinked TIMESTAMP,                                                                                                               
fstrLinkedBy VARCHAR(20),                                                                                                           
insert_object_run_key INT                                                                                                      
 ) STORED AS PARQUET;                 