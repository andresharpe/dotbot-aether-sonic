package kotlinx.coroutines.channels;

import kotlin.H0;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* loaded from: classes2.dex */
final class y<E> extends C2245d<E> implements kotlinx.coroutines.selects.e<E, J<? super E>> {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private kotlin.coroutines.c<? super H0> f53365H;

    public y(@l3.d kotlin.coroutines.f fVar, @l3.d InterfaceC2254m<E> interfaceC2254m, @l3.d X2.p<? super InterfaceC2247f<E>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        super(fVar, interfaceC2254m, false);
        kotlin.coroutines.c<? super H0> c4;
        c4 = IntrinsicsKt__IntrinsicsJvmKt.c(pVar, this, this);
        this.f53365H = c4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.e
    public <R> void C(@l3.d kotlinx.coroutines.selects.f<? super R> fVar, E e4, @l3.d X2.p<? super J<? super E>, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        start();
        super.K().C(fVar, e4, pVar);
    }

    @Override // kotlinx.coroutines.channels.n, kotlinx.coroutines.channels.J
    @l3.d
    public kotlinx.coroutines.selects.e<E, J<E>> K() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.n, kotlinx.coroutines.channels.J
    /* renamed from: P */
    public boolean d(@l3.e Throwable th) {
        boolean d4 = super.d(th);
        start();
        return d4;
    }

    @Override // kotlinx.coroutines.channels.n, kotlinx.coroutines.channels.J
    @l3.d
    public Object S(E e4) {
        start();
        return super.S(e4);
    }

    @Override // kotlinx.coroutines.channels.n, kotlinx.coroutines.channels.J
    @l3.e
    public Object U(E e4, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        start();
        Object U3 = super.U(e4, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (U3 == l4) {
            return U3;
        }
        return H0.f51801a;
    }

    @Override // kotlinx.coroutines.S0
    protected void n1() {
        j3.a.e(this.f53365H, this);
    }

    @Override // kotlinx.coroutines.channels.n, kotlinx.coroutines.channels.J
    public boolean offer(E e4) {
        start();
        return super.offer(e4);
    }
}
