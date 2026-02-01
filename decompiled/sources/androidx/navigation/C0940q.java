package androidx.navigation;

import androidx.navigation.C0939p;

@H
/* renamed from: androidx.navigation.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0940q {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final C0939p.a f16520a = new C0939p.a();

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private X<?> f16521b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16522c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private Object f16523d;

    @l3.d
    public final C0939p a() {
        return this.f16520a.a();
    }

    @l3.e
    public final Object b() {
        return this.f16523d;
    }

    public final boolean c() {
        return this.f16522c;
    }

    @l3.d
    public final X<?> d() {
        X<?> x3 = this.f16521b;
        if (x3 != null) {
            return x3;
        }
        throw new IllegalStateException("NavType has not been set on this builder.");
    }

    public final void e(@l3.e Object obj) {
        this.f16523d = obj;
        this.f16520a.b(obj);
    }

    public final void f(boolean z3) {
        this.f16522c = z3;
        this.f16520a.c(z3);
    }

    public final void g(@l3.d X<?> value) {
        kotlin.jvm.internal.F.p(value, "value");
        this.f16521b = value;
        this.f16520a.d(value);
    }
}
