CREATE VIEW ${var:view_db}.dss_spk2ir_bio_enrol_snapshot AS
SELECT z.SNAPSHOT_DATE, z.NUMBER_FULLY_ENROLLED, z.NUMBER_PARTIALLY_ENROLLED, z.NUMBER_PENDING, z.RUN_ID, z.EDW_LOAD_DATE, z.insert_object_run_key FROM ${var:source_db}.dss_spk2ir_bio_enrol_snapshot z;
