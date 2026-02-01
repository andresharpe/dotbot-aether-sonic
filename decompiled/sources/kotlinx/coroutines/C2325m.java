package kotlinx.coroutines;

import java.util.concurrent.Future;

/* renamed from: kotlinx.coroutines.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2325m extends AbstractC2329o {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Future<?> f54542E;

    public C2325m(@l3.d Future<?> future) {
        this.f54542E = future;
    }

    @Override // X2.l
    public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
        c(th);
        return kotlin.H0.f51801a;
    }

    @Override // kotlinx.coroutines.AbstractC2331p
    public void c(@l3.e Throwable th) {
        if (th != null) {
            this.f54542E.cancel(false);
        }
    }

    @l3.d
    public String toString() {
        return "CancelFutureOnCancel[" + this.f54542E + ']';
    }
}
