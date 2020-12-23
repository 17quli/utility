#!/bin/bash

function deploy_raw(){
# Check table list exists. If so, copy it to execution server and read through it.
# For each entry in the table list, copy the DDL scripts
pwd
log=$1

if [ -f "$raw_table_list" ]
then
  echo "$raw_table_list found." | tee -a  ${log}
   echo |tee -a ${log}
  cp -v ${raw_table_list} ${staging_folder}/ddl/control_lists >> ${log} 2>&1
    while IFS='=' read -r tablename
      do
        echo -- Copying ddl for ${tablename}  |tee -a ${log}
	# Copy create scripts
        cp -v create_impala_tables/${tablename}-*.ddl ${staging_folder}/ddl/create_impala_tables/ >> ${log} 2>&1
	# Copy view scripts
        cp -v create_impala_views/${tablename}-full.ddl ${staging_folder}/ddl/create_impala_views/ >> ${log} 2>&1
        cp -v create_impala_views/${tablename}-restricted.ddl ${staging_folder}/ddl/create_impala_views/ >> ${log} 2>&1
    done < "$raw_table_list"
else
  echo "$raw_table_list not found." |tee -a ${log}
  exit 2
fi
}

function deploy_refined (){
# Check table list exists. If so, copy it to execution server and read through it.
# For each entry in the table list, copy the DDL scripts
pwd
log=$1

if [ -f "$refined_table_list" ]
then
  echo "$refined_table_list found." | tee -a  ${log}
   echo |tee -a ${log}
  cp -v  ${refined_table_list} ${staging_folder}/ddl/control_lists >> ${log} 2>&1
    while IFS='=' read -r tablename
      do
        echo -- Copying ddl for ${tablename}| tee -a  ${log}
	# Copy create scripts
        cp  -v create_impala_tables/${tablename}-*.ddl ${staging_folder}/ddl/create_impala_tables/ >> ${log} 2>&1
    done < "$refined_table_list"
else
  echo "$refined_table_list not found." |tee -a ${log}
  exit 2
fi

# Check table list exists. If so, copy it to execution server and read through it.
# For each entry in the table list, copy the DDL scripts
if [ -f "$refined_view_list" ]
then
  echo "$refined_view_list found." | tee -a  ${log}
   echo |tee -a ${log}
  cp -r ${refined_view_list} ${target_server}:${target_root_folder}/ddl/control_lists >> ${log} 2>&1
    while IFS='=' read -r tablename
      do
        echo -- Copying ddl for ${tablename}
	# Copy view scripts
        cp -v create_impala_views/${tablename}-full.ddl ${staging_folder}/ddl/create_impala_views/ >> ${log} 2>&1
        cp -v create_impala_views/${tablename}-restricted.ddl ${staging_folder}/ddl/create_impala_views/ >> ${log} 2>&1
        cp -v create_impala_views/${tablename}-cas.ddl ${staging_folder}/ddl/create_impala_views/ >> ${log} 2>&1
    done < "$refined_view_list"
else
  echo "$refined_view_list not found." |tee -a ${log}
  exit 2
fi

}

main(){
  this_folder=`pwd`
  time_stamp=`date +"%Y%m%d-%H%M%S"`
  log=${this_folder}/logs/deploy-${time_stamp}.log

  #create a variable for 'Y' so the test can be case insensitive. Bash magic.
  y=y
  staging_folder=${this_folder}/staging/${batch}_${environment}
  
  echo Creating staging folder |tee -a ${log}
   echo |tee -a ${log}
  
  mkdir -p ${staging_folder}
  # create target folder structure
  echo 'Creating staging folders'
  mkdir -p ${staging_folder}/config/ >> ${log} 2>&1
  mkdir -p ${staging_folder}/logs/ >> ${log} 2>&1
  mkdir -p ${staging_folder}/ddl/create_impala_tables/ >> ${log} 2>&1
  mkdir -p ${staging_folder}/ddl/create_impala_views/ >> ${log} 2>&1
  mkdir -p ${staging_folder}/ddl/control_lists/ >> ${log} 2>&1
  mkdir -p ${staging_folder}/ddl/generic/ >> ${log} 2>&1
 
  # Copy the root code folder
  echo Copying root code folder |tee -a ${log}
   echo |tee -a ${log}
  cd ${source_code_folder}
  cp -rv impala_ddl_batcher/* ${staging_folder} | tee -a  ${log}
  cd ${this_folder}

  #Copy properties file
  echo copying properties |tee -a ${log}
   echo |tee -a ${log}
   
  cp ${properties} ${staging_folder}/config
  echo deploying DDL |tee -a ${log}
   echo |tee -a ${log}
   
  if [ "${deploy_raw,,}" = "${y,,}" ]; then
    echo ----- Deploying raw DDL ----- |tee -a ${log}
	 echo |tee -a ${log}
	cd ${source_ddl_folder}/impala_raw
    deploy_raw ${log}
  else
    echo No raw assets will be deployed
  fi
 
  if [ "${deploy_refined,,}" = "${y,,}" ]; then
     echo ----- Deploying refined DDL ----- |tee -a ${log}
	  echo |tee -a ${log}
	 cd ${source_ddl_folder}/impala_refined
     deploy_refined ${log}
  else
   echo No refined assets will be deployed
  fi


  # Need to also copy the generic scripts
  echo | tee -a  ${log}
  echo Deploying generic scripts |tee -a ${log}
   echo |tee -a ${log}
  cd ${source_ddl_folder}
  cp -rv impala_generic/* ${staging_folder}/ddl/generic/ | tee -a  ${log}
  
  echo rsync staging folder to execution server |tee -a ${log}
  echo |tee -a ${log}
  
  rsync -rvz --no-motd  ${staging_folder} ${target_server}:${target_root_folder} |tee -a ${log}

}

#Program intro
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

echo ----------------------------- |tee -a ${log}
echo Impala Automation -- Deploying assets |tee -a ${log}
echo ----------------------------- |tee -a ${log}
echo ::: Configuration details :::
echo
# Read the properties file and echo the variables.
if [ -f "$properties" ]
then
  echo "$properties found."|tee -a ${log}
  cat ${properties}
  set -o allexport
  source ${properties}
else
      echo "$properties not found."
      exit 1
fi
echo
echo Are properties correct? Continue?

select yn in "Continue" "Exit"; do
    case $yn in
        Continue ) main; break;;
            Exit ) exit;;
    esac
done


