CREATE TABLE ${var:target_db}.app_tblnz_efilecorrespondence (                                                                       
`fi64FileLoadItemKey` BIGINT,                                                                                                       
`flngCaseKey` INT,                                                                                                                  
`fstrDLN` VARCHAR(24),                                                                                                              
`fstrEFileIRDNumber` VARCHAR(18),                                                                                                   
`fintEFileLocationNumber` SMALLINT,                                                                                                 
`fstrClientIRDNumber` VARCHAR(18),                                                                                                  
`fintClientLocationNumber` SMALLINT,                                                                                                
`fstrTaxType` VARCHAR(6),                                                                                                           
`fdtmReceived` TIMESTAMP,                                                                                                           
`fstrDestinationCode1` VARCHAR(6),                                                                                                  
`fdtmCorrespondenceDate` TIMESTAMP,                                                                                                 
`fstrUserIRDNumber` VARCHAR(18),                                                                                                    
`fintUserLocationNumber` SMALLINT,                                                                                                  
`fstrTradeName` VARCHAR(100),                                                                                                       
`fstrUserName` VARCHAR(150),                                                                                                        
`fstrAddress` VARCHAR(120),                                                                                                         
`fstrWorkPhone` VARCHAR(46),                                                                                                        
`fstrAttention` VARCHAR(70),                                                                                                        
`fstrReferenceNumber` VARCHAR(24),                                                                                                  
`fstrDestinationCode2` VARCHAR(6),                                                                                                  
`fstrWho` VARCHAR(20),                                                                                                              
`fdtmWhen` TIMESTAMP,                                                                                                               
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 )                                                                                                                                  
  STORED AS PARQUET;