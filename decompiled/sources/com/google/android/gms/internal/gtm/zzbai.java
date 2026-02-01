package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbai extends zzbff implements zzbgt {
    private static final zzbai zza;
    private int zzb;
    private int zzf;
    private long zzg;
    private boolean zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzh = "";
    private int zzj = 1;
    private String zzk = "";
    private String zzm = "";

    static {
        zzbai zzbaiVar = new zzbai();
        zza = zzbaiVar;
        zzbff.zzan(zzbai.class, zzbaiVar);
    }

    private zzbai() {
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
                            this.zzn = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzbae(null);
                }
                return new zzbai();
            }
            return zzbff.zzam(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔃ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0005\u0006ဌ\u0006\u0007ဈ\u0007\bင\u0004", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzk", "zzl", zzbah.zzc(), "zzm", "zzj"});
        }
        return Byte.valueOf(this.zzn);
    }
}
