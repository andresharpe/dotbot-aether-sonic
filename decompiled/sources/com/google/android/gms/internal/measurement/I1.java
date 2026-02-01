package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class I1 extends AbstractC1440l4 implements Q4 {
    private static final I1 zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        I1 i12 = new I1();
        zza = i12;
        AbstractC1440l4.t(I1.class, i12);
    }

    private I1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void D(I1 i12, String str) {
        str.getClass();
        i12.zze |= 1;
        i12.zzf = str;
    }

    public final int A() {
        return this.zzi;
    }

    public final String C() {
        return this.zzf;
    }

    public final boolean E() {
        return this.zzg;
    }

    public final boolean F() {
        return this.zzh;
    }

    public final boolean G() {
        return (this.zze & 2) != 0;
    }

    public final boolean H() {
        return (this.zze & 4) != 0;
    }

    public final boolean I() {
        return (this.zze & 8) != 0;
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
                    return new H1(d12);
                }
                return new I1();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
