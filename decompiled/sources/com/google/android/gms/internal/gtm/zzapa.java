package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzapa extends zzbff implements zzbgt {
    private static final zzapa zza;
    private int zzb;
    private int zzf;
    private boolean zzg;
    private float zzj;
    private float zzk;
    private float zzn;
    private float zzo;
    private int zzp;
    private zzana zzq;
    private zzaok zzr;
    private int zzu;
    private byte zzw = 2;
    private int zzh = 1;
    private int zzi = 1;
    private zzbfp zzl = zzbff.zzaj();
    private zzbfp zzm = zzbff.zzaj();
    private zzbfp zzs = zzbff.zzaj();
    private zzbfp zzt = zzbff.zzaj();
    private String zzv = "";

    static {
        zzapa zzapaVar = new zzapa();
        zza = zzapaVar;
        zzbff.zzan(zzapa.class, zzapaVar);
    }

    private zzapa() {
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
                            this.zzw = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzaol(null);
                }
                return new zzapa();
            }
            return zzbff.zzam(zza, "\u0001\u0011\u0000\u0001\u0001Ǵ\u0011\u0000\u0004\u0005\u0001ᔄ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007Л\bЛ\tခ\u0006\nခ\u0007\u000bဌ\b\fဉ\n\rЛ\u000eЛ\u000fဌ\u000b\u0010ဈ\fǴဉ\t", new Object[]{"zzb", "zzf", "zzg", "zzh", zzaoz.zzc(), "zzi", zzaot.zzc(), "zzj", "zzk", "zzl", zzasg.class, "zzm", zzaoq.class, "zzn", "zzo", "zzp", zzaow.zzc(), "zzr", "zzs", zzamq.class, "zzt", zzaoi.class, "zzu", zzaoo.zzc(), "zzv", "zzq"});
        }
        return Byte.valueOf(this.zzw);
    }
}
