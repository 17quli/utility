CREATE  VIEW ${var:view_db}.dss_cs_eligible_children
AS SELECT
z.RELATIONSHIP_NUMBER,
z.CP_IRD_NUMBER,
z.NCP_IRD_NUMBER,
z.CHILD_IRD_NUMBER,
z.DATE_OF_BIRTH,
z.FIRST_NAMES,
z.LAST_NAME,
z.DATE_START,
z.CS_PARENTHOOD_PROOF_CODE,
z.SHARED_CUSTODY_INDICATOR,
z.CS_CHILD_END_REASON_CODE,
z.DATE_END,
z.DELETED_INDICATOR,
z.DATE_APPLIED,
z.DATE_CEASED,
z.`TIMESTAMP`,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
FROM ${var:source_db}.dss_cs_eligible_children z
left OUTER JOIN
 ${var:source_db}.dss_special_clients_all  sc1 
 on CAST(sc1.IRD_NUMBER AS INT) = CAST(z.NCP_IRD_NUMBER AS INT) 
left outer join
${var:source_db}.dss_special_clients_all    sc2 
 on CAST(sc2.IRD_NUMBER AS INT) = CAST(z.CP_IRD_NUMBER AS INT) 
left outer join
 ${var:source_db}.dss_special_clients_all   sc3 
 on CAST(sc3.IRD_NUMBER AS INT) = CAST(z.CHILD_IRD_NUMBER AS INT)
 
WHERE
nvl(sc1.special_classification, 'STD') = 'STD' and 
nvl(sc2.special_classification, 'STD') = 'STD'  and
nvl(sc3.special_classification, 'STD') = 'STD'  and
nvl(sc1.record_active_flag, 'Y') = 'Y' and
nvl(sc2.record_active_flag, 'Y') = 'Y' and
nvl(sc3.record_active_flag, 'Y') = 'Y' and
nvl(sc1.record_deleted_flag, 'N') = 'N' and
nvl(sc2.record_deleted_flag, 'N') = 'N' and
nvl(sc3.record_deleted_flag, 'N') = 'N' ;
