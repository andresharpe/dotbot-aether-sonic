package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1<T> implements InterfaceC2283j<T> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ X2.p<T, kotlin.coroutines.c<? super Boolean>, Object> f53689E;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$collectWhile$collector$1(X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        this.f53689E = pVar;
    }

    @l3.e
    public Object a(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        kotlin.jvm.internal.C.e(4);
        new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, cVar);
        kotlin.jvm.internal.C.e(5);
        if (((Boolean) this.f53689E.c0(t3, cVar)).booleanValue()) {
            return H0.f51801a;
        }
        throw new AbortFlowException(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
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
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1) r0
            int r1 = r0.f53693K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53693K = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f53691I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53693K
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f53690H
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r5 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1) r5
            kotlin.W.n(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.W.n(r6)
            X2.p<T, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f53689E
            r0.f53690H = r4
            r0.f53693K = r3
            java.lang.Object r6 = r6.c0(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L51
            kotlin.H0 r5 = kotlin.H0.f51801a
            return r5
        L51:
            kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
