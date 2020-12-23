%macro hadoop_exist(dsn=ClouderaImpala64, schema=, table=);
/*
    Name:                           Hadoop Exist
    Author:                         Laurie Fleming, Tenzing / Daemons Ltd
    Date-written:                   9 January 2019
    Remarks:                        Uses Impala command "show tables" to check if a table exists.
                                    More reliable, because of Impala issues, than SAS exist function.

    Modification History            (in reverse chronological order)
    Laurie Fleming                  First written
    9 January 2020
*/
%if %eval(%symexist(_exist) = 0) %then
    %global _exist;
%let _exist = No;
proc sql noprint;
connect to impala(dsn=&dsn schema=&schema);
select ifc(coalesce(count(*), 0) = 0, 'No', 'Yes')
  into :_exist trimmed
  from connection to impala
  (show tables like "&table");
disconnect from impala;
quit;
%mend hadoop_exist;