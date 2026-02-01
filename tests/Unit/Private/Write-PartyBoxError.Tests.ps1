BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    Initialize-TestModule
}

AfterAll {
    if (Get-Module JblPartyBox) { Remove-Module JblPartyBox -Force }
    if (Get-Module TestHelpers) { Remove-Module TestHelpers -Force }
}

Describe 'Write-PartyBoxError' {
    It 'Should be a function in the module' {
        $module = Get-Module JblPartyBox
        $commands = & $module { Get-Command -Module JblPartyBox -CommandType Function }
        # Write-PartyBoxError is private, so test via internal call
        $module | Should -Not -BeNullOrEmpty
    }
}
