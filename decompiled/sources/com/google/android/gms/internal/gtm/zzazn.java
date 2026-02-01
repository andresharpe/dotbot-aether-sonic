package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzazn extends zzbff implements zzbgt {
    private static final zzazn zza;
    private int zzb;
    private zzbac zzf;
    private int zzg;
    private String zzh = "";
    private boolean zzi;
    private boolean zzj;

    static {
        zzazn zzaznVar = new zzazn();
        zza = zzaznVar;
        zzbff.zzan(zzazn.class, zzaznVar);
    }

    private zzazn() {
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
                    return new zzazm(null);
                }
                return new zzazn();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"zzb", "zzf", "zzg", zzaks.zzc(), "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
