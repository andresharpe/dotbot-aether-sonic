package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.L0;

/* loaded from: classes2.dex */
public final /* synthetic */ class FlowKt__ErrorsKt {

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {156}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: H */
        Object f53638H;

        /* renamed from: I */
        /* synthetic */ Object f53639I;

        /* renamed from: J */
        int f53640J;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53639I = obj;
            this.f53640J |= Integer.MIN_VALUE;
            return C2284k.v(null, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements InterfaceC2283j {

        /* renamed from: E */
        final /* synthetic */ InterfaceC2283j<T> f53641E;

        /* renamed from: F */
        final /* synthetic */ Ref.ObjectRef<Throwable> f53642F;

        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {158}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: H */
            Object f53643H;

            /* renamed from: I */
            /* synthetic */ Object f53644I;

            /* renamed from: J */
            final /* synthetic */ b<T> f53645J;

            /* renamed from: K */
            int f53646K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, kotlin.coroutines.c<? super a> cVar) {
                super(cVar);
                this.f53645J = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53644I = obj;
                this.f53646K |= Integer.MIN_VALUE;
                return this.f53645J.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC2283j<? super T> interfaceC2283j, Ref.ObjectRef<Throwable> objectRef) {
            this.f53641E = interfaceC2283j;
            this.f53642F = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r5, @l3.d kotlin.coroutines.c<? super kotlin.H0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$b$a r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.b.a) r0
                int r1 = r0.f53646K
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53646K = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$b$a r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$b$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f53644I
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f53646K
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f53643H
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$b r5 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.b) r5
                kotlin.W.n(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.W.n(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.f53641E     // Catch: java.lang.Throwable -> L4a
                r0.f53643H = r4     // Catch: java.lang.Throwable -> L4a
                r0.f53646K = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.f(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                kotlin.H0 r5 = kotlin.H0.f51801a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.f53642F
                r5.f52301E = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.b.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements X2.p<Throwable, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I */
        int f53647I;

        c(kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f53647I == 0) {
                W.n(obj);
                return kotlin.coroutines.jvm.internal.a.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d Throwable th, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((c) v(th, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new c(cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class d<T> extends SuspendLambda implements X2.r<InterfaceC2283j<? super T>, Throwable, Long, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I */
        int f53648I;

        /* renamed from: J */
        /* synthetic */ Object f53649J;

        /* renamed from: K */
        /* synthetic */ long f53650K;

        /* renamed from: L */
        final /* synthetic */ long f53651L;

        /* renamed from: M */
        final /* synthetic */ X2.p<Throwable, kotlin.coroutines.c<? super Boolean>, Object> f53652M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(long j4, X2.p<? super Throwable, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.c<? super d> cVar) {
            super(4, cVar);
            this.f53651L = j4;
            this.f53652M = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
        
            if (((java.lang.Boolean) r8).booleanValue() != false) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r7.f53648I
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.W.n(r8)
                goto L31
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                kotlin.W.n(r8)
                java.lang.Object r8 = r7.f53649J
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                long r3 = r7.f53650K
                long r5 = r7.f53651L
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L3a
                X2.p<java.lang.Throwable, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r1 = r7.f53652M
                r7.f53648I = r2
                java.lang.Object r8 = r1.c0(r8, r7)
                if (r8 != r0) goto L31
                return r0
            L31:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L3a
                goto L3b
            L3a:
                r2 = 0
            L3b:
                java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r2)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.d.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.r
        public /* bridge */ /* synthetic */ Object N(Object obj, Throwable th, Long l4, kotlin.coroutines.c<? super Boolean> cVar) {
            return R((InterfaceC2283j) obj, th, l4.longValue(), cVar);
        }

        @l3.e
        public final Object R(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d Throwable th, long j4, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
            d dVar = new d(this.f53651L, this.f53652M, cVar);
            dVar.f53649J = th;
            dVar.f53650K = j4;
            return dVar.D(H0.f51801a);
        }
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> a(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.q<? super InterfaceC2283j<? super T>, ? super Throwable, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(interfaceC2282i, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r4, @l3.d kotlinx.coroutines.flow.InterfaceC2283j<? super T> r5, @l3.d kotlin.coroutines.c<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$a r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.a) r0
            int r1 = r0.f53640J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53640J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$a r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f53639I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53640J
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f53638H
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.W.n(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.W.n(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$b r2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$b     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f53638H = r6     // Catch: java.lang.Throwable -> L51
            r0.f53640J = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.f52301E
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            kotlin.coroutines.f r6 = r0.e()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            kotlin.C2209o.a(r4, r5)
            throw r4
        L72:
            kotlin.C2209o.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.b(kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.j, kotlin.coroutines.c):java.lang.Object");
    }

    private static final boolean c(Throwable th, kotlin.coroutines.f fVar) {
        L0 l02 = (L0) fVar.a(L0.f52941w);
        if (l02 != null && l02.isCancelled()) {
            return d(th, l02.a0());
        }
        return false;
    }

    private static final boolean d(Throwable th, Throwable th2) {
        if (th2 != null && kotlin.jvm.internal.F.g(th2, th)) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> e(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, long j4, @l3.d X2.p<? super Throwable, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        if (j4 > 0) {
            return C2284k.x1(interfaceC2282i, new d(j4, pVar, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j4).toString());
    }

    public static /* synthetic */ InterfaceC2282i f(InterfaceC2282i interfaceC2282i, long j4, X2.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = Long.MAX_VALUE;
        }
        if ((i4 & 2) != 0) {
            pVar = new c(null);
        }
        return C2284k.v1(interfaceC2282i, j4, pVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> g(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.r<? super InterfaceC2283j<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> rVar) {
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(interfaceC2282i, rVar);
    }
}
