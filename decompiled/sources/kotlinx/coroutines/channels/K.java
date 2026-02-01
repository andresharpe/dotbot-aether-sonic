package kotlinx.coroutines.channels;

import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlinx.coroutines.C2336s;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.X;
import kotlinx.coroutines.internal.C2317y;
import kotlinx.coroutines.internal.S;

/* loaded from: classes2.dex */
public class K<E> extends I {

    /* renamed from: H, reason: collision with root package name */
    private final E f53038H;

    /* renamed from: I, reason: collision with root package name */
    @W2.f
    @l3.d
    public final InterfaceC2333q<H0> f53039I;

    /* JADX WARN: Multi-variable type inference failed */
    public K(E e4, @l3.d InterfaceC2333q<? super H0> interfaceC2333q) {
        this.f53038H = e4;
        this.f53039I = interfaceC2333q;
    }

    @Override // kotlinx.coroutines.channels.I
    public void X0() {
        this.f53039I.t0(C2336s.f54561d);
    }

    @Override // kotlinx.coroutines.channels.I
    public E Y0() {
        return this.f53038H;
    }

    @Override // kotlinx.coroutines.channels.I
    public void Z0(@l3.d v<?> vVar) {
        InterfaceC2333q<H0> interfaceC2333q = this.f53039I;
        Result.a aVar = Result.f51807F;
        interfaceC2333q.x(Result.b(W.a(vVar.f1())));
    }

    @Override // kotlinx.coroutines.channels.I
    @l3.e
    public S a1(@l3.e C2317y.d dVar) {
        C2317y.a aVar;
        InterfaceC2333q<H0> interfaceC2333q = this.f53039I;
        H0 h02 = H0.f51801a;
        if (dVar != null) {
            aVar = dVar.f54523c;
        } else {
            aVar = null;
        }
        if (interfaceC2333q.o(h02, aVar) == null) {
            return null;
        }
        if (dVar != null) {
            dVar.d();
        }
        return C2336s.f54561d;
    }

    @Override // kotlinx.coroutines.internal.C2317y
    @l3.d
    public String toString() {
        return X.a(this) + '@' + X.b(this) + '(' + Y0() + ')';
    }
}
