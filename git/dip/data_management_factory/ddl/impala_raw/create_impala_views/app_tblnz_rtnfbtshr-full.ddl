CREATE VIEW ${var:view_db}.app_tblnz_rtnfbtshr                                                                                      
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fcurTaxableBenefits,                                                                                                              
z.fcurFBTTaxRate,                                                                                                                   
z.fblnAlternateCalc,                                                                                                                
z.fcurFringeTaxCalculation,                                                                                                         
z.fcurExemptFringeBenefits,                                                                                                         
z.fblnGSTAmended,                                                                                                                   
z.fcurGSTPayable,                                                                                                                   
z.fcurTotalAmount,                                                                                                                  
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_rtnfbtshr z;