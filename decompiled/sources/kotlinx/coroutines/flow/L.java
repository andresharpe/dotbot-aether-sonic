package kotlinx.coroutines.flow;

import androidx.constraintlayout.core.motion.utils.v;
import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class L<T> implements InterfaceC2283j<T> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final InterfaceC2283j<T> f54073E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final X2.p<InterfaceC2283j<? super T>, kotlin.coroutines.c<? super H0>, Object> f54074F;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {419, v.c.f7455u}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f54075H;

        /* renamed from: I, reason: collision with root package name */
        Object f54076I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f54077J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ L<T> f54078K;

        /* renamed from: L, reason: collision with root package name */
        int f54079L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(L<T> l4, kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
            this.f54078K = l4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f54077J = obj;
            this.f54079L |= Integer.MIN_VALUE;
            return this.f54078K.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public L(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d X2.p<? super InterfaceC2283j<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        this.f54073E = interfaceC2283j;
        this.f54074F = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@l3.d kotlin.coroutines.c<? super kotlin.H0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.L.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.L$a r0 = (kotlinx.coroutines.flow.L.a) r0
            int r1 = r0.f54079L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54079L = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.L$a r0 = new kotlinx.coroutines.flow.L$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f54077J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f54079L
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.W.n(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f54076I
            kotlinx.coroutines.flow.internal.SafeCollector r2 = (kotlinx.coroutines.flow.internal.SafeCollector) r2
            java.lang.Object r4 = r0.f54075H
            kotlinx.coroutines.flow.L r4 = (kotlinx.coroutines.flow.L) r4
            kotlin.W.n(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            kotlin.W.n(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlinx.coroutines.flow.j<T> r7 = r6.f54073E
            kotlin.coroutines.f r5 = r0.e()
            r2.<init>(r7, r5)
            X2.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.c<? super kotlin.H0>, java.lang.Object> r7 = r6.f54074F     // Catch: java.lang.Throwable -> L40
            r0.f54075H = r6     // Catch: java.lang.Throwable -> L40
            r0.f54076I = r2     // Catch: java.lang.Throwable -> L40
            r0.f54079L = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.c0(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r4 = r6
        L60:
            r2.H()
            kotlinx.coroutines.flow.j<T> r7 = r4.f54073E
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.L
            if (r2 == 0) goto L7c
            kotlinx.coroutines.flow.L r7 = (kotlinx.coroutines.flow.L) r7
            r2 = 0
            r0.f54075H = r2
            r0.f54076I = r2
            r0.f54079L = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L79
            return r1
        L79:
            kotlin.H0 r7 = kotlin.H0.f51801a
            return r7
        L7c:
            kotlin.H0 r7 = kotlin.H0.f51801a
            return r7
        L7f:
            r2.H()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.L.a(kotlin.coroutines.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2283j
    @l3.e
    public Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return this.f54073E.f(t3, cVar);
    }
}
