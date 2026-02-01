package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
final class J0 extends M0 {

    /* renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f52937J = AtomicIntegerFieldUpdater.newUpdater(J0.class, "_invoked");

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final X2.l<Throwable, kotlin.H0> f52938I;

    @l3.d
    private volatile /* synthetic */ int _invoked = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public J0(@l3.d X2.l<? super Throwable, kotlin.H0> lVar) {
        this.f52938I = lVar;
    }

    @Override // X2.l
    public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
        X0(th);
        return kotlin.H0.f51801a;
    }

    @Override // kotlinx.coroutines.G
    public void X0(@l3.e Throwable th) {
        if (f52937J.compareAndSet(this, 0, 1)) {
            this.f52938I.C(th);
        }
    }
}
