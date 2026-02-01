package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R, T] */
@kotlin.E(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {androidx.exifinterface.media.a.f5, "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/H0;", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {190, 190}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1<R, T> extends SuspendLambda implements X2.q<InterfaceC2283j<? super R>, T, kotlin.coroutines.c<? super H0>, Object> {

    /* renamed from: I, reason: collision with root package name */
    int f53747I;

    /* renamed from: J, reason: collision with root package name */
    private /* synthetic */ Object f53748J;

    /* renamed from: K, reason: collision with root package name */
    /* synthetic */ Object f53749K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ X2.p f53750L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(X2.p pVar, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.f53750L = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.e
    public final Object D(@l3.d Object obj) {
        Object l4;
        InterfaceC2283j interfaceC2283j;
        l4 = kotlin.coroutines.intrinsics.b.l();
        int i4 = this.f53747I;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    W.n(obj);
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2283j = (InterfaceC2283j) this.f53748J;
            W.n(obj);
        } else {
            W.n(obj);
            interfaceC2283j = (InterfaceC2283j) this.f53748J;
            Object obj2 = this.f53749K;
            X2.p pVar = this.f53750L;
            this.f53748J = interfaceC2283j;
            this.f53747I = 1;
            obj = pVar.c0(obj2, this);
            if (obj == l4) {
                return l4;
            }
        }
        this.f53748J = null;
        this.f53747I = 2;
        if (C2284k.m0(interfaceC2283j, (InterfaceC2282i) obj, this) == l4) {
            return l4;
        }
        return H0.f51801a;
    }

    @Override // X2.q
    @l3.e
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Object z(@l3.d InterfaceC2283j<? super R> interfaceC2283j, T t3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
        FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 = new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(this.f53750L, cVar);
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.f53748J = interfaceC2283j;
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.f53749K = t3;
        return flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.D(H0.f51801a);
    }
}
