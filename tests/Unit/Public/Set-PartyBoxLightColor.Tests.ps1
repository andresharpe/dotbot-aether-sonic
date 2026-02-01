BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Set-PartyBoxLightColor' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Set-PartyBoxLightColor | Should -Not -BeNullOrEmpty
    }

    It 'Should throw when not connected' {
        Clear-MockSession
        { Set-PartyBoxLightColor -Color Red -ErrorAction Stop } | Should -Throw '*Not connected*'
    }

    It 'Should accept RGB parameters' {
        $cmd = Get-Command -Module JblPartyBox -Name Set-PartyBoxLightColor
        $cmd.Parameters.ContainsKey('Red') | Should -BeTrue
        $cmd.Parameters.ContainsKey('Green') | Should -BeTrue
        $cmd.Parameters.ContainsKey('Blue') | Should -BeTrue
    }

    It 'Should accept named Color parameter' {
        $cmd = Get-Command -Module JblPartyBox -Name Set-PartyBoxLightColor
        $cmd.Parameters.ContainsKey('Color') | Should -BeTrue
    }

    It 'Should validate RGB range 0-255' {
        $cmd = Get-Command -Module JblPartyBox -Name Set-PartyBoxLightColor
        $validateRange = $cmd.Parameters['Red'].Attributes | Where-Object { $_ -is [System.Management.Automation.ValidateRangeAttribute] }
        $validateRange.MinRange | Should -Be 0
        $validateRange.MaxRange | Should -Be 255
    }

    It 'Should have 12 color presets' {
        $cmd = Get-Command -Module JblPartyBox -Name Set-PartyBoxLightColor
        $validateSet = $cmd.Parameters['Color'].Attributes | Where-Object { $_ -is [System.Management.Automation.ValidateSetAttribute] }
        $validateSet.ValidValues.Count | Should -Be 12
    }
}
