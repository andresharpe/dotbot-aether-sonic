BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Test-PartyBoxSession' {
    Context 'When no session exists' {
        BeforeEach {
            Clear-MockSession
        }

        It 'Should return $false' {
            $module = Get-Module JblPartyBox
            $result = & $module { Test-PartyBoxSession }
            $result | Should -BeFalse
        }
    }

    Context 'When a connected session exists' {
        BeforeEach {
            Set-MockSession -Connected $true
        }

        It 'Should return $true' {
            $module = Get-Module JblPartyBox
            $result = & $module { Test-PartyBoxSession }
            $result | Should -BeTrue
        }
    }

    Context 'When session exists but is disconnected' {
        BeforeEach {
            Set-MockSession -Connected $false
        }

        It 'Should return $false' {
            $module = Get-Module JblPartyBox
            $result = & $module { Test-PartyBoxSession }
            $result | Should -BeFalse
        }
    }
}
