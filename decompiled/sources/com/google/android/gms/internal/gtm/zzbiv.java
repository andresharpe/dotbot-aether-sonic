package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbiv extends zzbff implements zzbgt {
    private static final zzbfm zza = new zzbfm<Integer, zzbjc>() { // from class: com.google.android.gms.internal.gtm.zzbiv.1
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzbjc zzb(Integer num) {
            throw null;
        }
    };
    private static final zzbfm zzb = new zzbfm<Integer, zzbjf>() { // from class: com.google.android.gms.internal.gtm.zzbiv.2
        AnonymousClass2() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzbjf zzb(Integer num) {
            throw null;
        }
    };
    private static final zzbiv zzf;
    private zzbfp zzg = zzbff.zzaj();
    private zzbfl zzh = zzbff.zzah();
    private zzbfl zzi = zzbff.zzah();

    /* renamed from: com.google.android.gms.internal.gtm.zzbiv$1 */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements zzbfm<Integer, zzbjc> {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzbjc zzb(Integer num) {
            throw null;
        }
    }

    /* renamed from: com.google.android.gms.internal.gtm.zzbiv$2 */
    /* loaded from: classes.dex */
    class AnonymousClass2 implements zzbfm<Integer, zzbjf> {
        AnonymousClass2() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzbjf zzb(Integer num) {
            throw null;
        }
    }

    static {
        zzbiv zzbivVar = new zzbiv();
        zzf = zzbivVar;
        zzbff.zzan(zzbiv.class, zzbivVar);
    }

    private zzbiv() {
    }

    public static zzbiv zze() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zzf;
                    }
                    return new zzbiw(null);
                }
                return new zzbiv();
            }
            return zzbff.zzam(zzf, "\u0001\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u001e\u0005,", new Object[]{"zzg", "zzh", zzbjc.zzb(), "zzi", zzbjf.zzb()});
        }
        return (byte) 1;
    }
}
