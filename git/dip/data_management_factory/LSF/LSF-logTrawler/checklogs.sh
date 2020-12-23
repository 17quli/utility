#!/bin/bash

# command line args
# Dates in format YYYY/MM/DD/HH:MM
# Back lines is how many lines to go back from where 'error' is detected in the log 
yesterday_date=$1
today_date=$2
back_lines=$3

# This is the system folder where the LSF logs live
log_folder=/sso/biconfig/940/Lev1/Logs/
email_to=dipetldev@ird.govt.nz

# define log file name
# requires a logs/folder
time_stamp=`date +"%Y%m%d-%H%M%S"`
log="logs/errors_${time_stamp}.log"

# Query using bhist to find all the jobs which failed overnight.
# Uses bhist to get 'wide' format and then parses out the generic log name
# (Does not include the date/time component)
log_names=$(bhist -ewu all -S ${yesterday_date},${today_date} | cut -d: -f5,6 |cut -d' ' -f1 | tr : _ )

# Iterate through the log names of the failed jobs
for name in  ${log_names}
do
  # As the output has a header row, do a null operation to ignore it
  if [[ "${name}" = JOBID ]]
  then
     fake_value=${name} 
  else
      # Append the log folder to create an absolute path
      generic_log_file=${log_folder}*${name} 
      # To find the specific log file, we use ls -lt which will order the log files, newest at the top
      # Then we use head -1 to pick up only the latest one
      # Awk then parses out the specific and absolute filename, which we will then search.
      specific_log_file=$(ls -lt ${generic_log_file}* | head -1 | awk '{print $9}')
      echo -------------------------------------------------------------------------------------- >> ${log}
      echo ${specific_log_file}>> ${log}
      echo -------------------------------------------------------------------------------------- >> ${log}
      # Using grep, look for case-insensitive ocurrences of the word error.Go back some number of lines.
      # Then write the results out to the log file.
      grep -b${back_lines} -i error  < $(ls -lt ${generic_log_file}* | head -1 | awk '{print $9}') >>${log} 
  fi
done

cat ${log}
