package com.google.android.gms.tagmanager;

import android.util.Log;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.android.gms.common.util.k;
import com.google.firebase.remoteconfig.l;

/* loaded from: classes2.dex */
final class zzew implements zzeb {
    private long zzb;
    private final Object zzc = new Object();
    private double zza = 60.0d;
    private final InterfaceC1306g zzd = k.e();

    @Override // com.google.android.gms.tagmanager.zzeb
    public final boolean zza() {
        synchronized (this.zzc) {
            try {
                long a4 = this.zzd.a();
                double d4 = this.zza;
                if (d4 < 60.0d) {
                    double d5 = (a4 - this.zzb) / 2000.0d;
                    if (d5 > l.f37524n) {
                        d4 = Math.min(60.0d, d4 + d5);
                        this.zza = d4;
                    }
                }
                this.zzb = a4;
                if (d4 >= 1.0d) {
                    this.zza = d4 - 1.0d;
                    return true;
                }
                Log.w("GoogleTagManager", "No more tokens available.");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
