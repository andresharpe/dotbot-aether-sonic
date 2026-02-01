# Test helpers for JblPartyBox module tests

function Initialize-TestModule {
    <#
    .SYNOPSIS
        Loads the JblPartyBox module for testing.
    #>
    param(
        [switch]$MockSession
    )

    # Remove existing module if loaded
    if (Get-Module JblPartyBox) {
        Remove-Module JblPartyBox -Force
    }

    $modulePath = Join-Path $PSScriptRoot '..\src\JblPartyBox\JblPartyBox.psd1'
    $resolvedPath = (Resolve-Path $modulePath -ErrorAction SilentlyContinue).Path
    
    Write-Verbose "Module path: $modulePath"
    Write-Verbose "Resolved path: $resolvedPath"
    Write-Verbose "Path exists: $(Test-Path $modulePath)"

    # Import module - suppress warnings (helper not built during tests) but capture errors
    Import-Module $modulePath -Force -WarningAction SilentlyContinue -Global

    $loadedModule = Get-Module JblPartyBox
    Write-Verbose "Module loaded after import: $($loadedModule -ne $null)"
    
    if (-not $loadedModule) {
        throw "Failed to load JblPartyBox module from $modulePath (resolved: $resolvedPath)"
    }

    if ($MockSession) {
        Set-MockSession
    }
}

function Set-MockSession {
    <#
    .SYNOPSIS
        Creates a mock PartyBox session for unit testing.
    #>
    param(
        [bool]$Connected = $true,
        [bool]$Initialized = $true
    )

    $module = Get-Module JblPartyBox
    
    # Use GetVariableValue to set values in module scope
    $sb = {
        param($connVal, $initVal)
        $script:PartyBoxSession = @{
            DeviceName     = 'Mock JBL PartyBox Stage 320'
            DeviceId       = 'Bluetooth#MockDevice-00:11:22:33:44:55'
            Connected      = $connVal
            LastContact    = [DateTime]::Now
            Initialized    = $initVal
            HelperProcess  = $null  # Mock doesn't need a real process
        }
    }
    
    $module.Invoke($sb, @($Connected, $Initialized))
}

function Clear-MockSession {
    <#
    .SYNOPSIS
        Clears the mock session.
    #>
    $module = Get-Module JblPartyBox
    $module.Invoke({ $script:PartyBoxSession = $null }, @())
}

function Get-MockSession {
    <#
    .SYNOPSIS
        Returns the current session from the module scope.
    #>
    $module = Get-Module JblPartyBox
    $module.Invoke({ $script:PartyBoxSession }, @())
}

function Get-CapturedBytes {
    <#
    .SYNOPSIS
        Returns bytes captured by the mock Invoke-PartyBoxCommand.
    #>
    $module = Get-Module JblPartyBox
    $module.Invoke({ $script:CapturedBytes }, @())
}

Export-ModuleMember -Function @(
    'Initialize-TestModule'
    'Set-MockSession'
    'Clear-MockSession'
    'Get-MockSession'
    'Get-CapturedBytes'
)
