package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.q2 */
/* loaded from: classes2.dex */
public final class C1478q2 extends AbstractC1440l4 implements Q4 {
    private static final C1478q2 zza;
    private int zze;
    private int zzf;
    private InterfaceC1487r4 zzg = AbstractC1440l4.n();

    static {
        C1478q2 c1478q2 = new C1478q2();
        zza = c1478q2;
        AbstractC1440l4.t(C1478q2.class, c1478q2);
    }

    private C1478q2() {
    }

    public static C1470p2 D() {
        return (C1470p2) zza.u();
    }

    public static /* synthetic */ void G(C1478q2 c1478q2, int i4) {
        c1478q2.zze |= 1;
        c1478q2.zzf = i4;
    }

    public static /* synthetic */ void H(C1478q2 c1478q2, Iterable iterable) {
        InterfaceC1487r4 interfaceC1487r4 = c1478q2.zzg;
        if (!interfaceC1487r4.zzc()) {
            c1478q2.zzg = AbstractC1440l4.o(interfaceC1487r4);
        }
        AbstractC1518v3.i(iterable, c1478q2.zzg);
    }

    public final int A() {
        return this.zzg.size();
    }

    public final int B() {
        return this.zzf;
    }

    public final long C(int i4) {
        return this.zzg.zza(i4);
    }

    public final List F() {
        return this.zzg;
    }

    public final boolean I() {
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
                    return new C1470p2(null);
                }
                return new C1478q2();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
