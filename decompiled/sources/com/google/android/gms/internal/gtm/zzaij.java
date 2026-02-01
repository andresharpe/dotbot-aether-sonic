package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaij extends zzbff implements zzbgt {
    private static final zzbfm zza = new zzbfm<Integer, zzaiq>() { // from class: com.google.android.gms.internal.gtm.zzaij.1
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzaiq zzb(Integer num) {
            throw null;
        }
    };
    private static final zzaij zzb;
    private int zzf;
    private zzaqi zzg;
    private zzamq zzh;
    private int zzi;
    private float zzj;
    private zzaqi zzk;
    private zzaqi zzl;
    private boolean zzm;
    private boolean zzn;
    private zzamq zzq;
    private zzana zzr;
    private byte zzs = 2;
    private int zzo = 1;
    private zzbfl zzp = zzbff.zzah();

    /* renamed from: com.google.android.gms.internal.gtm.zzaij$1 */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements zzbfm<Integer, zzaiq> {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzaiq zzb(Integer num) {
            throw null;
        }
    }

    static {
        zzaij zzaijVar = new zzaij();
        zzb = zzaijVar;
        zzbff.zzan(zzaij.class, zzaijVar);
    }

    private zzaij() {
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
                            this.zzs = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaik(null);
                }
                return new zzaij();
            }
            return zzbff.zzam(zzb, "\u0001\f\u0000\u0001\u0002Ǵ\f\u0000\u0001\u0005\u0002ခ\u0003\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ဇ\u0006\u0006ဇ\u0007\bဌ\b\tᐉ\u0000\nᐉ\u0001\u000bင\u0002\f\u001e\rᐉ\tǴဉ\n", new Object[]{"zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzain.zzc(), "zzg", "zzh", "zzi", "zzp", zzaiq.zzc(), "zzq", "zzr"});
        }
        return Byte.valueOf(this.zzs);
    }
}
