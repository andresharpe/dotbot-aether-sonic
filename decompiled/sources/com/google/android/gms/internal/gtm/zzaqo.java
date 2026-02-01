package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaqo extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzaqo zzb;
    private int zzf;
    private float zzi;
    private float zzj;
    private long zzk;
    private boolean zzl;
    private zzana zzm;
    private zzbmd zzn;
    private byte zzp = 2;
    private zzbfp zzg = zzbff.zzaj();
    private zzbbw zzh = zzbbw.zzb;
    private String zzo = "";

    static {
        zzaqo zzaqoVar = new zzaqo();
        zzb = zzaqoVar;
        zzbff.zzan(zzaqo.class, zzaqoVar);
        zza = zzbff.zzac(zzbmd.zze(), zzaqoVar, zzaqoVar, null, 5464057, zzbip.zzk, zzaqo.class);
    }

    private zzaqo() {
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
                            this.zzp = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaqn(null);
                }
                return new zzaqo();
            }
            return zzbff.zzam(zzb, "\u0001\t\u0000\u0001\u0001Ǵ\t\u0000\u0001\u0002\u0001Л\u0002ခ\u0001\u0003ခ\u0002\u0004ဃ\u0003\u0005ည\u0000\u0006ဇ\u0004\u0007ဈ\u0007\u000fᐉ\u0006Ǵဉ\u0005", new Object[]{"zzf", "zzg", zzaqr.class, "zzi", "zzj", "zzk", "zzh", "zzl", "zzo", "zzn", "zzm"});
        }
        return Byte.valueOf(this.zzp);
    }
}
