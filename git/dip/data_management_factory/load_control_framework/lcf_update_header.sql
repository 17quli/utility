CREATE OR REPLACE
PACKAGE LCF.LCF_UPDATE IS

/*--------------------------------------------------------------------------------
This package header contains the references to procedures that contain the logic to 
maintain the metadata for the Load Control framework.  
  
  From SQL Developer login as LCF to dev or test or prod  and invoke the correct procedure.
  One or more parameters are used by these parameters. They are outlined below.
  
  p_system_key - a system_key that matches the source system you are trying to ingest the data from
  p_source_table_name - is the name of the source table in uppercase 
  p_initialize - A  Y/N to say whether to merge all rows to OBJECT table or not
  p_env - dev or test or prod depending on the enviornment you are working on
  p_user - your userid allocated by SAS Global Hosting
  
  
  PROCEDURE  VALIDATE_OBJ is to load the data arriving from Object Registration.
  
  to validate registration data:
  
  set serveroutput on
  clear screen
  lCF.LCF_UPDATE.VALIDATE_OBJ ( p_env=>'dev',
                                p_user=>'ird0sxd');
  
  
  
  
 
  
  PROCEDURE  UPDATE_OBJ will update OBJECT_COLUMN and INSERT/UPDATE OBJECT. 

  to MERGE all data:
 
  set serveroutput on
  clear screen

  lCF.LCF_UPDATE.UPDATE_OBJ    (p_system_schema_key=>NULL,
                                p_source_object_object_name=>NULL,                                  
                                p_initialize=>'Y',
                                p_env=>'dev',
                                p_user=>'ird0sxd');
 
 
   to MERGE one table's data:
    
    set serveroutput on
    clear screen
    lCF.LCF_UPDATE.UPDATE_OBJ  (p_system_schema_key=>10,   --10 corresponds to the  system_schema key  associated with this table
                                p_source_object_object_name=>'TBLACCOUNT',                                  
                                p_initialize=>'N',
                                p_env=>'dev',
                                p_user=>'ird0sxd');
 
    
 Note:
  Error messages:
        ORA-20001: E) Invalid parameter vaue for p_ENV - Allowed values DEV, TEST, PROD
        ORA-20002: E) SYSTEM_SCHEMA has '|| lv_row_count||' rows. Please check whether they are correct)
        ORA-20003: E) An error has occurred loading the setup data
        ORA-20004: E) One or more incoming parameters are null, aborting ...
        ORA-20005: E) Table registration data validation failed
        ORA-20006: E) Missing System Schema Keys found, aborting ...
        
  Modification History:
  26/04/19 SDZ Initial Build
  16/05/19 SDZ Added comments for clarity
  20/09/19 SDZ Removed system_init procedure as it is not needed here.
    
*/    
-------------------------------------------------------------------------------
-- PROCEDURE VALIDATEE_REG_DATA
-- Validate table registration data
--------------------------------------------------------------------------------

PROCEDURE VALIDATE_REG_DATA (p_env IN VARCHAR2, p_user IN VARCHAR2) ;

--------------------------------------------------------------------------------
-- PROCEDURE SYSTEM_INIT
-- Load initial data to system tables
--------------------------------------------------------------------------------


--------------------------------------------------------------------------------
-- PROCEDURE UPDATE_OBJ
-- Load Object table and other tables
--------------------------------------------------------------------------------

PROCEDURE UPDATE_OBJ (p_system_schema_key IN NUMBER,
                     p_source_object_name IN VARCHAR2,
                     p_initialize  IN VARCHAR2,
                     p_env         IN VARCHAR2,
                     p_user        IN VARCHAR2);
END;
