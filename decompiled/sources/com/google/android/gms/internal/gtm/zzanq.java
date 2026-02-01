package com.google.android.gms.internal.gtm;

import com.harman.jbl.partybox.ui.customviews.ShadowLayout;

/* loaded from: classes.dex */
public final class zzanq extends zzbff implements zzbgt {
    private static final zzanq zza;
    private int zzb;
    private int zzf = ShadowLayout.f42619O;
    private String zzg = "";

    static {
        zzanq zzanqVar = new zzanq();
        zza = zzanqVar;
        zzbff.zzan(zzanq.class, zzanqVar);
    }

    private zzanq() {
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
                    return new zzanp(null);
                }
                return new zzanq();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzf", zzaks.zzc(), "zzg"});
        }
        return (byte) 1;
    }
}
