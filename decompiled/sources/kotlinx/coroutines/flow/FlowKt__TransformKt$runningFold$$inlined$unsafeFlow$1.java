package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes2.dex */
public final class FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1<R> implements InterfaceC2282i<R> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Object f53899E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i f53900F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ X2.q f53901G;

    @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {114, 115}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u2d8", "accumulator"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f53902H;

        /* renamed from: I, reason: collision with root package name */
        int f53903I;

        /* renamed from: K, reason: collision with root package name */
        Object f53905K;

        /* renamed from: L, reason: collision with root package name */
        Object f53906L;

        /* renamed from: M, reason: collision with root package name */
        Object f53907M;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53902H = obj;
            this.f53903I |= Integer.MIN_VALUE;
            return FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(Object obj, InterfaceC2282i interfaceC2282i, X2.q qVar) {
        this.f53899E = obj;
        this.f53900F = interfaceC2282i;
        this.f53901G = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2283j<? super R> r7, @l3.d kotlin.coroutines.c<? super kotlin.H0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.f53903I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53903I = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f53902H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53903I
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.W.n(r8)
            goto L7b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f53907M
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            java.lang.Object r2 = r0.f53906L
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC2283j) r2
            java.lang.Object r4 = r0.f53905K
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 r4 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1) r4
            kotlin.W.n(r8)
            goto L62
        L44:
            kotlin.W.n(r8)
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            java.lang.Object r2 = r6.f53899E
            r8.f52301E = r2
            r0.f53905K = r6
            r0.f53906L = r7
            r0.f53907M = r8
            r0.f53903I = r4
            java.lang.Object r2 = r7.f(r2, r0)
            if (r2 != r1) goto L5f
            return r1
        L5f:
            r4 = r6
            r2 = r7
            r7 = r8
        L62:
            kotlinx.coroutines.flow.i r8 = r4.f53900F
            kotlinx.coroutines.flow.FlowKt__TransformKt$a r5 = new kotlinx.coroutines.flow.FlowKt__TransformKt$a
            X2.q r4 = r4.f53901G
            r5.<init>(r7, r4, r2)
            r7 = 0
            r0.f53905K = r7
            r0.f53906L = r7
            r0.f53907M = r7
            r0.f53903I = r3
            java.lang.Object r7 = r8.a(r5, r0)
            if (r7 != r1) goto L7b
            return r1
        L7b:
            kotlin.H0 r7 = kotlin.H0.f51801a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.a(kotlinx.coroutines.flow.j, kotlin.coroutines.c):java.lang.Object");
    }
}
