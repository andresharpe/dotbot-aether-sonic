package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z2 */
/* loaded from: classes2.dex */
public final class C1549z2 extends AbstractC1440l4 implements Q4 {
    private static final C1549z2 zza;
    private int zze;
    private InterfaceC1495s4 zzf = AbstractC1440l4.p();
    private C1517v2 zzg;

    static {
        C1549z2 c1549z2 = new C1549z2();
        zza = c1549z2;
        AbstractC1440l4.t(C1549z2.class, c1549z2);
    }

    private C1549z2() {
    }

    public final C1517v2 A() {
        C1517v2 c1517v2 = this.zzg;
        if (c1517v2 == null) {
            return C1517v2.C();
        }
        return c1517v2;
    }

    public final List C() {
        return this.zzf;
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
                    return new C1541y2(null);
                }
                return new C1549z2();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", E2.class, "zzg"});
        }
        return (byte) 1;
    }
}
