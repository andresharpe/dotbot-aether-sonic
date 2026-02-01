package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class Y1 extends AbstractC1440l4 implements Q4 {
    private static final Y1 zza;
    private int zze;
    private InterfaceC1495s4 zzf = AbstractC1440l4.p();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        Y1 y12 = new Y1();
        zza = y12;
        AbstractC1440l4.t(Y1.class, y12);
    }

    private Y1() {
    }

    public static X1 E() {
        return (X1) zza.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void J(Y1 y12, int i4, C1366c2 c1366c2) {
        c1366c2.getClass();
        y12.U();
        y12.zzf.set(i4, c1366c2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void K(Y1 y12, C1366c2 c1366c2) {
        c1366c2.getClass();
        y12.U();
        y12.zzf.add(c1366c2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void L(Y1 y12, Iterable iterable) {
        y12.U();
        AbstractC1518v3.i(iterable, y12.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void N(Y1 y12, int i4) {
        y12.U();
        y12.zzf.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void O(Y1 y12, String str) {
        str.getClass();
        y12.zze |= 1;
        y12.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void P(Y1 y12, long j4) {
        y12.zze |= 2;
        y12.zzh = j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Q(Y1 y12, long j4) {
        y12.zze |= 4;
        y12.zzi = j4;
    }

    private final void U() {
        InterfaceC1495s4 interfaceC1495s4 = this.zzf;
        if (!interfaceC1495s4.zzc()) {
            this.zzf = AbstractC1440l4.q(interfaceC1495s4);
        }
    }

    public final int A() {
        return this.zzj;
    }

    public final int B() {
        return this.zzf.size();
    }

    public final long C() {
        return this.zzi;
    }

    public final long D() {
        return this.zzh;
    }

    public final C1366c2 G(int i4) {
        return (C1366c2) this.zzf.get(i4);
    }

    public final String H() {
        return this.zzg;
    }

    public final List I() {
        return this.zzf;
    }

    public final boolean R() {
        return (this.zze & 8) != 0;
    }

    public final boolean S() {
        return (this.zze & 4) != 0;
    }

    public final boolean T() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1440l4
    public final Object y(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    P1 p12 = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new X1(p12);
                }
                return new Y1();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C1366c2.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
