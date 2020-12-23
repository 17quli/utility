#!/bin/bash
set -x
a=$1
regexp="\;[[:blank:]]*$"
#if [ -n "$a" ] && [ -z ${a##*;} ] 
#then
#	echo "end with ;"
#else
#	echo "not end with ;"
#fi
if [[ $a =~ $regexp ]] 
then 
 echo "ended with;"
fi

