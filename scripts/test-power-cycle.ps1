Import-Module ./src/JblPartyBox/JblPartyBox.psd1 -Force

Write-Host 'Finding device...'
$device = Find-PartyBoxDevice | Select-Object -First 1
if (-not $device) {
    Write-Error 'No device found'
    exit 1
}
Write-Host "Found: $($device.Name) - $($device.DeviceId)"

Write-Host ''
Write-Host 'Powering OFF...'
$device | Stop-PartyBoxDevice

Write-Host 'Waiting 10 seconds...'
Start-Sleep -Seconds 10

Write-Host ''
Write-Host 'Powering ON...'
$device | Start-PartyBoxDevice

Write-Host 'Waiting 10 seconds...'
Start-Sleep -Seconds 10

Write-Host ''
Write-Host 'Powering OFF again...'
$device | Stop-PartyBoxDevice

Write-Host 'Waiting 10 seconds...'
Start-Sleep -Seconds 10

Write-Host ''
Write-Host 'Powering ON again...'
$device | Start-PartyBoxDevice

Write-Host ''
Write-Host 'Done!'
