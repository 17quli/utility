#!/bin/bash
#set -x
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

tdw_tbl_list=tdw_tbl_list

if [ ! -f $tdw_tbl_list ]
then
        echo "$tdw_tbl_list file not exist"
        exit 1
fi


while IFS= read -r dbs
do
        if [ ${dbs:0:1} != "#" ]
        then
                set -- $dbs
                app_tbl_name=$1
                tdw_tbl_name=$2
		unique_key="$3"

		load_script_name="53_tdw_load_to_${app_tbl_name}.sql"
		>$load_script_name

#		echo 'select count(1) from  ${var:target_db}.${var:app_tbl_name};'>>$load_script_name
		echo 'INSERT INTO TABLE  ${var:target_db}.${var:app_tbl_name}'>>$load_script_name
		echo 'SELECT'>>$load_script_name

impala-shell -B --quiet -i ird26au.vsp.sas.com:25003  -d dev_raw  -q "show create table $app_tbl_name;" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem| sed -e "/^[A-Z\"\)]/d" \
-e "/^ *fdtmwhen TIMESTAMP/d" \
-e "/^ *record_effective_timestamp TIMESTAMP/d" \
-e "/^ *record_expiry_timestamp TIMESTAMP/d" \
-e "/^ *record_active_flag VARCHAR(1)/d" \
-e "/^ *record_deleted_flag VARCHAR(1)/d" \
-e "/^ *insert_object_run_key INT/d" \
-e "/^ *update_object_run_key INT/d" |awk '{gsub(/,$/,"");print "cast("$1" as "$2") as "$1","}' >>$load_script_name

		echo 'CAST(effective_from AS TIMESTAMP) AS fdtmwhen,'>>$load_script_name
		echo 'CAST(record_effective_timestamp AS TIMESTAMP) AS record_effective_timestamp,'>>$load_script_name
		echo 'CAST(record_expiry_timestamp AS TIMESTAMP) AS record_expiry_timestamp,'>>$load_script_name
		echo 'CAST(CURRENT_REC_FLAG AS VARCHAR(1)) AS record_active_flag,'>>$load_script_name
		echo "CAST('N' AS VARCHAR(1)) AS record_deleted_flag,">>$load_script_name
		echo 'CAST(insert_object_run_key AS INT) AS insert_object_run_key,'>>$load_script_name
		echo 'CAST(update_object_run_key AS INT) AS update_object_run_key'>>$load_script_name
		echo 'FROM  ${var:target_db}.${var:tdw_tbl_name};'>>$load_script_name

		#echo 'select count(*) as raw_new_count from  ${var:target_db}.${var:app_tbl_name};'>>$load_script_name
		echo 'upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,raw_record_count_post_load)' >>$load_script_name
		echo "select '\${var:app_tbl_name}','\${var:env}',\${var:batch_number},'\${var:tdw_tbl_name}',count(1) from  \${var:target_db}.\${var:app_tbl_name};">>$load_script_name

		#echo 'select count(distinct '$unique_key') as distinct_keys_count FROM  ${var:target_db}.${var:app_tbl_name};'>>$load_script_name
		echo 'upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,tdw_unique_key_count)'>>$load_script_name
		echo "select '\${var:app_tbl_name}','\${var:env}',\${var:batch_number},'\${var:tdw_tbl_name}',count(distinct $unique_key)  as distinct_keys_count FROM  \${var:target_db}.\${var:app_tbl_name};">>$load_script_name
		echo 'upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,tdw_multiple_key_count)' >>$load_script_name
		echo "select '\${var:app_tbl_name}','\${var:env}',\${var:batch_number},'\${var:tdw_tbl_name}', count(1) from (select $unique_key,count(1) FROM  \${var:target_db}.\${var:app_tbl_name} group by $unique_key having count(1)>1) z;">>$load_script_name

		echo 'upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,tdw_min_effective_from,tdw_max_effective_from)'>>$load_script_name
		echo "select '\${var:app_tbl_name}','\${var:env}',\${var:batch_number},'\${var:tdw_tbl_name}', min(fdtmwhen),max(fdtmwhen) from \${var:target_db}.\${var:app_tbl_name};">>$load_script_name

		#echo 'select count(*) as low_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_effective_timestamp = '"'1800-01-01 00:00:00';">>$load_script_name
		echo 'upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,low_date_count)'>>$load_script_name
		echo "select '\${var:app_tbl_name}','\${var:env}',\${var:batch_number},'\${var:tdw_tbl_name}',count(*) as low_date_count FROM  \${var:target_db}.\${var:app_tbl_name} where record_effective_timestamp = '1800-01-01 00:00:00';">>$load_script_name

		#echo 'select count(*) as high_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_expiry_timestamp = ''9000-12-31 00:00:00'';'>>$load_script_name
		echo 'upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,high_date_count)'>>$load_script_name
		echo "select '\${var:app_tbl_name}','\${var:env}',\${var:batch_number},'\${var:tdw_tbl_name}', count(*) as high_date_count FROM  \${var:target_db}.\${var:app_tbl_name} where record_expiry_timestamp = '9000-12-31 00:00:00';" >>$load_script_name


		#echo 'select count(1) as lwmcnt from ${var:target_db}.${var:app_tbl_name} where fdtmwhen=''1800-1-1'';'>>$load_script_name
		echo 'upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,fdtmwhen_low_date_count)' >>$load_script_name
		echo "select '\${var:app_tbl_name}','\${var:env}',\${var:batch_number},'\${var:tdw_tbl_name}', count(1) as lwmcnt from \${var:target_db}.\${var:app_tbl_name} where fdtmwhen='1800-1-1';" >>$load_script_name

		echo 'select raw_table_name as raw,environment as env,batch_number as batch,raw_record_count as raw_rc,tdw_record_count as tdw_rc,tdw_unique_key_count as tdw_ukc,tdw_multiple_key_count as tdw_mkc,tdw_min_effective_from,tdw_max_effective_from,raw_record_count_post_load as raw_rc_tdw_load,raw_record_count_post_inc as raw_rc_inc,low_date_count as lwm_rc,high_date_count as hwm_rc,fdtmwhen_low_date_count fdtmwhen_lwm_rc '>>$load_script_name
		echo 'from ${var:source_db}.tdw_validation '>>$load_script_name
		echo "where raw_table_name='\${var:app_tbl_name}' and environment='\${var:env}';">>$load_script_name

		echo 'drop table if exists ${var:journal_db}.${var:app_tbl_name};'>>$load_script_name
                echo "53 script for ${app_tbl_name} generated."
        fi
done< <(cat "$tdw_tbl_list")
