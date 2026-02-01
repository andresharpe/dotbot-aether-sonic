package kotlinx.coroutines;

/* loaded from: classes2.dex */
public abstract class R0 extends G implements InterfaceC2328n0, E0 {

    /* renamed from: H, reason: collision with root package name */
    public S0 f52955H;

    @Override // kotlinx.coroutines.E0
    @l3.e
    public X0 D() {
        return null;
    }

    @l3.d
    public final S0 Y0() {
        S0 s02 = this.f52955H;
        if (s02 != null) {
            return s02;
        }
        kotlin.jvm.internal.F.S("job");
        return null;
    }

    public final void Z0(@l3.d S0 s02) {
        this.f52955H = s02;
    }

    @Override // kotlinx.coroutines.E0
    public boolean c() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC2328n0
    public void f() {
        Y0().r1(this);
    }

    @Override // kotlinx.coroutines.internal.C2317y
    @l3.d
    public String toString() {
        return X.a(this) + '@' + X.b(this) + "[job@" + X.b(Y0()) + ']';
    }
}
