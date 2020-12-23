$user = Read-Host -Prompt 'Input your user name'
$ePassword = Read-Host -AsSecureString -Prompt 'Input your password'

$bstr = [System.Runtime.InteropServices.Marshal]::SecureStringToBSTR($ePassword)
$password = [System.Runtime.InteropServices.Marshal]::PtrToStringAuto($bstr)


$yes = New-Object System.Management.Automation.Host.ChoiceDescription '&Yes', 'Yes'
$no = New-Object System.Management.Automation.Host.ChoiceDescription '&No', 'No'
$options = [System.Management.Automation.Host.ChoiceDescription[]]($yes, $no)


$sRawString  = get-content ./properties.txt | Out-String;
$sStringToConvert = $sRawString -replace '\\', '\\';
$AppProps = convertfrom-stringdata $sStringToConvert;

$refresh_workflow=0;

$catlist = $AppProps.categories -split ",";
$printList = "";
ForEach ($cat in $catlist[0..($catlist.Length-1)])
{
    $qa = $cat -split "=";
    $question = $qa[0];
    $answer = $qa[1];
	$printList = $printList+"`r`n$answer $question";
    if ($question -eq "schedule" -and $answer -eq "Y"){
        $ePassword = Read-Host -AsSecureString -Prompt 'Input your LCF password'
        $bstr = [System.Runtime.InteropServices.Marshal]::SecureStringToBSTR($ePassword)
        $lcfPassword = [System.Runtime.InteropServices.Marshal]::PtrToStringAuto($bstr)
        $refresh_workflow=1;
    }
}


write-host "Deployment settings:"
$printList;

$continute = $host.ui.PromptForChoice("Confirmation", "Are you sure you want to proceed with the current settings?`r`n"+$printList, $options, 0)

if ( $continute -ne 0 )
{
    write-host "`r`nDeplyment aborted."
    exit;
}

write-host "`r`nStart deployting..."

<#
$user = "";
$password = "";
$lcfPassword = "";
$refresh_workflow=0;
#>

if ( $refresh_workflow -ne 0 )
{
    write-host "Loading workflow definitions to LCF.."
    Get-Content ../filelist.dat | ForEach-Object{ 
        (Get-Content $_ -RAW) -replace '<!DOCTYPE JobFlowReq SYSTEM "JobFlowDef30.dtd">','' | Set-Content -Path $_;
    } 
    $sqlldr_cmd = "& sqlldr lcf/"+$lcfPassword+"@"+$AppProps.lcfHost+" control=../load_lsf_xml.ctl";
    iex $sqlldr_cmd;
    if ( $LASTEXITCODE -ne 0 ){ exit; }    
}


$list_cmd = "& """+$AppProps.cmdPath+"SASPlatformObjectFramework\9.4\tools\sas-list-objects"" -host "+$AppProps.importHost+" -port "+$AppProps.importPort+" -types Folder -user $user -password $password -folderTree """+$AppProps.importProjectFolder+"""";

write-host "Fetching Folder list.."
$result = iex $list_cmd;
if ( $LASTEXITCODE -ne 0 -and $result -ne "No objects found." )
{
    write-host $result;
    exit;
}


$rootslashCount = ($AppProps.importProjectFolder.ToCharArray() | Where-Object {$_ -eq '/'} | Measure-Object).Count;
$list = $result -split "`r`n";

write-host "Deleting project folders.."
ForEach ($line in $list[0..($list.Length-2)])
{
    $slashCount = ($line.ToCharArray() | Where-Object {$_ -eq '/'} | Measure-Object).Count
    if (($rootslashCount+1) -eq $slashCount)
    {
        $delete_cmd = "& """+$AppProps.cmdPath+"SASPlatformObjectFramework\9.4\tools\sas-delete-objects"" -host "+$AppProps.importHost+" -port "+$AppProps.importPort+" -user $user -password $password -deleteContents """+$line+"""";
        iex $delete_cmd;
        if ( $LASTEXITCODE -ne 0 ){ exit; }
    }
}

    
write-host "Cleaning up Jobs folder..."
$dummy_cmd = "& """+$AppProps.puttyFolder+"\plink.exe"" $user@"+$AppProps.importComputeHost+" -pw $password ""touch "+$AppProps.serverLvDir+"/SASApp/SASEnvironment/SASCode/Jobs/dummy.sas""";
iex $dummy_cmd;
if ( $LASTEXITCODE -ne 0 ){ exit; }
$cleanup_jobs_cmd = "& """+$AppProps.puttyFolder+"\plink.exe"" $user@"+$AppProps.importComputeHost+" -pw $password rm "+$AppProps.serverLvDir+"/SASApp/SASEnvironment/SASCode/Jobs/*.sas -f";
iex $cleanup_jobs_cmd;
if ( $LASTEXITCODE -ne 0 ){ exit; }

