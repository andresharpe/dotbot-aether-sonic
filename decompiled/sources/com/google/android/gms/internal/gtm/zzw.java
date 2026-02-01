package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzw extends zzbff implements zzbgt {
    private static final zzw zza;
    private int zzb;
    private long zzg;
    private boolean zzi;
    private long zzj;
    private String zzf = "";
    private long zzh = 2147483647L;

    static {
        zzw zzwVar = new zzw();
        zza = zzwVar;
        zzbff.zzan(zzw.class, zzwVar);
    }

    private zzw() {
    }

    public final long zza() {
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzn zznVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzv(zznVar);
                }
                return new zzw();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဂ\u0004", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzg;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return this.zzi;
    }

    public final boolean zzh() {
        return (this.zzb & 1) != 0;
    }
}
