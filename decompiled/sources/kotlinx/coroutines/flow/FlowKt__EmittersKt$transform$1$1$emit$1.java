package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1;

@kotlin.E(k = 3, mv = {1, 6, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", f = "Emitters.kt", i = {}, l = {42}, m = "emit", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FlowKt__EmittersKt$transform$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: H, reason: collision with root package name */
    /* synthetic */ Object f53613H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ FlowKt__EmittersKt$transform$1.AnonymousClass1<T> f53614I;

    /* renamed from: J, reason: collision with root package name */
    int f53615J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$transform$1$1$emit$1(FlowKt__EmittersKt$transform$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.c<? super FlowKt__EmittersKt$transform$1$1$emit$1> cVar) {
        super(cVar);
        this.f53614I = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.e
    public final Object D(@l3.d Object obj) {
        this.f53613H = obj;
        this.f53615J |= Integer.MIN_VALUE;
        return this.f53614I.f(null, this);
    }
}
