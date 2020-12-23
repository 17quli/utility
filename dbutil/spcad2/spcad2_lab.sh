#!/bin/bash

env=lab_fcp

./run_db_fileb.sh dev_raw spcad2_lab.sql >spcad2_lab.lst
sed -i -e 's/^"//g' -e 's/"$//g' spcad2_lab.lst
sed -i -e "s/= *'STD' /!='SPCAD2' /g" spcad2_lab.lst
sed -i -e "s/= *'STD';/!='SPCAD2';/g" spcad2_lab.lst

sed -i -e "s/${env}_raw_restricted_access\./${env}_raw_full_access\./g" spcad2_lab.lst
