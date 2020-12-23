with rd as
(
select trunc(rand()*652730876) rd,k1.*
from k1
)
select concat('select * from k1 ',' where tax_year=',cast(tax_year as string),' and ird_number=',cast(ird_number as string),' and location_number=',cast(location_number as string),' and return_period_date=',chr(39),cast(return_period_date as string),chr(39),' and return_type=',chr(39),return_type,chr(39),' and return_version_no=',cast(return_version_no as string),';')
from rd
where rd<3000
and return_version_no<7777
and liability_code!='88'
;

