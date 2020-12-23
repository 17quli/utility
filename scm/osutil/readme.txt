10.	create mhost: run host.sql; hdfs dfs -put -f ci.lst /env/1_dev/hive/raw/mci; refresh mci
20.	edit zealandia to include all the hosts to monitoring scope
30.	
	category=disk
	component=<mount_point>
	v1=used
	v2=total
	v3=available
40.	
	category=memory
	component=Mem/Total
	v1=used
	v2=total
	v3=free
50.	
	category=cpu
	component=all
	v1=user
	v2=sys
	v3=wa
	v4=steal
	v5=ni
	v6=idle
