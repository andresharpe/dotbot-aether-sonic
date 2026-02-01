BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Set-PartyBoxColorMode' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Set-PartyBoxColorMode | Should -Not -BeNullOrEmpty
    }

    It 'Should throw when not connected' {
        Clear-MockSession
        { Set-PartyBoxColorMode -Mode Static -ErrorAction Stop } | Should -Throw '*Not connected*'
    }

    It 'Should accept ColorLoop and Static modes' {
        $cmd = Get-Command -Module JblPartyBox -Name Set-PartyBoxColorMode
        $validateSet = $cmd.Parameters['Mode'].Attributes | Where-Object { $_ -is [System.Management.Automation.ValidateSetAttribute] }
        $validateSet.ValidValues | Should -Contain 'ColorLoop'
        $validateSet.ValidValues | Should -Contain 'Static'
    }
}
