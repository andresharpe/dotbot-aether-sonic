package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.C1157e;
import com.google.android.gms.analytics.i;
import com.google.android.gms.common.internal.D;

@D
/* loaded from: classes2.dex */
public final class zzfr {
    private C1157e zza;
    private final Context zzb;
    private i zzc;

    public zzfr(Context context) {
        this.zzb = context;
    }

    private final synchronized void zzb(String str) {
        if (this.zza == null) {
            C1157e k4 = C1157e.k(this.zzb);
            this.zza = k4;
            k4.u(new zzfq());
            this.zzc = this.zza.o("_GTM_DEFAULT_TRACKER_");
        }
    }

    public final i zza(String str) {
        zzb("_GTM_DEFAULT_TRACKER_");
        return this.zzc;
    }
}
