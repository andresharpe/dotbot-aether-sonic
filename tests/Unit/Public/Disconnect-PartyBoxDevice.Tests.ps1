BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Disconnect-PartyBoxDevice' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Disconnect-PartyBoxDevice | Should -Not -BeNullOrEmpty
    }

    It 'Should handle no session gracefully' {
        Clear-MockSession
        { Disconnect-PartyBoxDevice } | Should -Not -Throw
    }

    It 'Should clear the session' {
        Set-MockSession -Connected $true
        Disconnect-PartyBoxDevice
        $session = Get-MockSession
        $session | Should -BeNullOrEmpty
    }
}
