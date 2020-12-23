if [ $# -eq 1 ] 
then
	days=$1
else 
	days=1
fi

bhist -ewu all -S `date -d "${days} day ago" +%Y/%m/%d/20:00`,`date +%Y/%m/%d/07:00`
