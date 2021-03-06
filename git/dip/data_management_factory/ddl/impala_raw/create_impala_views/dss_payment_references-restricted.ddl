create view ${var:view_db}.dss_payment_references                                                 
as select                                                                                                                           
z.ird_number,                                                                                                                       
z.location_number,                                                                                                                  
z.ft_sequence_number,                                                                                                               
z.tax_type,                                                                                                                         
z.return_period_date,                                                                                                               
z.bank_branch_code,                                                                                                                 
z.bank_account_number,                                                                                                              
z.bank_account_suffix_code,                                                                                                         
z.cheque_serial_number,                                                                                                             
z.sequence_number,                                                                                                                  
z.payment_reference_suffix,                                                                                                         
z.payment_amount,                                                                                                                   
z.ft_amount,                                                                                                                        
z.date_banked,                                                                                                                      
z.effective_date,                                                                                                                   
z.payment_method_code,                                                                                                              
z.payment_status_code,                                                                                                              
z.existing_ind,                                                                                                                     
z.statement_seq_number,                                                                                                             
z.district_office,                                                                                                                  
z.date_created,                                                                                                                     
z.date_posted,                                                                                                                      
z.ir_bank_statement_reference,                                                                                                      
z.ir_bank_statement_identifier,                                                                                                     
z.ird_bank_statement_code,                                                                                                          
z.`timestamp`,                                                                                                                      
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 from ${var:source_db}.dss_payment_references z
left outer join  ${var:source_db}.dss_special_clients_all sc
on cast(z.ird_number as int) = cast(sc.ird_number as int) 
where nvl(sc.special_classification, 'STD')='STD'
and nvl( sc.record_active_flag,'Y')='Y'
and nvl(sc.record_deleted_flag, 'N') = 'N';

