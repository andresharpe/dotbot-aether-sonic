package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.internal.N;

/* loaded from: classes2.dex */
final class m<T> extends N<T> {
    public m(@l3.d kotlin.coroutines.f fVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        super(fVar, cVar);
    }

    @Override // kotlinx.coroutines.S0
    public boolean r0(@l3.d Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return m0(th);
    }
}
