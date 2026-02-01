package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbtk extends zzbff implements zzbgt {
    private static final zzbtk zza;
    private int zzb;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzbtk zzbtkVar = new zzbtk();
        zza = zzbtkVar;
        zzbff.zzan(zzbtk.class, zzbtkVar);
    }

    private zzbtk() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzbte zzbteVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbtj(zzbteVar);
                }
                return new zzbtk();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
