#/bin/bash
#set -x 


sql_file=t.sql
parallel=6
parallelm1=5


wcl=`wc -l<${sql_file}`


if [ $wcl -gt $parallel ]
then
        split -n l/$parallel ${sql_file} ${sql_file} -da 1
        for ((i=0;i<${parallel};i++))
        do
                sql_file_split="${sql_file}${i}"
                if [ -f $sql_file_split ]
                then
                        #nohup impala-shell -c -B --quiet -i ird26au.vsp.sas.com:25003  -f ${sql_file_split} -d ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem &
			echo $sql_file_split

                fi
        done
fi

