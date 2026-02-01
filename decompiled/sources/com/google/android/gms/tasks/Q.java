package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.internal.C1285y;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Q<TResult> extends AbstractC1770k<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f31168a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final L f31169b = new L();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private boolean f31170c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f31171d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.P
    @GuardedBy("mLock")
    private Object f31172e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("mLock")
    private Exception f31173f;

    @GuardedBy("mLock")
    private final void D() {
        C1285y.s(this.f31170c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    private final void E() {
        if (!this.f31171d) {
        } else {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @GuardedBy("mLock")
    private final void F() {
        if (!this.f31170c) {
        } else {
            throw DuplicateTaskCompletionException.a(this);
        }
    }

    private final void G() {
        synchronized (this.f31168a) {
            try {
                if (!this.f31170c) {
                    return;
                }
                this.f31169b.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean A() {
        synchronized (this.f31168a) {
            try {
                if (this.f31170c) {
                    return false;
                }
                this.f31170c = true;
                this.f31171d = true;
                this.f31169b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean B(@androidx.annotation.N Exception exc) {
        C1285y.m(exc, "Exception must not be null");
        synchronized (this.f31168a) {
            try {
                if (this.f31170c) {
                    return false;
                }
                this.f31170c = true;
                this.f31173f = exc;
                this.f31169b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean C(@androidx.annotation.P Object obj) {
        synchronized (this.f31168a) {
            try {
                if (this.f31170c) {
                    return false;
                }
                this.f31170c = true;
                this.f31172e = obj;
                this.f31169b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final AbstractC1770k<TResult> a(@androidx.annotation.N Activity activity, @androidx.annotation.N InterfaceC1763d interfaceC1763d) {
        B b4 = new B(C1772m.f31182a, interfaceC1763d);
        this.f31169b.a(b4);
        P.m(activity).n(b4);
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final AbstractC1770k<TResult> b(@androidx.annotation.N InterfaceC1763d interfaceC1763d) {
        c(C1772m.f31182a, interfaceC1763d);
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final AbstractC1770k<TResult> c(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1763d interfaceC1763d) {
        this.f31169b.a(new B(executor, interfaceC1763d));
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final AbstractC1770k<TResult> d(@androidx.annotation.N Activity activity, @androidx.annotation.N InterfaceC1764e<TResult> interfaceC1764e) {
        D d4 = new D(C1772m.f31182a, interfaceC1764e);
        this.f31169b.a(d4);
        P.m(activity).n(d4);
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final AbstractC1770k<TResult> e(@androidx.annotation.N InterfaceC1764e<TResult> interfaceC1764e) {
        this.f31169b.a(new D(C1772m.f31182a, interfaceC1764e));
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final AbstractC1770k<TResult> f(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1764e<TResult> interfaceC1764e) {
        this.f31169b.a(new D(executor, interfaceC1764e));
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final AbstractC1770k<TResult> g(@androidx.annotation.N Activity activity, @androidx.annotation.N InterfaceC1765f interfaceC1765f) {
        F f4 = new F(C1772m.f31182a, interfaceC1765f);
        this.f31169b.a(f4);
        P.m(activity).n(f4);
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final AbstractC1770k<TResult> h(@androidx.annotation.N InterfaceC1765f interfaceC1765f) {
        i(C1772m.f31182a, interfaceC1765f);
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final AbstractC1770k<TResult> i(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1765f interfaceC1765f) {
        this.f31169b.a(new F(executor, interfaceC1765f));
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final AbstractC1770k<TResult> j(@androidx.annotation.N Activity activity, @androidx.annotation.N InterfaceC1766g<? super TResult> interfaceC1766g) {
        H h4 = new H(C1772m.f31182a, interfaceC1766g);
        this.f31169b.a(h4);
        P.m(activity).n(h4);
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final AbstractC1770k<TResult> k(@androidx.annotation.N InterfaceC1766g<? super TResult> interfaceC1766g) {
        l(C1772m.f31182a, interfaceC1766g);
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final AbstractC1770k<TResult> l(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1766g<? super TResult> interfaceC1766g) {
        this.f31169b.a(new H(executor, interfaceC1766g));
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final <TContinuationResult> AbstractC1770k<TContinuationResult> m(@androidx.annotation.N InterfaceC1762c<TResult, TContinuationResult> interfaceC1762c) {
        return n(C1772m.f31182a, interfaceC1762c);
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final <TContinuationResult> AbstractC1770k<TContinuationResult> n(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1762c<TResult, TContinuationResult> interfaceC1762c) {
        Q q4 = new Q();
        this.f31169b.a(new x(executor, interfaceC1762c, q4));
        G();
        return q4;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final <TContinuationResult> AbstractC1770k<TContinuationResult> o(@androidx.annotation.N InterfaceC1762c<TResult, AbstractC1770k<TContinuationResult>> interfaceC1762c) {
        return p(C1772m.f31182a, interfaceC1762c);
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final <TContinuationResult> AbstractC1770k<TContinuationResult> p(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1762c<TResult, AbstractC1770k<TContinuationResult>> interfaceC1762c) {
        Q q4 = new Q();
        this.f31169b.a(new z(executor, interfaceC1762c, q4));
        G();
        return q4;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.P
    public final Exception q() {
        Exception exc;
        synchronized (this.f31168a) {
            exc = this.f31173f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    public final TResult r() {
        TResult tresult;
        synchronized (this.f31168a) {
            try {
                D();
                E();
                Exception exc = this.f31173f;
                if (exc == null) {
                    tresult = (TResult) this.f31172e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    public final <X extends Throwable> TResult s(@androidx.annotation.N Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f31168a) {
            try {
                D();
                E();
                if (!cls.isInstance(this.f31173f)) {
                    Exception exc = this.f31173f;
                    if (exc == null) {
                        tresult = (TResult) this.f31172e;
                    } else {
                        throw new RuntimeExecutionException(exc);
                    }
                } else {
                    throw cls.cast(this.f31173f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    public final boolean t() {
        return this.f31171d;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    public final boolean u() {
        boolean z3;
        synchronized (this.f31168a) {
            z3 = this.f31170c;
        }
        return z3;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    public final boolean v() {
        boolean z3;
        synchronized (this.f31168a) {
            try {
                z3 = false;
                if (this.f31170c && !this.f31171d && this.f31173f == null) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final <TContinuationResult> AbstractC1770k<TContinuationResult> w(@androidx.annotation.N InterfaceC1769j<TResult, TContinuationResult> interfaceC1769j) {
        Executor executor = C1772m.f31182a;
        Q q4 = new Q();
        this.f31169b.a(new J(executor, interfaceC1769j, q4));
        G();
        return q4;
    }

    @Override // com.google.android.gms.tasks.AbstractC1770k
    @androidx.annotation.N
    public final <TContinuationResult> AbstractC1770k<TContinuationResult> x(Executor executor, InterfaceC1769j<TResult, TContinuationResult> interfaceC1769j) {
        Q q4 = new Q();
        this.f31169b.a(new J(executor, interfaceC1769j, q4));
        G();
        return q4;
    }

    public final void y(@androidx.annotation.N Exception exc) {
        C1285y.m(exc, "Exception must not be null");
        synchronized (this.f31168a) {
            F();
            this.f31170c = true;
            this.f31173f = exc;
        }
        this.f31169b.b(this);
    }

    public final void z(@androidx.annotation.P Object obj) {
        synchronized (this.f31168a) {
            F();
            this.f31170c = true;
            this.f31172e = obj;
        }
        this.f31169b.b(this);
    }
}
