#!/bin/bash
#################################################################################################################
#
#   createAllTables.sh
#   Aaron Scoble
#   04/02/2020
#
#################################################################################################################

time_stamp=`date +"%Y%m%d-%H%M%S"`
log="logs/createImpalaTables_${raw_target_db}_-${time_stamp}.log"
properties="config/deploy.properties"
# assign a variable so that property test will be case insensitive
y=y

function call_impala_shell(){
_tablename=$1
_target_db=$2
_log=$3
   impala-shell -V -k -i ${url} --ssl --ca_cert=${cert} --var=target_db=${_target_db} -f ddl/create_impala_tables/${_tablename}-create.ddl &>> ${_log}
}

function raw_tables(){

if [ -f "ddl/$raw_table_list" ]
then
  echo "ddl/$raw_table_list found."

  while IFS='=' read -r tablename
  do
   echo Creating ${tablename}
   call_impala_shell ${tablename} ${environment}${raw_db} ${log}
  done < "ddl/$raw_table_list"
else
  echo "ddl/$raw_table_list not found."
  exit 2
fi
}

function refined_tables(){
if [ -f "ddl/$refined_table_list" ]
then
  echo "ddl/$refined_table_list found."

  while IFS='=' read -r tablename
  do
   echo Creating ${tablename}
   call_impala_shell ${tablename} ${environment}${refined_db} ${log}
  done < "ddl/$refined_table_list"
else
  echo "ddl/$refined_table_list not found."
  exit 2
fi
}

main() {
  echo Creating tables
  if [ "${deploy_raw,,}" = "${y,,}" ]; then
    echo ----- raw tables ----- |tee -a ${log}
    raw_tables
  else
    echo No raw assets will be deployed
  fi
 
  if [ "${deploy_refined,,}" = "${y,,}" ]; then
     echo ----- refined tables ----- |tee -a ${log}
     refined_tables
  else
     echo No refined assets will be deployed
  fi
  # Parse the log for errors
  echo Parsing log for errors
  grep -A1 -b2 -ie error -ie errno ${log} |tee logs/errors-tables-${time_stamp}.log
  echo If any errors are displayed here, they will be in logs/errors-tables-${time_stamp}.log
  echo Full log file is ${log}
  echo -----------------------  DONE --------------------------------
}

echo ${properties}

#Program intro
echo -----------------------------
echo Impala script wrapper
echo    createAllTables.sh
echo -----------------------------
echo ::: Configuration details :::

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

# Main entry point. Display basic instructions and get user to confirm the settings.
clear
echo createRawTables.sh
echo "    Creates impala tables by reading through the table list and running a series of DDL scripts."
echo 
echo "NOTE: This script does not stop execution on impala errors nor does it check that all the DDL files exist. To help error checking"
echo "    it will grep the log file for errors and create a summary error log."
echo
echo "NOTE: If a table already exists then it WILL NOT be dropped and recreated. If this is the required action then manual intervention"
echo "    will be required. This is to prevent accidental deletion of data. Read the error report at the end to determine when this occurs."
echo Please check the following parameters
echo
echo "Raw Table list           ${raw_table_list}  "
echo "Raw Table database           ${environment}${raw_db} "
echo "Refined Table list           ${refined_table_list}  "
echo "Refined Table database           ${environment}${refined_db} "

echo
echo "Raw tables"
cat ddl/${raw_table_list}
echo
echo "Refined tables"
cat ddl/${refined_table_list}
echo

select yn in "Continue" "Exit"; do
    case $yn in
        Continue ) main; break;;
        Exit ) exit;;
    esac
done


