CREATE VIEW ${var:view_db}.t1
AS SELECT
z.*
 FROM ${var:source_db}.t1 z;
