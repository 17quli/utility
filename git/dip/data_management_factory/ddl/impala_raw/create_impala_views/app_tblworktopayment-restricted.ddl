CREATE VIEW ${var:view_db}.app_tblworktopayment                                                                                     
AS SELECT                                                                                                                           
z.FLNGPAYMENTKEY,                                                                                                                   
z.FLNGWORKKEY,                                                                                                                      
z.FBLNOPEN,                                                                                                                         
z.FSTRDATA,                                                                                                                         
z.FLNGBATCHKEY,                                                                                                                     
z.FSTRBATCHID,                                                                                                                      
z.FINTSEQUENCE,                                                                                                                     
z.FDTMCOMPOSED,                                                                                                                     
z.FCURAMOUNT,                                                                                                                       
z.FINTITEMS,                                                                                                                        
z.FSTRACCOUNTTYPE,                                                                                                                  
z.FSTRSOURCE,                                                                                                                       
z.FSTRWHO,                                                                                                                          
z.FDTMWHEN,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblworktopayment z; 