Function Deploy-Objects{
Param($user,$password,$category)

    write-output "Deploying objects for $category...."
    $import_cmd = "& """+$AppProps.cmdPath+"SASPlatformObjectFramework\9.4\importPackage"" -host "+$AppProps.importHost+" -port "+$AppProps.importPort+" -package """+$AppProps.importPath+$AppProps.importPkgName+"_"+$category+".spk"" -user $user -password $password -preservePaths -subprop "".\"+$AppProps.targetEnv+".subprop"" -target /";
    iex $import_cmd;
    #if ( $LASTEXITCODE -gt 4 ){ exit; }

}


ForEach ($cat in $catlist[0..($catlist.Length-1)])
{
    $qa = $cat -split "=";
    $question = $qa[0];
    $answer = $qa[1];
    if ($answer -eq "Y")
    {
        Deploy-Objects $user $password $question;
    }
}



write-host "Cleaning up the SASApp SASMacro folder...."
$dummy_cmd = "& """+$AppProps.puttyFolder+"\plink.exe"" $user@"+$AppProps.importComputeHost+" -pw $password ""touch "+$AppProps.serverLvDir+"/SASApp/SASEnvironment/SASMacro/dummy.sas""";
iex $dummy_cmd;
if ( $LASTEXITCODE -ne 0 ){ exit; }
$cleanup_cmd = "& """+$AppProps.puttyFolder+"\plink.exe"" $user@"+$AppProps.importComputeHost+" -pw $password rm "+$AppProps.serverLvDir+"/SASApp/SASEnvironment/SASMacro/*.sas -f";
iex $cleanup_cmd;
if ( $LASTEXITCODE -ne 0 ){ exit; }

write-host "Uploading Macros to SASApp....."
$upload_cmd = "& """+$AppProps.puttyFolder+"\pscp.exe"" -r  -pw $password  "+$AppProps.importPath+$AppProps.macroFolder+"\ $user@"+$AppProps.importComputeHost+":"+$AppProps.serverLvDir+"/SASApp/SASEnvironment/SASMacro/";
iex $upload_cmd;
if ( $LASTEXITCODE -ne 0 ){ exit; }


write-host "Executing update enviornment value job...."
$update_cmd = "& """+$AppProps.puttyFolder+"\plink.exe"" $user@"+$AppProps.importComputeHost+" -pw $password """+$AppProps.serverLvDir+"/SASApp/BatchServer/sasbatch.sh -noprint -log "+$AppProps.serverLvDir+"/Logs/Change_Hadoop_environment_#Y.#m.#d_#H.#M.#s.log  -batch -noterminal -logparm 'rollover=session'  -sysin "+$AppProps.serverLvDir+"/SASApp/SASEnvironment/SASCode/Jobs/Change_Hadoop_environment_"+$AppProps.targetEnv+".sas""";
iex $update_cmd;
if ( $LASTEXITCODE -ne 0 )
{ 
    Write-host "Failed at step - Executing update enviornment value job"
    exit; 
}



if ( $refresh_workflow -ne 0 )
{
    write-host "Refreshing workflow definitions...."
    $refresh_wokflow_def_cmd = "& """+$AppProps.puttyFolder+"\plink.exe"" $user@"+$AppProps.importComputeHost+" -pw $password """+$AppProps.serverLvDir+"/SASApp/BatchServer/sasbatch.sh -noprint -log "+$AppProps.serverLvDir+"/Logs/LCF_WORKFLOW_JOB_#Y.#m.#d_#H.#M.#s.log  -batch -noterminal -logparm 'rollover=session'  -sysin "+$AppProps.serverLvDir+"/SASApp/SASEnvironment/SASCode/Jobs/LCF_WORKFLOW_JOB.sas""";
    iex $refresh_wokflow_def_cmd;
    if ( $LASTEXITCODE -ne 0 ){ 
        Write-host "Failed at step - Refreshing workflow definitions"
        exit; 
    }    

}


write-host "Redploying all the jobs..."
$env_cmd = "& """+$AppProps.puttyFolder+"\plink.exe"" $user@"+$AppProps.importComputeHost+" -pw $password """+$AppProps.batchDeployCmdPath+"/DeployJobs -deploytype REDEPLOY -host "+$AppProps.importHost+" -port "+$AppProps.importPort+" -user $user -password $password -appservername SASApp -metarepository Foundation -sourcedir /tmp  -objects '"+$AppProps.importProjectFolder+"' -recursive""";
iex $env_cmd;
if ( $LASTEXITCODE -ne 0 ){ exit; }

write-host "Cleaning up temporary source jobs..."
$cleanup_tmp_cmd = "& """+$AppProps.puttyFolder+"\plink.exe"" $user@"+$AppProps.importComputeHost+" -pw $password rm /tmp/*.sas -f";
iex $cleanup_tmp_cmd;

write-host "Deployment completed..."
