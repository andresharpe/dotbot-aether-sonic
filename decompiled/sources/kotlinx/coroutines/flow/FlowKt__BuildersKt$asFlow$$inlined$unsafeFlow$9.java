package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9 implements InterfaceC2282i<Integer> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ kotlin.ranges.l f53544E;

    @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d17"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f53545H;

        /* renamed from: I, reason: collision with root package name */
        int f53546I;

        /* renamed from: K, reason: collision with root package name */
        Object f53548K;

        /* renamed from: L, reason: collision with root package name */
        Object f53549L;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53545H = obj;
            this.f53546I |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9.this.a(null, this);
        }
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(kotlin.ranges.l lVar) {
        this.f53544E = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2283j<? super java.lang.Integer> r6, @l3.d kotlin.coroutines.c<? super kotlin.H0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9$1 r0 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9.AnonymousClass1) r0
            int r1 = r0.f53546I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53546I = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f53545H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53546I
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f53549L
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.f53548K
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC2283j) r2
            kotlin.W.n(r7)
            r7 = r2
            goto L46
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.W.n(r7)
            kotlin.ranges.l r7 = r5.f53544E
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
            r7 = r6
            r6 = r4
        L46:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L64
            r2 = r6
            kotlin.collections.P r2 = (kotlin.collections.P) r2
            int r2 = r2.c()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.f(r2)
            r0.f53548K = r7
            r0.f53549L = r6
            r0.f53546I = r3
            java.lang.Object r2 = r7.f(r2, r0)
            if (r2 != r1) goto L46
            return r1
        L64:
            kotlin.H0 r6 = kotlin.H0.f51801a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9.a(kotlinx.coroutines.flow.j, kotlin.coroutines.c):java.lang.Object");
    }
}
