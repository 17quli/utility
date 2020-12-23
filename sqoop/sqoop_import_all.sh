#!/bin/bash 
#20201118:    initial creation by Quan Lian 
#set -x 
cd `dirname $0` 
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

ts=`date +%Y%m%d%H%M%S%N`
dfmt="%Y-%m-%d %H:%M:%S------"

db_list=$1
db_list_default=./conf/`basename ${0} .sh`.lst
db_list=${db_list:=$db_list_default}
conf_file=./conf/`basename ${0} .sh`.conf
mail_body=./log/`basename ${0} .sh`_$ts.txt
subject="`basename ${0} .sh` report at `date`"
pid_list=./stg/pid_${ts}.lst
>$mail_body
>$pid_list

source ./func.sh

test $# -eq 0 || test $# -eq 1 || error_exit "Wrong # of arguments! Type `basename $0` [<db_list_file>]" |tee -a $mail_body

test -r $db_list || error_exit "$db_list is not a valid list file" |tee -a $mail_body
if [ -r $conf_file ]
then
	source $conf_file
fi


while read source_db target_db
do
	test -n "$source_db" && test -n "$target_db" || error_exit "source_db or target_db is empty!" |tee -a $mail_body
	(./sqoop_import_db.sh $source_db $target_db |tee -a $mail_body) &
	echo $! >>$pid_list
done< <(sed -e '/^#/d' -e '/^ *$/d' $db_list|sort)

wait <$pid_list

sed -i -n '/------/p' $mail_body

if [ "$sendto" != "" ]
then
        if [ "$sendfrom" = "" ]
        then
                sendfrom="dip-cloudera@sas.com"
        fi
        mail -s "$subject" -r "$sendfrom" "$sendto" < <(sed -n '/------/p' $mail_body)
fi

trap "rm -f $pid_list $mail_body" EXIT
