package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class w1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {100}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
    /* loaded from: classes2.dex */
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        long f54755H;

        /* renamed from: I, reason: collision with root package name */
        Object f54756I;

        /* renamed from: J, reason: collision with root package name */
        Object f54757J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f54758K;

        /* renamed from: L, reason: collision with root package name */
        int f54759L;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f54758K = obj;
            this.f54759L |= Integer.MIN_VALUE;
            return w1.e(0L, null, this);
        }
    }

    @l3.d
    public static final TimeoutCancellationException a(long j4, @l3.d L0 l02) {
        return new TimeoutCancellationException("Timed out waiting for " + j4 + " ms", l02);
    }

    private static final <U, T extends U> Object b(v1<U, ? super T> v1Var, X2.p<? super U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar) {
        O0.y(v1Var, C2269d0.d(v1Var.f54448G.e()).x0(v1Var.f54754H, v1Var, v1Var.e()));
        return j3.b.g(v1Var, v1Var, pVar);
    }

    @l3.e
    public static final <T> Object c(long j4, @l3.d X2.p<? super U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        Object l4;
        if (j4 > 0) {
            Object b4 = b(new v1(j4, cVar), pVar);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (b4 == l4) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return b4;
        }
        throw new TimeoutCancellationException("Timed out immediately");
    }

    @l3.e
    public static final <T> Object d(long j4, @l3.d X2.p<? super U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return c(C2269d0.e(j4), pVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.v1] */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(long r7, @l3.d X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super T>, ? extends java.lang.Object> r9, @l3.d kotlin.coroutines.c<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.w1.a
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.w1$a r0 = (kotlinx.coroutines.w1.a) r0
            int r1 = r0.f54759L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54759L = r1
            goto L18
        L13:
            kotlinx.coroutines.w1$a r0 = new kotlinx.coroutines.w1$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f54758K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f54759L
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f54757J
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            java.lang.Object r8 = r0.f54756I
            X2.p r8 = (X2.p) r8
            kotlin.W.n(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            goto L6f
        L32:
            r8 = move-exception
            goto L70
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.W.n(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.f54756I = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f54757J = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f54755H = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f54759L = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            kotlinx.coroutines.v1 r2 = new kotlinx.coroutines.v1     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r10.f52301E = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r7 = b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r8 = kotlin.coroutines.intrinsics.a.l()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            if (r7 != r8) goto L6b
            kotlin.coroutines.jvm.internal.f.c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L70
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            r10 = r7
        L6f:
            return r10
        L70:
            kotlinx.coroutines.L0 r9 = r8.f52984E
            T r7 = r7.f52301E
            if (r9 != r7) goto L77
            return r3
        L77:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.w1.e(long, X2.p, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.e
    public static final <T> Object f(long j4, @l3.d X2.p<? super U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return e(C2269d0.e(j4), pVar, cVar);
    }
}
