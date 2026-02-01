package org.junit.internal.runners.statements;

import java.lang.Thread;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.internal.management.g;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.TestTimedOutException;
import org.junit.runners.model.i;

/* loaded from: classes2.dex */
public class c extends i {

    /* renamed from: a, reason: collision with root package name */
    private final i f55643a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeUnit f55644b;

    /* renamed from: c, reason: collision with root package name */
    private final long f55645c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f55646d;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f55647a;

        /* renamed from: b, reason: collision with root package name */
        private long f55648b;

        /* renamed from: c, reason: collision with root package name */
        private TimeUnit f55649c;

        public c d(i iVar) {
            if (iVar != null) {
                return new c(this, iVar);
            }
            throw new NullPointerException("statement cannot be null");
        }

        public b e(boolean z3) {
            this.f55647a = z3;
            return this;
        }

        public b f(long j4, TimeUnit timeUnit) {
            if (j4 >= 0) {
                if (timeUnit != null) {
                    this.f55648b = j4;
                    this.f55649c = timeUnit;
                    return this;
                }
                throw new NullPointerException("TimeUnit cannot be null");
            }
            throw new IllegalArgumentException("timeout must be non-negative");
        }

        private b() {
            this.f55647a = false;
            this.f55648b = 0L;
            this.f55649c = TimeUnit.SECONDS;
        }
    }

    /* renamed from: org.junit.internal.runners.statements.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private class CallableC0529c implements Callable<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        private final CountDownLatch f55650a;

        private CallableC0529c() {
            this.f55650a = new CountDownLatch(1);
        }

        public void a() throws InterruptedException {
            this.f55650a.await();
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Throwable call() throws Exception {
            try {
                this.f55650a.countDown();
                c.this.f55643a.a();
                return null;
            } catch (Exception e4) {
                throw e4;
            } catch (Throwable th) {
                return th;
            }
        }
    }

    public static b c() {
        return new b();
    }

    private long d(Thread thread) {
        g b4 = org.junit.internal.management.c.b();
        if (b4.a()) {
            try {
                return b4.b(thread.getId());
            } catch (UnsupportedOperationException unused) {
                return 0L;
            }
        }
        return 0L;
    }

    private Exception e(Thread thread) {
        Thread thread2;
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (this.f55646d) {
            thread2 = h(thread);
        } else {
            thread2 = null;
        }
        TestTimedOutException testTimedOutException = new TestTimedOutException(this.f55645c, this.f55644b);
        if (stackTrace != null) {
            testTimedOutException.setStackTrace(stackTrace);
            thread.interrupt();
        }
        if (thread2 != null) {
            Exception exc = new Exception("Appears to be stuck in thread " + thread2.getName());
            exc.setStackTrace(g(thread2));
            return new MultipleFailureException(Arrays.asList(testTimedOutException, exc));
        }
        return testTimedOutException;
    }

    private Throwable f(FutureTask<Throwable> futureTask, Thread thread) {
        try {
            long j4 = this.f55645c;
            if (j4 > 0) {
                return futureTask.get(j4, this.f55644b);
            }
            return futureTask.get();
        } catch (InterruptedException e4) {
            return e4;
        } catch (ExecutionException e5) {
            return e5.getCause();
        } catch (TimeoutException unused) {
            return e(thread);
        }
    }

    private StackTraceElement[] g(Thread thread) {
        try {
            return thread.getStackTrace();
        } catch (SecurityException unused) {
            return new StackTraceElement[0];
        }
    }

    private Thread h(Thread thread) {
        List<Thread> i4 = i(thread.getThreadGroup());
        if (i4.isEmpty()) {
            return null;
        }
        long j4 = 0;
        Thread thread2 = null;
        for (Thread thread3 : i4) {
            if (thread3.getState() == Thread.State.RUNNABLE) {
                long d4 = d(thread3);
                if (thread2 == null || d4 > j4) {
                    thread2 = thread3;
                    j4 = d4;
                }
            }
        }
        if (thread2 == thread) {
            return null;
        }
        return thread2;
    }

    private List<Thread> i(ThreadGroup threadGroup) {
        int max = Math.max(threadGroup.activeCount() * 2, 100);
        for (int i4 = 0; i4 < 5; i4++) {
            Thread[] threadArr = new Thread[max];
            int enumerate = threadGroup.enumerate(threadArr);
            if (enumerate < max) {
                return Arrays.asList(threadArr).subList(0, enumerate);
            }
            max += 100;
        }
        return Collections.emptyList();
    }

    private ThreadGroup j() {
        if (!this.f55646d) {
            return null;
        }
        ThreadGroup threadGroup = new ThreadGroup("FailOnTimeoutGroup");
        if (!threadGroup.isDaemon()) {
            try {
                threadGroup.setDaemon(true);
            } catch (SecurityException unused) {
            }
        }
        return threadGroup;
    }

    @Override // org.junit.runners.model.i
    public void a() throws Throwable {
        CallableC0529c callableC0529c = new CallableC0529c();
        FutureTask<Throwable> futureTask = new FutureTask<>(callableC0529c);
        Thread thread = new Thread(j(), futureTask, "Time-limited test");
        thread.setDaemon(true);
        thread.start();
        callableC0529c.a();
        Throwable f4 = f(futureTask, thread);
        if (f4 == null) {
        } else {
            throw f4;
        }
    }

    @Deprecated
    public c(i iVar, long j4) {
        this(c().f(j4, TimeUnit.MILLISECONDS), iVar);
    }

    private c(b bVar, i iVar) {
        this.f55643a = iVar;
        this.f55645c = bVar.f55648b;
        this.f55644b = bVar.f55649c;
        this.f55646d = bVar.f55647a;
    }
}
