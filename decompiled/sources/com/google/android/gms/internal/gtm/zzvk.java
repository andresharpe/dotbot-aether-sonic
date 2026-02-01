package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzvk extends zzbff implements zzbgt {
    private static final zzvk zza;
    private int zzb;
    private float zzf;
    private float zzg;

    static {
        zzvk zzvkVar = new zzvk();
        zza = zzvkVar;
        zzbff.zzan(zzvk.class, zzvkVar);
    }

    private zzvk() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzve zzveVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzvj(zzveVar);
                }
                return new zzvk();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
