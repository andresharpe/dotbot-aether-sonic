package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaa extends zzbff implements zzbgt {
    private static final zzaa zza;
    private int zzb;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        zzaa zzaaVar = new zzaa();
        zza = zzaaVar;
        zzbff.zzan(zzaa.class, zzaaVar);
    }

    private zzaa() {
    }

    public final int zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        byte b4;
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzn zznVar = null;
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
                    return new zzz(zznVar);
                }
                return new zzaa();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }

    public final int zzc() {
        return this.zzg;
    }
}
