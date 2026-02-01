package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaav extends zzbff implements zzbgt {
    private static final zzbfm zza = new zzbfm<Integer, zzabm>() { // from class: com.google.android.gms.internal.gtm.zzaav.1
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzabm zzb(Integer num) {
            throw null;
        }
    };
    private static final zzaav zzb;
    private int zzf;
    private int zzg;
    private int zzh;
    private boolean zzl;
    private byte zzn = 2;
    private zzbfl zzi = zzbff.zzah();
    private zzbfp zzj = zzbff.zzaj();
    private zzbfp zzk = zzbff.zzaj();
    private zzbfp zzm = zzbff.zzaj();

    /* renamed from: com.google.android.gms.internal.gtm.zzaav$1 */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements zzbfm<Integer, zzabm> {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzabm zzb(Integer num) {
            throw null;
        }
    }

    static {
        zzaav zzaavVar = new zzaav();
        zzb = zzaavVar;
        zzbff.zzan(zzaav.class, zzaavVar);
    }

    private zzaav() {
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
                            this.zzn = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaaw(null);
                }
                return new zzaav();
            }
            return zzbff.zzam(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0002\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b\u0004Л\u0005ဇ\u0002\u0006Л\u0007\u001e", new Object[]{"zzf", "zzg", zzaaz.zzc(), "zzh", zzabj.zzc(), "zzj", zzapd.class, "zzk", zzvx.class, "zzl", "zzm", zzagh.class, "zzi", zzabm.zzc()});
        }
        return Byte.valueOf(this.zzn);
    }
}
