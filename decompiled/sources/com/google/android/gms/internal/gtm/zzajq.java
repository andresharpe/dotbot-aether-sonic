package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzajq extends zzbff implements zzbgt {
    private static final zzajq zza;
    private int zzb;
    private zzajl zzf;
    private zzajl zzg;
    private zzajl zzh;
    private int zzi;
    private int zzk;
    private long zzl;
    private int zzm;
    private double zzn;
    private float zzo;
    private boolean zzp;
    private zzbmd zzr;
    private zzbmd zzu;
    private zzana zzv;
    private byte zzw = 2;
    private String zzj = "";
    private String zzq = "";
    private zzbfp zzs = zzbff.zzaj();
    private zzbfp zzt = zzbff.zzaj();

    static {
        zzajq zzajqVar = new zzajq();
        zza = zzajqVar;
        zzbff.zzan(zzajq.class, zzajqVar);
    }

    private zzajq() {
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
                            this.zzw = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzajm(null);
                }
                return new zzajq();
            }
            return zzbff.zzam(zza, "\u0001\u0011\u0000\u0001\u0001Ǵ\u0011\u0000\u0002\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᔌ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007က\b\bဇ\n\tᐉ\f\u000b\u001b\f\u001b\rᐉ\r\u000eဂ\u0006\u000fခ\t\u0012ဆ\u0007\u0013ဈ\u000bǴဉ\u000e", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", zzajp.zzc(), "zzj", "zzk", "zzn", "zzp", "zzr", "zzs", zzajs.class, "zzt", zzajs.class, "zzu", "zzl", "zzo", "zzm", "zzq", "zzv"});
        }
        return Byte.valueOf(this.zzw);
    }
}
