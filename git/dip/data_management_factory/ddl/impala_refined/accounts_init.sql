USE prod_refined;

DROP TABLE IF EXISTS account_dim;
DROP TABLE IF EXISTS account_gst_dim;
DROP TABLE IF EXISTS account_inc_dim;
DROP TABLE IF EXISTS account_pay_dim;
DROP TABLE IF EXISTS account_pie_dim;
DROP TABLE IF EXISTS party_account_rel;
DROP TABLE IF EXISTS party_account_rel_type;

DROP TABLE IF EXISTS account_dim_d;
DROP TABLE IF EXISTS account_gst_dim_d;
DROP TABLE IF EXISTS account_inc_dim_d;
DROP TABLE IF EXISTS account_pay_dim_d;
DROP TABLE IF EXISTS account_pie_dim_d;
DROP TABLE IF EXISTS party_account_rel_d;

DROP TABLE IF EXISTS rfn_as_account;
DROP TABLE IF EXISTS rfn_as_account_gst;
DROP TABLE IF EXISTS rfn_as_account_inc;
DROP TABLE IF EXISTS rfn_as_account_pay;
DROP TABLE IF EXISTS rfn_as_account_pie;
DROP TABLE IF EXISTS rfn_as_party_account;
DROP TABLE IF EXISTS rfn_as_account_d;
DROP TABLE IF EXISTS rfn_as_account_gst_d;
DROP TABLE IF EXISTS rfn_as_account_inc_d;
DROP TABLE IF EXISTS rfn_as_account_pay_d;
DROP TABLE IF EXISTS rfn_as_account_pie_d;
DROP TABLE IF EXISTS rfn_as_party_account_d;
DROP TABLE IF EXISTS rfn_as_account_c;
DROP TABLE IF EXISTS rfn_as_account_gst_c;
DROP TABLE IF EXISTS rfn_as_account_inc_c;
DROP TABLE IF EXISTS rfn_as_account_pay_c;
DROP TABLE IF EXISTS rfn_as_account_pie_c;
DROP TABLE IF EXISTS rfn_as_party_account_c;

DROP TABLE IF EXISTS rfn_ae_account;
DROP TABLE IF EXISTS rfn_ae_account_gst;
DROP TABLE IF EXISTS rfn_ae_account_inc;
DROP TABLE IF EXISTS rfn_ae_account_pay;
DROP TABLE IF EXISTS rfn_ae_account_pie;
DROP TABLE IF EXISTS rfn_ae_party_account;
DROP TABLE IF EXISTS rfn_ae_account_d;
DROP TABLE IF EXISTS rfn_ae_account_gst_d;
DROP TABLE IF EXISTS rfn_ae_account_inc_d;
DROP TABLE IF EXISTS rfn_ae_account_pay_d;
DROP TABLE IF EXISTS rfn_ae_account_pie_d;
DROP TABLE IF EXISTS rfn_ae_party_account_d;
DROP TABLE IF EXISTS rfn_ae_account_c;
DROP TABLE IF EXISTS rfn_ae_account_gst_c;
DROP TABLE IF EXISTS rfn_ae_account_inc_c;
DROP TABLE IF EXISTS rfn_ae_account_pay_c;
DROP TABLE IF EXISTS rfn_ae_account_pie_c;
DROP TABLE IF EXISTS rfn_ae_party_account_c;

/****
*  Main dimension tables
****/
CREATE TABLE account_dim (
    dip_account_sk                 BIGINT,
    dip_account_id                 VARCHAR(30),
    record_effective_timestamp     TIMESTAMP,
    record_expiry_timestamp        TIMESTAMP,
    record_active_flag             CHAR(1),
    account_origin                 VARCHAR(10), 
    account_key                    INT,
    account_ird_number             VARCHAR(10),
    start_account_id               VARCHAR(30),
    start_profile_number           SMALLINT,
    start_parent_profile_type      VARCHAR(50),
    start_parent_profile_number    SMALLINT,
    heritage_location_number       SMALLINT,
    legal_name                     VARCHAR(255),
    trading_name                   VARCHAR(255),
    account_type                   VARCHAR(255),
    account_type_code              VARCHAR(30),
    account_start_date             TIMESTAMP,
    account_ceased_date            TIMESTAMP,
    account_status                 VARCHAR(30),
    account_status_code            VARCHAR(10),
    security_level                 VARCHAR(255), 
    security_level_code            VARCHAR(10), 
    cessation_reason               VARCHAR(30),
    cessation_reason_code          VARCHAR(10),
    filing_frequency               VARCHAR(30),
    filing_frequency_code          VARCHAR(30),
    exemption_reason               VARCHAR(30),
    exemption_reason_code          VARCHAR(30),
    exempted_flag                  CHAR(1),
    green_listed_flag              CHAR(1),
    red_listed_flag                CHAR(1),
    account_halt_flag              CHAR(1),
    audit_case_active_desc         VARCHAR(30),
    audit_case_active_code         VARCHAR(30),
    audit_case_active_flag         CHAR(1),
    stop_mail_desc                 VARCHAR(30),
    stop_mail_code                 VARCHAR(10),
    stop_mail_flag                 CHAR(1),
    insert_object_run_key          INT,
    update_object_run_key          INT
) STORED AS PARQUET;

CREATE TABLE account_gst_dim (
    dip_account_gst_sk                       BIGINT,
    dip_account_id                           VARCHAR(30),
    record_effective_timestamp               TIMESTAMP,
    record_expiry_timestamp                  TIMESTAMP,
    record_active_flag                       CHAR(1),
    account_origin                           VARCHAR(10), 
    account_key                              INT,
    account_ird_number                       VARCHAR(10),
    start_account_id                         VARCHAR(30),
    start_profile_number                     SMALLINT,
    start_parent_profile_type                VARCHAR(50),
    start_parent_profile_number              SMALLINT,
    heritage_location_number                 SMALLINT,
    legal_name                               VARCHAR(255),
    trading_name                             VARCHAR(255),
    account_type                             VARCHAR(255),
    account_type_code                        VARCHAR(30),
    account_start_date                       TIMESTAMP,
    account_ceased_date                      TIMESTAMP,
    account_status                           VARCHAR(30),
    account_status_code                      VARCHAR(10),
    security_level                           VARCHAR(255), 
    security_level_code                      VARCHAR(10), 
    cessation_reason                         VARCHAR(30),
    cessation_reason_code                    VARCHAR(10),
    filing_frequency                         VARCHAR(30),
    filing_frequency_code                    VARCHAR(30),
    exemption_reason                         VARCHAR(30),
    exemption_reason_code                    VARCHAR(30),
    exempted_flag                            CHAR(1),
    green_listed_flag                        CHAR(1),
    red_listed_flag                          CHAR(1),
    account_halt_flag                        CHAR(1),
    audit_case_active_desc                   VARCHAR(30),
    audit_case_active_code                   VARCHAR(30),
    audit_case_active_flag                   CHAR(1),
    stop_mail_desc                           VARCHAR(30),
    stop_mail_code                           VARCHAR(10),
    stop_mail_flag                           CHAR(1),
    accounting_basis                         VARCHAR(10),
    registration_circumstance                VARCHAR(10),
    included_in_prices_flag                  CHAR(1),
    exempt_supplies_flag                     CHAR(1),
    exporter_flag                            CHAR(1),
    importer_flag                            CHAR(1),
    unpoliced_filer_flag                     CHAR(1),
    self_invoicer_flag                       CHAR(1),
    hospice_filer_flag                       CHAR(1),
    hospice_type                             VARCHAR(10),
    hospice_type_desc                        VARCHAR(30),
    gst_on_remote_srvcs_flag                 CHAR(1),
    gst_on_remote_srvcs_type                 VARCHAR(30),
    gst_on_remote_srvcs_code                 VARCHAR(30),
    gst_zero_rated_fin_srv_flag              CHAR(1),
    gst_non_resident_claimant_flag           CHAR(1),
    taxable_activity_flag                    CHAR(1),
    insert_object_run_key                    INT,
    update_object_run_key                    INT
) STORED AS PARQUET;

