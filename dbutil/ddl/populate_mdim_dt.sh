#!/bin/bash
dt=`date -I -d 18000101`
key=1
y=1800
while [ $y -le 9000 ]
do
        q=`date -d "$dt" +%m`
        let q=q+4
        q=`echo "$q"/4|bc`
        m=`date -d "$dt" +%m`
        d=`date -d "$dt" +%d`
        sql="insert into dev_raw.mdim_dt values ($key,'$dt',$y,$q,$m,$d)"
        ./run_sql.sh "$sql"
#       echo "$key $dt $y $q $m $d"
        let key=key+1
        dt=`date -I -d "$dt +1 days"`
        y=`date -d "$dt" +%Y`
done
