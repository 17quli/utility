CREATE VIEW ${var:view_db}.dss_addresses AS
SELECT z.ird_number, z.location_number, z.tax_type, z.address_type, z.main_address_indicator, z.date_applied, z.address_line_1, z.address_line_2, z.address_line_3, z.post_code, z.mesh_block, z.address_status, z.fulladdress, z.date_ceased, z.`timestamp`, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_addresses z LEFT OUTER JOIN ${var:source_db}.dss_special_clients_all sc ON CAST(z.ird_number AS INT) = CAST(sc.ird_number AS INT) WHERE nvl(sc.special_classification, 'STD') = 'STD' AND nvl(sc.record_active_flag, 'Y') = 'Y' AND nvl(sc.record_deleted_flag, 'N') = 'N';
