USE prod_raw;

DROP TABLE IF EXISTS mds_code_mapping;

CREATE TABLE mds_code_mapping
STORED AS PARQUET AS
SELECT *
FROM   dev_raw.mds_code_mapping;

COMPUTE STATS mds_code_mapping;

USE prod_refined;

DROP TABLE IF EXISTS mp_source_code;

CREATE VIEW mp_source_code AS
SELECT source_system,
       source_code_name,
       source_code_value,
       source_description,
       dip_code_name,
       dip_code_value,
       dip_description
FROM   prod_raw.mds_code_mapping;
