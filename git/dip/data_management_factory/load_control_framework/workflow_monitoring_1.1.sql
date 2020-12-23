CREATE OR REPLACE VIEW LCF.V_WORKFLOW_ALL
AS
SELECT WORKFLOW_LEVEL_1,WORKFLOW
FROM (
SELECT WORKFLOW_LEVEL_1,WORKFLOW_LEVEL_1 AS WORKFLOW
FROM WORKFLOW_JOB wj 
WHERE RECORD_ACTIVE_FLAG  = 'Y'
UNION
SELECT WORKFLOW_LEVEL_1,WORKFLOW_LEVEL_2
FROM WORKFLOW_JOB wj 
WHERE RECORD_ACTIVE_FLAG  = 'Y'
UNION
SELECT WORKFLOW_LEVEL_1,WORKFLOW_LEVEL_3
FROM WORKFLOW_JOB wj 
WHERE RECORD_ACTIVE_FLAG  = 'Y'
UNION
SELECT WORKFLOW_LEVEL_1,WORKFLOW_LEVEL_4
FROM WORKFLOW_JOB wj 
WHERE RECORD_ACTIVE_FLAG  = 'Y'
UNION
SELECT WORKFLOW_LEVEL_1,WORKFLOW_LEVEL_5
FROM WORKFLOW_JOB wj 
WHERE RECORD_ACTIVE_FLAG  = 'Y'
) WF
WHERE WORKFLOW IS NOT NULL;

GRANT SELECT ON V_WORKFLOW_ALL TO svc_lcf;

