#!/bin/bash
#################################################################################################################
#
#   dropLabViews.sh
#   Aaron Scoble
#   28/01/2020
#
#################################################################################################################
drop_lab_view_list=$1

time_stamp=`date +"%Y%m%d-%H%M%S"`
log="../logs/dropLabViews_${time_stamp}.log"

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


drop_lab_views() {
  echo Dropping lab views
	if [ -f "$drop_lab_view_list" ]
	then
	  echo "$drop_lab_view_list found."

	  while IFS='=' read -r viewname
	  do
	   echo Dropping ${viewname}
	   impala-shell -V -k -i ${url} --ssl --ca_cert=${cert} --var=view_name=${viewname} -f ../ddl/generic/dropLabView.ddl &>> ${log}
	  done < "$drop_lab_view_list"
	else
	  echo "$drop_lab_view_list not found."
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
echo dropLabViews.sh
echo "    Drops impala lab views by reading through the table list and running a series of DDL scripts."
echo 
echo "NOTE: This script does not stop execution on impala errors nor does it check that all the DDL files exist. To help error checking"
echo "    it will grep the log file for errors and create a summary error log."
echo
echo Please check the following parameters
echo
echo "View list            ${drop_lab_view_list}     "
echo
cat  ${drop_lab_view_list} 
echo

select yn in "Continue" "Exit"; do
    case $yn in
        Continue ) drop_lab_views; break;;
        Exit ) exit;;
    esac
done

