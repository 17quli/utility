awk '{print "from t3 \ninsert into t4  partition(txn_return_period_year="$1",tax_type) \nselect ird_number,location_number,return_period_date,seq_no,account_no,amount,transaction_code,transaction_type,transaction_status_code,payment_method_code,transaction_reason_code,return_type,user_id,date_effective,date_processed,date_reversed,account_key_link,transaction_seq_link,office_number,office_type,`timestamp`,tax_type \nwhere date_format(return_period_date,\047yyyy\047)=\047"$1"\047;"}' 1p.lst
