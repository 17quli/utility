#!/bin/bash

impala-shell -i ird10139au.vsp.sas.com:25003 -d dev_raw -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem  --live_summary
