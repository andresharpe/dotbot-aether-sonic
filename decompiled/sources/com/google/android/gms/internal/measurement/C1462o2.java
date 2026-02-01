package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.o2 */
/* loaded from: classes2.dex */
public final class C1462o2 extends AbstractC1440l4 implements Q4 {
    private static final C1462o2 zza;
    private InterfaceC1487r4 zze = AbstractC1440l4.n();
    private InterfaceC1487r4 zzf = AbstractC1440l4.n();
    private InterfaceC1495s4 zzg = AbstractC1440l4.p();
    private InterfaceC1495s4 zzh = AbstractC1440l4.p();

    static {
        C1462o2 c1462o2 = new C1462o2();
        zza = c1462o2;
        AbstractC1440l4.t(C1462o2.class, c1462o2);
    }

    private C1462o2() {
    }

    public static C1454n2 F() {
        return (C1454n2) zza.u();
    }

    public static C1462o2 H() {
        return zza;
    }

    public static /* synthetic */ void N(C1462o2 c1462o2, Iterable iterable) {
        InterfaceC1487r4 interfaceC1487r4 = c1462o2.zze;
        if (!interfaceC1487r4.zzc()) {
            c1462o2.zze = AbstractC1440l4.o(interfaceC1487r4);
        }
        AbstractC1518v3.i(iterable, c1462o2.zze);
    }

    public static /* synthetic */ void P(C1462o2 c1462o2, Iterable iterable) {
        InterfaceC1487r4 interfaceC1487r4 = c1462o2.zzf;
        if (!interfaceC1487r4.zzc()) {
            c1462o2.zzf = AbstractC1440l4.o(interfaceC1487r4);
        }
        AbstractC1518v3.i(iterable, c1462o2.zzf);
    }

    public static /* synthetic */ void R(C1462o2 c1462o2, Iterable iterable) {
        c1462o2.X();
        AbstractC1518v3.i(iterable, c1462o2.zzg);
    }

    public static /* synthetic */ void T(C1462o2 c1462o2, int i4) {
        c1462o2.X();
        c1462o2.zzg.remove(i4);
    }

    public static /* synthetic */ void U(C1462o2 c1462o2, Iterable iterable) {
        c1462o2.Y();
        AbstractC1518v3.i(iterable, c1462o2.zzh);
    }

    public static /* synthetic */ void W(C1462o2 c1462o2, int i4) {
        c1462o2.Y();
        c1462o2.zzh.remove(i4);
    }

    private final void X() {
        InterfaceC1495s4 interfaceC1495s4 = this.zzg;
        if (!interfaceC1495s4.zzc()) {
            this.zzg = AbstractC1440l4.q(interfaceC1495s4);
        }
    }

    private final void Y() {
        InterfaceC1495s4 interfaceC1495s4 = this.zzh;
        if (!interfaceC1495s4.zzc()) {
            this.zzh = AbstractC1440l4.q(interfaceC1495s4);
        }
    }

    public final int A() {
        return this.zzg.size();
    }

    public final int B() {
        return this.zzf.size();
    }

    public final int C() {
        return this.zzh.size();
    }

    public final int D() {
        return this.zze.size();
    }

    public final W1 E(int i4) {
        return (W1) this.zzg.get(i4);
    }

    public final C1478q2 I(int i4) {
        return (C1478q2) this.zzh.get(i4);
    }

    public final List J() {
        return this.zzg;
    }

    public final List K() {
        return this.zzf;
    }

    public final List L() {
        return this.zzh;
    }

    public final List M() {
        return this.zze;
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
                    return new C1454n2(null);
                }
                return new C1462o2();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", W1.class, "zzh", C1478q2.class});
        }
        return (byte) 1;
    }
}
