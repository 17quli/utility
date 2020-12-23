/***********************************************************************************************************
30/11/19 ird0sxd Minor updates to LCF
13/12/19 ird0sxd Added DIPINT to accomodate the new intermediate tables in raw. (we are still using IMPRAW FOR DIPINT).




************************************************************************************************************/
ALTER TABLE OBJECT ADD LAYER VARCHAR2(15) DEFAULT 'RAW';
UPDATE OBJECT SET LAYER='RAW';
COMMIT;


SELECT * FROM SYSTEM_SCHEMA

INSERT INTO SYSTEM_SCHEMA (SYSTEM_NAME, SYSTEM_TYPE, SCHEMA_NAME, SAS_LIB_REF) VALUES ('DIPREF','IMPALA','REFINED','IMPRFN');
INSERT INTO SYSTEM_SCHEMA (SYSTEM_NAME, SYSTEM_TYPE, SCHEMA_NAME, SAS_LIB_REF) VALUES ('DIPRAW','IMPALA','RAW','IMPRAW');
INSERT INTO SYSTEM_SCHEMA (SYSTEM_NAME, SYSTEM_TYPE, SCHEMA_NAME, SAS_LIB_REF) VALUES ('DIPINT','IMPALA','INTERMEDIATE','IMPRAW');
INSERT INTO SYSTEM_SCHEMA (SYSTEM_NAME, SYSTEM_TYPE, SCHEMA_NAME, SAS_LIB_REF) VALUES ('SWEB','MSSQL','NZP_GTWEB','STRWEB');

COMMIT;


SELECT * 
FROM SYSTEM_SCHEMA
WHERE SAS_LIB_REF='IMPRAW';

INSERT INTO OBJECT (SYSTEM_SCHEMA_KEY,TARGET_OBJECT_NAME,LAYER, CAS_UPLOAD) VALUES (&IMPRAW_SYSTEM_SCHEMA_KEY,'INT_CRM_TEXT_DATA','INTERMEDIATE','Y');


UPDATE OBJECT SET SYSTEM_SCHEMA_KEY=&IMPRAW_SYSTEM_SCHEMA_KEY WHERE TARGET_OBJECT_NAME='INT_CRM_TEXT_DATA';


COMMIT;

-- for the new read only account 
grant select on lcf.object to ro_lcf_role;
grant select on lcf.object_run to ro_lcf_role;
grant select on lcf.dip_object_run to ro_lcf_role;
grant select on lcf.DATA_DOMAIN_EXPANDED to ro_lcf_role;
grant select on lcf.DIP_CONFIG to ro_lcf_role;
grant select on lcf.DIP_OBJECT_RUN to ro_lcf_role;
grant select on lcf.DOMAIN to ro_lcf_role;
grant select on lcf.DOMAIN_BRIDGE to ro_lcf_role;
grant select on lcf.EXTRACT_OBJECT to ro_lcf_role;
grant select on lcf.LCF_LOG to ro_lcf_role;
grant select on lcf.OBJECT_HIST to ro_lcf_role;
grant select on lcf.RETENTION_PERIOD to ro_lcf_role;
grant select on lcf.SUB_DOMAIN to ro_lcf_role;
grant select on lcf.SYSTEM_SCHEMA to ro_lcf_role;
grant select on lcf.SYSTEM_SCHEMA_HIST to ro_lcf_role;



SELECT * FROM OBJECT WHERE TARGET_OBJECT_NAME='INT_CRM_TEXT_DATA';
