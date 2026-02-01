package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
/* loaded from: classes2.dex */
public final class FlowKt__LimitKt$transformWhile$1<R> extends SuspendLambda implements X2.p<InterfaceC2283j<? super R>, kotlin.coroutines.c<? super H0>, Object> {

    /* renamed from: I, reason: collision with root package name */
    int f53713I;

    /* renamed from: J, reason: collision with root package name */
    private /* synthetic */ Object f53714J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i<T> f53715K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ X2.q<InterfaceC2283j<? super R>, T, kotlin.coroutines.c<? super Boolean>, Object> f53716L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$transformWhile$1(InterfaceC2282i<? extends T> interfaceC2282i, X2.q<? super InterfaceC2283j<? super R>, ? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> qVar, kotlin.coroutines.c<? super FlowKt__LimitKt$transformWhile$1> cVar) {
        super(2, cVar);
        this.f53715K = interfaceC2282i;
        this.f53716L = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.e
    public final Object D(@l3.d Object obj) {
        Object l4;
        FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1;
        l4 = kotlin.coroutines.intrinsics.b.l();
        int i4 = this.f53713I;
        if (i4 != 0) {
            if (i4 == 1) {
                flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = (FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) this.f53714J;
                try {
                    W.n(obj);
                } catch (AbortFlowException e4) {
                    e = e4;
                    kotlinx.coroutines.flow.internal.o.b(e, flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1);
                    return H0.f51801a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            W.n(obj);
            InterfaceC2283j interfaceC2283j = (InterfaceC2283j) this.f53714J;
            InterfaceC2282i<T> interfaceC2282i = this.f53715K;
            FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12 = new FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1(this.f53716L, interfaceC2283j);
            try {
                this.f53714J = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12;
                this.f53713I = 1;
                if (interfaceC2282i.a(flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12, this) == l4) {
                    return l4;
                }
            } catch (AbortFlowException e5) {
                e = e5;
                flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12;
                kotlinx.coroutines.flow.internal.o.b(e, flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1);
                return H0.f51801a;
            }
        }
        return H0.f51801a;
    }

    @Override // X2.p
    @l3.e
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Object c0(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.e kotlin.coroutines.c<? super H0> cVar) {
        return ((FlowKt__LimitKt$transformWhile$1) v(interfaceC2283j, cVar)).D(H0.f51801a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.d
    public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.f53715K, this.f53716L, cVar);
        flowKt__LimitKt$transformWhile$1.f53714J = obj;
        return flowKt__LimitKt$transformWhile$1;
    }
}
