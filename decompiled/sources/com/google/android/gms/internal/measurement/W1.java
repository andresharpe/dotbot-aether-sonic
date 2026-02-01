package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class W1 extends AbstractC1440l4 implements Q4 {
    private static final W1 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        W1 w12 = new W1();
        zza = w12;
        AbstractC1440l4.t(W1.class, w12);
    }

    private W1() {
    }

    public static V1 C() {
        return (V1) zza.u();
    }

    public static /* synthetic */ void E(W1 w12, int i4) {
        w12.zze |= 1;
        w12.zzf = i4;
    }

    public static /* synthetic */ void F(W1 w12, long j4) {
        w12.zze |= 2;
        w12.zzg = j4;
    }

    public final int A() {
        return this.zzf;
    }

    public final long B() {
        return this.zzg;
    }

    public final boolean G() {
        return (this.zze & 2) != 0;
    }

    public final boolean H() {
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
                    return new V1(null);
                }
                return new W1();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
