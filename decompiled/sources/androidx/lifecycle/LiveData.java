package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k, reason: collision with root package name */
    static final int f15445k = -1;

    /* renamed from: l, reason: collision with root package name */
    static final Object f15446l = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f15447a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.arch.core.internal.b<Q<? super T>, LiveData<T>.c> f15448b;

    /* renamed from: c, reason: collision with root package name */
    int f15449c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15450d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f15451e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f15452f;

    /* renamed from: g, reason: collision with root package name */
    private int f15453g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15454h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15455i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f15456j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements A {

        /* renamed from: I, reason: collision with root package name */
        @androidx.annotation.N
        final E f15457I;

        LifecycleBoundObserver(@androidx.annotation.N E e4, Q<? super T> q4) {
            super(q4);
            this.f15457I = e4;
        }

        @Override // androidx.lifecycle.LiveData.c
        void d() {
            this.f15457I.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean e(E e4) {
            if (this.f15457I == e4) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.A
        public void f(@androidx.annotation.N E e4, @androidx.annotation.N Lifecycle.Event event) {
            Lifecycle.State b4 = this.f15457I.getLifecycle().b();
            if (b4 == Lifecycle.State.DESTROYED) {
                LiveData.this.p(this.f15461E);
                return;
            }
            Lifecycle.State state = null;
            while (state != b4) {
                a(g());
                state = b4;
                b4 = this.f15457I.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean g() {
            return this.f15457I.getLifecycle().b().e(Lifecycle.State.STARTED);
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f15447a) {
                obj = LiveData.this.f15452f;
                LiveData.this.f15452f = LiveData.f15446l;
            }
            LiveData.this.r(obj);
        }
    }

    /* loaded from: classes.dex */
    private class b extends LiveData<T>.c {
        b(Q<? super T> q4) {
            super(q4);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean g() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: E, reason: collision with root package name */
        final Q<? super T> f15461E;

        /* renamed from: F, reason: collision with root package name */
        boolean f15462F;

        /* renamed from: G, reason: collision with root package name */
        int f15463G = -1;

        c(Q<? super T> q4) {
            this.f15461E = q4;
        }

        void a(boolean z3) {
            int i4;
            if (z3 == this.f15462F) {
                return;
            }
            this.f15462F = z3;
            LiveData liveData = LiveData.this;
            if (z3) {
                i4 = 1;
            } else {
                i4 = -1;
            }
            liveData.c(i4);
            if (this.f15462F) {
                LiveData.this.e(this);
            }
        }

        void d() {
        }

        boolean e(E e4) {
            return false;
        }

        abstract boolean g();
    }

    public LiveData(T t3) {
        this.f15447a = new Object();
        this.f15448b = new androidx.arch.core.internal.b<>();
        this.f15449c = 0;
        this.f15452f = f15446l;
        this.f15456j = new a();
        this.f15451e = t3;
        this.f15453g = 0;
    }

    static void b(String str) {
        if (androidx.arch.core.executor.c.h().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(LiveData<T>.c cVar) {
        if (!cVar.f15462F) {
            return;
        }
        if (!cVar.g()) {
            cVar.a(false);
            return;
        }
        int i4 = cVar.f15463G;
        int i5 = this.f15453g;
        if (i4 >= i5) {
            return;
        }
        cVar.f15463G = i5;
        cVar.f15461E.f((Object) this.f15451e);
    }

    @androidx.annotation.K
    void c(int i4) {
        boolean z3;
        boolean z4;
        int i5 = this.f15449c;
        this.f15449c = i4 + i5;
        if (this.f15450d) {
            return;
        }
        this.f15450d = true;
        while (true) {
            try {
                int i6 = this.f15449c;
                if (i5 != i6) {
                    if (i5 == 0 && i6 > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i5 > 0 && i6 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                        m();
                    } else if (z4) {
                        n();
                    }
                    i5 = i6;
                } else {
                    this.f15450d = false;
                    return;
                }
            } catch (Throwable th) {
                this.f15450d = false;
                throw th;
            }
        }
    }

    void e(@androidx.annotation.P LiveData<T>.c cVar) {
        if (this.f15454h) {
            this.f15455i = true;
            return;
        }
        this.f15454h = true;
        do {
            this.f15455i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                androidx.arch.core.internal.b<Q<? super T>, LiveData<T>.c>.d f4 = this.f15448b.f();
                while (f4.hasNext()) {
                    d((c) f4.next().getValue());
                    if (this.f15455i) {
                        break;
                    }
                }
            }
        } while (this.f15455i);
        this.f15454h = false;
    }

    @androidx.annotation.P
    public T f() {
        T t3 = (T) this.f15451e;
        if (t3 != f15446l) {
            return t3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f15453g;
    }

    public boolean h() {
        if (this.f15449c > 0) {
            return true;
        }
        return false;
    }

    public boolean i() {
        if (this.f15448b.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (this.f15451e != f15446l) {
            return true;
        }
        return false;
    }

    @androidx.annotation.K
    public void k(@androidx.annotation.N E e4, @androidx.annotation.N Q<? super T> q4) {
        b("observe");
        if (e4.getLifecycle().b() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(e4, q4);
        LiveData<T>.c k4 = this.f15448b.k(q4, lifecycleBoundObserver);
        if (k4 != null && !k4.e(e4)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (k4 != null) {
            return;
        }
        e4.getLifecycle().a(lifecycleBoundObserver);
    }

    @androidx.annotation.K
    public void l(@androidx.annotation.N Q<? super T> q4) {
        b("observeForever");
        b bVar = new b(q4);
        LiveData<T>.c k4 = this.f15448b.k(q4, bVar);
        if (!(k4 instanceof LifecycleBoundObserver)) {
            if (k4 != null) {
                return;
            }
            bVar.a(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    protected void m() {
    }

    protected void n() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(T t3) {
        boolean z3;
        synchronized (this.f15447a) {
            if (this.f15452f == f15446l) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f15452f = t3;
        }
        if (!z3) {
            return;
        }
        androidx.arch.core.executor.c.h().d(this.f15456j);
    }

    @androidx.annotation.K
    public void p(@androidx.annotation.N Q<? super T> q4) {
        b("removeObserver");
        LiveData<T>.c l4 = this.f15448b.l(q4);
        if (l4 == null) {
            return;
        }
        l4.d();
        l4.a(false);
    }

    @androidx.annotation.K
    public void q(@androidx.annotation.N E e4) {
        b("removeObservers");
        Iterator<Map.Entry<Q<? super T>, LiveData<T>.c>> it = this.f15448b.iterator();
        while (it.hasNext()) {
            Map.Entry<Q<? super T>, LiveData<T>.c> next = it.next();
            if (next.getValue().e(e4)) {
                p(next.getKey());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.K
    public void r(T t3) {
        b("setValue");
        this.f15453g++;
        this.f15451e = t3;
        e(null);
    }

    public LiveData() {
        this.f15447a = new Object();
        this.f15448b = new androidx.arch.core.internal.b<>();
        this.f15449c = 0;
        Object obj = f15446l;
        this.f15452f = obj;
        this.f15456j = new a();
        this.f15451e = obj;
        this.f15453g = -1;
    }
}
