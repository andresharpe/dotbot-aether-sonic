package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzakm extends zzbff implements zzbgt {
    private static final zzakm zza;
    private zzbfo zzb = zzbff.zzai();

    static {
        zzakm zzakmVar = new zzakm();
        zza = zzakmVar;
        zzbff.zzan(zzakm.class, zzakmVar);
    }

    private zzakm() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzakk zzakkVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzakl(zzakkVar);
                }
                return new zzakm();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0015", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
