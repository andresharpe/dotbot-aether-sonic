package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1<T> implements InterfaceC2283j<T> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ X2.p f53665E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ InterfaceC2283j f53666F;

    @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {142, 143}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53667H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f53668I;

        /* renamed from: J, reason: collision with root package name */
        int f53669J;

        /* renamed from: L, reason: collision with root package name */
        Object f53671L;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53668I = obj;
            this.f53669J |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1.this.f(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1(X2.p pVar, InterfaceC2283j interfaceC2283j) {
        this.f53665E = pVar;
        this.f53666F = interfaceC2283j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.InterfaceC2283j
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(T r8, @l3.d kotlin.coroutines.c<? super kotlin.H0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1.AnonymousClass1) r0
            int r1 = r0.f53669J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53669J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f53668I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53669J
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.f53667H
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1 r8 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1) r8
            kotlin.W.n(r9)
            goto L7c
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f53671L
            java.lang.Object r2 = r0.f53667H
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1 r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1) r2
            kotlin.W.n(r9)
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L63
        L46:
            kotlin.W.n(r9)
            X2.p r9 = r7.f53665E
            r0.f53667H = r7
            r0.f53671L = r8
            r0.f53669J = r4
            r2 = 6
            kotlin.jvm.internal.C.e(r2)
            java.lang.Object r9 = r9.c0(r8, r0)
            r2 = 7
            kotlin.jvm.internal.C.e(r2)
            if (r9 != r1) goto L60
            return r1
        L60:
            r2 = r9
            r9 = r8
            r8 = r7
        L63:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L7b
            kotlinx.coroutines.flow.j r2 = r8.f53666F
            r0.f53667H = r8
            r5 = 0
            r0.f53671L = r5
            r0.f53669J = r3
            java.lang.Object r9 = r2.f(r9, r0)
            if (r9 != r1) goto L7c
            return r1
        L7b:
            r4 = 0
        L7c:
            if (r4 == 0) goto L81
            kotlin.H0 r8 = kotlin.H0.f51801a
            return r8
        L81:
            kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
