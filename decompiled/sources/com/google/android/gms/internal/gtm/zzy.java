package com.google.android.gms.internal.gtm;

import java.util.List;

/* loaded from: classes.dex */
public final class zzy extends zzbff implements zzbgt {
    private static final zzy zza;
    private byte zzh = 2;
    private zzbfp zzb = zzbff.zzaj();
    private zzbfp zzf = zzbff.zzaj();
    private zzbfp zzg = zzbff.zzaj();

    static {
        zzy zzyVar = new zzy();
        zza = zzyVar;
        zzbff.zzan(zzy.class, zzyVar);
    }

    private zzy() {
    }

    public static zzy zzc() {
        return zza;
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
                    return new zzx(null);
                }
                return new zzy();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0002\u0001Л\u0002Л\u0003\u001b", new Object[]{"zzb", zzam.class, "zzf", zzam.class, "zzg", zzw.class});
        }
        return Byte.valueOf(this.zzh);
    }

    public final List zzd() {
        return this.zzg;
    }

    public final List zze() {
        return this.zzf;
    }

    public final List zzf() {
        return this.zzb;
    }
}
