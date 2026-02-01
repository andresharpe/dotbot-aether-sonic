package kotlinx.coroutines.flow;

import java.util.List;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u<T> implements x<T>, InterfaceC2276c<T>, kotlinx.coroutines.flow.internal.p<T> {

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private final L0 f54364E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ x<T> f54365F;

    /* JADX WARN: Multi-variable type inference failed */
    public u(@l3.d x<? extends T> xVar, @l3.e L0 l02) {
        this.f54364E = l02;
        this.f54365F = xVar;
    }

    @Override // kotlinx.coroutines.flow.x, kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    public Object a(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<?> cVar) {
        return this.f54365F.a(interfaceC2283j, cVar);
    }

    @Override // kotlinx.coroutines.flow.x
    @l3.d
    public List<T> b() {
        return this.f54365F.b();
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @l3.d
    public InterfaceC2282i<T> c(@l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        return z.e(this, fVar, i4, bufferOverflow);
    }
}
