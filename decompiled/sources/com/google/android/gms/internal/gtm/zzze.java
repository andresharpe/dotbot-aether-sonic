package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzze extends zzbff implements zzbgt {
    private static final zzbfm zza = new zzbfm<Integer, zzzh>() { // from class: com.google.android.gms.internal.gtm.zzze.1
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzzh zzb(Integer num) {
            throw null;
        }
    };
    private static final zzze zzb;
    private zzbfl zzf = zzbff.zzah();

    /* renamed from: com.google.android.gms.internal.gtm.zzze$1 */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements zzbfm<Integer, zzzh> {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzzh zzb(Integer num) {
            throw null;
        }
    }

    static {
        zzze zzzeVar = new zzze();
        zzb = zzzeVar;
        zzbff.zzan(zzze.class, zzzeVar);
    }

    private zzze() {
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
                    return new zzzi(null);
                }
                return new zzze();
            }
            return zzbff.zzam(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzf", zzzh.zzc()});
        }
        return (byte) 1;
    }
}
