package androidx.window.embedding;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.B;
import androidx.annotation.i0;
import androidx.core.util.InterfaceC0764e;
import androidx.window.embedding.k;
import androidx.window.embedding.l;
import androidx.window.embedding.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.H0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@androidx.window.core.d
/* loaded from: classes.dex */
public final class p implements j {

    /* renamed from: f, reason: collision with root package name */
    @l3.e
    private static volatile p f20775f = null;

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private static final String f20777h = "EmbeddingBackend";

    /* renamed from: a, reason: collision with root package name */
    @i0
    @l3.e
    @B("globalLock")
    private l f20778a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final CopyOnWriteArrayList<c> f20779b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final b f20780c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final CopyOnWriteArraySet<m> f20781d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    public static final a f20774e = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private static final ReentrantLock f20776g = new ReentrantLock();

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private final l b() {
            k kVar = null;
            try {
                k.a aVar = k.f20767c;
                if (c(aVar.b()) && aVar.c()) {
                    kVar = new k();
                }
            } catch (Throwable th) {
                Log.d(p.f20777h, F.C("Failed to load embedding extension: ", th));
            }
            if (kVar == null) {
                Log.d(p.f20777h, "No supported embedding extension found");
            }
            return kVar;
        }

        @l3.d
        public final p a() {
            if (p.f20775f == null) {
                ReentrantLock reentrantLock = p.f20776g;
                reentrantLock.lock();
                try {
                    if (p.f20775f == null) {
                        p.f20775f = new p(p.f20774e.b());
                    }
                    H0 h02 = H0.f51801a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            p pVar = p.f20775f;
            F.m(pVar);
            return pVar;
        }

        @i0
        public final boolean c(@l3.e Integer num) {
            if (num == null || num.intValue() < 1) {
                return false;
            }
            return true;
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public final class b implements l.a {

        /* renamed from: a, reason: collision with root package name */
        @l3.e
        private List<t> f20782a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f20783b;

        public b(p this$0) {
            F.p(this$0, "this$0");
            this.f20783b = this$0;
        }

        @Override // androidx.window.embedding.l.a
        public void a(@l3.d List<t> splitInfo) {
            F.p(splitInfo, "splitInfo");
            this.f20782a = splitInfo;
            Iterator<c> it = this.f20783b.l().iterator();
            while (it.hasNext()) {
                it.next().b(splitInfo);
            }
        }

        @l3.e
        public final List<t> b() {
            return this.f20782a;
        }

        public final void c(@l3.e List<t> list) {
            this.f20782a = list;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final Activity f20784a;

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        private final Executor f20785b;

        /* renamed from: c, reason: collision with root package name */
        @l3.d
        private final InterfaceC0764e<List<t>> f20786c;

        /* renamed from: d, reason: collision with root package name */
        @l3.e
        private List<t> f20787d;

        public c(@l3.d Activity activity, @l3.d Executor executor, @l3.d InterfaceC0764e<List<t>> callback) {
            F.p(activity, "activity");
            F.p(executor, "executor");
            F.p(callback, "callback");
            this.f20784a = activity;
            this.f20785b = executor;
            this.f20786c = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c this$0, List splitsWithActivity) {
            F.p(this$0, "this$0");
            F.p(splitsWithActivity, "$splitsWithActivity");
            this$0.f20786c.accept(splitsWithActivity);
        }

        public final void b(@l3.d List<t> splitInfoList) {
            F.p(splitInfoList, "splitInfoList");
            final ArrayList arrayList = new ArrayList();
            for (Object obj : splitInfoList) {
                if (((t) obj).a(this.f20784a)) {
                    arrayList.add(obj);
                }
            }
            if (F.g(arrayList, this.f20787d)) {
                return;
            }
            this.f20787d = arrayList;
            this.f20785b.execute(new Runnable() { // from class: androidx.window.embedding.q
                @Override // java.lang.Runnable
                public final void run() {
                    p.c.c(p.c.this, arrayList);
                }
            });
        }

        @l3.d
        public final InterfaceC0764e<List<t>> d() {
            return this.f20786c;
        }
    }

    @i0
    public p(@l3.e l lVar) {
        this.f20778a = lVar;
        b bVar = new b(this);
        this.f20780c = bVar;
        this.f20779b = new CopyOnWriteArrayList<>();
        l lVar2 = this.f20778a;
        if (lVar2 != null) {
            lVar2.b(bVar);
        }
        this.f20781d = new CopyOnWriteArraySet<>();
    }

    @i0
    public static /* synthetic */ void m() {
    }

    @Override // androidx.window.embedding.j
    public void a(@l3.d Set<? extends m> rules) {
        F.p(rules, "rules");
        this.f20781d.clear();
        this.f20781d.addAll(rules);
        l lVar = this.f20778a;
        if (lVar != null) {
            lVar.a(this.f20781d);
        }
    }

    @Override // androidx.window.embedding.j
    @l3.d
    public Set<m> b() {
        return this.f20781d;
    }

    @Override // androidx.window.embedding.j
    public void c(@l3.d m rule) {
        F.p(rule, "rule");
        if (!this.f20781d.contains(rule)) {
            this.f20781d.add(rule);
            l lVar = this.f20778a;
            if (lVar != null) {
                lVar.a(this.f20781d);
            }
        }
    }

    @Override // androidx.window.embedding.j
    public void d(@l3.d InterfaceC0764e<List<t>> consumer) {
        F.p(consumer, "consumer");
        ReentrantLock reentrantLock = f20776g;
        reentrantLock.lock();
        try {
            Iterator<c> it = l().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c next = it.next();
                if (F.g(next.d(), consumer)) {
                    l().remove(next);
                    break;
                }
            }
            H0 h02 = H0.f51801a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.window.embedding.j
    public boolean e() {
        if (this.f20778a != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.window.embedding.j
    public void f(@l3.d m rule) {
        F.p(rule, "rule");
        if (this.f20781d.contains(rule)) {
            this.f20781d.remove(rule);
            l lVar = this.f20778a;
            if (lVar != null) {
                lVar.a(this.f20781d);
            }
        }
    }

    @Override // androidx.window.embedding.j
    public void g(@l3.d Activity activity, @l3.d Executor executor, @l3.d InterfaceC0764e<List<t>> callback) {
        List<t> H3;
        List<t> H4;
        F.p(activity, "activity");
        F.p(executor, "executor");
        F.p(callback, "callback");
        ReentrantLock reentrantLock = f20776g;
        reentrantLock.lock();
        try {
            if (k() == null) {
                Log.v(f20777h, "Extension not loaded, skipping callback registration.");
                H4 = CollectionsKt__CollectionsKt.H();
                callback.accept(H4);
                return;
            }
            c cVar = new c(activity, executor, callback);
            l().add(cVar);
            if (this.f20780c.b() == null) {
                H3 = CollectionsKt__CollectionsKt.H();
                cVar.b(H3);
            } else {
                List<t> b4 = this.f20780c.b();
                F.m(b4);
                cVar.b(b4);
            }
            H0 h02 = H0.f51801a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @l3.e
    public final l k() {
        return this.f20778a;
    }

    @l3.d
    public final CopyOnWriteArrayList<c> l() {
        return this.f20779b;
    }

    public final void n(@l3.e l lVar) {
        this.f20778a = lVar;
    }
}
