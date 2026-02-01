package kotlinx.coroutines.flow.internal;

import kotlin.H0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;

/* loaded from: classes2.dex */
public final class h<T> extends g<T, T> {
    public /* synthetic */ h(InterfaceC2282i interfaceC2282i, kotlin.coroutines.f fVar, int i4, BufferOverflow bufferOverflow, int i5, C2197u c2197u) {
        this(interfaceC2282i, (i5 & 2) != 0 ? EmptyCoroutineContext.f52041E : fVar, (i5 & 4) != 0 ? -3 : i4, (i5 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.d
    protected d<T> l(@l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        return new h(this.f54157H, fVar, i4, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.d
    public InterfaceC2282i<T> m() {
        return (InterfaceC2282i<T>) this.f54157H;
    }

    @Override // kotlinx.coroutines.flow.internal.g
    @l3.e
    protected Object u(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object a4 = this.f54157H.a(interfaceC2283j, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }

    public h(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        super(interfaceC2282i, fVar, i4, bufferOverflow);
    }
}
