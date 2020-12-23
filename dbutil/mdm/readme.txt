10 DDL load to mdm					:load_mdm.sh <table_list_file>

20 deploy all objects (table, full, restricted views) 	:deploy_object_all.sh
21 deploy tables 					:deploy_object.sh <database environment> <database layer> table <table_list_file>
22 deploy full access views 				:deploy_object.sh <database environment> <database layer> full_view <table_list_file>
23 deploy restricted access views 			:deploy_object.sh <database environment> <database layer> restricted_view <table_list_file>

30 remove all objects(table, full, restricted views) 	:remove_object_all.sh 
31 remove full access views  				:remove_object.sh <database environment> <database layer> full_view <table_list_file>
32 remove restricted access views  			:remove_object.sh <database environment> <database layer> restricted_view <table_list_file>
33 remove tables  					:remove_object.sh <database environment> <database layer> table <table_list_file>
34 remove mdm entries  					:remove_object.sh <database environment> <database layer> mdm <table_list_file>

40 move all objects to test|production			:mtx_all.sh <database environment> <database layer> <table_list_file>
41 move mdm entries to test|production			:mtx.sh <database environment> <database layer> mdm <table_list_file>
42 move tables to test|production			:mtx_all.sh <database environment> <database layer> table <table_list_file>
43 move full access views to test|production		:mtx_all.sh <database environment> <database layer> full_view <table_list_file>
44 move restricetd access views to test|production	:mtx_all.sh <database environment> <database layer> restricted_view <table_list_file>
