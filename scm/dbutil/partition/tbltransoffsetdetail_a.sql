select extract(year from fdtmeffective),count(1) from lab_nzsr4_raw.tbltransoffsetdetail group by extract(year from fdtmeffective) order by 1 desc;
