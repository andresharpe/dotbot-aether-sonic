package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2346x extends M0 implements InterfaceC2344w {

    /* renamed from: I, reason: collision with root package name */
    @W2.f
    @l3.d
    public final InterfaceC2348y f54760I;

    public C2346x(@l3.d InterfaceC2348y interfaceC2348y) {
        this.f54760I = interfaceC2348y;
    }

    @Override // kotlinx.coroutines.InterfaceC2344w
    public boolean A(@l3.d Throwable th) {
        return Y0().r0(th);
    }

    @Override // X2.l
    public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
        X0(th);
        return kotlin.H0.f51801a;
    }

    @Override // kotlinx.coroutines.G
    public void X0(@l3.e Throwable th) {
        this.f54760I.e0(Y0());
    }

    @Override // kotlinx.coroutines.InterfaceC2344w
    @l3.d
    public L0 getParent() {
        return Y0();
    }
}
