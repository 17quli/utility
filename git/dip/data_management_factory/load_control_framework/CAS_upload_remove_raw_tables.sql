-- ird0nxa 22052020 Script to update CAS_Upload flag in LCF.OBJECT_CONTROL table
-- It is no longer required to upload Raw tables into CAS, therefore the LCF.Object_Control table needs to be modified in the following way:

--currently there are should be 12 items for CAS Upload (or 19 if 7 Account Refine tables have already been added)
select * from lcf.OBJECT_CONTROL where cas_upload = 'Y';

--update Object_Control to leave only Refine tables for CAS Upload
update lcf.OBJECT_CONTROL set cas_upload = 'N' where cas_upload = 'Y' and target_object_name not in ('PARTY_DIM', 'INDIVIDUAL_DIM', 'ORGANISATION_DIM', 'ACCOUNT_DIM', 'ACCOUNT_GST_DIM', 'ACCOUNT_INC_DIM', 'ACCOUNT_PAY_DIM', 'ACCOUNT_PIE_DIM', 'PARTY_ACCOUNT_REL', 'PARTY_ACCOUNT_REL_TYPE');
COMMIT;

--after the Update there are should be only 3 items for CAS Upload ('PARTY_DIM', 'INDIVIDUAL_DIM', 'ORGANISATION_DIM')
--or 10 items if Account Refine tables have already been added ('PARTY_DIM', 'INDIVIDUAL_DIM', 'ORGANISATION_DIM', 'ACCOUNT_DIM', 'ACCOUNT_GST_DIM', 'ACCOUNT_INC_DIM', 'ACCOUNT_PAY_DIM', 'ACCOUNT_PIE_DIM', 'PARTY_ACCOUNT_REL', 'PARTY_ACCOUNT_REL_TYPE')
select * from lcf.OBJECT_CONTROL where cas_upload = 'Y';

