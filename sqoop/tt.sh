#!/bin/bash
set -x
ts=`date +%Y%m%d%H%M%S%N`
dfmt="%Y-%m-%d %H:%M:%S------"
target_db=dev_raw
object_run_table=object_run_lq
error_exit(){
	msg=$1
        object_run_key=$2
        col=$3
        val=$4
        echo -e "`date +"${dfmt}"ERROR:`${msg:-"Unknown error"}"
}
error_exit $1 $2 $3 $4
