package androidx.concurrent.futures;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import k1.InterfaceFutureC2077a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class a<V> implements InterfaceFutureC2077a<V> {

    /* renamed from: H, reason: collision with root package name */
    static final boolean f6538H = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", L1.a.t3));

    /* renamed from: I, reason: collision with root package name */
    private static final Logger f6539I = Logger.getLogger(a.class.getName());

    /* renamed from: J, reason: collision with root package name */
    private static final long f6540J = 1000;

    /* renamed from: K, reason: collision with root package name */
    static final b f6541K;

    /* renamed from: L, reason: collision with root package name */
    private static final Object f6542L;

    /* renamed from: E, reason: collision with root package name */
    @P
    volatile Object f6543E;

    /* renamed from: F, reason: collision with root package name */
    @P
    volatile e f6544F;

    /* renamed from: G, reason: collision with root package name */
    @P
    volatile i f6545G;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f6546c;

        /* renamed from: d, reason: collision with root package name */
        static final c f6547d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f6548a;

        /* renamed from: b, reason: collision with root package name */
        @P
        final Throwable f6549b;

        static {
            if (a.f6538H) {
                f6547d = null;
                f6546c = null;
            } else {
                f6547d = new c(false, null);
                f6546c = new c(true, null);
            }
        }

        c(boolean z3, @P Throwable th) {
            this.f6548a = z3;
            this.f6549b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f6550b = new d(new C0056a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f6551a;

        /* renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0056a extends Throwable {
            C0056a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f6551a = (Throwable) a.d(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f6552d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f6553a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f6554b;

        /* renamed from: c, reason: collision with root package name */
        @P
        e f6555c;

        e(Runnable runnable, Executor executor) {
            this.f6553a = runnable;
            this.f6554b = executor;
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f6556a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f6557b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f6558c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f6559d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f6560e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f6556a = atomicReferenceFieldUpdater;
            this.f6557b = atomicReferenceFieldUpdater2;
            this.f6558c = atomicReferenceFieldUpdater3;
            this.f6559d = atomicReferenceFieldUpdater4;
            this.f6560e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f6559d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f6560e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f6558c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f6557b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f6556a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final a<V> f6561E;

        /* renamed from: F, reason: collision with root package name */
        final InterfaceFutureC2077a<? extends V> f6562F;

        g(a<V> aVar, InterfaceFutureC2077a<? extends V> interfaceFutureC2077a) {
            this.f6561E = aVar;
            this.f6562F = interfaceFutureC2077a;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6561E.f6543E != this) {
                return;
            }
            if (a.f6541K.b(this.f6561E, this, a.j(this.f6562F))) {
                a.g(this.f6561E);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f6544F == eVar) {
                        aVar.f6544F = eVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f6543E == obj) {
                        aVar.f6543E = obj2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f6545G == iVar) {
                        aVar.f6545G = iVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f6565b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f6564a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f6563c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        @P
        volatile Thread f6564a;

        /* renamed from: b, reason: collision with root package name */
        @P
        volatile i f6565b;

        i(boolean z3) {
        }

        void a(i iVar) {
            a.f6541K.d(this, iVar);
        }

        void b() {
            Thread thread = this.f6564a;
            if (thread != null) {
                this.f6564a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f6541K.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, com.harman.log.b.f47574c), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "G"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "F"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, androidx.exifinterface.media.a.U4));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f6541K = hVar;
        if (th != null) {
            f6539I.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f6542L = new Object();
    }

    private void a(StringBuilder sb) {
        try {
            Object k4 = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(t(k4));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e5) {
            sb.append("FAILURE, cause=[");
            sb.append(e5.getCause());
            sb.append("]");
        }
    }

    private static CancellationException c(@P String str, @P Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @N
    static <T> T d(@P T t3) {
        t3.getClass();
        return t3;
    }

    private e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f6544F;
        } while (!f6541K.a(this, eVar2, e.f6552d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f6555c;
            eVar4.f6555c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void g(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.o();
            aVar.b();
            e e4 = aVar.e(eVar);
            while (e4 != null) {
                eVar = e4.f6555c;
                Runnable runnable = e4.f6553a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f6561E;
                    if (aVar.f6543E == gVar) {
                        if (f6541K.b(aVar, gVar, j(gVar.f6562F))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, e4.f6554b);
                }
                e4 = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f6539I.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V i(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == f6542L) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).f6551a);
        }
        throw c("Task was cancelled.", ((c) obj).f6549b);
    }

    static Object j(InterfaceFutureC2077a<?> interfaceFutureC2077a) {
        if (interfaceFutureC2077a instanceof a) {
            Object obj = ((a) interfaceFutureC2077a).f6543E;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f6548a) {
                    if (cVar.f6549b != null) {
                        return new c(false, cVar.f6549b);
                    }
                    return c.f6547d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = interfaceFutureC2077a.isCancelled();
        if ((!f6538H) & isCancelled) {
            return c.f6547d;
        }
        try {
            Object k4 = k(interfaceFutureC2077a);
            if (k4 == null) {
                return f6542L;
            }
            return k4;
        } catch (CancellationException e4) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC2077a, e4));
            }
            return new c(false, e4);
        } catch (ExecutionException e5) {
            return new d(e5.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    static <V> V k(Future<V> future) throws ExecutionException {
        V v3;
        boolean z3 = false;
        while (true) {
            try {
                v3 = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return v3;
    }

    private void o() {
        i iVar;
        do {
            iVar = this.f6545G;
        } while (!f6541K.c(this, iVar, i.f6563c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f6565b;
        }
    }

    private void p(i iVar) {
        iVar.f6564a = null;
        while (true) {
            i iVar2 = this.f6545G;
            if (iVar2 == i.f6563c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f6565b;
                if (iVar2.f6564a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f6565b = iVar4;
                    if (iVar3.f6564a == null) {
                        break;
                    }
                } else if (!f6541K.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String t(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        boolean z4;
        c cVar;
        boolean z5;
        Object obj = this.f6543E;
        if (obj == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!(z4 | (obj instanceof g))) {
            return false;
        }
        if (f6538H) {
            cVar = new c(z3, new CancellationException("Future.cancel() was called."));
        } else if (z3) {
            cVar = c.f6546c;
        } else {
            cVar = c.f6547d;
        }
        a<V> aVar = this;
        boolean z6 = false;
        while (true) {
            if (f6541K.b(aVar, obj, cVar)) {
                if (z3) {
                    aVar.l();
                }
                g(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                InterfaceFutureC2077a<? extends V> interfaceFutureC2077a = ((g) obj).f6562F;
                if (interfaceFutureC2077a instanceof a) {
                    aVar = (a) interfaceFutureC2077a;
                    obj = aVar.f6543E;
                    if (obj == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!(z5 | (obj instanceof g))) {
                        return true;
                    }
                    z6 = true;
                } else {
                    interfaceFutureC2077a.cancel(z3);
                    return true;
                }
            } else {
                obj = aVar.f6543E;
                if (!(obj instanceof g)) {
                    return z6;
                }
            }
        }
    }

    @Override // k1.InterfaceFutureC2077a
    public final void f(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f6544F;
        if (eVar != e.f6552d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f6555c = eVar;
                if (f6541K.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f6544F;
                }
            } while (eVar != e.f6552d);
        }
        h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j4, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j4);
        if (!Thread.interrupted()) {
            Object obj = this.f6543E;
            if ((obj != null) & (!(obj instanceof g))) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.f6545G;
                if (iVar != i.f6563c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f6541K.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f6543E;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    p(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            p(iVar2);
                        } else {
                            iVar = this.f6545G;
                        }
                    } while (iVar != i.f6563c);
                }
                return i(this.f6543E);
            }
            while (nanos > 0) {
                Object obj3 = this.f6543E;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j4 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j5 = -nanos;
                long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
                long nanos2 = j5 - timeUnit.toNanos(convert);
                boolean z3 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z3) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z3) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6543E instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z3;
        if (this.f6543E != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        return (!(r0 instanceof g)) & z3;
    }

    protected void l() {
    }

    final void m(@P Future<?> future) {
        boolean z3;
        if (future != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 & isCancelled()) {
            future.cancel(u());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @P
    protected String n() {
        Object obj = this.f6543E;
        if (obj instanceof g) {
            return "setFuture=[" + t(((g) obj).f6562F) + "]";
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(@P V v3) {
        if (v3 == null) {
            v3 = (V) f6542L;
        }
        if (f6541K.b(this, null, v3)) {
            g(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean r(Throwable th) {
        if (f6541K.b(this, null, new d((Throwable) d(th)))) {
            g(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean s(InterfaceFutureC2077a<? extends V> interfaceFutureC2077a) {
        d dVar;
        d(interfaceFutureC2077a);
        Object obj = this.f6543E;
        if (obj == null) {
            if (interfaceFutureC2077a.isDone()) {
                if (!f6541K.b(this, null, j(interfaceFutureC2077a))) {
                    return false;
                }
                g(this);
                return true;
            }
            g gVar = new g(this, interfaceFutureC2077a);
            if (f6541K.b(this, null, gVar)) {
                try {
                    interfaceFutureC2077a.f(gVar, DirectExecutor.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f6550b;
                    }
                    f6541K.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f6543E;
        }
        if (obj instanceof c) {
            interfaceFutureC2077a.cancel(((c) obj).f6548a);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = n();
            } catch (RuntimeException e4) {
                str = "Exception thrown from implementation: " + e4.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected final boolean u() {
        Object obj = this.f6543E;
        if ((obj instanceof c) && ((c) obj).f6548a) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f6543E;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f6545G;
            if (iVar != i.f6563c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f6541K.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6543E;
                            } else {
                                p(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f6545G;
                } while (iVar != i.f6563c);
            }
            return i(this.f6543E);
        }
        throw new InterruptedException();
    }
}
