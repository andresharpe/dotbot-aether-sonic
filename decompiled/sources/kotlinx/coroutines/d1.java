package kotlinx.coroutines;

import kotlinx.coroutines.internal.C2317y;

/* loaded from: classes2.dex */
final class d1 extends AbstractC2288g {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final C2317y f53370E;

    public d1(@l3.d C2317y c2317y) {
        this.f53370E = c2317y;
    }

    @Override // X2.l
    public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
        c(th);
        return kotlin.H0.f51801a;
    }

    @Override // kotlinx.coroutines.AbstractC2331p
    public void c(@l3.e Throwable th) {
        this.f53370E.Q0();
    }

    @l3.d
    public String toString() {
        return "RemoveOnCancel[" + this.f53370E + ']';
    }
}
