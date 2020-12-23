#!/bin/bash
#set -x
#file_name=t.file
#grep "hdfs:" ${file_name} |awk -F "|" '{size=$2/1;print $1"|"$size}' >t
#grep "hdfs:" ${file_name} |awk -F "|" '{size=$2/1;print $size}' >t
#grep "hdfs:" ${file_name} |awk -F "|" '{print $2}' >t

#paste 
#grep "hdfs:" ${file_name} |cut -d "|" -f1 >t1
#grep "hdfs:" ${file_name} |cut -d "|" -f2"/1"|bc>t1
#grep "hdfs:" ${file_name} |awk -F "|" '{print $2"/1"}' |bc>t2
#grep "hdfs:" ${file_name} |awk -F "|" '{print $1":"}' >t1
#paste t1 t2 >t

find ./20200310 -name "*.file" >file.lst
while read file
do
sed -i -e "s/ :/|/g" $file
done < file.lst
