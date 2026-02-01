package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
abstract class ModernAsyncTask<Params, Progress, Result> {

    /* renamed from: J, reason: collision with root package name */
    private static final String f15763J = "AsyncTask";

    /* renamed from: K, reason: collision with root package name */
    private static final int f15764K = 5;

    /* renamed from: L, reason: collision with root package name */
    private static final int f15765L = 128;

    /* renamed from: M, reason: collision with root package name */
    private static final int f15766M = 1;

    /* renamed from: N, reason: collision with root package name */
    private static final ThreadFactory f15767N;

    /* renamed from: O, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f15768O;

    /* renamed from: P, reason: collision with root package name */
    public static final Executor f15769P;

    /* renamed from: Q, reason: collision with root package name */
    private static final int f15770Q = 1;

    /* renamed from: R, reason: collision with root package name */
    private static final int f15771R = 2;

    /* renamed from: S, reason: collision with root package name */
    private static f f15772S;

    /* renamed from: T, reason: collision with root package name */
    private static volatile Executor f15773T;

    /* renamed from: E, reason: collision with root package name */
    private final g<Params, Result> f15774E;

    /* renamed from: F, reason: collision with root package name */
    private final FutureTask<Result> f15775F;

    /* renamed from: G, reason: collision with root package name */
    private volatile Status f15776G = Status.PENDING;

    /* renamed from: H, reason: collision with root package name */
    final AtomicBoolean f15777H = new AtomicBoolean();

    /* renamed from: I, reason: collision with root package name */
    final AtomicBoolean f15778I = new AtomicBoolean();

    /* loaded from: classes.dex */
    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* loaded from: classes.dex */
    static class a implements ThreadFactory {

        /* renamed from: E, reason: collision with root package name */
        private final AtomicInteger f15779E = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f15779E.getAndIncrement());
        }
    }

    /* loaded from: classes.dex */
    class b extends g<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            ModernAsyncTask.this.f15778I.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) ModernAsyncTask.this.b(this.f15785a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                ModernAsyncTask.this.r(get());
            } catch (InterruptedException e4) {
                Log.w(ModernAsyncTask.f15763J, e4);
            } catch (CancellationException unused) {
                ModernAsyncTask.this.r(null);
            } catch (ExecutionException e5) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e5.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15782a;

        static {
            int[] iArr = new int[Status.values().length];
            f15782a = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15782a[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e<Data> {

        /* renamed from: a, reason: collision with root package name */
        final ModernAsyncTask f15783a;

        /* renamed from: b, reason: collision with root package name */
        final Data[] f15784b;

        e(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f15783a = modernAsyncTask;
            this.f15784b = dataArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i4 = message.what;
            if (i4 != 1) {
                if (i4 == 2) {
                    eVar.f15783a.p(eVar.f15784b);
                    return;
                }
                return;
            }
            eVar.f15783a.f(eVar.f15784b[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class g<Params, Result> implements Callable<Result> {

        /* renamed from: a, reason: collision with root package name */
        Params[] f15785a;

        g() {
        }
    }

    static {
        a aVar = new a();
        f15767N = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f15768O = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f15769P = threadPoolExecutor;
        f15773T = threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ModernAsyncTask() {
        b bVar = new b();
        this.f15774E = bVar;
        this.f15775F = new c(bVar);
    }

    public static void d(Runnable runnable) {
        f15773T.execute(runnable);
    }

    private static Handler i() {
        f fVar;
        synchronized (ModernAsyncTask.class) {
            try {
                if (f15772S == null) {
                    f15772S = new f();
                }
                fVar = f15772S;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void t(Executor executor) {
        f15773T = executor;
    }

    public final boolean a(boolean z3) {
        this.f15777H.set(true);
        return this.f15775F.cancel(z3);
    }

    protected abstract Result b(Params... paramsArr);

    public final ModernAsyncTask<Params, Progress, Result> c(Params... paramsArr) {
        return e(f15773T, paramsArr);
    }

    public final ModernAsyncTask<Params, Progress, Result> e(Executor executor, Params... paramsArr) {
        if (this.f15776G != Status.PENDING) {
            int i4 = d.f15782a[this.f15776G.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.f15776G = Status.RUNNING;
        o();
        this.f15774E.f15785a = paramsArr;
        executor.execute(this.f15775F);
        return this;
    }

    void f(Result result) {
        if (k()) {
            m(result);
        } else {
            n(result);
        }
        this.f15776G = Status.FINISHED;
    }

    public final Result g() throws InterruptedException, ExecutionException {
        return this.f15775F.get();
    }

    public final Result h(long j4, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f15775F.get(j4, timeUnit);
    }

    public final Status j() {
        return this.f15776G;
    }

    public final boolean k() {
        return this.f15777H.get();
    }

    protected void l() {
    }

    protected void m(Result result) {
        l();
    }

    protected void n(Result result) {
    }

    protected void o() {
    }

    protected void p(Progress... progressArr) {
    }

    Result q(Result result) {
        i().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void r(Result result) {
        if (!this.f15778I.get()) {
            q(result);
        }
    }

    protected final void s(Progress... progressArr) {
        if (!k()) {
            i().obtainMessage(2, new e(this, progressArr)).sendToTarget();
        }
    }
}
