package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.W;
import androidx.collection.l;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    private static final long f14212g = 10;

    /* renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<a> f14213h = new ThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    private c f14217d;

    /* renamed from: a, reason: collision with root package name */
    private final l<b, Long> f14214a = new l<>();

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f14215b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final C0124a f14216c = new C0124a();

    /* renamed from: e, reason: collision with root package name */
    long f14218e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14219f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.dynamicanimation.animation.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0124a {
        C0124a() {
        }

        void a() {
            a.this.f14218e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f14218e);
            if (a.this.f14215b.size() > 0) {
                a.this.f().a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(long j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final C0124a f14221a;

        c(C0124a c0124a) {
            this.f14221a = c0124a;
        }

        abstract void a();
    }

    /* loaded from: classes.dex */
    private static class d extends c {

        /* renamed from: b, reason: collision with root package name */
        private final Runnable f14222b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f14223c;

        /* renamed from: d, reason: collision with root package name */
        long f14224d;

        /* renamed from: androidx.dynamicanimation.animation.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0125a implements Runnable {
            RunnableC0125a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f14224d = SystemClock.uptimeMillis();
                d.this.f14221a.a();
            }
        }

        d(C0124a c0124a) {
            super(c0124a);
            this.f14224d = -1L;
            this.f14222b = new RunnableC0125a();
            this.f14223c = new Handler(Looper.myLooper());
        }

        @Override // androidx.dynamicanimation.animation.a.c
        void a() {
            this.f14223c.postDelayed(this.f14222b, Math.max(a.f14212g - (SystemClock.uptimeMillis() - this.f14224d), 0L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(16)
    /* loaded from: classes.dex */
    public static class e extends c {

        /* renamed from: b, reason: collision with root package name */
        private final Choreographer f14226b;

        /* renamed from: c, reason: collision with root package name */
        private final Choreographer.FrameCallback f14227c;

        /* renamed from: androidx.dynamicanimation.animation.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class ChoreographerFrameCallbackC0126a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0126a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j4) {
                e.this.f14221a.a();
            }
        }

        e(C0124a c0124a) {
            super(c0124a);
            this.f14226b = Choreographer.getInstance();
            this.f14227c = new ChoreographerFrameCallbackC0126a();
        }

        @Override // androidx.dynamicanimation.animation.a.c
        void a() {
            this.f14226b.postFrameCallback(this.f14227c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f14219f) {
            for (int size = this.f14215b.size() - 1; size >= 0; size--) {
                if (this.f14215b.get(size) == null) {
                    this.f14215b.remove(size);
                }
            }
            this.f14219f = false;
        }
    }

    public static long d() {
        ThreadLocal<a> threadLocal = f14213h;
        if (threadLocal.get() == null) {
            return 0L;
        }
        return threadLocal.get().f14218e;
    }

    public static a e() {
        ThreadLocal<a> threadLocal = f14213h;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    private boolean g(b bVar, long j4) {
        Long l4 = this.f14214a.get(bVar);
        if (l4 == null) {
            return true;
        }
        if (l4.longValue() < j4) {
            this.f14214a.remove(bVar);
            return true;
        }
        return false;
    }

    public void a(b bVar, long j4) {
        if (this.f14215b.size() == 0) {
            f().a();
        }
        if (!this.f14215b.contains(bVar)) {
            this.f14215b.add(bVar);
        }
        if (j4 > 0) {
            this.f14214a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j4));
        }
    }

    void c(long j4) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i4 = 0; i4 < this.f14215b.size(); i4++) {
            b bVar = this.f14215b.get(i4);
            if (bVar != null && g(bVar, uptimeMillis)) {
                bVar.a(j4);
            }
        }
        b();
    }

    c f() {
        if (this.f14217d == null) {
            this.f14217d = new e(this.f14216c);
        }
        return this.f14217d;
    }

    public void h(b bVar) {
        this.f14214a.remove(bVar);
        int indexOf = this.f14215b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f14215b.set(indexOf, null);
            this.f14219f = true;
        }
    }

    public void i(c cVar) {
        this.f14217d = cVar;
    }
}
