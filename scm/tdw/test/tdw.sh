#!/bin/bash
#set -x
file_name=$1
file_name_orig=$1
#app_tbl_name=$2
#tdw_tbl_name=$3
yyyymmdd=`date +%Y%m%d`
logfile=./`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

release_note="../release_note"


if [ ! -f config ] 
then
	echo "config file not exist"
	exit 1
fi

source config

if [ -f "$release_note" ] 
then
	source "$release_note"
else
	echo "please set batch_number in $release_note file"
	exit 2
fi

if [ $# -lt 1 ]
then
	echo "type $0 <sql_file>"
	exit 2
fi


while IFS= read -r dbs
do
	if [ ${dbs:0:1} != "#" ]
	then
		set -- $dbs
		app_tbl_name=$1
		tdw_tbl_name=$2
		echo "${app_tbl_name}:"
		if [ ${file_name_orig} = "53_tdw_load_to_app.sql" ]
		then
			file_name="../53_tdw_load_to_${app_tbl_name}.sql"
		fi
		if [ ! -f ${file_name} ]
                then
                	echo "${file_name} does not exist!"
                	exit 2
                fi

		impala-shell -c --quiet -i ird26au.vsp.sas.com:25003 -f $file_name --var="batch_number=${batch_number}" --var="env=${environment}" --var="journal_db=${journal_db}" --var="source_db=${source_db}" --var="target_db=${target_db}" --var="app_tbl_name=${app_tbl_name}" --var="tdw_tbl_name=${tdw_tbl_name}" --var="yyyymmdd=${yyyymmdd}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
	fi
done< <(cat "$tdw_tbl_list")
