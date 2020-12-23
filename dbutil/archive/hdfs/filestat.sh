#!/bin/bash
#set -x 
db_name=$1
yyyymmdd=`date +%Y%m%d`
dbtbl="./${yyyymmdd}/${db_name}/${yyyymmdd}_${db_name}.table"
dbshowcreate="./${yyyymmdd}/${db_name}/${yyyymmdd}_${db_name}.showcreate"
dbfile="./${yyyymmdd}/${db_name}/${yyyymmdd}_${db_name}.file"
dbfilesum="./${yyyymmdd}/${db_name}/${yyyymmdd}_${db_name}.load"

if [ $# -ne 1 ] 
then
	echo $#
	echo "type $0 <db_name>"
	exit 1
fi

if [ ! -d ${yyyymmdd} ]
then
        mkdir ${yyyymmdd}
fi

if [ ! -d ${yyyymmdd}/${db_name} ]
then
        mkdir -p ${yyyymmdd}/${db_name}
fi

touch ${dbfile}
touch ${dbfilesum}
>${dbfile}
>${dbfilesum}

impala-shell --quiet -i ird26au.vsp.sas.com:25003 -d ${db_name} -q "show tables;" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem >tbl.lst

line_cnt=`wc -l tbl.lst |cut -d " " -f1`
head_cnt=`expr $line_cnt - 1 `
tail_cnt=`expr $line_cnt - 4 ` 
head -n $head_cnt tbl.lst|tail -n $tail_cnt |cut -d "|" -f2 >tbl.sql
sed  -i -e 's/^/show create table/g' -e 's/$/;/g' tbl.sql
impala-shell --quiet -i ird26au.vsp.sas.com:25003 -d ${db_name} -f tbl.sql -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem >${dbshowcreate}
cat ${dbshowcreate} |grep "CREATE TABLE"|cut -d "(" -f1 |cut -d "." -f2 >${dbtbl}

table_cnt=`wc -l ${dbtbl}|cut -d " " -f1`

total_file_cnt=0
total_file_size=0
#echo "table_name:#_of_files:file_size:avg_file_size"
while read table_name
do
	impala-shell --quiet -i ird26au.vsp.sas.com:25003 -d ${db_name} -q "show files in ${table_name};" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem >file.lst
	line_cnt=`wc -l file.lst |cut -d " " -f1`
	head_cnt=`expr $line_cnt - 1 `
	tail_cnt=`expr $line_cnt - 4 `
	file_cnt=`expr $line_cnt - 4 `
	file_size=0
	avg_size=0
	if [ $file_cnt -eq -4 ]
	then
		file_cnt=0;
	else
		head -n $head_cnt file.lst|tail -n $tail_cnt |cut -d "|" -f3 |sed -e "s/GB/*1024*1024*1024/g" -e "s/MB/*1024*1024/g" -e "s/KB/*1024/g" -e "s/B//g">size.lst
#		head -n $head_cnt file.lst|tail -n $tail_cnt |cut -d "|" -f2,3 |sed -e "s/GB/*1024*1024*1024/g" -e "s/MB/*1024*1024/g" -e "s/KB/*1024/g" >>${dbfile}
		head -n $head_cnt file.lst|tail -n $tail_cnt|grep "hdfs:"|awk -F "|"  '{gsub(/GB/,"*1024*1024*1024",$3);gsub(/MB/,"*1024*1024",$3);gsub(/KB/,"*1024",$3);gsub(/B/,"",$3);print $2"|"$3;}' >>${dbfile}

		while read ln
		do
			check=`echo $ln |grep -E ^[0-9\.\*]+$`
			if [ "$check" != "" ]; then    
				file_size=`echo "${ln} + ${file_size}"|bc`
			fi
		done <size.lst 
		file_size=`echo $file_size/1 |bc`
		avg_size=`echo $file_size/$file_cnt/1|bc`
	fi
	echo "${table_name}:$file_cnt:$file_size:$avg_size" >>${dbfilesum}
	total_file_cnt=`expr $total_file_cnt + $file_cnt`
	total_file_size=`expr $total_file_size + $file_size`
        #tblcnt.sh $table_name
done <${dbtbl}
if [ $total_file_cnt -eq 0 ]
then
	tmp_file_cnt=1
else
	tmp_file_cnt=$total_file_cnt
fi
total_avg_size=`echo ${total_file_size}/$tmp_file_cnt/1024/1024/1 |bc`
total_file_size=`echo $total_file_size/1024/1024/1024/1|bc`
cat ${dbfile} |awk -F "|" '{print $2"/1"}'|bc>t2
cat ${dbfile} |awk -F "|" '{print $1"|"}' >t1
paste t1 t2 >${dbfile}
echo "# of tables     :${table_cnt}"
echo "total # of files:${total_file_cnt}"
echo "total file size :${total_file_size}GB"
echo "avg file size   :${total_avg_size}MB"
