package kotlinx.coroutines.flow;

import androidx.core.text.C0755c;
import kotlin.H0;
import kotlin.InterfaceC2084c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class FlowKt__LimitKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {com.harman.analytics.deviceAws.a.f37827j}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53678H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f53679I;

        /* renamed from: J, reason: collision with root package name */
        int f53680J;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53679I = obj;
            this.f53680J |= Integer.MIN_VALUE;
            return FlowKt__LimitKt.b(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class b<T> implements InterfaceC2282i<T> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC2282i f53681E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f53682F;

        public b(InterfaceC2282i interfaceC2282i, int i4) {
            this.f53681E = interfaceC2282i;
            this.f53682F = i4;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2282i
        @l3.e
        public Object a(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            Object l4;
            Object a4 = this.f53681E.a(new c(new Ref.IntRef(), this.f53682F, interfaceC2283j), cVar);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (a4 == l4) {
                return a4;
            }
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    static final class c<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f53683E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f53684F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ InterfaceC2283j<T> f53685G;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f53686H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ c<T> f53687I;

            /* renamed from: J, reason: collision with root package name */
            int f53688J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, kotlin.coroutines.c<? super a> cVar2) {
                super(cVar2);
                this.f53687I = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53686H = obj;
                this.f53688J |= Integer.MIN_VALUE;
                return this.f53687I.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(Ref.IntRef intRef, int i4, InterfaceC2283j<? super T> interfaceC2283j) {
            this.f53683E = intRef;
            this.f53684F = i4;
            this.f53685G = interfaceC2283j;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r6, @l3.d kotlin.coroutines.c<? super kotlin.H0> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.c.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__LimitKt$c$a r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.c.a) r0
                int r1 = r0.f53688J
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53688J = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__LimitKt$c$a r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$c$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f53686H
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f53688J
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.W.n(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.W.n(r7)
                kotlin.jvm.internal.Ref$IntRef r7 = r5.f53683E
                int r2 = r7.f52299E
                int r4 = r5.f53684F
                if (r2 < r4) goto L4a
                kotlinx.coroutines.flow.j<T> r7 = r5.f53685G
                r0.f53688J = r3
                java.lang.Object r6 = r7.f(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                kotlin.H0 r6 = kotlin.H0.f51801a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.f52299E = r2
                kotlin.H0 r6 = kotlin.H0.f51801a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.c.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class d<T> implements InterfaceC2282i<T> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC2282i f53694E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ X2.p f53695F;

        public d(InterfaceC2282i interfaceC2282i, X2.p pVar) {
            this.f53694E = interfaceC2282i;
            this.f53695F = pVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2282i
        @l3.e
        public Object a(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            Object l4;
            Object a4 = this.f53694E.a(new e(new Ref.BooleanRef(), interfaceC2283j, this.f53695F), cVar);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (a4 == l4) {
                return a4;
            }
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    static final class e<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f53696E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ InterfaceC2283j<T> f53697F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ X2.p<T, kotlin.coroutines.c<? super Boolean>, Object> f53698G;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {37, 38, 40}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: H, reason: collision with root package name */
            Object f53699H;

            /* renamed from: I, reason: collision with root package name */
            Object f53700I;

            /* renamed from: J, reason: collision with root package name */
            /* synthetic */ Object f53701J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ e<T> f53702K;

            /* renamed from: L, reason: collision with root package name */
            int f53703L;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(e<? super T> eVar, kotlin.coroutines.c<? super a> cVar) {
                super(cVar);
                this.f53702K = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53701J = obj;
                this.f53703L |= Integer.MIN_VALUE;
                return this.f53702K.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(Ref.BooleanRef booleanRef, InterfaceC2283j<? super T> interfaceC2283j, X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
            this.f53696E = booleanRef;
            this.f53697F = interfaceC2283j;
            this.f53698G = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r7, @l3.d kotlin.coroutines.c<? super kotlin.H0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.e.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__LimitKt$e$a r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.e.a) r0
                int r1 = r0.f53703L
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53703L = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__LimitKt$e$a r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$e$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f53701J
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f53703L
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                kotlin.W.n(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f53700I
                java.lang.Object r2 = r0.f53699H
                kotlinx.coroutines.flow.FlowKt__LimitKt$e r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt.e) r2
                kotlin.W.n(r8)
                goto L6c
            L41:
                kotlin.W.n(r8)
                goto L59
            L45:
                kotlin.W.n(r8)
                kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f53696E
                boolean r8 = r8.f52294E
                if (r8 == 0) goto L5c
                kotlinx.coroutines.flow.j<T> r8 = r6.f53697F
                r0.f53703L = r5
                java.lang.Object r7 = r8.f(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                kotlin.H0 r7 = kotlin.H0.f51801a
                return r7
            L5c:
                X2.p<T, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f53698G
                r0.f53699H = r6
                r0.f53700I = r7
                r0.f53703L = r4
                java.lang.Object r8 = r8.c0(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f53696E
                r8.f52294E = r5
                kotlinx.coroutines.flow.j<T> r8 = r2.f53697F
                r2 = 0
                r0.f53699H = r2
                r0.f53700I = r2
                r0.f53703L = r3
                java.lang.Object r7 = r8.f(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                kotlin.H0 r7 = kotlin.H0.f51801a
                return r7
            L8b:
                kotlin.H0 r7 = kotlin.H0.f51801a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.e.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {73}, m = "emitAbort$FlowKt__LimitKt", n = {"$this$emitAbort"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class f<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53704H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f53705I;

        /* renamed from: J, reason: collision with root package name */
        int f53706J;

        f(kotlin.coroutines.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53705I = obj;
            this.f53706J |= Integer.MIN_VALUE;
            return FlowKt__LimitKt.f(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class g<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f53707E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f53708F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ InterfaceC2283j<T> f53709G;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {kotlinx.coroutines.internal.B.f54416q, C0755c.f12913k}, m = "emit", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f53710H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ g<T> f53711I;

            /* renamed from: J, reason: collision with root package name */
            int f53712J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(g<? super T> gVar, kotlin.coroutines.c<? super a> cVar) {
                super(cVar);
                this.f53711I = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53710H = obj;
                this.f53712J |= Integer.MIN_VALUE;
                return this.f53711I.f(null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Ref.IntRef intRef, int i4, InterfaceC2283j<? super T> interfaceC2283j) {
            this.f53707E = intRef;
            this.f53708F = i4;
            this.f53709G = interfaceC2283j;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r6, @l3.d kotlin.coroutines.c<? super kotlin.H0> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.g.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__LimitKt$g$a r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.g.a) r0
                int r1 = r0.f53712J
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53712J = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__LimitKt$g$a r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$g$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f53710H
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f53712J
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.W.n(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                kotlin.W.n(r7)
                goto L51
            L38:
                kotlin.W.n(r7)
                kotlin.jvm.internal.Ref$IntRef r7 = r5.f53707E
                int r2 = r7.f52299E
                int r2 = r2 + r4
                r7.f52299E = r2
                int r7 = r5.f53708F
                if (r2 >= r7) goto L54
                kotlinx.coroutines.flow.j<T> r7 = r5.f53709G
                r0.f53712J = r4
                java.lang.Object r6 = r7.f(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                kotlin.H0 r6 = kotlin.H0.f51801a
                return r6
            L54:
                kotlinx.coroutines.flow.j<T> r7 = r5.f53709G
                r0.f53712J = r3
                java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt__LimitKt.a(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                kotlin.H0 r6 = kotlin.H0.f51801a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.g.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r4, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @l3.d kotlin.coroutines.c<? super kotlin.H0> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$a r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.a) r0
            int r1 = r0.f53680J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53680J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$a r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f53679I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53680J
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f53678H
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r4 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1) r4
            kotlin.W.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L4c
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.W.n(r6)
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r6 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1
            r6.<init>(r5)
            r0.f53678H = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            r0.f53680J = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            java.lang.Object r4 = r4.a(r6, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            if (r4 != r1) goto L4f
            return r1
        L4a:
            r5 = move-exception
            r4 = r6
        L4c:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
        L4f:
            kotlin.H0 r4 = kotlin.H0.f51801a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.b(kotlinx.coroutines.flow.i, X2.p, kotlin.coroutines.c):java.lang.Object");
    }

    private static final <T> Object c(InterfaceC2282i<? extends T> interfaceC2282i, X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.c<? super H0> cVar) {
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = new FlowKt__LimitKt$collectWhile$collector$1(pVar);
        try {
            kotlin.jvm.internal.C.e(0);
            interfaceC2282i.a(flowKt__LimitKt$collectWhile$collector$1, cVar);
            kotlin.jvm.internal.C.e(1);
        } catch (AbortFlowException e4) {
            kotlinx.coroutines.flow.internal.o.b(e4, flowKt__LimitKt$collectWhile$collector$1);
        }
        return H0.f51801a;
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> d(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, int i4) {
        if (i4 >= 0) {
            return new b(interfaceC2282i, i4);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i4).toString());
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> e(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return new d(interfaceC2282i, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object f(kotlinx.coroutines.flow.InterfaceC2283j<? super T> r4, T r5, kotlin.coroutines.c<? super kotlin.H0> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.f
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$f r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.f) r0
            int r1 = r0.f53706J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53706J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$f r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f53705I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53706J
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f53704H
            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.InterfaceC2283j) r4
            kotlin.W.n(r6)
            goto L43
        L35:
            kotlin.W.n(r6)
            r0.f53704H = r4
            r0.f53706J = r3
            java.lang.Object r5 = r4.f(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.f(kotlinx.coroutines.flow.j, java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> g(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, int i4) {
        if (i4 > 0) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(interfaceC2282i, i4);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " should be positive").toString());
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> h(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(interfaceC2282i, pVar);
    }

    @l3.d
    public static final <T, R> InterfaceC2282i<R> i(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @InterfaceC2084c @l3.d X2.q<? super InterfaceC2283j<? super R>, ? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> qVar) {
        return C2284k.I0(new FlowKt__LimitKt$transformWhile$1(interfaceC2282i, qVar, null));
    }
}
