package androidx.navigation;

import androidx.navigation.F;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.H0;
import kotlin.InterfaceC2205l;

@H
/* loaded from: classes.dex */
public class G<D extends F> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final c0<? extends D> f16294a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16295b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private final String f16296c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private CharSequence f16297d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private Map<String, C0939p> f16298e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private List<C0947y> f16299f;

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private Map<Integer, C0934k> f16300g;

    public G(@l3.d c0<? extends D> navigator, @androidx.annotation.D int i4, @l3.e String str) {
        kotlin.jvm.internal.F.p(navigator, "navigator");
        this.f16294a = navigator;
        this.f16295b = i4;
        this.f16296c = str;
        this.f16298e = new LinkedHashMap();
        this.f16299f = new ArrayList();
        this.f16300g = new LinkedHashMap();
    }

    @InterfaceC2205l(message = "Building NavDestinations using IDs with the Kotlin DSL has been deprecated in favor of using routes. When using routes there is no need for actions.")
    public final void a(int i4, @l3.d X2.l<? super C0935l, H0> actionBuilder) {
        kotlin.jvm.internal.F.p(actionBuilder, "actionBuilder");
        Map<Integer, C0934k> map = this.f16300g;
        Integer valueOf = Integer.valueOf(i4);
        C0935l c0935l = new C0935l();
        actionBuilder.C(c0935l);
        map.put(valueOf, c0935l.a());
    }

    public final void b(@l3.d String name, @l3.d X2.l<? super C0940q, H0> argumentBuilder) {
        kotlin.jvm.internal.F.p(name, "name");
        kotlin.jvm.internal.F.p(argumentBuilder, "argumentBuilder");
        Map<String, C0939p> map = this.f16298e;
        C0940q c0940q = new C0940q();
        argumentBuilder.C(c0940q);
        map.put(name, c0940q.a());
    }

    @l3.d
    public D c() {
        D a4 = this.f16294a.a();
        if (i() != null) {
            a4.M(i());
        }
        if (f() != -1) {
            a4.J(f());
        }
        a4.K(g());
        for (Map.Entry<String, C0939p> entry : this.f16298e.entrySet()) {
            a4.c(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.f16299f.iterator();
        while (it.hasNext()) {
            a4.d((C0947y) it.next());
        }
        for (Map.Entry<Integer, C0934k> entry2 : this.f16300g.entrySet()) {
            a4.F(entry2.getKey().intValue(), entry2.getValue());
        }
        return a4;
    }

    public final void d(@l3.d X2.l<? super B, H0> navDeepLink) {
        kotlin.jvm.internal.F.p(navDeepLink, "navDeepLink");
        List<C0947y> list = this.f16299f;
        B b4 = new B();
        navDeepLink.C(b4);
        list.add(b4.a());
    }

    public final void e(@l3.d String uriPattern) {
        kotlin.jvm.internal.F.p(uriPattern, "uriPattern");
        this.f16299f.add(new C0947y(uriPattern));
    }

    public final int f() {
        return this.f16295b;
    }

    @l3.e
    public final CharSequence g() {
        return this.f16297d;
    }

    @l3.d
    protected final c0<? extends D> h() {
        return this.f16294a;
    }

    @l3.e
    public final String i() {
        return this.f16296c;
    }

    public final void j(@l3.e CharSequence charSequence) {
        this.f16297d = charSequence;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC2205l(message = "Use routes to build your NavDestination instead", replaceWith = @kotlin.V(expression = "NavDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public G(@l3.d c0<? extends D> navigator, @androidx.annotation.D int i4) {
        this(navigator, i4, null);
        kotlin.jvm.internal.F.p(navigator, "navigator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public G(@l3.d c0<? extends D> navigator, @l3.e String str) {
        this(navigator, -1, str);
        kotlin.jvm.internal.F.p(navigator, "navigator");
    }
}
