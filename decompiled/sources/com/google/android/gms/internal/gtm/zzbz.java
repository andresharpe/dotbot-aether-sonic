package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C1285y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbz {
    private final String zza;
    private final String zzb;
    private final boolean zzc;
    private long zzd;
    private final Map zze;

    public zzbz(long j4, String str, String str2, boolean z3, long j5, Map map) {
        C1285y.h(str);
        C1285y.h(str2);
        this.zza = str;
        this.zzb = str2;
        this.zzc = z3;
        this.zzd = j5;
        if (map != null) {
            this.zze = new HashMap(map);
        } else {
            this.zze = Collections.emptyMap();
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final Map zzd() {
        return this.zze;
    }

    public final void zze(long j4) {
        this.zzd = j4;
    }

    public final boolean zzf() {
        return this.zzc;
    }
}
