package androidx.navigation;

import kotlin.H0;
import kotlin.InterfaceC2205l;

/* renamed from: androidx.navigation.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0928e {
    @InterfaceC2205l(message = "Use routes to build your ActivityDestination instead", replaceWith = @kotlin.V(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void a(@l3.d K k4, @androidx.annotation.D int i4, @l3.d X2.l<? super C0927d, H0> builder) {
        kotlin.jvm.internal.F.p(k4, "<this>");
        kotlin.jvm.internal.F.p(builder, "builder");
        C0927d c0927d = new C0927d((C0926c) k4.n().e(C0926c.class), i4);
        builder.C(c0927d);
        k4.m(c0927d);
    }

    public static final void b(@l3.d K k4, @l3.d String route, @l3.d X2.l<? super C0927d, H0> builder) {
        kotlin.jvm.internal.F.p(k4, "<this>");
        kotlin.jvm.internal.F.p(route, "route");
        kotlin.jvm.internal.F.p(builder, "builder");
        C0927d c0927d = new C0927d((C0926c) k4.n().e(C0926c.class), route);
        builder.C(c0927d);
        k4.m(c0927d);
    }
}
