create view ${var:view_db}.app_tblcontact
as select 
z.flngcontactkey,
z.flngver,
z.flngverlast,
z.flngcustomerkey,
z.fintprofilenumber,
z.fstrcontacttype,
z.fstrphonetype1,
z.fintcountrycode1,
z.fstrcountry1,
z.fstrareacode1,
z.fstrphonenumber1,
z.fstrextension1,
z.fstrphonetype2,
z.fintcountrycode2,
z.fstrcountry2,
z.fstrareacode2,
z.fstrphonenumber2,
z.fstrextension2,
z.fstrphonetype3,
z.fintcountrycode3,
z.fstrcountry3,
z.fstrareacode3,
z.fstrphonenumber3,
z.fstrextension3,
z.fstrphonetype4,
z.fintcountrycode4,
z.fstrcountry4,
z.fstrareacode4,
z.fstrphonenumber4,
z.fstrextension4,
z.fstrphonetype5,
z.fintcountrycode5,
z.fstrcountry5,
z.fstrareacode5,
z.fstrphonenumber5,
z.fstrextension5,
z.fstrcontactname,
z.fstremail,
z.fstrnote,
z.flngcrmkey,
z.fblnactive,
z.fstrwho,
z.fdtmwhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 from ${var:source_db}.app_tblcontact z
;
