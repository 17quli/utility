alter table app_tbltransstage  recover partitions; compute stats app_tbltransstage;
alter table dss_client_inc_indicators  recover partitions; compute stats dss_client_inc_indicators;
alter table dss_contract_account_docs  recover partitions; compute stats dss_contract_account_docs;
alter table dss_returns  recover partitions; compute stats dss_returns;
alter table dss_schedule_line_details  recover partitions; compute stats dss_schedule_line_details;
alter table dss_transactions  recover partitions; compute stats dss_transactions;
