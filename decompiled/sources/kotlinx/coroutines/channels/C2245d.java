package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C2345w0;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.X;

/* renamed from: kotlinx.coroutines.channels.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2245d<E> extends n<E> implements InterfaceC2247f<E> {
    public C2245d(@l3.d kotlin.coroutines.f fVar, @l3.d InterfaceC2254m<E> interfaceC2254m, boolean z3) {
        super(fVar, interfaceC2254m, false, z3);
        S0((L0) fVar.a(L0.f52941w));
    }

    @Override // kotlinx.coroutines.S0
    protected boolean Q0(@l3.d Throwable th) {
        Q.b(e(), th);
        return true;
    }

    @Override // kotlinx.coroutines.S0
    protected void l1(@l3.e Throwable th) {
        InterfaceC2254m<E> J12 = J1();
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = C2345w0.a(X.a(this) + " was cancelled", th);
            }
        }
        J12.f(cancellationException);
    }
}
