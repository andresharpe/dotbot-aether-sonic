package com.google.android.gms.internal.gtm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbhb {
    private static final zzbhb zza = new zzbhb();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzbhg zzb = new zzbgk();

    private zzbhb() {
    }

    public static zzbhb zza() {
        return zza;
    }

    public final zzbhf zzb(Class cls) {
        zzbfq.zzf(cls, "messageType");
        zzbhf zzbhfVar = (zzbhf) this.zzc.get(cls);
        if (zzbhfVar == null) {
            zzbhfVar = this.zzb.zza(cls);
            zzbfq.zzf(cls, "messageType");
            zzbfq.zzf(zzbhfVar, "schema");
            zzbhf zzbhfVar2 = (zzbhf) this.zzc.putIfAbsent(cls, zzbhfVar);
            if (zzbhfVar2 != null) {
                return zzbhfVar2;
            }
        }
        return zzbhfVar;
    }
}
