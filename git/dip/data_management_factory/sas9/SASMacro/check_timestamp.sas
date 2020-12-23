%macro check_timestamp(table=, key=, schema=dev_raw, limit=5);
%local i sql_key left_sql_key word join _nobs;
%let sql_key = %sysfunc(translate(&key, %str(,), %str( )));
%let i = 0;
%let left_sql_key =;
%do %until(&word =);
    %let i = %eval(&i + 1);
    %let word = %sysfunc(scan(&key, &i, %str( )));
    %if &word = %then 
        %goto Break;
    %let word = `&word`;
    %if %eval(&i = 1)
        %then %do;
              %let left_sql_key = _l.&word;
              %let join = %quote(_l.&word = _r.&word);
              %end;
        %else %do;
              %let left_sql_key = &left_sql_key, _l.&word;
              %let join = &join and %quote(_l.&word = _r.&word);
              %end;
    %Break:  
    %end;
proc sql;
connect to impala(SCHEMA=&schema DSN=ClouderaImpala64);
create table errors(compress=no) as
   select &sql_key,
          record_effective_timestamp format=datetime22.3,
          record_expiry_timestamp format=datetime22.3
     from connection to impala
     (with 
        new_ranked as
        (select &sql_key,
                `record_effective_timestamp`,
                `record_expiry_timestamp`,
                rank() over (partition by &sql_key
                                 order by `record_effective_timestamp` desc) as `rank`
           from &schema..&table),

        previous_row as
        (select &sql_key,
                `record_effective_timestamp`,
                `record_expiry_timestamp`,
                `rank` - 1 as `rank`
           from new_ranked)

     select &left_sql_key,
           _l.`record_effective_timestamp`,
           _l.`record_expiry_timestamp`,
           _r.`record_expiry_timestamp` as `previous_expiry`
      from new_ranked as _l
      left  join previous_row as _r
        on &join
       and _l.`rank` = _r.`rank`
     where _l.`record_effective_timestamp` != milliseconds_add(_r.`record_expiry_timestamp`, 1)
        or _l.`record_effective_timestamp` >= _l.`record_expiry_timestamp`
     order by &left_sql_key,
              _l.`record_effective_timestamp`
     limit &limit);
%let _nobs = &sqlobs;
disconnect from impala;
quit;

%if %eval(&_nobs ne 0) %then %do;
    %rcset(8);
    proc print data=errors(obs=&limit) noobs width=min;
    title "Timestamp errors in &table";
    run;
    %end;
%mend check_timestamp;