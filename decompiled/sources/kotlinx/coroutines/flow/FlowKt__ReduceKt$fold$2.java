package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final class FlowKt__ReduceKt$fold$2<T> implements InterfaceC2283j {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<R> f53794E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ X2.q<R, T, kotlin.coroutines.c<? super R>, Object> f53795F;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$fold$2(Ref.ObjectRef<R> objectRef, X2.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        this.f53794E = objectRef;
        this.f53795F = qVar;
    }

    @l3.e
    public final Object a(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        kotlin.jvm.internal.C.e(4);
        new FlowKt__ReduceKt$fold$2$emit$1(this, cVar);
        kotlin.jvm.internal.C.e(5);
        Ref.ObjectRef<R> objectRef = this.f53794E;
        objectRef.f52301E = (T) this.f53795F.z(objectRef.f52301E, t3, cVar);
        return H0.f51801a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.InterfaceC2283j
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(T r7, @l3.d kotlin.coroutines.c<? super kotlin.H0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1) r0
            int r1 = r0.f53799K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53799K = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f53797I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53799K
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f53796H
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            kotlin.W.n(r8)
            goto L4c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.W.n(r8)
            kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r6.f53794E
            X2.q<R, T, kotlin.coroutines.c<? super R>, java.lang.Object> r2 = r6.f53795F
            T r4 = r8.f52301E
            r0.f53796H = r8
            r0.f53799K = r3
            java.lang.Object r7 = r2.z(r4, r7, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r5 = r8
            r8 = r7
            r7 = r5
        L4c:
            r7.f52301E = r8
            kotlin.H0 r7 = kotlin.H0.f51801a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
