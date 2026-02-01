package kotlinx.coroutines.flow;

import com.harman.sdk.message.GestureInfo;
import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class a<T> implements InterfaceC2283j<T> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f53775E;

        public a(Ref.ObjectRef objectRef) {
            this.f53775E = objectRef;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        public Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            this.f53775E.f52301E = t3;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class b<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53776H;

        /* renamed from: I, reason: collision with root package name */
        Object f53777I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f53778J;

        /* renamed from: K, reason: collision with root package name */
        int f53779K;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53778J = obj;
            this.f53779K |= Integer.MIN_VALUE;
            return C2284k.u0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {183}, m = "first", n = {"predicate", "result", "collector$iv"}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes2.dex */
    public static final class c<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53780H;

        /* renamed from: I, reason: collision with root package name */
        Object f53781I;

        /* renamed from: J, reason: collision with root package name */
        Object f53782J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f53783K;

        /* renamed from: L, reason: collision with root package name */
        int f53784L;

        c(kotlin.coroutines.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53783K = obj;
            this.f53784L |= Integer.MIN_VALUE;
            return C2284k.t0(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class d<T> implements InterfaceC2283j<T> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f53785E;

        public d(Ref.ObjectRef objectRef) {
            this.f53785E = objectRef;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        public Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            this.f53785E.f52301E = t3;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class e<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53786H;

        /* renamed from: I, reason: collision with root package name */
        Object f53787I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f53788J;

        /* renamed from: K, reason: collision with root package name */
        int f53789K;

        e(kotlin.coroutines.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53788J = obj;
            this.f53789K |= Integer.MIN_VALUE;
            return C2284k.w0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class f<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53790H;

        /* renamed from: I, reason: collision with root package name */
        Object f53791I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f53792J;

        /* renamed from: K, reason: collision with root package name */
        int f53793K;

        f(kotlin.coroutines.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53792J = obj;
            this.f53793K |= Integer.MIN_VALUE;
            return C2284k.v0(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {44}, m = "fold", n = {"accumulator"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class g<T, R> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53800H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f53801I;

        /* renamed from: J, reason: collision with root package name */
        int f53802J;

        g(kotlin.coroutines.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53801I = obj;
            this.f53802J |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt.e(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {155}, m = "last", n = {"result"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class h<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53803H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f53804I;

        /* renamed from: J, reason: collision with root package name */
        int f53805J;

        h(kotlin.coroutines.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53804I = obj;
            this.f53805J |= Integer.MIN_VALUE;
            return C2284k.S0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class i<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Object> f53806E;

        i(Ref.ObjectRef<Object> objectRef) {
            this.f53806E = objectRef;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        public final Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            this.f53806E.f52301E = t3;
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {GestureInfo.f48264x0}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class j<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53807H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f53808I;

        /* renamed from: J, reason: collision with root package name */
        int f53809J;

        j(kotlin.coroutines.c<? super j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53808I = obj;
            this.f53809J |= Integer.MIN_VALUE;
            return C2284k.T0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class k<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<T> f53810E;

        k(Ref.ObjectRef<T> objectRef) {
            this.f53810E = objectRef;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        public final Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            this.f53810E.f52301E = t3;
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {22}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class l<S, T extends S> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53811H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f53812I;

        /* renamed from: J, reason: collision with root package name */
        int f53813J;

        l(kotlin.coroutines.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53812I = obj;
            this.f53813J |= Integer.MIN_VALUE;
            return C2284k.s1(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class m<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Object> f53814E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ X2.q<S, T, kotlin.coroutines.c<? super S>, Object> f53815F;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: H, reason: collision with root package name */
            Object f53816H;

            /* renamed from: I, reason: collision with root package name */
            /* synthetic */ Object f53817I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ m<T> f53818J;

            /* renamed from: K, reason: collision with root package name */
            int f53819K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(m<? super T> mVar, kotlin.coroutines.c<? super a> cVar) {
                super(cVar);
                this.f53818J = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53817I = obj;
                this.f53819K |= Integer.MIN_VALUE;
                return this.f53818J.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        m(Ref.ObjectRef<Object> objectRef, X2.q<? super S, ? super T, ? super kotlin.coroutines.c<? super S>, ? extends Object> qVar) {
            this.f53814E = objectRef;
            this.f53815F = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r7, @l3.d kotlin.coroutines.c<? super kotlin.H0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.m.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__ReduceKt$m$a r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.m.a) r0
                int r1 = r0.f53819K
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53819K = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__ReduceKt$m$a r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$m$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f53817I
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f53819K
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f53816H
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
                kotlin.W.n(r8)
                goto L50
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                kotlin.W.n(r8)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r8 = r6.f53814E
                T r2 = r8.f52301E
                kotlinx.coroutines.internal.S r4 = kotlinx.coroutines.flow.internal.s.f54253a
                if (r2 == r4) goto L53
                X2.q<S, T, kotlin.coroutines.c<? super S>, java.lang.Object> r4 = r6.f53815F
                r0.f53816H = r8
                r0.f53819K = r3
                java.lang.Object r7 = r4.z(r2, r7, r0)
                if (r7 != r1) goto L4d
                return r1
            L4d:
                r5 = r8
                r8 = r7
                r7 = r5
            L50:
                r5 = r8
                r8 = r7
                r7 = r5
            L53:
                r8.f52301E = r7
                kotlin.H0 r7 = kotlin.H0.f51801a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {57}, m = "single", n = {"result"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class n<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53820H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f53821I;

        /* renamed from: J, reason: collision with root package name */
        int f53822J;

        n(kotlin.coroutines.c<? super n> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53821I = obj;
            this.f53822J |= Integer.MIN_VALUE;
            return C2284k.H1(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class o<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Object> f53823E;

        o(Ref.ObjectRef<Object> objectRef) {
            this.f53823E = objectRef;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        public final Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            Ref.ObjectRef<Object> objectRef = this.f53823E;
            if (objectRef.f52301E == kotlinx.coroutines.flow.internal.s.f54253a) {
                objectRef.f52301E = t3;
                return H0.f51801a;
            }
            throw new IllegalArgumentException("Flow has more than one element".toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class p<T> implements InterfaceC2283j<T> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f53824E;

        public p(Ref.ObjectRef objectRef) {
            this.f53824E = objectRef;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        public Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            Ref.ObjectRef objectRef = this.f53824E;
            T t4 = objectRef.f52301E;
            T t5 = (T) kotlinx.coroutines.flow.internal.s.f54253a;
            if (t4 == t5) {
                objectRef.f52301E = t3;
                return H0.f51801a;
            }
            objectRef.f52301E = t5;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class q<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53825H;

        /* renamed from: I, reason: collision with root package name */
        Object f53826I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f53827J;

        /* renamed from: K, reason: collision with root package name */
        int f53828K;

        q(kotlin.coroutines.c<? super q> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53827J = obj;
            this.f53828K |= Integer.MIN_VALUE;
            return C2284k.I1(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r4, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @l3.d kotlin.coroutines.c<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.c
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$c r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.c) r0
            int r1 = r0.f53784L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53784L = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$c r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f53783K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53784L
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.f53782J
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) r4
            java.lang.Object r5 = r0.f53781I
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r0 = r0.f53780H
            X2.p r0 = (X2.p) r0
            kotlin.W.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            kotlin.W.n(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.internal.S r2 = kotlinx.coroutines.flow.internal.s.f54253a
            r6.f52301E = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2
            r2.<init>(r5, r6)
            r0.f53780H = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f53781I = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f53782J = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f53784L = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            kotlinx.coroutines.flow.internal.o.b(r6, r4)
        L6a:
            T r4 = r5.f52301E
            kotlinx.coroutines.internal.S r5 = kotlinx.coroutines.flow.internal.s.f54253a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.a(kotlinx.coroutines.flow.i, X2.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r4, @l3.d kotlin.coroutines.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.b
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$b r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.b) r0
            int r1 = r0.f53779K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53779K = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$b r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f53778J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53779K
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f53777I
            kotlinx.coroutines.flow.FlowKt__ReduceKt$a r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.a) r4
            java.lang.Object r0 = r0.f53776H
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            kotlin.W.n(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.W.n(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlinx.coroutines.internal.S r2 = kotlinx.coroutines.flow.internal.s.f54253a
            r5.f52301E = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$a r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$a
            r2.<init>(r5)
            r0.f53776H = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f53777I = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f53779K = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
        L62:
            T r4 = r0.f52301E
            kotlinx.coroutines.internal.S r5 = kotlinx.coroutines.flow.internal.s.f54253a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.b(kotlinx.coroutines.flow.i, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r4, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @l3.d kotlin.coroutines.c<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.f
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$f r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.f) r0
            int r1 = r0.f53793K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53793K = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$f r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f53792J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53793K
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f53791I
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) r4
            java.lang.Object r5 = r0.f53790H
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            kotlin.W.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L5e
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.W.n(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2
            r2.<init>(r5, r6)
            r0.f53790H = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f53791I = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f53793K = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L5e
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            kotlinx.coroutines.flow.internal.o.b(r6, r4)
        L5e:
            T r4 = r5.f52301E
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.c(kotlinx.coroutines.flow.i, X2.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r4, @l3.d kotlin.coroutines.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.e
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$e r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.e) r0
            int r1 = r0.f53789K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53789K = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$e r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f53788J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53789K
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f53787I
            kotlinx.coroutines.flow.FlowKt__ReduceKt$d r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.d) r4
            java.lang.Object r0 = r0.f53786H
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            kotlin.W.n(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.W.n(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlinx.coroutines.flow.FlowKt__ReduceKt$d r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$d
            r2.<init>(r5)
            r0.f53786H = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f53787I = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f53789K = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
        L5e:
            T r4 = r0.f52301E
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.d(kotlinx.coroutines.flow.i, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, R> java.lang.Object e(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r4, R r5, @l3.d X2.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends java.lang.Object> r6, @l3.d kotlin.coroutines.c<? super R> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.g
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$g r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.g) r0
            int r1 = r0.f53802J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53802J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$g r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f53801I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53802J
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f53800H
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.W.n(r7)
            goto L50
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.W.n(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r7.f52301E = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2 r5 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2
            r5.<init>(r7, r6)
            r0.f53800H = r7
            r0.f53802J = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = r7
        L50:
            T r4 = r4.f52301E
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.e(kotlinx.coroutines.flow.i, java.lang.Object, X2.q, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> Object f(InterfaceC2282i<? extends T> interfaceC2282i, R r4, X2.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, kotlin.coroutines.c<? super R> cVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f52301E = r4;
        FlowKt__ReduceKt$fold$2 flowKt__ReduceKt$fold$2 = new FlowKt__ReduceKt$fold$2(objectRef, qVar);
        kotlin.jvm.internal.C.e(0);
        interfaceC2282i.a(flowKt__ReduceKt$fold$2, cVar);
        kotlin.jvm.internal.C.e(1);
        return objectRef.f52301E;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object g(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r4, @l3.d kotlin.coroutines.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.h
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$h r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.h) r0
            int r1 = r0.f53805J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53805J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$h r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$h
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f53804I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53805J
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f53803H
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.W.n(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.W.n(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlinx.coroutines.internal.S r2 = kotlinx.coroutines.flow.internal.s.f54253a
            r5.f52301E = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$i r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$i
            r2.<init>(r5)
            r0.f53803H = r5
            r0.f53805J = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.f52301E
            kotlinx.coroutines.internal.S r5 = kotlinx.coroutines.flow.internal.s.f54253a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.g(kotlinx.coroutines.flow.i, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object h(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r4, @l3.d kotlin.coroutines.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.j
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$j r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.j) r0
            int r1 = r0.f53809J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53809J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$j r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$j
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f53808I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53809J
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f53807H
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.W.n(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.W.n(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlinx.coroutines.flow.FlowKt__ReduceKt$k r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$k
            r2.<init>(r5)
            r0.f53807H = r5
            r0.f53809J = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            T r4 = r4.f52301E
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.h(kotlinx.coroutines.flow.i, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.internal.S, T] */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S, T extends S> java.lang.Object i(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r4, @l3.d X2.q<? super S, ? super T, ? super kotlin.coroutines.c<? super S>, ? extends java.lang.Object> r5, @l3.d kotlin.coroutines.c<? super S> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.l
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$l r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.l) r0
            int r1 = r0.f53813J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53813J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$l r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$l
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f53812I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53813J
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f53811H
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.W.n(r6)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.W.n(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.internal.S r2 = kotlinx.coroutines.flow.internal.s.f54253a
            r6.f52301E = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$m r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$m
            r2.<init>(r6, r5)
            r0.f53811H = r6
            r0.f53813J = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r6
        L52:
            T r4 = r4.f52301E
            kotlinx.coroutines.internal.S r5 = kotlinx.coroutines.flow.internal.s.f54253a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Empty flow can't be reduced"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.i(kotlinx.coroutines.flow.i, X2.q, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object j(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r4, @l3.d kotlin.coroutines.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.n
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$n r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.n) r0
            int r1 = r0.f53822J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53822J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$n r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$n
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f53821I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53822J
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f53820H
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.W.n(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.W.n(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlinx.coroutines.internal.S r2 = kotlinx.coroutines.flow.internal.s.f54253a
            r5.f52301E = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$o r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$o
            r2.<init>(r5)
            r0.f53820H = r5
            r0.f53822J = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.f52301E
            kotlinx.coroutines.internal.S r5 = kotlinx.coroutines.flow.internal.s.f54253a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.j(kotlinx.coroutines.flow.i, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object k(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r4, @l3.d kotlin.coroutines.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.q
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$q r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.q) r0
            int r1 = r0.f53828K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53828K = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$q r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$q
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f53827J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53828K
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f53826I
            kotlinx.coroutines.flow.FlowKt__ReduceKt$p r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.p) r4
            java.lang.Object r0 = r0.f53825H
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            kotlin.W.n(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.W.n(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlinx.coroutines.internal.S r2 = kotlinx.coroutines.flow.internal.s.f54253a
            r5.f52301E = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$p r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$p
            r2.<init>(r5)
            r0.f53825H = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f53826I = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f53828K = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
        L62:
            T r4 = r0.f52301E
            kotlinx.coroutines.internal.S r5 = kotlinx.coroutines.flow.internal.s.f54253a
            if (r4 != r5) goto L69
            r4 = 0
        L69:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.k(kotlinx.coroutines.flow.i, kotlin.coroutines.c):java.lang.Object");
    }
}
