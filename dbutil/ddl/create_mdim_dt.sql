drop table mdim_dt;
create table mdim_dt 
(
fintkey		bigint,
fdtmdate	timestamp,
fintyear 	int,
fintquarter	int,
fintmonth	int,
fintday		int
)
stored as parquet;
