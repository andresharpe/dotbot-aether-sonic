package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1<T> implements InterfaceC2282i<T> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i f53578E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ X2.p f53579F;

    @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {114, 122}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u2d3", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f53580H;

        /* renamed from: I, reason: collision with root package name */
        int f53581I;

        /* renamed from: K, reason: collision with root package name */
        Object f53583K;

        /* renamed from: L, reason: collision with root package name */
        Object f53584L;

        /* renamed from: M, reason: collision with root package name */
        Object f53585M;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53580H = obj;
            this.f53581I |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(InterfaceC2282i interfaceC2282i, X2.p pVar) {
        this.f53578E = interfaceC2282i;
        this.f53579F = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.flow.j, java.lang.Object, kotlinx.coroutines.flow.j<? super T>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2283j<? super T> r7, @l3.d kotlin.coroutines.c<? super kotlin.H0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.f53581I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53581I = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f53580H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53581I
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f53583K
            kotlinx.coroutines.flow.internal.SafeCollector r7 = (kotlinx.coroutines.flow.internal.SafeCollector) r7
            kotlin.W.n(r8)     // Catch: java.lang.Throwable -> L30
            goto L94
        L30:
            r8 = move-exception
            goto L98
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            java.lang.Object r7 = r0.f53585M
            kotlin.jvm.internal.Ref$BooleanRef r7 = (kotlin.jvm.internal.Ref.BooleanRef) r7
            java.lang.Object r2 = r0.f53584L
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC2283j) r2
            java.lang.Object r4 = r0.f53583K
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 r4 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1) r4
            kotlin.W.n(r8)
            goto L6d
        L4a:
            kotlin.W.n(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            r8.f52294E = r4
            kotlinx.coroutines.flow.i r2 = r6.f53578E
            kotlinx.coroutines.flow.FlowKt__EmittersKt$b r5 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$b
            r5.<init>(r8, r7)
            r0.f53583K = r6
            r0.f53584L = r7
            r0.f53585M = r8
            r0.f53581I = r4
            java.lang.Object r2 = r2.a(r5, r0)
            if (r2 != r1) goto L6a
            return r1
        L6a:
            r4 = r6
            r2 = r7
            r7 = r8
        L6d:
            boolean r7 = r7.f52294E
            if (r7 == 0) goto L9c
            kotlinx.coroutines.flow.internal.SafeCollector r7 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.f r8 = r0.e()
            r7.<init>(r2, r8)
            X2.p r8 = r4.f53579F     // Catch: java.lang.Throwable -> L30
            r0.f53583K = r7     // Catch: java.lang.Throwable -> L30
            r2 = 0
            r0.f53584L = r2     // Catch: java.lang.Throwable -> L30
            r0.f53585M = r2     // Catch: java.lang.Throwable -> L30
            r0.f53581I = r3     // Catch: java.lang.Throwable -> L30
            r2 = 6
            kotlin.jvm.internal.C.e(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.c0(r7, r0)     // Catch: java.lang.Throwable -> L30
            r0 = 7
            kotlin.jvm.internal.C.e(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L94
            return r1
        L94:
            r7.H()
            goto L9c
        L98:
            r7.H()
            throw r8
        L9c:
            kotlin.H0 r7 = kotlin.H0.f51801a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.a(kotlinx.coroutines.flow.j, kotlin.coroutines.c):java.lang.Object");
    }
}
