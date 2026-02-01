package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0907i<T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Executor f15635a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final LiveData<T> f15636b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final LiveData<T> f15637c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final AtomicBoolean f15638d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final AtomicBoolean f15639e;

    /* renamed from: f, reason: collision with root package name */
    @W2.f
    @l3.d
    public final Runnable f15640f;

    /* renamed from: g, reason: collision with root package name */
    @W2.f
    @l3.d
    public final Runnable f15641g;

    /* renamed from: androidx.lifecycle.i$a */
    /* loaded from: classes.dex */
    public static final class a extends LiveData<T> {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ AbstractC0907i<T> f15642m;

        a(AbstractC0907i<T> abstractC0907i) {
            this.f15642m = abstractC0907i;
        }

        @Override // androidx.lifecycle.LiveData
        protected void m() {
            this.f15642m.e().execute(this.f15642m.f15640f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @W2.j
    public AbstractC0907i() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @androidx.annotation.i0
    public static /* synthetic */ void g() {
    }

    @androidx.annotation.i0
    public static /* synthetic */ void i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(AbstractC0907i this$0) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        boolean h4 = this$0.h().h();
        if (this$0.f15638d.compareAndSet(false, true) && h4) {
            this$0.f15635a.execute(this$0.f15640f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(AbstractC0907i this$0) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        while (this$0.f15639e.compareAndSet(false, true)) {
            Object obj = null;
            boolean z3 = false;
            while (this$0.f15638d.compareAndSet(true, false)) {
                try {
                    obj = this$0.c();
                    z3 = true;
                } catch (Throwable th) {
                    this$0.f15639e.set(false);
                    throw th;
                }
            }
            if (z3) {
                this$0.h().o(obj);
            }
            this$0.f15639e.set(false);
            if (!z3 || !this$0.f15638d.get()) {
                return;
            }
        }
    }

    @androidx.annotation.j0
    protected abstract T c();

    @l3.d
    public final AtomicBoolean d() {
        return this.f15639e;
    }

    @l3.d
    public final Executor e() {
        return this.f15635a;
    }

    @l3.d
    public final AtomicBoolean f() {
        return this.f15638d;
    }

    @l3.d
    public LiveData<T> h() {
        return this.f15637c;
    }

    public void j() {
        androidx.arch.core.executor.c.h().b(this.f15641g);
    }

    @W2.j
    public AbstractC0907i(@l3.d Executor executor) {
        kotlin.jvm.internal.F.p(executor, "executor");
        this.f15635a = executor;
        a aVar = new a(this);
        this.f15636b = aVar;
        this.f15637c = aVar;
        this.f15638d = new AtomicBoolean(true);
        this.f15639e = new AtomicBoolean(false);
        this.f15640f = new Runnable() { // from class: androidx.lifecycle.g
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0907i.l(AbstractC0907i.this);
            }
        };
        this.f15641g = new Runnable() { // from class: androidx.lifecycle.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0907i.k(AbstractC0907i.this);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AbstractC0907i(java.util.concurrent.Executor r1, int r2, kotlin.jvm.internal.C2197u r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Ld
            java.util.concurrent.Executor r1 = androidx.arch.core.executor.c.g()
            java.lang.String r2 = "getIOThreadExecutor()"
            kotlin.jvm.internal.F.o(r1, r2)
        Ld:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.AbstractC0907i.<init>(java.util.concurrent.Executor, int, kotlin.jvm.internal.u):void");
    }
}
