package androidx.navigation;

import kotlin.H0;
import kotlin.InterfaceC2205l;

/* loaded from: classes.dex */
public final class L {
    @l3.d
    @InterfaceC2205l(message = "Use routes to build your NavGraph instead", replaceWith = @kotlin.V(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final J a(@l3.d d0 d0Var, @androidx.annotation.D int i4, @androidx.annotation.D int i5, @l3.d X2.l<? super K, H0> builder) {
        kotlin.jvm.internal.F.p(d0Var, "<this>");
        kotlin.jvm.internal.F.p(builder, "builder");
        K k4 = new K(d0Var, i4, i5);
        builder.C(k4);
        return k4.c();
    }

    @l3.d
    public static final J b(@l3.d d0 d0Var, @l3.d String startDestination, @l3.e String str, @l3.d X2.l<? super K, H0> builder) {
        kotlin.jvm.internal.F.p(d0Var, "<this>");
        kotlin.jvm.internal.F.p(startDestination, "startDestination");
        kotlin.jvm.internal.F.p(builder, "builder");
        K k4 = new K(d0Var, startDestination, str);
        builder.C(k4);
        return k4.c();
    }

    @InterfaceC2205l(message = "Use routes to build your nested NavGraph instead", replaceWith = @kotlin.V(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void c(@l3.d K k4, @androidx.annotation.D int i4, @androidx.annotation.D int i5, @l3.d X2.l<? super K, H0> builder) {
        kotlin.jvm.internal.F.p(k4, "<this>");
        kotlin.jvm.internal.F.p(builder, "builder");
        K k5 = new K(k4.n(), i4, i5);
        builder.C(k5);
        k4.m(k5);
    }

    public static final void d(@l3.d K k4, @l3.d String startDestination, @l3.d String route, @l3.d X2.l<? super K, H0> builder) {
        kotlin.jvm.internal.F.p(k4, "<this>");
        kotlin.jvm.internal.F.p(startDestination, "startDestination");
        kotlin.jvm.internal.F.p(route, "route");
        kotlin.jvm.internal.F.p(builder, "builder");
        K k5 = new K(k4.n(), startDestination, route);
        builder.C(k5);
        k4.m(k5);
    }

    public static /* synthetic */ J e(d0 d0Var, int i4, int i5, X2.l builder, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        kotlin.jvm.internal.F.p(d0Var, "<this>");
        kotlin.jvm.internal.F.p(builder, "builder");
        K k4 = new K(d0Var, i4, i5);
        builder.C(k4);
        return k4.c();
    }

    public static /* synthetic */ J f(d0 d0Var, String startDestination, String str, X2.l builder, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str = null;
        }
        kotlin.jvm.internal.F.p(d0Var, "<this>");
        kotlin.jvm.internal.F.p(startDestination, "startDestination");
        kotlin.jvm.internal.F.p(builder, "builder");
        K k4 = new K(d0Var, startDestination, str);
        builder.C(k4);
        return k4.c();
    }
}
