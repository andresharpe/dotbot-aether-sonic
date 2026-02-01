package androidx.navigation;

import kotlin.H0;
import kotlin.InterfaceC2205l;

/* loaded from: classes.dex */
public final class Q {
    @l3.d
    @InterfaceC2205l(message = "Use routes to create your NavGraph instead", replaceWith = @kotlin.V(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final J a(@l3.d O o4, @androidx.annotation.D int i4, @androidx.annotation.D int i5, @l3.d X2.l<? super K, H0> builder) {
        kotlin.jvm.internal.F.p(o4, "<this>");
        kotlin.jvm.internal.F.p(builder, "builder");
        K k4 = new K(o4.getNavController().N(), i4, i5);
        builder.C(k4);
        return k4.c();
    }

    @l3.d
    public static final J b(@l3.d O o4, @l3.d String startDestination, @l3.e String str, @l3.d X2.l<? super K, H0> builder) {
        kotlin.jvm.internal.F.p(o4, "<this>");
        kotlin.jvm.internal.F.p(startDestination, "startDestination");
        kotlin.jvm.internal.F.p(builder, "builder");
        K k4 = new K(o4.getNavController().N(), startDestination, str);
        builder.C(k4);
        return k4.c();
    }

    public static /* synthetic */ J c(O o4, int i4, int i5, X2.l builder, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        kotlin.jvm.internal.F.p(o4, "<this>");
        kotlin.jvm.internal.F.p(builder, "builder");
        K k4 = new K(o4.getNavController().N(), i4, i5);
        builder.C(k4);
        return k4.c();
    }

    public static /* synthetic */ J d(O o4, String startDestination, String str, X2.l builder, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str = null;
        }
        kotlin.jvm.internal.F.p(o4, "<this>");
        kotlin.jvm.internal.F.p(startDestination, "startDestination");
        kotlin.jvm.internal.F.p(builder, "builder");
        K k4 = new K(o4.getNavController().N(), startDestination, str);
        builder.C(k4);
        return k4.c();
    }
}
