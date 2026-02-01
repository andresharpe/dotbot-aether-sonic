# Integration tests for light control - require a real speaker
# Tests auto-skip if no device is discovered

$modulePath = Join-Path $PSScriptRoot '..\..\src\JblPartyBox\JblPartyBox.psd1'
Import-Module $modulePath -Force

$script:DiscoveredDevice = Find-PartyBoxDevice | Select-Object -First 1
if (-not $script:DiscoveredDevice) {
    Write-Warning "No PartyBox device found. Skipping LightControl integration tests."
}

Describe 'Light Control' -Skip:(-not $script:DiscoveredDevice) {
    BeforeAll {
        Find-PartyBoxDevice | Select-Object -First 1 | Connect-PartyBoxDevice
    }

    It 'Should enable lights' {
        { Enable-PartyBoxLight } | Should -Not -Throw
    }

    It 'Should set pattern to Neon' {
        { Set-PartyBoxLightPattern -Pattern Neon } | Should -Not -Throw
    }

    It 'Should set color to Red' {
        { Set-PartyBoxLightColor -Color Red } | Should -Not -Throw
    }

    It 'Should set color via RGB' {
        { Set-PartyBoxLightColor -Red 0 -Green 255 -Blue 0 } | Should -Not -Throw
    }

    It 'Should set brightness' {
        { Set-PartyBoxLightBrightness -Level 200 } | Should -Not -Throw
    }

    It 'Should set speed' {
        { Set-PartyBoxLightSpeed -Level 128 } | Should -Not -Throw
    }

    It 'Should toggle light zones' {
        { Set-PartyBoxLightZone -Zone Eight -Enabled $true } | Should -Not -Throw
        { Set-PartyBoxLightZone -Zone SideRing -Enabled $false } | Should -Not -Throw
    }

    It 'Should set color mode' {
        { Set-PartyBoxColorMode -Mode Static } | Should -Not -Throw
    }

    It 'Should disable lights' {
        { Disable-PartyBoxLight } | Should -Not -Throw
    }

    It 'Should re-initialize lights' {
        { Initialize-PartyBoxLights } | Should -Not -Throw
    }
}

AfterAll {
    if (Test-PartyBoxConnection) {
        Disconnect-PartyBoxDevice
    }
}
