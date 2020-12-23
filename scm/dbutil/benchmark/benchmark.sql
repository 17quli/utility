--select now();
insert overwrite dmod
select cl.* from (
	select edw.ird_number from (
		select dip_party_id, ird_number, count(*) cnt, min(record_effective_timestamp), max(record_effective_timestamp)
		from dmoa
		where party_type_code in ('IND')
		and party_origin = 'FIRST'
		group by dip_party_id, ird_number
		) ind
	full outer join (
		select dip_party_Id, ird_number, count(*) cnt, min(record_effective_timestamp), max(record_effective_timestamp)
		from dmob
		where party_type_code in ('IND')
		group by dip_party_id, ird_number
		) edw
	on ind.ird_number = edw.ird_number
--	where ind.ird_number is NULL
--	or edw.ird_number is NULL
	) chk_new
inner join dmoc cl
on cast(chk_new.ird_number as int) = cl.ird_number;
insert into mbenchmark values (1,'${var:v1}',now(),unix_timestamp(now())*1000+millisecond(now()) - unix_timestamp('${var:v1}')*1000 -millisecond('${var:v1}'));
--select (unix_timestamp(now())*1000+millisecond(now()) - unix_timestamp('${var:v1}')*1000 -millisecond('${var:v1}'))/1000;
