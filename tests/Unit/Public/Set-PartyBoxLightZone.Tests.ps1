BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Set-PartyBoxLightZone' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Set-PartyBoxLightZone | Should -Not -BeNullOrEmpty
    }

    It 'Should throw when not connected' {
        Clear-MockSession
        { Set-PartyBoxLightZone -Zone Eight -Enabled $true -ErrorAction Stop } | Should -Throw '*Not connected*'
    }

    It 'Should accept valid zone names' {
        $cmd = Get-Command -Module JblPartyBox -Name Set-PartyBoxLightZone
        $validateSet = $cmd.Parameters['Zone'].Attributes | Where-Object { $_ -is [System.Management.Automation.ValidateSetAttribute] }
        $validateSet.ValidValues | Should -Contain 'Strobe'
        $validateSet.ValidValues | Should -Contain 'Eight'
        $validateSet.ValidValues | Should -Contain 'SideRing'
        $validateSet.ValidValues | Should -Contain 'Stripe'
        $validateSet.ValidValues | Should -Contain 'Star'
        $validateSet.ValidValues | Should -Contain 'StrobeUp'
        $validateSet.ValidValues | Should -Contain 'StrobeDown'
        $validateSet.ValidValues | Should -Contain 'Edge'
    }
}
