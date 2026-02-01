BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Initialize-PartyBoxLights' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Initialize-PartyBoxLights | Should -Not -BeNullOrEmpty
    }

    It 'Should throw when not connected' {
        Clear-MockSession
        { Initialize-PartyBoxLights -ErrorAction Stop } | Should -Throw '*Not connected*'
    }
}
