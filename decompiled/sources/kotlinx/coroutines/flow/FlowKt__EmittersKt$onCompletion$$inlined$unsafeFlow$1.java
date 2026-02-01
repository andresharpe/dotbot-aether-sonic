package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> implements InterfaceC2282i<T> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i f53571E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ X2.q f53572F;

    @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {114, 121, 128}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u2d2", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f53573H;

        /* renamed from: I, reason: collision with root package name */
        int f53574I;

        /* renamed from: K, reason: collision with root package name */
        Object f53576K;

        /* renamed from: L, reason: collision with root package name */
        Object f53577L;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53573H = obj;
            this.f53574I |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(InterfaceC2282i interfaceC2282i, X2.q qVar) {
        this.f53571E = interfaceC2282i;
        this.f53572F = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2283j<? super T> r9, @l3.d kotlin.coroutines.c<? super kotlin.H0> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.f53574I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53574I = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f53573H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53574I
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L54
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r9 = r0.f53576K
            kotlinx.coroutines.flow.internal.SafeCollector r9 = (kotlinx.coroutines.flow.internal.SafeCollector) r9
            kotlin.W.n(r10)     // Catch: java.lang.Throwable -> L34
            goto L88
        L34:
            r10 = move-exception
            goto L92
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.f53576K
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.W.n(r10)
            goto Lac
        L46:
            java.lang.Object r9 = r0.f53577L
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC2283j) r9
            java.lang.Object r2 = r0.f53576K
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r2 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) r2
            kotlin.W.n(r10)     // Catch: java.lang.Throwable -> L52
            goto L67
        L52:
            r9 = move-exception
            goto L98
        L54:
            kotlin.W.n(r10)
            kotlinx.coroutines.flow.i r10 = r8.f53571E     // Catch: java.lang.Throwable -> L96
            r0.f53576K = r8     // Catch: java.lang.Throwable -> L96
            r0.f53577L = r9     // Catch: java.lang.Throwable -> L96
            r0.f53574I = r5     // Catch: java.lang.Throwable -> L96
            java.lang.Object r10 = r10.a(r9, r0)     // Catch: java.lang.Throwable -> L96
            if (r10 != r1) goto L66
            return r1
        L66:
            r2 = r8
        L67:
            kotlinx.coroutines.flow.internal.SafeCollector r10 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.f r4 = r0.e()
            r10.<init>(r9, r4)
            X2.q r9 = r2.f53572F     // Catch: java.lang.Throwable -> L8e
            r0.f53576K = r10     // Catch: java.lang.Throwable -> L8e
            r0.f53577L = r6     // Catch: java.lang.Throwable -> L8e
            r0.f53574I = r3     // Catch: java.lang.Throwable -> L8e
            r2 = 6
            kotlin.jvm.internal.C.e(r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r9 = r9.z(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
            r0 = 7
            kotlin.jvm.internal.C.e(r0)     // Catch: java.lang.Throwable -> L8e
            if (r9 != r1) goto L87
            return r1
        L87:
            r9 = r10
        L88:
            r9.H()
            kotlin.H0 r9 = kotlin.H0.f51801a
            return r9
        L8e:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L92:
            r9.H()
            throw r10
        L96:
            r9 = move-exception
            r2 = r8
        L98:
            kotlinx.coroutines.flow.N r10 = new kotlinx.coroutines.flow.N
            r10.<init>(r9)
            X2.q r2 = r2.f53572F
            r0.f53576K = r9
            r0.f53577L = r6
            r0.f53574I = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt__EmittersKt.a(r10, r2, r9, r0)
            if (r10 != r1) goto Lac
            return r1
        Lac:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.a(kotlinx.coroutines.flow.j, kotlin.coroutines.c):java.lang.Object");
    }
}
