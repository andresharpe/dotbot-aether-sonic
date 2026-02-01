package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.H0;
import kotlin.W;
import kotlin.collections.M;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.F;
import kotlinx.coroutines.channels.InterfaceC2254m;
import kotlinx.coroutines.channels.J;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;
import kotlinx.coroutines.internal.X;

/* loaded from: classes2.dex */
public final class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {57, 79, com.clj.fastble.data.c.f27052C}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    /* loaded from: classes2.dex */
    public static final class a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        Object f54184I;

        /* renamed from: J, reason: collision with root package name */
        Object f54185J;

        /* renamed from: K, reason: collision with root package name */
        int f54186K;

        /* renamed from: L, reason: collision with root package name */
        int f54187L;

        /* renamed from: M, reason: collision with root package name */
        int f54188M;

        /* renamed from: N, reason: collision with root package name */
        private /* synthetic */ Object f54189N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ InterfaceC2282i<T>[] f54190O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ X2.a<T[]> f54191P;

        /* renamed from: Q, reason: collision with root package name */
        final /* synthetic */ X2.q<InterfaceC2283j<? super R>, T[], kotlin.coroutines.c<? super H0>, Object> f54192Q;

        /* renamed from: R, reason: collision with root package name */
        final /* synthetic */ InterfaceC2283j<R> f54193R;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0492a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f54194I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ InterfaceC2282i<T>[] f54195J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ int f54196K;

            /* renamed from: L, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f54197L;

            /* renamed from: M, reason: collision with root package name */
            final /* synthetic */ InterfaceC2254m<M<Object>> f54198M;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: kotlinx.coroutines.flow.internal.k$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0493a<T> implements InterfaceC2283j {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ InterfaceC2254m<M<Object>> f54199E;

                /* renamed from: F, reason: collision with root package name */
                final /* synthetic */ int f54200F;

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {35, 36}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.internal.k$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0494a extends ContinuationImpl {

                    /* renamed from: H, reason: collision with root package name */
                    /* synthetic */ Object f54201H;

                    /* renamed from: I, reason: collision with root package name */
                    final /* synthetic */ C0493a<T> f54202I;

                    /* renamed from: J, reason: collision with root package name */
                    int f54203J;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0494a(C0493a<? super T> c0493a, kotlin.coroutines.c<? super C0494a> cVar) {
                        super(cVar);
                        this.f54202I = c0493a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f54201H = obj;
                        this.f54203J |= Integer.MIN_VALUE;
                        return this.f54202I.f(null, this);
                    }
                }

                C0493a(InterfaceC2254m<M<Object>> interfaceC2254m, int i4) {
                    this.f54199E = interfaceC2254m;
                    this.f54200F = i4;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.InterfaceC2283j
                @l3.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(T r7, @l3.d kotlin.coroutines.c<? super kotlin.H0> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.k.a.C0492a.C0493a.C0494a
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.internal.k$a$a$a$a r0 = (kotlinx.coroutines.flow.internal.k.a.C0492a.C0493a.C0494a) r0
                        int r1 = r0.f54203J
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f54203J = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.k$a$a$a$a r0 = new kotlinx.coroutines.flow.internal.k$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f54201H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f54203J
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.W.n(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        kotlin.W.n(r8)
                        goto L4d
                    L38:
                        kotlin.W.n(r8)
                        kotlinx.coroutines.channels.m<kotlin.collections.M<java.lang.Object>> r8 = r6.f54199E
                        kotlin.collections.M r2 = new kotlin.collections.M
                        int r5 = r6.f54200F
                        r2.<init>(r5, r7)
                        r0.f54203J = r4
                        java.lang.Object r7 = r8.U(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f54203J = r3
                        java.lang.Object r7 = kotlinx.coroutines.B1.a(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        kotlin.H0 r7 = kotlin.H0.f51801a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.a.C0492a.C0493a.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0492a(InterfaceC2282i<? extends T>[] interfaceC2282iArr, int i4, AtomicInteger atomicInteger, InterfaceC2254m<M<Object>> interfaceC2254m, kotlin.coroutines.c<? super C0492a> cVar) {
                super(2, cVar);
                this.f54195J = interfaceC2282iArr;
                this.f54196K = i4;
                this.f54197L = atomicInteger;
                this.f54198M = interfaceC2254m;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                AtomicInteger atomicInteger;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f54194I;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            W.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        W.n(obj);
                        InterfaceC2282i[] interfaceC2282iArr = this.f54195J;
                        int i5 = this.f54196K;
                        InterfaceC2282i interfaceC2282i = interfaceC2282iArr[i5];
                        C0493a c0493a = new C0493a(this.f54198M, i5);
                        this.f54194I = 1;
                        if (interfaceC2282i.a(c0493a, this) == l4) {
                            return l4;
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        J.a.a(this.f54198M, null, 1, null);
                    }
                    return H0.f51801a;
                } finally {
                    if (this.f54197L.decrementAndGet() == 0) {
                        J.a.a(this.f54198M, null, 1, null);
                    }
                }
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((C0492a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new C0492a(this.f54195J, this.f54196K, this.f54197L, this.f54198M, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC2282i<? extends T>[] interfaceC2282iArr, X2.a<T[]> aVar, X2.q<? super InterfaceC2283j<? super R>, ? super T[], ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar, InterfaceC2283j<? super R> interfaceC2283j, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f54190O = interfaceC2282iArr;
            this.f54191P = aVar;
            this.f54192Q = qVar;
            this.f54193R = interfaceC2283j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ef A[EDGE_INSN: B:38:0x00ef->B:27:0x00ef BREAK  A[LOOP:0: B:19:0x00ca->B:37:?], SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v0, types: [kotlinx.coroutines.flow.i<T>[], kotlinx.coroutines.flow.i[]] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.flow.i<T>[]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0135 -> B:10:0x0137). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.a.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            a aVar = new a(this.f54190O, this.f54191P, this.f54192Q, this.f54193R, cVar);
            aVar.f54189N = obj;
            return aVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes2.dex */
    public static final class b<R> implements InterfaceC2282i<R> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC2282i f54204E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ InterfaceC2282i f54205F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ X2.q f54206G;

        public b(InterfaceC2282i interfaceC2282i, InterfaceC2282i interfaceC2282i2, X2.q qVar) {
            this.f54204E = interfaceC2282i;
            this.f54205F = interfaceC2282i2;
            this.f54206G = qVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2282i
        @l3.e
        public Object a(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            Object l4;
            Object g4 = V.g(new c(interfaceC2283j, this.f54204E, this.f54205F, this.f54206G, null), cVar);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (g4 == l4) {
                return g4;
            }
            return H0.f51801a;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {129}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    static final class c extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f54207I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f54208J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ InterfaceC2283j<R> f54209K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ InterfaceC2282i<T2> f54210L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ InterfaceC2282i<T1> f54211M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ X2.q<T1, T2, kotlin.coroutines.c<? super R>, Object> f54212N;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements X2.l<Throwable, H0> {

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ C f54213F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ InterfaceC2283j<R> f54214G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(C c4, InterfaceC2283j<? super R> interfaceC2283j) {
                super(1);
                this.f54213F = c4;
                this.f54214G = interfaceC2283j;
            }

            @Override // X2.l
            public /* bridge */ /* synthetic */ H0 C(Throwable th) {
                c(th);
                return H0.f51801a;
            }

            public final void c(@l3.e Throwable th) {
                if (this.f54213F.c()) {
                    this.f54213F.f(new AbortFlowException(this.f54214G));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class b extends SuspendLambda implements X2.p<H0, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f54215I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ InterfaceC2282i<T1> f54216J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.f f54217K;

            /* renamed from: L, reason: collision with root package name */
            final /* synthetic */ Object f54218L;

            /* renamed from: M, reason: collision with root package name */
            final /* synthetic */ F<Object> f54219M;

            /* renamed from: N, reason: collision with root package name */
            final /* synthetic */ InterfaceC2283j<R> f54220N;

            /* renamed from: O, reason: collision with root package name */
            final /* synthetic */ X2.q<T1, T2, kotlin.coroutines.c<? super R>, Object> f54221O;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes2.dex */
            public static final class a<T> implements InterfaceC2283j {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ kotlin.coroutines.f f54222E;

                /* renamed from: F, reason: collision with root package name */
                final /* synthetic */ Object f54223F;

                /* renamed from: G, reason: collision with root package name */
                final /* synthetic */ F<Object> f54224G;

                /* renamed from: H, reason: collision with root package name */
                final /* synthetic */ InterfaceC2283j<R> f54225H;

                /* renamed from: I, reason: collision with root package name */
                final /* synthetic */ X2.q<T1, T2, kotlin.coroutines.c<? super R>, Object> f54226I;

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {132, 135, 135}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.internal.k$c$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0495a extends SuspendLambda implements X2.p<H0, kotlin.coroutines.c<? super H0>, Object> {

                    /* renamed from: I, reason: collision with root package name */
                    Object f54227I;

                    /* renamed from: J, reason: collision with root package name */
                    int f54228J;

                    /* renamed from: K, reason: collision with root package name */
                    final /* synthetic */ F<Object> f54229K;

                    /* renamed from: L, reason: collision with root package name */
                    final /* synthetic */ InterfaceC2283j<R> f54230L;

                    /* renamed from: M, reason: collision with root package name */
                    final /* synthetic */ X2.q<T1, T2, kotlin.coroutines.c<? super R>, Object> f54231M;

                    /* renamed from: N, reason: collision with root package name */
                    final /* synthetic */ T1 f54232N;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0495a(F<? extends Object> f4, InterfaceC2283j<? super R> interfaceC2283j, X2.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, T1 t12, kotlin.coroutines.c<? super C0495a> cVar) {
                        super(2, cVar);
                        this.f54229K = f4;
                        this.f54230L = interfaceC2283j;
                        this.f54231M = qVar;
                        this.f54232N = t12;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x006e A[RETURN] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object D(@l3.d java.lang.Object r9) {
                        /*
                            r8 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                            int r1 = r8.f54228J
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L30
                            if (r1 == r5) goto L26
                            if (r1 == r4) goto L1e
                            if (r1 != r3) goto L16
                            kotlin.W.n(r9)
                            goto L6f
                        L16:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L1e:
                            java.lang.Object r1 = r8.f54227I
                            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC2283j) r1
                            kotlin.W.n(r9)
                            goto L64
                        L26:
                            kotlin.W.n(r9)
                            kotlinx.coroutines.channels.q r9 = (kotlinx.coroutines.channels.q) r9
                            java.lang.Object r9 = r9.o()
                            goto L3e
                        L30:
                            kotlin.W.n(r9)
                            kotlinx.coroutines.channels.F<java.lang.Object> r9 = r8.f54229K
                            r8.f54228J = r5
                            java.lang.Object r9 = r9.E(r8)
                            if (r9 != r0) goto L3e
                            return r0
                        L3e:
                            kotlinx.coroutines.flow.j<R> r1 = r8.f54230L
                            boolean r5 = r9 instanceof kotlinx.coroutines.channels.q.c
                            if (r5 == 0) goto L50
                            java.lang.Throwable r9 = kotlinx.coroutines.channels.q.f(r9)
                            if (r9 != 0) goto L4f
                            kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                            r9.<init>(r1)
                        L4f:
                            throw r9
                        L50:
                            X2.q<T1, T2, kotlin.coroutines.c<? super R>, java.lang.Object> r5 = r8.f54231M
                            T1 r6 = r8.f54232N
                            kotlinx.coroutines.internal.S r7 = kotlinx.coroutines.flow.internal.s.f54253a
                            if (r9 != r7) goto L59
                            r9 = r2
                        L59:
                            r8.f54227I = r1
                            r8.f54228J = r4
                            java.lang.Object r9 = r5.z(r6, r9, r8)
                            if (r9 != r0) goto L64
                            return r0
                        L64:
                            r8.f54227I = r2
                            r8.f54228J = r3
                            java.lang.Object r9 = r1.f(r9, r8)
                            if (r9 != r0) goto L6f
                            return r0
                        L6f:
                            kotlin.H0 r9 = kotlin.H0.f51801a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.c.b.a.C0495a.D(java.lang.Object):java.lang.Object");
                    }

                    @Override // X2.p
                    @l3.e
                    /* renamed from: R, reason: merged with bridge method [inline-methods] */
                    public final Object c0(@l3.d H0 h02, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                        return ((C0495a) v(h02, cVar)).D(H0.f51801a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.d
                    public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                        return new C0495a(this.f54229K, this.f54230L, this.f54231M, this.f54232N, cVar);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {131}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.internal.k$c$b$a$b, reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0496b extends ContinuationImpl {

                    /* renamed from: H, reason: collision with root package name */
                    /* synthetic */ Object f54233H;

                    /* renamed from: I, reason: collision with root package name */
                    final /* synthetic */ a<T> f54234I;

                    /* renamed from: J, reason: collision with root package name */
                    int f54235J;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0496b(a<? super T> aVar, kotlin.coroutines.c<? super C0496b> cVar) {
                        super(cVar);
                        this.f54234I = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f54233H = obj;
                        this.f54235J |= Integer.MIN_VALUE;
                        return this.f54234I.f(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                a(kotlin.coroutines.f fVar, Object obj, F<? extends Object> f4, InterfaceC2283j<? super R> interfaceC2283j, X2.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
                    this.f54222E = fVar;
                    this.f54223F = obj;
                    this.f54224G = f4;
                    this.f54225H = interfaceC2283j;
                    this.f54226I = qVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC2283j
                @l3.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(T1 r13, @l3.d kotlin.coroutines.c<? super kotlin.H0> r14) {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.k.c.b.a.C0496b
                        if (r0 == 0) goto L13
                        r0 = r14
                        kotlinx.coroutines.flow.internal.k$c$b$a$b r0 = (kotlinx.coroutines.flow.internal.k.c.b.a.C0496b) r0
                        int r1 = r0.f54235J
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f54235J = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.k$c$b$a$b r0 = new kotlinx.coroutines.flow.internal.k$c$b$a$b
                        r0.<init>(r12, r14)
                    L18:
                        java.lang.Object r14 = r0.f54233H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f54235J
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.W.n(r14)
                        goto L51
                    L29:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        throw r13
                    L31:
                        kotlin.W.n(r14)
                        kotlin.coroutines.f r14 = r12.f54222E
                        kotlin.H0 r2 = kotlin.H0.f51801a
                        java.lang.Object r4 = r12.f54223F
                        kotlinx.coroutines.flow.internal.k$c$b$a$a r11 = new kotlinx.coroutines.flow.internal.k$c$b$a$a
                        kotlinx.coroutines.channels.F<java.lang.Object> r6 = r12.f54224G
                        kotlinx.coroutines.flow.j<R> r7 = r12.f54225H
                        X2.q<T1, T2, kotlin.coroutines.c<? super R>, java.lang.Object> r8 = r12.f54226I
                        r10 = 0
                        r5 = r11
                        r9 = r13
                        r5.<init>(r6, r7, r8, r9, r10)
                        r0.f54235J = r3
                        java.lang.Object r13 = kotlinx.coroutines.flow.internal.e.c(r14, r2, r4, r11, r0)
                        if (r13 != r1) goto L51
                        return r1
                    L51:
                        kotlin.H0 r13 = kotlin.H0.f51801a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.c.b.a.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(InterfaceC2282i<? extends T1> interfaceC2282i, kotlin.coroutines.f fVar, Object obj, F<? extends Object> f4, InterfaceC2283j<? super R> interfaceC2283j, X2.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, kotlin.coroutines.c<? super b> cVar) {
                super(2, cVar);
                this.f54216J = interfaceC2282i;
                this.f54217K = fVar;
                this.f54218L = obj;
                this.f54219M = f4;
                this.f54220N = interfaceC2283j;
                this.f54221O = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f54215I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    InterfaceC2282i<T1> interfaceC2282i = this.f54216J;
                    a aVar = new a(this.f54217K, this.f54218L, this.f54219M, this.f54220N, this.f54221O);
                    this.f54215I = 1;
                    if (interfaceC2282i.a(aVar, this) == l4) {
                        return l4;
                    }
                }
                return H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d H0 h02, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((b) v(h02, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new b(this.f54216J, this.f54217K, this.f54218L, this.f54219M, this.f54220N, this.f54221O, cVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.k$c$c, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0497c extends SuspendLambda implements X2.p<D<? super Object>, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f54236I;

            /* renamed from: J, reason: collision with root package name */
            private /* synthetic */ Object f54237J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ InterfaceC2282i<T2> f54238K;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: kotlinx.coroutines.flow.internal.k$c$c$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements InterfaceC2283j {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ D<Object> f54239E;

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {93}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.internal.k$c$c$a$a, reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0498a extends ContinuationImpl {

                    /* renamed from: H, reason: collision with root package name */
                    /* synthetic */ Object f54240H;

                    /* renamed from: I, reason: collision with root package name */
                    final /* synthetic */ a<T> f54241I;

                    /* renamed from: J, reason: collision with root package name */
                    int f54242J;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0498a(a<? super T> aVar, kotlin.coroutines.c<? super C0498a> cVar) {
                        super(cVar);
                        this.f54241I = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f54240H = obj;
                        this.f54242J |= Integer.MIN_VALUE;
                        return this.f54241I.f(null, this);
                    }
                }

                a(D<Object> d4) {
                    this.f54239E = d4;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC2283j
                @l3.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(T2 r5, @l3.d kotlin.coroutines.c<? super kotlin.H0> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.internal.k.c.C0497c.a.C0498a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.internal.k$c$c$a$a r0 = (kotlinx.coroutines.flow.internal.k.c.C0497c.a.C0498a) r0
                        int r1 = r0.f54242J
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f54242J = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.k$c$c$a$a r0 = new kotlinx.coroutines.flow.internal.k$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f54240H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f54242J
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.W.n(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.W.n(r6)
                        kotlinx.coroutines.channels.D<java.lang.Object> r6 = r4.f54239E
                        kotlinx.coroutines.channels.J r6 = r6.h()
                        if (r5 != 0) goto L3e
                        kotlinx.coroutines.internal.S r5 = kotlinx.coroutines.flow.internal.s.f54253a
                    L3e:
                        r0.f54242J = r3
                        java.lang.Object r5 = r6.U(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        kotlin.H0 r5 = kotlin.H0.f51801a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.k.c.C0497c.a.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0497c(InterfaceC2282i<? extends T2> interfaceC2282i, kotlin.coroutines.c<? super C0497c> cVar) {
                super(2, cVar);
                this.f54238K = interfaceC2282i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f54236I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    D d4 = (D) this.f54237J;
                    InterfaceC2282i<T2> interfaceC2282i = this.f54238K;
                    a aVar = new a(d4);
                    this.f54236I = 1;
                    if (interfaceC2282i.a(aVar, this) == l4) {
                        return l4;
                    }
                }
                return H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d D<Object> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((C0497c) v(d4, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                C0497c c0497c = new C0497c(this.f54238K, cVar);
                c0497c.f54237J = obj;
                return c0497c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC2283j<? super R> interfaceC2283j, InterfaceC2282i<? extends T2> interfaceC2282i, InterfaceC2282i<? extends T1> interfaceC2282i2, X2.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f54209K = interfaceC2283j;
            this.f54210L = interfaceC2282i;
            this.f54211M = interfaceC2282i2;
            this.f54212N = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.channels.F] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.channels.F] */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            C c4;
            F f4;
            F f5;
            kotlin.coroutines.f A3;
            H0 h02;
            b bVar;
            l4 = kotlin.coroutines.intrinsics.b.l();
            ?? r12 = this.f54207I;
            try {
                if (r12 != 0) {
                    if (r12 == 1) {
                        f5 = (F) this.f54208J;
                        try {
                            W.n(obj);
                            r12 = f5;
                        } catch (AbortFlowException e4) {
                            e = e4;
                        }
                        F.a.b(r12, null, 1, null);
                        return H0.f51801a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                W.n(obj);
                U u3 = (U) this.f54208J;
                F f6 = B.f(u3, null, 0, new C0497c(this.f54210L, null), 3, null);
                c4 = Q0.c(null, 1, null);
                ((J) f6).g(new a(c4, this.f54209K));
                try {
                    kotlin.coroutines.f coroutineContext = u3.getCoroutineContext();
                    Object b4 = X.b(coroutineContext);
                    A3 = u3.getCoroutineContext().A(c4);
                    h02 = H0.f51801a;
                    bVar = new b(this.f54211M, coroutineContext, b4, f6, this.f54209K, this.f54212N, null);
                    this.f54208J = f6;
                    this.f54207I = 1;
                    f4 = f6;
                    try {
                    } catch (AbortFlowException e5) {
                        e = e5;
                        f5 = f4;
                        o.b(e, this.f54209K);
                        r12 = f5;
                        F.a.b(r12, null, 1, null);
                        return H0.f51801a;
                    } catch (Throwable th) {
                        th = th;
                        r12 = f4;
                        F.a.b(r12, null, 1, null);
                        throw th;
                    }
                } catch (AbortFlowException e6) {
                    e = e6;
                    f4 = f6;
                } catch (Throwable th2) {
                    th = th2;
                    f4 = f6;
                }
                if (e.d(A3, h02, null, bVar, this, 4, null) == l4) {
                    return l4;
                }
                r12 = f4;
                F.a.b(r12, null, 1, null);
                return H0.f51801a;
                o.b(e, this.f54209K);
                r12 = f5;
                F.a.b(r12, null, 1, null);
                return H0.f51801a;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((c) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            c cVar2 = new c(this.f54209K, this.f54210L, this.f54211M, this.f54212N, cVar);
            cVar2.f54208J = obj;
            return cVar2;
        }
    }

    @l3.e
    @kotlin.U
    public static final <R, T> Object a(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.d InterfaceC2282i<? extends T>[] interfaceC2282iArr, @l3.d X2.a<T[]> aVar, @l3.d X2.q<? super InterfaceC2283j<? super R>, ? super T[], ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object a4 = n.a(new a(interfaceC2282iArr, aVar, qVar, interfaceC2283j, null), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }

    @l3.d
    public static final <T1, T2, R> InterfaceC2282i<R> b(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d X2.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return new b(interfaceC2282i2, interfaceC2282i, qVar);
    }
}
