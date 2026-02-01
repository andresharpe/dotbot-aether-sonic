package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class C1 extends AbstractC1440l4 implements Q4 {
    private static final C1 zza;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private InterfaceC1495s4 zzi = AbstractC1440l4.p();

    static {
        C1 c12 = new C1();
        zza = c12;
        AbstractC1440l4.t(C1.class, c12);
    }

    private C1() {
    }

    public static C1 C() {
        return zza;
    }

    public final int A() {
        return this.zzi.size();
    }

    public final String D() {
        return this.zzg;
    }

    public final List E() {
        return this.zzi;
    }

    public final boolean F() {
        return this.zzh;
    }

    public final boolean G() {
        return (this.zze & 4) != 0;
    }

    public final boolean H() {
        return (this.zze & 2) != 0;
    }

    public final boolean I() {
        return (this.zze & 1) != 0;
    }

    public final int J() {
        int a4 = B1.a(this.zzf);
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
                    return new C1540y1(null);
                }
                return new C1();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", A1.f29259a, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
