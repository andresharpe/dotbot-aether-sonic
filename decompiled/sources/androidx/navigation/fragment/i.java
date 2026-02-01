package androidx.navigation.fragment;

import X2.l;
import androidx.annotation.D;
import androidx.fragment.app.Fragment;
import androidx.navigation.K;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;

/* loaded from: classes.dex */
public final class i {
    @InterfaceC2205l(message = "Use routes to create your FragmentDestination instead", replaceWith = @V(expression = "fragment<F>(route = id.toString())", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void a(K k4, @D int i4) {
        F.p(k4, "<this>");
        g gVar = (g) k4.n().e(g.class);
        F.y(4, "F");
        k4.m(new h(gVar, i4, (kotlin.reflect.d<? extends Fragment>) N.d(Fragment.class)));
    }

    @InterfaceC2205l(message = "Use routes to create your FragmentDestination instead", replaceWith = @V(expression = "fragment<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void b(K k4, @D int i4, l<? super h, H0> builder) {
        F.p(k4, "<this>");
        F.p(builder, "builder");
        g gVar = (g) k4.n().e(g.class);
        F.y(4, "F");
        h hVar = new h(gVar, i4, (kotlin.reflect.d<? extends Fragment>) N.d(Fragment.class));
        builder.C(hVar);
        k4.m(hVar);
    }

    public static final /* synthetic */ <F extends Fragment> void c(K k4, String route) {
        F.p(k4, "<this>");
        F.p(route, "route");
        g gVar = (g) k4.n().e(g.class);
        F.y(4, "F");
        k4.m(new h(gVar, route, (kotlin.reflect.d<? extends Fragment>) N.d(Fragment.class)));
    }

    public static final /* synthetic */ <F extends Fragment> void d(K k4, String route, l<? super h, H0> builder) {
        F.p(k4, "<this>");
        F.p(route, "route");
        F.p(builder, "builder");
        g gVar = (g) k4.n().e(g.class);
        F.y(4, "F");
        h hVar = new h(gVar, route, (kotlin.reflect.d<? extends Fragment>) N.d(Fragment.class));
        builder.C(hVar);
        k4.m(hVar);
    }
}
