package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbmq extends zzbff implements zzbgt {
    private static final zzbmq zza;
    private int zzb;
    private int zzf;
    private int zzg;

    static {
        zzbmq zzbmqVar = new zzbmq();
        zza = zzbmqVar;
        zzbff.zzan(zzbmq.class, zzbmqVar);
    }

    private zzbmq() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzbmo zzbmoVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbmp(zzbmoVar);
                }
                return new zzbmq();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
