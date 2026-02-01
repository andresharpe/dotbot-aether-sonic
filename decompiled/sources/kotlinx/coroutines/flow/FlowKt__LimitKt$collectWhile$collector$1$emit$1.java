package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

@kotlin.E(k = 3, mv = {1, 6, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {130}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes2.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1$emit$1 extends ContinuationImpl {

    /* renamed from: H, reason: collision with root package name */
    Object f53690H;

    /* renamed from: I, reason: collision with root package name */
    /* synthetic */ Object f53691I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ FlowKt__LimitKt$collectWhile$collector$1 f53692J;

    /* renamed from: K, reason: collision with root package name */
    int f53693K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$collectWhile$collector$1$emit$1(FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1, kotlin.coroutines.c<? super FlowKt__LimitKt$collectWhile$collector$1$emit$1> cVar) {
        super(cVar);
        this.f53692J = flowKt__LimitKt$collectWhile$collector$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.e
    public final Object D(@l3.d Object obj) {
        this.f53691I = obj;
        this.f53693K |= Integer.MIN_VALUE;
        return this.f53692J.f(null, this);
    }
}
