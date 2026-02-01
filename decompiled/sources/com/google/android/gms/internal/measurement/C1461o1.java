package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.o1 */
/* loaded from: classes2.dex */
public final class C1461o1 extends AbstractC1440l4 implements Q4 {
    private static final C1461o1 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private InterfaceC1495s4 zzh = AbstractC1440l4.p();
    private boolean zzi;
    private C1516v1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C1461o1 c1461o1 = new C1461o1();
        zza = c1461o1;
        AbstractC1440l4.t(C1461o1.class, c1461o1);
    }

    private C1461o1() {
    }

    public static C1453n1 C() {
        return (C1453n1) zza.u();
    }

    public static /* synthetic */ void I(C1461o1 c1461o1, String str) {
        c1461o1.zze |= 2;
        c1461o1.zzg = str;
    }

    public static /* synthetic */ void J(C1461o1 c1461o1, int i4, C1477q1 c1477q1) {
        c1477q1.getClass();
        InterfaceC1495s4 interfaceC1495s4 = c1461o1.zzh;
        if (!interfaceC1495s4.zzc()) {
            c1461o1.zzh = AbstractC1440l4.q(interfaceC1495s4);
        }
        c1461o1.zzh.set(i4, c1477q1);
    }

    public final int A() {
        return this.zzh.size();
    }

    public final int B() {
        return this.zzf;
    }

    public final C1477q1 E(int i4) {
        return (C1477q1) this.zzh.get(i4);
    }

    public final C1516v1 F() {
        C1516v1 c1516v1 = this.zzj;
        if (c1516v1 == null) {
            return C1516v1.B();
        }
        return c1516v1;
    }

    public final String G() {
        return this.zzg;
    }

    public final List H() {
        return this.zzh;
    }

    public final boolean K() {
        return this.zzk;
    }

    public final boolean L() {
        return this.zzl;
    }

    public final boolean M() {
        return this.zzm;
    }

    public final boolean N() {
        return (this.zze & 8) != 0;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final boolean P() {
        return (this.zze & 64) != 0;
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
                    return new C1453n1(null);
                }
                return new C1461o1();
            }
            return AbstractC1440l4.s(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C1477q1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
