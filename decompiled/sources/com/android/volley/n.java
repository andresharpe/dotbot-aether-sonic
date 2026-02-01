package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class n {

    /* renamed from: l, reason: collision with root package name */
    private static final int f24499l = 4;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f24500a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Request<?>> f24501b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<Request<?>> f24502c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<Request<?>> f24503d;

    /* renamed from: e, reason: collision with root package name */
    private final com.android.volley.e f24504e;

    /* renamed from: f, reason: collision with root package name */
    private final j f24505f;

    /* renamed from: g, reason: collision with root package name */
    private final q f24506g;

    /* renamed from: h, reason: collision with root package name */
    private final k[] f24507h;

    /* renamed from: i, reason: collision with root package name */
    private f f24508i;

    /* renamed from: j, reason: collision with root package name */
    private final List<e> f24509j;

    /* renamed from: k, reason: collision with root package name */
    private final List<c> f24510k;

    /* loaded from: classes.dex */
    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f24511a;

        a(Object obj) {
            this.f24511a = obj;
        }

        @Override // com.android.volley.n.d
        public boolean a(Request<?> request) {
            if (request.D() == this.f24511a) {
                return true;
            }
            return false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {

        /* renamed from: j, reason: collision with root package name */
        public static final int f24513j = 0;

        /* renamed from: k, reason: collision with root package name */
        public static final int f24514k = 1;

        /* renamed from: l, reason: collision with root package name */
        public static final int f24515l = 2;

        /* renamed from: m, reason: collision with root package name */
        public static final int f24516m = 3;

        /* renamed from: n, reason: collision with root package name */
        public static final int f24517n = 4;

        /* renamed from: o, reason: collision with root package name */
        public static final int f24518o = 5;
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(Request<?> request, int i4);
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(Request<?> request);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface e<T> {
        void a(Request<T> request);
    }

    public n(com.android.volley.e eVar, j jVar, int i4, q qVar) {
        this.f24500a = new AtomicInteger();
        this.f24501b = new HashSet();
        this.f24502c = new PriorityBlockingQueue<>();
        this.f24503d = new PriorityBlockingQueue<>();
        this.f24509j = new ArrayList();
        this.f24510k = new ArrayList();
        this.f24504e = eVar;
        this.f24505f = jVar;
        this.f24507h = new k[i4];
        this.f24506g = qVar;
    }

    public <T> Request<T> a(Request<T> request) {
        request.R(this);
        synchronized (this.f24501b) {
            this.f24501b.add(request);
        }
        request.T(j());
        request.e("add-to-queue");
        m(request, 0);
        d(request);
        return request;
    }

    public void b(c cVar) {
        synchronized (this.f24510k) {
            this.f24510k.add(cVar);
        }
    }

    @Deprecated
    public <T> void c(e<T> eVar) {
        synchronized (this.f24509j) {
            this.f24509j.add(eVar);
        }
    }

    <T> void d(Request<T> request) {
        if (!request.Y()) {
            n(request);
        } else {
            this.f24502c.add(request);
        }
    }

    public void e(d dVar) {
        synchronized (this.f24501b) {
            try {
                for (Request<?> request : this.f24501b) {
                    if (dVar.a(request)) {
                        request.f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(Object obj) {
        if (obj != null) {
            e(new a(obj));
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void g(Request<T> request) {
        synchronized (this.f24501b) {
            this.f24501b.remove(request);
        }
        synchronized (this.f24509j) {
            try {
                Iterator<e> it = this.f24509j.iterator();
                while (it.hasNext()) {
                    it.next().a(request);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m(request, 5);
    }

    public com.android.volley.e h() {
        return this.f24504e;
    }

    public q i() {
        return this.f24506g;
    }

    public int j() {
        return this.f24500a.incrementAndGet();
    }

    public void k(c cVar) {
        synchronized (this.f24510k) {
            this.f24510k.remove(cVar);
        }
    }

    @Deprecated
    public <T> void l(e<T> eVar) {
        synchronized (this.f24509j) {
            this.f24509j.remove(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Request<?> request, int i4) {
        synchronized (this.f24510k) {
            try {
                Iterator<c> it = this.f24510k.iterator();
                while (it.hasNext()) {
                    it.next().a(request, i4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void n(Request<T> request) {
        this.f24503d.add(request);
    }

    public void o() {
        p();
        f fVar = new f(this.f24502c, this.f24503d, this.f24504e, this.f24506g);
        this.f24508i = fVar;
        fVar.start();
        for (int i4 = 0; i4 < this.f24507h.length; i4++) {
            k kVar = new k(this.f24503d, this.f24505f, this.f24504e, this.f24506g);
            this.f24507h[i4] = kVar;
            kVar.start();
        }
    }

    public void p() {
        f fVar = this.f24508i;
        if (fVar != null) {
            fVar.d();
        }
        for (k kVar : this.f24507h) {
            if (kVar != null) {
                kVar.e();
            }
        }
    }

    public n(com.android.volley.e eVar, j jVar, int i4) {
        this(eVar, jVar, i4, new h(new Handler(Looper.getMainLooper())));
    }

    public n(com.android.volley.e eVar, j jVar) {
        this(eVar, jVar, 4);
    }
}
