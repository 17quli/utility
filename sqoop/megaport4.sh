cd /home/ird0qal/sqoop
./sqoop_import.sh nzo_gtapp tblnz_rtnpsoemployeeinfo dev_raw app_tblnz_rtnpsoemployeeinfo_lq fullreplacement 32 flngreturnkey
./sqoop_import.sh nzo_gtapp tblperiodbillitem dev_raw app_tblperiodbillitem_lq fullreplacement 48 flngBillItemKey
./sqoop_import.sh nzo_gtfrd tblfrdplandata_1336541184 dev_raw frd_tblfrdplandata_1336541184_lq fullreplacement 64 default

#./sqoop_import_db.sh nzo_gtapp dev_raw
#./sqoop_import.sh nzo_gtfrd tblfrdplandata_1336541184 dev_raw frd_tblfrdplandata_1336541184_lq fullreplacement 64 default
#./sqoop_import.sh nzo_gtfrd tblfrdplandata_1336541184 dev_raw frd_tblfrdplandata_1336541184_lq fullreplacement 16 default
#./sqoop_import.sh nzo_gtfrd tblfrdplandata_1336541184 dev_raw frd_tblfrdplandata_1336541184_lq fullreplacement 8 default
#./sqoop_import.sh nzo_gtfrd tblfrdplandata_1336541184 dev_raw frd_tblfrdplandata_1336541184_lq fullreplacement 4 default
#./sqoop_import.sh nzo_gtfrd tblfrdplandata_1336541184 dev_raw frd_tblfrdplandata_1336541184_lq fullreplacement 1 default
