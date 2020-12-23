select extract(year from fdtmeffectivedate),count(1) from lab_nzsr4_raw.tblnz_ksscontributiondetail group by extract(year from fdtmeffectivedate) order by 1 desc;
