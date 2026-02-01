package kotlinx.coroutines.channels;

import kotlin.H0;
import kotlinx.coroutines.InterfaceC2333q;

/* loaded from: classes2.dex */
public final class L<E> extends K<E> {

    /* renamed from: J, reason: collision with root package name */
    @W2.f
    @l3.d
    public final X2.l<E, H0> f53040J;

    /* JADX WARN: Multi-variable type inference failed */
    public L(E e4, @l3.d InterfaceC2333q<? super H0> interfaceC2333q, @l3.d X2.l<? super E, H0> lVar) {
        super(e4, interfaceC2333q);
        this.f53040J = lVar;
    }

    @Override // kotlinx.coroutines.internal.C2317y
    public boolean Q0() {
        if (!super.Q0()) {
            return false;
        }
        b1();
        return true;
    }

    @Override // kotlinx.coroutines.channels.I
    public void b1() {
        kotlinx.coroutines.internal.I.b(this.f53040J, Y0(), this.f53039I.e());
    }
}
