Function Gen-Export{
Param($user,$password,$category)


    $list_cmd = "& """+$AppProps.cmdPath+"SASPlatformObjectFramework\9.4\tools\sas-list-objects"" -host "+$AppProps.exportHost+" -port "+$AppProps.exportPort+" -user $user -password $password -extName $category";
    $result = iex $list_cmd;
    if ( $LASTEXITCODE -ne 0 )
    {
        write-host $result;
        exit;
    }

    $list = $result -split "`r`n";

    $folders="";

    $i=1;

    write-host Generating Object list file for $category....
    ForEach ($line in $list[0..($list.Length-2)])
    {
        $folder = $line.Replace("(Folder)","");
        $folders = $folders+" """+$line.Replace("(Folder)","")+"""";
        $list_cmd = "& """+$AppProps.cmdPath+"SASPlatformObjectFramework\9.4\tools\sas-list-objects"" -host "+$AppProps.exportHost+" -port "+$AppProps.exportPort+" -user $user -password $password -format CSV -folderTree """+$folder;
        if ( $i -eq 1 )
        {
            $list_cmd += """ | out-file -encoding ASCII "+$AppProps.exportPath+"di_object_list_"+$category+".csv";
        }
        else
        {
            $list_cmd += """ | select-object -skip 1 | out-file -encoding ASCII -append "+$AppProps.exportPath+"di_object_list_"+$category+".csv";
        }
        $result = iex $list_cmd;
        <# if ( $LASTEXITCODE -ne 0 )
        {
            write-host $result;
            exit;
        }#>
        $i+=1;
    }

    #$export_cmd = "& """+$AppProps.cmdPath+"SASPlatformObjectFramework\9.4\ExportPackage"" -host "+$AppProps.exportHost+" -port "+$AppProps.exportPort+" -package """+$AppProps.exportPath+$AppProps.exportPkgName+"_"+$category+""".spk -user $user -password $password -subprop -objects  $folders";
    
    $export_cmd = "& """+$AppProps.cmdPath+"SASPlatformObjectFramework\9.4\ExportPackage"" -host "+$AppProps.exportHost+" -port "+$AppProps.exportPort+" -package """+$AppProps.exportPath+$AppProps.exportPkgName+"_"+$category+".spk"" -user $user -password $password -objects  $folders";

    write-host Exporting objects for $category.....
    $result = iex $export_cmd;
    if ( $LASTEXITCODE -ne 0 )
    {
        write-host $result;
    }

    write-host $category Export Completed.

}

$user = Read-Host -Prompt 'Input your user name'

$ePassword = Read-Host -AsSecureString -Prompt 'Input your password'
$bstr = [System.Runtime.InteropServices.Marshal]::SecureStringToBSTR($ePassword)
$password = [System.Runtime.InteropServices.Marshal]::PtrToStringAuto($bstr)


#$user = "";
#$password = "";

$yes = New-Object System.Management.Automation.Host.ChoiceDescription '&Yes', 'Yes'
$no = New-Object System.Management.Automation.Host.ChoiceDescription '&No', 'No'
$options = [System.Management.Automation.Host.ChoiceDescription[]]($yes, $no)



$sRawString  = get-content ./properties.txt | Out-String;
$sStringToConvert = $sRawString -replace '\\', '\\';
$AppProps = convertfrom-stringdata $sStringToConvert;



$catlist = $AppProps.categories -split ",";
$printList = "";
ForEach ($cat in $catlist[0..($catlist.Length-1)])
{
    $qa = $cat -split "=";
    $question = $qa[0];
    $answer = $qa[1];
	$printList = $printList+"`r`n$answer $question";
}


write-host "Export settings:"
$printList;

$continute = $host.ui.PromptForChoice("Confirmation", "Are you sure you want to proceed with the current settings?`r`n"+$printList+"`r`n(!!Only export components with changes for the new release.)", $options, 0)


if ( $continute -ne 0 )
{
    write-host "`r`nExport aborted."
    exit;
}


ForEach ($cat in $catlist[0..($catlist.Length-1)])
{
    $qa = $cat -split "=";
    $question = $qa[0];
    $answer = $qa[1];
    if ($answer -eq "Y")
    {
        Gen-Export $user $password $question;
    }
}
