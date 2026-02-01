package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.InterfaceC1306g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfq {
    private final InterfaceC1306g zza;
    private long zzb;

    public zzfq(InterfaceC1306g interfaceC1306g) {
        C1285y.l(interfaceC1306g);
        this.zza = interfaceC1306g;
    }

    public final void zza() {
        this.zzb = 0L;
    }

    public final void zzb() {
        this.zzb = this.zza.c();
    }

    public final boolean zzc(long j4) {
        if (this.zzb == 0 || this.zza.c() - this.zzb > j4) {
            return true;
        }
        return false;
    }

    public zzfq(InterfaceC1306g interfaceC1306g, long j4) {
        C1285y.l(interfaceC1306g);
        this.zza = interfaceC1306g;
        this.zzb = j4;
    }
}
