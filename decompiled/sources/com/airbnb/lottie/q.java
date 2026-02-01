package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class q<T> {

    /* renamed from: e, reason: collision with root package name */
    public static Executor f22009e = Executors.newCachedThreadPool();

    /* renamed from: a, reason: collision with root package name */
    private final Set<l<T>> f22010a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<l<Throwable>> f22011b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f22012c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private volatile p<T> f22013d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (q.this.f22013d != null) {
                p pVar = q.this.f22013d;
                if (pVar.b() != null) {
                    q.this.i(pVar.b());
                } else {
                    q.this.g(pVar.a());
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private class b extends FutureTask<p<T>> {
        b(Callable<p<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (!isCancelled()) {
                try {
                    q.this.l(get());
                } catch (InterruptedException | ExecutionException e4) {
                    q.this.l(new p(e4));
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public q(Callable<p<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f22011b);
        if (arrayList.isEmpty()) {
            com.airbnb.lottie.utils.f.f("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l) it.next()).onResult(th);
        }
    }

    private void h() {
        this.f22012c.post(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i(T t3) {
        Iterator it = new ArrayList(this.f22010a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onResult(t3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(@P p<T> pVar) {
        if (this.f22013d == null) {
            this.f22013d = pVar;
            h();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized q<T> e(l<Throwable> lVar) {
        try {
            if (this.f22013d != null && this.f22013d.a() != null) {
                lVar.onResult(this.f22013d.a());
            }
            this.f22011b.add(lVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized q<T> f(l<T> lVar) {
        try {
            if (this.f22013d != null && this.f22013d.b() != null) {
                lVar.onResult(this.f22013d.b());
            }
            this.f22010a.add(lVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized q<T> j(l<Throwable> lVar) {
        this.f22011b.remove(lVar);
        return this;
    }

    public synchronized q<T> k(l<T> lVar) {
        this.f22010a.remove(lVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public q(Callable<p<T>> callable, boolean z3) {
        this.f22010a = new LinkedHashSet(1);
        this.f22011b = new LinkedHashSet(1);
        this.f22012c = new Handler(Looper.getMainLooper());
        this.f22013d = null;
        if (z3) {
            try {
                l(callable.call());
                return;
            } catch (Throwable th) {
                l(new p<>(th));
                return;
            }
        }
        f22009e.execute(new b(callable));
    }
}