CREATE TABLE account_inc_dim (
    dip_account_inc_sk             BIGINT,
    dip_account_id                 VARCHAR(30),
    record_effective_timestamp     TIMESTAMP,
    record_expiry_timestamp        TIMESTAMP,
    record_active_flag             CHAR(1),
    account_origin                 VARCHAR(10), 
    account_key                    INT,
    account_ird_number             VARCHAR(10),
    start_account_id               VARCHAR(30),
    start_profile_number           SMALLINT,
    start_parent_profile_type      VARCHAR(50),
    start_parent_profile_number    SMALLINT,
    heritage_location_number       SMALLINT,
    legal_name                     VARCHAR(255),
    trading_name                   VARCHAR(255),
    account_type                   VARCHAR(255),
    account_type_code              VARCHAR(30),
    account_start_date             TIMESTAMP,
    account_ceased_date            TIMESTAMP,
    account_status                 VARCHAR(30),
    account_status_code            VARCHAR(10),
    security_level                 VARCHAR(255), 
    security_level_code            VARCHAR(10), 
    cessation_reason               VARCHAR(30),
    cessation_reason_code          VARCHAR(10),
    filing_frequency               VARCHAR(30),
    filing_frequency_code          VARCHAR(30),
    exemption_reason               VARCHAR(30),
    exemption_reason_code          VARCHAR(30),
    exempted_flag                  CHAR(1),
    green_listed_flag              CHAR(1),
    red_listed_flag                CHAR(1),
    account_halt_flag              CHAR(1),
    audit_case_active_desc         VARCHAR(30),
    audit_case_active_code         VARCHAR(30),
    audit_case_active_flag         CHAR(1),
    stop_mail_desc                 VARCHAR(30),
    stop_mail_code                 VARCHAR(10),
    stop_mail_flag                 CHAR(1),
    balance_date                   VARCHAR(30),
    zero_tailored_rate_flag        CHAR(1),
    trans_tasman_flag              CHAR(1),
    agent_non_res_insurer_flag     CHAR(1),
    insert_object_run_key          INT,
    update_object_run_key          INT
) STORED AS PARQUET;

CREATE TABLE account_pay_dim (
    dip_account_pay_sk             BIGINT,
    dip_account_id                 VARCHAR(30),
    record_effective_timestamp     TIMESTAMP,
    record_expiry_timestamp        TIMESTAMP,
    record_active_flag             CHAR(1),
    account_origin                 VARCHAR(10),
    account_key                    INT,
    account_ird_number             VARCHAR(10),
    start_account_id               VARCHAR(30),
    start_profile_number           SMALLINT,
    start_parent_profile_type      VARCHAR(50),
    start_parent_profile_number    SMALLINT,
    heritage_location_number       SMALLINT,
    legal_name                     VARCHAR(255),
    trading_name                   VARCHAR(255),
    account_type                   VARCHAR(255),
    account_type_code              VARCHAR(30),
    account_start_date             TIMESTAMP,
    account_ceased_date            TIMESTAMP,
    account_status                 VARCHAR(30),
    account_status_code            VARCHAR(10),
    security_level                 VARCHAR(255), 
    security_level_code            VARCHAR(10), 
    cessation_reason               VARCHAR(30),
    cessation_reason_code          VARCHAR(10),
    filing_frequency               VARCHAR(30),
    filing_frequency_code          VARCHAR(30),
    exemption_reason               VARCHAR(30),
    exemption_reason_code          VARCHAR(30),
    exempted_flag                  CHAR(1),
    green_listed_flag              CHAR(1),
    red_listed_flag                CHAR(1),
    account_halt_flag              CHAR(1),
    audit_case_active_desc         VARCHAR(30),
    audit_case_active_code         VARCHAR(30),
    audit_case_active_flag         CHAR(1),
    stop_mail_desc                 VARCHAR(30),
    stop_mail_code                 VARCHAR(10),
    stop_mail_flag                 CHAR(1),
    ir56_flag                      CHAR(1),
    filing_option                  VARCHAR(30),
    filing_option_code             VARCHAR(10),
    payday_filer_flag              CHAR(1),
    payday_filer_start_date        TIMESTAMP,
    employer_child_support_flag    CHAR(1),
    employer_student_loan_flag     CHAR(1),
    kiwisaver_employee_dedn_flag   CHAR(1),
    kiwisaver_employer_cntrb_flag  CHAR(1),
    esct_flag                      CHAR(1),
    employer_group                 VARCHAR(255),
    employer_group_code            VARCHAR(10),
    payday_variation_flag          CHAR(1),
    insert_object_run_key          INT,
    update_object_run_key          INT
) STORED AS PARQUET;

