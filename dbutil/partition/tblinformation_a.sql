select extract (year from fdtmfilingperiod),count(1) from lab_fcp_raw.tblinformation group by extract (year from fdtmfilingperiod) order by 1 desc;
