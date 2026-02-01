package kotlinx.coroutines.channels;

import kotlin.H0;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.channels.J;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class C<E> extends n<E> implements D<E> {
    public C(@l3.d kotlin.coroutines.f fVar, @l3.d InterfaceC2254m<E> interfaceC2254m) {
        super(fVar, interfaceC2254m, true, true);
    }

    @Override // kotlinx.coroutines.AbstractC2234a
    protected void G1(@l3.d Throwable th, boolean z3) {
        if (!J1().d(th) && !z3) {
            Q.b(e(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractC2234a
    /* renamed from: K1, reason: merged with bridge method [inline-methods] */
    public void H1(@l3.d H0 h02) {
        J.a.a(J1(), null, 1, null);
    }

    @Override // kotlinx.coroutines.AbstractC2234a, kotlinx.coroutines.S0, kotlinx.coroutines.L0
    public boolean c() {
        return super.c();
    }

    @Override // kotlinx.coroutines.channels.D
    public /* bridge */ /* synthetic */ J h() {
        return h();
    }
}
