package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbcz extends zzbfb implements zzbgt {
    private static final zzbcz zza;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzo;
    private boolean zzq;
    private byte zzs = 2;
    private zzbfp zzn = zzbhc.zze();
    private boolean zzp = true;
    private zzbfp zzr = zzbhc.zze();

    static {
        zzbcz zzbczVar = new zzbcz();
        zza = zzbczVar;
        zzbff.zzan(zzbcz.class, zzbczVar);
    }

    private zzbcz() {
    }

    public static zzbcz zze() {
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
                            this.zzs = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzbcq(null);
                }
                return new zzbcz();
            }
            return new zzbhd(zza, "\u0001\f\u0000\u0001\u0001ϧ\f\u0000\u0002\u0001\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0005\u0005ဇ\u0003\u0006ဌ\u0002\nဇ\u0006\u000b\u001b\fဇ\u0007\rဇ\b\u000eဇ\t\u000fဇ\u0004ϧЛ", new Object[]{"zzf", "zzg", zzbct.zzc(), "zzh", "zzl", "zzj", "zzi", zzbcw.zzc(), "zzm", "zzn", zzbcy.class, "zzo", "zzp", "zzq", "zzk", "zzr", zzbei.class});
        }
        return Byte.valueOf(this.zzs);
    }
}
