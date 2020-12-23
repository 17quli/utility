#!/bin/bash
#set -x
spath=$1

while read f
do
	cc=$(head -n 1 "$f"|awk -F '|' '{print NF}')
	cca=$(awk -F '|' '{print NF}' "$f" |sort|uniq)
	if [ "$cc" != "$cca" ]
	then
		#echo "column count of $f is $cc"
		fn=$(basename $f)
		dn=$(dirname $f)
		awk -F '|' -v cc=$cc '
		{
			i=NF 
			while (i<cc){
				printf("%s%s",$0," ")
				getline
				i=i+NF-1
			}
			print $0
		}' $f>${dn}/${fn}.new
	fi
done< <(find "$spath" -maxdepth 1 -type f -name "*.csv")
