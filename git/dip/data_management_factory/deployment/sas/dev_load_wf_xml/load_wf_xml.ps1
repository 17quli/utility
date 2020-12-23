$user = Read-Host -Prompt 'Input your user name'
$ePassword = Read-Host -AsSecureString -Prompt 'Input your password'

$bstr = [System.Runtime.InteropServices.Marshal]::SecureStringToBSTR($ePassword)
$password = [System.Runtime.InteropServices.Marshal]::PtrToStringAuto($bstr)


$sRawString  = get-content ./properties.txt | Out-String;
$sStringToConvert = $sRawString -replace '\\', '\\';
$AppProps = convertfrom-stringdata $sStringToConvert;

$ePassword = Read-Host -AsSecureString -Prompt 'Input your LCF password'
$bstr = [System.Runtime.InteropServices.Marshal]::SecureStringToBSTR($ePassword)
$lcfPassword = [System.Runtime.InteropServices.Marshal]::PtrToStringAuto($bstr)
$refresh_workflow=1;


write-host "Loading workflow definitions to LCF.."
Get-Content ../filelist.dat | ForEach-Object{ 
    (Get-Content $_ -RAW) -replace '<!DOCTYPE JobFlowReq SYSTEM "JobFlowDef30.dtd">','' | Set-Content -Path $_;
} 
$sqlldr_cmd = "& sqlldr lcf/"+$lcfPassword+"@"+$AppProps.lcfHost+" control=../load_lsf_xml.ctl";
iex $sqlldr_cmd;
if ( $LASTEXITCODE -ne 0 ){ exit; }    


write-host "Refreshing workflow definitions...."
$refresh_wokflow_def_cmd = "& """+$AppProps.puttyFolder+"\plink.exe"" $user@"+$AppProps.importComputeHost+" -pw $password """+$AppProps.serverLvDir+"/SASApp/BatchServer/sasbatch.sh -noprint -log "+$AppProps.serverLvDir+"/Logs/LCF_WORKFLOW_JOB_#Y.#m.#d_#H.#M.#s.log  -batch -noterminal -logparm 'rollover=session'  -sysin "+$AppProps.serverLvDir+"/SASApp/SASEnvironment/SASCode/Jobs/LCF_WORKFLOW_JOB.sas""";
iex $refresh_wokflow_def_cmd;
if ( $LASTEXITCODE -ne 0 ){ 
    Write-host "Failed at step - Refreshing workflow definitions"
    exit; 
}   