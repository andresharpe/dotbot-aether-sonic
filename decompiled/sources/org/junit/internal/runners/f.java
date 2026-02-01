package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runners.model.TestTimedOutException;

@Deprecated
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f55613a;

    /* renamed from: b, reason: collision with root package name */
    private final org.junit.runner.notification.b f55614b;

    /* renamed from: c, reason: collision with root package name */
    private final Description f55615c;

    /* renamed from: d, reason: collision with root package name */
    private j f55616d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f55617E;

        /* renamed from: org.junit.internal.runners.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class CallableC0527a implements Callable<Object> {
            CallableC0527a() {
            }

            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                f.this.g();
                return null;
            }
        }

        a(long j4) {
            this.f55617E = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Future submit = newSingleThreadExecutor.submit(new CallableC0527a());
            newSingleThreadExecutor.shutdown();
            try {
                long j4 = this.f55617E;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!newSingleThreadExecutor.awaitTermination(j4, timeUnit)) {
                    newSingleThreadExecutor.shutdownNow();
                }
                submit.get(0L, timeUnit);
            } catch (TimeoutException unused) {
                f.this.a(new TestTimedOutException(this.f55617E, TimeUnit.MILLISECONDS));
            } catch (Exception e4) {
                f.this.a(e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.g();
        }
    }

    public f(Object obj, j jVar, org.junit.runner.notification.b bVar, Description description) {
        this.f55613a = obj;
        this.f55614b = bVar;
        this.f55615c = description;
        this.f55616d = jVar;
    }

    private void c() {
        Iterator<Method> it = this.f55616d.b().iterator();
        while (it.hasNext()) {
            try {
                it.next().invoke(this.f55613a, new Object[0]);
            } catch (InvocationTargetException e4) {
                a(e4.getTargetException());
            } catch (Throwable th) {
                a(th);
            }
        }
    }

    private void d() throws c {
        try {
            try {
                Iterator<Method> it = this.f55616d.c().iterator();
                while (it.hasNext()) {
                    it.next().invoke(this.f55613a, new Object[0]);
                }
            } catch (InvocationTargetException e4) {
                throw e4.getTargetException();
            }
        } catch (AssumptionViolatedException unused) {
            throw new c();
        } catch (Throwable th) {
            a(th);
            throw new c();
        }
    }

    private void h(long j4) {
        e(new a(j4));
    }

    protected void a(Throwable th) {
        this.f55614b.f(new Failure(this.f55615c, th));
    }

    public void b() {
        if (this.f55616d.g()) {
            this.f55614b.i(this.f55615c);
            return;
        }
        this.f55614b.l(this.f55615c);
        try {
            long e4 = this.f55616d.e();
            if (e4 > 0) {
                h(e4);
            } else {
                f();
            }
            this.f55614b.h(this.f55615c);
        } catch (Throwable th) {
            this.f55614b.h(this.f55615c);
            throw th;
        }
    }

    public void e(Runnable runnable) {
        try {
            try {
                d();
                runnable.run();
            } catch (c unused) {
            } catch (Exception unused2) {
                throw new RuntimeException("test should never throw an exception to this level");
            }
        } finally {
            c();
        }
    }

    public void f() {
        e(new b());
    }

    protected void g() {
        try {
            this.f55616d.f(this.f55613a);
            if (this.f55616d.a()) {
                a(new AssertionError("Expected exception: " + this.f55616d.d().getName()));
            }
        } catch (InvocationTargetException e4) {
            Throwable targetException = e4.getTargetException();
            if (targetException instanceof AssumptionViolatedException) {
                return;
            }
            if (!this.f55616d.a()) {
                a(targetException);
                return;
            }
            if (this.f55616d.h(targetException)) {
                a(new Exception("Unexpected exception, expected<" + this.f55616d.d().getName() + "> but was<" + targetException.getClass().getName() + ">", targetException));
            }
        } catch (Throwable th) {
            a(th);
        }
    }
}
