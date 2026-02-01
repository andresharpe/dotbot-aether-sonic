package com.google.android.gms.tagmanager;

import android.util.Log;
import com.google.android.gms.analytics.g;

/* loaded from: classes2.dex */
final class zzfq implements g {
    @Override // com.google.android.gms.analytics.g
    public final void error(Exception exc) {
        Log.e("GoogleTagManager", "", exc);
    }

    @Override // com.google.android.gms.analytics.g
    public final int getLogLevel() {
        int i4 = zzdg.zza;
        if (i4 == 2) {
            return 0;
        }
        if (i4 == 3 || i4 == 4) {
            return 1;
        }
        return i4 != 5 ? 3 : 2;
    }

    @Override // com.google.android.gms.analytics.g
    public final void info(String str) {
        zzdg.zzb.zzb(str);
    }

    @Override // com.google.android.gms.analytics.g
    public final void setLogLevel(int i4) {
        Log.w("GoogleTagManager", "GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
    }

    @Override // com.google.android.gms.analytics.g
    public final void verbose(String str) {
        zzdg.zzb.zzd(str);
    }

    @Override // com.google.android.gms.analytics.g
    public final void warn(String str) {
        Log.w("GoogleTagManager", str);
    }

    @Override // com.google.android.gms.analytics.g
    public final void error(String str) {
        Log.e("GoogleTagManager", str);
    }
}
