option sastrace=',,,d' sastraceloc=saslog nofullstimer nostsuffix compress=no;

proc sql;
connect to sqlsvr(Datasrc=NZO_GTAPP AUTHDOMAIN="start_operations" );
create view fdtmwhen_v as
select datepart(fdtmwhen) as fdtmwhen format=ddmmyy10.,
       sum(count) as count format=comma14.
  from connection to sqlsvr
  (select fdtmwhen,
          count(*) as count
     from dbo.tblemails
    group by fdtmwhen)
 group by calculated fdtmwhen;
disconnect from sqlsvr;
quit;

proc univariate data=fdtmwhen_v noprint;
var fdtmwhen;
weight count;
output out=fdtmwhen_percentiles pctlpre=p_
       pctlpts = 10 to 100 by 10;
run;

data fdtmwhen_percentiles;
set fdtmwhen_percentiles;
array p[*] p_:;
do i = 1 to dim(p);
   percentile = i;
   fdtmwhen = p[i];
   output;
   if i = 1
      then fdtmwhen = '1jan1800'd;
      else fdtmwhen = p[i - 1] + 1;
   output;
   end;
keep percentile fdtmwhen;
format fdtmwhen ddmmyy10.;
run;
   
proc means data=fdtmwhen_percentiles nway noprint;
by percentile;
var fdtmwhen;
output out=fdtmwhen_percentiles(drop=_type_ _freq_)
   min=min_fdtmwhen max=max_fdtmwhen;
run;

proc print data=_last_ noobs width=min;
run;
