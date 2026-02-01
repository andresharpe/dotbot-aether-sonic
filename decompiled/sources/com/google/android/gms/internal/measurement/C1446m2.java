package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m2 */
/* loaded from: classes2.dex */
public final class C1446m2 extends AbstractC1440l4 implements Q4 {
    private static final C1446m2 zza;
    private int zze;
    private int zzf = 1;
    private InterfaceC1495s4 zzg = AbstractC1440l4.p();

    static {
        C1446m2 c1446m2 = new C1446m2();
        zza = c1446m2;
        AbstractC1440l4.t(C1446m2.class, c1446m2);
    }

    private C1446m2() {
    }

    public static C1430k2 A() {
        return (C1430k2) zza.u();
    }

    public static /* synthetic */ void C(C1446m2 c1446m2, C1350a2 c1350a2) {
        c1350a2.getClass();
        InterfaceC1495s4 interfaceC1495s4 = c1446m2.zzg;
        if (!interfaceC1495s4.zzc()) {
            c1446m2.zzg = AbstractC1440l4.q(interfaceC1495s4);
        }
        c1446m2.zzg.add(c1350a2);
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
                    return new C1430k2(null);
                }
                return new C1446m2();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", C1438l2.f29712a, "zzg", C1350a2.class});
        }
        return (byte) 1;
    }
}
