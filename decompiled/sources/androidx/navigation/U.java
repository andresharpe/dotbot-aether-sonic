package androidx.navigation;

import androidx.navigation.T;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.jvm.internal.Lambda;

@W
/* loaded from: classes.dex */
public final class U {

    /* renamed from: b, reason: collision with root package name */
    private boolean f16355b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16356c;

    /* renamed from: e, reason: collision with root package name */
    @l3.e
    private String f16358e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16359f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16360g;

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final T.a f16354a = new T.a();

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.D
    private int f16357d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends Lambda implements X2.l<h0, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f16361F = new a();

        a() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(h0 h0Var) {
            c(h0Var);
            return H0.f51801a;
        }

        public final void c(@l3.d h0 h0Var) {
            kotlin.jvm.internal.F.p(h0Var, "$this$null");
        }
    }

    /* loaded from: classes.dex */
    static final class b extends Lambda implements X2.l<h0, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f16362F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(h0 h0Var) {
            c(h0Var);
            return H0.f51801a;
        }

        public final void c(@l3.d h0 h0Var) {
            kotlin.jvm.internal.F.p(h0Var, "$this$null");
        }
    }

    @InterfaceC2205l(message = "Use the popUpToId property.")
    public static /* synthetic */ void e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(U u3, int i4, X2.l lVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lVar = a.f16361F;
        }
        u3.i(i4, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(U u3, String str, X2.l lVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = b.f16362F;
        }
        u3.j(str, lVar);
    }

    private final void p(String str) {
        boolean S12;
        if (str != null) {
            S12 = kotlin.text.z.S1(str);
            if (!S12) {
                this.f16358e = str;
                this.f16359f = false;
                return;
            }
            throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
        }
    }

    public final void a(@l3.d X2.l<? super C0930g, H0> animBuilder) {
        kotlin.jvm.internal.F.p(animBuilder, "animBuilder");
        C0930g c0930g = new C0930g();
        animBuilder.C(c0930g);
        this.f16354a.b(c0930g.a()).c(c0930g.b()).e(c0930g.c()).f(c0930g.d());
    }

    @l3.d
    public final T b() {
        T.a aVar = this.f16354a;
        aVar.d(c());
        aVar.m(h());
        if (g() != null) {
            aVar.j(g(), this.f16359f, this.f16360g);
        } else {
            aVar.h(f(), this.f16359f, this.f16360g);
        }
        return aVar.a();
    }

    public final boolean c() {
        return this.f16355b;
    }

    public final int d() {
        return this.f16357d;
    }

    public final int f() {
        return this.f16357d;
    }

    @l3.e
    public final String g() {
        return this.f16358e;
    }

    public final boolean h() {
        return this.f16356c;
    }

    public final void i(@androidx.annotation.D int i4, @l3.d X2.l<? super h0, H0> popUpToBuilder) {
        kotlin.jvm.internal.F.p(popUpToBuilder, "popUpToBuilder");
        o(i4);
        p(null);
        h0 h0Var = new h0();
        popUpToBuilder.C(h0Var);
        this.f16359f = h0Var.a();
        this.f16360g = h0Var.b();
    }

    public final void j(@l3.d String route, @l3.d X2.l<? super h0, H0> popUpToBuilder) {
        kotlin.jvm.internal.F.p(route, "route");
        kotlin.jvm.internal.F.p(popUpToBuilder, "popUpToBuilder");
        p(route);
        o(-1);
        h0 h0Var = new h0();
        popUpToBuilder.C(h0Var);
        this.f16359f = h0Var.a();
        this.f16360g = h0Var.b();
    }

    public final void m(boolean z3) {
        this.f16355b = z3;
    }

    @InterfaceC2205l(message = "Use the popUpTo function and passing in the id.")
    public final void n(int i4) {
        k(this, i4, null, 2, null);
    }

    public final void o(int i4) {
        this.f16357d = i4;
        this.f16359f = false;
    }

    public final void q(boolean z3) {
        this.f16356c = z3;
    }
}
