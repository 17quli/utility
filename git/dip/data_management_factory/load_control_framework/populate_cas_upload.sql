*****************************************************
--Populate CAS Upload fields with required values

select * from lcf.OBJECT_CONTROL where cas_upload = 'Y'; 

update lcf.OBJECT_CONTROL set cas_upload_environment='LAB' where cas_upload = 'Y' and target_object_name not in ('APP_TBLCUSTOMERINFO', 'APP_TBLNZ_CUSTOMERSTD');
COMMIT;

update lcf.OBJECT_CONTROL set cas_upload_library='CASLVWS' where cas_upload = 'Y' and target_object_name not in ('APP_TBLCUSTOMERINFO', 'APP_TBLNZ_CUSTOMERSTD'); 
COMMIT;

update lcf.OBJECT_CONTROL set cas_upload_environment='LAB / FACTORY' where cas_upload = 'Y' and target_object_name in ('APP_TBLCUSTOMERINFO', 'APP_TBLNZ_CUSTOMERSTD');
COMMIT;

update lcf.OBJECT_CONTROL set cas_upload_library='CASLVWS / CASFVWS' where cas_upload = 'Y' and target_object_name in ('APP_TBLCUSTOMERINFO', 'APP_TBLNZ_CUSTOMERSTD'); 
COMMIT;

select * from lcf.OBJECT_CONTROL where cas_upload = 'Y';

*****************************************************
