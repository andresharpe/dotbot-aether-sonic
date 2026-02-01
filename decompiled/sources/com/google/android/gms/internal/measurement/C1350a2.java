package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a2 */
/* loaded from: classes2.dex */
public final class C1350a2 extends AbstractC1440l4 implements Q4 {
    private static final C1350a2 zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        C1350a2 c1350a2 = new C1350a2();
        zza = c1350a2;
        AbstractC1440l4.t(C1350a2.class, c1350a2);
    }

    private C1350a2() {
    }

    public static Z1 A() {
        return (Z1) zza.u();
    }

    public static /* synthetic */ void C(C1350a2 c1350a2, String str) {
        str.getClass();
        c1350a2.zze |= 1;
        c1350a2.zzf = str;
    }

    public static /* synthetic */ void D(C1350a2 c1350a2, long j4) {
        c1350a2.zze |= 2;
        c1350a2.zzg = j4;
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
                    return new Z1(null);
                }
                return new C1350a2();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
