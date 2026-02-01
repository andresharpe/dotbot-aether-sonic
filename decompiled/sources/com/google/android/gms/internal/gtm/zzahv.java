package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzahv extends zzbff implements zzbgt {
    private static final zzahv zza;
    private int zzb;
    private float zzf;

    static {
        zzahv zzahvVar = new zzahv();
        zza = zzahvVar;
        zzbff.zzan(zzahv.class, zzahvVar);
    }

    private zzahv() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzaht zzahtVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzahu(zzahtVar);
                }
                return new zzahv();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
