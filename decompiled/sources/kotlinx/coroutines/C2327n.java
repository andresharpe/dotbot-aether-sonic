package kotlinx.coroutines;

import java.util.concurrent.Future;

/* renamed from: kotlinx.coroutines.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2327n extends R0 {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final Future<?> f54544I;

    public C2327n(@l3.d Future<?> future) {
        this.f54544I = future;
    }

    @Override // X2.l
    public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
        X0(th);
        return kotlin.H0.f51801a;
    }

    @Override // kotlinx.coroutines.G
    public void X0(@l3.e Throwable th) {
        if (th != null) {
            this.f54544I.cancel(false);
        }
    }
}
