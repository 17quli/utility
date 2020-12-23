#!/bin/bash

impala-shell -B -i ird26au.vsp.sas.com:25003 -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem  
