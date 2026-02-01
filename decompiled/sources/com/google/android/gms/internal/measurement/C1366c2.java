package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.c2 */
/* loaded from: classes2.dex */
public final class C1366c2 extends AbstractC1440l4 implements Q4 {
    private static final C1366c2 zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private InterfaceC1495s4 zzk = AbstractC1440l4.p();

    static {
        C1366c2 c1366c2 = new C1366c2();
        zza = c1366c2;
        AbstractC1440l4.t(C1366c2.class, c1366c2);
    }

    private C1366c2() {
    }

    public static C1358b2 E() {
        return (C1358b2) zza.u();
    }

    public static /* synthetic */ void J(C1366c2 c1366c2, String str) {
        str.getClass();
        c1366c2.zze |= 1;
        c1366c2.zzf = str;
    }

    public static /* synthetic */ void K(C1366c2 c1366c2, String str) {
        str.getClass();
        c1366c2.zze |= 2;
        c1366c2.zzg = str;
    }

    public static /* synthetic */ void L(C1366c2 c1366c2) {
        c1366c2.zze &= -3;
        c1366c2.zzg = zza.zzg;
    }

    public static /* synthetic */ void M(C1366c2 c1366c2, long j4) {
        c1366c2.zze |= 4;
        c1366c2.zzh = j4;
    }

    public static /* synthetic */ void N(C1366c2 c1366c2) {
        c1366c2.zze &= -5;
        c1366c2.zzh = 0L;
    }

    public static /* synthetic */ void O(C1366c2 c1366c2, double d4) {
        c1366c2.zze |= 16;
        c1366c2.zzj = d4;
    }

    public static /* synthetic */ void P(C1366c2 c1366c2) {
        c1366c2.zze &= -17;
        c1366c2.zzj = com.google.firebase.remoteconfig.l.f37524n;
    }

    public static /* synthetic */ void Q(C1366c2 c1366c2, C1366c2 c1366c22) {
        c1366c22.getClass();
        c1366c2.Y();
        c1366c2.zzk.add(c1366c22);
    }

    public static /* synthetic */ void R(C1366c2 c1366c2, Iterable iterable) {
        c1366c2.Y();
        AbstractC1518v3.i(iterable, c1366c2.zzk);
    }

    private final void Y() {
        InterfaceC1495s4 interfaceC1495s4 = this.zzk;
        if (!interfaceC1495s4.zzc()) {
            this.zzk = AbstractC1440l4.q(interfaceC1495s4);
        }
    }

    public final double A() {
        return this.zzj;
    }

    public final float B() {
        return this.zzi;
    }

    public final int C() {
        return this.zzk.size();
    }

    public final long D() {
        return this.zzh;
    }

    public final String G() {
        return this.zzf;
    }

    public final String H() {
        return this.zzg;
    }

    public final List I() {
        return this.zzk;
    }

    public final boolean T() {
        return (this.zze & 16) != 0;
    }

    public final boolean U() {
        return (this.zze & 8) != 0;
    }

    public final boolean V() {
        return (this.zze & 4) != 0;
    }

    public final boolean W() {
        return (this.zze & 1) != 0;
    }

    public final boolean X() {
        return (this.zze & 2) != 0;
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
                    return new C1358b2(null);
                }
                return new C1366c2();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C1366c2.class});
        }
        return (byte) 1;
    }
}
