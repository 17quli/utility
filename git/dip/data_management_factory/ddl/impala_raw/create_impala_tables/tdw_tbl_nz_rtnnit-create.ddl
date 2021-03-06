CREATE TABLE ${var:target_db}.tdw_tbl_nz_rtnnit (                                                   
FLNGDOCKEY BIGINT,                                                                                                                  
FCURTAXDEDUCTED DECIMAL(24,4),                                                                                                      
FCURGROSSINCOME DECIMAL(24,4),                                                                                                      
FCURRWT DECIMAL(24,4),                                                                                                              
FCURGROSSINTEREST DECIMAL(24,4),                                                                                                    
FCURDIVIDENDIMPUTATION DECIMAL(24,4),                                                                                               
FCURDIVIDENDRWT DECIMAL(24,4),                                                                                                      
FCURDIVIDENDGROSS DECIMAL(24,4),                                                                                                    
FCURMAORICREDITS DECIMAL(24,4),                                                                                                     
FCURMAORIDISTRIBUTIONS DECIMAL(24,4),                                                                                               
FCURTRUSTCREDITS DECIMAL(24,4),                                                                                                     
FCURTRUSTINCOME DECIMAL(24,4),                                                                                                      
FCURTOTALCREDITS DECIMAL(24,4),                                                                                                     
FCUROVERSEASTAX DECIMAL(24,4),                                                                                                      
FCUROVERSEASINCOME DECIMAL(24,4),                                                                                                   
FCURBUSINESSACTIVITIES DECIMAL(24,4),                                                                                               
FCURPREMIUMPAID DECIMAL(24,4),                                                                                                      
FCURPREMIUMPAIDSWITZERLAND DECIMAL(24,4),                                                                                           
FCURTOTALPREMIUM DECIMAL(24,4),                                                                                                     
FCUROTHERINCOME DECIMAL(24,4),                                                                                                      
FCURRLWT DECIMAL(24,4),                                                                                                             
FCURTOTALINCOMEPREDONATIONS DECIMAL(24,4),                                                                                          
FCURDONATIONSMADE DECIMAL(24,4),                                                                                                    
FCURTOTALINCOME DECIMAL(24,4),                                                                                                      
FCURNETLOSSBROUGHTFORWARD DECIMAL(24,4),                                                                                            
FCURNETLOSSCLAIMED DECIMAL(24,4),                                                                                                   
FCURTOTALINCOMEAFTERNETLOSS DECIMAL(24,4),                                                                                          
FCURNETLOSSTOCOMPANIES DECIMAL(24,4),                                                                                               
FCURSUBVENTIONSTOCOMPANIES DECIMAL(24,4),                                                                                           
FCURTAXABLEINCOME DECIMAL(24,4),                                                                                                    
FCURTOTALTAXPAYABLE DECIMAL(24,4),                                                                                                  
FCURTAXAFTEROVERSEAS DECIMAL(24,4),                                                                                                 
FCURFOREIGNINVESTORTAXCREDIT DECIMAL(24,4),                                                                                         
FCURTAXAFTERFOREIGNINVESTOR DECIMAL(24,4),                                                                                          
FCURTAXAFTERIMPUTATION DECIMAL(24,4),                                                                                               
FCUREXCESSIMPUTATIONCREDITS DECIMAL(24,4),                                                                                          
FCURRESIDUALINCOMETAX DECIMAL(24,4),                                                                                                
FCURPROVISIONALTAXPAID DECIMAL(24,4),                                                                                               
FCURTAXAMOUNT DECIMAL(24,4),                                                                                                        
FBLNRADFILED INT,                                                                                                                   
FCURRADAMOUNT DECIMAL(24,4),                                                                                                        
FCURRADREFUND DECIMAL(24,4),                                                                                                        
FCURRADLOSS DECIMAL(24,4),                                                                                                          
FCURRADTAXADJUSTMENT DECIMAL(24,4),                                                                                                 
FCURRADREPAYMENTTAX DECIMAL(24,4),                                                                                                  
FCURTRANSFERPROVISIONAL DECIMAL(24,4),                                                                                              
FCURTRANSFERCUSTOMERAMOUNT DECIMAL(24,4),                                                                                           
FCURTOTALREFUND DECIMAL(24,4),                                                                                                      
FDTMPROVISIONALSTARTDATE TIMESTAMP,                                                                                                 
FSTRPROVISIONALOPTION VARCHAR(100),                                                                                                 
FCURPROVISIONALTAX DECIMAL(24,4),                                                                                                   
FBLNNONRESIDENTPAYMENTS INT,                                                                                                        
FBLNNONRESIDENTWITHHOLDING INT,                                                                                                     
FBLNCFC INT,                                                                                                                        
FCURSHARESREPURCHASED DECIMAL(24,4),                                                                                                
FBLNFOREIGNDIVIDENDS INT,                                                                                                           
FBLNNONRESIDENTCONTROLLED INT,                                                                                                      
FBLNNONRESIDENT INT,                                                                                                                
FCURLOWESTECONOMICINTERESTS DECIMAL(24,4),                                                                                          
FCURLOSSTOCARRYFORWARD DECIMAL(24,4),                                                                                               
FBLNLINEITEMSPROCESSED INT,                                                                                                         
FSTRWHO VARCHAR(20),                                                                                                                
EFFECTIVE_FROM TIMESTAMP,                                                                                                           
EFFECTIVE_TO TIMESTAMP,                                                                                                             
CURRENT_REC_FLAG VARCHAR(2),                                                                                                        
DOCSETKEY BIGINT,                                                                                                                   
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;                                