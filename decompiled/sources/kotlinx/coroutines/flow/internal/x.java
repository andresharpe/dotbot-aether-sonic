package kotlinx.coroutines.flow.internal;

import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2283j;
import kotlinx.coroutines.internal.X;

/* loaded from: classes2.dex */
final class x<T> implements InterfaceC2283j<T> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.f f54261E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final Object f54262F;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final X2.p<T, kotlin.coroutines.c<? super H0>, Object> f54263G;

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class a extends SuspendLambda implements X2.p<T, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f54264I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f54265J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ InterfaceC2283j<T> f54266K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC2283j<? super T> interfaceC2283j, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f54266K = interfaceC2283j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f54264I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                Object obj2 = this.f54265J;
                InterfaceC2283j<T> interfaceC2283j = this.f54266K;
                this.f54264I = 1;
                if (interfaceC2283j.f(obj2, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(T t3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(t3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            a aVar = new a(this.f54266K, cVar);
            aVar.f54265J = obj;
            return aVar;
        }
    }

    public x(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.f fVar) {
        this.f54261E = fVar;
        this.f54262F = X.b(fVar);
        this.f54263G = new a(interfaceC2283j, null);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2283j
    @l3.e
    public Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object c4 = e.c(this.f54261E, t3, this.f54262F, this.f54263G, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (c4 == l4) {
            return c4;
        }
        return H0.f51801a;
    }
}
