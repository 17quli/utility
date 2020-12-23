./prestart.sh <table_name>
	1. 01_create_table.sh <table_name>

./poststart.sh <table_name> <lab_project>
	2. 02_copy_table.sh <table_name>
	3. 03_create_full_view.sh <table_name>
	4. 04_create_restricted_view.sh <table_name>
	5. 05_create_lab_view.sh <table_name> <lab_project>
	6. cmd.sh 10_validate_table.sql [<table_name> <lab_project>]
