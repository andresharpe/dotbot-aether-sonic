package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaec extends zzbff implements zzbgt {
    private static final zzaec zza;
    private int zzb;
    private boolean zzf;

    static {
        zzaec zzaecVar = new zzaec();
        zza = zzaecVar;
        zzbff.zzan(zzaec.class, zzaecVar);
    }

    private zzaec() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzacm zzacmVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzaeb(zzacmVar);
                }
                return new zzaec();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
