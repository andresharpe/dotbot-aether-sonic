BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Get-PartyBoxLightStatus' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Get-PartyBoxLightStatus | Should -Not -BeNullOrEmpty
    }

    It 'Should throw when not connected' {
        Clear-MockSession
        { Get-PartyBoxLightStatus -ErrorAction Stop } | Should -Throw '*Not connected*'
    }
}
