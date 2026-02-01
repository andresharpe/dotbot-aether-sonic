package androidx.lifecycle;

import R.a;

@W2.i(name = "ViewModelProviderGetKt")
/* loaded from: classes.dex */
public final class n0 {
    @l3.d
    public static final R.a a(@l3.d q0 owner) {
        kotlin.jvm.internal.F.p(owner, "owner");
        if (owner instanceof InterfaceC0919v) {
            return ((InterfaceC0919v) owner).l();
        }
        return a.C0017a.f1726b;
    }

    @androidx.annotation.K
    public static final /* synthetic */ <VM extends j0> VM b(m0 m0Var) {
        kotlin.jvm.internal.F.p(m0Var, "<this>");
        kotlin.jvm.internal.F.y(4, "VM");
        return (VM) m0Var.a(j0.class);
    }
}
