package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzatn extends zzbff implements zzbgt {
    private static final zzbfm zza = new zzbfm<Integer, zzatr>() { // from class: com.google.android.gms.internal.gtm.zzatn.1
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzatr zzb(Integer num) {
            throw null;
        }
    };
    private static final zzatn zzb;
    private int zzf;
    private zzamq zzg;
    private int zzh;
    private byte zzj = 2;
    private zzbfl zzi = zzbff.zzah();

    /* renamed from: com.google.android.gms.internal.gtm.zzatn$1 */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements zzbfm<Integer, zzatr> {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzatr zzb(Integer num) {
            throw null;
        }
    }

    static {
        zzatn zzatnVar = new zzatn();
        zzb = zzatnVar;
        zzbff.zzan(zzatn.class, zzatnVar);
    }

    private zzatn() {
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
                            this.zzj = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzato(null);
                }
                return new zzatn();
            }
            return zzbff.zzam(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003\u001e", new Object[]{"zzf", "zzg", "zzh", "zzi", zzatr.zzc()});
        }
        return Byte.valueOf(this.zzj);
    }
}
