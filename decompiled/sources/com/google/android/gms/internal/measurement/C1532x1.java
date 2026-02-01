package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x1 */
/* loaded from: classes2.dex */
public final class C1532x1 extends AbstractC1440l4 implements Q4 {
    private static final C1532x1 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C1477q1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C1532x1 c1532x1 = new C1532x1();
        zza = c1532x1;
        AbstractC1440l4.t(C1532x1.class, c1532x1);
    }

    private C1532x1() {
    }

    public static C1524w1 C() {
        return (C1524w1) zza.u();
    }

    public static /* synthetic */ void F(C1532x1 c1532x1, String str) {
        c1532x1.zze |= 2;
        c1532x1.zzg = str;
    }

    public final int A() {
        return this.zzf;
    }

    public final C1477q1 B() {
        C1477q1 c1477q1 = this.zzh;
        if (c1477q1 == null) {
            return C1477q1.B();
        }
        return c1477q1;
    }

    public final String E() {
        return this.zzg;
    }

    public final boolean G() {
        return this.zzi;
    }

    public final boolean H() {
        return this.zzj;
    }

    public final boolean I() {
        return this.zzk;
    }

    public final boolean J() {
        return (this.zze & 1) != 0;
    }

    public final boolean K() {
        return (this.zze & 32) != 0;
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
                    return new C1524w1(null);
                }
                return new C1532x1();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
