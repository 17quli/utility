#!/bin/bash
#set -x
ts=`date +%Y%m%d%H%M%S%N`
db_env=$1
db_layer=$2
tbl_list=$3
restricted_db_name="${db_env}_${db_layer}_restricted_access"
full_db_name="${db_env}_${db_layer}_full_access"
db_name="${db_env}_${db_layer}"

error_exit(){
	dfmt="%Y-%m-%d %H:%M:%S------"
	echo -e "`date +"$dfmt"`${1-"Unknown error"}" 1>&2
        exit 1
}

generate_spcad2(){
	cat $1 | sed -e "s/= *'STD' /!='SPCAD2' /g" -e "s/= *'STD';/!='SPCAD2';/g" 
}

test $# -eq 3 || error_exit "Wrong # of arguments! Type `basename $0` <env> <layer> <table_list>"
test -f $tbl_list || error_exit "file $tbl_list not exists!"

while read object_name
do
	full_view=/home/ird0qal/start/${object_name}-full.ddl
	restricted_view=/home/ird0qal/start/${object_name}-restricted.ddl
	restricted_sql="select concat(right(left(create_statement,length(create_statement)-1),length(create_statement)-2),';') from mtable where object_type='view' and db_name='$restricted_db_name' and object_name='$object_name'" 
	full_sql="select concat(right(left(create_statement,length(create_statement)-1),length(create_statement)-2),';') from mtable where object_type='view' and db_name='$full_db_name' and object_name='$object_name'" 

	./run_db_sqlb.sh dev_raw "$restricted_sql" >$restricted_view

	sed -i -e 's/^"//g' -e 's/"$//g' $restricted_view
	sed -i -e "s/$db_name\./\${var:source_db}\./g" $restricted_view
	sed -i -e "s/$restricted_db_name\./\${var:view_db}\./g" $restricted_view

	cp $restricted_view $full_view
	grep -i -q " where " $restricted_view && generate_spcad2 $restricted_view>$full_view
done < <(cat $tbl_list|sed '/^[[:space:]]*$/d')
