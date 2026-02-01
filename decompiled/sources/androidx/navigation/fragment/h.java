package androidx.navigation.fragment;

import androidx.annotation.D;
import androidx.fragment.app.Fragment;
import androidx.navigation.G;
import androidx.navigation.H;
import androidx.navigation.fragment.g;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlin.jvm.internal.F;

@H
/* loaded from: classes.dex */
public final class h extends G<g.b> {

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private kotlin.reflect.d<? extends Fragment> f16464h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC2205l(message = "Use routes to build your FragmentNavigatorDestination instead", replaceWith = @V(expression = "FragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public h(@l3.d g navigator, @D int i4, @l3.d kotlin.reflect.d<? extends Fragment> fragmentClass) {
        super(navigator, i4);
        F.p(navigator, "navigator");
        F.p(fragmentClass, "fragmentClass");
        this.f16464h = fragmentClass;
    }

    @Override // androidx.navigation.G
    @l3.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public g.b c() {
        g.b bVar = (g.b) super.c();
        String name = W2.b.e(this.f16464h).getName();
        F.o(name, "fragmentClass.java.name");
        bVar.Q(name);
        return bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@l3.d g navigator, @l3.d String route, @l3.d kotlin.reflect.d<? extends Fragment> fragmentClass) {
        super(navigator, route);
        F.p(navigator, "navigator");
        F.p(route, "route");
        F.p(fragmentClass, "fragmentClass");
        this.f16464h = fragmentClass;
    }
}
