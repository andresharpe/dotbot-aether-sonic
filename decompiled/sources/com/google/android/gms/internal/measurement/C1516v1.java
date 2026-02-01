package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v1 */
/* loaded from: classes2.dex */
public final class C1516v1 extends AbstractC1440l4 implements Q4 {
    private static final C1516v1 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C1516v1 c1516v1 = new C1516v1();
        zza = c1516v1;
        AbstractC1440l4.t(C1516v1.class, c1516v1);
    }

    private C1516v1() {
    }

    public static C1516v1 B() {
        return zza;
    }

    public final String C() {
        return this.zzh;
    }

    public final String D() {
        return this.zzj;
    }

    public final String E() {
        return this.zzi;
    }

    public final boolean F() {
        return this.zzg;
    }

    public final boolean G() {
        return (this.zze & 1) != 0;
    }

    public final boolean H() {
        return (this.zze & 4) != 0;
    }

    public final boolean I() {
        return (this.zze & 2) != 0;
    }

    public final boolean J() {
        return (this.zze & 16) != 0;
    }

    public final boolean K() {
        return (this.zze & 8) != 0;
    }

    public final int L() {
        int a4 = C1508u1.a(this.zzf);
        if (a4 == 0) {
            return 1;
        }
        return a4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1440l4
    public final Object y(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C1484r1(null);
                }
                return new C1516v1();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", C1500t1.f29788a, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
