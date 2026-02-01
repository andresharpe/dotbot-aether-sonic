BeforeAll {
    Import-Module "$PSScriptRoot\..\..\TestHelpers.psm1" -Force
    . "$PSScriptRoot\..\..\..\src\JblPartyBox\Private\New-PartyBoxFrame.ps1"
    . "$PSScriptRoot\..\..\Fixtures\MockResponses.ps1"

    # Set the module-scoped frame identifier needed by New-PartyBoxFrame
    $script:FrameIdentifier = 0xAA
}

Describe 'New-PartyBoxFrame' {
    It 'Should build a frame with no payload' {
        $frame = New-PartyBoxFrame -Command 0xEA
        $frame | Should -Be @([byte]0xAA, [byte]0xEA, [byte]0x00)
    }

    It 'Should build a frame with payload' {
        $frame = New-PartyBoxFrame -Command 0x33 -Payload @(0x00, 0x99, 0x01, 0x01)
        $frame | Should -Be @([byte]0xAA, [byte]0x33, [byte]0x04, [byte]0x00, [byte]0x99, [byte]0x01, [byte]0x01)
    }

    It 'Should set the correct payload length' {
        $payload = @(0x00, 0x32, 0x03, 0xFF, 0x00, 0x00)
        $frame = New-PartyBoxFrame -Command 0x33 -Payload $payload
        $frame[2] | Should -Be 6
    }

    It 'Should always start with 0xAA identifier' {
        $frame = New-PartyBoxFrame -Command 0x55 -Payload @(0x01)
        $frame[0] | Should -Be 0xAA
    }

    It 'Should place the command byte at position 1' {
        $frame = New-PartyBoxFrame -Command 0x57 -Payload @(0x01, 0x32)
        $frame[1] | Should -Be 0x57
    }

    It 'Should match expected LightsOn frame' {
        $frame = New-PartyBoxFrame -Command 0x33 -Payload @(0x00, 0x99, 0x01, 0x01)
        $frame | Should -Be $script:ExpectedFrames.LightsOn
    }

    It 'Should match expected LightsOff frame' {
        $frame = New-PartyBoxFrame -Command 0x33 -Payload @(0x00, 0x99, 0x01, 0x00)
        $frame | Should -Be $script:ExpectedFrames.LightsOff
    }

    It 'Should match expected Heartbeat frame' {
        $frame = New-PartyBoxFrame -Command 0xEA
        $frame | Should -Be $script:ExpectedFrames.Heartbeat
    }

    It 'Should match expected SoundHorn frame' {
        $frame = New-PartyBoxFrame -Command 0x55 -Payload @(0x01)
        $frame | Should -Be $script:ExpectedFrames.SoundHorn
    }

    It 'Should match expected ColorRed frame' {
        $frame = New-PartyBoxFrame -Command 0x33 -Payload @(0x00, 0x32, 0x03, 0xFF, 0x00, 0x00)
        $frame | Should -Be $script:ExpectedFrames.ColorRed
    }

    It 'Should match expected DjFilter frame' {
        $frame = New-PartyBoxFrame -Command 0x57 -Payload @(0x04, 0x32)
        $frame | Should -Be $script:ExpectedFrames.DjEcho50
    }

    It 'Should match expected PatternNeon frame' {
        $frame = New-PartyBoxFrame -Command 0x33 -Payload @(0x00, 0x31, 0x01, 0x02)
        $frame | Should -Be $script:ExpectedFrames.PatternNeon
    }

    It 'Should match expected Brightness frame' {
        $frame = New-PartyBoxFrame -Command 0x33 -Payload @(0x00, 0x45, 0x01, 0x80)
        $frame | Should -Be $script:ExpectedFrames.Brightness128
    }

    It 'Should return byte array type' {
        $frame = New-PartyBoxFrame -Command 0xEA
        $frame | Should -BeOfType [byte]
    }
}
