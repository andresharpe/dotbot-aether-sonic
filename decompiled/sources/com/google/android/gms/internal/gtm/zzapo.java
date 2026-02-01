package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzapo extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzbfm zzb = new zzbfm<Integer, zzaps>() { // from class: com.google.android.gms.internal.gtm.zzapo.1
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzaps zzb(Integer num) {
            throw null;
        }
    };
    private static final zzapo zzf;
    private int zzg;
    private zzana zzm;
    private zzbmd zzn;
    private byte zzo = 2;
    private String zzh = "";
    private String zzi = "";
    private zzbfl zzj = zzbff.zzah();
    private String zzk = "";
    private String zzl = "";

    /* renamed from: com.google.android.gms.internal.gtm.zzapo$1 */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements zzbfm<Integer, zzaps> {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzaps zzb(Integer num) {
            throw null;
        }
    }

    static {
        zzapo zzapoVar = new zzapo();
        zzf = zzapoVar;
        zzbff.zzan(zzapo.class, zzapoVar);
        zza = zzbff.zzac(zzbmd.zze(), zzapoVar, zzapoVar, null, 308676116, zzbip.zzk, zzapo.class);
    }

    private zzapo() {
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
                            this.zzo = b4;
                            return null;
                        }
                        return zzf;
                    }
                    return new zzapp(null);
                }
                return new zzapo();
            }
            return zzbff.zzam(zzf, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003\u001e\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", zzaps.zzc(), "zzk", "zzl", "zzn", "zzm"});
        }
        return Byte.valueOf(this.zzo);
    }
}
