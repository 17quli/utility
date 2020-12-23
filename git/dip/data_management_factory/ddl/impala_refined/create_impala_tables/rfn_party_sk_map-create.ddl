create table
	${var:target_db}.rfn_party_sk_map ( dip_party_sk bigint,
	dip_party_id varchar(30),
	record_effective_timestamp timestamp,
	start_customer_key int,
	ird_no int ) stored as parquet;