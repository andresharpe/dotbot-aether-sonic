package kotlinx.coroutines;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2238b0<T> extends AbstractC2234a<T> implements InterfaceC2235a0<T>, kotlinx.coroutines.selects.d<T> {
    public C2238b0(@l3.d kotlin.coroutines.f fVar, boolean z3) {
        super(fVar, true, z3);
    }

    static /* synthetic */ Object J1(C2238b0 c2238b0, kotlin.coroutines.c cVar) {
        Object i02 = c2238b0.i0(cVar);
        kotlin.coroutines.intrinsics.b.l();
        return i02;
    }

    @Override // kotlinx.coroutines.InterfaceC2235a0
    @l3.d
    public kotlinx.coroutines.selects.d<T> D() {
        return this;
    }

    @Override // kotlinx.coroutines.selects.d
    public <R> void X(@l3.d kotlinx.coroutines.selects.f<? super R> fVar, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        q1(fVar, pVar);
    }

    @Override // kotlinx.coroutines.InterfaceC2235a0
    @l3.e
    public Object c0(@l3.d kotlin.coroutines.c<? super T> cVar) {
        return J1(this, cVar);
    }

    @Override // kotlinx.coroutines.InterfaceC2235a0
    public T t() {
        return (T) D0();
    }
}
