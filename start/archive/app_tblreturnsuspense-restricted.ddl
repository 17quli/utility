CREATE VIEW ${var:view_db}.app_tblreturnsuspense                                                                                    
AS SELECT                                                                                                                           
z.`flngReturnSuspenseKey`,                                                                                                          
z.`flngVer`,                                                                                                                        
z.`flngVerLast`,                                                                                                                    
z.`fi64DocSetKey`,                                                                                                                  
z.`flngDocKey`,                                                                                                                     
z.`fstrDocType`,                                                                                                                    
z.`fintDocVer`,                                                                                                                     
z.`flngAccountKey`,                                                                                                                 
z.`flngSecondaryAccountKey`,                                                                                                        
z.`fdtmFilingPeriod`,                                                                                                               
z.`fstrAccountType`,                                                                                                                
z.`fdtmDataCapture`,                                                                                                                
z.`fdtmReceived`,                                                                                                                   
z.`fblnInError`,                                                                                                                    
z.`fstrFilingStatus`,                                                                                                               
z.`fstrId`,                                                                                                                         
z.`fstrIdType`,                                                                                                                     
z.`fstrNameControl`,                                                                                                                
z.`fstrSecondaryId`,                                                                                                                
z.`fstrSecondaryIdType`,                                                                                                            
z.`fstrSecondaryNameControl`,                                                                                                       
z.`fstrURI`,                                                                                                                        
z.`fstrURIType`,                                                                                                                    
z.`fstrMedia`,                                                                                                                      
z.`fstrReason`,                                                                                                                     
z.`fcurPayment`,                                                                                                                    
z.`fstrStatus`,                                                                                                                     
z.`flngBatchKey`,                                                                                                                   
z.`fintSequence`,                                                                                                                   
z.`fstrRtnBatchId`,                                                                                                                 
z.`fdtmComposed`,                                                                                                                   
z.`flngCrmKey`,                                                                                                                     
z.`flngFolderKey`,                                                                                                                  
z.`flngWorkKey`,                                                                                                                    
z.`fstrWorkType`,                                                                                                                   
z.`fblnOpen`,                                                                                                                       
z.`flngReturnKey`,                                                                                                                  
z.`fstrWho`,                                                                                                                        
z.`fdtmWhen`,                                                                                                                       
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblreturnsuspense z
 LEFT OUTER JOIN ${var:source_db}.app_tblaccount i1 on z.flngaccountkey=i1.flngaccountkey
 LEFT OUTER JOIN ${var:source_db}.app_tblcustomerlevel l1 on i1.flngcustomerkey=l1.flngcustomerkey
 LEFT OUTER JOIN ${var:source_db}.app_tblaccount i2 on z.flngsecondaryaccountkey=i2.flngaccountkey 
 LEFT OUTER JOIN ${var:source_db}.app_tblcustomerlevel l2 on i2.flngcustomerkey=l2.flngcustomerkey
 where nvl(l1.fstrcustomerlevel, 'STD') = 'STD' 
  and nvl(l1.record_active_flag, 'Y') = 'Y'
  and nvl(l1.record_deleted_flag, 'N') = 'N'
  and nvl(i1.record_active_flag, 'Y') = 'Y' 
  and nvl(i1.record_deleted_flag, 'N') = 'N'
  and nvl(l2.fstrcustomerlevel, 'STD') = 'STD' 
  and nvl(l2.record_active_flag, 'Y') = 'Y'
  and nvl(l2.record_deleted_flag, 'N') = 'N'
  and nvl(i2.record_active_flag, 'Y') = 'Y' 
  and nvl(i2.record_deleted_flag, 'N') = 'N'  
 ;