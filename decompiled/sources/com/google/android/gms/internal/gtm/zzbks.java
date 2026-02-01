package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbks extends zzbff implements zzbgt {
    private static final zzbks zza;
    private zzbfp zzb = zzbff.zzaj();

    static {
        zzbks zzbksVar = new zzbks();
        zza = zzbksVar;
        zzbff.zzan(zzbks.class, zzbksVar);
    }

    private zzbks() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzbkm zzbkmVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbkr(zzbkmVar);
                }
                return new zzbks();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
