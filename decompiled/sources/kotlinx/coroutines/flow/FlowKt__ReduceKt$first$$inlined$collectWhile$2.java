package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class FlowKt__ReduceKt$first$$inlined$collectWhile$2<T> implements InterfaceC2283j<T> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ X2.p f53761E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f53762F;

    @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {142}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53763H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f53764I;

        /* renamed from: J, reason: collision with root package name */
        int f53765J;

        /* renamed from: L, reason: collision with root package name */
        Object f53767L;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53764I = obj;
            this.f53765J |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt$first$$inlined$collectWhile$2.this.f(null, this);
        }
    }

    public FlowKt__ReduceKt$first$$inlined$collectWhile$2(X2.p pVar, Ref.ObjectRef objectRef) {
        this.f53761E = pVar;
        this.f53762F = objectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.InterfaceC2283j
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(T r5, @l3.d kotlin.coroutines.c<? super kotlin.H0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2.AnonymousClass1) r0
            int r1 = r0.f53765J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53765J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f53764I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53765J
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f53767L
            java.lang.Object r0 = r0.f53763H
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) r0
            kotlin.W.n(r6)
            goto L52
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.W.n(r6)
            X2.p r6 = r4.f53761E
            r0.f53763H = r4
            r0.f53767L = r5
            r0.f53765J = r3
            r2 = 6
            kotlin.jvm.internal.C.e(r2)
            java.lang.Object r6 = r6.c0(r5, r0)
            r0 = 7
            kotlin.jvm.internal.C.e(r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r4
        L52:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5d
            kotlin.H0 r5 = kotlin.H0.f51801a
            return r5
        L5d:
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f53762F
            r6.f52301E = r5
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
