select count(1) from app_tbladdressrecord;
create table app_tbladdressrecord_t like prod_jnl.app_tbladdressrecord;

insert into app_tbladdressrecord_t
(
fi64addresskey          ,
flngver                 ,
flngverlast             ,
fdtmeffectivefrom       ,
fdtmeffectiveto         ,
fdtmsystemfrom          ,
fdtmsystemto            ,
fstrsource              ,
flngcustomerkey         ,
fintprofilenumber       ,
fi64sourcekey           ,
fstraddresstype         ,
fstrstreet              ,
fstrstreet2             ,
fstrunit                ,
fstrunittype            ,
fstrcity                ,
fstrcounty              ,
fstrstate               ,
fstrzip                 ,
fstrcountry             ,
fstrattention           ,
fstrurbanization        ,
fstrdistrictoffice      ,
fstrlocationcode        ,
fstrmunicipality        ,
fstrdistrict            ,
fstrsubdistrict         ,
fstrsubprovince         ,
fstraddressdescription  ,
fintaddressclass        ,
fblnverified            ,
fdtmverified            ,
fstrrowid               ,
fstrlistformataddress   ,
fulladdress             ,
fi64protecteddatasource ,
flngcrmkey              ,
fblnblank               ,
fblncurrent             ,
fblnactive              ,
fintprotectlevel        ,
fstrwho                 ,
fdtmwhen                ,
batch_key               
)
select 
fi64addresskey          ,
flngver                 ,
flngverlast             ,
fdtmeffectivefrom       ,
fdtmeffectiveto         ,
fdtmsystemfrom          ,
fdtmsystemto            ,
fstrsource              ,
flngcustomerkey         ,
fintprofilenumber       ,
fi64sourcekey           ,
fstraddresstype         ,
fstrstreet              ,
fstrstreet2             ,
fstrunit                ,
fstrunittype            ,
fstrcity                ,
fstrcounty              ,
fstrstate               ,
fstrzip                 ,
fstrcountry             ,
fstrattention           ,
fstrurbanization        ,
fstrdistrictoffice      ,
fstrlocationcode        ,
fstrmunicipality        ,
fstrdistrict            ,
fstrsubdistrict         ,
fstrsubprovince         ,
fstraddressdescription  ,
fintaddressclass        ,
fblnverified            ,
fdtmverified            ,
fstrrowid               ,
fstrlistformataddress   ,
cast(replace(fulladdress,'ß', 'SS') as varchar(510)),
fi64protecteddatasource ,
flngcrmkey              ,
fblnblank               ,
fblncurrent             ,
fblnactive              ,
fintprotectlevel        ,
fstrwho                 ,
fdtmwhen                ,
batch_key
from prod_jnl.app_tbladdressrecord
;

drop table if exists app_tbladdressrecord;

alter table app_tbladdressrecord_t rename to app_tbladdressrecord;
select count(1) from app_tbladdressrecord;
