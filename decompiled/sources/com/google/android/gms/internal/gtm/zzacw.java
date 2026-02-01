package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzacw extends zzbff implements zzbgt {
    private static final zzacw zza;
    private int zzb;
    private Object zzg;
    private zzaqx zzj;
    private zzacr zzk;
    private int zzl;
    private int zzf = 0;
    private byte zzm = 2;
    private zzbfp zzh = zzbff.zzaj();
    private zzbfp zzi = zzbff.zzaj();

    static {
        zzacw zzacwVar = new zzacw();
        zza = zzacwVar;
        zzbff.zzan(zzacw.class, zzacwVar);
    }

    private zzacw() {
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
                            this.zzm = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzacs(null);
                }
                return new zzacw();
            }
            return zzbff.zzam(zza, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0002\u0001\u0001\u001b\u0002\u001b\u0003ဉ\u0000\u0004ᐉ\u0001\u0005ဌ\u0002\u0006ြ\u0000", new Object[]{"zzg", "zzf", "zzb", "zzh", zzaee.class, "zzi", zzady.class, "zzj", "zzk", "zzl", zzacv.zzc(), zzadp.class});
        }
        return Byte.valueOf(this.zzm);
    }
}
