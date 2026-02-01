package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

@kotlin.E(k = 3, mv = {1, 6, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", f = "Reduce.kt", i = {}, l = {45}, m = "emit", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FlowKt__ReduceKt$fold$2$emit$1 extends ContinuationImpl {

    /* renamed from: H, reason: collision with root package name */
    Object f53796H;

    /* renamed from: I, reason: collision with root package name */
    /* synthetic */ Object f53797I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ FlowKt__ReduceKt$fold$2<T> f53798J;

    /* renamed from: K, reason: collision with root package name */
    int f53799K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$fold$2$emit$1(FlowKt__ReduceKt$fold$2<? super T> flowKt__ReduceKt$fold$2, kotlin.coroutines.c<? super FlowKt__ReduceKt$fold$2$emit$1> cVar) {
        super(cVar);
        this.f53798J = flowKt__ReduceKt$fold$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.e
    public final Object D(@l3.d Object obj) {
        this.f53797I = obj;
        this.f53799K |= Integer.MIN_VALUE;
        return this.f53798J.f(null, this);
    }
}
