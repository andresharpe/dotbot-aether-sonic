package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x2 */
/* loaded from: classes2.dex */
public final class C1533x2 extends AbstractC1440l4 implements Q4 {
    private static final C1533x2 zza;
    private int zze;
    private String zzf = "";
    private InterfaceC1495s4 zzg = AbstractC1440l4.p();

    static {
        C1533x2 c1533x2 = new C1533x2();
        zza = c1533x2;
        AbstractC1440l4.t(C1533x2.class, c1533x2);
    }

    private C1533x2() {
    }

    public final String B() {
        return this.zzf;
    }

    public final List C() {
        return this.zzg;
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
                    return new C1525w2(null);
                }
                return new C1533x2();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", E2.class});
        }
        return (byte) 1;
    }
}
