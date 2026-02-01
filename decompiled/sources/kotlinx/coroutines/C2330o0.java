package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2330o0 extends AbstractC2329o {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final InterfaceC2328n0 f54545E;

    public C2330o0(@l3.d InterfaceC2328n0 interfaceC2328n0) {
        this.f54545E = interfaceC2328n0;
    }

    @Override // X2.l
    public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
        c(th);
        return kotlin.H0.f51801a;
    }

    @Override // kotlinx.coroutines.AbstractC2331p
    public void c(@l3.e Throwable th) {
        this.f54545E.f();
    }

    @l3.d
    public String toString() {
        return "DisposeOnCancel[" + this.f54545E + ']';
    }
}
