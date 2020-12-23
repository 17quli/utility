#!/bin/bash
dev=$(hdfs fsck /env/1_dev/hive |grep "Total files:"|cut -d ":" -f2|head -n 1|awk '{print $1}')
test=$(hdfs fsck /env/2_test/hive |grep "Total files:"|cut -d ":" -f2|head -n 1|awk '{print $1}')
prod=$(hdfs fsck /env/3_prod/hive |grep "Total files:"|cut -d ":" -f2|head -n 1|awk '{print $1}')
lab=$(hdfs fsck /env/4_lab/hive |grep "Total files:"|cut -d ":" -f2|head -n 1|awk '{print $1}')
rft=$(hdfs fsck /env/5_rft/hive |grep "Total files:"|cut -d ":" -f2|head -n 1|awk '{print $1}')
total=`echo "$dev + $test + $prod + $lab + $rft"|bc -l`
echo -e "dev=$dev\ntest=$test\nprod=$prod\nlab=$lab\nrft=$rft\ntotal=$total\n"
