package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbrv extends zzbfb implements zzbgt {
    private static final zzbfm zza = new zzbfm<Integer, zzbse>() { // from class: com.google.android.gms.internal.gtm.zzbrv.1
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzbse zzb(Integer num) {
            throw null;
        }
    };
    private static final zzbfm zzf = new zzbfm<Integer, zzbsh>() { // from class: com.google.android.gms.internal.gtm.zzbrv.2
        AnonymousClass2() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzbsh zzb(Integer num) {
            throw null;
        }
    };
    private static final zzbrv zzg;
    private zzbmd zzB;
    private int zzh;
    private boolean zzq;
    private boolean zzr;
    private int zzs;
    private int zzt;
    private zzbtd zzu;
    private zzbso zzv;
    private zzbsu zzw;
    private byte zzC = 2;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private zzbfl zzn = zzbff.zzah();
    private zzbfl zzo = zzbff.zzah();
    private zzbfo zzp = zzbff.zzai();
    private String zzx = "";
    private zzbbw zzy = zzbbw.zzb;
    private long zzz = -1;
    private long zzA = -1;

    /* renamed from: com.google.android.gms.internal.gtm.zzbrv$1 */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements zzbfm<Integer, zzbse> {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzbse zzb(Integer num) {
            throw null;
        }
    }

    /* renamed from: com.google.android.gms.internal.gtm.zzbrv$2 */
    /* loaded from: classes.dex */
    class AnonymousClass2 implements zzbfm<Integer, zzbsh> {
        AnonymousClass2() {
        }

        @Override // com.google.android.gms.internal.gtm.zzbfm
        public /* bridge */ /* synthetic */ zzbsh zzb(Integer num) {
            throw null;
        }
    }

    static {
        zzbrv zzbrvVar = new zzbrv();
        zzg = zzbrvVar;
        zzbff.zzan(zzbrv.class, zzbrvVar);
    }

    private zzbrv() {
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
                            this.zzC = b4;
                            return null;
                        }
                        return zzg;
                    }
                    return new zzbsb(null);
                }
                return new zzbrv();
            }
            return zzbff.zzam(zzg, "\u0001\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0003\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\f\u0005ဈ\u0004\u0006\u001e\u0007ည\r\bဂ\u000e\tဂ\u000f\n\u001e\u000b\u0014\fᐉ\u0010\rဇ\u0005\u000eဌ\u0007\u0010ဇ\u0006\u0011ဈ\u0003\u0012ဉ\t\u0013ဉ\n\u0014င\b\u0015ဉ\u000b", new Object[]{"zzh", "zzi", "zzj", "zzk", "zzx", "zzm", "zzn", zzbse.zzb(), "zzy", "zzz", "zzA", "zzo", zzbsh.zzb(), "zzp", "zzB", "zzq", "zzs", zzbry.zzb(), "zzr", "zzl", "zzu", "zzv", "zzt", "zzw"});
        }
        return Byte.valueOf(this.zzC);
    }
}
