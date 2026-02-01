package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbju extends zzbff implements zzbgt {
    private static final zzbfm zza = new zzbfm<Integer, zzbke>() { // from class: com.google.android.gms.internal.gtm.zzbju.1
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzbke zzb(Integer num) {
            throw null;
        }
    };
    private static final zzbju zzb;
    private zzbfl zzf = zzbff.zzah();

    /* renamed from: com.google.android.gms.internal.gtm.zzbju$1 */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements zzbfm<Integer, zzbke> {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzbke zzb(Integer num) {
            throw null;
        }
    }

    static {
        zzbju zzbjuVar = new zzbju();
        zzb = zzbjuVar;
        zzbff.zzan(zzbju.class, zzbjuVar);
    }

    private zzbju() {
    }

    public static zzbju zze() {
        return zzb;
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
                        return zzb;
                    }
                    return new zzbjv(null);
                }
                return new zzbju();
            }
            return zzbff.zzam(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzf", zzbke.zzc()});
        }
        return (byte) 1;
    }
}
