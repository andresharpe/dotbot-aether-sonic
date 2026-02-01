package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbso extends zzbff implements zzbgt {
    private static final zzbso zza;
    private int zzb;
    private boolean zzf;
    private zzbfp zzg = zzbff.zzaj();
    private long zzh;
    private boolean zzi;

    static {
        zzbso zzbsoVar = new zzbso();
        zza = zzbsoVar;
        zzbff.zzan(zzbso.class, zzbsoVar);
    }

    private zzbso() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzbsm zzbsmVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbsn(zzbsmVar);
                }
                return new zzbso();
            }
            return zzbff.zzam(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a\u0003ဃ\u0001\u0004ဇ\u0002", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
