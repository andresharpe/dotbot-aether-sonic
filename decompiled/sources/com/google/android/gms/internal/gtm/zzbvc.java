package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbvc extends zzbff implements zzbgt {
    private static final zzbvc zza;
    private int zzb;
    private int zzo;
    private int zzp;
    private zzuc zzr;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private String zzn = "";
    private String zzq = "";

    static {
        zzbvc zzbvcVar = new zzbvc();
        zza = zzbvcVar;
        zzbff.zzan(zzbvc.class, zzbvcVar);
    }

    private zzbvc() {
    }

    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbvb(null);
                }
                return new zzbvc();
            }
            return zzbff.zzam(zza, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0006\u0007ဈ\u0007\bဈ\b\tင\t\nင\n\u000bဈ\u000b\fဈ\u0005\rဉ\f", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzk", "zzr"});
        }
        return (byte) 1;
    }
}
