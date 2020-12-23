load data
infile '../filelist.dat'
truncate
into table STG_LSF_WORKFLOW_XML
(
 filename char(255),
 UPLOADED_TIMESTAMP expression "current_timestamp(3)",
 XMLDATA  lobfile(filename) terminated by eof
)