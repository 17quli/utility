--use rft_refined;
--use dev_refined;
--use test_refined;
use prod_refined;



Drop table
	if exists individual_dim;

CREATE TABLE
	individual_dim ( dip_party_sk bigint,
	dip_party_id VARCHAR(30),
	common_dip_party_id VARCHAR(30),
	record_effective_timestamp TIMESTAMP,
	record_expiry_timestamp TIMESTAMP,
	party_origin VARCHAR(10),
	customer_key int,
	ird_number VARCHAR(10),
	customer_no VARCHAR(10),
	record_active_flag CHAR(1),
	legal_name VARCHAR(255),
	trading_name VARCHAR(255),
	party_start_date TIMESTAMP,
	party_ceased_date TIMESTAMP,
	party_ceased_flag CHAR(1),
	insolvency_reason VARCHAR(30),
	insolvency_code VARCHAR(10),
	insolvency_flag CHAR(1),
	party_type VARCHAR(255),
	party_type_code VARCHAR(10),
	party_subtype VARCHAR(255),
	party_subtype_code VARCHAR(10),
	party_class VARCHAR(30),
	party_class_code VARCHAR(10),
	party_segment VARCHAR(255),
	party_segment_code VARCHAR(10),
	BIC_code VARCHAR(30),
	BIC_desc VARCHAR(255),
	ANZSIC_level4_code VARCHAR(10),
	ANZSIC_level4_desc VARCHAR(255),
	ANZSIC_level3_code VARCHAR(10),
	ANZSIC_level3_desc VARCHAR(255),
	ANZSIC_level2_code VARCHAR(10),
	ANZSIC_level2_desc VARCHAR(255),
	ANZSIC_level1_code VARCHAR(10),
	ANZSIC_level1_desc VARCHAR(255),
	security_level VARCHAR(255),
	security_level_code VARCHAR(10),
	district_office VARCHAR(30),
	nz_firearms_licence_id VARCHAR(30),
	os_taxpayer_id VARCHAR(30),
	os_taxpayer_id_issuer VARCHAR(30),
	acc_id VARCHAR(30),
	mbie_client_id VARCHAR(30),
	credit_reported_flag CHAR(1),
	comm_compliance_watch_flag CHAR(1),
	suspected_bank_fraud_flag CHAR(1),
	suspected_fraud_flag CHAR(1),
	security_incident_rptd_flag CHAR(1),
	safety_risk_level VARCHAR(30),
	pref_title VARCHAR(10),
	pref_given_name VARCHAR(50),
	pref_other_given_name VARCHAR(50),
	pref_family_name VARCHAR(50),
	date_of_birth TIMESTAMP,
	date_of_death TIMESTAMP,
	birth_cert_id VARCHAR(30),
	birth_cert_issuer VARCHAR(30),
	nz_passport_id VARCHAR(30),
	os_passport_id VARCHAR(30),
	os_passport_issuer VARCHAR(30),
	nz_cert_identity_dia VARCHAR(30),
	nz_cert_identity_mbie VARCHAR(30),
	nz_refugee_id_dia VARCHAR(30),
	nz_refugee_id_mbie VARCHAR(30),
	nz_emergency_travel_id VARCHAR(30),
	driver_license_id VARCHAR(30),
	driver_license_issuer VARCHAR(30),
	intl_driver_permit_id VARCHAR(30),
	nz_hospitality_18over_id VARCHAR(30),
	nz_student_id VARCHAR(30),
	nz_student_issuer VARCHAR(50),
	nz_social_welfare_id VARCHAR(30),
	us_social_security_no VARCHAR(30),
	foreign_employment_id VARCHAR(30),
	ncp_id VARCHAR(30),
	ministry_of_children_id VARCHAR(30),
	emigrated_flag CHAR(1),
	border_alert_flag CHAR(1),
	in_prison_flag CHAR(1),
	undischarged_bankrupt_flag CHAR(1),
	insert_object_run_key INT,
	update_object_run_key INT) Stored as Parquet;

Drop table
	if exists organisation_dim;

CREATE TABLE
	organisation_dim ( dip_party_sk bigint,
	dip_party_id VARCHAR(30),
	common_dip_party_id VARCHAR(30),
	record_effective_timestamp TIMESTAMP,
	record_expiry_timestamp TIMESTAMP,
	party_origin VARCHAR(10),
	customer_key int,
	ird_number VARCHAR(10),
	customer_no VARCHAR(10),
	record_active_flag CHAR(1),
	legal_name VARCHAR(255),
	trading_name VARCHAR(255),
	party_start_date TIMESTAMP,
	party_ceased_date TIMESTAMP,
	party_ceased_flag CHAR(1),
	insolvency_reason VARCHAR(30),
	insolvency_code VARCHAR(10),
	insolvency_flag CHAR(1),
	party_type VARCHAR(255),
	party_type_code VARCHAR(10),
	party_subtype VARCHAR(255),
	party_subtype_code VARCHAR(10),
	party_class VARCHAR(30),
	party_class_code VARCHAR(10),
	party_segment VARCHAR(255),
	party_segment_code VARCHAR(10),
	BIC_code VARCHAR(30),
	BIC_desc VARCHAR(255),
	ANZSIC_level4_code VARCHAR(10),
	ANZSIC_level4_desc VARCHAR(255),
	ANZSIC_level3_code VARCHAR(10),
	ANZSIC_level3_desc VARCHAR(255),
	ANZSIC_level2_code VARCHAR(10),
	ANZSIC_level2_desc VARCHAR(255),
	ANZSIC_level1_code VARCHAR(10),
	ANZSIC_level1_desc VARCHAR(255),
	security_level VARCHAR(255),
	security_level_code VARCHAR(10),
	district_office VARCHAR(30),
	os_taxpayer_id VARCHAR(30),
	os_taxpayer_id_issuer VARCHAR(30),
	credit_reported_flag CHAR(1),
	comm_compliance_watch_flag CHAR(1),
	suspected_bank_fraud_flag CHAR(1),
	suspected_fraud_flag CHAR(1),
	security_incident_rptd_flag CHAR(1),
	safety_risk_level VARCHAR(30),
	org_incorp_date TIMESTAMP,
	org_cease_date TIMESTAMP,
	struck_off_flag CHAR(1),
	amalgamated_flag CHAR(1),
	amalgamating_flag CHAR(1),
	nz_cert_incorp_id VARCHAR(30),
	os_cert_incorp_id VARCHAR(30),
	os_cert_incorp_issuer VARCHAR(30),
	nzbn VARCHAR(30),
	nz_society_actuaries_id VARCHAR(30),
	financial_institution_giin VARCHAR(30),
	sponsoring_entity_giin VARCHAR(30),
	nil_company_flag CHAR(1),
	charity_org_flag CHAR(1),
	insert_object_run_key INT,
	update_object_run_key INT) Stored as Parquet;

