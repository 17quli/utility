#!/bin/bash
cd `dirname $0`
dt=`date +"%Y-%m-%d %H:%M:%S.%s"`
sql_file=benchmark.sql
db_name=dev_raw

impala-shell -B -i ird26au.vsp.sas.com:25003  --var="v1=${dt}" -f ${sql_file} -d ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem
