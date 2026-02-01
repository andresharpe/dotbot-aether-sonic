package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.i0;
import androidx.core.util.InterfaceC0764e;
import androidx.window.layout.n;
import androidx.window.layout.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.H0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes.dex */
public final class u implements w {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f20895d = false;

    /* renamed from: e, reason: collision with root package name */
    @l3.e
    private static volatile u f20896e = null;

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private static final String f20898g = "WindowServer";

    /* renamed from: a, reason: collision with root package name */
    @i0
    @l3.e
    @androidx.annotation.B("globalLock")
    private n f20899a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final CopyOnWriteArrayList<c> f20900b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final a f20894c = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private static final ReentrantLock f20897f = new ReentrantLock();

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final u a(@l3.d Context context) {
            kotlin.jvm.internal.F.p(context, "context");
            if (u.f20896e == null) {
                ReentrantLock reentrantLock = u.f20897f;
                reentrantLock.lock();
                try {
                    if (u.f20896e == null) {
                        u.f20896e = new u(u.f20894c.b(context));
                    }
                    H0 h02 = H0.f51801a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            u uVar = u.f20896e;
            kotlin.jvm.internal.F.m(uVar);
            return uVar;
        }

        @l3.e
        public final n b(@l3.d Context context) {
            kotlin.jvm.internal.F.p(context, "context");
            try {
                if (!c(SidecarCompat.f20826f.c())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (!sidecarCompat.d()) {
                    return null;
                }
                return sidecarCompat;
            } catch (Throwable unused) {
                return null;
            }
        }

        @i0
        public final boolean c(@l3.e androidx.window.core.h hVar) {
            if (hVar == null || hVar.compareTo(androidx.window.core.h.f20742J.c()) < 0) {
                return false;
            }
            return true;
        }

        @i0
        public final void d() {
            u.f20896e = null;
        }

        private a() {
        }
    }

    @i0
    /* loaded from: classes.dex */
    public final class b implements n.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f20901a;

        public b(u this$0) {
            kotlin.jvm.internal.F.p(this$0, "this$0");
            this.f20901a = this$0;
        }

        @Override // androidx.window.layout.n.a
        @SuppressLint({"SyntheticAccessor"})
        public void a(@l3.d Activity activity, @l3.d B newLayout) {
            kotlin.jvm.internal.F.p(activity, "activity");
            kotlin.jvm.internal.F.p(newLayout, "newLayout");
            Iterator<c> it = this.f20901a.h().iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (kotlin.jvm.internal.F.g(next.d(), activity)) {
                    next.b(newLayout);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final Activity f20902a;

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        private final Executor f20903b;

        /* renamed from: c, reason: collision with root package name */
        @l3.d
        private final InterfaceC0764e<B> f20904c;

        /* renamed from: d, reason: collision with root package name */
        @l3.e
        private B f20905d;

        public c(@l3.d Activity activity, @l3.d Executor executor, @l3.d InterfaceC0764e<B> callback) {
            kotlin.jvm.internal.F.p(activity, "activity");
            kotlin.jvm.internal.F.p(executor, "executor");
            kotlin.jvm.internal.F.p(callback, "callback");
            this.f20902a = activity;
            this.f20903b = executor;
            this.f20904c = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c this$0, B newLayoutInfo) {
            kotlin.jvm.internal.F.p(this$0, "this$0");
            kotlin.jvm.internal.F.p(newLayoutInfo, "$newLayoutInfo");
            this$0.f20904c.accept(newLayoutInfo);
        }

        public final void b(@l3.d final B newLayoutInfo) {
            kotlin.jvm.internal.F.p(newLayoutInfo, "newLayoutInfo");
            this.f20905d = newLayoutInfo;
            this.f20903b.execute(new Runnable() { // from class: androidx.window.layout.v
                @Override // java.lang.Runnable
                public final void run() {
                    u.c.c(u.c.this, newLayoutInfo);
                }
            });
        }

        @l3.d
        public final Activity d() {
            return this.f20902a;
        }

        @l3.d
        public final InterfaceC0764e<B> e() {
            return this.f20904c;
        }

        @l3.e
        public final B f() {
            return this.f20905d;
        }

        public final void g(@l3.e B b4) {
            this.f20905d = b4;
        }
    }

    @i0
    public u(@l3.e n nVar) {
        this.f20899a = nVar;
        n nVar2 = this.f20899a;
        if (nVar2 != null) {
            nVar2.b(new b(this));
        }
    }

    @androidx.annotation.B("sLock")
    private final void f(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f20900b;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.F.g(((c) it.next()).d(), activity)) {
                    return;
                }
            }
        }
        n nVar = this.f20899a;
        if (nVar != null) {
            nVar.c(activity);
        }
    }

    @i0
    public static /* synthetic */ void i() {
    }

    private final boolean j(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f20900b;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.F.g(((c) it.next()).d(), activity)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.window.layout.w
    public void a(@l3.d InterfaceC0764e<B> callback) {
        kotlin.jvm.internal.F.p(callback, "callback");
        synchronized (f20897f) {
            try {
                if (g() == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<c> it = h().iterator();
                while (it.hasNext()) {
                    c callbackWrapper = it.next();
                    if (callbackWrapper.e() == callback) {
                        kotlin.jvm.internal.F.o(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                h().removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    f(((c) it2.next()).d());
                }
                H0 h02 = H0.f51801a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.window.layout.w
    public void b(@l3.d Activity activity, @l3.d Executor executor, @l3.d InterfaceC0764e<B> callback) {
        B b4;
        Object obj;
        List H3;
        kotlin.jvm.internal.F.p(activity, "activity");
        kotlin.jvm.internal.F.p(executor, "executor");
        kotlin.jvm.internal.F.p(callback, "callback");
        ReentrantLock reentrantLock = f20897f;
        reentrantLock.lock();
        try {
            n g4 = g();
            if (g4 == null) {
                H3 = CollectionsKt__CollectionsKt.H();
                callback.accept(new B(H3));
                return;
            }
            boolean j4 = j(activity);
            c cVar = new c(activity, executor, callback);
            h().add(cVar);
            if (!j4) {
                g4.a(activity);
            } else {
                Iterator<T> it = h().iterator();
                while (true) {
                    b4 = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (kotlin.jvm.internal.F.g(activity, ((c) obj).d())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                c cVar2 = (c) obj;
                if (cVar2 != null) {
                    b4 = cVar2.f();
                }
                if (b4 != null) {
                    cVar.b(b4);
                }
            }
            H0 h02 = H0.f51801a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @l3.e
    public final n g() {
        return this.f20899a;
    }

    @l3.d
    public final CopyOnWriteArrayList<c> h() {
        return this.f20900b;
    }

    public final void k(@l3.e n nVar) {
        this.f20899a = nVar;
    }
}
