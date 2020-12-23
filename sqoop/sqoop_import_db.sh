#!/bin/bash 
#20201118:    initial creation by Quan Lian 
#set -x 
cd `dirname $0` 
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

ts=`date +%Y%m%d%H%M%S%N`
dfmt="%Y-%m-%d %H:%M:%S------"
source_db=$1
target_db=$2
source_tbl_list=./conf/${source_db}.lst
source_tbl_list_stg=./stg/${source_db}_${ts}
pidlist=./stg/pid_$$_${ts}.lst
>$pidlist
source_db_conf=./conf/${source_db}.db
source ./func.sh

sqimp(){
	while read source_tbl target_tbl cdc_col tbl_mappers split_by excluded_cols
	do

       	 	test -n "$source_tbl" && test -n "$target_tbl" && test -n "$cdc_col" && test -n "$tbl_mappers" && test -n "$split_by" || error_exit "source_tbl, target_tbl, cdc_col, tbl_mappers and split_by cannot be empty!"
		while test $(jobs |awk '{print $2}'|grep "^Running"|wc -l) -ge "$parallel"
		do
			sleep 3
		done
       	 	info "start loading $source_db.$source_tbl to $target_db.$target_tbl:cdc_col=$cdc_col,excluded_columns=$exclude_cols"
        	./sqoop_import.sh $source_db $source_tbl $target_db $target_tbl $cdc_col $tbl_mappers $split_by $excluded_cols &
		echo $! >>$pidlist

        	#if [ $? -eq 0 ]
        	#then
               	#	 info "completed loading $source_db.$source_tbl to $target_db.$target_tbl"
        	#else
               	#	 info "failed loading $source_db.$source_tbl to $target_db.$target_tbl"
        	#fi
	done< <(sed -e '/^#/d' -e '/^ *$/d' $1)
	wait <$pidlist
}

test $# -eq 2 || error_exit "Wrong # of arguments! Type `basename $0` <source_db> <target_db>"



if [ -r $source_db_conf ]
then
	source $source_db_conf
fi


test -r $source_tbl_list || error_exit "$source_tbl_list is not a valid list file"
sed -e '/^#/d' -e '/^ *$/d'  $source_tbl_list >$source_tbl_list_stg

wcl=`wc -l<${source_tbl_list_stg}`

if ! ([ -n "$parallel" ] && [ "$parallel" -eq "$parallel" ] 2>/dev/null)
then
	#default parallel=6
        parallel=4
fi

sqimp "${source_tbl_list_stg}"

#if [ "$parallelm1" -lt 1 ]
#then
#        parallemm1=1
#fi


#pidlist=./stg/pid_$$_${ts}.lst
#>$pidlist
#rm -f ${source_tbl_list_stg}[0-$parallel]



#if [ $wcl -ge $parallel ]
#then
#        split -n l/${parallel} ${source_tbl_list_stg} ${source_tbl_list_stg} -da 4
#        for ((i=0;i<${parallel};i++))
#        do
#		j=$(printf "%04d" $i)
#                source_tbl_list_split="${source_tbl_list_stg}${j}"
#                if [ -f $source_tbl_list_split ]
#                then
#                        sqimp  ./$source_tbl_list_split &
#                        echo $! >>$pidlist
#                fi
#	sleep 1
#        done
#        wait <$pidlist
#else
#        sqimp ${source_tbl_list_stg}
#fi

#trap "rm -f $pidlist ${source_tbl_list_stg} ${source_tbl_list_stg}*" EXIT
trap "rm -f $pidlist ${source_tbl_list_stg}" EXIT
