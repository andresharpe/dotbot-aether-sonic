package kotlinx.coroutines;

import kotlinx.coroutines.internal.C2312t;

/* loaded from: classes2.dex */
public abstract class W0 extends N {
    @Override // kotlinx.coroutines.N
    @l3.d
    public N k1(int i4) {
        C2312t.a(i4);
        return this;
    }

    @l3.d
    public abstract W0 m1();

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.e
    @G0
    public final String n1() {
        W0 w02;
        W0 e4 = C2322k0.e();
        if (this == e4) {
            return "Dispatchers.Main";
        }
        try {
            w02 = e4.m1();
        } catch (UnsupportedOperationException unused) {
            w02 = null;
        }
        if (this != w02) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    @Override // kotlinx.coroutines.N
    @l3.d
    public String toString() {
        String n12 = n1();
        if (n12 == null) {
            return X.a(this) + '@' + X.b(this);
        }
        return n12;
    }
}
