/* Script to invoke PL/SQL procs that validate and load metadata */
CLEAR SCREEN;
SET SERVEROUTPUT  ON 

BEGIN
LCF.LCF_UPDATE.VALIDATE_REG_DATA(p_env=>'&env',
                                 p_user=>'ird0sxd');
Commit;                       
END;

CLEAR SCREEN;
SET SERVEROUTPUT  ON 

BEGIN
LCF.LCF_UPDATE.UPDATE_OBJ(p_system_schema_key=>NULL,
                                p_source_object_name=>NULL,                                  
                                p_initialize=>'Y',
                                p_env=>'&env',
                                p_user=>'ird0sxd');
Commit;                       
END;


