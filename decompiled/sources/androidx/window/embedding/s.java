package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.InterfaceC0764e;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.H0;
import kotlin.collections.D;
import kotlin.collections.j0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@androidx.window.core.d
/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private static volatile s f20794d = null;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f20796f = false;

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final j f20797a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private Set<? extends m> f20798b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final a f20793c = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static final ReentrantLock f20795e = new ReentrantLock();

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final s a() {
            if (s.f20794d == null) {
                ReentrantLock reentrantLock = s.f20795e;
                reentrantLock.lock();
                try {
                    if (s.f20794d == null) {
                        a aVar = s.f20793c;
                        s.f20794d = new s(null);
                    }
                    H0 h02 = H0.f51801a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            s sVar = s.f20794d;
            F.m(sVar);
            return sVar;
        }

        @W2.n
        public final void b(@l3.d Context context, int i4) {
            F.p(context, "context");
            Set<m> g4 = new y().g(context, i4);
            s a4 = a();
            if (g4 == null) {
                g4 = j0.k();
            }
            a4.m(g4);
        }

        private a() {
        }
    }

    public /* synthetic */ s(C2197u c2197u) {
        this();
    }

    @W2.n
    @l3.d
    public static final s g() {
        return f20793c.a();
    }

    @W2.n
    public static final void i(@l3.d Context context, int i4) {
        f20793c.b(context, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Set<? extends m> set) {
        this.f20798b = set;
        this.f20797a.a(set);
    }

    public final void e(@l3.d Activity activity, @l3.d Executor executor, @l3.d InterfaceC0764e<List<t>> consumer) {
        F.p(activity, "activity");
        F.p(executor, "executor");
        F.p(consumer, "consumer");
        this.f20797a.g(activity, executor, consumer);
    }

    public final void f() {
        this.f20797a.a(this.f20798b);
    }

    @l3.d
    public final Set<m> h() {
        Set<m> a6;
        a6 = D.a6(this.f20797a.b());
        return a6;
    }

    public final boolean j() {
        return this.f20797a.e();
    }

    public final void k(@l3.d m rule) {
        F.p(rule, "rule");
        this.f20797a.c(rule);
    }

    public final void l(@l3.d InterfaceC0764e<List<t>> consumer) {
        F.p(consumer, "consumer");
        this.f20797a.d(consumer);
    }

    public final void n(@l3.d m rule) {
        F.p(rule, "rule");
        this.f20797a.f(rule);
    }

    private s() {
        Set<? extends m> k4;
        this.f20797a = p.f20774e.a();
        k4 = j0.k();
        this.f20798b = k4;
    }
}
