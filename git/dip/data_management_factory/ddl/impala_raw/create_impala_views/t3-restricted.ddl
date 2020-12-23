CREATE VIEW ${var:view_db}.t3
AS SELECT
z.*
 FROM ${var:source_db}.t3 z;
