package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes.dex */
public final class zzby {
    private final Context zza;
    private final Context zzb;

    public zzby(Context context) {
        C1285y.l(context);
        Context applicationContext = context.getApplicationContext();
        C1285y.m(applicationContext, "Application context can't be null");
        this.zza = applicationContext;
        this.zzb = applicationContext;
    }

    public final Context zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }
}
