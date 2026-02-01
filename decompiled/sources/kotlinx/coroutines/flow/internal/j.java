package kotlinx.coroutines.flow.internal;

import java.util.Iterator;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.F;
import kotlinx.coroutines.flow.InterfaceC2282i;

/* loaded from: classes2.dex */
public final class j<T> extends d<T> {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final Iterable<InterfaceC2282i<T>> f54180H;

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f54181I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ InterfaceC2282i<T> f54182J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ u<T> f54183K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC2282i<? extends T> interfaceC2282i, u<T> uVar, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f54182J = interfaceC2282i;
            this.f54183K = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f54181I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                InterfaceC2282i<T> interfaceC2282i = this.f54182J;
                u<T> uVar = this.f54183K;
                this.f54181I = 1;
                if (interfaceC2282i.a(uVar, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new a(this.f54182J, this.f54183K, cVar);
        }
    }

    public /* synthetic */ j(Iterable iterable, kotlin.coroutines.f fVar, int i4, BufferOverflow bufferOverflow, int i5, C2197u c2197u) {
        this(iterable, (i5 & 2) != 0 ? EmptyCoroutineContext.f52041E : fVar, (i5 & 4) != 0 ? -2 : i4, (i5 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.e
    protected Object g(@l3.d D<? super T> d4, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        u uVar = new u(d4);
        Iterator<InterfaceC2282i<T>> it = this.f54180H.iterator();
        while (it.hasNext()) {
            C2323l.f(d4, null, null, new a(it.next(), uVar, null), 3, null);
        }
        return H0.f51801a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.d
    protected d<T> l(@l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        return new j(this.f54180H, fVar, i4, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.d
    public F<T> p(@l3.d U u3) {
        return B.c(u3, this.f54132E, this.f54133F, n());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@l3.d Iterable<? extends InterfaceC2282i<? extends T>> iterable, @l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        super(fVar, i4, bufferOverflow);
        this.f54180H = iterable;
    }
}
