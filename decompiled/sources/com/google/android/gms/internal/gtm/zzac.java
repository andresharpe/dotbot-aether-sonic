package com.google.android.gms.internal.gtm;

import com.harman.jbl.partybox.ui.effectlab.a;
import java.util.List;

/* loaded from: classes.dex */
public final class zzac extends zzbff implements zzbgt {
    private static final zzac zza;
    private int zzb;
    private zzs zzr;
    private float zzs;
    private boolean zzt;
    private int zzv;
    private byte zzw = 2;
    private zzbfp zzf = zzbff.zzaj();
    private zzbfp zzg = zzbff.zzaj();
    private zzbfp zzh = zzbff.zzaj();
    private zzbfp zzi = zzbff.zzaj();
    private zzbfp zzj = zzbff.zzaj();
    private zzbfp zzk = zzbff.zzaj();
    private zzbfp zzl = zzbff.zzaj();
    private zzbfp zzm = zzbff.zzaj();
    private String zzn = "";
    private String zzo = "";
    private String zzp = a.f43472q;
    private String zzq = "";
    private zzbfp zzu = zzbff.zzaj();

    static {
        zzac zzacVar = new zzac();
        zza = zzacVar;
        zzbff.zzan(zzac.class, zzacVar);
    }

    private zzac() {
    }

    public static zzac zzk() {
        return zza;
    }

    public static zzac zzl(byte[] bArr, zzbep zzbepVar) throws zzbfs {
        return (zzac) zzbff.zzaf(zza, bArr, zzbepVar);
    }

    public final int zza() {
        return this.zzj.size();
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
                            this.zzw = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzab(zznVar);
                }
                return new zzac();
            }
            return zzbff.zzam(zza, "\u0001\u0011\u0000\u0001\u0001\u0013\u0011\u0000\t\u0005\u0001\u001a\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007\u001b\tဈ\u0000\nဈ\u0001\fဈ\u0002\rဈ\u0003\u000eဉ\u0004\u000fခ\u0005\u0010\u001a\u0011င\u0007\u0012ဇ\u0006\u0013\u001a", new Object[]{"zzb", "zzg", "zzh", zzam.class, "zzi", zzaa.class, "zzj", zzu.class, "zzk", zzu.class, "zzl", zzu.class, "zzm", zzae.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzu", "zzv", "zzt", "zzf"});
        }
        return Byte.valueOf(this.zzw);
    }

    public final int zzc() {
        return this.zzl.size();
    }

    public final int zzd() {
        return this.zzv;
    }

    public final int zze() {
        return this.zzk.size();
    }

    public final int zzf() {
        return this.zzh.size();
    }

    public final zzu zzg(int i4) {
        return (zzu) this.zzj.get(i4);
    }

    public final zzu zzh(int i4) {
        return (zzu) this.zzl.get(i4);
    }

    public final zzu zzi(int i4) {
        return (zzu) this.zzk.get(i4);
    }

    public final zzam zzm(int i4) {
        return (zzam) this.zzh.get(i4);
    }

    public final String zzn() {
        return this.zzq;
    }

    public final List zzo() {
        return this.zzg;
    }

    public final List zzp() {
        return this.zzi;
    }

    public final List zzq() {
        return this.zzm;
    }

    public final List zzr() {
        return this.zzh;
    }
}
