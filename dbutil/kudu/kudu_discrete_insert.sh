##!/bin/bash
dfmt="%Y-%m-%d %H:%M:%S------"
i=7777
while [ $i -lt 7977 ]
do
	echo `date +"$dfmt"`"insert for batch $i" 
	./run_db_file_parallel_p1.sh dev_raw kudu_discrete_insert.sql $i
#	echo "$key $dt $y $q $m $d"
	let i=i+1
done
