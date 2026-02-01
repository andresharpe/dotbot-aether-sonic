BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Invoke-PartyBoxCommand' {
    Context 'When no session exists' {
        BeforeEach {
            Clear-MockSession
        }

        It 'Should throw a terminating error' {
            $module = Get-Module JblPartyBox
            { & $module { Invoke-PartyBoxCommand -Data @(0xAA, 0xEA, 0x00) -ErrorAction Stop } } |
                Should -Throw '*Not connected*'
        }
    }
}

Describe 'Close-PartyBoxStream' {
    It 'Should handle null session gracefully' {
        $module = Get-Module JblPartyBox
        { & $module {
            $script:PartyBoxSession = $null
            Close-PartyBoxStream
        } } | Should -Not -Throw
    }

    It 'Should set Connected to false' {
        Set-MockSession -Connected $true
        $module = Get-Module JblPartyBox
        & $module { Close-PartyBoxStream }
        $session = Get-MockSession
        $session.Connected | Should -BeFalse
    }
}
