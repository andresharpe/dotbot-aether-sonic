package com.google.android.gms.internal.gtm;

import java.util.List;

/* loaded from: classes.dex */
public final class zzae extends zzbff implements zzbgt {
    private static final zzae zza;
    private zzbfl zzb = zzbff.zzah();
    private zzbfl zzf = zzbff.zzah();
    private zzbfl zzg = zzbff.zzah();
    private zzbfl zzh = zzbff.zzah();
    private zzbfl zzi = zzbff.zzah();
    private zzbfl zzj = zzbff.zzah();
    private zzbfl zzk = zzbff.zzah();
    private zzbfl zzl = zzbff.zzah();
    private zzbfl zzm = zzbff.zzah();
    private zzbfl zzn = zzbff.zzah();

    static {
        zzae zzaeVar = new zzae();
        zza = zzaeVar;
        zzbff.zzan(zzae.class, zzaeVar);
    }

    private zzae() {
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
                    return new zzad(zznVar);
                }
                return new zzae();
            }
            return zzbff.zzam(zza, "\u0001\n\u0000\u0000\u0001\n\n\u0000\n\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004\u0016\u0005\u0016\u0006\u0016\u0007\u0016\b\u0016\t\u0016\n\u0016", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        return (byte) 1;
    }

    public final List zzc() {
        return this.zzk;
    }

    public final List zzd() {
        return this.zzm;
    }

    public final List zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzi;
    }

    public final List zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzb;
    }

    public final List zzi() {
        return this.zzl;
    }

    public final List zzj() {
        return this.zzn;
    }

    public final List zzk() {
        return this.zzh;
    }

    public final List zzl() {
        return this.zzj;
    }
}
