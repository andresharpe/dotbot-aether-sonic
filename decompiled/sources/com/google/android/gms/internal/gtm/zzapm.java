package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzapm extends zzbff implements zzbgt {
    private static final zzapm zza;
    private int zzb;
    private float zzg;
    private boolean zzh;
    private float zzi;
    private float zzj;
    private byte zzk = 2;
    private String zzf = "";

    static {
        zzapm zzapmVar = new zzapm();
        zza = zzapmVar;
        zzbff.zzan(zzapm.class, zzapmVar);
    }

    private zzapm() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        byte b4;
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzapk zzapkVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            if (obj == null) {
                                b4 = 0;
                            } else {
                                b4 = 1;
                            }
                            this.zzk = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzapl(zzapkVar);
                }
                return new zzapm();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
