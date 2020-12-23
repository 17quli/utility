CREATE TABLE ${var:target_db}.dss_returns_keypoints_fs1 (
IRD_NUMBER INT,
LOCATION_NUMBER INT,
RETURN_PERIOD_DATE TIMESTAMP,
RETURN_TYPE VARCHAR(10),
RETURN_VERSION_NO INT,
RETURN_STATUS VARCHAR(2),
FORM_VERSION_NO INT,
NUMBER_OF_ERROR_ITEMS INT,
`TIMESTAMP` TIMESTAMP,
ABATEMENT_INDICATOR_934 VARCHAR(2),
ACC_GRACE_IND_994 VARCHAR(2),
ACC_GRACE_PERIOD_DATE_993 TIMESTAMP,
APPLICATION_START_DATE_906 TIMESTAMP,
BUSN_PTRSHP_SE_INC_PTR_100451 DECIMAL(16,2),
BUS_PTRSHP_SE_INC_100434 DECIMAL(16,2),
CHILD_10_CERT_ATTACHED_IND_973 VARCHAR(2),
CHILD_10_DATE_OF_BIRTH_933 TIMESTAMP,
CHILD_10_EXPECT_STOP_DATE_962 TIMESTAMP,
CHILD_10_GRACE_PERIOD_DATE_983 TIMESTAMP,
CHILD_1_CERT_ATTACHED_IND_964 VARCHAR(2),
CHILD_1_DATE_OF_BIRTH_924 TIMESTAMP,
CHILD_1_GRACE_PERIOD_DATE_974 TIMESTAMP,
CHILD_2_CERT_ATTACHED_IND_965 VARCHAR(2),
CHILD_2_DATE_OF_BIRTH_925 TIMESTAMP,
CHILD_2_GRACE_PERIOD_DATE_975 TIMESTAMP,
CHILD_3_CERT_ATTACHED_IND_966 VARCHAR(2),
CHILD_3_DATE_OF_BIRTH_926 TIMESTAMP,
CHILD_3_GRACE_PERIOD_DATE_976 TIMESTAMP,
CHILD_4_CERT_ATTACHED_IND_967 VARCHAR(2),
CHILD_4_DATE_OF_BIRTH_927 TIMESTAMP,
CHILD_4_GRACE_PERIOD_DATE_977 TIMESTAMP,
CHILD_5_CERT_ATTACHED_IND_968 VARCHAR(2),
CHILD_5_DATE_OF_BIRTH_928 TIMESTAMP,
CHILD_5_GRACE_PERIOD_DATE_978 TIMESTAMP,
CHILD_6_CERT_ATTACHED_IND_969 VARCHAR(2),
CHILD_6_DATE_OF_BIRTH_929 TIMESTAMP,
CHILD_6_GRACE_PERIOD_DATE_979 TIMESTAMP,
CHILD_7_CERT_ATTACHED_IND_970 VARCHAR(2),
CHILD_7_DATE_OF_BIRTH_930 TIMESTAMP,
CHILD_7_GRACE_PERIOD_DATE_980 TIMESTAMP,
CHILD_8_CERT_ATTACHED_IND_971 VARCHAR(2),
CHILD_8_DATE_OF_BIRTH_931 TIMESTAMP,
CHILD_8_EXPECT_STOP_DATE_960 TIMESTAMP,
CHILD_8_GRACE_PERIOD_DATE_981 TIMESTAMP,
CHILD_9_CERT_ATTACHED_IND_972 VARCHAR(2),
CHILD_9_DATE_OF_BIRTH_932 TIMESTAMP,
CHILD_9_EXPECT_STOP_DATE_961 TIMESTAMP,
CHILD_9_GRACE_PERIOD_DATE_982 TIMESTAMP,
CHILD_MAINTENANCE_PAID_903 DECIMAL(16,2),
CHILD_MAINT_PAID_PARTNER_905 DECIMAL(16,2),
CHILD_SUPPORT_PMNTS_100432 DECIMAL(16,2),
CHILD_SUPPORT_PMNTS_PTR_100449 DECIMAL(16,2),
CUSTODY_PROPORTION_10_100417 INT,
CUSTODY_PROPORTION_1_100408 INT,
CUSTODY_PROPORTION_2_100409 INT,
CUSTODY_PROPORTION_3_100410 INT,
CUSTODY_PROPORTION_4_100411 INT,
CUSTODY_PROPORTION_5_100412 INT,
CUSTODY_PROPORTION_6_100413 INT,
CUSTODY_PROPORTION_7_100414 INT,
CUSTODY_PROPORTION_8_100415 INT,
CUSTODY_PROPORTION_9_100416 INT,
DSW_DOUBLE_DIPPING_IND_984 VARCHAR(2),
ELIGIBLE_PER_STOP_DATE_1_907 TIMESTAMP,
ELIGIBLE_PER_STOP_DATE_2_911 TIMESTAMP,
ELIGIBLE_PER_STOP_DATE_3_915 TIMESTAMP,
ELIGIBLE_PER_STOP_DATE_4_919 TIMESTAMP,
ELIG_PRD_STOP5_985 TIMESTAMP,
ELIG_PRD_STOP6_989 TIMESTAMP,
EST_OF_HOURS_WORKED_100454 INT,
EST_OF_HOURS_WORKED_PTN_100455 INT,
FSTC_LAST_PAYMENT_902 TIMESTAMP,
GMFI_BANK_ACCT_NO_100457 INT,
GMFI_BANK_ACCT_SF_100458 INT,
GMFI_BANK_BRANCH_100456 INT,
GMFI_BANK_ID_118 INT,
GRACE_PERIOD_DATES_IND_963 VARCHAR(2),
IFTC_DAY_ENT1_995 DECIMAL(16,2),
IFTC_DAY_ENT2_996 DECIMAL(16,2),
IFTC_DAY_ENT3_997 DECIMAL(16,2),
IFTC_DAY_ENT4_998 DECIMAL(16,2),
IFTC_DAY_ENT5_999 DECIMAL(16,2),
IFTC_DAY_ENT6_1000 DECIMAL(16,2),
IFTC_INDICATOR_100453 VARCHAR(2),
INCOME_FROM_ACC_100423 DECIMAL(16,2),
INCOME_FROM_ACC_PTR_100440 DECIMAL(16,2),
INCOME_TESTED_BENEFITS_100420 DECIMAL(16,2),
INC_FROM_STUD_ALLCE_100426 DECIMAL(16,2),
INC_STUD_ALLCE_PTR_100443 DECIMAL(16,2),
INC_TESTED_BENEFITS_PTR_100437 DECIMAL(16,2),
INC_TESTED_BEN_START_100421 TIMESTAMP,
INC_TESTED_BEN_STOP_DT_100422 TIMESTAMP,
INC_TEST_BEN_START_PTR_100438 TIMESTAMP,
INC_TEST_BEN_STOP_PTR_100439 TIMESTAMP,
INT_DIV_RENT_100433 DECIMAL(16,2),
INT_DIV_RENT_PTR_100450 DECIMAL(16,2),
NZS_VET_PENSION_100429 DECIMAL(16,2),
NZS_VET_PENSION_PTR_100446 DECIMAL(16,2),
NZS_VET_PENS_STOP_100431 TIMESTAMP,
NZS_VET_PENS_STOP_PTR_100448 TIMESTAMP,
NZS_VET_PENS_STRT_100430 TIMESTAMP,
NZS_VET_PENS_STRT_PTR_100447 TIMESTAMP,
OTHER_INCOME_100435 DECIMAL(16,2),
OTHER_INCOME_PARTNER_100452 DECIMAL(16,2),
PARTNER_DAILY_GMFI_1_910 DECIMAL(16,2),
PARTNER_DAILY_GMFI_2_914 DECIMAL(16,2),
PARTNER_DAILY_GMFI_3_918 DECIMAL(16,2),
PARTNER_DAILY_GMFI_4_922 DECIMAL(16,2),
PARTNER_FLAG_100407 VARCHAR(2),
PARTNER_IRD_NUMBER_901 INT,
PCC_DAY_FSTC5_986 DECIMAL(16,2),
PCC_DAY_FSTC6_990 DECIMAL(16,2),
PCC_DAY_GMFI5_987 DECIMAL(16,2),
PCC_DAY_GMFI6_991 DECIMAL(16,2),
PCC_STOP_DATE_CHILD_1_940 TIMESTAMP,
PCC_STOP_DATE_CHILD_2_942 TIMESTAMP,
PCC_STOP_DATE_CHILD_3_944 TIMESTAMP,
PCC_STOP_DATE_CHILD_4_946 TIMESTAMP,
PCC_STOP_DATE_CHILD_5_948 TIMESTAMP,
PCC_STOP_DATE_CHILD_6_950 TIMESTAMP,
PCC_STOP_DATE_CHILD_7_952 TIMESTAMP,
PRIME_DAILY_FSTC_1_908 DECIMAL(16,2),
PRIME_DAILY_FSTC_2_912 DECIMAL(16,2),
PRIME_DAILY_FSTC_3_916 DECIMAL(16,2),
PRIME_DAILY_FSTC_4_920 DECIMAL(16,2),
PRIME_DAILY_GMFI_1_909 DECIMAL(16,2),
PRIME_DAILY_GMFI_2_913 DECIMAL(16,2),
PRIME_DAILY_GMFI_3_917 DECIMAL(16,2),
PRIME_DAILY_GMFI_4_921 DECIMAL(16,2),
PTR_DAY_GMFI5_988 DECIMAL(16,2),
PTR_DAY_GMFI6_992 DECIMAL(16,2),
SALARY_AND_WAGES_100419 DECIMAL(16,2),
SALARY_AND_WAGES_PTR_100436 DECIMAL(16,2),
SHARED_CUSTODY_100418 VARCHAR(2),
STUD_ALLCE_PTR_STOP_100445 TIMESTAMP,
STUD_ALLCE_PTR_STRT_100444 TIMESTAMP,
STUD_ALLCE_STOP_100428 TIMESTAMP,
STUD_ALLCE_STRT_100427 TIMESTAMP,
TOTAL_CHILDREN_IN_CARE_936 INT,
TOTAL_INCOME_935 DECIMAL(16,2),
TOTAL_INCOME_PARTNER_904 DECIMAL(16,2),
TOTAL_NO_ELIGIBLE_PERIODS_923 INT,
CHILD10_DECEASED_INDCATOR_1371 VARCHAR(2),
CHILD1_DECEASED_INDICATOR_1362 VARCHAR(2),
CHILD2_DECEASED_INDICATOR_1363 VARCHAR(2),
CHILD3_DECEASED_INDICATOR_1364 VARCHAR(2),
CHILD4_DECEASED_INDICATOR_1365 VARCHAR(2),
CHILD5_DECEASED_INDICATOR_1366 VARCHAR(2),
CHILD6_DECEASED_INDICATOR_1367 VARCHAR(2),
CHILD7_DECEASED_INDICATOR_1368 VARCHAR(2),
CHILD8_DECEASED_INDICATOR_1369 VARCHAR(2),
CHILD9_DECEASED_INDICATOR_1370 VARCHAR(2),
CHILD_10_IRD_NUMBER_879 INT,
CHILD_10_START_DATE_1361 TIMESTAMP,
CHILD_1_IRD_NUMBER_870 INT,
CHILD_1_START_DATE_1352 TIMESTAMP,
CHILD_2_IRD_NUMBER_871 INT,
CHILD_2_START_DATE_1353 TIMESTAMP,
CHILD_3_IRD_NUMBER_872 INT,
CHILD_3_START_DATE_1354 TIMESTAMP,
CHILD_4_IRD_NUMBER_873 INT,
CHILD_4_START_DATE_1355 TIMESTAMP,
CHILD_5_IRD_NUMBER_874 INT,
CHILD_5_START_DATE_1356 TIMESTAMP,
CHILD_6_IRD_NUMBER_875 INT,
CHILD_6_START_DATE_1357 TIMESTAMP,
CHILD_7_IRD_NUMBER_876 INT,
CHILD_7_START_DATE_1358 TIMESTAMP,
CHILD_8_IRD_NUMBER_877 INT,
CHILD_8_START_DATE_1359 TIMESTAMP,
CHILD_9_IRD_NUMBER_878 INT,
CHILD_9_START_DATE_1360 TIMESTAMP,
CHLD10_FNL_PTC_INSTLMT_DT_1381 TIMESTAMP,
CHLD1_FINL_PTC_INSTLMT_DT_1372 TIMESTAMP,
CHLD2_FINL_PTC_INSTLMT_DT_1373 TIMESTAMP,
CHLD3_FINL_PTC_INSTLMT_DT_1374 TIMESTAMP,
CHLD4_FINL_PTC_INSTLMT_DT_1375 TIMESTAMP,
CHLD5_FINL_PTC_INSTLMT_DT_1376 TIMESTAMP,
CHLD6_FINL_PTC_INSTLMT_DT_1377 TIMESTAMP,
CHLD7_FINL_PTC_INSTLMT_DT_1378 TIMESTAMP,
CHLD8_FINL_PTC_INSTLMT_DT_1379 TIMESTAMP,
CHLD9_FINL_PTC_INSTLMT_DT_1380 TIMESTAMP,
FRONT_OR_BACK_END_PAYMENT_1351 VARCHAR(2),
LODGMT_DATE_OF_PTC_APPN_1350 TIMESTAMP,
PTC_DAILY_ENTITLEMENT1_1382 DECIMAL(16,2),
PTC_DAILY_ENTITLEMENT2_1383 DECIMAL(16,2),
PTC_DAILY_ENTITLEMENT3_1384 DECIMAL(16,2),
PTC_DAILY_ENTITLEMENT4_1385 DECIMAL(16,2),
PTC_DAILY_ENTITLEMENT5_1386 DECIMAL(16,2),
PTC_DAILY_ENTITLEMENT6_1387 DECIMAL(16,2),
ACC_RECD_THRU_EMPLOYER_1479 VARCHAR(2),
ACC_RECD_THRU_EMPLYER_PTR_1492 VARCHAR(2),
BURSARY_SCHOLARSHIP_RECVD_1507 DECIMAL(16,2),
BURSRY_SCHOLRSHP_RECD_PTR_1508 DECIMAL(16,2),
CHGE_OF_DETAILS_SQUARE_UP_1512 VARCHAR(2),
CHILD_BACK_END_GRACE_DT_1_1497 TIMESTAMP,
CHILD_BACK_END_GRACE_DT_2_1498 TIMESTAMP,
CHILD_BACK_END_GRACE_DT_3_1499 TIMESTAMP,
CHILD_BACK_END_GRACE_DT_4_1500 TIMESTAMP,
CHILD_BACK_END_GRACE_DT_5_1501 TIMESTAMP,
CHILD_BACK_END_GRACE_DT_6_1502 TIMESTAMP,
CHILD_BACK_END_GRACE_DT_7_1503 TIMESTAMP,
CHILD_BACK_END_GRACE_DT_8_1504 TIMESTAMP,
CHILD_BACK_END_GRACE_DT_9_1505 TIMESTAMP,
CHILD_MAINTENANCE_PAID_1483 DECIMAL(16,2),
CHILD_MAINTENANCE_PD_PTR_1496 DECIMAL(16,2),
CHILD_MAINTENANCE_RECEIVD_1481 DECIMAL(16,2),
CHILD_MAINTNCE_RECVD_PTR_1494 DECIMAL(16,2),
CHILD_SUPPORT_PAID_1482 DECIMAL(16,2),
CHILD_SUPPORT_PAID_PTR_1495 DECIMAL(16,2),
CHILD_SUPPORT_RECEIVD_PTR_1493 DECIMAL(16,2),
CHILD_SUPPORT_RECEIVED_1480 DECIMAL(16,2),
CHLD_BACK_END_GRACE_DT_10_1506 TIMESTAMP,
DATE_OF_ARRIVAL_1471 TIMESTAMP,
ESTIMATE_OF_HOURS_WORKED_1461 INT,
ESTIMATE_OF_WEEKS_WORKED_1509 INT,
ESTMT_OF_WEEKS_WORKED_PTN_1510 INT,
EST_OF_HOURS_WORKED_PTN_1462 INT,
FAMLY_ASSISTNCE_SQUARE_UP_1511 VARCHAR(2),
INC_FROM_ACC_PTR_START1_100441 TIMESTAMP,
INC_FROM_ACC_PTR_START2_1531 TIMESTAMP,
INC_FROM_ACC_PTR_START3_1532 TIMESTAMP,
INC_FROM_ACC_PTR_START4_1533 TIMESTAMP,
INC_FROM_ACC_PTR_START5_1534 TIMESTAMP,
INC_FROM_ACC_PTR_STOP1_100442 TIMESTAMP,
INC_FROM_ACC_PTR_STOP2_1535 TIMESTAMP,
INC_FROM_ACC_PTR_STOP3_1536 TIMESTAMP,
INC_FROM_ACC_PTR_STOP4_1537 TIMESTAMP,
INC_FROM_ACC_PTR_STOP5_1538 TIMESTAMP,
INC_FROM_ACC_START_DT_1_100424 TIMESTAMP,
INC_FROM_ACC_START_DT_2_1521 TIMESTAMP,
INC_FROM_ACC_START_DT_3_1522 TIMESTAMP,
INC_FROM_ACC_START_DT_4_1523 TIMESTAMP,
INC_FROM_ACC_START_DT_5_1524 TIMESTAMP,
INC_FROM_ACC_STOP_DT_1_100425 TIMESTAMP,
INC_FROM_ACC_STOP_DT_2_1525 TIMESTAMP,
INC_FROM_ACC_STOP_DT_3_1526 TIMESTAMP,
INC_FROM_ACC_STOP_DT_4_1527 TIMESTAMP,
INC_FROM_ACC_STOP_DT_5_1528 TIMESTAMP,
INTEREST_DIVIDENDS_RENT_1414 DECIMAL(16,2),
INTREST_DIVDENDS_RENT_PTR_1417 DECIMAL(16,2),
NBR_WINZ_PERIODS_PTR_100521 INT,
TOTAL_NBR_ACC_PERIODS_PTR_1530 INT,
TOTAL_NBR_WINZ_PERIODS_100520 INT,
TOTAL_NMBR_OF_ACC_PERIODS_1529 INT,
WINZ_INCOME_1472 DECIMAL(16,2),
WINZ_INCOME_PTR_1484 DECIMAL(16,2),
WINZ_INCOME_START_DATE_1_1473 TIMESTAMP,
WINZ_INCOME_START_DATE_2_1474 TIMESTAMP,
WINZ_INCOME_START_DATE_3_1475 TIMESTAMP,
WINZ_INCOME_STOP_DATE_1_1476 TIMESTAMP,
WINZ_INCOME_STOP_DATE_2_1477 TIMESTAMP,
WINZ_INCOME_STOP_DATE_3_1478 TIMESTAMP,
WINZ_INC_START_DTE_1_PTR_1485 TIMESTAMP,
WINZ_INC_START_DTE_2_PTR_1486 TIMESTAMP,
WINZ_INC_START_DTE_3_PTR_1487 TIMESTAMP,
WINZ_INC_STOP_DATE_2_PTR_1490 TIMESTAMP,
WINZ_INC_STOP_DATE_3_PTR_1491 TIMESTAMP,
WINZ_INC_STOP_DTE_1_PTR_1489 TIMESTAMP,
PNR_RELATIONSHIP_ST_DT_1541 TIMESTAMP,
ROLLOVER_ERROR_TYPE_1543 INT,
ROLLOVER_INDICATOR_1542 VARCHAR(14),
FAMILY_TOTAL_WKS_WORKED_100570 INT,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;