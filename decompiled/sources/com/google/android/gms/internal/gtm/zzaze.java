package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaze extends zzbff implements zzbgt {
    private static final zzaze zza;
    private int zzb;
    private zzbmd zzf;
    private long zzh;
    private long zzi;
    private byte zzk = 2;
    private String zzg = "";
    private String zzj = "";

    static {
        zzaze zzazeVar = new zzaze();
        zza = zzazeVar;
        zzbff.zzan(zzaze.class, zzazeVar);
    }

    private zzaze() {
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
                    return new zzazd(null);
                }
                return new zzaze();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
