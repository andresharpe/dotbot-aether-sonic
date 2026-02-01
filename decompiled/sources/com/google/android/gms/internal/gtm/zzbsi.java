package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbsi extends zzbfb implements zzbgt {
    public static final zzbfd zza;
    private static final zzbsi zzf;
    private int zzg;
    private int zzk;
    private long zzn;
    private long zzo;
    private long zzp;
    private byte zzv = 2;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzl = "en";
    private long zzm = -1;
    private zzbfp zzq = zzbff.zzaj();
    private String zzr = "";
    private zzbfp zzs = zzbff.zzaj();
    private zzbfo zzt = zzbff.zzai();
    private zzbfp zzu = zzbff.zzaj();

    static {
        zzbsi zzbsiVar = new zzbsi();
        zzf = zzbsiVar;
        zzbff.zzan(zzbsi.class, zzbsiVar);
        zza = zzbff.zzac(zzbmd.zze(), zzbsiVar, zzbsiVar, null, 43918061, zzbip.zzk, zzbsi.class);
    }

    private zzbsi() {
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
                            this.zzv = b4;
                            return null;
                        }
                        return zzf;
                    }
                    return new zzbrr(null);
                }
                return new zzbsi();
            }
            return zzbff.zzam(zzf, "\u0001\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0004\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဌ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bဂ\u0006\tဂ\u0007\nဂ\b\u000bЛ\fဈ\t\rЛ\u000f\u0015\u0011\u001b", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", zzbru.zzb(), "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", zzbrv.class, "zzr", "zzs", zzbrv.class, "zzt", "zzu", zzblc.class});
        }
        return Byte.valueOf(this.zzv);
    }
}
