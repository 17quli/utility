create view ${var:view_db}.dss_instalment_agmt_elements as
select 
z.ird_number                     ,
z.location_number                ,
z.case_type_code                 ,
z.case_number                    ,
z.case_key                       ,
z.return_period_date             ,
z.tax_type                       ,
z.arrangement_number             ,
z.element_sequence_number        ,
z.date_start                     ,
z.date_end                       ,
z.date_applied                   ,
z.date_ceased                    ,
z.`timestamp`                      ,
z.arrangement_element_status     ,
z.assessment_beg_woff_amt        ,
z.lpp_beg_woff_amt               ,
z.arrangement_beg_woff_amt       ,
z.qual_lpp_beg_woff_amt          ,
z.non_qual_lpp_beg_woff_amt      ,
z.avl_qual_lpp_woff_amt          ,
z.avl_non_qual_lpp_woff_amt      ,
z.last_summarised_seq_number     ,
z.oth_assessment_included_ind_cd ,
z.record_effective_timestamp     ,
z.record_expiry_timestamp        ,
z.record_active_flag             ,
z.record_deleted_flag            ,
z.insert_object_run_key          ,
z.update_object_run_key
from ${var:source_db}.dss_instalment_agmt_elements z
left outer join ${var:source_db}.dss_special_clients_all sc
on sc.ird_number= z.ird_number
where nvl(sc.special_classification, 'STD')='STD'
and nvl( sc.record_active_flag,'Y')='Y'
and nvl(sc.record_deleted_flag, 'N') = 'N'
;
