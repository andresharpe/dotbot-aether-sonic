package com.google.android.gms.internal.gtm;

import java.util.List;

/* loaded from: classes.dex */
public final class zzu extends zzbff implements zzbgt {
    private static final zzu zza;
    private int zzb;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private byte zzk = 2;
    private zzbfl zzf = zzbff.zzah();

    static {
        zzu zzuVar = new zzu();
        zza = zzuVar;
        zzbff.zzan(zzu.class, zzuVar);
    }

    private zzu() {
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
                            this.zzk = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzt(zznVar);
                }
                return new zzu();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001ဇ\u0003\u0002ᔄ\u0000\u0003\u0016\u0004င\u0001\u0006ဇ\u0002", new Object[]{"zzb", "zzj", "zzg", "zzf", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzk);
    }

    public final List zzc() {
        return this.zzf;
    }
}
