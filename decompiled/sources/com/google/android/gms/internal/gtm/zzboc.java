package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzboc extends zzbff implements zzbgt {
    private static final zzboc zza;
    private zzbfp zzb = zzbff.zzaj();

    static {
        zzboc zzbocVar = new zzboc();
        zza = zzbocVar;
        zzbff.zzan(zzboc.class, zzbocVar);
    }

    private zzboc() {
    }

    public static zzboc zze() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzboa zzboaVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbob(zzboaVar);
                }
                return new zzboc();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
