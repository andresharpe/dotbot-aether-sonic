package com.google.android.gms.internal.gtm;

import java.util.List;

/* loaded from: classes.dex */
public final class zzak extends zzbff implements zzbgt {
    private static final zzak zza;
    private int zzb;
    private zzac zzg;
    private byte zzi = 2;
    private zzbfp zzf = zzbff.zzaj();
    private String zzh = "";

    static {
        zzak zzakVar = new zzak();
        zza = zzakVar;
        zzbff.zzan(zzak.class, zzakVar);
    }

    private zzak() {
    }

    public static zzaj zzd() {
        return (zzaj) zza.zzZ();
    }

    public static zzak zzf() {
        return zza;
    }

    public static zzak zzg(byte[] bArr, zzbep zzbepVar) throws zzbfs {
        return (zzak) zzbff.zzaf(zza, bArr, zzbepVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzak zzakVar, zzac zzacVar) {
        zzacVar.getClass();
        zzakVar.zzg = zzacVar;
        zzakVar.zzb |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzak zzakVar, String str) {
        str.getClass();
        zzakVar.zzb |= 2;
        zzakVar.zzh = str;
    }

    public final int zza() {
        return this.zzf.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        byte b4;
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzn zznVar = null;
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
                    return new zzaj(zznVar);
                }
                return new zzak();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ဈ\u0001", new Object[]{"zzb", "zzf", zzai.class, "zzg", "zzh"});
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

    public final String zzh() {
        return this.zzh;
    }

    public final List zzi() {
        return this.zzf;
    }

    public final boolean zzm() {
        return (this.zzb & 1) != 0;
    }
}
