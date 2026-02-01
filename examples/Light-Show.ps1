# Light-Show.ps1 - Cycle through colors and patterns on the PartyBox
# Prerequisites: Speaker paired and connected

Import-Module "$PSScriptRoot\..\src\JblPartyBox\JblPartyBox.psd1" -Force

# Connect to first available speaker
Find-PartyBoxDevice | Select-Object -First 1 | Connect-PartyBoxDevice

Write-Host "Starting light show..."

# Cycle through color presets with Freeze pattern
$colors = @('Red', 'Orange', 'Yellow', 'Green', 'Cyan', 'Blue', 'Purple', 'Magenta', 'Pink', 'White')

Set-PartyBoxLightPattern -Pattern Freeze

foreach ($color in $colors) {
    Write-Host "  Color: $color"
    Set-PartyBoxLightColor -Color $color
    Start-Sleep -Seconds 2
}

# Now cycle through animated patterns
$patterns = @('Neon', 'Loop', 'Bounce', 'Trim', 'Switch')

foreach ($pattern in $patterns) {
    Write-Host "  Pattern: $pattern"
    Set-PartyBoxLightPattern -Pattern $pattern
    Start-Sleep -Seconds 4
}

# Brightness sweep
Write-Host "Brightness sweep..."
Set-PartyBoxLightPattern -Pattern Neon
for ($i = 0; $i -le 255; $i += 25) {
    Set-PartyBoxLightBrightness -Level $i
    Start-Sleep -Milliseconds 300
}

# Speed sweep
Write-Host "Speed sweep..."
for ($i = 0; $i -le 255; $i += 25) {
    Set-PartyBoxLightSpeed -Level $i
    Start-Sleep -Milliseconds 300
}

Write-Host "Light show complete!"
Disconnect-PartyBoxDevice
