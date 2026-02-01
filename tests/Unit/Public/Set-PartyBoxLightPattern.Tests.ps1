BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Set-PartyBoxLightPattern' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Set-PartyBoxLightPattern | Should -Not -BeNullOrEmpty
    }

    It 'Should throw when not connected' {
        Clear-MockSession
        { Set-PartyBoxLightPattern -Pattern Neon -ErrorAction Stop } | Should -Throw '*Not connected*'
    }

    It 'Should accept valid pattern names' {
        $cmd = Get-Command -Module JblPartyBox -Name Set-PartyBoxLightPattern
        $validateSet = $cmd.Parameters['Pattern'].Attributes | Where-Object { $_ -is [System.Management.Automation.ValidateSetAttribute] }
        $validateSet.ValidValues | Should -Contain 'Neon'
        $validateSet.ValidValues | Should -Contain 'Freeze'
        $validateSet.ValidValues | Should -Contain 'Loop'
        $validateSet.ValidValues | Should -Contain 'Bounce'
        $validateSet.ValidValues | Should -Contain 'Trim'
        $validateSet.ValidValues | Should -Contain 'Switch'
        $validateSet.ValidValues | Should -Contain 'Off'
        $validateSet.ValidValues | Should -Contain 'Custom'
    }
}
