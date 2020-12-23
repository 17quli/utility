#!/bin/bash

# Read the properties file and echo the variables.
read_control_list(){
control_list=$1
if [ -f "$control_list" ]
then
    while IFS= read -r line 
      do
        echo $line | tee -a ${log}
      done < "$control_list"
else
      echo "$control_list not found." | tee -a ${log}
      exit 1
fi
}


main(){
  this_folder=`pwd`
  time_stamp=`date +"%Y%m%d-%H%M%S"`
  log=${this_folder}/logs/checkListContents-${time_stamp}.log
  # assign a variable so that property test will be case insensitive
  y=y

  if [ "${deploy_raw,,}" = "${y,,}" ]; then
    echo ----- raw tables and views ----- |tee -a ${log}
    read_control_list ${source_ddl_folder}/${raw_folder}/${raw_table_list}
  else
     echo No raw assets will be deployed
   fi

echo

  if [ "${deploy_refined,,}" = "${y,,}" ]; then
    echo ----- refined tables ----- |tee -a ${log}
    read_control_list ${source_ddl_folder}/${refined_folder}/${refined_table_list}
    echo
    echo ----- refined views ----- |tee -a ${log}
    read_control_list ${source_ddl_folder}/${refined_folder}/${refined_view_list}
  else
     echo No refined assets will be deployed.
   fi


 #   echo ----- raw truncate tables ----- |tee -a ${log}
 #   read_control_list ${source_ddl_folder}/${refined_folder}/${refined_view_list}

 #   echo ----- raw drop tables ----- |tee -a ${log}
 #   read_control_list ${source_ddl_folder}/${refined_folder}/${refined_view_list}

 #   echo ----- refined truncate tables ----- |tee -a ${log}
 #   read_control_list ${source_ddl_folder}/${refined_folder}/${refined_view_list}

  #  echo ----- refined drop tables ----- |tee -a ${log}
  #  read_control_list ${source_ddl_folder}/${refined_folder}/${refined_view_list}
}

#---------------------------------------------------
properties="config/deploy.properties"

#Program intro
echo -----------------------------
echo Impala Automation -- Checking DDL lists |tee -a ${log}
echo -----------------------------
echo ::: Configuration details :::
echo
# Read the properties file and echo the variables.
if [ -f "$properties" ]
then
  echo "$properties found."|tee -a ${log}
  cat  ${properties}
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


