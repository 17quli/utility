select extract(year from fdtmfilingperiod),count(1) from lab_nzsr4_raw.tbldoctrn group by extract(year from fdtmfilingperiod) order by 1 desc;