Drop table
	if exists party_dim;

CREATE TABLE
	party_dim ( dip_party_sk bigint,
	dip_party_id VARCHAR(30),
	common_dip_party_id VARCHAR(30),
	record_effective_timestamp TIMESTAMP,
	record_expiry_timestamp TIMESTAMP,
	party_origin VARCHAR(10),
	customer_key int,
	ird_number VARCHAR(10),
	customer_no VARCHAR(10),
	record_active_flag CHAR(1),
	legal_name VARCHAR(255),
	trading_name VARCHAR(255),
	party_start_date TIMESTAMP,
	party_ceased_date TIMESTAMP,
	party_ceased_flag CHAR(1),
	insolvency_reason VARCHAR(30),
	insolvency_code VARCHAR(10),
	insolvency_flag CHAR(1),
	party_type VARCHAR(255),
	party_type_code VARCHAR(10),
	party_subtype VARCHAR(255),
	party_subtype_code VARCHAR(10),
	party_class VARCHAR(30),
	party_class_code VARCHAR(10),
	party_segment VARCHAR(255),
	party_segment_code VARCHAR(10),
	BIC_code VARCHAR(30),
	BIC_desc VARCHAR(255),
	ANZSIC_level4_code VARCHAR(10),
	ANZSIC_level4_desc VARCHAR(255),
	ANZSIC_level3_code VARCHAR(10),
	ANZSIC_level3_desc VARCHAR(255),
	ANZSIC_level2_code VARCHAR(10),
	ANZSIC_level2_desc VARCHAR(255),
	ANZSIC_level1_code VARCHAR(10),
	ANZSIC_level1_desc VARCHAR(255),
	security_level VARCHAR(255),
	security_level_code VARCHAR(10),
	district_office VARCHAR(30),
	os_taxpayer_id VARCHAR(30),
	os_taxpayer_id_issuer VARCHAR(30),
	credit_reported_flag CHAR(1),
	comm_compliance_watch_flag CHAR(1),
	suspected_bank_fraud_flag CHAR(1),
	suspected_fraud_flag CHAR(1),
	security_incident_rptd_flag CHAR(1),
	safety_risk_level VARCHAR(30),
	insert_object_run_key INT,
	update_object_run_key INT ) Stored as Parquet;

--ETL Tables 
drop table
	if exists rfn_ps_organisation_d;

CREATE TABLE
	rfn_ps_organisation_d like organisation_dim;

drop table
	if exists rfn_ps_individual_d;

CREATE TABLE
	rfn_ps_individual_d like individual_dim;

drop table
	if exists rfn_pe_organisation_d;

CREATE TABLE
	rfn_pe_organisation_d like organisation_dim;

drop table
	if exists rfn_pe_individual_d;

CREATE TABLE
	rfn_pe_individual_d like individual_dim;
 drop table
	if exists rfn_party_sk_map;

CREATE TABLE
	rfn_party_sk_map ( dip_party_sk BIGINT,
	dip_party_id VARCHAR(30),
	record_effective_timestamp TIMESTAMP,
	start_customer_key int,
	ird_no int ) STORED AS PARQUET;



drop table if exists local_start_bankruptcy;

create  table local_start_bankruptcy
stored as parquet
as select * from dev_refined.local_start_bankruptcy;

compute stats local_start_bankruptcy;

drop table if exists mp_source_code;

create  table mp_source_code 
stored as parquet
as select * from dev_refined.mp_source_code;

compute stats mp_source_code;

drop table if exists snz_bic_anzsic2006;

create  table snz_bic_anzsic2006
stored as parquet
as select * from dev_refined.snz_bic_anzsic2006;

compute stats snz_bic_anzsic2006;

drop table if exists local_organisation_default;

create  table local_organisation_default
stored as parquet
as 
select * from dev_refined.local_organisation_default;

compute stats local_organisation_default;

drop table if exists local_individual_default;

create  table local_individual_default
stored as parquet
as select * from dev_refined.local_individual_default;

compute stats local_individual_default;


--use rft_raw;
use test_raw;
--use prod_raw;

drop table if exists drd_code_family_ranks;

create  table drd_code_family_ranks
stored as parquet
as select * from dev_work.drd_code_family_ranks;

compute stats drd_code_family_ranks;

----------------------------------------------------------------------------------------
-- OK the DDL is converted up to here
-----------------------------------------------------------------------------------------
