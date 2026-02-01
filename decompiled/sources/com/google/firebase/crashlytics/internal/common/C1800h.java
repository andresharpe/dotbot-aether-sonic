package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1773n;
import com.google.android.gms.tasks.InterfaceC1762c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.crashlytics.internal.common.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1800h {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f35068a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC1770k<Void> f35069b = C1773n.g(null);

    /* renamed from: c, reason: collision with root package name */
    private final Object f35070c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Boolean> f35071d = new ThreadLocal<>();

    /* renamed from: com.google.firebase.crashlytics.internal.common.h$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1800h.this.f35071d.set(Boolean.TRUE);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.h$b */
    /* loaded from: classes2.dex */
    class b implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f35073a;

        b(Runnable runnable) {
            this.f35073a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            this.f35073a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.firebase.crashlytics.internal.common.h$c */
    /* loaded from: classes2.dex */
    public class c<T> implements InterfaceC1762c<Void, T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callable f35075a;

        c(Callable callable) {
            this.f35075a = callable;
        }

        @Override // com.google.android.gms.tasks.InterfaceC1762c
        public T a(@androidx.annotation.N AbstractC1770k<Void> abstractC1770k) throws Exception {
            return (T) this.f35075a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.firebase.crashlytics.internal.common.h$d */
    /* loaded from: classes2.dex */
    public class d<T> implements InterfaceC1762c<T, Void> {
        d() {
        }

        @Override // com.google.android.gms.tasks.InterfaceC1762c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(@androidx.annotation.N AbstractC1770k<T> abstractC1770k) throws Exception {
            return null;
        }
    }

    public C1800h(Executor executor) {
        this.f35068a = executor;
        executor.execute(new a());
    }

    private <T> AbstractC1770k<Void> d(AbstractC1770k<T> abstractC1770k) {
        return abstractC1770k.n(this.f35068a, new d());
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.f35071d.get());
    }

    private <T> InterfaceC1762c<Void, T> f(Callable<T> callable) {
        return new c(callable);
    }

    public void b() {
        if (e()) {
        } else {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.f35068a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1770k<Void> g(Runnable runnable) {
        return h(new b(runnable));
    }

    public <T> AbstractC1770k<T> h(Callable<T> callable) {
        AbstractC1770k<T> n4;
        synchronized (this.f35070c) {
            n4 = this.f35069b.n(this.f35068a, f(callable));
            this.f35069b = d(n4);
        }
        return n4;
    }

    public <T> AbstractC1770k<T> i(Callable<AbstractC1770k<T>> callable) {
        AbstractC1770k<T> p4;
        synchronized (this.f35070c) {
            p4 = this.f35069b.p(this.f35068a, f(callable));
            this.f35069b = d(p4);
        }
        return p4;
    }
}
