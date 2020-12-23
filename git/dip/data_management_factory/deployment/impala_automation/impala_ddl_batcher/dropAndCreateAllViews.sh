#!/bin/bash
#################################################################################################################
#
#   dropAndCreateViews.sh
#   Aaron Scoble
#   04/02/2020
#
#################################################################################################################

time_stamp=`date +"%Y%m%d-%H%M%S"`
log="logs/dropAndCreateImpalaViews_${raw_view_db}-${time_stamp}.log"
# assign a variable so that property test will be case insensitive
y=y

function call_impala_shell(){
_tablename=$1
_view_db=$2
_src_db=$3
_log=$4
_view_suffix=$5
_view_prefix=""

#cas views are prefixed with vw_ which is inconsistent with all other view types. This will add it when required.
if [ "${_view_suffix,,}" = "cas" ]; then
     _view_prefix="vw_"
fi
   impala-shell -V -k -i ${url} --ssl --ca_cert=${cert} --var=view_db=${_view_db} --var=table_name=i${_view_prefix}${_tablename} --var=source_db=${_src_db} -f ddl/create_impala_views/${_tablename}-${_view_suffix}.ddl &>> ${_log}

}

function raw_views(){

if [ -f "ddl/$raw_table_list" ]
then
  echo "ddl/$raw_table_list found."

  while IFS='=' read -r tablename
  do
   echo Creating full and restricted views for ${tablename}
   call_impala_shell ${tablename} ${environment}${raw_db}${full_view} ${environment}${raw_db} ${log} full
   call_impala_shell ${tablename} ${environment}${raw_db}${restricted_view} ${environment}${raw_db} ${log} restricted
  done < "ddl/$raw_table_list"
else
  echo "ddl/$raw_table_list not found."
  exit 2
fi
}

function refined_views(){
if [ -f "ddl/$refined_view_list" ]
then
  echo "ddl/$refined_view_list found."

  while IFS='=' read -r tablename
  do
   echo Creating full, restricted  and CAS views for ${tablename}
   call_impala_shell ${tablename} ${environment}${refined_db}${full_view} ${environment}${refined_db} ${log} full
   call_impala_shell ${tablename} ${environment}${refined_db}${restricted_view} ${environment}${refined_db} ${log} restricted
   call_impala_shell ${tablename} ${environment}${cas_view} ${environment}${refined_db} ${log} cas
  done < "ddl/$refined_view_list"
else
  echo "ddl/$refined_view_list not found."
  exit 2
fi
}

function main() {
  # ----- Drop the views
  echo Dropping full and restricted views
  sh bin/dropAllViews.sh ${log} | tee -a ${log}
  echo sleeping 5 seconds so hopefully impala will figure out the views have been dropped
  sleep 5
  echo ok waking up again
  # ------ Now create the  views
  echo Creating full and restricted views
  if [ "${deploy_raw,,}" = "${y,,}" ]; then
    echo ----- raw views ----- |tee -a ${log}
    raw_views
  else
    echo No raw assets will be deployed
  fi
 
  if [ "${deploy_refined,,}" = "${y,,}" ]; then
     echo ----- refined iews ----- |tee -a ${log}
     refined_views
  else
     echo No refined assets will be deployed
fi

  # Parse the log for errors
  echo Parsing log for errors
  grep -A1 -b2 -ie error -ie errno ${log} |tee logs/errors-views-${time_stamp}.log
  echo If any errors are displayed here, they will be in logs/errors-views-${time_stamp}.log
  echo Full log file is ${log}
  echo -----------------------  DONE --------------------------------
}


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

# Main entry point. Display basic instructions and get user to confirm the settings.
clear
echo dropAndCreateViews.sh
echo "    Drops and creates full and restricted views for the tables listed by reading in a table list and executing"
echo "       A series of DDL scripts. Each table will have a full and restricted DDL file associated with it."
echo 
echo "NOTE: This script does not stop execution on impala errors nor does it check that all the DDL files exist. To help error checking"
echo "    it will grep the log file for errors and create a summary error log."
echo
echo Please check the following parameters
echo
echo "Raw Table_list                      ${raw_table_list}  "
echo "Refined Table_list                  ${refined_table_list}"
echo "Refined View_list                   ${refined_view_list} "
echo "Raw Source database                 ${environment}${raw_db}   "
echo "--- Raw full view database              ${environment}${raw_db}${full_view}   "
echo "--- Raw restricted view database        ${environment}${raw_db}${restricted_view}   "
echo "Refined Source database             ${environment}${refined_db}"
echo "--- Refined full view database          ${environment}${refined_db}${full_view}"
echo "--- Refined restricted view database    ${environment}${refined_db}${restricted_view}"
echo "--- Refined cas view database           ${environment}${refined_db}${cas_view}"
echo
echo

select yn in "Continue" "Exit"; do
    case $yn in
        Continue ) main; break;;
        Exit ) exit;;
    esac
done

