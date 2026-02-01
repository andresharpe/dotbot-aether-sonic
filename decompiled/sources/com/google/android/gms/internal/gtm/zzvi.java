package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzvi extends zzbfb implements zzbgt {
    private static final zzvi zza;
    private int zzf;
    private byte zzi = 2;
    private String zzg = "";
    private String zzh = "";

    static {
        zzvi zzviVar = new zzvi();
        zza = zzviVar;
        zzbff.zzan(zzvi.class, zzviVar);
    }

    private zzvi() {
    }

    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        byte b4;
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            if (obj == null) {
                                b4 = 0;
                            } else {
                                b4 = 1;
                            }
                            this.zzi = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzvh(null);
                }
                return new zzvi();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzf", "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }
}
