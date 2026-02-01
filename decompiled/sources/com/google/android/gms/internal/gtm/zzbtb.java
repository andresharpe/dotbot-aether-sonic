package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbtb extends zzbff implements zzbgt {
    private static final zzbtb zza;
    private int zzb;
    private zzbfp zzf = zzbff.zzaj();
    private long zzg;

    static {
        zzbtb zzbtbVar = new zzbtb();
        zza = zzbtbVar;
        zzbff.zzan(zzbtb.class, zzbtbVar);
    }

    private zzbtb() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzbsv zzbsvVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbta(zzbsvVar);
                }
                return new zzbtb();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဂ\u0000", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
