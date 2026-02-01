package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.os.OperationCanceledException;
import androidx.core.util.K;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class a<D> extends c<D> {

    /* renamed from: p, reason: collision with root package name */
    static final String f15786p = "AsyncTaskLoader";

    /* renamed from: q, reason: collision with root package name */
    static final boolean f15787q = false;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f15788j;

    /* renamed from: k, reason: collision with root package name */
    volatile a<D>.RunnableC0147a f15789k;

    /* renamed from: l, reason: collision with root package name */
    volatile a<D>.RunnableC0147a f15790l;

    /* renamed from: m, reason: collision with root package name */
    long f15791m;

    /* renamed from: n, reason: collision with root package name */
    long f15792n;

    /* renamed from: o, reason: collision with root package name */
    Handler f15793o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.loader.content.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class RunnableC0147a extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* renamed from: U, reason: collision with root package name */
        private final CountDownLatch f15794U = new CountDownLatch(1);

        /* renamed from: V, reason: collision with root package name */
        boolean f15795V;

        RunnableC0147a() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void m(D d4) {
            try {
                a.this.E(this, d4);
            } finally {
                this.f15794U.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void n(D d4) {
            try {
                a.this.F(this, d4);
            } finally {
                this.f15794U.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15795V = false;
            a.this.G();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.loader.content.ModernAsyncTask
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.K();
            } catch (OperationCanceledException e4) {
                if (k()) {
                    return null;
                }
                throw e4;
            }
        }

        public void v() {
            try {
                this.f15794U.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public a(@N Context context) {
        this(context, ModernAsyncTask.f15769P);
    }

    public void D() {
    }

    void E(a<D>.RunnableC0147a runnableC0147a, D d4) {
        J(d4);
        if (this.f15790l == runnableC0147a) {
            x();
            this.f15792n = SystemClock.uptimeMillis();
            this.f15790l = null;
            e();
            G();
        }
    }

    void F(a<D>.RunnableC0147a runnableC0147a, D d4) {
        if (this.f15789k != runnableC0147a) {
            E(runnableC0147a, d4);
            return;
        }
        if (k()) {
            J(d4);
            return;
        }
        c();
        this.f15792n = SystemClock.uptimeMillis();
        this.f15789k = null;
        f(d4);
    }

    void G() {
        if (this.f15790l == null && this.f15789k != null) {
            if (this.f15789k.f15795V) {
                this.f15789k.f15795V = false;
                this.f15793o.removeCallbacks(this.f15789k);
            }
            if (this.f15791m > 0 && SystemClock.uptimeMillis() < this.f15792n + this.f15791m) {
                this.f15789k.f15795V = true;
                this.f15793o.postAtTime(this.f15789k, this.f15792n + this.f15791m);
            } else {
                this.f15789k.e(this.f15788j, null);
            }
        }
    }

    public boolean H() {
        if (this.f15790l != null) {
            return true;
        }
        return false;
    }

    @P
    public abstract D I();

    public void J(@P D d4) {
    }

    @P
    protected D K() {
        return I();
    }

    public void L(long j4) {
        this.f15791m = j4;
        if (j4 != 0) {
            this.f15793o = new Handler();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void M() {
        a<D>.RunnableC0147a runnableC0147a = this.f15789k;
        if (runnableC0147a != null) {
            runnableC0147a.v();
        }
    }

    @Override // androidx.loader.content.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f15789k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f15789k);
            printWriter.print(" waiting=");
            printWriter.println(this.f15789k.f15795V);
        }
        if (this.f15790l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f15790l);
            printWriter.print(" waiting=");
            printWriter.println(this.f15790l.f15795V);
        }
        if (this.f15791m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            K.c(this.f15791m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            K.b(this.f15792n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // androidx.loader.content.c
    protected boolean o() {
        if (this.f15789k == null) {
            return false;
        }
        if (!this.f15809e) {
            this.f15812h = true;
        }
        if (this.f15790l != null) {
            if (this.f15789k.f15795V) {
                this.f15789k.f15795V = false;
                this.f15793o.removeCallbacks(this.f15789k);
            }
            this.f15789k = null;
            return false;
        }
        if (this.f15789k.f15795V) {
            this.f15789k.f15795V = false;
            this.f15793o.removeCallbacks(this.f15789k);
            this.f15789k = null;
            return false;
        }
        boolean a4 = this.f15789k.a(false);
        if (a4) {
            this.f15790l = this.f15789k;
            D();
        }
        this.f15789k = null;
        return a4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.loader.content.c
    public void q() {
        super.q();
        b();
        this.f15789k = new RunnableC0147a();
        G();
    }

    private a(@N Context context, @N Executor executor) {
        super(context);
        this.f15792n = -10000L;
        this.f15788j = executor;
    }
}