CREATE TABLE account_pie_dim (
    dip_account_pie_sk             BIGINT,
    dip_account_id                 VARCHAR(30),
    record_effective_timestamp     TIMESTAMP,
    record_expiry_timestamp        TIMESTAMP,
    record_active_flag             CHAR(1),
    account_origin                 VARCHAR(10), 
    account_key                    INT,
    account_ird_number             VARCHAR(10),
    start_account_id               VARCHAR(30),
    start_profile_number           SMALLINT,
    start_parent_profile_type      VARCHAR(50),
    start_parent_profile_number    SMALLINT,
    heritage_location_number       SMALLINT,
    legal_name                     VARCHAR(255),
    trading_name                   VARCHAR(255),
    account_type                   VARCHAR(255),
    account_type_code              VARCHAR(30),
    account_start_date             TIMESTAMP,
    account_ceased_date            TIMESTAMP,
    account_status                 VARCHAR(30),
    account_status_code            VARCHAR(10),
    security_level                 VARCHAR(255), 
    security_level_code            VARCHAR(10), 
    cessation_reason               VARCHAR(30),
    cessation_reason_code          VARCHAR(10),
    filing_frequency               VARCHAR(30),
    filing_frequency_code          VARCHAR(30),
    exemption_reason               VARCHAR(30),
    exemption_reason_code          VARCHAR(30),
    exempted_flag                  CHAR(1),
    green_listed_flag              CHAR(1),
    red_listed_flag                CHAR(1),
    account_halt_flag              CHAR(1),
    audit_case_active_desc         VARCHAR(30),
    audit_case_active_code         VARCHAR(30),
    audit_case_active_flag         CHAR(1),
    stop_mail_desc                 VARCHAR(30),
    stop_mail_code                 VARCHAR(10),
    stop_mail_flag                 CHAR(1),
    pie_type                       VARCHAR(30),
    pie_type_code                  VARCHAR(30),
    filing_option                  VARCHAR(255),
    filing_option_code             VARCHAR(10),
    attribution_period             VARCHAR(50),
    fdr_calc_period                VARCHAR(50),
    insert_object_run_key          INT,
    update_object_run_key          INT
) STORED AS PARQUET;

CREATE TABLE party_account_rel (
    dip_party_id                  VARCHAR(30),
    dip_account_id                VARCHAR(30),
    record_effective_timestamp    TIMESTAMP,
    record_expiry_timestamp       TIMESTAMP,
    record_active_flag            CHAR(1),
    party_acct_rel_type_code      VARCHAR(50),   
    relationship_origin           VARCHAR(10),
    relationship_start_timestamp  TIMESTAMP,
    relationship_end_timestamp    TIMESTAMP,
    dip_confidence_level          VARCHAR(10),
    insert_object_run_key         INT,
    update_object_run_key         INT
) STORED AS PARQUET;

CREATE TABLE party_account_rel_type (
  relationship_type_code      VARCHAR(50),
  relationship_type_desc      VARCHAR(255)
) STORED AS PARQUET;
INSERT INTO party_account_rel_type VALUES (CAST('OWNED' AS VARCHAR(50)), CAST('Owner Of' AS VARCHAR(50)));
COMPUTE STATS party_account_rel_type;

/****
*  ELT tables used during build
****/
CREATE TABLE rfn_as_account         STORED AS PARQUET AS SELECT * FROM account_dim       WHERE  1 = 2;
CREATE TABLE rfn_as_account_gst     STORED AS PARQUET AS SELECT * FROM account_gst_dim   WHERE  1 = 2;
CREATE TABLE rfn_as_account_inc     STORED AS PARQUET AS SELECT * FROM account_inc_dim   WHERE  1 = 2;
CREATE TABLE rfn_as_account_pay     STORED AS PARQUET AS SELECT * FROM account_pay_dim   WHERE  1 = 2;
CREATE TABLE rfn_as_account_pie     STORED AS PARQUET AS SELECT * FROM account_pie_dim   WHERE  1 = 2;
CREATE TABLE rfn_as_account_d       STORED AS PARQUET AS SELECT * FROM account_dim       WHERE  1 = 2;
CREATE TABLE rfn_as_account_gst_d   STORED AS PARQUET AS SELECT * FROM account_gst_dim   WHERE  1 = 2;
CREATE TABLE rfn_as_account_inc_d   STORED AS PARQUET AS SELECT * FROM account_inc_dim   WHERE  1 = 2;
CREATE TABLE rfn_as_account_pay_d   STORED AS PARQUET AS SELECT * FROM account_pay_dim   WHERE  1 = 2;
CREATE TABLE rfn_as_account_pie_d   STORED AS PARQUET AS SELECT * FROM account_pie_dim   WHERE  1 = 2;
CREATE TABLE rfn_as_account_c       STORED AS PARQUET AS SELECT * FROM account_dim       WHERE  1 = 2;
CREATE TABLE rfn_as_account_gst_c   STORED AS PARQUET AS SELECT * FROM account_gst_dim   WHERE  1 = 2;
CREATE TABLE rfn_as_account_inc_c   STORED AS PARQUET AS SELECT * FROM account_inc_dim   WHERE  1 = 2;
CREATE TABLE rfn_as_account_pay_c   STORED AS PARQUET AS SELECT * FROM account_pay_dim   WHERE  1 = 2;
CREATE TABLE rfn_as_account_pie_c   STORED AS PARQUET AS SELECT * FROM account_pie_dim   WHERE  1 = 2;

CREATE TABLE rfn_ae_account         STORED AS PARQUET AS SELECT * FROM  account_dim       WHERE 1 = 2;
CREATE TABLE rfn_ae_account_gst     STORED AS PARQUET AS SELECT * FROM  account_gst_dim   WHERE 1 = 2;
CREATE TABLE rfn_ae_account_inc     STORED AS PARQUET AS SELECT * FROM  account_inc_dim   WHERE 1 = 2;
CREATE TABLE rfn_ae_account_pay     STORED AS PARQUET AS SELECT * FROM  account_pay_dim   WHERE 1 = 2;
CREATE TABLE rfn_ae_account_pie     STORED AS PARQUET AS SELECT * FROM  account_pie_dim   WHERE 1 = 2;
CREATE TABLE rfn_ae_account_d       STORED AS PARQUET AS SELECT * FROM  account_dim       WHERE 1 = 2;
CREATE TABLE rfn_ae_account_gst_d   STORED AS PARQUET AS SELECT * FROM  account_gst_dim   WHERE 1 = 2;
CREATE TABLE rfn_ae_account_inc_d   STORED AS PARQUET AS SELECT * FROM  account_inc_dim   WHERE 1 = 2;
CREATE TABLE rfn_ae_account_pay_d   STORED AS PARQUET AS SELECT * FROM  account_pay_dim   WHERE 1 = 2;
CREATE TABLE rfn_ae_account_pie_d   STORED AS PARQUET AS SELECT * FROM  account_pie_dim   WHERE 1 = 2;
CREATE TABLE rfn_ae_account_c       STORED AS PARQUET AS SELECT * FROM  account_dim       WHERE 1 = 2;
CREATE TABLE rfn_ae_account_gst_c   STORED AS PARQUET AS SELECT * FROM  account_gst_dim   WHERE 1 = 2;
CREATE TABLE rfn_ae_account_inc_c   STORED AS PARQUET AS SELECT * FROM  account_inc_dim   WHERE 1 = 2;
CREATE TABLE rfn_ae_account_pay_c   STORED AS PARQUET AS SELECT * FROM  account_pay_dim   WHERE 1 = 2;
CREATE TABLE rfn_ae_account_pie_c   STORED AS PARQUET AS SELECT * FROM  account_pie_dim   WHERE 1 = 2;

