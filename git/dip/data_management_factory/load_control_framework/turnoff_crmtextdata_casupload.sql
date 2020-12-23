/************************************************************************
-- 16/03/20 ird0sxd Disable casupload for INT_CRM_TEXT_DATA


*************************************************************************/


SELECT TARGET_OBJECT_NAME,
       CAS_UPLOAD 
FROM OBJECT
WHERE TARGET_OBJECT_NAME='INT_CRM_TEXT_DATA';

UPDATE OBJECT
SET CAS_UPLOAD='N'
WHERE TARGET_OBJECT_NAME='INT_CRM_TEXT_DATA';

COMMIT;

SELECT TARGET_OBJECT_NAME,
	CAS_UPLOAD 
FROM OBJECT
WHERE TARGET_OBJECT_NAME='INT_CRM_TEXT_DATA';

