package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzawl extends zzbff implements zzbgt {
    private static final zzawl zza;
    private int zzb;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzawl zzawlVar = new zzawl();
        zza = zzawlVar;
        zzbff.zzan(zzawl.class, zzawlVar);
    }

    private zzawl() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzawj zzawjVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzawk(zzawjVar);
                }
                return new zzawl();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zzb", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
