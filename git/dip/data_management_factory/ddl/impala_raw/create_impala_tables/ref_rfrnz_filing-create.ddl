CREATE TABLE ${var:target_db}.ref_rfrnz_filing (
fstrFiling VARCHAR(12),                          
fblnPoliced SMALLINT,                           
fstrRegularFrequency VARCHAR(100),             
fintRecurringBillingPeriods SMALLINT,         
fblnFIRSTActive SMALLINT,                    
fstrHeritageCode VARCHAR(24),               
fblnIrregular SMALLINT,                    
fblnPayDay SMALLINT,                      
fblnElectronic SMALLINT,                 
fstrDocSetDoc VARCHAR(40),              
fblnIncomeOnly SMALLINT,               
fblnActive SMALLINT,                  
insert_object_run_key INT            
 ) STORED AS PARQUET;
