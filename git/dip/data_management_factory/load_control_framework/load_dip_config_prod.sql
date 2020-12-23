
/*****************************************************
01/02/2020 SDZ parameters required for R3A Dashboard industrialisation
01/04/2020 SDZ 2 new parameters to be added and update to USER_BATCH_RAW_IMPLALA
******************************************************/


-- Check existing config

SELECT * FROM LCF.DIP_CONFIG;


-- 01/04/2020 values to be loaded to Prod

INSERT INTO DIP_CONFIG  VALUES ('USER_BATCH_DSN','ClouderaImpala64');
INSERT INTO DIP_CONFIG VALUES  ('USER_BATCH_REFINED_IMPALA','prod_refined_restricted_access');

UPDATE DIP_CONFIG
SET VALUE='prod_raw_restricted_access'
WHERE KEY='USER_BATCH_RAW_IMPALA';
COMMIT;


SELECT * FROM DIP_CONFIG WHERE KEY LIKE 'USER%' ORDER BY KEY;

-----------------------------------------------------------------------------------------

-- Check current parameters
SELECT * FROM LCF.DIP_CONFIG;

--INSERT INTO DIP_CONFIG values  ('USER_BATCH_SOURCE_CASLIB','EP_PROD_SILVER_WORK');
--INSERT INTO DIP_CONFIG values  ('USER_BATCH_SOURCE_IMPALA','prod_silver_work');
--INSERT INTO DIP_CONFIG values  ('USER_BATCH_MODEL_CASLIB','ModelStore');
--INSERT INTO DIP_CONFIG values  ('USER_BATCH_RAW_CASLIB','EP_PROD_CAS_VIEWS');
--INSERT INTO DIP_CONFIG values  ('USER_BATCH_REPORTING_CASLIB','EP_PROD_SILVER_PUBLISH');


--INSERT INTO DIP_CONFIG values  ('USER_BATCH_TARGET_CASHOST','ird45au.vsp.sas.com');
--INSERT INTO DIP_CONFIG values  ('USER_BATCH_TARGET_CASPORT','5572');
--INSERT INTO DIP_CONFIG values  ('USER_BATCH_REPORTING_IMPALA','prod_silver_publish');
--INSERT INTO DIP_CONFIG values  ('USER_BATCH_RAW_IMPALA','prod_raw_restricted_access');