CREATE OR REPLACE VIEW LCF.V_WORKFLOW_STATUS_10DAYS
AS
WITH BASE AS
(
	SELECT *
	FROM 
	(
		SELECT 
			wjr.*,
			RANK() over (PARTITION BY LSF_WORKFLOW_RUN_ID,JOB_NAME,
					CASE WHEN UPPER( JOB_NAME ) LIKE  '%_LOOP_%'  THEN OBJECT_NAME ELSE '-' END 
				ORDER BY LSF_OBJECT_PRG_ID DESC,JOB_START_TIME DESC) RNK
		FROM WORKFLOW_JOB_RUN wjr
		WHERE TRUNC(SYSDATE) - TRUNC(CAST(RUN_DATE_TIME  AS DATE)) <= 10
	) ranked
	WHERE RNK = 1
),
STATS AS
(
SELECT LSF_WORKFLOW_RUN_ID, 1 AS WORKFLOW_LEVEL, WORKFLOW_LEVEL_1 AS WORKFLOW, RUN_DATE_TIME
	,MIN(JOB_START_TIME) AS WORKFLOW_START_TIME
	,MAX(JOB_END_TIME) AS WORKFLOW_END_TIME
	,SUM( CASE WHEN JOB_STATUS='Unscheduled' THEN 1 ELSE 0 END) AS UNSCHEDULED
	,SUM( CASE WHEN JOB_STATUS='Pending' THEN 1 ELSE 0 END) AS PENDING
	,SUM( CASE WHEN JOB_STATUS='Success' THEN 1 ELSE 0 END) AS SUCCESS
	,SUM( CASE WHEN JOB_STATUS='Error' THEN 1 ELSE 0 END) AS ERROR
	,SUM( CASE WHEN JOB_STATUS='Running' THEN 1 ELSE 0 END) AS RUNNING
	,SUM( CASE WHEN JOB_STATUS='Killed' THEN 1 ELSE 0 END) AS KILLED
	,COUNT(1) AS TOTAL_JOBS
FROM BASE
GROUP BY LSF_WORKFLOW_RUN_ID,  WORKFLOW_LEVEL_1, RUN_DATE_TIME
UNION all
SELECT LSF_WORKFLOW_RUN_ID, 2 AS WORKFLOW_LEVEL, WORKFLOW_LEVEL_2 AS WORKFLOW, RUN_DATE_TIME 
	,MIN(JOB_START_TIME) AS WORKFLOW_START_TIME
	,MAX(JOB_END_TIME) AS WORKFLOW_END_TIME
	,SUM( CASE WHEN JOB_STATUS='Unscheduled' THEN 1 ELSE 0 END) AS UNSCHEDULED
	,SUM( CASE WHEN JOB_STATUS='Pending' THEN 1 ELSE 0 END) AS PENDING
	,SUM( CASE WHEN JOB_STATUS='Success' THEN 1 ELSE 0 END) AS SUCCESS
	,SUM( CASE WHEN JOB_STATUS='Error' THEN 1 ELSE 0 END) AS ERROR
	,SUM( CASE WHEN JOB_STATUS='Running' THEN 1 ELSE 0 END) AS RUNNING
	,SUM( CASE WHEN JOB_STATUS='Killed' THEN 1 ELSE 0 END) AS KILLED
	,COUNT(1) AS TOTAL_JOBS
FROM BASE
GROUP BY LSF_WORKFLOW_RUN_ID,  WORKFLOW_LEVEL_2, RUN_DATE_TIME
UNION all
SELECT LSF_WORKFLOW_RUN_ID, 3 AS WORKFLOW_LEVEL, WORKFLOW_LEVEL_3 AS WORKFLOW, RUN_DATE_TIME 
	,MIN(JOB_START_TIME) AS WORKFLOW_START_TIME
	,MAX(JOB_END_TIME) AS WORKFLOW_END_TIME
	,SUM( CASE WHEN JOB_STATUS='Unscheduled' THEN 1 ELSE 0 END) AS UNSCHEDULED
	,SUM( CASE WHEN JOB_STATUS='Pending' THEN 1 ELSE 0 END) AS PENDING
	,SUM( CASE WHEN JOB_STATUS='Success' THEN 1 ELSE 0 END) AS SUCCESS
	,SUM( CASE WHEN JOB_STATUS='Error' THEN 1 ELSE 0 END) AS ERROR
	,SUM( CASE WHEN JOB_STATUS='Running' THEN 1 ELSE 0 END) AS RUNNING
	,SUM( CASE WHEN JOB_STATUS='Killed' THEN 1 ELSE 0 END) AS KILLED
	,COUNT(1) AS TOTAL_JOBS
FROM BASE
GROUP BY LSF_WORKFLOW_RUN_ID,  WORKFLOW_LEVEL_3, RUN_DATE_TIME
UNION all
SELECT LSF_WORKFLOW_RUN_ID, 4 AS WORKFLOW_LEVEL, WORKFLOW_LEVEL_4 AS WORKFLOW, RUN_DATE_TIME 
	,MIN(JOB_START_TIME) AS WORKFLOW_START_TIME
	,MAX(JOB_END_TIME) AS WORKFLOW_END_TIME
	,SUM( CASE WHEN JOB_STATUS='Unscheduled' THEN 1 ELSE 0 END) AS UNSCHEDULED
	,SUM( CASE WHEN JOB_STATUS='Pending' THEN 1 ELSE 0 END) AS PENDING
	,SUM( CASE WHEN JOB_STATUS='Success' THEN 1 ELSE 0 END) AS SUCCESS
	,SUM( CASE WHEN JOB_STATUS='Error' THEN 1 ELSE 0 END) AS ERROR
	,SUM( CASE WHEN JOB_STATUS='Running' THEN 1 ELSE 0 END) AS RUNNING
	,SUM( CASE WHEN JOB_STATUS='Killed' THEN 1 ELSE 0 END) AS KILLED
	,COUNT(1) AS TOTAL_JOBS
FROM BASE
GROUP BY LSF_WORKFLOW_RUN_ID,  WORKFLOW_LEVEL_4, RUN_DATE_TIME
UNION all
SELECT LSF_WORKFLOW_RUN_ID, 5 AS WORKFLOW_LEVEL, WORKFLOW_LEVEL_5 AS WORKFLOW, RUN_DATE_TIME 
	,MIN(JOB_START_TIME) AS WORKFLOW_START_TIME
	,MAX(JOB_END_TIME) AS WORKFLOW_END_TIME
	,SUM( CASE WHEN JOB_STATUS='Unscheduled' THEN 1 ELSE 0 END) AS UNSCHEDULED
	,SUM( CASE WHEN JOB_STATUS='Pending' THEN 1 ELSE 0 END) AS PENDING
	,SUM( CASE WHEN JOB_STATUS='Success' THEN 1 ELSE 0 END) AS SUCCESS
	,SUM( CASE WHEN JOB_STATUS='Error' THEN 1 ELSE 0 END) AS ERROR
	,SUM( CASE WHEN JOB_STATUS='Running' THEN 1 ELSE 0 END) AS RUNNING
	,SUM( CASE WHEN JOB_STATUS='Killed' THEN 1 ELSE 0 END) AS KILLED
	,COUNT(1) AS TOTAL_JOBS
FROM BASE
GROUP BY LSF_WORKFLOW_RUN_ID,  WORKFLOW_LEVEL_5, RUN_DATE_TIME	
)
SELECT 
	LSF_WORKFLOW_RUN_ID,
	CAST(WORKFLOW_LEVEL AS NUMBER(10,0)) WORKFLOW_LEVEL,
	WORKFLOW,
	RUN_DATE_TIME,
	WORKFLOW_START_TIME,
	CASE WHEN PENDING=0 AND RUNNING =0 THEN WORKFLOW_END_TIME ELSE NULL END WORKFLOW_END_TIME,
	CASE WHEN PENDING!=0 OR RUNNING !=0 THEN 'Running'
	WHEN UNSCHEDULED = TOTAL_JOBS THEN 'Unscheduled'
	WHEN "ERROR" = 0 AND KILLED=0 THEN 'Success'
	ELSE 'Error' END AS WORKFLOW_STATUS,
	CAST(UNSCHEDULED AS NUMBER(10,0)) UNSCHEDULED,
	CAST(PENDING AS NUMBER(10,0)) PENDING,
	CAST(SUCCESS AS NUMBER(10,0)) SUCCESS,
	CAST(ERROR AS NUMBER(10,0)) ERROR,
	CAST(RUNNING AS NUMBER(10,0)) RUNNING,
	CAST(KILLED AS NUMBER(10,0)) KILLED,
	CAST(TOTAL_JOBS AS NUMBER(10,0)) TOTAL_JOBS
