#!/bin/bash

list="dev test prod"
env=$1

if [ $# -ne 1 ]
then
        echo "wrong # of arguments!"
        echo "type $0 {dev|test|prod} "
        exit 1
fi

(echo $list |grep -w -q $env) || (echo -e "wrong environment parameter\ntype $0 {dev|test|prod} ";exit 2)

./run_db_fileb.sh dev_raw spcad2.sql >spcad2.lst
sed -i -e 's/^"//g' -e 's/"$//g' spcad2.lst
sed -i -e "s/= *'STD' /!='SPCAD2' /g" spcad2.lst
sed -i -e "s/= *'STD';/!='SPCAD2';/g" spcad2.lst

sed -i -e "s/prod_raw_restricted_access\./${env}_raw_full_access\./g" spcad2.lst
sed -i -e "s/prod_raw\./${env}_raw\./g" spcad2.lst

sed -i -e "s/prod_refined_restricted_access\./${env}_refined_full_access\./g" spcad2.lst
sed -i -e "s/prod_refined\./${env}_refined\./g" spcad2.lst
