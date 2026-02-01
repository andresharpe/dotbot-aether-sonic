package com.google.android.gms.internal.gtm;

import com.harman.jbl.partybox.ui.customviews.ShadowLayout;

/* loaded from: classes.dex */
public final class zzakp extends zzbff implements zzbgt {
    private static final zzakp zza;
    private int zzb;
    private int zzh;
    private zzaky zzi;
    private byte zzt = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzj = "";
    private zzbfp zzk = zzbff.zzaj();
    private int zzl = ShadowLayout.f42619O;
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private zzbfp zzr = zzbff.zzaj();
    private String zzs = "";

    static {
        zzakp zzakpVar = new zzakp();
        zza = zzakpVar;
        zzbff.zzan(zzakp.class, zzakpVar);
    }

    private zzakp() {
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
                            this.zzt = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzako(null);
                }
                return new zzakp();
            }
            return zzbff.zzam(zza, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0002\u0003\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ᐉ\u0003\u0006Л\u0007ဌ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fဈ\n\rဈ\u0004\u000eЛ\u000fဈ\u000b", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzk", zzarv.class, "zzl", zzaks.zzc(), "zzm", "zzn", "zzo", "zzp", "zzq", "zzj", "zzr", zzayv.class, "zzs"});
        }
        return Byte.valueOf(this.zzt);
    }
}
