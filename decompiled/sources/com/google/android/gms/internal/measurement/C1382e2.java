package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e2 */
/* loaded from: classes2.dex */
public final class C1382e2 extends AbstractC1440l4 implements Q4 {
    private static final C1382e2 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private S1 zzh;

    static {
        C1382e2 c1382e2 = new C1382e2();
        zza = c1382e2;
        AbstractC1440l4.t(C1382e2.class, c1382e2);
    }

    private C1382e2() {
    }

    public static /* synthetic */ C1382e2 A() {
        return zza;
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
                    return new C1374d2(null);
                }
                return new C1382e2();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
