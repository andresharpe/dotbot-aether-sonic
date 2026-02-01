package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.B;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes.dex */
public class j {

    /* renamed from: i, reason: collision with root package name */
    private static final int f12830i = 1;

    /* renamed from: j, reason: collision with root package name */
    private static final int f12831j = 0;

    /* renamed from: b, reason: collision with root package name */
    @B("mLock")
    private HandlerThread f12833b;

    /* renamed from: c, reason: collision with root package name */
    @B("mLock")
    private Handler f12834c;

    /* renamed from: f, reason: collision with root package name */
    private final int f12837f;

    /* renamed from: g, reason: collision with root package name */
    private final int f12838g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12839h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f12832a = new Object();

    /* renamed from: e, reason: collision with root package name */
    private Handler.Callback f12836e = new a();

    /* renamed from: d, reason: collision with root package name */
    @B("mLock")
    private int f12835d = 0;

    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 != 0) {
                if (i4 != 1) {
                    return true;
                }
                j.this.d((Runnable) message.obj);
                return true;
            }
            j.this.c();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Callable f12841E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Handler f12842F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ d f12843G;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ Object f12845E;

            a(Object obj) {
                this.f12845E = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f12843G.a(this.f12845E);
            }
        }

        b(Callable callable, Handler handler, d dVar) {
            this.f12841E = callable;
            this.f12842F = handler;
            this.f12843G = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f12841E.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f12842F.post(new a(obj));
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ AtomicReference f12847E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Callable f12848F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ ReentrantLock f12849G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f12850H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ Condition f12851I;

        c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f12847E = atomicReference;
            this.f12848F = callable;
            this.f12849G = reentrantLock;
            this.f12850H = atomicBoolean;
            this.f12851I = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f12847E.set(this.f12848F.call());
            } catch (Exception unused) {
            }
            this.f12849G.lock();
            try {
                this.f12850H.set(false);
                this.f12851I.signal();
            } finally {
                this.f12849G.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        void a(T t3);
    }

    public j(String str, int i4, int i5) {
        this.f12839h = str;
        this.f12838g = i4;
        this.f12837f = i5;
    }

    private void e(Runnable runnable) {
        synchronized (this.f12832a) {
            try {
                if (this.f12833b == null) {
                    HandlerThread handlerThread = new HandlerThread(this.f12839h, this.f12838g);
                    this.f12833b = handlerThread;
                    handlerThread.start();
                    this.f12834c = new Handler(this.f12833b.getLooper(), this.f12836e);
                    this.f12835d++;
                }
                this.f12834c.removeMessages(0);
                Handler handler = this.f12834c;
                handler.sendMessage(handler.obtainMessage(1, runnable));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @i0
    public int a() {
        int i4;
        synchronized (this.f12832a) {
            i4 = this.f12835d;
        }
        return i4;
    }

    @i0
    public boolean b() {
        boolean z3;
        synchronized (this.f12832a) {
            if (this.f12833b != null) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    void c() {
        synchronized (this.f12832a) {
            try {
                if (this.f12834c.hasMessages(1)) {
                    return;
                }
                this.f12833b.quit();
                this.f12833b = null;
                this.f12834c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d(Runnable runnable) {
        runnable.run();
        synchronized (this.f12832a) {
            this.f12834c.removeMessages(0);
            Handler handler = this.f12834c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f12837f);
        }
    }

    public <T> void f(Callable<T> callable, d<T> dVar) {
        e(new b(callable, androidx.core.provider.b.a(), dVar));
    }

    public <T> T g(Callable<T> callable, int i4) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        e(new c(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i4);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}
