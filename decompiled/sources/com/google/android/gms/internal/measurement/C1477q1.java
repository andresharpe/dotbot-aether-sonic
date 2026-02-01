package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q1 */
/* loaded from: classes2.dex */
public final class C1477q1 extends AbstractC1440l4 implements Q4 {
    private static final C1477q1 zza;
    private int zze;
    private C1 zzf;
    private C1516v1 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        C1477q1 c1477q1 = new C1477q1();
        zza = c1477q1;
        AbstractC1440l4.t(C1477q1.class, c1477q1);
    }

    private C1477q1() {
    }

    public static C1477q1 B() {
        return zza;
    }

    public static /* synthetic */ void F(C1477q1 c1477q1, String str) {
        c1477q1.zze |= 8;
        c1477q1.zzi = str;
    }

    public final C1516v1 C() {
        C1516v1 c1516v1 = this.zzg;
        if (c1516v1 == null) {
            return C1516v1.B();
        }
        return c1516v1;
    }

    public final C1 D() {
        C1 c12 = this.zzf;
        if (c12 == null) {
            return C1.C();
        }
        return c12;
    }

    public final String E() {
        return this.zzi;
    }

    public final boolean G() {
        return this.zzh;
    }

    public final boolean H() {
        return (this.zze & 4) != 0;
    }

    public final boolean I() {
        return (this.zze & 2) != 0;
    }

    public final boolean J() {
        return (this.zze & 8) != 0;
    }

    public final boolean K() {
        return (this.zze & 1) != 0;
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
                    return new C1469p1(null);
                }
                return new C1477q1();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
