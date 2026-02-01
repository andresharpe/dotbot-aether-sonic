BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Set-PartyBoxDjFilter' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Set-PartyBoxDjFilter | Should -Not -BeNullOrEmpty
    }

    It 'Should throw when not connected' {
        Clear-MockSession
        { Set-PartyBoxDjFilter -Filter Echo -Level 50 -ErrorAction Stop } | Should -Throw '*Not connected*'
    }

    It 'Should accept valid filter names' {
        $cmd = Get-Command -Module JblPartyBox -Name Set-PartyBoxDjFilter
        $validateSet = $cmd.Parameters['Filter'].Attributes | Where-Object { $_ -is [System.Management.Automation.ValidateSetAttribute] }
        $validateSet.ValidValues | Should -Contain 'Repeater'
        $validateSet.ValidValues | Should -Contain 'Filter'
        $validateSet.ValidValues | Should -Contain 'Gater'
        $validateSet.ValidValues | Should -Contain 'Echo'
        $validateSet.ValidValues | Should -Contain 'Wipeout'
    }

    It 'Should validate Level range 0-100' {
        $cmd = Get-Command -Module JblPartyBox -Name Set-PartyBoxDjFilter
        $validateRange = $cmd.Parameters['Level'].Attributes | Where-Object { $_ -is [System.Management.Automation.ValidateRangeAttribute] }
        $validateRange.MinRange | Should -Be 0
        $validateRange.MaxRange | Should -Be 100
    }
}
