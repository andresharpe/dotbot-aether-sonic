package kotlinx.coroutines.flow;

import kotlin.H0;

/* loaded from: classes2.dex */
public final class FlowKt__EmittersKt$unsafeTransform$1$1<T> implements InterfaceC2283j {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ X2.q<InterfaceC2283j<? super R>, T, kotlin.coroutines.c<? super H0>, Object> f53616E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ InterfaceC2283j<R> f53617F;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$unsafeTransform$1$1(X2.q<? super InterfaceC2283j<? super R>, ? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar, InterfaceC2283j<? super R> interfaceC2283j) {
        this.f53616E = qVar;
        this.f53617F = interfaceC2283j;
    }

    @l3.e
    public final Object a(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        kotlin.jvm.internal.C.e(4);
        new FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(this, cVar);
        kotlin.jvm.internal.C.e(5);
        this.f53616E.z(this.f53617F, t3, cVar);
        return H0.f51801a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.InterfaceC2283j
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(T r5, @l3.d kotlin.coroutines.c<? super kotlin.H0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) r0
            int r1 = r0.f53620J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53620J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f53618H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53620J
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.W.n(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.W.n(r6)
            X2.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.c<? super kotlin.H0>, java.lang.Object> r6 = r4.f53616E
            kotlinx.coroutines.flow.j<R> r2 = r4.f53617F
            r0.f53620J = r3
            java.lang.Object r5 = r6.z(r2, r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlin.H0 r5 = kotlin.H0.f51801a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
