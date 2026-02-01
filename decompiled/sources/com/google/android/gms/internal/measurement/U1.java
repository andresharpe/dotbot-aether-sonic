package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class U1 extends AbstractC1440l4 implements Q4 {
    private static final U1 zza;
    private int zze;
    private int zzf;
    private C1462o2 zzg;
    private C1462o2 zzh;
    private boolean zzi;

    static {
        U1 u12 = new U1();
        zza = u12;
        AbstractC1440l4.t(U1.class, u12);
    }

    private U1() {
    }

    public static T1 B() {
        return (T1) zza.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void F(U1 u12, int i4) {
        u12.zze |= 1;
        u12.zzf = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void G(U1 u12, C1462o2 c1462o2) {
        c1462o2.getClass();
        u12.zzg = c1462o2;
        u12.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void H(U1 u12, C1462o2 c1462o2) {
        u12.zzh = c1462o2;
        u12.zze |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void I(U1 u12, boolean z3) {
        u12.zze |= 8;
        u12.zzi = z3;
    }

    public final int A() {
        return this.zzf;
    }

    public final C1462o2 D() {
        C1462o2 c1462o2 = this.zzg;
        if (c1462o2 == null) {
            return C1462o2.H();
        }
        return c1462o2;
    }

    public final C1462o2 E() {
        C1462o2 c1462o2 = this.zzh;
        if (c1462o2 == null) {
            return C1462o2.H();
        }
        return c1462o2;
    }

    public final boolean J() {
        return this.zzi;
    }

    public final boolean K() {
        return (this.zze & 1) != 0;
    }

    public final boolean L() {
        return (this.zze & 8) != 0;
    }

    public final boolean M() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1440l4
    public final Object y(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    P1 p12 = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new T1(p12);
                }
                return new U1();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
