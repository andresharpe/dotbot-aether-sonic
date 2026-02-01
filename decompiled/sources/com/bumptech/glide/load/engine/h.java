package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.N;
import androidx.core.util.t;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.util.pool.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {

    /* renamed from: k0, reason: collision with root package name */
    private static final String f26059k0 = "DecodeJob";

    /* renamed from: H, reason: collision with root package name */
    private final e f26063H;

    /* renamed from: I, reason: collision with root package name */
    private final t.a<h<?>> f26064I;

    /* renamed from: L, reason: collision with root package name */
    private com.bumptech.glide.d f26067L;

    /* renamed from: M, reason: collision with root package name */
    private com.bumptech.glide.load.c f26068M;

    /* renamed from: N, reason: collision with root package name */
    private Priority f26069N;

    /* renamed from: O, reason: collision with root package name */
    private n f26070O;

    /* renamed from: P, reason: collision with root package name */
    private int f26071P;

    /* renamed from: Q, reason: collision with root package name */
    private int f26072Q;

    /* renamed from: R, reason: collision with root package name */
    private j f26073R;

    /* renamed from: S, reason: collision with root package name */
    private com.bumptech.glide.load.f f26074S;

    /* renamed from: T, reason: collision with root package name */
    private b<R> f26075T;

    /* renamed from: U, reason: collision with root package name */
    private int f26076U;

    /* renamed from: V, reason: collision with root package name */
    private EnumC0231h f26077V;

    /* renamed from: W, reason: collision with root package name */
    private g f26078W;

    /* renamed from: X, reason: collision with root package name */
    private long f26079X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f26080Y;

    /* renamed from: Z, reason: collision with root package name */
    private Object f26081Z;

    /* renamed from: a0, reason: collision with root package name */
    private Thread f26082a0;

    /* renamed from: b0, reason: collision with root package name */
    private com.bumptech.glide.load.c f26083b0;

    /* renamed from: c0, reason: collision with root package name */
    private com.bumptech.glide.load.c f26084c0;

    /* renamed from: d0, reason: collision with root package name */
    private Object f26085d0;

    /* renamed from: e0, reason: collision with root package name */
    private DataSource f26086e0;

    /* renamed from: f0, reason: collision with root package name */
    private com.bumptech.glide.load.data.d<?> f26087f0;

    /* renamed from: g0, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.f f26088g0;

    /* renamed from: h0, reason: collision with root package name */
    private volatile boolean f26089h0;

    /* renamed from: i0, reason: collision with root package name */
    private volatile boolean f26090i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f26091j0;

    /* renamed from: E, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.g<R> f26060E = new com.bumptech.glide.load.engine.g<>();

    /* renamed from: F, reason: collision with root package name */
    private final List<Throwable> f26061F = new ArrayList();

    /* renamed from: G, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f26062G = com.bumptech.glide.util.pool.c.a();

    /* renamed from: J, reason: collision with root package name */
    private final d<?> f26065J = new d<>();

    /* renamed from: K, reason: collision with root package name */
    private final f f26066K = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26092a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f26093b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f26094c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f26094c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26094c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0231h.values().length];
            f26093b = iArr2;
            try {
                iArr2[EnumC0231h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26093b[EnumC0231h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26093b[EnumC0231h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26093b[EnumC0231h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26093b[EnumC0231h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f26092a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26092a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26092a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b<R> {
        void a(GlideException glideException);

        void d(u<R> uVar, DataSource dataSource, boolean z3);

        void e(h<?> hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c<Z> implements i.a<Z> {

        /* renamed from: a, reason: collision with root package name */
        private final DataSource f26095a;

        c(DataSource dataSource) {
            this.f26095a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.i.a
        @N
        public u<Z> a(@N u<Z> uVar) {
            return h.this.z(this.f26095a, uVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d<Z> {

        /* renamed from: a, reason: collision with root package name */
        private com.bumptech.glide.load.c f26097a;

        /* renamed from: b, reason: collision with root package name */
        private com.bumptech.glide.load.h<Z> f26098b;

        /* renamed from: c, reason: collision with root package name */
        private t<Z> f26099c;

        d() {
        }

        void a() {
            this.f26097a = null;
            this.f26098b = null;
            this.f26099c = null;
        }

        void b(e eVar, com.bumptech.glide.load.f fVar) {
            com.bumptech.glide.util.pool.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f26097a, new com.bumptech.glide.load.engine.e(this.f26098b, this.f26099c, fVar));
            } finally {
                this.f26099c.h();
                com.bumptech.glide.util.pool.b.e();
            }
        }

        boolean c() {
            if (this.f26099c != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(com.bumptech.glide.load.c cVar, com.bumptech.glide.load.h<X> hVar, t<X> tVar) {
            this.f26097a = cVar;
            this.f26098b = hVar;
            this.f26099c = tVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        com.bumptech.glide.load.engine.cache.a a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private boolean f26100a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f26101b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f26102c;

        f() {
        }

        private boolean a(boolean z3) {
            if ((this.f26102c || z3 || this.f26101b) && this.f26100a) {
                return true;
            }
            return false;
        }

        synchronized boolean b() {
            this.f26101b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f26102c = true;
            return a(false);
        }

        synchronized boolean d(boolean z3) {
            this.f26100a = true;
            return a(z3);
        }

        synchronized void e() {
            this.f26101b = false;
            this.f26100a = false;
            this.f26102c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.h$h, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0231h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(e eVar, t.a<h<?>> aVar) {
        this.f26063H = eVar;
        this.f26064I = aVar;
    }

    private void B() {
        this.f26066K.e();
        this.f26065J.a();
        this.f26060E.a();
        this.f26089h0 = false;
        this.f26067L = null;
        this.f26068M = null;
        this.f26074S = null;
        this.f26069N = null;
        this.f26070O = null;
        this.f26075T = null;
        this.f26077V = null;
        this.f26088g0 = null;
        this.f26082a0 = null;
        this.f26083b0 = null;
        this.f26085d0 = null;
        this.f26086e0 = null;
        this.f26087f0 = null;
        this.f26079X = 0L;
        this.f26090i0 = false;
        this.f26081Z = null;
        this.f26061F.clear();
        this.f26064I.a(this);
    }

    private void C() {
        this.f26082a0 = Thread.currentThread();
        this.f26079X = com.bumptech.glide.util.h.b();
        boolean z3 = false;
        while (!this.f26090i0 && this.f26088g0 != null && !(z3 = this.f26088g0.a())) {
            this.f26077V = o(this.f26077V);
            this.f26088g0 = n();
            if (this.f26077V == EnumC0231h.SOURCE) {
                e();
                return;
            }
        }
        if ((this.f26077V == EnumC0231h.FINISHED || this.f26090i0) && !z3) {
            w();
        }
    }

    private <Data, ResourceType> u<R> D(Data data, DataSource dataSource, s<Data, ResourceType, R> sVar) throws GlideException {
        com.bumptech.glide.load.f p4 = p(dataSource);
        com.bumptech.glide.load.data.e<Data> l4 = this.f26067L.i().l(data);
        try {
            return sVar.b(l4, p4, this.f26071P, this.f26072Q, new c(dataSource));
        } finally {
            l4.b();
        }
    }

    private void E() {
        int i4 = a.f26092a[this.f26078W.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    m();
                    return;
                }
                throw new IllegalStateException("Unrecognized run reason: " + this.f26078W);
            }
            C();
            return;
        }
        this.f26077V = o(EnumC0231h.INITIALIZE);
        this.f26088g0 = n();
        C();
    }

    private void F() {
        Throwable th;
        this.f26062G.c();
        if (this.f26089h0) {
            if (this.f26061F.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f26061F;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f26089h0 = true;
    }

    private <Data> u<R> k(com.bumptech.glide.load.data.d<?> dVar, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            long b4 = com.bumptech.glide.util.h.b();
            u<R> l4 = l(data, dataSource);
            if (Log.isLoggable(f26059k0, 2)) {
                s("Decoded result " + l4, b4);
            }
            return l4;
        } finally {
            dVar.b();
        }
    }

    private <Data> u<R> l(Data data, DataSource dataSource) throws GlideException {
        return D(data, dataSource, this.f26060E.h(data.getClass()));
    }

    private void m() {
        u<R> uVar;
        if (Log.isLoggable(f26059k0, 2)) {
            t("Retrieved data", this.f26079X, "data: " + this.f26085d0 + ", cache key: " + this.f26083b0 + ", fetcher: " + this.f26087f0);
        }
        try {
            uVar = k(this.f26087f0, this.f26085d0, this.f26086e0);
        } catch (GlideException e4) {
            e4.j(this.f26084c0, this.f26086e0);
            this.f26061F.add(e4);
            uVar = null;
        }
        if (uVar != null) {
            v(uVar, this.f26086e0, this.f26091j0);
        } else {
            C();
        }
    }

    private com.bumptech.glide.load.engine.f n() {
        int i4 = a.f26093b[this.f26077V.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: " + this.f26077V);
                }
                return new y(this.f26060E, this);
            }
            return new com.bumptech.glide.load.engine.c(this.f26060E, this);
        }
        return new v(this.f26060E, this);
    }

    private EnumC0231h o(EnumC0231h enumC0231h) {
        int i4 = a.f26093b[enumC0231h.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3 && i4 != 4) {
                    if (i4 == 5) {
                        if (this.f26073R.b()) {
                            return EnumC0231h.RESOURCE_CACHE;
                        }
                        return o(EnumC0231h.RESOURCE_CACHE);
                    }
                    throw new IllegalArgumentException("Unrecognized stage: " + enumC0231h);
                }
                return EnumC0231h.FINISHED;
            }
            if (this.f26080Y) {
                return EnumC0231h.FINISHED;
            }
            return EnumC0231h.SOURCE;
        }
        if (this.f26073R.a()) {
            return EnumC0231h.DATA_CACHE;
        }
        return o(EnumC0231h.DATA_CACHE);
    }

    @N
    private com.bumptech.glide.load.f p(DataSource dataSource) {
        boolean z3;
        com.bumptech.glide.load.f fVar = this.f26074S;
        if (Build.VERSION.SDK_INT < 26) {
            return fVar;
        }
        if (dataSource != DataSource.RESOURCE_DISK_CACHE && !this.f26060E.w()) {
            z3 = false;
        } else {
            z3 = true;
        }
        com.bumptech.glide.load.e<Boolean> eVar = com.bumptech.glide.load.resource.bitmap.u.f26537k;
        Boolean bool = (Boolean) fVar.c(eVar);
        if (bool != null && (!bool.booleanValue() || z3)) {
            return fVar;
        }
        com.bumptech.glide.load.f fVar2 = new com.bumptech.glide.load.f();
        fVar2.d(this.f26074S);
        fVar2.e(eVar, Boolean.valueOf(z3));
        return fVar2;
    }

    private int q() {
        return this.f26069N.ordinal();
    }

    private void s(String str, long j4) {
        t(str, j4, null);
    }

    private void t(String str, long j4, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(com.bumptech.glide.util.h.a(j4));
        sb.append(", load key: ");
        sb.append(this.f26070O);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v(f26059k0, sb.toString());
    }

    private void u(u<R> uVar, DataSource dataSource, boolean z3) {
        F();
        this.f26075T.d(uVar, dataSource, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void v(u<R> uVar, DataSource dataSource, boolean z3) {
        t tVar;
        if (uVar instanceof q) {
            ((q) uVar).b();
        }
        if (this.f26065J.c()) {
            uVar = t.e(uVar);
            tVar = uVar;
        } else {
            tVar = 0;
        }
        u(uVar, dataSource, z3);
        this.f26077V = EnumC0231h.ENCODE;
        try {
            if (this.f26065J.c()) {
                this.f26065J.b(this.f26063H, this.f26074S);
            }
            x();
        } finally {
            if (tVar != 0) {
                tVar.h();
            }
        }
    }

    private void w() {
        F();
        this.f26075T.a(new GlideException("Failed to load resource", new ArrayList(this.f26061F)));
        y();
    }

    private void x() {
        if (this.f26066K.b()) {
            B();
        }
    }

    private void y() {
        if (this.f26066K.c()) {
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(boolean z3) {
        if (this.f26066K.d(z3)) {
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G() {
        EnumC0231h o4 = o(EnumC0231h.INITIALIZE);
        if (o4 != EnumC0231h.RESOURCE_CACHE && o4 != EnumC0231h.DATA_CACHE) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void b(com.bumptech.glide.load.c cVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.k(cVar, dataSource, dVar.a());
        this.f26061F.add(glideException);
        if (Thread.currentThread() != this.f26082a0) {
            this.f26078W = g.SWITCH_TO_SOURCE_SERVICE;
            this.f26075T.e(this);
        } else {
            C();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void e() {
        this.f26078W = g.SWITCH_TO_SOURCE_SERVICE;
        this.f26075T.e(this);
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void f(com.bumptech.glide.load.c cVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, com.bumptech.glide.load.c cVar2) {
        this.f26083b0 = cVar;
        this.f26085d0 = obj;
        this.f26087f0 = dVar;
        this.f26086e0 = dataSource;
        this.f26084c0 = cVar2;
        boolean z3 = false;
        if (cVar != this.f26060E.c().get(0)) {
            z3 = true;
        }
        this.f26091j0 = z3;
        if (Thread.currentThread() != this.f26082a0) {
            this.f26078W = g.DECODE_DATA;
            this.f26075T.e(this);
        } else {
            com.bumptech.glide.util.pool.b.a("DecodeJob.decodeFromRetrievedData");
            try {
                m();
            } finally {
                com.bumptech.glide.util.pool.b.e();
            }
        }
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @N
    public com.bumptech.glide.util.pool.c g() {
        return this.f26062G;
    }

    public void i() {
        this.f26090i0 = true;
        com.bumptech.glide.load.engine.f fVar = this.f26088g0;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(@N h<?> hVar) {
        int q4 = q() - hVar.q();
        if (q4 == 0) {
            return this.f26076U - hVar.f26076U;
        }
        return q4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h<R> r(com.bumptech.glide.d dVar, Object obj, n nVar, com.bumptech.glide.load.c cVar, int i4, int i5, Class<?> cls, Class<R> cls2, Priority priority, j jVar, Map<Class<?>, com.bumptech.glide.load.i<?>> map, boolean z3, boolean z4, boolean z5, com.bumptech.glide.load.f fVar, b<R> bVar, int i6) {
        this.f26060E.u(dVar, obj, cVar, i4, i5, jVar, cls, cls2, priority, fVar, map, z3, z4, this.f26063H);
        this.f26067L = dVar;
        this.f26068M = cVar;
        this.f26069N = priority;
        this.f26070O = nVar;
        this.f26071P = i4;
        this.f26072Q = i5;
        this.f26073R = jVar;
        this.f26080Y = z5;
        this.f26074S = fVar;
        this.f26075T = bVar;
        this.f26076U = i6;
        this.f26078W = g.INITIALIZE;
        this.f26081Z = obj;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bumptech.glide.util.pool.b.b("DecodeJob#run(model=%s)", this.f26081Z);
        com.bumptech.glide.load.data.d<?> dVar = this.f26087f0;
        try {
            try {
                try {
                    if (this.f26090i0) {
                        w();
                        if (dVar != null) {
                            dVar.b();
                        }
                        com.bumptech.glide.util.pool.b.e();
                        return;
                    }
                    E();
                    if (dVar != null) {
                        dVar.b();
                    }
                    com.bumptech.glide.util.pool.b.e();
                } catch (Throwable th) {
                    if (Log.isLoggable(f26059k0, 3)) {
                        Log.d(f26059k0, "DecodeJob threw unexpectedly, isCancelled: " + this.f26090i0 + ", stage: " + this.f26077V, th);
                    }
                    if (this.f26077V != EnumC0231h.ENCODE) {
                        this.f26061F.add(th);
                        w();
                    }
                    if (!this.f26090i0) {
                        throw th;
                    }
                    throw th;
                }
            } catch (com.bumptech.glide.load.engine.b e4) {
                throw e4;
            }
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            com.bumptech.glide.util.pool.b.e();
            throw th2;
        }
    }

    @N
    <Z> u<Z> z(DataSource dataSource, @N u<Z> uVar) {
        u<Z> uVar2;
        com.bumptech.glide.load.i<Z> iVar;
        EncodeStrategy encodeStrategy;
        com.bumptech.glide.load.c dVar;
        Class<?> cls = uVar.get().getClass();
        com.bumptech.glide.load.h<Z> hVar = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            com.bumptech.glide.load.i<Z> r4 = this.f26060E.r(cls);
            iVar = r4;
            uVar2 = r4.b(this.f26067L, uVar, this.f26071P, this.f26072Q);
        } else {
            uVar2 = uVar;
            iVar = null;
        }
        if (!uVar.equals(uVar2)) {
            uVar.a();
        }
        if (this.f26060E.v(uVar2)) {
            hVar = this.f26060E.n(uVar2);
            encodeStrategy = hVar.b(this.f26074S);
        } else {
            encodeStrategy = EncodeStrategy.NONE;
        }
        com.bumptech.glide.load.h hVar2 = hVar;
        if (this.f26073R.d(!this.f26060E.x(this.f26083b0), dataSource, encodeStrategy)) {
            if (hVar2 != null) {
                int i4 = a.f26094c[encodeStrategy.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        dVar = new w(this.f26060E.b(), this.f26083b0, this.f26068M, this.f26071P, this.f26072Q, iVar, cls, this.f26074S);
                    } else {
                        throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
                    }
                } else {
                    dVar = new com.bumptech.glide.load.engine.d(this.f26083b0, this.f26068M);
                }
                t e4 = t.e(uVar2);
                this.f26065J.d(dVar, hVar2, e4);
                return e4;
            }
            throw new Registry.NoResultEncoderAvailableException(uVar2.get().getClass());
        }
        return uVar2;
    }
}
