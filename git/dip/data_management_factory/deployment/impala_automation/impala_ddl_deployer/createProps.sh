#!/bin/bash
if [ $# -ne 2 ]
  then
	echo
    echo "Incorrect arguments supplied"
	echo "Please provide name for input properties file"
	echo "Please provide name for deployment properties file"
	echo "This script will create it in the config folder"
	echo
	exit 9
fi

release_properties=config/$1
deploy_properties=config/$2

if [ -f "$release_properties" ]
then
  echo "$release_properties found."
else
     echo "Input properties file $1 not found."
     exit 1
fi

application_properties="config/application.properties"
time_stamp=`date +"%Y%m%d-%H%M%S"`

source ${release_properties}
#Program intro
echo -----------------------------
echo Impala Automation -- Checking DDL lists 
echo -----------------------------
echo ::: Configuration details :::
echo
# Read the properties file and echo the variables.
if [ -f "$application_properties" ]
then
  echo "$application_properties found."
  source ${application_properties}

  # Back up previous properties file
  mv ${deploy_properties} logs/${deploy_properties}-${time_stamp}

echo "    # Release specific properties"|tee -a ${deploy_properties}
echo "    #"|tee -a ${deploy_properties}
echo "    batch=${batch}"|tee -a ${deploy_properties}
echo "    deploy_raw=${deploy_raw}"|tee -a ${deploy_properties}
echo "    deploy_refined=${deploy_refined}"|tee -a ${deploy_properties}
echo "    environment=${environment}"|tee -a ${deploy_properties}
echo "    user_name=${user_name}"|tee -a ${deploy_properties}
echo "    # "|tee -a ${deploy_properties}
echo "    # Application properties "|tee -a ${deploy_properties}
echo "    #  "|tee -a ${deploy_properties}
echo "    target_root_folder=${target_root_folder}"|tee -a ${deploy_properties}
echo "    target_ddl_folder=${target_ddl_folder}"|tee -a ${deploy_properties}
echo "    #  "|tee -a ${deploy_properties}
echo "    source_ddl_folder=${source_ddl_folder}"|tee -a ${deploy_properties}
echo "    source_code_folder=${source_code_folder}"|tee -a ${deploy_properties}
echo "    raw_folder=${raw_folder}"|tee -a ${deploy_properties}
echo "    refined_folder=${refined_folder}"|tee -a ${deploy_properties}
echo "    #  "|tee -a ${deploy_properties}
echo "    raw_table_list=${raw_table_list}"|tee -a ${deploy_properties}
echo "    refined_table_list=${refined_table_list}"|tee -a ${deploy_properties}
echo "    refined_view_list=${refined_view_list}"|tee -a ${deploy_properties}
echo "    #  "|tee -a ${deploy_properties}
echo "    raw_db=${raw_db}"|tee -a ${deploy_properties}
echo "    dw_db=${dw_db}"|tee -a ${deploy_properties}
echo "    refined_db=${refined_db}"|tee -a ${deploy_properties}
echo "    full_view=${full_view}"|tee -a ${deploy_properties}
echo "    restricted_view=${restricted_view}"|tee -a ${deploy_properties}
echo "    cas_view=${cas_view}"|tee -a ${deploy_properties}
echo "    #  "|tee -a ${deploy_properties}
echo "    url=${url}"|tee -a ${deploy_properties}
echo "    target_server=${target_server}"|tee -a ${deploy_properties}  
echo "    cert=${cert}"|tee -a ${deploy_properties}
echo "    exe_host=${exe_host}"|tee -a ${deploy_properties}

else
      echo "$application_properties not found."
      exit 1
fi
echo


