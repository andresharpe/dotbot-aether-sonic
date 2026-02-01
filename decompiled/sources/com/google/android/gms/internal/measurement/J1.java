package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class J1 extends C1408h4 implements Q4 {
    private J1() {
        super(K1.F());
    }

    public final List A() {
        return Collections.unmodifiableList(((K1) this.f29664F).J());
    }

    public final List B() {
        return Collections.unmodifiableList(((K1) this.f29664F).K());
    }

    public final int t() {
        return ((K1) this.f29664F).B();
    }

    public final I1 u(int i4) {
        return ((K1) this.f29664F).D(i4);
    }

    public final J1 w() {
        if (this.f29665G) {
            s();
            this.f29665G = false;
        }
        K1.O((K1) this.f29664F);
        return this;
    }

    public final J1 x(int i4, H1 h12) {
        if (this.f29665G) {
            s();
            this.f29665G = false;
        }
        K1.N((K1) this.f29664F, i4, (I1) h12.q());
        return this;
    }

    public final String y() {
        return ((K1) this.f29664F).I();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ J1(D1 d12) {
        super(K1.F());
    }
}
