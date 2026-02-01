package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final G f15613a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final Handler f15614b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private a f15615c;

    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final G f15616E;

        /* renamed from: F, reason: collision with root package name */
        @l3.d
        private final Lifecycle.Event f15617F;

        /* renamed from: G, reason: collision with root package name */
        private boolean f15618G;

        public a(@l3.d G registry, @l3.d Lifecycle.Event event) {
            kotlin.jvm.internal.F.p(registry, "registry");
            kotlin.jvm.internal.F.p(event, "event");
            this.f15616E = registry;
            this.f15617F = event;
        }

        @l3.d
        public final Lifecycle.Event a() {
            return this.f15617F;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f15618G) {
                this.f15616E.l(this.f15617F);
                this.f15618G = true;
            }
        }
    }

    public g0(@l3.d E provider) {
        kotlin.jvm.internal.F.p(provider, "provider");
        this.f15613a = new G(provider);
        this.f15614b = new Handler();
    }

    private final void f(Lifecycle.Event event) {
        a aVar = this.f15615c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f15613a, event);
        this.f15615c = aVar2;
        Handler handler = this.f15614b;
        kotlin.jvm.internal.F.m(aVar2);
        handler.postAtFrontOfQueue(aVar2);
    }

    @l3.d
    public Lifecycle a() {
        return this.f15613a;
    }

    public void b() {
        f(Lifecycle.Event.ON_START);
    }

    public void c() {
        f(Lifecycle.Event.ON_CREATE);
    }

    public void d() {
        f(Lifecycle.Event.ON_STOP);
        f(Lifecycle.Event.ON_DESTROY);
    }

    public void e() {
        f(Lifecycle.Event.ON_START);
    }
}
