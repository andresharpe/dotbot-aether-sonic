package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbsx extends zzbff implements zzbgt {
    private static final zzbsx zza;

    static {
        zzbsx zzbsxVar = new zzbsx();
        zza = zzbsxVar;
        zzbff.zzan(zzbsx.class, zzbsxVar);
    }

    private zzbsx() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            zzbsv zzbsvVar = null;
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbsw(zzbsvVar);
                }
                return new zzbsx();
            }
            return zzbff.zzam(zza, "\u0001\u0000", null);
        }
        return (byte) 1;
    }
}