FROM STATS
WHERE WORKFLOW IS NOT NULL;

  CREATE OR REPLACE FORCE EDITIONABLE VIEW "LCF"."V_WORKFLOW_STATUS" 
  AS
  WITH BASE AS
(
	SELECT *
	FROM 
	(
		SELECT 
			wjr.*,
			RANK() over (PARTITION BY LSF_WORKFLOW_RUN_ID,JOB_NAME,
					CASE WHEN UPPER( JOB_NAME ) LIKE  '%_LOOP_%'  THEN OBJECT_NAME ELSE '-' END 
				ORDER BY LSF_OBJECT_PRG_ID DESC,JOB_START_TIME DESC) RNK
		FROM WORKFLOW_JOB_RUN wjr
	--	WHERE TRUNC(SYSDATE) - TRUNC(CAST(RUN_DATE_TIME  AS DATE)) <= 10
	) ranked
	WHERE RNK = 1
),
STATS AS
(
SELECT LSF_WORKFLOW_RUN_ID, 1 AS WORKFLOW_LEVEL, WORKFLOW_LEVEL_1 AS WORKFLOW, RUN_DATE_TIME
	,MIN(JOB_START_TIME) AS WORKFLOW_START_TIME
	,MAX(JOB_END_TIME) AS WORKFLOW_END_TIME
	,SUM( CASE WHEN JOB_STATUS='Unscheduled' THEN 1 ELSE 0 END) AS UNSCHEDULED
	,SUM( CASE WHEN JOB_STATUS='Pending' THEN 1 ELSE 0 END) AS PENDING
	,SUM( CASE WHEN JOB_STATUS='Success' THEN 1 ELSE 0 END) AS SUCCESS
	,SUM( CASE WHEN JOB_STATUS='Error' THEN 1 ELSE 0 END) AS ERROR
	,SUM( CASE WHEN JOB_STATUS='Running' THEN 1 ELSE 0 END) AS RUNNING
	,SUM( CASE WHEN JOB_STATUS='Killed' THEN 1 ELSE 0 END) AS KILLED
	,COUNT(1) AS TOTAL_JOBS
FROM BASE
GROUP BY LSF_WORKFLOW_RUN_ID,  WORKFLOW_LEVEL_1, RUN_DATE_TIME
UNION all
SELECT LSF_WORKFLOW_RUN_ID, 2 AS WORKFLOW_LEVEL, WORKFLOW_LEVEL_2 AS WORKFLOW, RUN_DATE_TIME 
	,MIN(JOB_START_TIME) AS WORKFLOW_START_TIME
	,MAX(JOB_END_TIME) AS WORKFLOW_END_TIME
	,SUM( CASE WHEN JOB_STATUS='Unscheduled' THEN 1 ELSE 0 END) AS UNSCHEDULED
	,SUM( CASE WHEN JOB_STATUS='Pending' THEN 1 ELSE 0 END) AS PENDING
	,SUM( CASE WHEN JOB_STATUS='Success' THEN 1 ELSE 0 END) AS SUCCESS
	,SUM( CASE WHEN JOB_STATUS='Error' THEN 1 ELSE 0 END) AS ERROR
	,SUM( CASE WHEN JOB_STATUS='Running' THEN 1 ELSE 0 END) AS RUNNING
	,SUM( CASE WHEN JOB_STATUS='Killed' THEN 1 ELSE 0 END) AS KILLED
	,COUNT(1) AS TOTAL_JOBS
FROM BASE
GROUP BY LSF_WORKFLOW_RUN_ID,  WORKFLOW_LEVEL_2, RUN_DATE_TIME
UNION all
SELECT LSF_WORKFLOW_RUN_ID, 3 AS WORKFLOW_LEVEL, WORKFLOW_LEVEL_3 AS WORKFLOW, RUN_DATE_TIME 
	,MIN(JOB_START_TIME) AS WORKFLOW_START_TIME
	,MAX(JOB_END_TIME) AS WORKFLOW_END_TIME
	,SUM( CASE WHEN JOB_STATUS='Unscheduled' THEN 1 ELSE 0 END) AS UNSCHEDULED
	,SUM( CASE WHEN JOB_STATUS='Pending' THEN 1 ELSE 0 END) AS PENDING
	,SUM( CASE WHEN JOB_STATUS='Success' THEN 1 ELSE 0 END) AS SUCCESS
	,SUM( CASE WHEN JOB_STATUS='Error' THEN 1 ELSE 0 END) AS ERROR
	,SUM( CASE WHEN JOB_STATUS='Running' THEN 1 ELSE 0 END) AS RUNNING
	,SUM( CASE WHEN JOB_STATUS='Killed' THEN 1 ELSE 0 END) AS KILLED
	,COUNT(1) AS TOTAL_JOBS
FROM BASE
GROUP BY LSF_WORKFLOW_RUN_ID,  WORKFLOW_LEVEL_3, RUN_DATE_TIME
UNION all
SELECT LSF_WORKFLOW_RUN_ID, 4 AS WORKFLOW_LEVEL, WORKFLOW_LEVEL_4 AS WORKFLOW, RUN_DATE_TIME 
	,MIN(JOB_START_TIME) AS WORKFLOW_START_TIME
	,MAX(JOB_END_TIME) AS WORKFLOW_END_TIME
	,SUM( CASE WHEN JOB_STATUS='Unscheduled' THEN 1 ELSE 0 END) AS UNSCHEDULED
	,SUM( CASE WHEN JOB_STATUS='Pending' THEN 1 ELSE 0 END) AS PENDING
	,SUM( CASE WHEN JOB_STATUS='Success' THEN 1 ELSE 0 END) AS SUCCESS
	,SUM( CASE WHEN JOB_STATUS='Error' THEN 1 ELSE 0 END) AS ERROR
	,SUM( CASE WHEN JOB_STATUS='Running' THEN 1 ELSE 0 END) AS RUNNING
	,SUM( CASE WHEN JOB_STATUS='Killed' THEN 1 ELSE 0 END) AS KILLED
	,COUNT(1) AS TOTAL_JOBS
FROM BASE
GROUP BY LSF_WORKFLOW_RUN_ID,  WORKFLOW_LEVEL_4, RUN_DATE_TIME
UNION all
SELECT LSF_WORKFLOW_RUN_ID, 5 AS WORKFLOW_LEVEL, WORKFLOW_LEVEL_5 AS WORKFLOW, RUN_DATE_TIME 
	,MIN(JOB_START_TIME) AS WORKFLOW_START_TIME
	,MAX(JOB_END_TIME) AS WORKFLOW_END_TIME
	,SUM( CASE WHEN JOB_STATUS='Unscheduled' THEN 1 ELSE 0 END) AS UNSCHEDULED
	,SUM( CASE WHEN JOB_STATUS='Pending' THEN 1 ELSE 0 END) AS PENDING
	,SUM( CASE WHEN JOB_STATUS='Success' THEN 1 ELSE 0 END) AS SUCCESS
	,SUM( CASE WHEN JOB_STATUS='Error' THEN 1 ELSE 0 END) AS ERROR
	,SUM( CASE WHEN JOB_STATUS='Running' THEN 1 ELSE 0 END) AS RUNNING
	,SUM( CASE WHEN JOB_STATUS='Killed' THEN 1 ELSE 0 END) AS KILLED
	,COUNT(1) AS TOTAL_JOBS
FROM BASE
GROUP BY LSF_WORKFLOW_RUN_ID,  WORKFLOW_LEVEL_5, RUN_DATE_TIME	
)
SELECT 
	LSF_WORKFLOW_RUN_ID,
	CAST(WORKFLOW_LEVEL AS NUMBER(10,0)) WORKFLOW_LEVEL,
	WORKFLOW,
	RUN_DATE_TIME,
	WORKFLOW_START_TIME,
	CASE WHEN PENDING=0 AND RUNNING =0 THEN WORKFLOW_END_TIME ELSE NULL END WORKFLOW_END_TIME,
	CASE WHEN PENDING!=0 OR RUNNING !=0 THEN 'Running'
	WHEN UNSCHEDULED = TOTAL_JOBS THEN 'Unscheduled'
	WHEN "ERROR" = 0 AND KILLED=0 THEN 'Success'
	ELSE 'Error' END AS WORKFLOW_STATUS,
	CAST(UNSCHEDULED AS NUMBER(10,0)) UNSCHEDULED,
	CAST(PENDING AS NUMBER(10,0)) PENDING,
	CAST(SUCCESS AS NUMBER(10,0)) SUCCESS,
	CAST(ERROR AS NUMBER(10,0)) ERROR,
	CAST(RUNNING AS NUMBER(10,0)) RUNNING,
	CAST(KILLED AS NUMBER(10,0)) KILLED,
	CAST(TOTAL_JOBS AS NUMBER(10,0)) TOTAL_JOBS
FROM STATS
WHERE WORKFLOW IS NOT NULL;

INSERT INTO LCF.DIP_CONFIG ("KEY",VALUE) VALUES 
('DISABLE_DEPENDENCY_CHK','0')
;

COMMIT;