package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzarp extends zzbff implements zzbgt {
    private static final zzarp zza;
    private int zzb;
    private byte zzh = 2;
    private String zzf = "";
    private String zzg = "";

    static {
        zzarp zzarpVar = new zzarp();
        zza = zzarpVar;
        zzbff.zzan(zzarp.class, zzarpVar);
    }

    private zzarp() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        byte b4;
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzarn zzarnVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            if (obj == null) {
                                b4 = 0;
                            } else {
                                b4 = 1;
                            }
                            this.zzh = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzaro(zzarnVar);
                }
                return new zzarp();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
