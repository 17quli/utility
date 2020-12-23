cd /home/ird0qal/sqoop
./sqoop_import.sh nzo_gtapp tblperiodbillitem dev_raw app_tblperiodbillitem_lq fullreplacement 16 flngBillItemKey
./sqoop_import.sh nzo_gtapp tblperiodbillitem dev_raw app_tblperiodbillitem_lq fullreplacement 32 flngBillItemKey
./sqoop_import_db.sh nzo_gtapp dev_raw
#./sqoop_import.sh nzo_gtfrd tblfrdplandata_1336541184 dev_raw frd_tblfrdplandata_1336541184_lq fullreplacement 32 default
./sqoop_import.sh nzo_gtfrd tblfrdplandata_1336541184 dev_raw frd_tblfrdplandata_1336541184_lq fullreplacement 16 default
#./sqoop_import.sh nzo_gtfrd tblfrdplandata_1336541184 dev_raw frd_tblfrdplandata_1336541184_lq fullreplacement 8 default
./sqoop_import.sh nzo_gtfrd tblfrdplandata_1336541184 dev_raw frd_tblfrdplandata_1336541184_lq fullreplacement 4 default
#./sqoop_import.sh nzo_gtfrd tblfrdplandata_1336541184 dev_raw frd_tblfrdplandata_1336541184_lq fullreplacement 2 default
./sqoop_import.sh nzo_gtfrd tblfrdplandata_1336541184 dev_raw frd_tblfrdplandata_1336541184_lq fullreplacement 1 default
#./sqoop_import.sh nzp_gtsyt tblcontrolusageactionlog  dev_raw syt_tblctrlusageactionlog_lq fullreplacement 8 fdtmwhen

