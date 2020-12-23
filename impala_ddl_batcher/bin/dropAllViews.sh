#!/bin/bash
#########################################################################################################
#
# dropALLViews.sh
# Aaron Scoble
# 10/01/20202
#
##########################################################################################################
log=$1
# assign a variable so that property test will be case insensitive
y=y

function call_impala_shell(){
_tablename=$1
_view_db=$2
_log=$3

   impala-shell -V -k -i ${url} --ssl --ca_cert=${cert} --var=view_db=${_view_db} --var=table_name=${_tablename} -f ddl/generic/dropView.ddl &>> ${_log}

}

function raw_views(){

if [ -f "ddl/$raw_table_list" ]
then
  echo "ddl/$raw_table_list found."

  while IFS='=' read -r tablename
  do
   echo Dropping full and restricted views for ${tablename}
   call_impala_shell ${tablename} ${environment}${raw_db}${full_view} ${log}
   call_impala_shell ${tablename} ${environment}${raw_db}${restricted_view} ${log}
  done < "ddl/$raw_table_list"
else
  echo "ddl/$raw_table_list not found."
  exit 2
fi
}

function refined_views(){
if [ -f "ddl/$refined_table_list" ]
then
  echo "ddl/$refined_table_list found."

  while IFS='=' read -r tablename
  do
   echo Dropping full, restricted  and CAS views for ${tablename}
   call_impala_shell ${tablename} ${environment}${refined_db}${full_view} ${log}
   call_impala_shell ${tablename} ${environment}${refined_db}${restricted_view} ${log}
   call_impala_shell vw_${tablename} ${environment}${cas_view} ${log}
  done < "ddl/$refined_table_list"
else
  echo "ddl/$refined_table_list not found."
  exit 2
fi
}

if [ "${deploy_raw,,}" = "${y,,}" ]; then
    echo ----- raw tables and views ----- |tee -a ${log}
    raw_views
else
  echo No raw assets will be deployed
fi
 
if [ "${deploy_refined,,}" = "${y,,}" ]; then
     echo ----- refined tables and views ----- |tee -a ${log}
     refined_views
else
   echo No refined assets will be deployed
fi
