#!/bin/bash
#set -x
ts=`date +%Y%m%d%H%M%S%N`
dfmt="%Y-%m-%d %H:%M:%S------"
tblslist=$1
sclist=./stg/show_create_table_${ts}.lst


error_exit(){
	dfmt="%Y-%m-%d %H:%M:%S------"
	echo -e "`date +"$dfmt"`${1-"Unknown error"}" 1>&2
        exit 1
}

generate_spcad2(){
	cat $1 | sed -e "s/= *'STD' /!='SPCAD2' /g" -e "s/= *'STD';/!='SPCAD2';/g" 
}


test $# -eq 1 || error_exit "Wrong # of arguments! Type `basename $0`  <tbslist>"

test -f $tblslist || error_exit "$tblslist is not a valid file"

while read object_name
do
	full_view=/home/ird0qal/start/${object_name}-full.ddl
	restricted_view=/home/ird0qal/start/${object_name}-restricted.ddl
#	restricted_sql="select concat(right(left(create_statement,length(create_statement)-1),length(create_statement)-2),';') from mtable where object_type='view' and db_name='$restricted_db_name' and object_name='$object_name'" 
#	full_sql="select concat(right(left(create_statement,length(create_statement)-1),length(create_statement)-2),';') from mtable where object_type='view' and db_name='$full_db_name' and object_name='$object_name'" 
	cp $restricted_view $full_view
	sed -i -e "s/= *'STD' /!='SPCAD2' /g" $full_view
	sed -i -e "s/= *'STD';/!='SPCAD2';/g" $full_view
done< <(cat $tblslist|sed -e '/^#.*$/d' -e '/^[[:space:]]*$/d')
