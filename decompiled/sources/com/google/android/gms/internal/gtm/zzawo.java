package com.google.android.gms.internal.gtm;

import com.harman.jbl.partybox.ui.customviews.ShadowLayout;

/* loaded from: classes.dex */
public final class zzawo extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzawo zzb;
    private int zzf;
    private zzamq zzg;
    private long zzn;
    private long zzo;
    private zzazb zzp;
    private zzazb zzq;
    private zzaky zzr;
    private zzbmd zzt;
    private byte zzu = 2;
    private zzbfp zzh = zzbff.zzaj();
    private String zzi = "";
    private int zzj = ShadowLayout.f42619O;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private zzbfp zzs = zzbff.zzaj();

    static {
        zzawo zzawoVar = new zzawo();
        zzb = zzawoVar;
        zzbff.zzan(zzawo.class, zzawoVar);
        zza = zzbff.zzac(zzbmd.zze(), zzawoVar, zzawoVar, null, 18502900, zzbip.zzk, zzawo.class);
    }

    private zzawo() {
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
                            this.zzu = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzawn(null);
                }
                return new zzawo();
            }
            return zzbff.zzam(zzb, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0002\u0005\u0001ᐉ\u0000\u0002Л\u0003ဈ\u0001\u0004င\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဂ\u0006\tဂ\u0007\nᐉ\n\u000bᐉ\u000b\fЛ\u000eဉ\b\u000fဉ\t", new Object[]{"zzf", "zzg", "zzh", zzarp.class, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzr", "zzt", "zzs", zzayv.class, "zzp", "zzq"});
        }
        return Byte.valueOf(this.zzu);
    }
}
