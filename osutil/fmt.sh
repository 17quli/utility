#!/bin/bash
#set -x
dt=`date +"%Y-%m-%d %H:%M:%S"`
dt2=`date +"%Y%m%d%H%M%S"`
out_file=./out/`basename ${0} .sh`.out
>$out_file
while read file_name
do
	case `basename $file_name .log` in
	cmd_df)
		category='disk'
		;;
	cmd_free)
		category='memory'
		;;
	cmd_top)
		category='cpu'
		#second replacement is to overcome 100% idle issue where there is no space in between
		#cp $file_name ./archive/${dt2}.log
		sed -E -i -n '/^ird[0-9][0-9]|^\%Cpu\(s\)\:/p' $file_name
		sed -i -e 's/\,/ /g' $file_name
		;;
	*)	
		continue 
		;;
	esac

	while read line
	do
		if [ -z "$line" ]
		then 
			continue
		fi

		if [[ $line =~ ^ird[0-9]*au\.vsp\.sas\.com$ ]]
		then
			host="$line"
		else
			set -- $line
			case $category in
			disk)
				#mount_point
				component=$6
				#used
				v1=$3
				#total
				v2=$2
				#available
				v3=$4
				headline_mark="Mounted"
				v4=""
				v5=""
				v6=""
				;;
			memory)
				#Mem:/Swap:
				component=$1
				component=${component%:}
				#used
				v1=$3
				#total
				v2=$2
				#free
				v3=$4
				v4=""
				v5=""
				v6=""
				headline_mark="total"	
				;;
			cpu)
				#Mem:/Swap:
				component="all"
				#user
				v1=`echo "$2 /1"|bc 2>/dev/null`
				#sys
				v2=`echo "$4 /1"|bc 2>/dev/null`
				#io
				v3=`echo "${10} /1"|bc 2>/dev/null`
				#steal
				v4=`echo "${16} /1"|bc 2>/dev/null`
				#nice
				v5=`echo "${6} /1"|bc 2>/dev/null`
				#idle
				v6=`echo "${8} /1"|bc 2>/dev/null`
				headline_mark="___________________"
				;;
			*)	
				;;
			esac

			if [[ $component =~ $headline_mark ]] 
			then
				:
			else
				printf '%s' "${host}">>$out_file
				printf '\002' >>$out_file
				printf '%s' "${category}">>$out_file
				printf '\002' >>$out_file
				printf '%s' "${component}">>$out_file
				printf '\002' >>$out_file
				printf '%s' "${dt}">>$out_file
				printf '\002' >>$out_file
				printf '%s' "${v1}">>$out_file
				printf '\002' >>$out_file
				printf '%s' "${v2}">>$out_file
				printf '\002' >>$out_file
				printf '%s' "${v3}">>$out_file
				printf '\002' >>$out_file
				printf '%s' "${v4}">>$out_file
				printf '\002' >>$out_file
				printf '%s' "${v5}">>$out_file
				printf '\002' >>$out_file
				printf '%s' "${v6}">>$out_file
				printf '\003' >>$out_file
			fi
		fi
	done <$file_name
done< <(find ./log -name "*.log")
#done< <(sed  -e '/^$/d;:a;$!N;s/\n/\t/;ta;$P;$D' $file_name|sed -e 's/\(ird[0-9]*au\.vsp\.sas\.com\)/\n\1\n/g')
#scp $out_file ird26au.vsp.sas.com:/home/ird0qal/osutil/out
