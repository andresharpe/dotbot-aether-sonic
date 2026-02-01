package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzapd extends zzbff implements zzbgt {
    private static final zzapd zza;
    private int zzb;
    private String zzf = "";
    private String zzg = "";

    static {
        zzapd zzapdVar = new zzapd();
        zza = zzapdVar;
        zzbff.zzan(zzapd.class, zzapdVar);
    }

    private zzapd() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzapb zzapbVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzapc(zzapbVar);
                }
                return new zzapd();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
