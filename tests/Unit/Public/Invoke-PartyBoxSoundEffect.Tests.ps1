BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Invoke-PartyBoxSoundEffect' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Invoke-PartyBoxSoundEffect | Should -Not -BeNullOrEmpty
    }

    It 'Should throw when not connected' {
        Clear-MockSession
        { Invoke-PartyBoxSoundEffect -Effect Horn -ErrorAction Stop } | Should -Throw '*Not connected*'
    }

    It 'Should accept all 19 sound effects' {
        $cmd = Get-Command -Module JblPartyBox -Name Invoke-PartyBoxSoundEffect
        $validateSet = $cmd.Parameters['Effect'].Attributes | Where-Object { $_ -is [System.Management.Automation.ValidateSetAttribute] }
        $validateSet.ValidValues.Count | Should -Be 19
        $validateSet.ValidValues | Should -Contain 'Horn'
        $validateSet.ValidValues | Should -Contain 'LetsGo'
    }
}
