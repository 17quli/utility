with rd as
(
select trunc(rand()*325365438) rd,p1.*
from p1
)
select concat('insert into p1 partition(tax_year) values(',
'8888,8888,',chr(39),'2018-01-28 00:00:00',chr(39),', cast(',chr(39),'8888',chr(39),' as varchar(10)),8888,',
 cast(nvl(form_version_no,0) as string),',cast(',
 chr(39),nvl(return_category,''),chr(39),' as varchar(2)),cast(',
 chr(39),nvl(return_source,''),chr(39),' as varchar(2)),',
 chr(39),cast(nvl(date_processed,'1900-01-01') as string),chr(39),',',
 chr(39),cast(nvl(date_returned,'1900-01-01') as string),chr(39),',cast(',
 chr(39),nvl(accompanying_payment,''),chr(39),' as varchar(2)),cast(',
 chr(39),nvl(responsible_officer,''),chr(39),' as varchar(16)),cast(',
 chr(39),nvl(return_status,''),chr(39),' as varchar(2)),cast(',
 chr(39),nvl(liability_code,''),chr(39),' as varchar(4)),cast(',
 chr(39),nvl(return_form_error_code,''),chr(39),' as varchar(8)),cast(',
 chr(39),nvl(return_error_code,''),chr(39),' as varchar(2)),',
 chr(39),cast(nvl(`timestamp`,'1900-01-01') as string),chr(39),',',
 chr(39),cast(nvl(record_effective_timestamp,'1900-01-01') as string),chr(39),',',
 chr(39),cast(nvl(record_expiry_timestamp,'1900-01-01') as string),chr(39),',cast(',
 chr(39),nvl(record_active_flag,''),chr(39),' as varchar(1)),cast(',
 chr(39),nvl(record_deleted_flag,''),chr(39),' as varchar(1)),',
 cast(nvl(insert_object_run_key,0) as string),',',
 cast(nvl(update_object_run_key,0) as string),',cast(',
 chr(39),cast (row_number() over (order by rd) as string),chr(39),' as varchar(8)));'
 )
from rd
where rd<20000 
;

