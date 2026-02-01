package kotlinx.coroutines;

/* loaded from: classes2.dex */
final class I0 extends AbstractC2329o {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final X2.l<Throwable, kotlin.H0> f52936E;

    /* JADX WARN: Multi-variable type inference failed */
    public I0(@l3.d X2.l<? super Throwable, kotlin.H0> lVar) {
        this.f52936E = lVar;
    }

    @Override // X2.l
    public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
        c(th);
        return kotlin.H0.f51801a;
    }

    @Override // kotlinx.coroutines.AbstractC2331p
    public void c(@l3.e Throwable th) {
        this.f52936E.C(th);
    }

    @l3.d
    public String toString() {
        return "InvokeOnCancel[" + X.a(this.f52936E) + '@' + X.b(this) + ']';
    }
}
