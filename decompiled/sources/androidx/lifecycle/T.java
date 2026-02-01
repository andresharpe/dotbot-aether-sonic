package androidx.lifecycle;

import kotlinx.coroutines.C2322k0;

/* loaded from: classes.dex */
public final class T extends kotlinx.coroutines.N {

    /* renamed from: G, reason: collision with root package name */
    @W2.f
    @l3.d
    public final C0912n f15516G = new C0912n();

    @Override // kotlinx.coroutines.N
    public void h1(@l3.d kotlin.coroutines.f context, @l3.d Runnable block) {
        kotlin.jvm.internal.F.p(context, "context");
        kotlin.jvm.internal.F.p(block, "block");
        this.f15516G.c(context, block);
    }

    @Override // kotlinx.coroutines.N
    public boolean j1(@l3.d kotlin.coroutines.f context) {
        kotlin.jvm.internal.F.p(context, "context");
        if (C2322k0.e().m1().j1(context)) {
            return true;
        }
        return !this.f15516G.b();
    }
}
