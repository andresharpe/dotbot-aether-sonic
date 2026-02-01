package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8 implements InterfaceC2282i<Long> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ long[] f53536E;

    @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d15", "$this$forEach$iv"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f53537H;

        /* renamed from: I, reason: collision with root package name */
        int f53538I;

        /* renamed from: K, reason: collision with root package name */
        Object f53540K;

        /* renamed from: L, reason: collision with root package name */
        Object f53541L;

        /* renamed from: M, reason: collision with root package name */
        int f53542M;

        /* renamed from: N, reason: collision with root package name */
        int f53543N;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53537H = obj;
            this.f53538I |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8.this.a(null, this);
        }
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(long[] jArr) {
        this.f53536E = jArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0060 -> B:10:0x0063). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2283j<? super java.lang.Long> r9, @l3.d kotlin.coroutines.c<? super kotlin.H0> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 r0 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8.AnonymousClass1) r0
            int r1 = r0.f53538I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53538I = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f53537H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53538I
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r9 = r0.f53543N
            int r2 = r0.f53542M
            java.lang.Object r4 = r0.f53541L
            long[] r4 = (long[]) r4
            java.lang.Object r5 = r0.f53540K
            kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC2283j) r5
            kotlin.W.n(r10)
            r10 = r5
            goto L63
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.W.n(r10)
            long[] r10 = r8.f53536E
            int r2 = r10.length
            r4 = 0
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r4
            r4 = r7
        L4a:
            if (r2 >= r9) goto L65
            r5 = r4[r2]
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.a.g(r5)
            r0.f53540K = r10
            r0.f53541L = r4
            r0.f53542M = r2
            r0.f53543N = r9
            r0.f53538I = r3
            java.lang.Object r5 = r10.f(r5, r0)
            if (r5 != r1) goto L63
            return r1
        L63:
            int r2 = r2 + r3
            goto L4a
        L65:
            kotlin.H0 r9 = kotlin.H0.f51801a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8.a(kotlinx.coroutines.flow.j, kotlin.coroutines.c):java.lang.Object");
    }
}
