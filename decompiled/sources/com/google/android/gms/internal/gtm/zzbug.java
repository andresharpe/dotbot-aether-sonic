package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbug extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzbug zzb;
    private zzbub zzA;
    private long zzB;
    private int zzf;
    private int zzg;
    private zzbti zzj;
    private zzbtu zzk;
    private zzbtz zzl;
    private zzbui zzm;
    private zzbun zzn;
    private zzbus zzo;
    private zzbva zzp;
    private zzbvc zzq;
    private zzbvo zzr;
    private zzbvq zzs;
    private zzbvs zzt;
    private zzbvx zzu;
    private zzbvz zzv;
    private zzbwb zzw;
    private zzbwg zzx;
    private zzbwl zzy;
    private zzbwn zzz;
    private byte zzC = 2;
    private String zzh = "";
    private String zzi = "";

    static {
        zzbug zzbugVar = new zzbug();
        zzb = zzbugVar;
        zzbff.zzan(zzbug.class, zzbugVar);
        zza = zzbff.zzac(zzbmd.zze(), zzbugVar, zzbugVar, null, 66321687, zzbip.zzk, zzbug.class);
    }

    private zzbug() {
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
                            this.zzC = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzbuc(null);
                }
                return new zzbug();
            }
            return zzbff.zzam(zzb, "\u0001\u0016\u0000\u0001\u0001\u0019\u0016\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0003\u0003ဉ\u0006\u0004ဉ\n\u0005ဉ\u000f\u0006ဈ\u0001\u0007ဈ\u0002\bဉ\u0012\tဉ\u0014\nဉ\u000e\u000bဉ\u000b\fဂ\u0015\rဉ\r\u000eဉ\u0005\u000fဉ\u0013\u0010ဉ\t\u0012ဉ\u0011\u0014ဉ\f\u0016ဉ\u0004\u0017ဉ\u0010\u0018ဉ\u0007\u0019ဉ\b", new Object[]{"zzf", "zzg", zzbuf.zzb(), "zzj", "zzm", "zzq", "zzv", "zzh", "zzi", "zzy", "zzA", "zzu", "zzr", "zzB", "zzt", "zzl", "zzz", "zzp", "zzx", "zzs", "zzk", "zzw", "zzn", "zzo"});
        }
        return Byte.valueOf(this.zzC);
    }
}
