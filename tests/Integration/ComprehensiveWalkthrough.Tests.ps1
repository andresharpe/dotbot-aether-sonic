# Comprehensive integration test - exercises ALL library functions sequentially
# Tests auto-skip if no device is discovered
# Each step has a 0.5 second delay to allow visual verification
#
# Usage:
#   Invoke-Pester ./tests/Integration/ComprehensiveWalkthrough.Tests.ps1
#
# To skip sound effects and DJ filters (quiet mode):
#   Invoke-Pester ./tests/Integration/ComprehensiveWalkthrough.Tests.ps1 -ExcludeTag 'Sound'

$modulePath = Join-Path $PSScriptRoot '..\..\src\JblPartyBox\JblPartyBox.psd1'
Import-Module $modulePath -Force

$script:DiscoveredDevice = Find-PartyBoxDevice | Select-Object -First 1
if (-not $script:DiscoveredDevice) {
    Write-Warning "No PartyBox device found. Skipping comprehensive walkthrough tests."
}

Describe 'Comprehensive Walkthrough' -Skip:(-not $script:DiscoveredDevice) {
    BeforeAll {
        $script:StepDelay = 500  # milliseconds between steps
        Find-PartyBoxDevice | Select-Object -First 1 | Connect-PartyBoxDevice
        
        # Initialize lights with Neon pattern (animated with ColorLoop)
        Enable-PartyBoxLight
        Set-PartyBoxLightPattern -Pattern Neon
        Set-PartyBoxColorMode -Mode ColorLoop
        Set-PartyBoxLightBrightness -Level 255
        
        # Enable all 4 light zones (PartyBox 320 has: Eight, SideRing, Edge, Stripe)
        Set-PartyBoxLightZone -Zone Eight -Enabled $true
        Set-PartyBoxLightZone -Zone SideRing -Enabled $true
        Set-PartyBoxLightZone -Zone Edge -Enabled $true
        Set-PartyBoxLightZone -Zone Stripe -Enabled $true
        Start-Sleep -Milliseconds 500
    }

    Context 'Connection & Status' {
        It 'Should be connected' {
            Test-PartyBoxConnection | Should -BeTrue
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should return valid configuration' {
            $config = Get-PartyBoxConfiguration
            $config.Connected | Should -BeTrue
            Start-Sleep -Milliseconds $script:StepDelay
        }
    }

    Context 'Light Patterns' {
        BeforeAll {
            Enable-PartyBoxLight
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set pattern: Neon' {
            Write-Host "Setting pattern: Neon"
            Set-PartyBoxLightPattern -Pattern Neon
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set pattern: Loop' {
            Write-Host "Setting pattern: Loop"
            Set-PartyBoxLightPattern -Pattern Loop
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set pattern: Bounce' {
            Write-Host "Setting pattern: Bounce"
            Set-PartyBoxLightPattern -Pattern Bounce
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set pattern: Trim' {
            Write-Host "Setting pattern: Trim"
            Set-PartyBoxLightPattern -Pattern Trim
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set pattern: Switch' {
            Write-Host "Setting pattern: Switch"
            Set-PartyBoxLightPattern -Pattern Switch
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set pattern: Freeze' {
            Write-Host "Setting pattern: Freeze"
            Set-PartyBoxLightPattern -Pattern Freeze
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set pattern: Custom' {
            Write-Host "Setting pattern: Custom"
            Set-PartyBoxLightPattern -Pattern Custom
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set pattern: Off' {
            Write-Host "Setting pattern: Off"
            Set-PartyBoxLightPattern -Pattern Off
            Start-Sleep -Milliseconds $script:StepDelay
        }
    }

    Context 'Named Colors' {
        BeforeAll {
            # Re-enable lights and zones after pattern tests (which ended with Off)
            # Set-PartyBoxLightColor now auto-sets Static+Freeze, so just enable lights/zones
            Enable-PartyBoxLight
            Set-PartyBoxLightZone -Zone Eight -Enabled $true
            Set-PartyBoxLightZone -Zone SideRing -Enabled $true
            Set-PartyBoxLightZone -Zone Edge -Enabled $true
            Set-PartyBoxLightZone -Zone Stripe -Enabled $true
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set color: Red (with auto Static+Freeze)' {
            Write-Host "Setting color: Red"
            Set-PartyBoxLightColor -Color Red
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set color: Green' {
            Write-Host "Setting color: Green"
            Set-PartyBoxLightColor -Color Green -KeepCurrentPattern
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set color: Blue' {
            Write-Host "Setting color: Blue"
            Set-PartyBoxLightColor -Color Blue -KeepCurrentPattern
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set color: Orange' {
            Write-Host "Setting color: Orange"
            Set-PartyBoxLightColor -Color Orange -KeepCurrentPattern
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set color: Yellow' {
            Write-Host "Setting color: Yellow"
            Set-PartyBoxLightColor -Color Yellow -KeepCurrentPattern
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set color: Purple' {
            Write-Host "Setting color: Purple"
            Set-PartyBoxLightColor -Color Purple -KeepCurrentPattern
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set color: Cyan' {
            Write-Host "Setting color: Cyan"
            Set-PartyBoxLightColor -Color Cyan -KeepCurrentPattern
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set color: White' {
            Write-Host "Setting color: White"
            Set-PartyBoxLightColor -Color White -KeepCurrentPattern
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set color: Pink' {
            Write-Host "Setting color: Pink"
            Set-PartyBoxLightColor -Color Pink -KeepCurrentPattern
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set color: Lime' {
            Write-Host "Setting color: Lime"
            Set-PartyBoxLightColor -Color Lime -KeepCurrentPattern
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set color: Teal' {
            Write-Host "Setting color: Teal"
            Set-PartyBoxLightColor -Color Teal -KeepCurrentPattern
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set color: Magenta' {
            Write-Host "Setting color: Magenta"
            Set-PartyBoxLightColor -Color Magenta -KeepCurrentPattern
            Start-Sleep -Milliseconds $script:StepDelay
        }
    }

    Context 'RGB Colors' {
        It 'Should set RGB: pure red (255,0,0)' {
            { Set-PartyBoxLightColor -Red 255 -Green 0 -Blue 0 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set RGB: pure green (0,255,0)' {
            { Set-PartyBoxLightColor -Red 0 -Green 255 -Blue 0 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set RGB: pure blue (0,0,255)' {
            { Set-PartyBoxLightColor -Red 0 -Green 0 -Blue 255 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }
    }

    Context 'Brightness Levels' {
        It 'Should set brightness: Low (50)' {
            { Set-PartyBoxLightBrightness -Level 50 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set brightness: Medium (150)' {
            { Set-PartyBoxLightBrightness -Level 150 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set brightness: High (255)' {
            { Set-PartyBoxLightBrightness -Level 255 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }
    }

    Context 'Speed Levels' {
        It 'Should set speed: Slow (50)' {
            { Set-PartyBoxLightSpeed -Level 50 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set speed: Medium (128)' {
            { Set-PartyBoxLightSpeed -Level 128 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set speed: Fast (255)' {
            { Set-PartyBoxLightSpeed -Level 255 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }
    }

    Context 'Light Zones' {
        # PartyBox 320 has 4 light zones: Eight, SideRing, Edge, Stripe
        It 'Should enable zone: Eight' {
            { Set-PartyBoxLightZone -Zone Eight -Enabled $true } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should disable zone: Eight' {
            { Set-PartyBoxLightZone -Zone Eight -Enabled $false } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should enable zone: SideRing' {
            { Set-PartyBoxLightZone -Zone SideRing -Enabled $true } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should disable zone: SideRing' {
            { Set-PartyBoxLightZone -Zone SideRing -Enabled $false } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should enable zone: Edge' {
            { Set-PartyBoxLightZone -Zone Edge -Enabled $true } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should disable zone: Edge' {
            { Set-PartyBoxLightZone -Zone Edge -Enabled $false } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should enable zone: Stripe' {
            { Set-PartyBoxLightZone -Zone Stripe -Enabled $true } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should disable zone: Stripe' {
            { Set-PartyBoxLightZone -Zone Stripe -Enabled $false } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }
    }

    Context 'Color Modes' {
        It 'Should set mode: ColorLoop' {
            { Set-PartyBoxColorMode -Mode ColorLoop } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should set mode: Static' {
            { Set-PartyBoxColorMode -Mode Static } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }
    }

    Context 'Light Status & Control' {
        It 'Should get light status' {
            { Get-PartyBoxLightStatus } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should disable lights' {
            { Disable-PartyBoxLight } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should re-initialize lights' {
            { Initialize-PartyBoxLights } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }
    }

    Context 'Sound Effects' -Tag 'Sound' {
        It 'Should play effect: Horn' {
            { Invoke-PartyBoxSoundEffect -Effect Horn } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: Clapping' {
            { Invoke-PartyBoxSoundEffect -Effect Clapping } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: Scratch1' {
            { Invoke-PartyBoxSoundEffect -Effect Scratch1 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: Scratch2' {
            { Invoke-PartyBoxSoundEffect -Effect Scratch2 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: Scratch3' {
            { Invoke-PartyBoxSoundEffect -Effect Scratch3 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: Barking' {
            { Invoke-PartyBoxSoundEffect -Effect Barking } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: Like' {
            { Invoke-PartyBoxSoundEffect -Effect Like } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: Boo' {
            { Invoke-PartyBoxSoundEffect -Effect Boo } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: Ready' {
            { Invoke-PartyBoxSoundEffect -Effect Ready } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: Disco1' {
            { Invoke-PartyBoxSoundEffect -Effect Disco1 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: Disco2' {
            { Invoke-PartyBoxSoundEffect -Effect Disco2 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: Disco3' {
            { Invoke-PartyBoxSoundEffect -Effect Disco3 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: Game' {
            { Invoke-PartyBoxSoundEffect -Effect Game } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: Party' {
            { Invoke-PartyBoxSoundEffect -Effect Party } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: Hey' {
            { Invoke-PartyBoxSoundEffect -Effect Hey } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: HandsUp' {
            { Invoke-PartyBoxSoundEffect -Effect HandsUp } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: OneTwoThree' {
            { Invoke-PartyBoxSoundEffect -Effect OneTwoThree } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: Jump' {
            { Invoke-PartyBoxSoundEffect -Effect Jump } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should play effect: LetsGo' {
            { Invoke-PartyBoxSoundEffect -Effect LetsGo } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }
    }

    Context 'DJ Filters' -Tag 'Sound' {
        It 'Should apply filter: Repeater at 50%' {
            { Set-PartyBoxDjFilter -Filter Repeater -Level 50 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should apply filter: Filter at 50%' {
            { Set-PartyBoxDjFilter -Filter Filter -Level 50 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should apply filter: Gater at 50%' {
            { Set-PartyBoxDjFilter -Filter Gater -Level 50 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should apply filter: Echo at 50%' {
            { Set-PartyBoxDjFilter -Filter Echo -Level 50 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should apply filter: Wipeout at 50%' {
            { Set-PartyBoxDjFilter -Filter Wipeout -Level 50 } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should stop DJ filter' {
            { Stop-PartyBoxDjFilter } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }
    }

    Context 'Heartbeat & Cleanup' {
        It 'Should send heartbeat' {
            { Send-PartyBoxHeartbeat } | Should -Not -Throw
            Start-Sleep -Milliseconds $script:StepDelay
        }

        It 'Should disconnect cleanly' {
            { Disconnect-PartyBoxDevice } | Should -Not -Throw
            Test-PartyBoxConnection | Should -BeFalse
        }
    }
}

AfterAll {
    if (Test-PartyBoxConnection) {
        Stop-PartyBoxDjFilter -ErrorAction SilentlyContinue
        Disconnect-PartyBoxDevice
    }
}
