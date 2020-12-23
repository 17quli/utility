select taxyear_sk,count(1) from lab_fcp_raw.pty_pd_property_taxyear group by taxyear_sk order by 1 desc;
