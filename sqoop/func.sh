#/bin/bash
error_exit(){
        echo -e "`date +"${dfmt}"ERROR:`${1-"Unknown error"}"
        col=$2
        val=$3
        test -n "$col" || exit 1
        ./run_sqlb.sh "upsert into ${target_db}.${object_run_table} (object_run_key,end_time,$col) select $object_run_key,'`date +"%Y-%m-%d %H:%M:%S.%N"`',$val"
        exit 1
}
info(){
        echo -e "`date +"${dfmt}"INFO:`${1-""}"
	col=$2
        val=$3
        if [ -n "$col" ]
	then
        	./run_sqlb.sh "upsert into ${target_db}.${object_run_table} (object_run_key,$col) select $object_run_key,$val"
	fi
}
