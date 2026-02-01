BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Stop-PartyBoxDjFilter' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Stop-PartyBoxDjFilter | Should -Not -BeNullOrEmpty
    }

    It 'Should throw when not connected' {
        Clear-MockSession
        { Stop-PartyBoxDjFilter -ErrorAction Stop } | Should -Throw '*Not connected*'
    }
}
