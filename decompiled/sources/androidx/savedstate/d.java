package androidx.savedstate;

import W2.n;
import android.os.Bundle;
import androidx.annotation.K;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    public static final a f18382d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final e f18383a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final c f18384b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18385c;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @n
        @l3.d
        public final d a(@l3.d e owner) {
            F.p(owner, "owner");
            return new d(owner, null);
        }

        private a() {
        }
    }

    public /* synthetic */ d(e eVar, C2197u c2197u) {
        this(eVar);
    }

    @n
    @l3.d
    public static final d a(@l3.d e eVar) {
        return f18382d.a(eVar);
    }

    @l3.d
    public final c b() {
        return this.f18384b;
    }

    @K
    public final void c() {
        Lifecycle lifecycle = this.f18383a.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.INITIALIZED) {
            lifecycle.a(new Recreator(this.f18383a));
            this.f18384b.g(lifecycle);
            this.f18385c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    @K
    public final void d(@l3.e Bundle bundle) {
        if (!this.f18385c) {
            c();
        }
        Lifecycle lifecycle = this.f18383a.getLifecycle();
        if (!lifecycle.b().e(Lifecycle.State.STARTED)) {
            this.f18384b.h(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    @K
    public final void e(@l3.d Bundle outBundle) {
        F.p(outBundle, "outBundle");
        this.f18384b.i(outBundle);
    }

    private d(e eVar) {
        this.f18383a = eVar;
        this.f18384b = new c();
    }
}
