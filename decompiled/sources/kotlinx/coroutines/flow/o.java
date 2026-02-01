package kotlinx.coroutines.flow;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class o {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {18}, m = "count", n = {"i"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f54278H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f54279I;

        /* renamed from: J, reason: collision with root package name */
        int f54280J;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f54279I = obj;
            this.f54280J |= Integer.MIN_VALUE;
            return C2284k.Z(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f54281E;

        b(Ref.IntRef intRef) {
            this.f54281E = intRef;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        public final Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            this.f54281E.f52299E++;
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {30}, m = "count", n = {"i"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class c<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f54282H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f54283I;

        /* renamed from: J, reason: collision with root package name */
        int f54284J;

        c(kotlin.coroutines.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f54283I = obj;
            this.f54284J |= Integer.MIN_VALUE;
            return C2284k.Y(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ X2.p<T, kotlin.coroutines.c<? super Boolean>, Object> f54285E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f54286F;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", i = {0}, l = {ConstraintLayout.b.a.f9573F}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: H, reason: collision with root package name */
            Object f54287H;

            /* renamed from: I, reason: collision with root package name */
            /* synthetic */ Object f54288I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ d<T> f54289J;

            /* renamed from: K, reason: collision with root package name */
            int f54290K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, kotlin.coroutines.c<? super a> cVar) {
                super(cVar);
                this.f54289J = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f54288I = obj;
                this.f54290K |= Integer.MIN_VALUE;
                return this.f54289J.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, Ref.IntRef intRef) {
            this.f54285E = pVar;
            this.f54286F = intRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.o.d.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.o$d$a r0 = (kotlinx.coroutines.flow.o.d.a) r0
                int r1 = r0.f54290K
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f54290K = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.o$d$a r0 = new kotlinx.coroutines.flow.o$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f54288I
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f54290K
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f54287H
                kotlinx.coroutines.flow.o$d r5 = (kotlinx.coroutines.flow.o.d) r5
                kotlin.W.n(r6)
                goto L46
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                kotlin.W.n(r6)
                X2.p<T, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f54285E
                r0.f54287H = r4
                r0.f54290K = r3
                java.lang.Object r6 = r6.c0(r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5 = r4
            L46:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L55
                kotlin.jvm.internal.Ref$IntRef r5 = r5.f54286F
                int r6 = r5.f52299E
                int r6 = r6 + r3
                r5.f52299E = r6
            L55:
                kotlin.H0 r5 = kotlin.H0.f51801a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o.d.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r4, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @l3.d kotlin.coroutines.c<? super java.lang.Integer> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.o.c
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.o$c r0 = (kotlinx.coroutines.flow.o.c) r0
            int r1 = r0.f54284J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54284J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.o$c r0 = new kotlinx.coroutines.flow.o$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f54283I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f54284J
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f54282H
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            kotlin.W.n(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.W.n(r6)
            kotlin.jvm.internal.Ref$IntRef r6 = new kotlin.jvm.internal.Ref$IntRef
            r6.<init>()
            kotlinx.coroutines.flow.o$d r2 = new kotlinx.coroutines.flow.o$d
            r2.<init>(r5, r6)
            r0.f54282H = r6
            r0.f54284J = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r6
        L4e:
            int r4 = r4.f52299E
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.f(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o.a(kotlinx.coroutines.flow.i, X2.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r4, @l3.d kotlin.coroutines.c<? super java.lang.Integer> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.o.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.o$a r0 = (kotlinx.coroutines.flow.o.a) r0
            int r1 = r0.f54280J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54280J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.o$a r0 = new kotlinx.coroutines.flow.o$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f54279I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f54280J
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f54278H
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            kotlin.W.n(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.W.n(r5)
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            kotlinx.coroutines.flow.o$b r2 = new kotlinx.coroutines.flow.o$b
            r2.<init>(r5)
            r0.f54278H = r5
            r0.f54280J = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            int r4 = r4.f52299E
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.f(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o.b(kotlinx.coroutines.flow.i, kotlin.coroutines.c):java.lang.Object");
    }
}
