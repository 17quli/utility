#!/bin/bash
#################################################################################################################
#
#   countViews.sh
#   Aaron Scoble
#   14/01/2020
#
#################################################################################################################

time_stamp=`date +"%Y%m%d-%H%M%S"`
log="logs/countViews_${time_stamp}.log"
# assign a variable so that property test will be case insensitive
y=y

if [ $# -eq 0 ]
  then
	echo
    echo "No arguments supplied"
	echo "Please provide name for deployment properties file"
	echo "This script will look for it in the config folder"
	echo
	exit 9
fi
properties=config/$1

# Read the properties file .
if [ -f "$properties" ]
then
  echo "$properties found."
set -o allexport
source ${properties}
set +o allexport
  else
    echo "$properties not found."
    exit 1
fi


count_views() {
  echo Counting tables and views
table_list=ddl/$1
table_db=$2
full_db=$3
restricted_db=$4

	if [ -f "$table_list" ]
	then
	  echo "$table_list found."

	  while IFS='=' read -r tablename
	  do
	   echo
	   echo ------------------------------------------------------
	   echo Counting rows for ${tablename}|tee -a ${log}
	   echo ------------------------------------------------------
	   impala-shell -V -k -i ${url} --ssl --ca_cert=${cert} --var=table_name=${tablename} --var=table_db=${table_db} --var=full_db=${full_db} --var=restricted_db=${restricted_db}  -f ddl/generic/countRows.sql |tee -a ${log}
	  done < "$table_list"
	else
	  echo "$table_list not found."
	  exit 2
	fi

  # Parse the log for errors
  echo Parsing log for errors
  grep -A1 -ie error -ie errno ${log} |tee logs/errors-tables-${time_stamp}.log
  echo If any errors are displayed here, they will be in logs/errors-tables-${time_stamp}.log
  echo Full log file is ${log}
  echo -----------------------  DONE --------------------------------
}

main(){

	 if [ "${deploy_raw,,}" = "${y,,}" ]; then
		count_views ${raw_table_list} ${environment}${raw_db} ${environment}${raw_db}${full_view} ${environment}${raw_db}${restricted_view} 
	  else
		echo No raw assets will be deployed
	  fi
	 
	  if [ "${deploy_refined,,}" = "${y,,}" ]; then
		count_views ${refined_view_list} ${environment}${refined_db} ${environment}${refined_db}${full_view} ${environment}${refined_db}${restricted_view} 
	  else
	   echo No refined assets will be deployed
	  fi
}

# Main entry point. Display basic instructions and get user to confirm the settings.
clear
echo countViews.sh
echo "    Counts rows in source table, full and restricted views. "
echo 
echo "NOTE: This script does not stop execution on impala errors nor does it check that all the DDL files exist. To help error checking"
echo "    it will grep the log file for errors and create a summary error log."
echo
echo Please check the following parameters
echo
echo "Raw table list             ${raw_table_list}"
echo "--- Raw target database        ${environment}${raw_db}"
echo "Refined view list          ${refined_view_list}"
echo "--- Refined Target database    ${environment}${refined_db}"
echo
echo

select yn in "Continue" "Exit"; do
    case $yn in
        Continue ) main; break;;
        Exit ) exit;;
    esac
done

