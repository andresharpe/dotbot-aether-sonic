# Quick-Start.ps1 - Basic JBL PartyBox Stage 320 control
# Prerequisites: Speaker paired via Windows Bluetooth settings, PowerShell 7+

# Import the module
Import-Module "$PSScriptRoot\..\src\JblPartyBox\JblPartyBox.psd1" -Force

# Discover and connect
$speaker = Find-PartyBoxDevice | Select-Object -First 1
if (-not $speaker) {
    Write-Host "No PartyBox speakers found. Is your speaker paired and powered on?"
    return
}

Write-Host "Found: $($speaker.Name) - Connecting..."
$speaker | Connect-PartyBoxDevice

# Check connection
$config = Get-PartyBoxConfiguration
Write-Host "Connected: $($config.DeviceName) (Initialized: $($config.Initialized))"

# Set a solid red color
Set-PartyBoxLightPattern -Pattern Freeze
Set-PartyBoxLightColor -Color Red
Write-Host "Lights set to solid Red"

Start-Sleep -Seconds 3

# Change to blue
Set-PartyBoxLightColor -Color Blue
Write-Host "Changed to Blue"

Start-Sleep -Seconds 3

# Play a sound effect
Invoke-PartyBoxSoundEffect -Effect Horn
Write-Host "Played Horn sound"

Start-Sleep -Seconds 2

# Switch to an animated pattern
Set-PartyBoxLightPattern -Pattern Neon
Write-Host "Switched to Neon pattern"

Start-Sleep -Seconds 5

# Clean up
Disconnect-PartyBoxDevice
Write-Host "Disconnected."
