query_id="$1"
curl -k -u ird0qal https://ird01au.vsp.sas.com:7183/api/v19/clusters/IRD-PRD-01/services/impala/impalaQueries/"$query_id"/cancel
