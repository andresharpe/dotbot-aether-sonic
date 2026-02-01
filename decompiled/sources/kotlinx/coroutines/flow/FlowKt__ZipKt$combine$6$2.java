package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R, T] */
@kotlin.E(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {androidx.exifinterface.media.a.f5, "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/H0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {292, 292}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FlowKt__ZipKt$combine$6$2<R, T> extends SuspendLambda implements X2.q<InterfaceC2283j<? super R>, T[], kotlin.coroutines.c<? super H0>, Object> {

    /* renamed from: I, reason: collision with root package name */
    int f54019I;

    /* renamed from: J, reason: collision with root package name */
    private /* synthetic */ Object f54020J;

    /* renamed from: K, reason: collision with root package name */
    /* synthetic */ Object f54021K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ X2.p<T[], kotlin.coroutines.c<? super R>, Object> f54022L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$6$2(X2.p<? super T[], ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, kotlin.coroutines.c<? super FlowKt__ZipKt$combine$6$2> cVar) {
        super(3, cVar);
        this.f54022L = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.e
    public final Object D(@l3.d Object obj) {
        Object l4;
        InterfaceC2283j interfaceC2283j;
        l4 = kotlin.coroutines.intrinsics.b.l();
        int i4 = this.f54019I;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    W.n(obj);
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC2283j interfaceC2283j2 = (InterfaceC2283j) this.f54020J;
            W.n(obj);
            interfaceC2283j = interfaceC2283j2;
        } else {
            W.n(obj);
            InterfaceC2283j interfaceC2283j3 = (InterfaceC2283j) this.f54020J;
            Object[] objArr = (Object[]) this.f54021K;
            X2.p<T[], kotlin.coroutines.c<? super R>, Object> pVar = this.f54022L;
            this.f54020J = interfaceC2283j3;
            this.f54019I = 1;
            obj = pVar.c0(objArr, this);
            interfaceC2283j = interfaceC2283j3;
            if (obj == l4) {
                return l4;
            }
        }
        this.f54020J = null;
        this.f54019I = 2;
        if (interfaceC2283j.f(obj, this) == l4) {
            return l4;
        }
        return H0.f51801a;
    }

    @Override // X2.q
    @l3.e
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Object z(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.d T[] tArr, @l3.e kotlin.coroutines.c<? super H0> cVar) {
        FlowKt__ZipKt$combine$6$2 flowKt__ZipKt$combine$6$2 = new FlowKt__ZipKt$combine$6$2(this.f54022L, cVar);
        flowKt__ZipKt$combine$6$2.f54020J = interfaceC2283j;
        flowKt__ZipKt$combine$6$2.f54021K = tArr;
        return flowKt__ZipKt$combine$6$2.D(H0.f51801a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.e
    public final Object X(@l3.d Object obj) {
        InterfaceC2283j interfaceC2283j = (InterfaceC2283j) this.f54020J;
        Object c02 = this.f54022L.c0((Object[]) this.f54021K, this);
        kotlin.jvm.internal.C.e(0);
        interfaceC2283j.f(c02, this);
        kotlin.jvm.internal.C.e(1);
        return H0.f51801a;
    }
}
