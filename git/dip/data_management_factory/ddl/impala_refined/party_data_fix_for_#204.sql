--use dev_refined;
--use test_refined;
use prod_refined;

create table mp_source_code_bk stored as parquet
as
select * 
from mp_source_code;

insert overwrite mp_source_code
select 
source_system,
source_code_name,
source_code_value,
source_description,
cast(ltrim(rtrim(dip_code_name)) as varchar(32)),
cast(ltrim(rtrim(dip_code_value)) as varchar(12)),
cast(ltrim(rtrim(dip_description)) as varchar(510)),
record_effective_timestamp,
record_expiry_timestamp,
source_tax_type,
source_cust_type
from mp_source_code;

compute stats mp_source_code;

create table rfn_pe_individual_bk stored as parquet
as
select * 
from rfn_pe_individual;

insert overwrite rfn_pe_individual partition(record_active_flag)
SELECT dip_party_sk,
 dip_party_id,
 common_dip_party_id,
 record_effective_timestamp,
 record_expiry_timestamp,
 party_origin,
 customer_key,
 ird_number,
 customer_no,
 legal_name,
 trading_name,
 party_start_date,
 party_ceased_date,
 party_ceased_flag,
 cast(LTRIM(rtrim( insolvency_reason)) as varchar(30)),
 cast( LTRIM(rtrim( insolvency_code)) as varchar(10)),
 insolvency_flag,
 party_type,
 party_type_code,
 party_subtype,
 party_subtype_code,
 party_class,
 party_class_code,
 party_segment,
 party_segment_code,
 bic_code,
 bic_desc,
 anzsic_level4_desc,
 anzsic_level3_desc,
 anzsic_level2_desc,
 anzsic_level1_desc,
 security_level,
 security_level_code,
 district_office,
 nz_firearms_licence_id,
 os_taxpayer_id,
 os_taxpayer_id_issuer,
 acc_id,
 mbie_client_id,
 credit_reported_flag,
 comm_compliance_watch_flag,
 suspected_bank_fraud_flag,
 suspected_fraud_flag,
 security_incident_rptd_flag,
 safety_risk_level,
 pref_title,
 pref_given_name,
 pref_other_given_name,
 pref_family_name,
 date_of_birth,
 date_of_death,
 birth_cert_id,
 birth_cert_issuer,
 nz_passport_id,
 os_passport_id,
 os_passport_issuer,
 nz_cert_identity_dia,
 nz_cert_identity_mbie,
 nz_refugee_id_dia,
 nz_refugee_id_mbie,
 nz_emergency_travel_id,
 driver_license_id,
 driver_license_issuer,
 intl_driver_permit_id,
 nz_hospitality_18over_id,
 nz_student_id,
 nz_student_issuer,
 nz_social_welfare_id,
 us_social_security_no,
 foreign_employment_id,
 ncp_id,
 ministry_of_children_id,
 emigrated_flag,
 border_alert_flag,
 in_prison_flag,
 undischarged_bankrupt_flag,
 insert_object_run_key,
 update_object_run_key,
 anzsic_level4_code,
 anzsic_level3_code,
 anzsic_level2_code,
 anzsic_level1_code,
 record_active_flag
FROM rfn_pe_individual_bk;

compute stats rfn_pe_individual;


create table rfn_pe_organisation_bk stored as parquet
as
select * 
from rfn_pe_organisation;


insert overwrite rfn_pe_organisation partition(record_active_flag)
SELECT dip_party_sk,
 dip_party_id,
 common_dip_party_id,
 record_effective_timestamp,
 record_expiry_timestamp,
 party_origin,
 customer_key,
 ird_number,
 customer_no,
 legal_name,
 trading_name,
 party_start_date,
 party_ceased_date,
 party_ceased_flag,
 cast(LTRIM(rtrim( insolvency_reason)) as varchar(30)),
 cast( LTRIM(rtrim( insolvency_code)) as varchar(10)), 
 insolvency_flag,
 party_type,
 party_type_code,
 party_subtype,
 party_subtype_code,
 party_class,
 party_class_code,
 party_segment,
 party_segment_code,
 bic_code,
 bic_desc,
 anzsic_level4_desc,
 anzsic_level3_desc,
 anzsic_level2_desc,
 anzsic_level1_desc,
 security_level,
 security_level_code,
 district_office,
 os_taxpayer_id,
 os_taxpayer_id_issuer,
 credit_reported_flag,
 comm_compliance_watch_flag,
 suspected_bank_fraud_flag,
 suspected_fraud_flag,
 security_incident_rptd_flag,
 safety_risk_level,
 org_incorp_date,
 org_cease_date,
 struck_off_flag,
 amalgamated_flag,
 amalgamating_flag,
 nz_cert_incorp_id,
 os_cert_incorp_id,
 os_cert_incorp_issuer,
 nzbn,
 nz_society_actuaries_id,
 financial_institution_giin,
 sponsoring_entity_giin,
 nil_company_flag,
 charity_org_flag,
 insert_object_run_key,
 update_object_run_key,
 anzsic_level4_code,
 anzsic_level3_code,
 anzsic_level2_code,
 anzsic_level1_code,
 record_active_flag
FROM rfn_pe_organisation_bk;

compute stats rfn_pe_organisation;

--use dev_refined;
--use test_refined;
use prod_refined;

select count(*) 
from mp_source_code 
where dip_description  like '% ';

select count(*) 
from rfn_pe_individual
where insolvency_reason  like '% ';

select count(*) 
from rfn_pe_organisation 
where insolvency_reason  like '% ';


drop table mp_source_code_bk;
drop table rfn_pe_individual_bk;
drop table rfn_pe_organisation_bk;



