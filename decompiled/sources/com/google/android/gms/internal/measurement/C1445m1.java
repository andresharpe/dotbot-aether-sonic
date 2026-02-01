package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1445m1 extends AbstractC1440l4 implements Q4 {
    private static final C1445m1 zza;
    private int zze;
    private int zzf;
    private InterfaceC1495s4 zzg = AbstractC1440l4.p();
    private InterfaceC1495s4 zzh = AbstractC1440l4.p();
    private boolean zzi;
    private boolean zzj;

    static {
        C1445m1 c1445m1 = new C1445m1();
        zza = c1445m1;
        AbstractC1440l4.t(C1445m1.class, c1445m1);
    }

    private C1445m1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void I(C1445m1 c1445m1, int i4, C1532x1 c1532x1) {
        c1532x1.getClass();
        InterfaceC1495s4 interfaceC1495s4 = c1445m1.zzg;
        if (!interfaceC1495s4.zzc()) {
            c1445m1.zzg = AbstractC1440l4.q(interfaceC1495s4);
        }
        c1445m1.zzg.set(i4, c1532x1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void J(C1445m1 c1445m1, int i4, C1461o1 c1461o1) {
        c1461o1.getClass();
        InterfaceC1495s4 interfaceC1495s4 = c1445m1.zzh;
        if (!interfaceC1495s4.zzc()) {
            c1445m1.zzh = AbstractC1440l4.q(interfaceC1495s4);
        }
        c1445m1.zzh.set(i4, c1461o1);
    }

    public final int A() {
        return this.zzf;
    }

    public final int B() {
        return this.zzh.size();
    }

    public final int C() {
        return this.zzg.size();
    }

    public final C1461o1 E(int i4) {
        return (C1461o1) this.zzh.get(i4);
    }

    public final C1532x1 F(int i4) {
        return (C1532x1) this.zzg.get(i4);
    }

    public final List G() {
        return this.zzh;
    }

    public final List H() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1440l4
    public final Object y(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    C1429k1 c1429k1 = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C1437l1(c1429k1);
                }
                return new C1445m1();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C1532x1.class, "zzh", C1461o1.class, "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
