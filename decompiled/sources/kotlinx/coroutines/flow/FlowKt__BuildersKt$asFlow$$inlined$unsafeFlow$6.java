package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6<T> implements InterfaceC2282i<T> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Object[] f53520E;

    @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d11", "$this$forEach$iv"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f53521H;

        /* renamed from: I, reason: collision with root package name */
        int f53522I;

        /* renamed from: K, reason: collision with root package name */
        Object f53524K;

        /* renamed from: L, reason: collision with root package name */
        Object f53525L;

        /* renamed from: M, reason: collision with root package name */
        int f53526M;

        /* renamed from: N, reason: collision with root package name */
        int f53527N;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53521H = obj;
            this.f53522I |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6.this.a(null, this);
        }
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(Object[] objArr) {
        this.f53520E = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005c -> B:10:0x005f). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2283j<? super T> r8, @l3.d kotlin.coroutines.c<? super kotlin.H0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6$1 r0 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6.AnonymousClass1) r0
            int r1 = r0.f53522I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53522I = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f53521H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53522I
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f53527N
            int r2 = r0.f53526M
            java.lang.Object r4 = r0.f53525L
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f53524K
            kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC2283j) r5
            kotlin.W.n(r9)
            r9 = r5
            goto L5f
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.W.n(r9)
            java.lang.Object[] r9 = r7.f53520E
            int r2 = r9.length
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r4
            r4 = r6
        L4a:
            if (r2 >= r8) goto L61
            r5 = r4[r2]
            r0.f53524K = r9
            r0.f53525L = r4
            r0.f53526M = r2
            r0.f53527N = r8
            r0.f53522I = r3
            java.lang.Object r5 = r9.f(r5, r0)
            if (r5 != r1) goto L5f
            return r1
        L5f:
            int r2 = r2 + r3
            goto L4a
        L61:
            kotlin.H0 r8 = kotlin.H0.f51801a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6.a(kotlinx.coroutines.flow.j, kotlin.coroutines.c):java.lang.Object");
    }
}
