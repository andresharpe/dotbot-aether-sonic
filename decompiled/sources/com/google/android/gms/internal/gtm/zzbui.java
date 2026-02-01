package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbui extends zzbff implements zzbgt {
    private static final zzbui zza;
    private int zzb;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private int zzm;
    private int zzn;

    static {
        zzbui zzbuiVar = new zzbui();
        zza = zzbuiVar;
        zzbff.zzan(zzbui.class, zzbuiVar);
    }

    private zzbui() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzbte zzbteVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbuh(zzbteVar);
                }
                return new zzbui();
            }
            return zzbff.zzam(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007\tင\b", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        return (byte) 1;
    }
}