CREATE TABLE account_dim_d          STORED AS PARQUET AS SELECT * FROM account_dim        WHERE 1 = 2;
CREATE TABLE account_gst_dim_d      STORED AS PARQUET AS SELECT * FROM account_gst_dim    WHERE 1 = 2;
CREATE TABLE account_inc_dim_d      STORED AS PARQUET AS SELECT * FROM account_inc_dim    WHERE 1 = 2;
CREATE TABLE account_pay_dim_d      STORED AS PARQUET AS SELECT * FROM account_pay_dim    WHERE 1 = 2;
CREATE TABLE account_pie_dim_d      STORED AS PARQUET AS SELECT * FROM account_pie_dim    WHERE 1 = 2;
CREATE TABLE party_account_rel_d    STORED AS PARQUET AS SELECT * FROM party_account_rel  WHERE 1 = 2;

/****
*  Remove red and green listed flags from the final dimensions
*    - leave them in the underlying tables in case we put them back
****/
ALTER TABLE account_dim       DROP COLUMN red_listed_flag;
ALTER TABLE account_dim       DROP COLUMN green_listed_flag;
ALTER TABLE account_gst_dim   DROP COLUMN red_listed_flag;
ALTER TABLE account_gst_dim   DROP COLUMN green_listed_flag;
ALTER TABLE account_inc_dim   DROP COLUMN red_listed_flag;
ALTER TABLE account_inc_dim   DROP COLUMN green_listed_flag;
ALTER TABLE account_pay_dim   DROP COLUMN red_listed_flag;
ALTER TABLE account_pay_dim   DROP COLUMN green_listed_flag;
ALTER TABLE account_pie_dim   DROP COLUMN red_listed_flag;
ALTER TABLE account_pie_dim   DROP COLUMN green_listed_flag;

ALTER TABLE account_dim_d     DROP COLUMN red_listed_flag;
ALTER TABLE account_dim_d     DROP COLUMN green_listed_flag;
ALTER TABLE account_gst_dim_d DROP COLUMN red_listed_flag;
ALTER TABLE account_gst_dim_d DROP COLUMN green_listed_flag;
ALTER TABLE account_inc_dim_d DROP COLUMN red_listed_flag;
ALTER TABLE account_inc_dim_d DROP COLUMN green_listed_flag;
ALTER TABLE account_pay_dim_d DROP COLUMN red_listed_flag;
ALTER TABLE account_pay_dim_d DROP COLUMN green_listed_flag;
ALTER TABLE account_pie_dim_d DROP COLUMN red_listed_flag;
ALTER TABLE account_pie_dim_d DROP COLUMN green_listed_flag;

/****
*  These tables need to be dropped before the initial load
****/
DROP TABLE rfn_as_account;
DROP TABLE rfn_as_account_pay;
DROP TABLE rfn_as_account_pie;
DROP TABLE rfn_as_account_inc;
DROP TABLE rfn_as_account_gst;

DROP TABLE rfn_ae_account;
DROP TABLE rfn_ae_account_pay;
DROP TABLE rfn_ae_account_pie;
DROP TABLE rfn_ae_account_inc;
DROP TABLE rfn_ae_account_gst;

/****
*  Timeline & SK Map
****/
DROP TABLE IF EXISTS rfn_as_timeline;
DROP TABLE IF EXISTS rfn_ae_timeline;
DROP TABLE IF EXISTS rfn_account_sk_map;

CREATE TABLE rfn_account_sk_map (
  dip_account_sk              BIGINT,
  dip_account_id              VARCHAR(30),
  record_effective_timestamp  TIMESTAMP,
  start_account_key           INT,
  ird_no                      INT,
  edw_customer_type           VARCHAR(6),
  edw_tax_type                VARCHAR(6),
  edw_location_number         INT,
  edw_cut_off                 TIMESTAMP,
  source                      VARCHAR(6),
  min_acc_start_date          TIMESTAMP
) STORED AS PARQUET;

/**** 
*  Default dimensions
****/
DROP TABLE IF EXISTS local_account_default;
DROP TABLE IF EXISTS local_account_gst_default;
DROP TABLE IF EXISTS local_account_inc_default;
DROP TABLE IF EXISTS local_account_pay_default;
DROP TABLE IF EXISTS local_account_pie_default;

/**** 
*  Create empty tables from the _c tables rather than final account
*  dimension to make sure we have the red and green listed columns
****/
CREATE TABLE local_account_default     STORED AS PARQUET AS SELECT * FROM rfn_as_account_c     WHERE 1 = 2;
CREATE TABLE local_account_gst_default STORED AS PARQUET AS SELECT * FROM rfn_as_account_gst_c WHERE 1 = 2;
CREATE TABLE local_account_inc_default STORED AS PARQUET AS SELECT * FROM rfn_as_account_inc_c WHERE 1 = 2;
CREATE TABLE local_account_pay_default STORED AS PARQUET AS SELECT * FROM rfn_as_account_pay_c WHERE 1 = 2;
CREATE TABLE local_account_pie_default STORED AS PARQUET AS SELECT * FROM rfn_as_account_pie_c WHERE 1 = 2;

INSERT INTO local_account_default VALUES (
    -1, -- dip_account_sk  bigint
CAST('Unknown' AS VARCHAR(7)), -- dip_account_id varchar(30)
'1800-01-01', --   record_effective_timestamp timestamp
'9000-12-31', --  record_expiry_timestamp timestamp
CAST('Y' AS CHAR(1)),  -- record_active_flag   char(1)
CAST('Unknown' AS VARCHAR(7)), --  account_origin varchar(10)
-1, --  account_key varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  account_ird_number   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  start_account_id  varchar(30)
-1, --   start_profile_number varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   start_parent_profile_type  varchar(50)
-1, --   start_parent_profile_number   varchar(10)
-1, --   heritage_location_number   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   legal_name  varchar(255)
CAST('Unknown' AS VARCHAR(7)), --   trading_name   varchar(255)
CAST('Unknown' AS VARCHAR(7)), --   account_type   varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   account_type_code varchar(30)
NULL, --   account_start_date   timestamp
NULL, --   account_ceased_date  timestamp
CAST('Unknown' AS VARCHAR(7)), --   account_status varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   account_status_code  varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   security_level varchar(255)
CAST('Unknown' AS VARCHAR(7)), --   security_level_code  varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   cessation_reason  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   cessation_reason_code   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   filing_frequency  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   filing_frequency_code   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   exemption_reason  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   exemption_reason_code   varchar(30)
NULL, --   exempted_flag  char(1)
NULL, --   green_listed_flag char(1)
NULL, --   red_listed_flag   char(1)
NULL,  --   account_halt_flag char(1)
CAST('Unknown' AS VARCHAR(7)), --   audit_case_active_desc  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   audit_case_active_code  varchar(30)
NULL, --   audit_case_active_flag  char(1)
CAST('Unknown' AS VARCHAR(7)), --   stop_mail_desc varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   stop_mail_code varchar(10)
NULL, --   stop_mail_flag char(1)
NULL, --   insert_object_run_key   int
NULL);

