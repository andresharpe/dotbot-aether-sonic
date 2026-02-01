package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1<T> implements InterfaceC2282i<T> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ X2.p f53586E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i f53587F;

    @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {116, 120}, m = "collect", n = {"this", "$this$onStart_u24lambda_u2d1", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f53588H;

        /* renamed from: I, reason: collision with root package name */
        int f53589I;

        /* renamed from: K, reason: collision with root package name */
        Object f53591K;

        /* renamed from: L, reason: collision with root package name */
        Object f53592L;

        /* renamed from: M, reason: collision with root package name */
        Object f53593M;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53588H = obj;
            this.f53589I |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(X2.p pVar, InterfaceC2282i interfaceC2282i) {
        this.f53586E = pVar;
        this.f53587F = interfaceC2282i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2283j<? super T> r7, @l3.d kotlin.coroutines.c<? super kotlin.H0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.f53589I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53589I = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f53588H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53589I
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.W.n(r8)
            goto L83
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f53593M
            kotlinx.coroutines.flow.internal.SafeCollector r7 = (kotlinx.coroutines.flow.internal.SafeCollector) r7
            java.lang.Object r2 = r0.f53592L
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC2283j) r2
            java.lang.Object r4 = r0.f53591K
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r4 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1) r4
            kotlin.W.n(r8)     // Catch: java.lang.Throwable -> L44
            goto L6e
        L44:
            r8 = move-exception
            goto L8a
        L46:
            kotlin.W.n(r8)
            kotlinx.coroutines.flow.internal.SafeCollector r8 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.f r2 = r0.e()
            r8.<init>(r7, r2)
            X2.p r2 = r6.f53586E     // Catch: java.lang.Throwable -> L86
            r0.f53591K = r6     // Catch: java.lang.Throwable -> L86
            r0.f53592L = r7     // Catch: java.lang.Throwable -> L86
            r0.f53593M = r8     // Catch: java.lang.Throwable -> L86
            r0.f53589I = r4     // Catch: java.lang.Throwable -> L86
            r4 = 6
            kotlin.jvm.internal.C.e(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r2.c0(r8, r0)     // Catch: java.lang.Throwable -> L86
            r4 = 7
            kotlin.jvm.internal.C.e(r4)     // Catch: java.lang.Throwable -> L86
            if (r2 != r1) goto L6b
            return r1
        L6b:
            r4 = r6
            r2 = r7
            r7 = r8
        L6e:
            r7.H()
            kotlinx.coroutines.flow.i r7 = r4.f53587F
            r8 = 0
            r0.f53591K = r8
            r0.f53592L = r8
            r0.f53593M = r8
            r0.f53589I = r3
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L83
            return r1
        L83:
            kotlin.H0 r7 = kotlin.H0.f51801a
            return r7
        L86:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L8a:
            r7.H()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.a(kotlinx.coroutines.flow.j, kotlin.coroutines.c):java.lang.Object");
    }
}
