CREATE VIEW ${var:view_db}.dss_client_agents AS
SELECT z.ird_number, z.location_number, z.tax_type, z.date_applied, z.agent_ird_number, z.agent_location_number, z.date_end, z.date_start, z.time_extension, z.withdraw_date, z.`timestamp`, z.date_ceased, z.user_id, z.date_processed, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_client_agents z LEFT OUTER JOIN ${var:source_db}.dss_special_clients_all sc ON CAST(z.ird_number AS INT) = CAST(sc.ird_number AS INT) WHERE nvl(sc.special_classification, 'STD') = 'STD' AND nvl(sc.record_active_flag, 'Y') = 'Y' AND nvl(sc.record_deleted_flag, 'N') = 'N';
