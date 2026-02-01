package kotlinx.coroutines;

/* loaded from: classes2.dex */
final class A<T> extends S0 implements InterfaceC2350z<T>, kotlinx.coroutines.selects.d<T> {
    public A(@l3.e L0 l02) {
        super(true);
        S0(l02);
    }

    @Override // kotlinx.coroutines.InterfaceC2235a0
    @l3.d
    public kotlinx.coroutines.selects.d<T> D() {
        return this;
    }

    @Override // kotlinx.coroutines.InterfaceC2350z
    public boolean F0(T t3) {
        return c1(t3);
    }

    @Override // kotlinx.coroutines.S0
    public boolean L0() {
        return true;
    }

    @Override // kotlinx.coroutines.selects.d
    public <R> void X(@l3.d kotlinx.coroutines.selects.f<? super R> fVar, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        q1(fVar, pVar);
    }

    @Override // kotlinx.coroutines.InterfaceC2235a0
    @l3.e
    public Object c0(@l3.d kotlin.coroutines.c<? super T> cVar) {
        Object i02 = i0(cVar);
        kotlin.coroutines.intrinsics.b.l();
        return i02;
    }

    @Override // kotlinx.coroutines.InterfaceC2350z
    public boolean k(@l3.d Throwable th) {
        return c1(new E(th, false, 2, null));
    }

    @Override // kotlinx.coroutines.InterfaceC2235a0
    public T t() {
        return (T) D0();
    }
}
