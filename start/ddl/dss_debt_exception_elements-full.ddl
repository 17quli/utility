CREATE VIEW ${var:view_db}.dss_debt_exception_elements AS
SELECT z.YEAR_MONTH, z.EXCEPTION_TYPE, z.IRD_NUMBER, z.LOCATION_NUMBER, z.CASE_TYPE_CODE, z.CASE_NUMBER, z.CASE_KEY, z.TAX_TYPE, z.RETURN_PERIOD_DATE, z.ELEMENT_BALANCE, z.ENTERED_DATE, z.ENTERED_BY, z.insert_object_run_key FROM ${var:source_db}.dss_debt_exception_elements z;
