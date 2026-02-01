package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzary extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzary zzb;
    private int zzf;
    private zzaqi zzg;
    private zzaqi zzh;
    private byte zzi = 2;

    static {
        zzary zzaryVar = new zzary();
        zzb = zzaryVar;
        zzbff.zzan(zzary.class, zzaryVar);
        zza = zzbff.zzac(zzbmd.zze(), zzaryVar, zzaryVar, null, 26764887, zzbip.zzk, zzary.class);
    }

    private zzary() {
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
                            this.zzi = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzarx(null);
                }
                return new zzary();
            }
            return zzbff.zzam(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔉ\u0000\u0002ᔉ\u0001", new Object[]{"zzf", "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }
}
