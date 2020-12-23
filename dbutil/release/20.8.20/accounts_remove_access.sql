USE prod_refined_full_access;

DROP VIEW IF EXISTS account_dim;
DROP VIEW IF EXISTS account_gst_dim;
DROP VIEW IF EXISTS account_inc_dim;
DROP VIEW IF EXISTS account_pay_dim;
DROP VIEW IF EXISTS account_pie_dim;
DROP VIEW IF EXISTS party_account_rel;

USE prod_refined_restricted_access;

DROP VIEW IF EXISTS account_dim;
DROP VIEW IF EXISTS account_gst_dim;
DROP VIEW IF EXISTS account_inc_dim;
DROP VIEW IF EXISTS account_pay_dim;
DROP VIEW IF EXISTS account_pie_dim;
DROP VIEW IF EXISTS party_account_rel;


SELECT '\n\n***************************************\n** DDL Script Completed Successfully **\n***************************************'
