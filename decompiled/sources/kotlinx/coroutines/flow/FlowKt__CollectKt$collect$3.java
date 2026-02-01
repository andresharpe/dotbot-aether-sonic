package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class FlowKt__CollectKt$collect$3<T> implements InterfaceC2283j<T> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ X2.p<T, kotlin.coroutines.c<? super H0>, Object> f53562E;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$collect$3(X2.p<? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        this.f53562E = pVar;
    }

    @l3.e
    public Object a(T t3, @l3.d final kotlin.coroutines.c<? super H0> cVar) {
        kotlin.jvm.internal.C.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f53563H;

            /* renamed from: J, reason: collision with root package name */
            int f53565J;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53563H = obj;
                this.f53565J |= Integer.MIN_VALUE;
                return FlowKt__CollectKt$collect$3.this.f(null, this);
            }
        };
        kotlin.jvm.internal.C.e(5);
        this.f53562E.c0(t3, cVar);
        return H0.f51801a;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2283j
    @l3.e
    public Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object c02 = this.f53562E.c0(t3, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (c02 == l4) {
            return c02;
        }
        return H0.f51801a;
    }
}
