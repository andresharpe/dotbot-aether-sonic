package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzai extends zzbff implements zzbgt {
    private static final zzai zza;
    private int zzb;
    private zzam zzg;
    private zzy zzh;
    private byte zzi = 2;
    private String zzf = "";

    static {
        zzai zzaiVar = new zzai();
        zza = zzaiVar;
        zzbff.zzan(zzai.class, zzaiVar);
    }

    private zzai() {
    }

    public final zzy zza() {
        zzy zzyVar = this.zzh;
        if (zzyVar == null) {
            return zzy.zzc();
        }
        return zzyVar;
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
                        return zza;
                    }
                    return new zzah(null);
                }
                return new zzai();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"zzb", "zzf", "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }

    public final String zzd() {
        return this.zzf;
    }

    public final boolean zze() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zzf() {
        return (this.zzb & 1) != 0;
    }
}