INSERT INTO local_account_default VALUES (
    -2, -- dip_account_sk  bigint
CAST('N/A' AS VARCHAR(3)), -- dip_account_id varchar(30)
'1800-01-01', --   record_effective_timestamp timestamp
'9000-12-31', --  record_expiry_timestamp timestamp
CAST('Y' AS CHAR(1)),  -- record_active_flag   char(1)
CAST('N/A' AS VARCHAR(3)), --  account_origin varchar(10)
-1, --  account_key varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  account_ird_number   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  start_account_id  varchar(30)
-1, --   start_profile_number varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   start_parent_profile_type  varchar(50)
-1, --   start_parent_profile_number   varchar(10)
-1, --   heritage_location_number   varchar(10)
CAST('N/A' AS VARCHAR(3)), --   legal_name  varchar(255)
CAST('N/A' AS VARCHAR(3)), --   trading_name   varchar(255)
CAST('N/A' AS VARCHAR(3)), --   account_type   varchar(30)
CAST('N/A' AS VARCHAR(3)), --   account_type_code varchar(30)
NULL, --   account_start_date   timestamp
NULL, --   account_ceased_date  timestamp
CAST('N/A' AS VARCHAR(3)), --   account_status varchar(30)
CAST('N/A' AS VARCHAR(3)), --   account_status_code  varchar(10)
CAST('N/A' AS VARCHAR(3)), --   security_level varchar(255)
CAST('N/A' AS VARCHAR(3)), --   security_level_code  varchar(10)
CAST('N/A' AS VARCHAR(3)), --   cessation_reason  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   cessation_reason_code   varchar(10)
CAST('N/A' AS VARCHAR(3)), --   filing_frequency  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   filing_frequency_code   varchar(10)
CAST('N/A' AS VARCHAR(3)), --   exemption_reason  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   exemption_reason_code   varchar(30)
NULL, --   exempted_flag  char(1)
NULL, --   green_listed_flag char(1)
NULL, --   red_listed_flag   char(1)
NULL,  --   account_halt_flag char(1)
CAST('N/A' AS VARCHAR(3)), --   audit_case_active_desc  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   audit_case_active_code  varchar(30)
NULL, --   audit_case_active_flag  char(1)
CAST('N/A' AS VARCHAR(3)), --   stop_mail_desc varchar(30)
CAST('N/A' AS VARCHAR(3)), --   stop_mail_code varchar(10)
NULL, --   stop_mail_flag char(1)
NULL, --   insert_object_run_key   int
NULL);

INSERT INTO local_account_gst_default VALUES (
    -1, -- dip_account_sk  bigint
CAST('Unknown' AS VARCHAR(7)), -- dip_account_id varchar(30)
'1800-01-01', --   record_effective_timestamp timestamp
'9000-12-31', --  record_expiry_timestamp timestamp
CAST('Y' AS CHAR(1)),  -- record_active_flag   char(1)
CAST('Unknown' AS VARCHAR(7)), --  account_origin varchar(10)
-1, --  account_key varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  account_ird_number   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  start_account_id  varchar(30)
-1, --   start_profile_number varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   start_parent_profile_type  varchar(50)
-1, --   start_parent_profile_number   varchar(10)
-1, --   heritage_location_number   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   legal_name  varchar(255)
CAST('Unknown' AS VARCHAR(7)), --   trading_name   varchar(255)
CAST('Unknown' AS VARCHAR(7)), --   account_type   varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   account_type_code varchar(30)
NULL, --   account_start_date   timestamp
NULL, --   account_ceased_date  timestamp
CAST('Unknown' AS VARCHAR(7)), --   account_status varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   account_status_code  varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   security_level varchar(255)
CAST('Unknown' AS VARCHAR(7)), --   security_level_code  varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   cessation_reason  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   cessation_reason_code   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   filing_frequency  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   filing_frequency_code   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   exemption_reason  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   exemption_reason_code   varchar(30)
NULL, --   exempted_flag  char(1)
NULL, --   green_listed_flag char(1)
NULL, --   red_listed_flag   char(1)
NULL,  --   account_halt_flag char(1)
CAST('Unknown' AS VARCHAR(7)), --   audit_case_active_desc  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   audit_case_active_code  varchar(30)
NULL, --   audit_case_active_flag  char(1)
CAST('Unknown' AS VARCHAR(7)), --   stop_mail_desc varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   stop_mail_code varchar(10)
NULL, --   stop_mail_flag char(1)
CAST('Unknown' AS VARCHAR(7)), --accounting_basis  varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   registration_circumstance  varchar(10)
NULL, --  included_in_prices_flag char(1)
NULL, --  exempt_supplies_flag char(1)
NULL, --  exporter_flag  char(1)
NULL, --  importer_flag  char(1)
NULL, --  unpoliced_filer_flag char(1)
NULL, --  self_invoicer_flag   char(1)
NULL, --  hospice_filer_flag   char(1)
NULL, --  hospice_type   varchar(10)
CAST('Unknown' AS VARCHAR(7)),   --hospice_type_desc  varchar(30)
NULL, --  gst_on_remote_srvcs_flag   char(1)
CAST('Unknown' AS VARCHAR(7)), --   gst_on_remote_srvcs_type   varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   gst_on_remote_srvcs_code   varchar(30)
NULL, --  gst_zero_rated_fin_srv_flag   char(1)
NULL, --  gst_non_resident_claimant_flag   char(1)
NULL, --  taxable_activity_flag   char(1)
NULL, --   insert_object_run_key   int
NULL);

