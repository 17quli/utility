CREATE TABLE ${var:target_db}.app_tblemails (                                                                                       
flngEmailKey INT,                                                                                                                   
fstrGroup VARCHAR(24),                                                                                                              
fintGroupPriority SMALLINT,                                                                                                         
fstrFrom VARCHAR(200),                                                                                                              
fstrReplyTo VARCHAR(200),                                                                                                           
fstrTo VARCHAR(32767),                                                                                                              
fstrCc VARCHAR(32767),                                                                                                              
fstrBcc VARCHAR(32767),                                                                                                             
fstrSubject VARCHAR(32767),                                                                                                         
fstrBody VARCHAR(32767),                                                                                                       
fintHTMLFormat SMALLINT,                                                                                                            
fintPriority SMALLINT,                                                                                                              
fstrMessageId VARCHAR(510),                                                                                                         
fstrCredentialUserName VARCHAR(510),                                                                                                
fstrCredentialUserPassword VARCHAR(510),                                                                                            
fblnUseDefaultCredentials SMALLINT,                                                                                                 
fstrEmailServer VARCHAR(510),                                                                                                       
flngEmailServerPort INT,                                                                                                            
fdtmQueued TIMESTAMP,                                                                                                               
fstrQueuedBy VARCHAR(20),                                                                                                           
fdtmSent TIMESTAMP,                                                                                                                 
fdtmError TIMESTAMP,                                                                                                                
fstrError VARCHAR(32767),                                                                                                           
fdtmHoldTill TIMESTAMP,                                                                                                             
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
fstrEnvironment VARCHAR(6),                                                                                                         
fstrFromDisplay VARCHAR(200),                                                                                                       
fstrSecureSocketOption VARCHAR(100),                                                                                                
fblnAttachments SMALLINT,                                                                                                           
fstrSlice VARCHAR(60),                                                                                                              
insert_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;    