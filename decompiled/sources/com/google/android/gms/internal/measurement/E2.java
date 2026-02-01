package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class E2 extends AbstractC1440l4 implements Q4 {
    private static final E2 zza;
    private int zze;
    private int zzf;
    private InterfaceC1495s4 zzg = AbstractC1440l4.p();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        E2 e22 = new E2();
        zza = e22;
        AbstractC1440l4.t(E2.class, e22);
    }

    private E2() {
    }

    public final double A() {
        return this.zzk;
    }

    public final String C() {
        return this.zzh;
    }

    public final String D() {
        return this.zzi;
    }

    public final List E() {
        return this.zzg;
    }

    public final boolean F() {
        return this.zzj;
    }

    public final boolean G() {
        return (this.zze & 8) != 0;
    }

    public final boolean H() {
        return (this.zze & 16) != 0;
    }

    public final boolean I() {
        return (this.zze & 4) != 0;
    }

    public final int J() {
        int a4 = D2.a(this.zzf);
        if (a4 == 0) {
            return 1;
        }
        return a4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1440l4
    public final Object y(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    C1501t2 c1501t2 = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new A2(c1501t2);
                }
                return new E2();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", C2.f29283a, "zzg", E2.class, "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
