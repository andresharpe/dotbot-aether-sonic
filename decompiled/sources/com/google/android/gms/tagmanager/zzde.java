package com.google.android.gms.tagmanager;

import android.util.Log;
import androidx.lifecycle.C0909k;
import com.google.android.gms.common.util.D;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.firebase.remoteconfig.l;

@D
/* loaded from: classes2.dex */
final class zzde implements zzeb {
    private long zzb;
    private final InterfaceC1306g zze;
    private final Object zzc = new Object();
    private double zza = Math.min(1, 5);
    private final String zzd = "refreshing";

    public zzde(int i4, int i5, long j4, long j5, String str, InterfaceC1306g interfaceC1306g) {
        this.zze = interfaceC1306g;
    }

    @Override // com.google.android.gms.tagmanager.zzeb
    public final boolean zza() {
        synchronized (this.zzc) {
            try {
                long a4 = this.zze.a();
                long j4 = a4 - this.zzb;
                if (j4 < C0909k.f15658a) {
                    Log.w("GoogleTagManager", "Excessive " + this.zzd + " detected; call ignored.");
                    return false;
                }
                double d4 = this.zza;
                if (d4 < 5.0d) {
                    double d5 = j4 / 900000.0d;
                    if (d5 > l.f37524n) {
                        d4 = Math.min(5.0d, d4 + d5);
                        this.zza = d4;
                    }
                }
                this.zzb = a4;
                if (d4 >= 1.0d) {
                    this.zza = d4 - 1.0d;
                    return true;
                }
                Log.w("GoogleTagManager", "Excessive " + this.zzd + " detected; call ignored.");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
