# Integration tests for DJ effects - require a real speaker
# Tests auto-skip if no device is discovered

$modulePath = Join-Path $PSScriptRoot '..\..\src\JblPartyBox\JblPartyBox.psd1'
Import-Module $modulePath -Force

$script:DiscoveredDevice = Find-PartyBoxDevice | Select-Object -First 1
if (-not $script:DiscoveredDevice) {
    Write-Warning "No PartyBox device found. Skipping DjEffects integration tests."
}

Describe 'DJ Sound Effects' -Skip:(-not $script:DiscoveredDevice) {
    BeforeAll {
        Find-PartyBoxDevice | Select-Object -First 1 | Connect-PartyBoxDevice
    }

    It 'Should play Horn sound effect' {
        { Invoke-PartyBoxSoundEffect -Effect Horn } | Should -Not -Throw
    }

    It 'Should play Party sound effect' {
        { Invoke-PartyBoxSoundEffect -Effect Party } | Should -Not -Throw
    }
}

Describe 'DJ Audio Filters' -Skip:(-not $script:DiscoveredDevice) {
    BeforeAll {
        if (-not (Test-PartyBoxConnection)) {
            Find-PartyBoxDevice | Select-Object -First 1 | Connect-PartyBoxDevice
        }
    }

    It 'Should apply Echo filter at 50%' {
        { Set-PartyBoxDjFilter -Filter Echo -Level 50 } | Should -Not -Throw
    }

    It 'Should stop the DJ filter' {
        { Stop-PartyBoxDjFilter } | Should -Not -Throw
    }
}

AfterAll {
    if (Test-PartyBoxConnection) {
        Stop-PartyBoxDjFilter -ErrorAction SilentlyContinue
        Disconnect-PartyBoxDevice
    }
}
