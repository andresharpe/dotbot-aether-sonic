package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.InterfaceC2084c;
import kotlin.U;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class FlowKt__EmittersKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {216}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53599H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f53600I;

        /* renamed from: J, reason: collision with root package name */
        int f53601J;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53600I = obj;
            this.f53601J |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt.c(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f53602E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ InterfaceC2283j<T> f53603F;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", i = {}, l = {185}, m = "emit", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f53604H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ b<T> f53605I;

            /* renamed from: J, reason: collision with root package name */
            int f53606J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, kotlin.coroutines.c<? super a> cVar) {
                super(cVar);
                this.f53605I = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53604H = obj;
                this.f53606J |= Integer.MIN_VALUE;
                return this.f53605I.f(null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Ref.BooleanRef booleanRef, InterfaceC2283j<? super T> interfaceC2283j) {
            this.f53602E = booleanRef;
            this.f53603F = interfaceC2283j;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__EmittersKt$b$a r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt.b.a) r0
                int r1 = r0.f53606J
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53606J = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__EmittersKt$b$a r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$b$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f53604H
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f53606J
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.W.n(r6)
                goto L44
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.W.n(r6)
                kotlin.jvm.internal.Ref$BooleanRef r6 = r4.f53602E
                r2 = 0
                r6.f52294E = r2
                kotlinx.coroutines.flow.j<T> r6 = r4.f53603F
                r0.f53606J = r3
                java.lang.Object r5 = r6.f(r5, r0)
                if (r5 != r1) goto L44
                return r1
            L44:
                kotlin.H0 r5 = kotlin.H0.f51801a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.b.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    public static final void b(@l3.d InterfaceC2283j<?> interfaceC2283j) {
        if (!(interfaceC2283j instanceof N)) {
        } else {
            throw ((N) interfaceC2283j).f54086E;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(kotlinx.coroutines.flow.InterfaceC2283j<? super T> r4, X2.q<? super kotlinx.coroutines.flow.InterfaceC2283j<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.c<? super kotlin.H0>, ? extends java.lang.Object> r5, java.lang.Throwable r6, kotlin.coroutines.c<? super kotlin.H0> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__EmittersKt$a r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt.a) r0
            int r1 = r0.f53601J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53601J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$a r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f53600I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53601J
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f53599H
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.W.n(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.W.n(r7)
            r0.f53599H = r6     // Catch: java.lang.Throwable -> L2e
            r0.f53601J = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.z(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            kotlin.H0 r4 = kotlin.H0.f51801a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            kotlin.C2209o.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.c(kotlinx.coroutines.flow.j, X2.q, java.lang.Throwable, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> d(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.q<? super InterfaceC2283j<? super T>, ? super Throwable, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(interfaceC2282i, qVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> e(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super InterfaceC2283j<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(interfaceC2282i, pVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> f(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super InterfaceC2283j<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(pVar, interfaceC2282i);
    }

    @l3.d
    public static final <T, R> InterfaceC2282i<R> g(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @InterfaceC2084c @l3.d X2.q<? super InterfaceC2283j<? super R>, ? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar) {
        return C2284k.I0(new FlowKt__EmittersKt$transform$1(interfaceC2282i, qVar, null));
    }

    @l3.d
    @U
    public static final <T, R> InterfaceC2282i<R> h(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @InterfaceC2084c @l3.d X2.q<? super InterfaceC2283j<? super R>, ? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar) {
        return new FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(interfaceC2282i, qVar);
    }
}
