BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Set-PartyBoxLightSpeed' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Set-PartyBoxLightSpeed | Should -Not -BeNullOrEmpty
    }

    It 'Should throw when not connected' {
        Clear-MockSession
        { Set-PartyBoxLightSpeed -Level 128 -ErrorAction Stop } | Should -Throw '*Not connected*'
    }

    It 'Should validate Level range 0-255' {
        $cmd = Get-Command -Module JblPartyBox -Name Set-PartyBoxLightSpeed
        $validateRange = $cmd.Parameters['Level'].Attributes | Where-Object { $_ -is [System.Management.Automation.ValidateRangeAttribute] }
        $validateRange.MinRange | Should -Be 0
        $validateRange.MaxRange | Should -Be 255
    }
}
