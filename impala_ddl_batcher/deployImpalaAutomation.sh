#!/bin/bash

properties="config/deploy.properties"

function deploy_raw(){
# Check table list exists. If so, copy it to execution server and read through it.
# For each entry in the table list, copy the DDL scripts
pwd

if [ -f "$raw_table_list" ]
then
  echo "$raw_table_list found." | tee -a ${log}
  scp -q ${raw_table_list} ${target_server}:${target_ddl_folder}/ddl/control_lists | tee -a ${log}
    while IFS='=' read -r tablename
      do
        echo Copying ddl for ${tablename}
	# Copy create scripts
        scp -q create_impala_tables/${tablename}-*.ddl ${target_server}:${target_ddl_folder}/ddl/create_impala_tables/ |tee -a ${log}
	# Copy view scripts
        scp -q create_impala_views/${tablename}-full.ddl ${target_server}:${target_ddl_folder}/ddl/create_impala_views/ |tee -a ${log}
        scp -q create_impala_views/${tablename}-restricted.ddl ${target_server}:${target_ddl_folder}/ddl/create_impala_views/ |tee -a ${log}
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
if [ -f "$refined_table_list" ]
then
  echo "$refined_table_list found." | tee -a ${log}
  scp -q ${refined_table_list} ${target_server}:${target_ddl_folder}/ddl/control_lists | tee -a ${log}
    while IFS='=' read -r tablename
      do
        echo Copying ddl for ${tablename}
	# Copy create scripts
        scp -q create_impala_tables/${tablename}-*.ddl ${target_server}:${target_ddl_folder}/ddl/create_impala_tables/ |tee -a ${log}
    done < "$refined_table_list"
else
  echo "$refined_table_list not found." |tee -a ${log}
  exit 2
fi

# Check table list exists. If so, copy it to execution server and read through it.
# For each entry in the table list, copy the DDL scripts
if [ -f "$refined_view_list" ]
then
  echo "$refined_view_list found." | tee -a ${log}
  scp -qr ${refined_view_list} ${target_server}:${target_ddl_folder}/ddl/control_lists | tee -a ${log}
    while IFS='=' read -r tablename
      do
        echo Copying ddl for ${tablename}
	# Copy view scripts
        scp -q create_impala_views/${tablename}-full.ddl ${target_server}:${target_ddl_folder}/ddl/create_impala_views/ |tee -a ${log}
        scp -q create_impala_views/${tablename}-restricted.ddl ${target_server}:${target_ddl_folder}/ddl/create_impala_views/ |tee -a ${log}
        scp -q create_impala_views/${tablename}-cas.ddl ${target_server}:${target_ddl_folder}/ddl/create_impala_views/ |tee -a ${log}
    done < "$refined_view_list"
else
  echo "$refined_view_list not found." |tee -a ${log}
  exit 2
fi

}

main(){
  this_folder=`pwd`
  time_stamp=`date +"%Y%m%d-%H%M%S"`
  log=${this_folder}/logs/deployImpalaAutomation-${time_stamp}.log

  #create a variable for 'Y' so the test can be case insensitive. Bash magic.
  y=y

  # create target folder structure
  echo 'Creating target folders'
  ssh -q  ${target_server} mkdir -p ${target_ddl_folder}/config/
  ssh -q  ${target_server} mkdir -p ${target_ddl_folder}/logs/
  ssh -q  ${target_server} mkdir -p ${target_ddl_folder}/ddl/create_impala_tables/
  ssh -q  ${target_server} mkdir -p ${target_ddl_folder}/ddl/create_impala_views/
  ssh -q  ${target_server} mkdir -p ${target_ddl_folder}/ddl/control_lists/
  ssh -q  ${target_server} mkdir -p ${target_ddl_folder}/ddl/generic/

  # Copy the root code folder
  echo Copying root code folder
  cd ${source_code_folder}
  scp -qr impala_ddl_batcher ${target_server}:${target_root_folder} |tee -a ${log}
  cd ${this_folder}

  #Copy properties file
  echo copying properties
  scp -q config/deploy.properties ${target_server}:${target_root_folder}/impala_ddl_batcher/config
  echo deploying DDL
  if [ "${deploy_raw,,}" = "${y,,}" ]; then
    echo ----- Deploying raw DDL ----- |tee -a ${log}
	cd ${source_ddl_folder}/impala_raw
    deploy_raw
  else
    echo No raw assets will be deployed
  fi
 
  if [ "${deploy_refined,,}" = "${y,,}" ]; then
     echo ----- Deploying refined DDL ----- |tee -a ${log}
	 cd ${source_ddl_folder}/impala_refined
     deploy_refined 
  else
   echo No refined assets will be deployed
  fi


  # Need to also copy the generic scripts
  echo Deploying generic scripts
  cd ${source_ddl_folder}
  scp -qr impala_generic/* ${target_server}:${target_ddl_folder}/ddl/generic/ |tee -a ${log}
  cd ${this_folder}
}

#Program intro
echo -----------------------------
echo Impala Automation -- Deploying assets |tee -a ${log}
echo -----------------------------
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


