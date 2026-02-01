package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.layout.q;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    public static final a f20872d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final androidx.window.core.b f20873a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final b f20874b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final q.c f20875c;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public final void a(@l3.d androidx.window.core.b bounds) {
            kotlin.jvm.internal.F.p(bounds, "bounds");
            if (bounds.f() == 0 && bounds.b() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (bounds.c() != 0 && bounds.e() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        public static final a f20876b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        @l3.d
        private static final b f20877c = new b("FOLD");

        /* renamed from: d, reason: collision with root package name */
        @l3.d
        private static final b f20878d = new b("HINGE");

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final String f20879a;

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            @l3.d
            public final b a() {
                return b.f20877c;
            }

            @l3.d
            public final b b() {
                return b.f20878d;
            }

            private a() {
            }
        }

        private b(String str) {
            this.f20879a = str;
        }

        @l3.d
        public String toString() {
            return this.f20879a;
        }
    }

    public r(@l3.d androidx.window.core.b featureBounds, @l3.d b type, @l3.d q.c state) {
        kotlin.jvm.internal.F.p(featureBounds, "featureBounds");
        kotlin.jvm.internal.F.p(type, "type");
        kotlin.jvm.internal.F.p(state, "state");
        this.f20873a = featureBounds;
        this.f20874b = type;
        this.f20875c = state;
        f20872d.a(featureBounds);
    }

    @Override // androidx.window.layout.q
    public boolean a() {
        b bVar = this.f20874b;
        b.a aVar = b.f20876b;
        if (kotlin.jvm.internal.F.g(bVar, aVar.b())) {
            return true;
        }
        if (kotlin.jvm.internal.F.g(this.f20874b, aVar.a()) && kotlin.jvm.internal.F.g(getState(), q.c.f20870d)) {
            return true;
        }
        return false;
    }

    @Override // androidx.window.layout.q
    @l3.d
    public q.a b() {
        if (this.f20873a.f() != 0 && this.f20873a.b() != 0) {
            return q.a.f20862d;
        }
        return q.a.f20861c;
    }

    @Override // androidx.window.layout.q
    @l3.d
    public q.b c() {
        if (this.f20873a.f() > this.f20873a.b()) {
            return q.b.f20866d;
        }
        return q.b.f20865c;
    }

    @l3.d
    public final b d() {
        return this.f20874b;
    }

    public boolean equals(@l3.e Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!kotlin.jvm.internal.F.g(r.class, cls)) {
            return false;
        }
        if (obj != null) {
            r rVar = (r) obj;
            if (kotlin.jvm.internal.F.g(this.f20873a, rVar.f20873a) && kotlin.jvm.internal.F.g(this.f20874b, rVar.f20874b) && kotlin.jvm.internal.F.g(getState(), rVar.getState())) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
    }

    @Override // androidx.window.layout.l
    @l3.d
    public Rect getBounds() {
        return this.f20873a.i();
    }

    @Override // androidx.window.layout.q
    @l3.d
    public q.c getState() {
        return this.f20875c;
    }

    public int hashCode() {
        return (((this.f20873a.hashCode() * 31) + this.f20874b.hashCode()) * 31) + getState().hashCode();
    }

    @l3.d
    public String toString() {
        return ((Object) r.class.getSimpleName()) + " { " + this.f20873a + ", type=" + this.f20874b + ", state=" + getState() + " }";
    }
}
