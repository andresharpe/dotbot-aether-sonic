package kotlinx.coroutines.flow;

import java.util.List;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v<T> implements H<T>, InterfaceC2276c<T>, kotlinx.coroutines.flow.internal.p<T> {

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private final L0 f54366E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ H<T> f54367F;

    /* JADX WARN: Multi-variable type inference failed */
    public v(@l3.d H<? extends T> h4, @l3.e L0 l02) {
        this.f54366E = l02;
        this.f54367F = h4;
    }

    @Override // kotlinx.coroutines.flow.x, kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    public Object a(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<?> cVar) {
        return this.f54367F.a(interfaceC2283j, cVar);
    }

    @Override // kotlinx.coroutines.flow.x
    @l3.d
    public List<T> b() {
        return this.f54367F.b();
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @l3.d
    public InterfaceC2282i<T> c(@l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        return J.d(this, fVar, i4, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.H
    public T getValue() {
        return this.f54367F.getValue();
    }
}
