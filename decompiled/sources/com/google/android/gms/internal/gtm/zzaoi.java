package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaoi extends zzbff implements zzbgt {
    private static final zzaoi zza;
    private int zzb;
    private zzamq zzf;
    private int zzg;
    private double zzh;
    private double zzi;
    private double zzj;
    private double zzk;
    private byte zzm = 2;
    private String zzl = "";

    static {
        zzaoi zzaoiVar = new zzaoi();
        zza = zzaoiVar;
        zzbff.zzan(zzaoi.class, zzaoiVar);
    }

    private zzaoi() {
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
                    return new zzaoh(null);
                }
                return new zzaoi();
            }
            return zzbff.zzam(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004\u0006က\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zzf", "zzg", zzaog.zzc(), "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return Byte.valueOf(this.zzm);
    }
}
