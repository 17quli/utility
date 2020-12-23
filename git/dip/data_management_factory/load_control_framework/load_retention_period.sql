/*********************************************************************************
250719 ird0sxd load script for retention period
**********************************************************************************/
REM INSERTING into RETENTION_PERIOD
SET DEFINE OFF;
Insert into RETENTION_PERIOD (RETENTION_KEY,RETENTION_NUM_DAYS) values (1,10960);
COMMIT;

select * from RETENTION_PERIOD;