package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1<T> implements InterfaceC2282i<T> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i f53621E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ X2.q f53622F;

    @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {113, 114}, m = "collect", n = {"this", "$this$catch_u24lambda_u2d0"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f53623H;

        /* renamed from: I, reason: collision with root package name */
        int f53624I;

        /* renamed from: K, reason: collision with root package name */
        Object f53626K;

        /* renamed from: L, reason: collision with root package name */
        Object f53627L;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53623H = obj;
            this.f53624I |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(InterfaceC2282i interfaceC2282i, X2.q qVar) {
        this.f53621E = interfaceC2282i;
        this.f53622F = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2283j<? super T> r6, @l3.d kotlin.coroutines.c<? super kotlin.H0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.f53624I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53624I = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f53623H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53624I
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.W.n(r7)
            goto L6f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f53627L
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC2283j) r6
            java.lang.Object r2 = r0.f53626K
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 r2 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) r2
            kotlin.W.n(r7)
            goto L53
        L40:
            kotlin.W.n(r7)
            kotlinx.coroutines.flow.i r7 = r5.f53621E
            r0.f53626K = r5
            r0.f53627L = r6
            r0.f53624I = r4
            java.lang.Object r7 = kotlinx.coroutines.flow.C2284k.v(r7, r6, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L6f
            X2.q r2 = r2.f53622F
            r4 = 0
            r0.f53626K = r4
            r0.f53627L = r4
            r0.f53624I = r3
            r3 = 6
            kotlin.jvm.internal.C.e(r3)
            java.lang.Object r6 = r2.z(r6, r7, r0)
            r7 = 7
            kotlin.jvm.internal.C.e(r7)
            if (r6 != r1) goto L6f
            return r1
        L6f:
            kotlin.H0 r6 = kotlin.H0.f51801a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.a(kotlinx.coroutines.flow.j, kotlin.coroutines.c):java.lang.Object");
    }
}
