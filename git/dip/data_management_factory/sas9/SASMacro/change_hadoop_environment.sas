%macro change_hadoop_environment;
option nofullstimer mprint notes;
%local i;
%do i = 1 %to 2;
    %let source_&i = %sysfunc(lowcase(&&source_&i));
    %let target_&i = %sysfunc(lowcase(&&target_&i));
    %end;
data _null_;
length liburi upasnuri mdschemaname schema new_schema prop prop_uri value new_value name $ 256
       engine $ 8
       change_found $ 1;
retain m1 -1						/* Tidier way of using +(-1) in 'put' statements */
       liburi upasnuri mdschemaname schema name libref engine prop prop_uri value ' ';
array source[2] $ 50 _temporary_ ("&source_1", "&source_2");
array target[2] $ 50 _temporary_ ("&target_1", "&target_2");
/*
	The return value from metadata_getn* functions is the number of objects in the hierarchy.
	If the value is 0, there are none. If it's -4, it's the end of the list. It's a bit untidy,
	but we can't change the world.
*/
do i = 1 by 1 while(metadata_getnobj("omsobj:SASLibrary?@Id contains '.'", i, liburi) > 0);
   rc = metadata_getattr(liburi, 'Engine', engine);
   if engine notin('CAS', 'HADOOP', 'SASIOIMP') then
      continue;
   put liburi= @;
   rc = metadata_getattr(liburi, 'Name', name);
   rc = metadata_getattr(liburi, 'Libref', value);
   put name= value=;
   change_found = 'N';
   link Packages;					/* Find and change schema values */
   link Properties;                 /* Find and change property values */
   if change_found = 'Y' then
	  put;
   end;
return;

Packages:
/*
	There may well be multiple UsingPackages for a URI and the order isn't prescribed,
	so all of them have to be read. Walk through the library's packages to find the right one.
*/
 do j = 1 by 1 while(metadata_getnasn(liburi, 'UsingPackages', j, upasnuri) > 0);
    rc = metadata_getattr(upasnuri, 'SchemaName', schema);
 	if not index(schema, strip(source[2])) then
	   continue;
    change_found = 'Y';
    new_schema = tranwrd(schema, strip(source[2]), strip(target[2]));
    put 'Changing ' name +m1 "'s schema from " schema "to " new_schema +m1 '.';
    rc = metadata_setattr(upasnuri, 'SchemaName', new_schema);
    end; 
 return;
 
Properties:
 do k = 1 to dim(source);					/* Some properties use source 2 (qv 1_dev), some use source 1 (dev) */
    do j = 1 by 1 while(metadata_getnprp(liburi, j, prop, value) > 0);  
       if not index(lowcase(value), strip(source[k])) then
          continue;
       change_found = 'Y';
       new_value = tranwrd(value, strip(source[k]), strip(target[k]));
       new_value = tranwrd(new_value, strip(propcase(source[k])), strip(propcase(target[k])));
       put 'Changing ' name +m1 "'s property from " value 'to ' new_value +m1 '.';
       rc = metadata_getprop(liburi, prop, value, prop_uri);		/* Get the uri for the property */
       put prop= value= prop_uri=;
       rc = metadata_setprop(liburi, prop, new_value, prop_uri);
       end;
    end;
 return;
run;
%mend change_hadoop_environment;