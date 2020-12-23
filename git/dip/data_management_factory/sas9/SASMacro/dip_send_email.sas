%macro dip_send_email(address=, message=, subject=); 

/*
Macro used to send custom emails.

Usage:

Address: receiver's email address
Message: message embeded in the email body.  Use "||" as the delimiter if you want to start a new line. 
Subject: subject of the email.

@author				Max Wang <yang.wang@ird.govt.nz>
@first written		1/04/2019

*/


	%let current_dt=%sysfunc(datetime(), datetime22.3);
 	%let subject = &subject &current_dt;
  
    %local etls_syntaxcheck; 
    %let etls_syntaxcheck = %sysfunc(getoption(syntaxcheck)); 
    /* Turn off syntaxcheck option to perform following steps  */ 
    options nosyntaxcheck;

	/* retrieve the sender email for the environment */
	proc sql noprint;
		select value
		into :sender_url trimmed 
		from lcf.DIP_CONFIG
		where key="DIP_EMAIL_SENDER";
	quit;

	/* Prepare the email. */
	filename sendMail EMAIL 
	subject="&subject" 
	from="&sender_url" 
	to="&address" ; 
 
 	/* Send the email. */
    data _null_; 
    	length fmt_body $32767;
         file sendMail; 
         fmt_body=tranwrd("&message","||",'0A'x);
         put fmt_body; 
    run; 
      
    /* Reset syntaxcheck option to previous setting  */ 
    options &etls_syntaxcheck; 
%mend dip_send_email; 
