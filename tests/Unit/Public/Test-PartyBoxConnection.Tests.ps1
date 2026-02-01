BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Test-PartyBoxConnection' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Test-PartyBoxConnection | Should -Not -BeNullOrEmpty
    }

    It 'Should return $false when no session exists' {
        Clear-MockSession
        Test-PartyBoxConnection | Should -BeFalse
    }

    It 'Should return $false when session is disconnected' {
        Set-MockSession -Connected $false
        Test-PartyBoxConnection | Should -BeFalse
    }

    It 'Should return $false when session has no writer (mock session)' {
        Set-MockSession -Connected $true
        # Mock session has $null Writer, so should return false
        Test-PartyBoxConnection | Should -BeFalse
    }
}
