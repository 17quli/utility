create view ${var:view_db}.dss_instalment_src_plans_sum as
select 
z.ird_number                     ,
z.location_number                ,
z.case_type_code                 ,
z.case_number                    ,
z.case_key                       ,
z.date_applied                   ,
z.date_ceased                    ,
z.date_created                   ,
z.date_start                     ,
z.actual_arrangement_payment_amt ,
z.total_amount                   ,
z.expected_payment_amount        ,
z.date_expected_payment_due      ,
z.`timestamp`                      ,
z.arrangement_number             ,
z.arrangement_default_count      ,
z.curr_mth_payment               ,
z.curr_mth                       ,
z.next_payment_mth               ,
z.last_review_date               ,
z.woff_ent_flag                  ,
z.woff_review_period_payments    ,
z.total_amt_against_source_plans ,
z.total_amt_prior_to_arrangement ,
z.record_effective_timestamp     ,
z.record_expiry_timestamp        ,
z.record_active_flag             ,
z.record_deleted_flag            ,
z.insert_object_run_key          ,
z.update_object_run_key          
from ${var:source_db}.dss_instalment_src_plans_sum z
left outer join ${var:source_db}.dss_special_clients_all sc
on sc.ird_number= z.ird_number
where nvl(sc.special_classification, 'STD')='STD'
and nvl( sc.record_active_flag,'Y')='Y'
and nvl(sc.record_deleted_flag, 'N') = 'N'
;
