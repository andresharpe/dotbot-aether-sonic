BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Find-PartyBoxDevice' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Find-PartyBoxDevice | Should -Not -BeNullOrEmpty
    }

    It 'Should have CmdletBinding' {
        $cmd = Get-Command -Module JblPartyBox -Name Find-PartyBoxDevice
        $cmd.CmdletBinding | Should -BeTrue
    }
}
