package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.recyclerview.widget.n;
import com.android.volley.a;
import com.android.volley.b;
import com.android.volley.e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c extends n {

    /* renamed from: w, reason: collision with root package name */
    private static final int f24414w = 4;

    /* renamed from: m, reason: collision with root package name */
    @P
    private final com.android.volley.a f24415m;

    /* renamed from: n, reason: collision with root package name */
    private final com.android.volley.b f24416n;

    /* renamed from: o, reason: collision with root package name */
    private ExecutorService f24417o;

    /* renamed from: p, reason: collision with root package name */
    private ScheduledExecutorService f24418p;

    /* renamed from: q, reason: collision with root package name */
    private ExecutorService f24419q;

    /* renamed from: r, reason: collision with root package name */
    private h f24420r;

    /* renamed from: s, reason: collision with root package name */
    private final t f24421s;

    /* renamed from: t, reason: collision with root package name */
    private final List<Request<?>> f24422t;

    /* renamed from: u, reason: collision with root package name */
    private volatile boolean f24423u;

    /* renamed from: v, reason: collision with root package name */
    private final Object f24424v;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: com.android.volley.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0210a implements a.b {
            C0210a() {
            }

            @Override // com.android.volley.a.b
            public void a() {
                c.this.B();
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f24415m.c(new C0210a());
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.B();
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.h().b();
            c.this.f24417o.execute(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.android.volley.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0211c implements Comparator<Runnable> {
        C0211c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Runnable runnable, Runnable runnable2) {
            if (runnable instanceof o) {
                if (runnable2 instanceof o) {
                    return ((o) runnable).a((o) runnable2);
                }
                return 1;
            }
            if (runnable2 instanceof o) {
                return -1;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: b, reason: collision with root package name */
        private final com.android.volley.b f24430b;

        /* renamed from: a, reason: collision with root package name */
        @P
        private com.android.volley.a f24429a = null;

        /* renamed from: c, reason: collision with root package name */
        @P
        private com.android.volley.e f24431c = null;

        /* renamed from: d, reason: collision with root package name */
        @P
        private h f24432d = null;

        /* renamed from: e, reason: collision with root package name */
        @P
        private q f24433e = null;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends h {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.android.volley.c$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class ThreadFactoryC0212a implements ThreadFactory {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ String f24435E;

                ThreadFactoryC0212a(String str) {
                    this.f24435E = str;
                }

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(@N Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("Volley-" + this.f24435E);
                    return newThread;
                }
            }

            a() {
            }

            private ThreadPoolExecutor d(int i4, String str, BlockingQueue<Runnable> blockingQueue) {
                return new ThreadPoolExecutor(0, i4, 60L, TimeUnit.SECONDS, blockingQueue, e(str));
            }

            private ThreadFactory e(String str) {
                return new ThreadFactoryC0212a(str);
            }

            @Override // com.android.volley.c.h
            public ExecutorService a(BlockingQueue<Runnable> blockingQueue) {
                return d(4, "BlockingExecutor", blockingQueue);
            }

            @Override // com.android.volley.c.h
            public ExecutorService b(BlockingQueue<Runnable> blockingQueue) {
                return d(1, "Non-BlockingExecutor", blockingQueue);
            }

            @Override // com.android.volley.c.h
            public ScheduledExecutorService c() {
                return new ScheduledThreadPoolExecutor(0, e("ScheduledExecutor"));
            }
        }

        public d(com.android.volley.b bVar) {
            if (bVar != null) {
                this.f24430b = bVar;
                return;
            }
            throw new IllegalArgumentException("Network cannot be null");
        }

        private h b() {
            return new a();
        }

        public c a() {
            com.android.volley.e eVar = this.f24431c;
            if (eVar == null && this.f24429a == null) {
                throw new IllegalArgumentException("You must set one of the cache objects");
            }
            if (eVar == null) {
                this.f24431c = new l(null);
            }
            if (this.f24433e == null) {
                this.f24433e = new com.android.volley.h(new Handler(Looper.getMainLooper()));
            }
            if (this.f24432d == null) {
                this.f24432d = b();
            }
            return new c(this.f24431c, this.f24430b, this.f24429a, this.f24433e, this.f24432d, null);
        }

        public d c(com.android.volley.a aVar) {
            this.f24429a = aVar;
            return this;
        }

        public d d(com.android.volley.e eVar) {
            this.f24431c = eVar;
            return this;
        }

        public d e(h hVar) {
            this.f24432d = hVar;
            return this;
        }

        public d f(q qVar) {
            this.f24433e = qVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e<T> extends o<T> {

        /* renamed from: F, reason: collision with root package name */
        e.a f24437F;

        /* renamed from: G, reason: collision with root package name */
        long f24438G;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                c.this.n(eVar.f24519E);
            }
        }

        e(Request<T> request, e.a aVar, long j4) {
            super(request);
            this.f24437F = aVar;
            this.f24438G = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24519E.e("cache-hit");
            Request<T> request = this.f24519E;
            e.a aVar = this.f24437F;
            p<T> N3 = request.N(new com.android.volley.l(n.f.f18255b, aVar.f24456a, false, 0L, aVar.f24463h));
            this.f24519E.e("cache-hit-parsed");
            if (!this.f24437F.d(this.f24438G)) {
                c.this.i().a(this.f24519E, N3);
                return;
            }
            this.f24519E.e("cache-hit-refresh-needed");
            this.f24519E.P(this.f24437F);
            N3.f24523d = true;
            if (!c.this.f24421s.c(this.f24519E)) {
                c.this.i().b(this.f24519E, N3, new a());
            } else {
                c.this.i().a(this.f24519E, N3);
            }
        }
    }

    /* loaded from: classes.dex */
    private class f<T> extends o<T> {

        /* renamed from: F, reason: collision with root package name */
        p<?> f24441F;

        /* loaded from: classes.dex */
        class a implements a.b {
            a() {
            }

            @Override // com.android.volley.a.b
            public void a() {
                f fVar = f.this;
                c.this.y(fVar.f24519E, fVar.f24441F, true);
            }
        }

        f(Request<T> request, p<?> pVar) {
            super(request);
            this.f24441F = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f24415m != null) {
                c.this.f24415m.e(this.f24519E.q(), this.f24441F.f24521b, new a());
            } else {
                c.this.h().d(this.f24519E.q(), this.f24441F.f24521b);
                c.this.y(this.f24519E, this.f24441F, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g<T> extends o<T> {

        /* loaded from: classes.dex */
        class a implements a.InterfaceC0208a {
            a() {
            }

            @Override // com.android.volley.a.InterfaceC0208a
            public void a(e.a aVar) {
                g gVar = g.this;
                c.this.A(aVar, gVar.f24519E);
            }
        }

        g(Request<T> request) {
            super(request);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f24519E.I()) {
                this.f24519E.m("cache-discard-canceled");
                return;
            }
            this.f24519E.e("cache-queue-take");
            if (c.this.f24415m != null) {
                c.this.f24415m.b(this.f24519E.q(), new a());
            } else {
                c.this.A(c.this.h().a(this.f24519E.q()), this.f24519E);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract ExecutorService a(BlockingQueue<Runnable> blockingQueue);

        public abstract ExecutorService b(BlockingQueue<Runnable> blockingQueue);

        public abstract ScheduledExecutorService c();
    }

    /* loaded from: classes.dex */
    private class i<T> extends o<T> {

        /* renamed from: F, reason: collision with root package name */
        com.android.volley.l f24446F;

        i(Request<T> request, com.android.volley.l lVar) {
            super(request);
            this.f24446F = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p<T> N3 = this.f24519E.N(this.f24446F);
            this.f24519E.e("network-parse-complete");
            if (!this.f24519E.Y() || N3.f24521b == null) {
                c.this.y(this.f24519E, N3, false);
            } else if (c.this.f24415m != null) {
                c.this.f24417o.execute(new f(this.f24519E, N3));
            } else {
                c.this.f24419q.execute(new f(this.f24519E, N3));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class j<T> extends o<T> {

        /* loaded from: classes.dex */
        class a implements b.InterfaceC0209b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f24449a;

            a(long j4) {
                this.f24449a = j4;
            }

            @Override // com.android.volley.b.InterfaceC0209b
            public void a(VolleyError volleyError) {
                volleyError.b(SystemClock.elapsedRealtime() - this.f24449a);
                ExecutorService executorService = c.this.f24419q;
                j jVar = j.this;
                executorService.execute(new k(jVar.f24519E, volleyError));
            }

            @Override // com.android.volley.b.InterfaceC0209b
            public void b(com.android.volley.l lVar) {
                j.this.f24519E.e("network-http-complete");
                if (!lVar.f24497e || !j.this.f24519E.H()) {
                    ExecutorService executorService = c.this.f24419q;
                    j jVar = j.this;
                    executorService.execute(new i(jVar.f24519E, lVar));
                } else {
                    j.this.f24519E.m("not-modified");
                    j.this.f24519E.K();
                }
            }
        }

        j(Request<T> request) {
            super(request);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f24519E.I()) {
                this.f24519E.m("network-discard-cancelled");
                this.f24519E.K();
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f24519E.e("network-queue-take");
                c.this.f24416n.e(this.f24519E, new a(elapsedRealtime));
            }
        }
    }

    /* loaded from: classes.dex */
    private class k<T> extends o<T> {

        /* renamed from: F, reason: collision with root package name */
        VolleyError f24451F;

        k(Request<T> request, VolleyError volleyError) {
            super(request);
            this.f24451F = volleyError;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.i().c(this.f24519E, this.f24519E.M(this.f24451F));
            this.f24519E.K();
        }
    }

    /* loaded from: classes.dex */
    private static class l implements com.android.volley.e {
        private l() {
        }

        @Override // com.android.volley.e
        public e.a a(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.e
        public void b() {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.e
        public void c(String str, boolean z3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.e
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.e
        public void d(String str, e.a aVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.e
        public void e(String str) {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ l(a aVar) {
            this();
        }
    }

    /* synthetic */ c(com.android.volley.e eVar, com.android.volley.b bVar, com.android.volley.a aVar, q qVar, h hVar, a aVar2) {
        this(eVar, bVar, aVar, qVar, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(e.a aVar, Request<?> request) {
        if (aVar == null) {
            request.e("cache-miss");
            if (!this.f24421s.c(request)) {
                n(request);
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (aVar.b(currentTimeMillis)) {
            request.e("cache-hit-expired");
            request.P(aVar);
            if (!this.f24421s.c(request)) {
                n(request);
                return;
            }
            return;
        }
        this.f24419q.execute(new e(request, aVar, currentTimeMillis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        ArrayList arrayList;
        synchronized (this.f24424v) {
            arrayList = new ArrayList(this.f24422t);
            this.f24422t.clear();
            this.f24423u = true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d((Request) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(Request<?> request, p<?> pVar, boolean z3) {
        if (z3) {
            request.e("network-cache-written");
        }
        request.J();
        i().a(request, pVar);
        request.L(pVar);
    }

    private static PriorityBlockingQueue<Runnable> z() {
        return new PriorityBlockingQueue<>(11, new C0211c());
    }

    @Override // com.android.volley.n
    <T> void d(Request<T> request) {
        if (!this.f24423u) {
            synchronized (this.f24424v) {
                try {
                    if (!this.f24423u) {
                        this.f24422t.add(request);
                        return;
                    }
                } finally {
                }
            }
        }
        if (request.Y()) {
            if (this.f24415m != null) {
                this.f24417o.execute(new g(request));
                return;
            } else {
                this.f24419q.execute(new g(request));
                return;
            }
        }
        n(request);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.android.volley.n
    public <T> void n(Request<T> request) {
        this.f24417o.execute(new j(request));
    }

    @Override // com.android.volley.n
    public void o() {
        p();
        this.f24417o = this.f24420r.b(z());
        this.f24419q = this.f24420r.a(z());
        this.f24418p = this.f24420r.c();
        this.f24416n.f(this.f24419q);
        this.f24416n.g(this.f24417o);
        this.f24416n.h(this.f24418p);
        if (this.f24415m != null) {
            this.f24417o.execute(new a());
        } else {
            this.f24419q.execute(new b());
        }
    }

    @Override // com.android.volley.n
    public void p() {
        ExecutorService executorService = this.f24417o;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f24417o = null;
        }
        ExecutorService executorService2 = this.f24419q;
        if (executorService2 != null) {
            executorService2.shutdownNow();
            this.f24419q = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.f24418p;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f24418p = null;
        }
    }

    private c(com.android.volley.e eVar, com.android.volley.b bVar, @P com.android.volley.a aVar, q qVar, h hVar) {
        super(eVar, bVar, 0, qVar);
        this.f24421s = new t(this);
        this.f24422t = new ArrayList();
        this.f24423u = false;
        this.f24424v = new Object[0];
        this.f24415m = aVar;
        this.f24416n = bVar;
        this.f24420r = hVar;
    }
}
