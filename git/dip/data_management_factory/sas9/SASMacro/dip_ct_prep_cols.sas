%macro dip_ct_prep_cols(ignore_cols=,esp_char=`);

/*

Macro used to assmble various column select strings used by DI custom transformation

Usage:
Execute this at the start of a custom transformation macro.

ignore_cols: columns to ignore when assembling the columns list variables.
esp_char: this char is used to encapsulate the column names

@author				Max Wang <yang.wang@ird.govt.nz>
@first written		1/05/2019

*/

	
	%global key_cols_fmt source_cols_fmt target_cols_fmt mapped_cols_fmt key_join 
	key_concat_stmt value_concat_stmt input_lib input_table input_schema 
	output_lib output_table output_schema ref_lib ref_table ref_schema order_cols_fmt val_sk_cols_fmt
	l_key_cols_fmt;
	
	/* assemble the key column select string. */
	%if %symexist(key_cols_count) %then
	%do;		
		data _null_;
		  	length key_cols $32767;
		  	length key_concat_stmt $32767;
		  	length l_key_cols $32767;
		  	key_count = symget('key_cols_count');
		  	esp_char = symget('esp_char');
		  	/*loop through the key_cols list*/
			do i=1 to key_count;
				var = cats('key_cols',i);
				val = symget(var);
				esp_col = cats(esp_char,val,esp_char);
				esp_col2 = cats('nvl(cast(',esp_char,val,esp_char,' as string),'''')');
				/* the first element. */
				if i = 1  then 
				do;			
					key_cols= esp_col;				
					key_concat_stmt = cats('concat_ws(''~'',',esp_col2);			
					l_key_cols= cats('l.',esp_col); 
				end;
				/* next element. */
				if i ^= 1  then
				do;
					 key_cols= cats(key_cols ,',' ,esp_col );
					 key_concat_stmt= cats(key_concat_stmt ,',',esp_col2);
					 l_key_cols= cats(l_key_cols ,',' ,'l.',esp_col);
				end;
			end;
			key_concat_stmt=cats(key_concat_stmt,')');
			/* Pass the key column values back to the parent through gloabl variables.*/
			/* example: `col1`,`col2`,`col3` */
		  	call symputx('key_cols_fmt',key_cols,'G') ;
		  	/* example: concat_ws(`col1`,'~',`col2`) */
		  	call symputx('key_concat_stmt',key_concat_stmt,'G') ;
		  	/* example: l.`col1`,l.`col2`,l.`col3` */
		  	call symputx('l_key_cols_fmt',l_key_cols,'G') ;
		run;
	%end;

	%if %symexist(value_cols_count) %then
	%do;
		data _null_;
		  	length value_concat_stmt $32767;
		  	val_count = symget('value_cols_count');
		  	esp_char = symget('esp_char');
		  	/* loop through the value_cols list */
			do i=1 to val_count;
				var = cats('value_cols',i);
				val = symget(var);
				esp_col = cats('nvl(cast(',esp_char,val,esp_char,' as string),'''')');
				if i = 1  then value_concat_stmt= cats('concat_ws(''~'',',esp_col);		
				if i ^= 1  then value_concat_stmt= cats(value_concat_stmt ,',',esp_col);
			end;
			value_concat_stmt=cats(value_concat_stmt,')');
			/* example: concat_ws(`col1`,'~',`col2`) */
		  	call symputx('value_concat_stmt',value_concat_stmt,'G') ;
		run;
	%end;

	%if %symexist(order_cols_count) %then
	%do;
		data _null_;
		  	length order_cols $32767;
		  	keep_last = symget('keep_last');
		  	esp_char = symget('esp_char');
		  	order_count = symget('order_cols_count');
		  	/* loop through the order_cols list */
			do i=1 to order_count;
				var = cats('order_cols',i);
				val = symget(var);
				reversed = 0;
				do x=1 to symget('order_reversed_cols_count');
					rvar = cats('order_reversed_cols',x);
					rval = symget(rvar);
					if rval=val then reversed = 1;
				end;
				if ^reversed and ^keep_last then esp_val = cats(esp_char,val,esp_char);
				if reversed and ^keep_last then esp_val = cats(esp_char,val,esp_char,' desc');
				if ^reversed and keep_last then esp_val = cats(esp_char,val,esp_char,' desc');
				if reversed and keep_last then esp_val = cats(esp_char,val,esp_char);
				if i ^= 1  then order_cols= cats(order_cols ,',' ,esp_val );
				if i = 1  then order_cols= cats(esp_val);				
			end;
			/* example: `col1`,`col2` desc,`col3` desc */
		  	call symputx('order_cols_fmt',order_cols,'G') ;
		run;	
	%end;
	
	%if %symexist(_OUTPUT_col_count) %then
	%do;
		data _null_;
		  	length target_cols_fmt $32767;
		  	length mapped_cols_fmt $32767;
		  	length source_cols_fmt $32767;
		 	length key_join $32767;	  
		 	length mapped_input $32767;
		 	length val3 $32767; 
		  	idx=0;
		  	ikey = 0;
		  	key_cols_fmt = symget('key_cols_fmt');	  	
		  	ignore_cols = symget('ignore_cols');
		  	esp_char = symget('esp_char');
		  	/*loop through the input and output column lists*/
			do i=0 to (symget('_OUTPUT_col_count')-1);
				val = symget(cats('_OUTPUT_col',i,'_input'));
				val2 = symget(cats('_OUTPUT_col',i,'_name'));
				val3 = symget(cats('_OUTPUT_col',i,'_exp'));
				esp_col = cats(esp_char,val,esp_char);
				esp_col2 = cats(esp_char,val2,esp_char);
				if val3='' then mapped_input=esp_col; else mapped_input=val3;
				ignoreidx=find(ignore_cols,cats('''',val2,''''),'i');
				/* dont' process columns in the ignore list. */
				if ignoreidx = 0 then
				do;
					if idx ^= 0  then 
					do;
						source_cols_fmt=cats(source_cols_fmt ,',' ,esp_col );
						target_cols_fmt=cats(target_cols_fmt ,',' ,esp_col2 );
						mapped_cols_fmt = cats(mapped_cols_fmt,",",catx(" ",mapped_input,"as",esp_col2));
					end;
					if idx = 0 then 
					do;
						source_cols_fmt= esp_col;	
						target_cols_fmt= esp_col2;				
						mapped_cols_fmt=catx(" ",mapped_input,"as",esp_col2);
					end;
					idx=idx+1;
				end;
				fkeyidx=find(cats(key_cols_fmt),cats(esp_col),'i');
				/* Prepare the join statement if it is a key column. */
				if fkeyidx > 0 then
				do;
					if ikey ^= 0  then key_join= catx(' ',key_join ,cats('and l.',esp_col),'=',cats('r.',esp_col2) );
					else key_join= catx(' ',cats('l.',esp_col),'=',cats('r.',esp_col2) );
					ikey=ikey+1;
				end;
			end;
			/* example: `col1`,`col2`,`col3` */
			call symputx('source_cols_fmt',source_cols_fmt,'G') ;
			/* example: `col1`,`col2`,`col3` */
		  	call symputx('target_cols_fmt',target_cols_fmt,'G') ;
		  	/* example: `col1` as `col1	,`col2` as `col2`,`col3` as `col3` */
		  	call symputx('mapped_cols_fmt',mapped_cols_fmt,'G') ;
		  	/* example: l.`col1` = r.`col1` and l.`col2` = r.`col2` */
		  	call symputx('key_join',key_join,'G') ;	 
		run;
	%end; 
	
	/* Get the input hive db name. */
	%if %symexist(_INPUT0) %then
	%do;
		%let input_lib=%scan(&_INPUT0,1,'.');
		%let input_table=%scan(&_INPUT0,2,'.');
		
		proc sql noprint;
		   select
		         sysvalue into:input_schema trimmed 
		   from dictionary.LIBNAMES
		      where libname = upcase("&input_lib") and sysname = 'Schema'
		   ;
		   %rcSet(&sqlrc);
		quit;
		%if %eval(&job_rc > 4) %then %goto EXIT; 
	%end;

	/* Get the output hive db name. */
	%if %symexist(_OUTPUT0) %then
	%do;	
		%let output_lib=%scan(&_output0,1,'.');
		%let output_table=%scan(&_output0,2,'.');
		
		proc sql noprint;
		   select
		         sysvalue into:output_schema trimmed 
		   from dictionary.LIBNAMES
		      where libname = upcase("&output_lib") and sysname = 'Schema'
		   ;
		%rcSet(&sqlrc);  
		quit;
		%if %eval(&job_rc > 4) %then %goto EXIT; 
	%end; 

	/* Get the reference hive db name. */
	%if %symexist(_INPUT1) %then
	%do;	
		%let ref_lib=%scan(&_INPUT1,1,'.');
		%let ref_table=%scan(&_INPUT1,2,'.');
		
		proc sql noprint;
		   select
		         sysvalue into:ref_schema trimmed 
		   from dictionary.LIBNAMES
		      where libname = upcase("&ref_lib") and sysname = 'Schema'
		   ;
		%rcSet(&sqlrc);
		quit;
		%if %eval(&job_rc > 4) %then %goto EXIT; 
	%end; 

	%if %symexist(val_sk_cols_count) %then
	%do;	
		data _null_;
		  	length val_sk_cols $32767;
		  	val_sk_count = symget('val_sk_cols_count');
		  	esp_char = symget('esp_char');
		  	/* loop through the val_sk_cols list */
			do i=1 to val_sk_count;
				var = cats('val_sk_cols',i);
				val = symget(var);
				esp_col = cats(esp_char,val,esp_char);
				if i ^= 1  then val_sk_cols= cats(val_sk_cols ,',' ,esp_col );
				if i = 1  then val_sk_cols= cats(esp_col);				
			end;
			/* example: `col1`,`col2`,`col3` */
		  	call symputx('val_sk_cols_fmt',val_sk_cols,'G') ;
		run;
	%end;
	
		
%EXIT: %mend dip_ct_prep_cols;
