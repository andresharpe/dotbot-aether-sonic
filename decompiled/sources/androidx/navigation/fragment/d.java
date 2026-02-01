package androidx.navigation.fragment;

import androidx.annotation.D;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.G;
import androidx.navigation.H;
import androidx.navigation.fragment.c;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlin.jvm.internal.F;

@H
/* loaded from: classes.dex */
public final class d extends G<c.b> {

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private kotlin.reflect.d<? extends DialogFragment> f16453h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC2205l(message = "Use routes to build your DialogFragmentNavigatorDestination instead", replaceWith = @V(expression = "DialogFragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public d(@l3.d c navigator, @D int i4, @l3.d kotlin.reflect.d<? extends DialogFragment> fragmentClass) {
        super(navigator, i4);
        F.p(navigator, "navigator");
        F.p(fragmentClass, "fragmentClass");
        this.f16453h = fragmentClass;
    }

    @Override // androidx.navigation.G
    @l3.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c.b c() {
        c.b bVar = (c.b) super.c();
        String name = W2.b.e(this.f16453h).getName();
        F.o(name, "fragmentClass.java.name");
        bVar.Q(name);
        return bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@l3.d c navigator, @l3.d String route, @l3.d kotlin.reflect.d<? extends DialogFragment> fragmentClass) {
        super(navigator, route);
        F.p(navigator, "navigator");
        F.p(route, "route");
        F.p(fragmentClass, "fragmentClass");
        this.f16453h = fragmentClass;
    }
}
