package androidx.navigation;

/* loaded from: classes.dex */
public final class e0 {
    @l3.d
    public static final <T extends c0<? extends F>> T a(@l3.d d0 d0Var, @l3.d String name) {
        kotlin.jvm.internal.F.p(d0Var, "<this>");
        kotlin.jvm.internal.F.p(name, "name");
        return (T) d0Var.f(name);
    }

    @l3.d
    public static final <T extends c0<? extends F>> T b(@l3.d d0 d0Var, @l3.d kotlin.reflect.d<T> clazz) {
        kotlin.jvm.internal.F.p(d0Var, "<this>");
        kotlin.jvm.internal.F.p(clazz, "clazz");
        return (T) d0Var.e(W2.b.e(clazz));
    }

    public static final void c(@l3.d d0 d0Var, @l3.d c0<? extends F> navigator) {
        kotlin.jvm.internal.F.p(d0Var, "<this>");
        kotlin.jvm.internal.F.p(navigator, "navigator");
        d0Var.b(navigator);
    }

    @l3.e
    public static final c0<? extends F> d(@l3.d d0 d0Var, @l3.d String name, @l3.d c0<? extends F> navigator) {
        kotlin.jvm.internal.F.p(d0Var, "<this>");
        kotlin.jvm.internal.F.p(name, "name");
        kotlin.jvm.internal.F.p(navigator, "navigator");
        return d0Var.c(name, navigator);
    }
}
