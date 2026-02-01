package androidx.concurrent.futures;

import androidx.annotation.N;
import androidx.annotation.P;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k1.InterfaceFutureC2077a;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        Object f6566a;

        /* renamed from: b, reason: collision with root package name */
        d<T> f6567b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.d<Void> f6568c = androidx.concurrent.futures.d.v();

        /* renamed from: d, reason: collision with root package name */
        private boolean f6569d;

        a() {
        }

        private void e() {
            this.f6566a = null;
            this.f6567b = null;
            this.f6568c = null;
        }

        public void a(@N Runnable runnable, @N Executor executor) {
            androidx.concurrent.futures.d<Void> dVar = this.f6568c;
            if (dVar != null) {
                dVar.f(runnable, executor);
            }
        }

        void b() {
            this.f6566a = null;
            this.f6567b = null;
            this.f6568c.q(null);
        }

        public boolean c(T t3) {
            boolean z3 = true;
            this.f6569d = true;
            d<T> dVar = this.f6567b;
            if (dVar == null || !dVar.b(t3)) {
                z3 = false;
            }
            if (z3) {
                e();
            }
            return z3;
        }

        public boolean d() {
            boolean z3 = true;
            this.f6569d = true;
            d<T> dVar = this.f6567b;
            if (dVar == null || !dVar.a(true)) {
                z3 = false;
            }
            if (z3) {
                e();
            }
            return z3;
        }

        public boolean f(@N Throwable th) {
            boolean z3 = true;
            this.f6569d = true;
            d<T> dVar = this.f6567b;
            if (dVar == null || !dVar.c(th)) {
                z3 = false;
            }
            if (z3) {
                e();
            }
            return z3;
        }

        protected void finalize() {
            androidx.concurrent.futures.d<Void> dVar;
            d<T> dVar2 = this.f6567b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f6566a));
            }
            if (!this.f6569d && (dVar = this.f6568c) != null) {
                dVar.q(null);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0057c<T> {
        @P
        Object a(@N a<T> aVar) throws Exception;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d<T> implements InterfaceFutureC2077a<T> {

        /* renamed from: E, reason: collision with root package name */
        final WeakReference<a<T>> f6570E;

        /* renamed from: F, reason: collision with root package name */
        private final androidx.concurrent.futures.a<T> f6571F = new a();

        /* loaded from: classes.dex */
        class a extends androidx.concurrent.futures.a<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String n() {
                a<T> aVar = d.this.f6570E.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f6566a + "]";
            }
        }

        d(a<T> aVar) {
            this.f6570E = new WeakReference<>(aVar);
        }

        boolean a(boolean z3) {
            return this.f6571F.cancel(z3);
        }

        boolean b(T t3) {
            return this.f6571F.q(t3);
        }

        boolean c(Throwable th) {
            return this.f6571F.r(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z3) {
            a<T> aVar = this.f6570E.get();
            boolean cancel = this.f6571F.cancel(z3);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        @Override // k1.InterfaceFutureC2077a
        public void f(@N Runnable runnable, @N Executor executor) {
            this.f6571F.f(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            return this.f6571F.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f6571F.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f6571F.isDone();
        }

        public String toString() {
            return this.f6571F.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j4, @N TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f6571F.get(j4, timeUnit);
        }
    }

    private c() {
    }

    @N
    public static <T> InterfaceFutureC2077a<T> a(@N InterfaceC0057c<T> interfaceC0057c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f6567b = dVar;
        aVar.f6566a = interfaceC0057c.getClass();
        try {
            Object a4 = interfaceC0057c.a(aVar);
            if (a4 != null) {
                aVar.f6566a = a4;
            }
        } catch (Exception e4) {
            dVar.c(e4);
        }
        return dVar;
    }
}
