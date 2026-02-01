package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbqb extends zzbfb implements zzbgt {
    private static final zzbqb zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zzbox zzj;
    private zzbqe zzk;
    private zzbpj zzl;
    private zzbpm zzm;
    private zzbpa zzn;
    private zzbpp zzo;
    private zzbqh zzp;
    private zzbpg zzq;
    private zzbou zzr;
    private zzbpd zzs;
    private zzbpy zzt;
    private int zzu;
    private zzbpv zzv;
    private zzbng zzw;
    private zzbbe zzx;
    private int zzy;
    private byte zzz = 2;

    static {
        zzbqb zzbqbVar = new zzbqb();
        zza = zzbqbVar;
        zzbff.zzan(zzbqb.class, zzbqbVar);
    }

    private zzbqb() {
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
                            this.zzz = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzbqa(null);
                }
                return new zzbqb();
            }
            return zzbff.zzam(zza, "\u0001\u0013\u0000\u0001\u0001+\u0013\u0000\u0000\u0002\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\fဉ\u0003\rဉ\u0004\u000eဉ\u0005\u000fဉ\u0006\u0012ဉ\u0007\u0015ဉ\b\u0016ဉ\t\u0017ᐉ\n\u0018ဉ\u000b\u0019ဉ\f\u001eဉ\r\u001fဌ\u000e(ᐉ\u000f)ဉ\u0010*ဉ\u0011+ဌ\u0012", new Object[]{"zzf", "zzg", zzbrf.zzb(), "zzh", zzbqw.zzb(), "zzi", zzbrc.zzb(), "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", zzbqz.zzb(), "zzv", "zzw", "zzx", "zzy", zzbne.zzb()});
        }
        return Byte.valueOf(this.zzz);
    }
}
