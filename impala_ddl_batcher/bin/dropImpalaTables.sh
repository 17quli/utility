#!/bin/bash
#################################################################################################################
#
#   dropImpalaTables.sh
#   Aaron Scoble
#   14/01/2020
#
#################################################################################################################
drop_target_db=$1
drop_table_list=$2

time_stamp=`date +"%Y%m%d-%H%M%S"`
log="../logs/dropImpalaTables_${drop_target_db}_${time_stamp}.log"

properties="../config/deploy.properties"

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


drop_tables() {
  echo Dropping tables
	if [ -f "$drop_table_list" ]
	then
	  echo "$drop_table_list found."

	  while IFS='=' read -r tablename
	  do
	   echo Dropping ${tablename}
	   impala-shell -V -k -i ${url} --ssl --ca_cert=${cert} --var=target_db=${drop_target_db} --var=table_name=${tablename} -f ddl/generic/dropTable.ddl &>> ${log}
	  done < "$drop_table_list"
	else
	  echo "$drop_table_list not found."
	  exit 2
	fi

  # Parse the log for errors
  echo Parsing log for errors
  grep -A1 -b2 -ie error -ie errno ${log} |tee ../logs/errors-tables-${time_stamp}.log
  echo If any errors are displayed here, they will be in logs/errors-tables-${time_stamp}.log
  echo Full log file is ${log}
  echo -----------------------  DONE --------------------------------
}

# Main entry point. Display basic instructions and get user to confirm the settings.
clear
echo dropImpalaTables.sh
echo "    Drops impala tables by reading through the table list and running a series of DDL scripts."
echo 
echo "NOTE: This script does not stop execution on impala errors nor does it check that all the DDL files exist. To help error checking"
echo "    it will grep the log file for errors and create a summary error log."
echo
echo Please check the following parameters
echo
echo "Table list            ${drop_table_list}     "
echo "Target database       ${drop_target_db}    "
echo
cat  ${drop_table_list} 
echo

select yn in "Continue" "Exit"; do
    case $yn in
        Continue ) drop_tables; break;;
        Exit ) exit;;
    esac
done

