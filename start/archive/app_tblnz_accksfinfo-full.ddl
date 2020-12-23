CREATE VIEW ${var:view_db}.app_tblnz_accksfinfo
AS SELECT
z.`flngDocKey`,
z.`fstrSchemeType`,
z.`fstrWebsite`,
z.`fstr0800Number`,
z.`fblnCheckDefault`,
z.`fblnCheckRestricted`,
z.`fblnCheckWebsite`,
z.`fstrInvestmentProduct`,
z.`fstrTradingPartner`,
z.`fstrB2BType`,
z.`flngB2BBatchSize`,
z.`fblnThrottle`,
z.`flngThrottle`,
z.`fblnStopRefunds`,
z.`fblnStopAllMessages`, z.fstrWho, z.fdtmWhen, z.record_effective_timestamp, z.record_expiry_timestamp,
 z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key 
FROM ${var:source_db}.app_tblnz_accksfinfo z LEFT OUTER JOIN ${var:source_db}.app_tblaccount ac 
ON z.flngDocKey = ac.flngDocKey LEFT OUTER JOIN ${var:source_db}.app_tblcustomerinfo cl 
ON ac.flngcustomerkey = cl.flngcustomerkey WHERE nvl(ac.record_active_flag, 'Y') = 'Y' 
AND nvl(ac.record_deleted_flag, 'N') = 'N' AND nvl(cl.fstrcustomerlevel, 'STD') != 'SPCAD2' 
AND nvl(cl.record_active_flag, 'Y') = 'Y' AND nvl(cl.record_deleted_flag, 'N') = 'N';
