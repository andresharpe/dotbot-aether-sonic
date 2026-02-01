BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Connect-PartyBoxDevice' {
    It 'Should be exported as a public function' {
        Get-Command -Module JblPartyBox -Name Connect-PartyBoxDevice | Should -Not -BeNullOrEmpty
    }

    It 'Should accept DeviceId parameter' {
        $cmd = Get-Command -Module JblPartyBox -Name Connect-PartyBoxDevice
        $cmd.Parameters.ContainsKey('DeviceId') | Should -BeTrue
    }

    It 'Should accept InputObject from pipeline' {
        $cmd = Get-Command -Module JblPartyBox -Name Connect-PartyBoxDevice
        $cmd.Parameters['InputObject'].Attributes |
            Where-Object { $_ -is [System.Management.Automation.ParameterAttribute] -and $_.ValueFromPipeline } |
            Should -Not -BeNullOrEmpty
    }

    It 'Should have SkipInitialize switch' {
        $cmd = Get-Command -Module JblPartyBox -Name Connect-PartyBoxDevice
        $cmd.Parameters.ContainsKey('SkipInitialize') | Should -BeTrue
    }
}
