package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzvn extends zzbff implements zzbgt {
    private static final zzvn zza;
    private int zzb;
    private zzvi zzg;
    private byte zzi = 2;
    private int zzf = 1;
    private String zzh = "";

    static {
        zzvn zzvnVar = new zzvn();
        zza = zzvnVar;
        zzbff.zzan(zzvn.class, zzvnVar);
    }

    private zzvn() {
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
                    return new zzvm(null);
                }
                return new zzvn();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0002\u0002င\u0000\u0003ᐉ\u0001", new Object[]{"zzb", "zzh", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzi);
    }
}
