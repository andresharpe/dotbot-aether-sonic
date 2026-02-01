package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1453n1 extends C1408h4 implements Q4 {
    private C1453n1() {
        super(C1461o1.D());
    }

    public final int t() {
        return ((C1461o1) this.f29664F).A();
    }

    public final C1453n1 u(String str) {
        if (this.f29665G) {
            s();
            this.f29665G = false;
        }
        C1461o1.I((C1461o1) this.f29664F, str);
        return this;
    }

    public final C1453n1 w(int i4, C1477q1 c1477q1) {
        if (this.f29665G) {
            s();
            this.f29665G = false;
        }
        C1461o1.J((C1461o1) this.f29664F, i4, c1477q1);
        return this;
    }

    public final C1477q1 x(int i4) {
        return ((C1461o1) this.f29664F).E(i4);
    }

    public final String y() {
        return ((C1461o1) this.f29664F).G();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1453n1(C1429k1 c1429k1) {
        super(C1461o1.D());
    }
}
