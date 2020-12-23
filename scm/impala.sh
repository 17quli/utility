#!/bin/bash
execution_result=""
file_name=$1
table_name=$2
lab_project=$3

impala-shell -i ird26au.vsp.sas.com:25003 -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem  --live_summary
