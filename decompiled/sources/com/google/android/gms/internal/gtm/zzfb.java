package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.D;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.firebase.remoteconfig.l;

@D
/* loaded from: classes.dex */
public final class zzfb {
    private long zzb;
    private final InterfaceC1306g zze;
    private final Object zzc = new Object();
    private double zza = 60.0d;
    private final String zzd = "tracking";

    public zzfb(int i4, long j4, String str, InterfaceC1306g interfaceC1306g) {
        this.zze = interfaceC1306g;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            try {
                long a4 = this.zze.a();
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
                zzfc.zze("Excessive " + this.zzd + " detected; call ignored.");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
