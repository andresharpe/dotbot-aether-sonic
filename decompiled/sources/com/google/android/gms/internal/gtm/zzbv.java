package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.C1237i;

/* loaded from: classes.dex */
public final class zzbv {
    public static final String zza;
    public static final String zzb;

    static {
        String replaceAll = String.valueOf(C1237i.f28553a / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        zza = replaceAll;
        zzb = "ma".concat(String.valueOf(replaceAll));
    }
}
