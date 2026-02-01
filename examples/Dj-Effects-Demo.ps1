# Dj-Effects-Demo.ps1 - Demo all DJ sound effects and audio filters
# Prerequisites: Speaker paired and connected, music playing for filter effects

Import-Module "$PSScriptRoot\..\src\JblPartyBox\JblPartyBox.psd1" -Force

# Connect to first available speaker
Find-PartyBoxDevice | Select-Object -First 1 | Connect-PartyBoxDevice

Write-Host "DJ Effects Demo"
Write-Host "==============="

# Sound effects demo
$effects = @(
    'Horn', 'Clapping', 'Scratch1', 'Barking', 'Like', 'Boo',
    'Ready', 'Disco1', 'Game', 'Party', 'Hey', 'HandsUp',
    'OneTwoThree', 'Jump', 'LetsGo'
)

Write-Host "`nPlaying sound effects..."
foreach ($effect in $effects) {
    Write-Host "  Playing: $effect"
    Invoke-PartyBoxSoundEffect -Effect $effect
    Start-Sleep -Seconds 2
}

# Audio filter demo (requires music to be playing)
Write-Host "`nAudio filter demo (play music to hear the effects)..."

$filters = @(
    @{ Name = 'Repeater'; Level = 50 }
    @{ Name = 'Filter'; Level = 50 }
    @{ Name = 'Gater'; Level = 50 }
    @{ Name = 'Echo'; Level = 50 }
    @{ Name = 'Wipeout'; Level = 50 }
)

foreach ($filter in $filters) {
    Write-Host "  Filter: $($filter.Name) at $($filter.Level)%"
    Set-PartyBoxDjFilter -Filter $filter.Name -Level $filter.Level
    Start-Sleep -Seconds 4
    Stop-PartyBoxDjFilter
    Start-Sleep -Seconds 1
}

Write-Host "`nDJ effects demo complete!"
Disconnect-PartyBoxDevice
