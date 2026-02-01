package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1<T> implements InterfaceC2282i<T> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i f53653E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ int f53654F;

    @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {115}, m = "collect", n = {"$this$take_u24lambda_u2d4"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f53655H;

        /* renamed from: I, reason: collision with root package name */
        int f53656I;

        /* renamed from: K, reason: collision with root package name */
        Object f53658K;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53655H = obj;
            this.f53656I |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$take$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(InterfaceC2282i interfaceC2282i, int i4) {
        this.f53653E = interfaceC2282i;
        this.f53654F = i4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        kotlinx.coroutines.flow.internal.o.b(r8, r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2283j<? super T> r7, @l3.d kotlin.coroutines.c<? super kotlin.H0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.f53656I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53656I = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f53655H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53656I
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.f53658K
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC2283j) r7
            kotlin.W.n(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L56
        L2d:
            r8 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.W.n(r8)
            kotlin.jvm.internal.Ref$IntRef r8 = new kotlin.jvm.internal.Ref$IntRef
            r8.<init>()
            kotlinx.coroutines.flow.i r2 = r6.f53653E     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            kotlinx.coroutines.flow.FlowKt__LimitKt$g r4 = new kotlinx.coroutines.flow.FlowKt__LimitKt$g     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            int r5 = r6.f53654F     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            r4.<init>(r8, r5, r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            r0.f53658K = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            r0.f53656I = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            java.lang.Object r7 = r2.a(r4, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            if (r7 != r1) goto L56
            return r1
        L53:
            kotlinx.coroutines.flow.internal.o.b(r8, r7)
        L56:
            kotlin.H0 r7 = kotlin.H0.f51801a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.a(kotlinx.coroutines.flow.j, kotlin.coroutines.c):java.lang.Object");
    }
}
