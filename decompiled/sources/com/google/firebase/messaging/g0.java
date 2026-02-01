package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.android.gms.tasks.C1773n;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class g0 {

    /* renamed from: i, reason: collision with root package name */
    static final String f37017i = "INTERNAL_SERVER_ERROR";

    /* renamed from: j, reason: collision with root package name */
    static final String f37018j = "SERVICE_NOT_AVAILABLE";

    /* renamed from: k, reason: collision with root package name */
    private static final long f37019k = 30;

    /* renamed from: l, reason: collision with root package name */
    private static final long f37020l = 30;

    /* renamed from: m, reason: collision with root package name */
    private static final long f37021m = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a, reason: collision with root package name */
    private final Context f37022a;

    /* renamed from: b, reason: collision with root package name */
    private final K f37023b;

    /* renamed from: c, reason: collision with root package name */
    private final F f37024c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f37025d;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f37027f;

    /* renamed from: h, reason: collision with root package name */
    private final e0 f37029h;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.B("pendingOperations")
    private final Map<String, ArrayDeque<C1771l<Void>>> f37026e = new androidx.collection.a();

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.B("this")
    private boolean f37028g = false;

    private g0(FirebaseMessaging firebaseMessaging, K k4, e0 e0Var, F f4, Context context, @androidx.annotation.N ScheduledExecutorService scheduledExecutorService) {
        this.f37025d = firebaseMessaging;
        this.f37023b = k4;
        this.f37029h = e0Var;
        this.f37024c = f4;
        this.f37022a = context;
        this.f37027f = scheduledExecutorService;
    }

    private void b(d0 d0Var, C1771l<Void> c1771l) {
        ArrayDeque<C1771l<Void>> arrayDeque;
        synchronized (this.f37026e) {
            try {
                String e4 = d0Var.e();
                if (this.f37026e.containsKey(e4)) {
                    arrayDeque = this.f37026e.get(e4);
                } else {
                    ArrayDeque<C1771l<Void>> arrayDeque2 = new ArrayDeque<>();
                    this.f37026e.put(e4, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(c1771l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.annotation.j0
    private static <T> void c(AbstractC1770k<T> abstractC1770k) throws IOException {
        try {
            C1773n.b(abstractC1770k, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e4) {
            e = e4;
            throw new IOException(f37018j, e);
        } catch (ExecutionException e5) {
            Throwable cause = e5.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e5);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e6) {
            e = e6;
            throw new IOException(f37018j, e);
        }
    }

    @androidx.annotation.j0
    private void d(String str) throws IOException {
        c(this.f37024c.l(this.f37025d.n(), str));
    }

    @androidx.annotation.j0
    private void e(String str) throws IOException {
        c(this.f37024c.m(this.f37025d.n(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.i0
    public static AbstractC1770k<g0> f(final FirebaseMessaging firebaseMessaging, final K k4, final F f4, final Context context, @androidx.annotation.N final ScheduledExecutorService scheduledExecutorService) {
        return C1773n.d(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.f0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                g0 k5;
                k5 = g0.k(context, scheduledExecutorService, firebaseMessaging, k4, f4);
                return k5;
            }
        });
    }

    static boolean i() {
        return Log.isLoggable(C1821f.f36920a, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g0 k(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, K k4, F f4) throws Exception {
        return new g0(firebaseMessaging, k4, e0.d(context, scheduledExecutorService), f4, context, scheduledExecutorService);
    }

    private void l(d0 d0Var) {
        synchronized (this.f37026e) {
            try {
                String e4 = d0Var.e();
                if (!this.f37026e.containsKey(e4)) {
                    return;
                }
                ArrayDeque<C1771l<Void>> arrayDeque = this.f37026e.get(e4);
                C1771l<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f37026e.remove(e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void q() {
        if (!j()) {
            u(0L);
        }
    }

    @androidx.annotation.i0
    e0 g() {
        return this.f37029h;
    }

    boolean h() {
        if (this.f37029h.e() != null) {
            return true;
        }
        return false;
    }

    synchronized boolean j() {
        return this.f37028g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[Catch: IOException -> 0x001f, TryCatch #0 {IOException -> 0x001f, blocks: (B:3:0x0003, B:12:0x0033, B:14:0x0039, B:17:0x0053, B:19:0x0060, B:20:0x007c, B:22:0x0089, B:23:0x0015, B:26:0x0022), top: B:2:0x0003 }] */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean m(com.google.firebase.messaging.d0 r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.b()     // Catch: java.io.IOException -> L1f
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> L1f
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L22
            r4 = 85
            if (r3 == r4) goto L15
            goto L2c
        L15:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = r5
            goto L2d
        L1f:
            r7 = move-exception
            goto La5
        L22:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = r1
            goto L2d
        L2c:
            r2 = -1
        L2d:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L7c
            if (r2 == r5) goto L53
            boolean r2 = i()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = "."
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L1f
            goto La4
        L53:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L1f
            r6.e(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = i()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L1f
            goto La4
        L7c:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L1f
            r6.d(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = i()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L1f
        La4:
            return r5
        La5:
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lcb
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lbe
            goto Lcb
        Lbe:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto Lca
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r0, r7)
            return r1
        Lca:
            throw r7
        Lcb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.e(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.g0.m(com.google.firebase.messaging.d0):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(Runnable runnable, long j4) {
        this.f37027f.schedule(runnable, j4, TimeUnit.SECONDS);
    }

    @androidx.annotation.i0
    AbstractC1770k<Void> o(d0 d0Var) {
        this.f37029h.a(d0Var);
        C1771l<Void> c1771l = new C1771l<>();
        b(d0Var, c1771l);
        return c1771l.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void p(boolean z3) {
        this.f37028g = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        if (h()) {
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1770k<Void> s(String str) {
        AbstractC1770k<Void> o4 = o(d0.f(str));
        r();
        return o4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
    
        if (i() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000f, code lost:
    
        android.util.Log.d(com.google.firebase.messaging.C1821f.f36920a, "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001a, code lost:
    
        return true;
     */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean t() throws java.io.IOException {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.e0 r0 = r2.f37029h     // Catch: java.lang.Throwable -> L17
            com.google.firebase.messaging.d0 r0 = r0.e()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            boolean r0 = i()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L2e
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            r0 = 1
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r2.m(r0)
            if (r1 != 0) goto L25
            r0 = 0
            return r0
        L25:
            com.google.firebase.messaging.e0 r1 = r2.f37029h
            r1.i(r0)
            r2.l(r0)
            goto L0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.g0.t():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(long j4) {
        n(new h0(this, this.f37022a, this.f37023b, Math.min(Math.max(30L, 2 * j4), f37021m)), j4);
        p(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1770k<Void> v(String str) {
        AbstractC1770k<Void> o4 = o(d0.g(str));
        r();
        return o4;
    }
}
