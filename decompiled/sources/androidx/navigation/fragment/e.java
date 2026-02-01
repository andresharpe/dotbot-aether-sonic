package androidx.navigation.fragment;

import X2.l;
import androidx.annotation.D;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.K;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;

/* loaded from: classes.dex */
public final class e {
    @InterfaceC2205l(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @V(expression = "dialog<F>(route = id.toString())", imports = {}))
    public static final /* synthetic */ <F extends DialogFragment> void a(K k4, @D int i4) {
        F.p(k4, "<this>");
        c cVar = (c) k4.n().e(c.class);
        F.y(4, "F");
        k4.m(new d(cVar, i4, (kotlin.reflect.d<? extends DialogFragment>) N.d(DialogFragment.class)));
    }

    @InterfaceC2205l(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @V(expression = "dialog<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final /* synthetic */ <F extends DialogFragment> void b(K k4, @D int i4, l<? super d, H0> builder) {
        F.p(k4, "<this>");
        F.p(builder, "builder");
        c cVar = (c) k4.n().e(c.class);
        F.y(4, "F");
        d dVar = new d(cVar, i4, (kotlin.reflect.d<? extends DialogFragment>) N.d(DialogFragment.class));
        builder.C(dVar);
        k4.m(dVar);
    }

    public static final /* synthetic */ <F extends DialogFragment> void c(K k4, String route) {
        F.p(k4, "<this>");
        F.p(route, "route");
        c cVar = (c) k4.n().e(c.class);
        F.y(4, "F");
        k4.m(new d(cVar, route, (kotlin.reflect.d<? extends DialogFragment>) N.d(DialogFragment.class)));
    }

    public static final /* synthetic */ <F extends DialogFragment> void d(K k4, String route, l<? super d, H0> builder) {
        F.p(k4, "<this>");
        F.p(route, "route");
        F.p(builder, "builder");
        c cVar = (c) k4.n().e(c.class);
        F.y(4, "F");
        d dVar = new d(cVar, route, (kotlin.reflect.d<? extends DialogFragment>) N.d(DialogFragment.class));
        builder.C(dVar);
        k4.m(dVar);
    }
}
