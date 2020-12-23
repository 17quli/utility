/*****************************************************************************************************************
-- ird0sxd 05/04/20 backout script for DDL changes in 2.2.4

*****************************************************************************************************************/

--create table extract_object_20200420 as select * from extract_object;
--create table object_20200420 as select * from object;
--create table system_Schema_20204_0420 as select * from system_schema;
--Save copy of the existing UPDATE_OBJ code.

DROP TABLE task;
DROP SEQUENCE LCF.seq_TASK_KEY ;
DROP TRIGGER TRG_TASK_PRE_INSERT; 
DROP TRIGGER TRG_TASK_PRE_UPDATE;
DROP TRIGGER OBJECT_CONTROL;
DROP TABLE OBJECT_CONTROL;
DROP TRIGGER TRG_OBJECT_CONTROL_PRE_UPDATE;
DROP TRIGGER TRG_OBJECT_CONTROL_LOAD;
DROP TABLE DATA_DOMAIN;
DROP TABLE DATA_DOMAIN_OBJECT_REL;
ALTER TABLE DOMAIN_DROP RENAME TO DROMAIN;
ALTER TABLE SUB_DOMAIN_DROP RENAME TO SUB_DOMAIN;
ALTER TABLE DOMAIN_BRIDGE_DROP RENAME TO DOMAIN_BRIDGE;
ALTER TABLE DATA_DOMAIN_EXPANDED_DROP RENAME TO DATA_DOMAIN_EXPANDED;

ALTER TABLE SYSTEM_SCHEMA 
RENAME COLUMN   SCHEMA_PREFIX TO GENERIC_SYSTEM_NAME;

ALTER TABLE SYSTEM_SCHEMA_HIST 
RENAME  COLUMN SCHEMA_PREFIX TO GENERIC_SYSTEM_NAME;

RENAME TABLE OBJECT TO OBJECT_POST_224;
RENAME TABLE SYSTEM_SCHEMA TO SYSTEM_SCHEMA_POST_224;
RENAME TABLE EXTRACT_OBJECT RENAME EXTRACT_OBJECT_POST_224;


RENAME extract_object_20200420  TO EXTRACT_OBJECT;
RENAME object_20200420  TO OBJECT;
RENAME system_Schema_20204_0420  TO SYSTEM_sCHEMA;


--recompile triggers as required
--check for invalid views
--recreate PL/SQL Package body
--check for invalid objects



