#!/bin/bash
#################################################################################################################
#
#   truncateImpalaTables.sh
#   Aaron Scoble
#   09/01/2020
#
#################################################################################################################
if [ $# -ne 3 ]
  then
	echo
    echo "Incorrect arguments supplied"
	echo "Please provide the target database"
	echo "Please provide the list file of tables to truncate"
	echo "Please provide name for deployment properties file"
	echo "This script will create it in the config folder"
	echo
	exit 9
fi

truncate_target_db=$1
truncate_table_list=$2
properties=../config/$3

time_stamp=`date +"%Y%m%d-%H%M%S"`
log="../logs/truncateTables_${truncate_target_db}_${table_list}-${time_stamp}.log"



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



truncate_tables() {
  echo Truncating tables
	if [ -f "$truncate_table_list" ]
	then
	  echo "$truncate_table_list found."

	  while IFS='=' read -r tablename
	  do
	   # Truncate tables
	   echo Truncating table ${tablename}
	   impala-shell -V -k -i ${url} --ssl --ca_cert=${cert} --var=table_name=${tablename} --var=target_db=${truncate_target_db} -f ../ddl/generic/truncateTable.ddl &>> ${log}
	   # Count rows
	   # impala-shell -V -k -i ${url} --ssl --ca_cert=${cert} --var=table_name=${tablename} --var=target_db=${truncate_target_db} -f ../ddl/generic/countRows.sql &>> ${log}
	  done < "$truncate_table_list"
	else
	  echo "$truncate_table_list not found."
	  exit 2
	fi
  # Parse the log for errors
  echo Parsing log for errors
  grep -A1 -b2 -ie error -ie errno ${log} |tee ../logs/errors-tables-${time_stamp}.log
  echo If any errors are displayed here, they will be in logs/errors-tables-${time_stamp}.log
  echo Full log file is ${log}
  echo There has been a row count for each table after the truncate, this is in the log.
  echo -----------------------  DONE --------------------------------
}

# Main entry point. Display basic instructions and get user to confirm the settings.
clear
echo truncateImpalaTables.sh
echo "    Truncates ALL tables in the table List"

if [ -f "$truncate_table_list" ]
then
  num_tables=`cat ${truncate_table_list} | wc -l`
  echo
  echo The following ${num_tables} tables will be truncated from ${truncate_target_db}.
  echo
  while IFS='=' read -r tablename
  do
   echo ${tablename}
  done < "$truncate_table_list"
else
  echo "$truncate_table_list not found."
  exit 2
fi

# Main entry point. Display basic instructions and get user to confirm the settings.
clear
echo truncateImpalaTables.sh
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
echo
cat  ${truncate_table_list} 
echo

echo 
echo

select yn in "Truncate" "Exit"; do
    case $yn in
        Truncate ) truncate_tables; break;;
        Exit ) exit;;
    esac
done

