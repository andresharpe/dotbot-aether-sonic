package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1406h2 extends AbstractC1440l4 implements Q4 {
    private static final C1406h2 zza;
    private InterfaceC1495s4 zze = AbstractC1440l4.p();

    static {
        C1406h2 c1406h2 = new C1406h2();
        zza = c1406h2;
        AbstractC1440l4.t(C1406h2.class, c1406h2);
    }

    private C1406h2() {
    }

    public static C1390f2 A() {
        return (C1390f2) zza.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void E(C1406h2 c1406h2, C1422j2 c1422j2) {
        c1422j2.getClass();
        InterfaceC1495s4 interfaceC1495s4 = c1406h2.zze;
        if (!interfaceC1495s4.zzc()) {
            c1406h2.zze = AbstractC1440l4.q(interfaceC1495s4);
        }
        c1406h2.zze.add(c1422j2);
    }

    public final C1422j2 C(int i4) {
        return (C1422j2) this.zze.get(0);
    }

    public final List D() {
        return this.zze;
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
                    return new C1390f2(p12);
                }
                return new C1406h2();
            }
            return AbstractC1440l4.s(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C1422j2.class});
        }
        return (byte) 1;
    }
}
