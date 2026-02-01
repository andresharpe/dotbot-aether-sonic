package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaqf extends zzbff implements zzbgt {
    private static final zzaqf zza;
    private int zzb;
    private float zzh;
    private float zzi;
    private boolean zzj;
    private double zzk;
    private byte zzl = 2;
    private int zzf = 1;
    private zzbfp zzg = zzbff.zzaj();

    static {
        zzaqf zzaqfVar = new zzaqf();
        zza = zzaqfVar;
        zzbff.zzan(zzaqf.class, zzaqfVar);
    }

    private zzaqf() {
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
                            this.zzl = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzaqb(null);
                }
                return new zzaqf();
            }
            return zzbff.zzam(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဌ\u0000\u0002Л\u0003ခ\u0001\u0004ခ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzf", zzaqe.zzc(), "zzg", zzasg.class, "zzh", "zzi", "zzj", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
