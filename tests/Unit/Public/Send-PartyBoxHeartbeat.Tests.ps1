BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Send-PartyBoxHeartbeat' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Send-PartyBoxHeartbeat | Should -Not -BeNullOrEmpty
    }

    It 'Should throw when not connected' {
        Clear-MockSession
        { Send-PartyBoxHeartbeat -ErrorAction Stop } | Should -Throw '*Not connected*'
    }
}
