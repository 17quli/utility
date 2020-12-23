#!/bin/bash
#20201129:    initial creation by Quan Lian
#set -x
cd `dirname $0`
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

conffile=./conf/$(basename $0 .sh).conf

source "$conffile"
source ./lib.sh

test -n "$1" && cleanup $1 && exit
#p1 nzpost nzad
#p2 valocity property
escapenl "/gateway/to-dip/valocity/property/staging/title_memorial.csv"
