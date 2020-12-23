cd /home/ird0qal/sqoop
./sqoop_import.sh nzo_gtapp tblperiodbillitem dev_raw app_tblperiodbillitem_lq fullreplacement 8 flngBillItemKey
./sqoop_import_db.sh nzo_gtapp dev_raw
./sqoop_import.sh nzo_gtapp tblperiodbillitem dev_raw app_tblperiodbillitem_lq fullreplacement 4 flngBillItemKey
./sqoop_import.sh nzo_gtapp tblperiodbillitem dev_raw app_tblperiodbillitem_lq fullreplacement 3 flngBillItemKey
