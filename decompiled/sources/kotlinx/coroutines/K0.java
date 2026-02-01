package kotlinx.coroutines;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class K0 extends R0 {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final X2.l<Throwable, kotlin.H0> f52940I;

    /* JADX WARN: Multi-variable type inference failed */
    public K0(@l3.d X2.l<? super Throwable, kotlin.H0> lVar) {
        this.f52940I = lVar;
    }

    @Override // X2.l
    public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
        X0(th);
        return kotlin.H0.f51801a;
    }

    @Override // kotlinx.coroutines.G
    public void X0(@l3.e Throwable th) {
        this.f52940I.C(th);
    }
}
