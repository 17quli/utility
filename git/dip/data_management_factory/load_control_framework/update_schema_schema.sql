 -- This script is to be run only in Prod. 
-- To update any references to NZO to NZP.
-- Longer term we would need to revisit how we record the schema name in the object registration sheet once R3A cutover to Prod.

CREATE TABLE EXTRACT_OBJECT_281119 AS SELECT * FROM EXTRACT_OBJECT

UPDATE EXTRACT_OBJECT 
SET SCHEMA_NAME='NZP_GTAPP' WHERE SCHEMA_NAME='NZO_GTAPP';

UPDATE EXTRACT_OBJECT 
SET SCHEMA_NAME='NZP_GTREF' WHERE SCHEMA_NAME='NZO_GTREF';

UPDATE EXTRACT_OBJECT 
SET SCHEMA_NAME='NZP_GTFRD' WHERE SCHEMA_NAME='NZO_GTFRD';

UPDATE EXTRACT_OBJECT 
SET SCHEMA_NAME='NZP_GTWRQ' WHERE SCHEMA_NAME='NZO_GTWRQ';


COMMIT;

SELECT * from system_schema WHERE SYSTEM_TYPE='MSSQL'

update system_schema set schema_name='NZP_GTREF' WHERE SAS_LIB_REF='STRREF';
update system_schema set schema_name='NZP_GTAPP' WHERE SAS_LIB_REF='STRAPP';
update system_schema set schema_name='NZP_GTWRQ' WHERE SAS_LIB_REF='STRWRQ';
update system_schema set schema_name='NZP_GTFRD' WHERE SAS_LIB_REF='STRFRD';
update system_schema set schema_name='NZP_GTSTC' WHERE SAS_LIB_REF='STRSTC';
