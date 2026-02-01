package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaeh extends zzbff implements zzbgt {
    private static final zzbfm zza = new zzbfm<Integer, zzabs>() { // from class: com.google.android.gms.internal.gtm.zzaeh.1
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzabs zzb(Integer num) {
            throw null;
        }
    };
    private static final zzaeh zzb;
    private int zzf;
    private zzacr zzl;
    private byte zzm = 2;
    private zzbfp zzg = zzbff.zzaj();
    private zzbfl zzh = zzbff.zzah();
    private zzbfp zzi = zzbff.zzaj();
    private zzbfp zzj = zzbff.zzaj();
    private zzbfp zzk = zzbff.zzaj();

    /* renamed from: com.google.android.gms.internal.gtm.zzaeh$1 */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements zzbfm<Integer, zzabs> {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzabs zzb(Integer num) {
            throw null;
        }
    }

    static {
        zzaeh zzaehVar = new zzaeh();
        zzb = zzaehVar;
        zzbff.zzan(zzaeh.class, zzaehVar);
    }

    private zzaeh() {
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
                            this.zzm = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaei(null);
                }
                return new zzaeh();
            }
            return zzbff.zzam(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0005\u0002\u0001\u001b\u0002\u001e\u0003\u001b\u0004Л\u0005\u001b\u0006ᐉ\u0000", new Object[]{"zzf", "zzg", zzaee.class, "zzh", zzabs.zzc(), "zzi", zzadn.class, "zzj", zzacw.class, "zzk", zzady.class, "zzl"});
        }
        return Byte.valueOf(this.zzm);
    }
}
