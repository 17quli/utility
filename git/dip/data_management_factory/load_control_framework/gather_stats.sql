begin
dbms_stats.gather_schema_stats(
'lcf',
options=>'GATHER AUTO',
estimate_percent =>
DBMS_STATS.AUTO_SAMPLE_SIZE,
method_opt => 'FOR ALL COLUMNS SIZE AUTO',
cascade => TRUE);
end;