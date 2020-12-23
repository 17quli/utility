error_exit(){
        echo -e "`date +"${dfmt}"ERROR:`${1-"Unknown error"}"
        exit 1
}
info(){
        echo -e "`date +"${dfmt}"INFO:`${1-""}"
}
p1(){
	#<file_name>_DD_MM_YYYY.zip or <file_name>_DD_MM.zip
	#fits for nzpost/nzad
	system=$1
	schema=$2
	schema_path="$gateway_path/to-dip/$system/$schema"
	staging_path="$schema_path/staging"
	test -n "$system" && test -n "$schema" || error_exit "system and schema cannot be empty"
	test -d "$schema_path" || error_exit "$schema_path does not exist"
	test -d "$staging_path" || error_exit "$staging_path does not exist"
	info "$schema_path validation passed"
	while read fl
	do
		d1=$(echo "$fl"|cut -d '.' -f 1|awk -F '_' '{print $NF}')
		test "$d1" -eq "$d1" 2>/dev/null ||error_exit "$d1 is not a valid number, $fl not a P1"
		d2=$(echo "$fl"|cut -d '.' -f 1|awk -F '_' '{print $(NF-1)}')
		test "$d2" -eq "$d2" 2>/dev/null ||error_exit "$d1 is not a valid number, $fl not a P1"
		d3=$(echo "$fl"|cut -d '.' -f 1|awk -F '_' '{print $(NF-2)}')
		if [ "$d3" -eq "$d3" ] 2>/dev/null
		then
			yyyy=$d1
			mm=$d2
			dd=$d3
		else
			yyyy=$(date +"%Y")
			mm=$d1
			dd=$d2
		fi
		schema_path_dt="$schema_path/$yyyy$mm$dd"
		manifest_file="$schema_path/gtw_manifest_${yyyy}${mm}${dd}000000.csv"
		test -d "$schema_path_dt" && error_exit "$schema_path_dt already exists, file $fl has been processed before"
		mkdir "$schema_path_dt" || error_exit "mkdir $schema_path_dt"
		unzip "$fl" -d "$schema_path_dt" ||error_exit "unzip $fl to $schema_path_dt"
		>"$manifest_file"
		while read fl_decompressed
		do
			fl_decompressed_name=$(basename "$fl_decompressed" |sed "s/\(.*\)\./\1_${yyyy}${mm}${dd}000000\./")
			echo "$fl_decompressed_name"|grep -q "\." ||fl_decompressed_name="${fl_decompressed_name}_${yyyy}${mm}${dd}000000"
			#fl_decompressed_name=$(basename "$fl_decompressed"|awk -v ymd="$yyyy$mm$dd" -F. '{if ($2=="") print $1 "_" ymd $2; else print $1 "_" ymd "000000." $2;}')
			echo "$fl_decompressed_name" >>"$manifest_file"
			ln "$fl_decompressed" "$schema_path/$fl_decompressed_name"||error_exit "link $fl_decompressed"
			info "link $fl_decompressed completed successfully"
		done< <(find "$schema_path_dt" -maxdepth 1 -type f) 
		rm -f $fl ||error_exit "remove $fl"
		info "$fl process completed successfully"
	done< <(find "$staging_path" -maxdepth 1 -type f -name *.zip)
}

p2(){
	#<file_name>.* 
	#fits for valocity/property
	system=$1
	schema=$2
	schema_path="$gateway_path/to-dip/$system/$schema"
	staging_path="$schema_path/staging"
	test -n "$system" && test -n "$schema" || error_exit "system and schema cannot be empty"
	test -d "$schema_path" || error_exit "$schema_path does not exist"
	test -d "$staging_path" || error_exit "$staging_path does not exist"
	info "$schema_path validation passed"
	yyyy=$(stat "$staging_path"|grep "^Modify: "|awk '{print $2}'|cut -d \- -f1)	
	mm=$(stat "$staging_path"|grep "^Modify: "|awk '{print $2}'|cut -d \- -f2)	
	dd=$(stat "$staging_path"|grep "^Modify: "|awk '{print $2}'|cut -d \- -f3)	
	hh=$(stat "$staging_path"|grep "^Modify: "|awk '{print $3}'|cut -d \: -f1)
	mi=$(stat "$staging_path"|grep "^Modify: "|awk '{print $3}'|cut -d \: -f2)
	ss=$(stat "$staging_path"|grep "^Modify: "|awk '{print $3}'|cut -d \: -f3|cut -d \. -f1)
	
	schema_path_dt="$schema_path/$yyyy$mm$dd"
	manifest_file="$schema_path/gtw_manifest_${yyyy}${mm}${dd}000000.csv"
	counter=0
	while read fl
	do
		counter=`expr $counter + 1`
		if [ $counter -eq 1 ]
		then
			test -d "$schema_path_dt" && error_exit "$schema_path_dt already exists, file $fl has been processed before"
			mkdir "$schema_path_dt" || error_exit "mkdir $schema_path_dt"
			>"$manifest_file"
		fi
		mv "$fl" "$schema_path_dt" || error_exit "move $fl to $schema_path_dt"
		fl2="$schema_path_dt/`basename $fl`"
		cc=$(head -n 1 "$fl2"|awk -F '|' '{print NF}')
	        cca=$(sed '/^$/d' "$fl2"| awk -F '|' '{print NF}'|sort|uniq)
       		if [ "$cc" != "$cca" ] && `file "$fl2"|grep -q "text"`
        	then
			escapenl "$fl2"
			info "newline escaped for $fl2"
		fi
		fl_new=$(basename "$fl" |sed "s/\(.*\)\./\1_${yyyy}${mm}${dd}${hh}${mi}${ss}\./")
		echo "$fl_new"|grep -q "\." ||fl_decompressed_name="${fl_new}_${yyyy}${mm}${dd}000000"
		echo "$fl_new">>"$manifest_file"
		ln "$fl2" "$schema_path/$fl_new"||error_exit "link $fl"
		info "$fl process completed successfully"
	done< <(find "$staging_path" -maxdepth 1 -type f)
}

escapenl(){
	f="$1"
	fn=$(basename $f)
        dn=$(dirname $f)
	cc=$(head -n 1 "$f"|awk -F '|' '{print NF}')
        awk -F '|' -v cc=$cc '
        {
        	i=NF
		j=split($NF,a1,"\"")-1
		fc=substr($NF,1,1)
                while (i<cc || i==cc && fc=="\"" && j%2==1){
                  printf("%s%s",$0," ")
                  getline
		  if (NF>0) {
			i=i+NF-1
		  	j=j+split($1,a1,"\"")-1
		  }
                }
                print $0
	}' $f>${dn}/${fn}.new
	mv ${f} ${dn}/${fn}.orig
	mv ${dn}/${fn}.new $f
}

cleanup(){
	n=$1
	test "$n" -eq "$n" 2>/dev/null || error_exit "$n has to be an integer"
	ymd=$(date -d "$n days ago" +"%Y%m%d")
	while read dir
	do
		ymd_dir=$(echo "$dir"|awk -F/ '{print $NF}')
		if [ "$ymd_dir" -le "$ymd" ] 2>/dev/null 
		then 
			rm -rf $dir
			info "$dir removed successfully"
		fi
	done< <(find "$gateway_path" -type d |grep -E "\/[0-9]{8}$")

}
