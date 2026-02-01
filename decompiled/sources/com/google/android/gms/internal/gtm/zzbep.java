package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class zzbep {
    static final zzbep zza = new zzbep(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzbep zzd;
    private final Map zze;

    zzbep() {
        this.zze = new HashMap();
    }

    public static zzbep zza() {
        zzbep zzbepVar = zzd;
        if (zzbepVar != null) {
            return zzbepVar;
        }
        synchronized (zzbep.class) {
            try {
                zzbep zzbepVar2 = zzd;
                if (zzbepVar2 != null) {
                    return zzbepVar2;
                }
                zzbep zzb2 = zzbex.zzb(zzbep.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzbfd zzb(zzbgs zzbgsVar, int i4) {
        return (zzbfd) this.zze.get(new zzbeo(zzbgsVar, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbep(boolean z3) {
        this.zze = Collections.emptyMap();
    }
}
