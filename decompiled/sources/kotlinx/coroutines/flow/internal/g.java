package kotlinx.coroutines.flow.internal;

import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;

/* loaded from: classes2.dex */
public abstract class g<S, T> extends d<T> {

    /* renamed from: H, reason: collision with root package name */
    @W2.f
    @l3.d
    protected final InterfaceC2282i<S> f54157H;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a extends SuspendLambda implements X2.p<InterfaceC2283j<? super T>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f54158I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f54159J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ g<S, T> f54160K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g<S, T> gVar, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f54160K = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f54158I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                InterfaceC2283j<? super T> interfaceC2283j = (InterfaceC2283j) this.f54159J;
                g<S, T> gVar = this.f54160K;
                this.f54158I = 1;
                if (gVar.u(interfaceC2283j, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(interfaceC2283j, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            a aVar = new a(this.f54160K, cVar);
            aVar.f54159J = obj;
            return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@l3.d InterfaceC2282i<? extends S> interfaceC2282i, @l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        super(fVar, i4, bufferOverflow);
        this.f54157H = interfaceC2282i;
    }

    static /* synthetic */ Object r(g gVar, InterfaceC2283j interfaceC2283j, kotlin.coroutines.c cVar) {
        Object l4;
        Object l5;
        Object l6;
        if (gVar.f54133F == -3) {
            kotlin.coroutines.f e4 = cVar.e();
            kotlin.coroutines.f A3 = e4.A(gVar.f54132E);
            if (F.g(A3, e4)) {
                Object u3 = gVar.u(interfaceC2283j, cVar);
                l6 = kotlin.coroutines.intrinsics.b.l();
                if (u3 == l6) {
                    return u3;
                }
                return H0.f51801a;
            }
            d.b bVar = kotlin.coroutines.d.f52046u;
            if (F.g(A3.a(bVar), e4.a(bVar))) {
                Object t3 = gVar.t(interfaceC2283j, A3, cVar);
                l5 = kotlin.coroutines.intrinsics.b.l();
                if (t3 == l5) {
                    return t3;
                }
                return H0.f51801a;
            }
        }
        Object a4 = super.a(interfaceC2283j, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }

    static /* synthetic */ Object s(g gVar, D d4, kotlin.coroutines.c cVar) {
        Object l4;
        Object u3 = gVar.u(new u(d4), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (u3 == l4) {
            return u3;
        }
        return H0.f51801a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(InterfaceC2283j<? super T> interfaceC2283j, kotlin.coroutines.f fVar, kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object d4 = e.d(fVar, e.a(interfaceC2283j, cVar.e()), null, new a(this, null), cVar, 4, null);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (d4 == l4) {
            return d4;
        }
        return H0.f51801a;
    }

    @Override // kotlinx.coroutines.flow.internal.d, kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    public Object a(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return r(this, interfaceC2283j, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.e
    protected Object g(@l3.d D<? super T> d4, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return s(this, d4, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.d
    public String toString() {
        return this.f54157H + " -> " + super.toString();
    }

    @l3.e
    protected abstract Object u(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar);
}
