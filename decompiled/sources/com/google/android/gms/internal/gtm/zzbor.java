package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbor extends zzbff implements zzbgt {
    private static final zzbor zza;
    private int zzb;
    private int zzg;
    private byte zzh = 2;
    private zzbfp zzf = zzbff.zzaj();

    static {
        zzbor zzborVar = new zzbor();
        zza = zzborVar;
        zzbff.zzan(zzbor.class, zzborVar);
    }

    private zzbor() {
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
                            this.zzh = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzboo(null);
                }
                return new zzbor();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0002\u0001б\u0004ᔄ\u0000", new Object[]{"zzb", "zzf", zzboq.class, "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
