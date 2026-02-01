package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v2 */
/* loaded from: classes2.dex */
public final class C1517v2 extends AbstractC1440l4 implements Q4 {
    private static final C1517v2 zza;
    private InterfaceC1495s4 zze = AbstractC1440l4.p();

    static {
        C1517v2 c1517v2 = new C1517v2();
        zza = c1517v2;
        AbstractC1440l4.t(C1517v2.class, c1517v2);
    }

    private C1517v2() {
    }

    public static C1517v2 C() {
        return zza;
    }

    public final int A() {
        return this.zze.size();
    }

    public final List D() {
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
                    return new C1509u2(null);
                }
                return new C1517v2();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C1533x2.class});
        }
        return (byte) 1;
    }
}
