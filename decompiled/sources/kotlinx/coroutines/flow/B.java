package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes2.dex */
final class B<T> {

    /* renamed from: a, reason: collision with root package name */
    @W2.f
    @l3.d
    public final InterfaceC2282i<T> f53475a;

    /* renamed from: b, reason: collision with root package name */
    @W2.f
    public final int f53476b;

    /* renamed from: c, reason: collision with root package name */
    @W2.f
    @l3.d
    public final BufferOverflow f53477c;

    /* renamed from: d, reason: collision with root package name */
    @W2.f
    @l3.d
    public final kotlin.coroutines.f f53478d;

    /* JADX WARN: Multi-variable type inference failed */
    public B(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, int i4, @l3.d BufferOverflow bufferOverflow, @l3.d kotlin.coroutines.f fVar) {
        this.f53475a = interfaceC2282i;
        this.f53476b = i4;
        this.f53477c = bufferOverflow;
        this.f53478d = fVar;
    }
}
