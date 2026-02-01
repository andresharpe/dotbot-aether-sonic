package com.google.android.gms.internal.gtm;

import android.util.Log;
import com.google.android.gms.analytics.g;

/* loaded from: classes.dex */
final class zzcw implements g {
    private int zza = 2;
    private boolean zzb;

    @Override // com.google.android.gms.analytics.g
    public final void error(Exception exc) {
    }

    @Override // com.google.android.gms.analytics.g
    public final int getLogLevel() {
        return this.zza;
    }

    @Override // com.google.android.gms.analytics.g
    public final void info(String str) {
    }

    @Override // com.google.android.gms.analytics.g
    public final void setLogLevel(int i4) {
        this.zza = i4;
        if (!this.zzb) {
            zzev zzevVar = zzew.zzc;
            Log.i((String) zzevVar.zzb(), "Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag." + ((String) zzevVar.zzb()) + " DEBUG");
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.analytics.g
    public final void verbose(String str) {
    }

    @Override // com.google.android.gms.analytics.g
    public final void warn(String str) {
    }

    @Override // com.google.android.gms.analytics.g
    public final void error(String str) {
    }
}
