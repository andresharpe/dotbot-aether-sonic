package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R, T] */
@kotlin.E(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {androidx.exifinterface.media.a.f5, "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/H0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {190, 190}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FlowKt__MergeKt$flatMapLatest$1<R, T> extends SuspendLambda implements X2.q<InterfaceC2283j<? super R>, T, kotlin.coroutines.c<? super H0>, Object> {

    /* renamed from: I, reason: collision with root package name */
    int f53743I;

    /* renamed from: J, reason: collision with root package name */
    private /* synthetic */ Object f53744J;

    /* renamed from: K, reason: collision with root package name */
    /* synthetic */ Object f53745K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ X2.p<T, kotlin.coroutines.c<? super InterfaceC2282i<? extends R>>, Object> f53746L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$flatMapLatest$1(X2.p<? super T, ? super kotlin.coroutines.c<? super InterfaceC2282i<? extends R>>, ? extends Object> pVar, kotlin.coroutines.c<? super FlowKt__MergeKt$flatMapLatest$1> cVar) {
        super(3, cVar);
        this.f53746L = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.e
    public final Object D(@l3.d Object obj) {
        Object l4;
        InterfaceC2283j interfaceC2283j;
        l4 = kotlin.coroutines.intrinsics.b.l();
        int i4 = this.f53743I;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    W.n(obj);
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2283j = (InterfaceC2283j) this.f53744J;
            W.n(obj);
        } else {
            W.n(obj);
            interfaceC2283j = (InterfaceC2283j) this.f53744J;
            Object obj2 = this.f53745K;
            X2.p<T, kotlin.coroutines.c<? super InterfaceC2282i<? extends R>>, Object> pVar = this.f53746L;
            this.f53744J = interfaceC2283j;
            this.f53743I = 1;
            obj = pVar.c0(obj2, this);
            if (obj == l4) {
                return l4;
            }
        }
        this.f53744J = null;
        this.f53743I = 2;
        if (C2284k.m0(interfaceC2283j, (InterfaceC2282i) obj, this) == l4) {
            return l4;
        }
        return H0.f51801a;
    }

    @Override // X2.q
    @l3.e
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Object z(@l3.d InterfaceC2283j<? super R> interfaceC2283j, T t3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
        FlowKt__MergeKt$flatMapLatest$1 flowKt__MergeKt$flatMapLatest$1 = new FlowKt__MergeKt$flatMapLatest$1(this.f53746L, cVar);
        flowKt__MergeKt$flatMapLatest$1.f53744J = interfaceC2283j;
        flowKt__MergeKt$flatMapLatest$1.f53745K = t3;
        return flowKt__MergeKt$flatMapLatest$1.D(H0.f51801a);
    }

    @l3.e
    public final Object X(@l3.d Object obj) {
        InterfaceC2283j interfaceC2283j = (InterfaceC2283j) this.f53744J;
        InterfaceC2282i interfaceC2282i = (InterfaceC2282i) this.f53746L.c0(this.f53745K, this);
        kotlin.jvm.internal.C.e(0);
        C2284k.m0(interfaceC2283j, interfaceC2282i, this);
        kotlin.jvm.internal.C.e(1);
        return H0.f51801a;
    }
}
