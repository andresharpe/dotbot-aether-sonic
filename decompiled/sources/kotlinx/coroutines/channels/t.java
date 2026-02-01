package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.U;
import kotlin.V;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2345w0;
import kotlinx.coroutines.InterfaceC2239b1;
import kotlinx.coroutines.channels.F;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class t {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {104}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class a<E> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53143H;

        /* renamed from: I, reason: collision with root package name */
        Object f53144I;

        /* renamed from: J, reason: collision with root package name */
        Object f53145J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f53146K;

        /* renamed from: L, reason: collision with root package name */
        int f53147L;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53146K = obj;
            this.f53147L |= Integer.MIN_VALUE;
            return t.e(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {129}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class b<E> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53148H;

        /* renamed from: I, reason: collision with root package name */
        Object f53149I;

        /* renamed from: J, reason: collision with root package name */
        Object f53150J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f53151K;

        /* renamed from: L, reason: collision with root package name */
        int f53152L;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53151K = obj;
            this.f53152L |= Integer.MIN_VALUE;
            return t.d(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {com.harman.analytics.deviceAws.a.f37828k}, m = "toList", n = {"$this$toList_u24lambda_u2d3", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    /* loaded from: classes2.dex */
    public static final class c<E> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53153H;

        /* renamed from: I, reason: collision with root package name */
        Object f53154I;

        /* renamed from: J, reason: collision with root package name */
        Object f53155J;

        /* renamed from: K, reason: collision with root package name */
        Object f53156K;

        /* renamed from: L, reason: collision with root package name */
        /* synthetic */ Object f53157L;

        /* renamed from: M, reason: collision with root package name */
        int f53158M;

        c(kotlin.coroutines.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53157L = obj;
            this.f53158M |= Integer.MIN_VALUE;
            return r.g0(null, this);
        }
    }

    @U
    public static final void a(@l3.d F<?> f4, @l3.e Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = C2345w0.a("Channel was consumed, consumer had failed", th);
            }
        }
        f4.f(cancellationException);
    }

    @InterfaceC2239b1
    public static final <E, R> R b(@l3.d InterfaceC2250i<E> interfaceC2250i, @l3.d X2.l<? super F<? extends E>, ? extends R> lVar) {
        F<E> R3 = interfaceC2250i.R();
        try {
            return lVar.C(R3);
        } finally {
            kotlin.jvm.internal.C.d(1);
            F.a.b(R3, null, 1, null);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static final <E, R> R c(@l3.d F<? extends E> f4, @l3.d X2.l<? super F<? extends E>, ? extends R> lVar) {
        try {
            R C3 = lVar.C(f4);
            kotlin.jvm.internal.C.d(1);
            r.b(f4, null);
            kotlin.jvm.internal.C.c(1);
            return C3;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:15:0x0065, B:17:0x006d, B:29:0x007a), top: B:14:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #1 {all -> 0x0077, blocks: (B:15:0x0065, B:17:0x006d, B:29:0x007a), top: B:14:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:13:0x0038). Please report as a decompilation issue!!! */
    @l3.e
    @kotlinx.coroutines.InterfaceC2239b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object d(@l3.d kotlinx.coroutines.channels.InterfaceC2250i<E> r6, @l3.d X2.l<? super E, kotlin.H0> r7, @l3.d kotlin.coroutines.c<? super kotlin.H0> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.t.b
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.t$b r0 = (kotlinx.coroutines.channels.t.b) r0
            int r1 = r0.f53152L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53152L = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.t$b r0 = new kotlinx.coroutines.channels.t$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f53151K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53152L
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 != r4) goto L3c
            java.lang.Object r6 = r0.f53150J
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.o) r6
            java.lang.Object r7 = r0.f53149I
            kotlinx.coroutines.channels.F r7 = (kotlinx.coroutines.channels.F) r7
            java.lang.Object r2 = r0.f53148H
            X2.l r2 = (X2.l) r2
            kotlin.W.n(r8)     // Catch: java.lang.Throwable -> L3a
            r5 = r0
            r0 = r7
            r7 = r2
        L38:
            r2 = r5
            goto L65
        L3a:
            r6 = move-exception
            goto L8d
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            kotlin.W.n(r8)
            kotlinx.coroutines.channels.F r6 = r6.R()
            kotlinx.coroutines.channels.o r8 = r6.iterator()     // Catch: java.lang.Throwable -> L89
            r5 = r8
            r8 = r6
            r6 = r5
        L52:
            r0.f53148H = r7     // Catch: java.lang.Throwable -> L86
            r0.f53149I = r8     // Catch: java.lang.Throwable -> L86
            r0.f53150J = r6     // Catch: java.lang.Throwable -> L86
            r0.f53152L = r4     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r6.a(r0)     // Catch: java.lang.Throwable -> L86
            if (r2 != r1) goto L61
            return r1
        L61:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L38
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L77
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L77
            if (r8 == 0) goto L7a
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L77
            r7.C(r8)     // Catch: java.lang.Throwable -> L77
            r8 = r0
            r0 = r2
            goto L52
        L77:
            r6 = move-exception
            r7 = r0
            goto L8d
        L7a:
            kotlin.H0 r6 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L77
            kotlin.jvm.internal.C.d(r4)
            kotlinx.coroutines.channels.F.a.b(r0, r3, r4, r3)
            kotlin.jvm.internal.C.c(r4)
            return r6
        L86:
            r6 = move-exception
            r7 = r8
            goto L8d
        L89:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L8d:
            kotlin.jvm.internal.C.d(r4)
            kotlinx.coroutines.channels.F.a.b(r7, r3, r4, r3)
            kotlin.jvm.internal.C.c(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.t.d(kotlinx.coroutines.channels.i, X2.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object e(@l3.d kotlinx.coroutines.channels.F<? extends E> r5, @l3.d X2.l<? super E, kotlin.H0> r6, @l3.d kotlin.coroutines.c<? super kotlin.H0> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.t.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.t$a r0 = (kotlinx.coroutines.channels.t.a) r0
            int r1 = r0.f53147L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53147L = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.t$a r0 = new kotlinx.coroutines.channels.t$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f53146K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53147L
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f53145J
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.o) r5
            java.lang.Object r6 = r0.f53144I
            kotlinx.coroutines.channels.F r6 = (kotlinx.coroutines.channels.F) r6
            java.lang.Object r2 = r0.f53143H
            X2.l r2 = (X2.l) r2
            kotlin.W.n(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L7e
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.W.n(r7)
            kotlinx.coroutines.channels.o r7 = r5.iterator()     // Catch: java.lang.Throwable -> L7a
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.f53143H = r7     // Catch: java.lang.Throwable -> L35
            r0.f53144I = r6     // Catch: java.lang.Throwable -> L35
            r0.f53145J = r5     // Catch: java.lang.Throwable -> L35
            r0.f53147L = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            r2.C(r7)     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4a
        L6d:
            kotlin.H0 r5 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L35
            kotlin.jvm.internal.C.d(r3)
            r7 = 0
            kotlinx.coroutines.channels.r.b(r6, r7)
            kotlin.jvm.internal.C.c(r3)
            return r5
        L7a:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L7e:
            throw r5     // Catch: java.lang.Throwable -> L7f
        L7f:
            r7 = move-exception
            kotlin.jvm.internal.C.d(r3)
            kotlinx.coroutines.channels.r.b(r6, r5)
            kotlin.jvm.internal.C.c(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.t.e(kotlinx.coroutines.channels.F, X2.l, kotlin.coroutines.c):java.lang.Object");
    }

    @InterfaceC2239b1
    private static final <E> Object f(InterfaceC2250i<E> interfaceC2250i, X2.l<? super E, H0> lVar, kotlin.coroutines.c<? super H0> cVar) {
        F<E> R3 = interfaceC2250i.R();
        try {
            o<E> it = R3.iterator();
            while (true) {
                kotlin.jvm.internal.C.e(3);
                kotlin.jvm.internal.C.e(0);
                Object a4 = it.a(null);
                kotlin.jvm.internal.C.e(1);
                if (((Boolean) a4).booleanValue()) {
                    lVar.C(it.next());
                } else {
                    H0 h02 = H0.f51801a;
                    kotlin.jvm.internal.C.d(1);
                    F.a.b(R3, null, 1, null);
                    kotlin.jvm.internal.C.c(1);
                    return h02;
                }
            }
        } catch (Throwable th) {
            kotlin.jvm.internal.C.d(1);
            F.a.b(R3, null, 1, null);
            kotlin.jvm.internal.C.c(1);
            throw th;
        }
    }

    private static final <E> Object g(F<? extends E> f4, X2.l<? super E, H0> lVar, kotlin.coroutines.c<? super H0> cVar) {
        try {
            o<? extends E> it = f4.iterator();
            while (true) {
                kotlin.jvm.internal.C.e(3);
                kotlin.jvm.internal.C.e(0);
                Object a4 = it.a(null);
                kotlin.jvm.internal.C.e(1);
                if (((Boolean) a4).booleanValue()) {
                    lVar.C(it.next());
                } else {
                    H0 h02 = H0.f51801a;
                    kotlin.jvm.internal.C.d(1);
                    r.b(f4, null);
                    kotlin.jvm.internal.C.c(1);
                    return h02;
                }
            }
        } finally {
        }
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final <E> kotlinx.coroutines.selects.d<E> h(@l3.d F<? extends E> f4) {
        return f4.w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.e
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @V(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final <E> Object i(@l3.d F<? extends E> f4, @l3.d kotlin.coroutines.c<? super E> cVar) {
        return f4.B(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0067, B:14:0x006f, B:29:0x0078), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0067, B:14:0x006f, B:29:0x0078), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0064 -> B:12:0x0067). Please report as a decompilation issue!!! */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object j(@l3.d kotlinx.coroutines.channels.F<? extends E> r7, @l3.d kotlin.coroutines.c<? super java.util.List<? extends E>> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.t.c
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.t$c r0 = (kotlinx.coroutines.channels.t.c) r0
            int r1 = r0.f53158M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53158M = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.t$c r0 = new kotlinx.coroutines.channels.t$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f53157L
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53158M
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.f53156K
            kotlinx.coroutines.channels.o r7 = (kotlinx.coroutines.channels.o) r7
            java.lang.Object r2 = r0.f53155J
            kotlinx.coroutines.channels.F r2 = (kotlinx.coroutines.channels.F) r2
            java.lang.Object r4 = r0.f53154I
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.f53153H
            java.util.List r5 = (java.util.List) r5
            kotlin.W.n(r8)     // Catch: java.lang.Throwable -> L39
            goto L67
        L39:
            r7 = move-exception
            r8 = r2
            goto L89
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            kotlin.W.n(r8)
            java.util.List r8 = kotlin.collections.C2107u.i()
            kotlinx.coroutines.channels.o r2 = r7.iterator()     // Catch: java.lang.Throwable -> L85
            r4 = r8
            r5 = r4
            r8 = r7
            r7 = r2
        L53:
            r0.f53153H = r5     // Catch: java.lang.Throwable -> L83
            r0.f53154I = r4     // Catch: java.lang.Throwable -> L83
            r0.f53155J = r8     // Catch: java.lang.Throwable -> L83
            r0.f53156K = r7     // Catch: java.lang.Throwable -> L83
            r0.f53158M = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r7.a(r0)     // Catch: java.lang.Throwable -> L83
            if (r2 != r1) goto L64
            return r1
        L64:
            r6 = r2
            r2 = r8
            r8 = r6
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L39
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L78
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L39
            r4.add(r8)     // Catch: java.lang.Throwable -> L39
            r8 = r2
            goto L53
        L78:
            kotlin.H0 r7 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L39
            r7 = 0
            kotlinx.coroutines.channels.r.b(r2, r7)
            java.util.List r7 = kotlin.collections.C2107u.a(r5)
            return r7
        L83:
            r7 = move-exception
            goto L89
        L85:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L89:
            throw r7     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            kotlinx.coroutines.channels.r.b(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.t.j(kotlinx.coroutines.channels.F, kotlin.coroutines.c):java.lang.Object");
    }
}
