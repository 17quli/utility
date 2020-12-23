%macro timestamp_display(sas_internal=, dateformat=sas) / mindelimiter=',' minoperator;
/*
    Name:                           Timestamp Display
    Author:                         Laurie Fleming, Tenzing / Daemons Ltd
    Date-written:                   26 March 2020
    Remarks:                        Takes a SAS internal timestamp and generates a human-readable one.
                                    This macro acts as a function - it generates a string which
                                    is picked up by the calling macro, rather than, for example,
                                    updating macro variables.

    Modification History            (in reverse chronological order)
    Laurie Fleming                  First written
    26 March 2020
*/
%local format;
%if %quote(&sas_internal) = %then %do;
    %rcset(8);
    %let status_msg = Missing SAS internal value;
    %check_status;
    %goto EndMac;
    %end;
%if &dateformat = %then
    %let dateformat = sas;
%let dateformat = %sysfunc(lowcase(&dateformat));
%if %eval(&dateformat in(sas, iso) = 0) %then %do;
    %let status_msg = Invalid date format &dateformat;
    %rcset(8);
    %check_status;
    %goto EndMac;
    %end;
%if &dateformat = sas
    %then %let format = datetime23.3;
    %else %let format = is8601dt23.3;
%sysfunc(strip(%sysfunc(putn(&sas_internal, &format))))
%EndMac:
%mend timestamp_display;