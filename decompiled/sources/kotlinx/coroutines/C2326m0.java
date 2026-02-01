package kotlinx.coroutines;

import java.util.concurrent.Future;

/* renamed from: kotlinx.coroutines.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2326m0 implements InterfaceC2328n0 {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Future<?> f54543E;

    public C2326m0(@l3.d Future<?> future) {
        this.f54543E = future;
    }

    @Override // kotlinx.coroutines.InterfaceC2328n0
    public void f() {
        this.f54543E.cancel(false);
    }

    @l3.d
    public String toString() {
        return "DisposableFutureHandle[" + this.f54543E + ']';
    }
}
