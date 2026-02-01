package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzro extends zzbff implements zzbgt {
    private static final zzro zza;
    private int zzb;
    private long zzf;
    private zzac zzg;
    private zzak zzh;
    private byte zzi = 2;

    static {
        zzro zzroVar = new zzro();
        zza = zzroVar;
        zzbff.zzan(zzro.class, zzroVar);
    }

    private zzro() {
    }

    public static zzrn zze() {
        return (zzrn) zza.zzZ();
    }

    public static zzro zzg(InputStream inputStream, zzbep zzbepVar) throws IOException {
        return (zzro) zzbff.zzae(zza, inputStream, zzbepVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzro zzroVar, long j4) {
        zzroVar.zzb |= 1;
        zzroVar.zzf = j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzro zzroVar, zzac zzacVar) {
        zzacVar.getClass();
        zzroVar.zzg = zzacVar;
        zzroVar.zzb |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzro zzroVar, zzak zzakVar) {
        zzakVar.getClass();
        zzroVar.zzh = zzakVar;
        zzroVar.zzb |= 4;
    }

    public final long zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        byte b4;
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzrm zzrmVar = null;
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
                    return new zzrn(zzrmVar);
                }
                return new zzro();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔉ\u0001\u0003ᐉ\u0002", new Object[]{"zzb", "zzf", "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }

    public final zzac zzc() {
        zzac zzacVar = this.zzg;
        if (zzacVar == null) {
            return zzac.zzk();
        }
        return zzacVar;
    }

    public final zzak zzd() {
        zzak zzakVar = this.zzh;
        if (zzakVar == null) {
            return zzak.zzf();
        }
        return zzakVar;
    }

    public final boolean zzk() {
        return (this.zzb & 2) != 0;
    }

    public final boolean zzl() {
        return (this.zzb & 4) != 0;
    }
}
