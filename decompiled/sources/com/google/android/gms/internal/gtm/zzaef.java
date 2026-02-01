package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaef extends zzbff implements zzbgt {
    private static final zzbfm zza = new zzbfm<Integer, zzabw>() { // from class: com.google.android.gms.internal.gtm.zzaef.1
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzabw zzb(Integer num) {
            throw null;
        }
    };
    private static final zzaef zzb;
    private int zzf;
    private zzayy zzh;
    private zzayj zzi;
    private byte zzl = 2;
    private zzbfp zzg = zzbff.zzaj();
    private zzbfp zzj = zzbff.zzaj();
    private zzbfl zzk = zzbff.zzah();

    /* renamed from: com.google.android.gms.internal.gtm.zzaef$1 */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements zzbfm<Integer, zzabw> {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzabw zzb(Integer num) {
            throw null;
        }
    }

    static {
        zzaef zzaefVar = new zzaef();
        zzb = zzaefVar;
        zzbff.zzan(zzaef.class, zzaefVar);
    }

    private zzaef() {
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
                            this.zzl = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaeg(null);
                }
                return new zzaef();
            }
            return zzbff.zzam(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001\u001b\u0002ᐉ\u0000\u0003ဉ\u0001\u0004Л\u0005\u001e", new Object[]{"zzf", "zzg", zzaee.class, "zzh", "zzi", "zzj", zzaeh.class, "zzk", zzabw.zzc()});
        }
        return Byte.valueOf(this.zzl);
    }
}