INSERT INTO local_account_gst_default VALUES (
    -2, -- dip_account_sk  bigint
CAST('N/A' AS VARCHAR(3)), -- dip_account_id varchar(30)
'1800-01-01', --   record_effective_timestamp timestamp
'9000-12-31', --  record_expiry_timestamp timestamp
CAST('Y' AS CHAR(1)),  -- record_active_flag   char(1)
CAST('N/A' AS VARCHAR(3)), --  account_origin varchar(10)
-1, --  account_key varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  account_ird_number   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  start_account_id  varchar(30)
-1, --   start_profile_number varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   start_parent_profile_type  varchar(50)
-1, --   start_parent_profile_number   varchar(10)
-1, --   heritage_location_number   varchar(10)
CAST('N/A' AS VARCHAR(3)), --   legal_name  varchar(255)
CAST('N/A' AS VARCHAR(3)), --   trading_name   varchar(255)
CAST('N/A' AS VARCHAR(3)), --   account_type   varchar(30)
CAST('N/A' AS VARCHAR(3)), --   account_type_code varchar(30)
NULL, --   account_start_date   timestamp
NULL, --   account_ceased_date  timestamp
CAST('N/A' AS VARCHAR(3)), --   account_status varchar(30)
CAST('N/A' AS VARCHAR(3)), --   account_status_code  varchar(10)
CAST('N/A' AS VARCHAR(3)), --   security_level varchar(255)
CAST('N/A' AS VARCHAR(3)), --   security_level_code  varchar(10)
CAST('N/A' AS VARCHAR(3)), --   cessation_reason  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   cessation_reason_code   varchar(10)
CAST('N/A' AS VARCHAR(3)), --   filing_frequency  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   filing_frequency_code   varchar(10)
CAST('N/A' AS VARCHAR(3)), --   exemption_reason  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   exemption_reason_code   varchar(30)
NULL, --   exempted_flag  char(1)
NULL, --   green_listed_flag char(1)
NULL, --   red_listed_flag   char(1)
NULL,  --   account_halt_flag char(1)
CAST('N/A' AS VARCHAR(3)), --   audit_case_active_desc  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   audit_case_active_code  varchar(30)
NULL, --   audit_case_active_flag  char(1)
CAST('N/A' AS VARCHAR(3)), --   stop_mail_desc varchar(30)
CAST('N/A' AS VARCHAR(3)), --   stop_mail_code varchar(10)
NULL, --   stop_mail_flag char(1)
CAST('N/A' AS VARCHAR(3)), --accounting_basis  varchar(10)
CAST('N/A' AS VARCHAR(3)), --   registration_circumstance  varchar(10)
NULL, --  included_in_prices_flag char(1)
NULL, --  exempt_supplies_flag char(1)
NULL, --  exporter_flag  char(1)
NULL, --  importer_flag  char(1)
NULL, --  unpoliced_filer_flag char(1)
NULL, --  self_invoicer_flag   char(1)
NULL, --  hospice_filer_flag   char(1)
NULL, --  hospice_type   varchar(10)
CAST('N/A' AS VARCHAR(3)),   --hospice_type_desc  varchar(30)
NULL, --  gst_on_remote_srvcs_flag   char(1)
CAST('N/A' AS VARCHAR(3)), --   gst_on_remote_srvcs_type   varchar(30)
CAST('N/A' AS VARCHAR(3)), --   gst_on_remote_srvcs_code   varchar(30)
NULL, --  gst_zero_rated_fin_srv_flag   char(1)
NULL, --  gst_non_resident_claimant_flag   char(1)
NULL, --  taxable_activity_flag   char(1)
NULL, --   insert_object_run_key   int
NULL);


INSERT INTO local_account_inc_default VALUES (
    -1, -- dip_account_sk  bigint
CAST('Unknown' AS VARCHAR(7)), -- dip_account_id varchar(30)
'1800-01-01', --   record_effective_timestamp timestamp
'9000-12-31', --  record_expiry_timestamp timestamp
CAST('Y' AS CHAR(1)),  -- record_active_flag   char(1)
CAST('Unknown' AS VARCHAR(7)), --  account_origin varchar(10)
-1, --  account_key varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  account_ird_number   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  start_account_id  varchar(30)
-1, --   start_profile_number varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   start_parent_profile_type  varchar(50)
-1, --   start_parent_profile_number   varchar(10)
-1, --   heritage_location_number   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   legal_name  varchar(255)
CAST('Unknown' AS VARCHAR(7)), --   trading_name   varchar(255)
CAST('Unknown' AS VARCHAR(7)), --   account_type   varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   account_type_code varchar(30)
NULL, --   account_start_date   timestamp
NULL, --   account_ceased_date  timestamp
CAST('Unknown' AS VARCHAR(7)), --   account_status varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   account_status_code  varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   security_level varchar(255)
CAST('Unknown' AS VARCHAR(7)), --   security_level_code  varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   cessation_reason  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   cessation_reason_code   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   filing_frequency  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   filing_frequency_code   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   exemption_reason  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   exemption_reason_code   varchar(30)
NULL, --   exempted_flag  char(1)
NULL, --   green_listed_flag char(1)
NULL, --   red_listed_flag   char(1)
NULL,  --   account_halt_flag char(1)
CAST('Unknown' AS VARCHAR(7)), --   audit_case_active_desc  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   audit_case_active_code  varchar(30)
NULL, --   audit_case_active_flag  char(1)
CAST('Unknown' AS VARCHAR(7)), --   stop_mail_desc varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   stop_mail_code varchar(10)
NULL, --   stop_mail_flag char(1)
CAST('Unknown' AS VARCHAR(7)), -- balance_date  varchar(30)
NULL, --    zero_tailored_rate_flag char(1)
NULL, -- trans_tasman_flag char(1)
NULL, --    agent_non_res_insurer_flag char(1)
NULL, --   insert_object_run_key   int
NULL);

INSERT INTO local_account_inc_default VALUES (
    -2, -- dip_account_sk  bigint
CAST('N/A' AS VARCHAR(3)), -- dip_account_id varchar(30)
'1800-01-01', --   record_effective_timestamp timestamp
'9000-12-31', --  record_expiry_timestamp timestamp
CAST('Y' AS CHAR(1)),  -- record_active_flag   char(1)
CAST('N/A' AS VARCHAR(3)), --  account_origin varchar(10)
-1, --  account_key varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  account_ird_number   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  start_account_id  varchar(30)
-1, --   start_profile_number varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   start_parent_profile_type  varchar(50)
-1, --   start_parent_profile_number   varchar(10)
-1, --   heritage_location_number   varchar(10)
CAST('N/A' AS VARCHAR(3)), --   legal_name  varchar(255)
CAST('N/A' AS VARCHAR(3)), --   trading_name   varchar(255)
CAST('N/A' AS VARCHAR(3)), --   account_type   varchar(30)
CAST('N/A' AS VARCHAR(3)), --   account_type_code varchar(30)
NULL, --   account_start_date   timestamp
NULL, --   account_ceased_date  timestamp
CAST('N/A' AS VARCHAR(3)), --   account_status varchar(30)
CAST('N/A' AS VARCHAR(3)), --   account_status_code  varchar(10)
CAST('N/A' AS VARCHAR(3)), --   security_level varchar(255)
CAST('N/A' AS VARCHAR(3)), --   security_level_code  varchar(10)
CAST('N/A' AS VARCHAR(3)), --   cessation_reason  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   cessation_reason_code   varchar(10)
CAST('N/A' AS VARCHAR(3)), --   filing_frequency  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   filing_frequency_code   varchar(10)
CAST('N/A' AS VARCHAR(3)), --   exemption_reason  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   exemption_reason_code   varchar(30)
NULL, --   exempted_flag  char(1)
NULL, --   green_listed_flag char(1)
NULL, --   red_listed_flag   char(1)
NULL,  --   account_halt_flag char(1)
CAST('N/A' AS VARCHAR(3)), --   audit_case_active_desc  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   audit_case_active_code  varchar(30)
NULL, --   audit_case_active_flag  char(1)
CAST('N/A' AS VARCHAR(3)), --   stop_mail_desc varchar(30)
CAST('N/A' AS VARCHAR(3)), --   stop_mail_code varchar(10)
NULL, --   stop_mail_flag char(1)
CAST('N/A' AS VARCHAR(3)), -- balance_date  varchar(30)
NULL, --    zero_tailored_rate_flag char(1)
NULL, -- trans_tasman_flag char(1)
NULL, --    agent_non_res_insurer_flag char(1)
NULL, --   insert_object_run_key   int
NULL);


