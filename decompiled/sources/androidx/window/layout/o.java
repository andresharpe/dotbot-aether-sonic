package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.core.util.InterfaceC0764e;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.H0;

/* loaded from: classes.dex */
public final class o implements w {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final WindowLayoutComponent f20851a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final ReentrantLock f20852b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    @androidx.annotation.B("lock")
    private final Map<Activity, a> f20853c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    @androidx.annotation.B("lock")
    private final Map<InterfaceC0764e<B>, Activity> f20854d;

    @SuppressLint({"NewApi"})
    /* loaded from: classes.dex */
    private static final class a implements Consumer<WindowLayoutInfo> {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final Activity f20855E;

        /* renamed from: F, reason: collision with root package name */
        @l3.d
        private final ReentrantLock f20856F;

        /* renamed from: G, reason: collision with root package name */
        @l3.e
        @androidx.annotation.B("lock")
        private B f20857G;

        /* renamed from: H, reason: collision with root package name */
        @l3.d
        @androidx.annotation.B("lock")
        private final Set<InterfaceC0764e<B>> f20858H;

        public a(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "activity");
            this.f20855E = activity;
            this.f20856F = new ReentrantLock();
            this.f20858H = new LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(@l3.d WindowLayoutInfo value) {
            kotlin.jvm.internal.F.p(value, "value");
            ReentrantLock reentrantLock = this.f20856F;
            reentrantLock.lock();
            try {
                this.f20857G = p.f20859a.b(this.f20855E, value);
                Iterator<T> it = this.f20858H.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0764e) it.next()).accept(this.f20857G);
                }
                H0 h02 = H0.f51801a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final void b(@l3.d InterfaceC0764e<B> listener) {
            kotlin.jvm.internal.F.p(listener, "listener");
            ReentrantLock reentrantLock = this.f20856F;
            reentrantLock.lock();
            try {
                B b4 = this.f20857G;
                if (b4 != null) {
                    listener.accept(b4);
                }
                this.f20858H.add(listener);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean c() {
            return this.f20858H.isEmpty();
        }

        public final void d(@l3.d InterfaceC0764e<B> listener) {
            kotlin.jvm.internal.F.p(listener, "listener");
            ReentrantLock reentrantLock = this.f20856F;
            reentrantLock.lock();
            try {
                this.f20858H.remove(listener);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public o(@l3.d WindowLayoutComponent component) {
        kotlin.jvm.internal.F.p(component, "component");
        this.f20851a = component;
        this.f20852b = new ReentrantLock();
        this.f20853c = new LinkedHashMap();
        this.f20854d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.w
    public void a(@l3.d InterfaceC0764e<B> callback) {
        kotlin.jvm.internal.F.p(callback, "callback");
        ReentrantLock reentrantLock = this.f20852b;
        reentrantLock.lock();
        try {
            Activity activity = this.f20854d.get(callback);
            if (activity == null) {
                reentrantLock.unlock();
                return;
            }
            a aVar = this.f20853c.get(activity);
            if (aVar == null) {
                reentrantLock.unlock();
                return;
            }
            aVar.d(callback);
            if (aVar.c()) {
                this.f20851a.removeWindowLayoutInfoListener(aVar);
            }
            H0 h02 = H0.f51801a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.window.layout.w
    public void b(@l3.d Activity activity, @l3.d Executor executor, @l3.d InterfaceC0764e<B> callback) {
        H0 h02;
        kotlin.jvm.internal.F.p(activity, "activity");
        kotlin.jvm.internal.F.p(executor, "executor");
        kotlin.jvm.internal.F.p(callback, "callback");
        ReentrantLock reentrantLock = this.f20852b;
        reentrantLock.lock();
        try {
            a aVar = this.f20853c.get(activity);
            if (aVar == null) {
                h02 = null;
            } else {
                aVar.b(callback);
                this.f20854d.put(callback, activity);
                h02 = H0.f51801a;
            }
            if (h02 == null) {
                a aVar2 = new a(activity);
                this.f20853c.put(activity, aVar2);
                this.f20854d.put(callback, activity);
                aVar2.b(callback);
                this.f20851a.addWindowLayoutInfoListener(activity, aVar2);
            }
            H0 h03 = H0.f51801a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
