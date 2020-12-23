#!/bin/bash
dev=$(hdfs fsck /env/1_dev/hive |grep "Total blocks (validated)"|cut -d ":" -f2|awk '{print $1}')
test=$(hdfs fsck /env/2_test/hive |grep "Total blocks (validated)"|cut -d ":" -f2|awk '{print $1}')
prod=$(hdfs fsck /env/3_prod/hive |grep "Total blocks (validated)"|cut -d ":" -f2|awk '{print $1}')
lab=$(hdfs fsck /env/4_lab/hive |grep "Total blocks (validated)"|cut -d ":" -f2|awk '{print $1}')
rft=$(hdfs fsck /env/5_rft/hive |grep "Total blocks (validated)"|cut -d ":" -f2|awk '{print $1}')
total=`echo "$dev + $test + $prod + $lab + $rft"|bc -l`
echo -e "dev=$dev\ntest=$test\nprod=$prod\nlab=$lab\nrft=$rft\ntotal=$total\n"
