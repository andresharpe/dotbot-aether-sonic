package kotlinx.coroutines.flow.internal;

import kotlin.H0;
import kotlinx.coroutines.G0;
import kotlinx.coroutines.channels.J;
import kotlinx.coroutines.flow.InterfaceC2283j;

@G0
/* loaded from: classes2.dex */
public final class u<T> implements InterfaceC2283j<T> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final J<T> f54258E;

    /* JADX WARN: Multi-variable type inference failed */
    public u(@l3.d J<? super T> j4) {
        this.f54258E = j4;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2283j
    @l3.e
    public Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object U3 = this.f54258E.U(t3, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (U3 == l4) {
            return U3;
        }
        return H0.f51801a;
    }
}
