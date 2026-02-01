# Integration tests - require a real JBL PartyBox speaker paired and powered on
# Tests auto-skip if no device is discovered

$modulePath = Join-Path $PSScriptRoot '..\..\src\JblPartyBox\JblPartyBox.psd1'
Import-Module $modulePath -Force

$script:DiscoveredDevice = Find-PartyBoxDevice | Select-Object -First 1
if (-not $script:DiscoveredDevice) {
    Write-Warning "No PartyBox device found. Skipping BasicConnectivity integration tests."
}

Describe 'Basic Connectivity' -Skip:(-not $script:DiscoveredDevice) {
    It 'Should discover at least one PartyBox device' {
        $devices = Find-PartyBoxDevice
        $devices | Should -Not -BeNullOrEmpty
        $devices[0].DeviceId | Should -Not -BeNullOrEmpty
    }

    It 'Should connect to the first discovered device' {
        $device = Find-PartyBoxDevice | Select-Object -First 1
        { $device | Connect-PartyBoxDevice } | Should -Not -Throw
        Test-PartyBoxConnection | Should -BeTrue
    }

    It 'Should return configuration after connecting' {
        $config = Get-PartyBoxConfiguration
        $config | Should -Not -BeNullOrEmpty
        $config.Connected | Should -BeTrue
        $config.Initialized | Should -BeTrue
    }

    It 'Should send heartbeat successfully' {
        { Send-PartyBoxHeartbeat } | Should -Not -Throw
    }

    It 'Should disconnect cleanly' {
        { Disconnect-PartyBoxDevice } | Should -Not -Throw
        Test-PartyBoxConnection | Should -BeFalse
    }
}

AfterAll {
    if (Test-PartyBoxConnection) {
        Disconnect-PartyBoxDevice
    }
}
