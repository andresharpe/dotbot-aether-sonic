package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbrh extends zzbff implements zzbgt {
    private static final zzbrh zza;
    private zzbfp zzb = zzbff.zzaj();

    static {
        zzbrh zzbrhVar = new zzbrh();
        zza = zzbrhVar;
        zzbff.zzan(zzbrh.class, zzbrhVar);
    }

    private zzbrh() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzbqi zzbqiVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbrg(zzbqiVar);
                }
                return new zzbrh();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
