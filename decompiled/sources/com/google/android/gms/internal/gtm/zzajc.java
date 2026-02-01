package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzajc extends zzbff implements zzbgt {
    private static final zzajc zza;
    private int zzb;
    private zzbfp zzf = zzbff.zzaj();
    private String zzg = "";

    static {
        zzajc zzajcVar = new zzajc();
        zza = zzajcVar;
        zzbff.zzan(zzajc.class, zzajcVar);
    }

    private zzajc() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzaja zzajaVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzajb(zzajaVar);
                }
                return new zzajc();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
