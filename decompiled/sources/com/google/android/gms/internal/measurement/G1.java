package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class G1 extends AbstractC1440l4 implements Q4 {
    private static final G1 zza;
    private int zze;
    private String zzf = "";
    private InterfaceC1495s4 zzg = AbstractC1440l4.p();
    private boolean zzh;

    static {
        G1 g12 = new G1();
        zza = g12;
        AbstractC1440l4.t(G1.class, g12);
    }

    private G1() {
    }

    public final String B() {
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
                    return new E1(null);
                }
                return new G1();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", M1.class, "zzh"});
        }
        return (byte) 1;
    }
}
