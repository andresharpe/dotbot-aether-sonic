package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class FlowKt__CollectKt$collectIndexed$2<T> implements InterfaceC2283j<T> {

    /* renamed from: E, reason: collision with root package name */
    private int f53566E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ X2.q<Integer, T, kotlin.coroutines.c<? super H0>, Object> f53567F;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$collectIndexed$2(X2.q<? super Integer, ? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar) {
        this.f53567F = qVar;
    }

    @l3.e
    public Object a(T t3, @l3.d final kotlin.coroutines.c<? super H0> cVar) {
        kotlin.jvm.internal.C.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f53568H;

            /* renamed from: J, reason: collision with root package name */
            int f53570J;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53568H = obj;
                this.f53570J |= Integer.MIN_VALUE;
                return FlowKt__CollectKt$collectIndexed$2.this.f(null, this);
            }
        };
        kotlin.jvm.internal.C.e(5);
        X2.q<Integer, T, kotlin.coroutines.c<? super H0>, Object> qVar = this.f53567F;
        int i4 = this.f53566E;
        this.f53566E = i4 + 1;
        if (i4 >= 0) {
            qVar.z(Integer.valueOf(i4), t3, cVar);
            return H0.f51801a;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2283j
    @l3.e
    public Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        X2.q<Integer, T, kotlin.coroutines.c<? super H0>, Object> qVar = this.f53567F;
        int i4 = this.f53566E;
        this.f53566E = i4 + 1;
        if (i4 >= 0) {
            Object z3 = qVar.z(kotlin.coroutines.jvm.internal.a.f(i4), t3, cVar);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (z3 == l4) {
                return z3;
            }
            return H0.f51801a;
        }
        throw new ArithmeticException("Index overflow has happened");
    }
}
