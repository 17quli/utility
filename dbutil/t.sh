#!/bin/bash
#set -x
#awk '{printf("%s %c %s %c %s %s %s", "select ",39, $1, 39,",snp-bkp as gap,* from (select count(1) bkp from prod_dw.",$1,") a join (select count(1) snp from dev_dw.");gsub("20201206","20201205");print $1 ") b;"}' t5.lst >t5.sql
#awk '{printf("%s %c %s %c %s %s %s %s %s\n", "select ",39, $1, 39,",snp-bkp as gap,* from (select count(1) bkp from prod_dw.",$1,") a join (select count(1) snp from dev_dw.",$1,") b;")}' t6.lst >t6.sql
#awk '{printf("%s %c %s %c %s %s %s %s %s\n", "select ",39, $1, 39,",snp-bkp as gap,* from (select count(1) bkp from prod_dw.",$1,") a join (select count(1) snp from dev_dw.",$1,") b;")}' t4.lst >t4.sql
#awk '{printf("%s %c %s %c %s %s %s %s %s\n", "select ",39, $1, 39,",snp-bkp as gap,* from (select count(1) bkp from prod_dw.",$1,") a join (select count(1) snp from dev_dw.",$1,") b;")}' t3.lst >t3.sql
awk '{printf("%s %c %s %c %s %s %s %s %s\n", "select ",39, $1, 39,",snp-bkp as gap,* from (select count(1) bkp from prod_dw.",$1,") a join (select count(1) snp from dev_dw.",$1,") b;")}' t2.lst >t2.sql
#awk '{printf("%s %c %s %c %s %s %s %s %s\n", "select ",39, $1, 39,",snp-bkp as gap,* from (select count(1) bkp from prod_dw.",$1,") a join (select count(1) snp from dev_dw.",$1,") b;")}' t1.lst >t1.sql
