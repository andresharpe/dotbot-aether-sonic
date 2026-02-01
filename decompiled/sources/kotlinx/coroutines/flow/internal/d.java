package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.G0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V;
import kotlinx.coroutines.X;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.F;
import kotlinx.coroutines.flow.C2284k;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;

@G0
/* loaded from: classes2.dex */
public abstract class d<T> implements p<T> {

    /* renamed from: E, reason: collision with root package name */
    @W2.f
    @l3.d
    public final kotlin.coroutines.f f54132E;

    /* renamed from: F, reason: collision with root package name */
    @W2.f
    public final int f54133F;

    /* renamed from: G, reason: collision with root package name */
    @W2.f
    @l3.d
    public final BufferOverflow f54134G;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f54135I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f54136J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ InterfaceC2283j<T> f54137K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ d<T> f54138L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC2283j<? super T> interfaceC2283j, d<T> dVar, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f54137K = interfaceC2283j;
            this.f54138L = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f54135I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                U u3 = (U) this.f54136J;
                InterfaceC2283j<T> interfaceC2283j = this.f54137K;
                F<T> p4 = this.f54138L.p(u3);
                this.f54135I = 1;
                if (C2284k.l0(interfaceC2283j, p4, this) == l4) {
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
            a aVar = new a(this.f54137K, this.f54138L, cVar);
            aVar.f54136J = obj;
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements X2.p<D<? super T>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f54139I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f54140J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ d<T> f54141K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d<T> dVar, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f54141K = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f54139I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                D<? super T> d4 = (D) this.f54140J;
                d<T> dVar = this.f54141K;
                this.f54139I = 1;
                if (dVar.g(d4, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d D<? super T> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            b bVar = new b(this.f54141K, cVar);
            bVar.f54140J = obj;
            return bVar;
        }
    }

    public d(@l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        this.f54132E = fVar;
        this.f54133F = i4;
        this.f54134G = bufferOverflow;
    }

    static /* synthetic */ Object e(d dVar, InterfaceC2283j interfaceC2283j, kotlin.coroutines.c cVar) {
        Object l4;
        Object g4 = V.g(new a(interfaceC2283j, dVar, null), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (g4 == l4) {
            return g4;
        }
        return H0.f51801a;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    public Object a(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return e(this, interfaceC2283j, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @l3.d
    public InterfaceC2282i<T> c(@l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        kotlin.coroutines.f A3 = fVar.A(this.f54132E);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i5 = this.f54133F;
            if (i5 != -3) {
                if (i4 != -3) {
                    if (i5 != -2) {
                        if (i4 != -2) {
                            i4 += i5;
                            if (i4 < 0) {
                                i4 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i4 = i5;
            }
            bufferOverflow = this.f54134G;
        }
        if (kotlin.jvm.internal.F.g(A3, this.f54132E) && i4 == this.f54133F && bufferOverflow == this.f54134G) {
            return this;
        }
        return l(A3, i4, bufferOverflow);
    }

    @l3.e
    protected String d() {
        return null;
    }

    @l3.e
    protected abstract Object g(@l3.d D<? super T> d4, @l3.d kotlin.coroutines.c<? super H0> cVar);

    @l3.d
    protected abstract d<T> l(@l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow);

    @l3.e
    public InterfaceC2282i<T> m() {
        return null;
    }

    @l3.d
    public final X2.p<D<? super T>, kotlin.coroutines.c<? super H0>, Object> n() {
        return new b(this, null);
    }

    public final int o() {
        int i4 = this.f54133F;
        if (i4 == -3) {
            return -2;
        }
        return i4;
    }

    @l3.d
    public F<T> p(@l3.d U u3) {
        return B.h(u3, this.f54132E, o(), this.f54134G, CoroutineStart.ATOMIC, null, n(), 16, null);
    }

    @l3.d
    public String toString() {
        String m32;
        ArrayList arrayList = new ArrayList(4);
        String d4 = d();
        if (d4 != null) {
            arrayList.add(d4);
        }
        if (this.f54132E != EmptyCoroutineContext.f52041E) {
            arrayList.add("context=" + this.f54132E);
        }
        if (this.f54133F != -3) {
            arrayList.add("capacity=" + this.f54133F);
        }
        if (this.f54134G != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f54134G);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(X.a(this));
        sb.append('[');
        m32 = kotlin.collections.D.m3(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb.append(m32);
        sb.append(']');
        return sb.toString();
    }
}
