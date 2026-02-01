package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC2282i;

/* loaded from: classes.dex */
public interface x {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f20908a = a.f20909a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private static final boolean f20910b = false;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f20909a = new a();

        /* renamed from: c, reason: collision with root package name */
        @l3.e
        private static final String f20911c = N.d(x.class).J();

        /* renamed from: d, reason: collision with root package name */
        @l3.d
        private static y f20912d = m.f20850a;

        private a() {
        }

        @W2.n
        @l3.d
        @W2.i(name = "getOrCreate")
        public final x a(@l3.d Context context) {
            kotlin.jvm.internal.F.p(context, "context");
            return f20912d.a(new z(G.f20824b, d(context)));
        }

        @W2.n
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void b(@l3.d y overridingDecorator) {
            kotlin.jvm.internal.F.p(overridingDecorator, "overridingDecorator");
            f20912d = overridingDecorator;
        }

        @W2.n
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void c() {
            f20912d = m.f20850a;
        }

        @l3.d
        public final w d(@l3.d Context context) {
            kotlin.jvm.internal.F.p(context, "context");
            o oVar = null;
            try {
                WindowLayoutComponent m4 = s.f20880a.m();
                if (m4 != null) {
                    oVar = new o(m4);
                }
            } catch (Throwable unused) {
                if (f20910b) {
                    Log.d(f20911c, "Failed to load WindowExtensions");
                }
            }
            if (oVar == null) {
                return u.f20894c.a(context);
            }
            return oVar;
        }
    }

    @W2.n
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    static void a() {
        f20908a.c();
    }

    @W2.n
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    static void b(@l3.d y yVar) {
        f20908a.b(yVar);
    }

    @W2.n
    @l3.d
    @W2.i(name = "getOrCreate")
    static x c(@l3.d Context context) {
        return f20908a.a(context);
    }

    @l3.d
    InterfaceC2282i<B> d(@l3.d Activity activity);
}
