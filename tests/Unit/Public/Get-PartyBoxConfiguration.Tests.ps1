BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Get-PartyBoxConfiguration' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Get-PartyBoxConfiguration | Should -Not -BeNullOrEmpty
    }

    It 'Should return $null when no session exists' {
        Clear-MockSession
        Get-PartyBoxConfiguration | Should -BeNullOrEmpty
    }

    It 'Should return configuration when session exists' {
        Set-MockSession -Connected $true -Initialized $true
        $config = Get-PartyBoxConfiguration
        $config | Should -Not -BeNullOrEmpty
        $config.DeviceName | Should -Be 'Mock JBL PartyBox Stage 320'
        $config.Connected | Should -BeTrue
        $config.Initialized | Should -BeTrue
    }

    It 'Should return the device ID' {
        Set-MockSession -Connected $true
        $config = Get-PartyBoxConfiguration
        $config.DeviceId | Should -Be 'Bluetooth#MockDevice-00:11:22:33:44:55'
    }
}
