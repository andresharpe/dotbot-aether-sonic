package com.google.android.gms.tasks;

import android.os.Looper;
import com.google.android.gms.common.internal.C1285y;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.tasks.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1773n {
    private C1773n() {
    }

    public static <TResult> TResult a(@androidx.annotation.N AbstractC1770k<TResult> abstractC1770k) throws ExecutionException, InterruptedException {
        C1285y.j();
        C1285y.m(abstractC1770k, "Task must not be null");
        if (abstractC1770k.u()) {
            return (TResult) o(abstractC1770k);
        }
        C1777s c1777s = new C1777s(null);
        p(abstractC1770k, c1777s);
        c1777s.b();
        return (TResult) o(abstractC1770k);
    }

    public static <TResult> TResult b(@androidx.annotation.N AbstractC1770k<TResult> abstractC1770k, long j4, @androidx.annotation.N TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C1285y.j();
        C1285y.m(abstractC1770k, "Task must not be null");
        C1285y.m(timeUnit, "TimeUnit must not be null");
        if (abstractC1770k.u()) {
            return (TResult) o(abstractC1770k);
        }
        C1777s c1777s = new C1777s(null);
        p(abstractC1770k, c1777s);
        if (c1777s.e(j4, timeUnit)) {
            return (TResult) o(abstractC1770k);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @androidx.annotation.N
    @Deprecated
    public static <TResult> AbstractC1770k<TResult> c(@androidx.annotation.N Callable<TResult> callable) {
        return d(C1772m.f31182a, callable);
    }

    @androidx.annotation.N
    @Deprecated
    public static <TResult> AbstractC1770k<TResult> d(@androidx.annotation.N Executor executor, @androidx.annotation.N Callable<TResult> callable) {
        C1285y.m(executor, "Executor must not be null");
        C1285y.m(callable, "Callback must not be null");
        Q q4 = new Q();
        executor.execute(new U(q4, callable));
        return q4;
    }

    @androidx.annotation.N
    public static <TResult> AbstractC1770k<TResult> e() {
        Q q4 = new Q();
        q4.A();
        return q4;
    }

    @androidx.annotation.N
    public static <TResult> AbstractC1770k<TResult> f(@androidx.annotation.N Exception exc) {
        Q q4 = new Q();
        q4.y(exc);
        return q4;
    }

    @androidx.annotation.N
    public static <TResult> AbstractC1770k<TResult> g(TResult tresult) {
        Q q4 = new Q();
        q4.z(tresult);
        return q4;
    }

    @androidx.annotation.N
    public static AbstractC1770k<Void> h(@androidx.annotation.P Collection<? extends AbstractC1770k<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            Iterator<? extends AbstractC1770k<?>> it = collection.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            Q q4 = new Q();
            C1779u c1779u = new C1779u(collection.size(), q4);
            Iterator<? extends AbstractC1770k<?>> it2 = collection.iterator();
            while (it2.hasNext()) {
                p(it2.next(), c1779u);
            }
            return q4;
        }
        return g(null);
    }

    @androidx.annotation.N
    public static AbstractC1770k<Void> i(@androidx.annotation.P AbstractC1770k<?>... abstractC1770kArr) {
        if (abstractC1770kArr != null && abstractC1770kArr.length != 0) {
            return h(Arrays.asList(abstractC1770kArr));
        }
        return g(null);
    }

    @androidx.annotation.N
    public static AbstractC1770k<List<AbstractC1770k<?>>> j(@androidx.annotation.P Collection<? extends AbstractC1770k<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            return h(collection).p(C1772m.f31182a, new C1776q(collection));
        }
        return g(Collections.emptyList());
    }

    @androidx.annotation.N
    public static AbstractC1770k<List<AbstractC1770k<?>>> k(@androidx.annotation.P AbstractC1770k<?>... abstractC1770kArr) {
        if (abstractC1770kArr != null && abstractC1770kArr.length != 0) {
            return j(Arrays.asList(abstractC1770kArr));
        }
        return g(Collections.emptyList());
    }

    @androidx.annotation.N
    public static <TResult> AbstractC1770k<List<TResult>> l(@androidx.annotation.P Collection<? extends AbstractC1770k> collection) {
        if (collection != null && !collection.isEmpty()) {
            return (AbstractC1770k<List<TResult>>) h(collection).n(C1772m.f31182a, new C1775p(collection));
        }
        return g(Collections.emptyList());
    }

    @androidx.annotation.N
    public static <TResult> AbstractC1770k<List<TResult>> m(@androidx.annotation.P AbstractC1770k... abstractC1770kArr) {
        if (abstractC1770kArr != null && abstractC1770kArr.length != 0) {
            return l(Arrays.asList(abstractC1770kArr));
        }
        return g(Collections.emptyList());
    }

    @androidx.annotation.N
    public static <T> AbstractC1770k<T> n(@androidx.annotation.N AbstractC1770k<T> abstractC1770k, long j4, @androidx.annotation.N TimeUnit timeUnit) {
        boolean z3;
        C1285y.m(abstractC1770k, "Task must not be null");
        if (j4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.b(z3, "Timeout must be positive");
        C1285y.m(timeUnit, "TimeUnit must not be null");
        final v vVar = new v();
        final C1771l c1771l = new C1771l(vVar);
        final M0.a aVar = new M0.a(Looper.getMainLooper());
        aVar.postDelayed(new Runnable() { // from class: com.google.android.gms.tasks.S
            @Override // java.lang.Runnable
            public final void run() {
                C1771l.this.d(new TimeoutException());
            }
        }, timeUnit.toMillis(j4));
        abstractC1770k.e(new InterfaceC1764e() { // from class: com.google.android.gms.tasks.T
            @Override // com.google.android.gms.tasks.InterfaceC1764e
            public final void a(AbstractC1770k abstractC1770k2) {
                M0.a aVar2 = M0.a.this;
                C1771l c1771l2 = c1771l;
                v vVar2 = vVar;
                aVar2.removeCallbacksAndMessages(null);
                if (abstractC1770k2.v()) {
                    c1771l2.e(abstractC1770k2.r());
                } else {
                    if (abstractC1770k2.t()) {
                        vVar2.c();
                        return;
                    }
                    Exception q4 = abstractC1770k2.q();
                    q4.getClass();
                    c1771l2.d(q4);
                }
            }
        });
        return c1771l.a();
    }

    private static Object o(@androidx.annotation.N AbstractC1770k abstractC1770k) throws ExecutionException {
        if (abstractC1770k.v()) {
            return abstractC1770k.r();
        }
        if (abstractC1770k.t()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC1770k.q());
    }

    private static void p(AbstractC1770k abstractC1770k, InterfaceC1778t interfaceC1778t) {
        Executor executor = C1772m.f31183b;
        abstractC1770k.l(executor, interfaceC1778t);
        abstractC1770k.i(executor, interfaceC1778t);
        abstractC1770k.c(executor, interfaceC1778t);
    }
}
