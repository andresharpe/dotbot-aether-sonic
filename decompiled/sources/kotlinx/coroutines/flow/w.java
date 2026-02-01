package kotlinx.coroutines.flow;

import kotlin.H0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class w<T> extends AbstractC2274a<T> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final X2.p<InterfaceC2283j<? super T>, kotlin.coroutines.c<? super H0>, Object> f54368E;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@l3.d X2.p<? super InterfaceC2283j<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        this.f54368E = pVar;
    }

    @Override // kotlinx.coroutines.flow.AbstractC2274a
    @l3.e
    public Object d(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object c02 = this.f54368E.c0(interfaceC2283j, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (c02 == l4) {
            return c02;
        }
        return H0.f51801a;
    }
}
