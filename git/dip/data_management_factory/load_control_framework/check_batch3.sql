

select * 
from object where lower(source_object_name) in 
('tblcollect',
'tblcollectperiod',
'tblcollectpaymentplan',
'tbllead',
'tblperiodbillitem',
'tblperiod',
'tblnz_accountstd',
'tblnz_campaign',
'tblnz_instalmentagmtdefault',
'tblprofile',
'tblfrdrules',
'tblfrdruleresult',
'case_actions',
'cases',
'cross_references',
'elements',
'policing_profiles',
'tax_csa',
'cm_audit_cases')


