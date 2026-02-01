package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public interface D {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f20819a = a.f20820a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f20820a = new a();

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        private static X2.l<? super D, ? extends D> f20821b = C0188a.f20822F;

        /* renamed from: androidx.window.layout.D$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0188a extends Lambda implements X2.l<D, D> {

            /* renamed from: F, reason: collision with root package name */
            public static final C0188a f20822F = new C0188a();

            C0188a() {
                super(1);
            }

            @Override // X2.l
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final D C(@l3.d D it) {
                kotlin.jvm.internal.F.p(it, "it");
                return it;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<D, D> {
            b(Object obj) {
                super(1, obj, H.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
            }

            @Override // X2.l
            @l3.d
            /* renamed from: C0, reason: merged with bridge method [inline-methods] */
            public final D C(@l3.d D p02) {
                kotlin.jvm.internal.F.p(p02, "p0");
                return ((H) this.f52262F).a(p02);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class c extends Lambda implements X2.l<D, D> {

            /* renamed from: F, reason: collision with root package name */
            public static final c f20823F = new c();

            c() {
                super(1);
            }

            @Override // X2.l
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final D C(@l3.d D it) {
                kotlin.jvm.internal.F.p(it, "it");
                return it;
            }
        }

        private a() {
        }

        @W2.n
        @l3.d
        public final D a() {
            return f20821b.C(G.f20824b);
        }

        @W2.n
        @androidx.window.core.d
        @RestrictTo({RestrictTo.Scope.TESTS})
        public final void b(@l3.d H overridingDecorator) {
            kotlin.jvm.internal.F.p(overridingDecorator, "overridingDecorator");
            f20821b = new b(overridingDecorator);
        }

        @W2.n
        @androidx.window.core.d
        @RestrictTo({RestrictTo.Scope.TESTS})
        public final void c() {
            f20821b = c.f20823F;
        }
    }

    @W2.n
    @androidx.window.core.d
    @RestrictTo({RestrictTo.Scope.TESTS})
    static void a() {
        f20819a.c();
    }

    @W2.n
    @androidx.window.core.d
    @RestrictTo({RestrictTo.Scope.TESTS})
    static void b(@l3.d H h4) {
        f20819a.b(h4);
    }

    @W2.n
    @l3.d
    static D d() {
        return f20819a.a();
    }

    @l3.d
    C c(@l3.d Activity activity);

    @l3.d
    C e(@l3.d Activity activity);
}
