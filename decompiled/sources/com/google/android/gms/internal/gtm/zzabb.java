package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzabb extends zzbff implements zzbgt {
    private static final zzabb zza;
    private int zzb;
    private boolean zzf;
    private zzaaq zzh;
    private byte zzk = 2;
    private zzbfp zzg = zzbff.zzaj();
    private zzbfp zzi = zzbff.zzaj();
    private zzbfp zzj = zzbff.zzaj();

    static {
        zzabb zzabbVar = new zzabb();
        zza = zzabbVar;
        zzbff.zzan(zzabb.class, zzabbVar);
    }

    private zzabb() {
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
                            this.zzk = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzaba(null);
                }
                return new zzabb();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0003\u0001Л\u0002ᐉ\u0001\u0003\u001b\u0004ဇ\u0000\u0005Л", new Object[]{"zzb", "zzg", zzamq.class, "zzh", "zzj", zzabc.class, "zzf", "zzi", zzaav.class});
        }
        return Byte.valueOf(this.zzk);
    }
}
