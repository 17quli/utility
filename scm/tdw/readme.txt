1 : 01_create_table.sh <table_name>
#update tdw_tbl_list
10: 10_generate_load.sh
#cd to appropriate directory (dev/test/prod)
#tdw_all.sh execute 50,51,52 and 53 scripts
tdw_all.sh
	50: tdw.sh 50_tdw_backup.sql 
	51: tdw.sh 51_tdw_truncate.sql 
	52: tdw.sh 52_row_count.sql
	53: tdw.sh 53_tdw_load_to_app.sql
#run 54 after dip raw incremental load
54: tdw.sh 54_row_count.sql 