INSERT INTO local_account_pay_default VALUES (
    -1, -- dip_account_sk  bigint
CAST('Unknown' AS VARCHAR(7)), -- dip_account_id varchar(30)
'1800-01-01', --   record_effective_timestamp timestamp
'9000-12-31', --  record_expiry_timestamp timestamp
CAST('Y' AS CHAR(1)),  -- record_active_flag   char(1)
CAST('Unknown' AS VARCHAR(7)), --  account_origin varchar(10)
-1, --  account_key varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  account_ird_number   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  start_account_id  varchar(30)
-1, --   start_profile_number varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   start_parent_profile_type  varchar(50)
-1, --   start_parent_profile_number   varchar(10)
-1, --   heritage_location_number   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   legal_name  varchar(255)
CAST('Unknown' AS VARCHAR(7)), --   trading_name   varchar(255)
CAST('Unknown' AS VARCHAR(7)), --   account_type   varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   account_type_code varchar(30)
NULL, --   account_start_date   timestamp
NULL, --   account_ceased_date  timestamp
CAST('Unknown' AS VARCHAR(7)), --   account_status varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   account_status_code  varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   security_level varchar(255)
CAST('Unknown' AS VARCHAR(7)), --   security_level_code  varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   cessation_reason  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   cessation_reason_code   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   filing_frequency  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   filing_frequency_code   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   exemption_reason  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   exemption_reason_code   varchar(30)
NULL, --   exempted_flag  char(1)
NULL, --   green_listed_flag char(1)
NULL, --   red_listed_flag   char(1)
NULL,  --   account_halt_flag char(1)
CAST('Unknown' AS VARCHAR(7)), --   audit_case_active_desc  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   audit_case_active_code  varchar(30)
NULL, --   audit_case_active_flag  char(1)
CAST('Unknown' AS VARCHAR(7)), --   stop_mail_desc varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   stop_mail_code varchar(10)
NULL, --   stop_mail_flag char(1)
NULL, -- ir56_flag   char(1)
CAST('Unknown' AS VARCHAR(7)), -- 41 filing_option  varchar(30)
CAST('Unknown' AS VARCHAR(7)), -- 42 filing_option_code   varchar(10)
NULL, -- 43 payday_filer_flag char(1)
NULL, -- 44 payday_filer_start_date timestamp
NULL, -- 45 employer_child_support_flag   char(1)
NULL, -- 46 employer_student_loan_flag char(1)
NULL, -- 47 kiwisaver_employee_dedn_flag  char(1)
NULL, -- 48 kiwisaver_employer_cntrbflag  char(1)
NULL, -- 49 esct_flag   char(1)
CAST('Unknown' AS VARCHAR(7)), -- 50 employer_group varchar(255)
CAST('Unknown' AS VARCHAR(7)), -- 51 employer_group_code  varchar(10)
NULL, -- 52 payday_variation_flag   char(1)
NULL, --   insert_object_run_key   int
NULL);

INSERT INTO local_account_pay_default VALUES (
    -2, -- dip_account_sk  bigint
CAST('N/A' AS VARCHAR(3)), -- dip_account_id varchar(30)
'1800-01-01', --   record_effective_timestamp timestamp
'9000-12-31', --  record_expiry_timestamp timestamp
CAST('Y' AS CHAR(1)),  -- record_active_flag   char(1)
CAST('N/A' AS VARCHAR(3)), --  account_origin varchar(10)
-1, --  account_key varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  account_ird_number   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  start_account_id  varchar(30)
-1, --   start_profile_number varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   start_parent_profile_type  varchar(50)
-1, --   start_parent_profile_number   varchar(10)
-1, --   heritage_location_number   varchar(10)
CAST('N/A' AS VARCHAR(3)), --   legal_name  varchar(255)
CAST('N/A' AS VARCHAR(3)), --   trading_name   varchar(255)
CAST('N/A' AS VARCHAR(3)), --   account_type   varchar(30)
CAST('N/A' AS VARCHAR(3)), --   account_type_code varchar(30)
NULL, --   account_start_date   timestamp
NULL, --   account_ceased_date  timestamp
CAST('N/A' AS VARCHAR(3)), --   account_status varchar(30)
CAST('N/A' AS VARCHAR(3)), --   account_status_code  varchar(10)
CAST('N/A' AS VARCHAR(3)), --   security_level varchar(255)
CAST('N/A' AS VARCHAR(3)), --   security_level_code  varchar(10)
CAST('N/A' AS VARCHAR(3)), --   cessation_reason  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   cessation_reason_code   varchar(10)
CAST('N/A' AS VARCHAR(3)), --   filing_frequency  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   filing_frequency_code   varchar(10)
CAST('N/A' AS VARCHAR(3)), --   exemption_reason  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   exemption_reason_code   varchar(30)
NULL, --   exempted_flag  char(1)
NULL, --   green_listed_flag char(1)
NULL, --   red_listed_flag   char(1)
NULL,  --   account_halt_flag char(1)
CAST('N/A' AS VARCHAR(3)), --   audit_case_active_desc  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   audit_case_active_code  varchar(30)
NULL, --   audit_case_active_flag  char(1)
CAST('N/A' AS VARCHAR(3)), --   stop_mail_desc varchar(30)
CAST('N/A' AS VARCHAR(3)), --   stop_mail_code varchar(10)
NULL, --   stop_mail_flag char(1)
NULL, -- ir56_flag   char(1)
CAST('N/A' AS VARCHAR(3)), -- 41 filing_option  varchar(30)
CAST('N/A' AS VARCHAR(3)), -- 42 filing_option_code   varchar(10)
NULL, -- 43 payday_filer_flag char(1)
NULL, -- 44 payday_filer_start_date timestamp
NULL, -- 45 employer_child_support_flag   char(1)
NULL, -- 46 employer_student_loan_flag char(1)
NULL, -- 47 kiwisaver_employee_dedn_flag  char(1)
NULL, -- 48 kiwisaver_employer_cntrbflag  char(1)
NULL, -- 49 esct_flag   char(1)
CAST('N/A' AS VARCHAR(3)), -- 50 employer_group varchar(255)
CAST('N/A' AS VARCHAR(3)), -- 51 employer_group_code  varchar(10)
NULL, -- 52 payday_variation_flag   char(1)
NULL, --   insert_object_run_key   int
NULL);

