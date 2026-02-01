package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbmk extends zzbff implements zzbgt {
    private static final zzbfm zza = new zzbfm<Integer, zzbmj>() { // from class: com.google.android.gms.internal.gtm.zzbmk.1
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzbmj zzb(Integer num) {
            throw null;
        }
    };
    private static final zzbmk zzb;
    private zzbfl zzf = zzbff.zzah();

    /* renamed from: com.google.android.gms.internal.gtm.zzbmk$1 */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements zzbfm<Integer, zzbmj> {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzbmj zzb(Integer num) {
            throw null;
        }
    }

    static {
        zzbmk zzbmkVar = new zzbmk();
        zzb = zzbmkVar;
        zzbff.zzan(zzbmk.class, zzbmkVar);
    }

    private zzbmk() {
    }

    public static zzbmk zze() {
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
                    return new zzbml(null);
                }
                return new zzbmk();
            }
            return zzbff.zzam(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzf", zzbmj.zzb()});
        }
        return (byte) 1;
    }
}
