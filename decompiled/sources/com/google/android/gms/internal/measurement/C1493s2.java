package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s2 */
/* loaded from: classes2.dex */
public final class C1493s2 extends AbstractC1440l4 implements Q4 {
    private static final C1493s2 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        C1493s2 c1493s2 = new C1493s2();
        zza = c1493s2;
        AbstractC1440l4.t(C1493s2.class, c1493s2);
    }

    private C1493s2() {
    }

    public static C1485r2 D() {
        return (C1485r2) zza.u();
    }

    public static /* synthetic */ void H(C1493s2 c1493s2, long j4) {
        c1493s2.zze |= 1;
        c1493s2.zzf = j4;
    }

    public static /* synthetic */ void I(C1493s2 c1493s2, String str) {
        str.getClass();
        c1493s2.zze |= 2;
        c1493s2.zzg = str;
    }

    public static /* synthetic */ void J(C1493s2 c1493s2, String str) {
        str.getClass();
        c1493s2.zze |= 4;
        c1493s2.zzh = str;
    }

    public static /* synthetic */ void K(C1493s2 c1493s2) {
        c1493s2.zze &= -5;
        c1493s2.zzh = zza.zzh;
    }

    public static /* synthetic */ void L(C1493s2 c1493s2, long j4) {
        c1493s2.zze |= 8;
        c1493s2.zzi = j4;
    }

    public static /* synthetic */ void M(C1493s2 c1493s2) {
        c1493s2.zze &= -9;
        c1493s2.zzi = 0L;
    }

    public static /* synthetic */ void N(C1493s2 c1493s2, double d4) {
        c1493s2.zze |= 32;
        c1493s2.zzk = d4;
    }

    public static /* synthetic */ void O(C1493s2 c1493s2) {
        c1493s2.zze &= -33;
        c1493s2.zzk = com.google.firebase.remoteconfig.l.f37524n;
    }

    public final double A() {
        return this.zzk;
    }

    public final long B() {
        return this.zzi;
    }

    public final long C() {
        return this.zzf;
    }

    public final String F() {
        return this.zzg;
    }

    public final String G() {
        return this.zzh;
    }

    public final boolean P() {
        return (this.zze & 32) != 0;
    }

    public final boolean Q() {
        return (this.zze & 8) != 0;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final boolean S() {
        return (this.zze & 4) != 0;
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
                    return new C1485r2(null);
                }
                return new C1493s2();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
