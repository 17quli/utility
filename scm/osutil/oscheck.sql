select  *
from dev_raw.mhost_disk
where usep>${var:v1}
${var:v4}
;

select * 
from dev_raw.mhost_cpu
where usr+sys>${var:v3}
and run_date=(select max(run_date) from mhost);
;

select m.*,trunc(used/total*100) p 
from dev_raw.mhost_mem m 
where trunc(used/total*100)>${var:v2} and run_date=(select max(run_date) from mhost)
;
