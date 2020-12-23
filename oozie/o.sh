#oozie job -submit -oozie http://ird10139au.vsp.sas.com:11000/oozie/ -config /home/ird0qal/oozie/backup.properties -auth KERBEROS
oozie job -oozie http://ird10139au.vsp.sas.com:11000/oozie -config /home/ird0qal/oozie/helloworld.properties -run