INSERT INTO local_account_pie_default VALUES (
    -1, -- dip_account_sk  bigint
CAST('Unknown' AS VARCHAR(7)), -- dip_account_id varchar(30)
'1800-01-01', --   record_effective_timestamp timestamp
'9000-12-31', --  record_expiry_timestamp timestamp
CAST('Y' AS CHAR(1)),  -- record_active_flag   char(1)
CAST('Unknown' AS VARCHAR(7)), --  account_origin varchar(10)
-1, --  account_key varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  account_ird_number   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  start_account_id  varchar(30)
-1, --   start_profile_number varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   start_parent_profile_type  varchar(50)
-1, --   start_parent_profile_number   varchar(10)
-1, --   heritage_location_number   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   legal_name  varchar(255)
CAST('Unknown' AS VARCHAR(7)), --   trading_name   varchar(255)
CAST('Unknown' AS VARCHAR(7)), --   account_type   varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   account_type_code varchar(30)
NULL, --   account_start_date   timestamp
NULL, --   account_ceased_date  timestamp
CAST('Unknown' AS VARCHAR(7)), --   account_status varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   account_status_code  varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   security_level varchar(255)
CAST('Unknown' AS VARCHAR(7)), --   security_level_code  varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   cessation_reason  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   cessation_reason_code   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   filing_frequency  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   filing_frequency_code   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   exemption_reason  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   exemption_reason_code   varchar(30)
NULL, --   exempted_flag  char(1)
NULL, --   green_listed_flag char(1)
NULL, --   red_listed_flag   char(1)
NULL,  --   account_halt_flag char(1)
CAST('Unknown' AS VARCHAR(7)), --   audit_case_active_desc  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   audit_case_active_code  varchar(30)
NULL, --   audit_case_active_flag  char(1)
CAST('Unknown' AS VARCHAR(7)), --   stop_mail_desc varchar(30)
CAST('Unknown' AS VARCHAR(7)), --   stop_mail_code varchar(10)
NULL, --   stop_mail_flag char(1)
CAST('Unknown' AS VARCHAR(7)), --pie_type varchar(30)
CAST('Unknown' AS VARCHAR(7)), --41 pie_type_code  varchar(30)
CAST('Unknown' AS VARCHAR(7)), --42 filing_option  varchar(255)
CAST('Unknown' AS VARCHAR(7)), --43 filing_option_code   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --44 attribution_period   varchar(50)
CAST('Unknown' AS VARCHAR(7)), --45 fdr_calc_period   varchar(50)
NULL, --   insert_object_run_key   int
NULL);

INSERT INTO local_account_pie_default VALUES (
    -2, -- dip_account_sk  bigint
CAST('N/A' AS VARCHAR(3)), -- dip_account_id varchar(30)
'1800-01-01', --   record_effective_timestamp timestamp
'9000-12-31', --  record_expiry_timestamp timestamp
CAST('Y' AS CHAR(1)),  -- record_active_flag   char(1)
CAST('N/A' AS VARCHAR(3)), --  account_origin varchar(10)
-1, --  account_key varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  account_ird_number   varchar(10)
CAST('Unknown' AS VARCHAR(7)), --  start_account_id  varchar(30)
-1, --   start_profile_number varchar(10)
CAST('Unknown' AS VARCHAR(7)), --   start_parent_profile_type  varchar(50)
-1, --   start_parent_profile_number   varchar(10)
-1, --   heritage_location_number   varchar(10)
CAST('N/A' AS VARCHAR(3)), --   legal_name  varchar(255)
CAST('N/A' AS VARCHAR(3)), --   trading_name   varchar(255)
CAST('N/A' AS VARCHAR(3)), --   account_type   varchar(30)
CAST('N/A' AS VARCHAR(3)), --   account_type_code varchar(30)
NULL, --   account_start_date   timestamp
NULL, --   account_ceased_date  timestamp
CAST('N/A' AS VARCHAR(3)), --   account_status varchar(30)
CAST('N/A' AS VARCHAR(3)), --   account_status_code  varchar(10)
CAST('N/A' AS VARCHAR(3)), --   security_level varchar(255)
CAST('N/A' AS VARCHAR(3)), --   security_level_code  varchar(10)
CAST('N/A' AS VARCHAR(3)), --   cessation_reason  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   cessation_reason_code   varchar(10)
CAST('N/A' AS VARCHAR(3)), --   filing_frequency  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   filing_frequency_code   varchar(10)
CAST('N/A' AS VARCHAR(3)), --   exemption_reason  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   exemption_reason_code   varchar(30)
NULL, --   exempted_flag  char(1)
NULL, --   green_listed_flag char(1)
NULL, --   red_listed_flag   char(1)
NULL,  --   account_halt_flag char(1)
CAST('N/A' AS VARCHAR(3)), --   audit_case_active_desc  varchar(30)
CAST('N/A' AS VARCHAR(3)), --   audit_case_active_code  varchar(30)
NULL, --   audit_case_active_flag  char(1)
CAST('N/A' AS VARCHAR(3)), --   stop_mail_desc varchar(30)
CAST('N/A' AS VARCHAR(3)), --   stop_mail_code varchar(10)
NULL, --   stop_mail_flag char(1)
CAST('N/A' AS VARCHAR(3)), --pie_type varchar(30)
CAST('N/A' AS VARCHAR(3)), --41 pie_type_code  varchar(30)
CAST('N/A' AS VARCHAR(3)), --42 filing_option  varchar(255)
CAST('N/A' AS VARCHAR(3)), --43 filing_option_code   varchar(10)
CAST('N/A' AS VARCHAR(3)), --44 attribution_period   varchar(50)
CAST('N/A' AS VARCHAR(3)), --45 fdr_calc_period   varchar(50)
NULL, --   insert_object_run_key   int
NULL);

COMPUTE STATS local_account_default;
COMPUTE STATS local_account_gst_default;
COMPUTE STATS local_account_inc_default;
COMPUTE STATS local_account_pay_default;
COMPUTE STATS local_account_pie_default;


SELECT '\n\n***************************************\n** DDL Script Completed Successfully **\n***************************************'
