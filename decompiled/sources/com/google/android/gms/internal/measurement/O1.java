package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class O1 extends AbstractC1440l4 implements Q4 {
    private static final O1 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        O1 o12 = new O1();
        zza = o12;
        AbstractC1440l4.t(O1.class, o12);
    }

    private O1() {
    }

    public final String B() {
        return this.zzf;
    }

    public final String C() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1440l4
    public final Object y(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    D1 d12 = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new N1(d12);
                }
                return new O1();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
