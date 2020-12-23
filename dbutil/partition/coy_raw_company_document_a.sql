select ir_source,count(1) from lab_fcp_raw.coy_raw_company_document group by ir_source order by 1 desc;
