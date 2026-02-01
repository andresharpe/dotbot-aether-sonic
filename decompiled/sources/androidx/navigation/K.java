package androidx.navigation;

import java.util.ArrayList;
import java.util.List;
import kotlin.InterfaceC2205l;

@H
/* loaded from: classes.dex */
public class K extends G<J> {

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private final d0 f16310h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.D
    private int f16311i;

    /* renamed from: j, reason: collision with root package name */
    @l3.e
    private String f16312j;

    /* renamed from: k, reason: collision with root package name */
    @l3.d
    private final List<F> f16313k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC2205l(message = "Use routes to build your NavGraph instead", replaceWith = @kotlin.V(expression = "NavGraphBuilder(provider, startDestination = startDestination.toString(), route = id.toString())", imports = {}))
    public K(@l3.d d0 provider, @androidx.annotation.D int i4, @androidx.annotation.D int i5) {
        super(provider.e(N.class), i4);
        kotlin.jvm.internal.F.p(provider, "provider");
        this.f16313k = new ArrayList();
        this.f16310h = provider;
        this.f16311i = i5;
    }

    public final void k(@l3.d F destination) {
        kotlin.jvm.internal.F.p(destination, "destination");
        this.f16313k.add(destination);
    }

    @Override // androidx.navigation.G
    @l3.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public J c() {
        J j4 = (J) super.c();
        j4.S(this.f16313k);
        int i4 = this.f16311i;
        if (i4 == 0 && this.f16312j == null) {
            if (i() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.f16312j;
        if (str != null) {
            kotlin.jvm.internal.F.m(str);
            j4.g0(str);
        } else {
            j4.f0(i4);
        }
        return j4;
    }

    public final <D extends F> void m(@l3.d G<? extends D> navDestination) {
        kotlin.jvm.internal.F.p(navDestination, "navDestination");
        this.f16313k.add(navDestination.c());
    }

    @l3.d
    public final d0 n() {
        return this.f16310h;
    }

    public final void o(@l3.d F f4) {
        kotlin.jvm.internal.F.p(f4, "<this>");
        k(f4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(@l3.d d0 provider, @l3.d String startDestination, @l3.e String str) {
        super(provider.e(N.class), str);
        kotlin.jvm.internal.F.p(provider, "provider");
        kotlin.jvm.internal.F.p(startDestination, "startDestination");
        this.f16313k = new ArrayList();
        this.f16310h = provider;
        this.f16312j = startDestination;
    }
}
