package kotlinx.coroutines.channels;

import kotlin.H0;
import kotlin.InterfaceC2084c;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.G0;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.U;

/* loaded from: classes2.dex */
public final class B {

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {153}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: H */
        Object f53026H;

        /* renamed from: I */
        Object f53027I;

        /* renamed from: J */
        /* synthetic */ Object f53028J;

        /* renamed from: K */
        int f53029K;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53028J = obj;
            this.f53029K |= Integer.MIN_VALUE;
            return B.a(null, null, this);
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.a<H0> {

        /* renamed from: F */
        public static final b f53030F = new b();

        b() {
            super(0);
        }

        public final void c() {
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.l<Throwable, H0> {

        /* renamed from: F */
        final /* synthetic */ InterfaceC2333q<H0> f53031F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC2333q<? super H0> interfaceC2333q) {
            super(1);
            this.f53031F = interfaceC2333q;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        public final void c(@l3.e Throwable th) {
            InterfaceC2333q<H0> interfaceC2333q = this.f53031F;
            Result.a aVar = Result.f51807F;
            interfaceC2333q.x(Result.b(H0.f51801a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@l3.d kotlinx.coroutines.channels.D<?> r4, @l3.d X2.a<kotlin.H0> r5, @l3.d kotlin.coroutines.c<? super kotlin.H0> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.B.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.B$a r0 = (kotlinx.coroutines.channels.B.a) r0
            int r1 = r0.f53029K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53029K = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.B$a r0 = new kotlinx.coroutines.channels.B$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f53028J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53029K
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f53027I
            r5 = r4
            X2.a r5 = (X2.a) r5
            java.lang.Object r4 = r0.f53026H
            kotlinx.coroutines.channels.D r4 = (kotlinx.coroutines.channels.D) r4
            kotlin.W.n(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.W.n(r6)
            kotlin.coroutines.f r6 = r0.e()
            kotlinx.coroutines.L0$b r2 = kotlinx.coroutines.L0.f52941w
            kotlin.coroutines.f$b r6 = r6.a(r2)
            if (r6 != r4) goto L7f
            r0.f53026H = r4     // Catch: java.lang.Throwable -> L32
            r0.f53027I = r5     // Catch: java.lang.Throwable -> L32
            r0.f53029K = r3     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.r r6 = new kotlinx.coroutines.r     // Catch: java.lang.Throwable -> L32
            kotlin.coroutines.c r2 = kotlin.coroutines.intrinsics.a.e(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.T()     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.channels.B$c r2 = new kotlinx.coroutines.channels.B$c     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.g(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.z()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.l()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            kotlin.coroutines.jvm.internal.f.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.n()
            kotlin.H0 r4 = kotlin.H0.f51801a
            return r4
        L7b:
            r5.n()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.B.a(kotlinx.coroutines.channels.D, X2.a, kotlin.coroutines.c):java.lang.Object");
    }

    public static /* synthetic */ Object b(D d4, X2.a aVar, kotlin.coroutines.c cVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = b.f53030F;
        }
        return a(d4, aVar, cVar);
    }

    @A0
    @l3.d
    public static final <E> F<E> c(@l3.d U u3, @l3.d kotlin.coroutines.f fVar, int i4, @InterfaceC2084c @l3.d X2.p<? super D<? super E>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return e(u3, fVar, i4, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, pVar);
    }

    @l3.d
    @G0
    public static final <E> F<E> d(@l3.d U u3, @l3.d kotlin.coroutines.f fVar, int i4, @l3.d CoroutineStart coroutineStart, @l3.e X2.l<? super Throwable, H0> lVar, @InterfaceC2084c @l3.d X2.p<? super D<? super E>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return e(u3, fVar, i4, BufferOverflow.SUSPEND, coroutineStart, lVar, pVar);
    }

    @l3.d
    public static final <E> F<E> e(@l3.d U u3, @l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow, @l3.d CoroutineStart coroutineStart, @l3.e X2.l<? super Throwable, H0> lVar, @InterfaceC2084c @l3.d X2.p<? super D<? super E>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        C c4 = new C(kotlinx.coroutines.M.e(u3, fVar), p.d(i4, bufferOverflow, null, 4, null));
        if (lVar != null) {
            c4.V(lVar);
        }
        c4.I1(coroutineStart, c4, pVar);
        return c4;
    }

    public static /* synthetic */ F f(U u3, kotlin.coroutines.f fVar, int i4, X2.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            fVar = EmptyCoroutineContext.f52041E;
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return c(u3, fVar, i4, pVar);
    }

    public static /* synthetic */ F g(U u3, kotlin.coroutines.f fVar, int i4, CoroutineStart coroutineStart, X2.l lVar, X2.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            fVar = EmptyCoroutineContext.f52041E;
        }
        kotlin.coroutines.f fVar2 = fVar;
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        int i6 = i4;
        if ((i5 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i5 & 8) != 0) {
            lVar = null;
        }
        return d(u3, fVar2, i6, coroutineStart2, lVar, pVar);
    }

    public static /* synthetic */ F h(U u3, kotlin.coroutines.f fVar, int i4, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, X2.l lVar, X2.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            fVar = EmptyCoroutineContext.f52041E;
        }
        kotlin.coroutines.f fVar2 = fVar;
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        int i6 = i4;
        if ((i5 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if ((i5 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i5 & 16) != 0) {
            lVar = null;
        }
        return e(u3, fVar2, i6, bufferOverflow2, coroutineStart2, lVar, pVar);
    }
}
