CREATE TABLE ${var:target_db}.tdw_tbl_nz_rtnrwts (
FLNGDOCKEY BIGINT,
FBLNAGENT INT,
FCURAMOUNTPAID DECIMAL(24,4),
FCURAMOUNTNOTRWT DECIMAL(24,4),
FCURAMOUNTSUBJECTRWT DECIMAL(24,4),
FCURDISTRIBUTIONSPAIDIRD DECIMAL(24,4),
FCURDISTRIBUTIONIRDMULTIPLY DECIMAL(24,4),
FCURDISTRIBUTIONSPAID DECIMAL(24,4),
FCURDISTRIBUTIONMULTIPLY DECIMAL(24,4),
FCURDIVIDENDSPAID DECIMAL(24,4),
FCURDIVIDENDMULTIPLY DECIMAL(24,4),
FCURRWTLIABILITY DECIMAL(24,4),
FCURMANUALRWTDIVIDENDS DECIMAL(24,4),
FCURTOTALRWTDIVIDENDS DECIMAL(24,4),
FCURTOTALALREADYDEDUCTED DECIMAL(24,4),
FCURIMPUTATIONATTACHED DECIMAL(24,4),
FCURFDPATTACHED DECIMAL(24,4),
FCURTOTALTAXCREDITS DECIMAL(24,4),
FCURRWTFINAL DECIMAL(24,4),
FSTRWHO VARCHAR(20),
EFFECTIVE_FROM TIMESTAMP,
EFFECTIVE_TO TIMESTAMP,
CURRENT_REC_FLAG VARCHAR(2),

record_effective_timestamp TIMESTAMP,

record_expiry_timestamp TIMESTAMP,

record_active_flag VARCHAR(1),

record_deleted_flag VARCHAR(1),

insert_object_run_key INT,

update_object_run_key INT

 ) STORED AS PARQUET;