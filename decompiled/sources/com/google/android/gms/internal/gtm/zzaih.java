package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaih extends zzbff implements zzbgt {
    private static final zzaih zza;
    private int zzb;
    private zzahd zzf;
    private zzaez zzg;
    private String zzh = "";

    static {
        zzaih zzaihVar = new zzaih();
        zza = zzaihVar;
        zzbff.zzan(zzaih.class, zzaihVar);
    }

    private zzaih() {
    }

    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzaig(null);
                }
                return new zzaih();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0004\r\u0003\u0000\u0000\u0000\u0004ဉ\u0000\fဉ\u0001\rဈ\u0002", new Object[]{"zzb", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
