CREATE VIEW ${var:view_db}.app_tblnz_accpso                                                                                         
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fblnIR56,                                                                                                                         
z.fstrIR56Activity,                                                                                                                 
z.fstrIR56ActivityOther,                                                                                                            
z.fstrFilingOption,                                                                                                                 
z.fblnPayDayFiler,                                                                                                                  
z.fstrPayDay,                                                                                                                       
z.fstrPayPeriod,                                                                                                                    
z.fdtmPayDayFilerStart,                                                                                                             
z.fstrBatchToFIRST,                                                                                                                 
z.fblnCSE,                                                                                                                          
z.fblnSLE,                                                                                                                          
z.fblnKSE,                                                                                                                          
z.fblnKSR,                                                                                                                          
z.fblnSSC,                                                                                                                          
z.fstrEmployerGroup,                                                                                                                
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_accpso z; 