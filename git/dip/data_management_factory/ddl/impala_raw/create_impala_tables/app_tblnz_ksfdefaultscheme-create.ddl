CREATE TABLE ${var:target_db}.app_tblnz_ksfdefaultscheme (                                                                          

flngDefaultSchemeKey INT,
flngVer INT,                                         

flngVerLast INT,                         

fdtmStart TIMESTAMP,

fdtmEnd TIMESTAMP,                                                                                                                  

fstrInvestmentProduct VARCHAR(510),                                                                                                 

fstrNZPostIdentifier VARCHAR(6),
fblnActive SMALLINT,                                                                                                                
flngAccountKey INT,                                                                                                                 

fstrWho VARCHAR(20),                                                                                                                

fdtmWhen TIMESTAMP,                                                                                                                 

record_effective_timestamp TIMESTAMP,

record_expiry_timestamp TIMESTAMP,                                                                                                  

record_active_flag VARCHAR(1),                                                                                                      

record_deleted_flag VARCHAR(1),                                                                                                     

insert_object_run_key INT,                                                                                                          

update_object_run_key INT                                                                                                           
 
) STORED AS PARQUET;