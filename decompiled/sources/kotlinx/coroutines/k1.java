package kotlinx.coroutines;

/* loaded from: classes2.dex */
final class k1<R> extends R0 {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final kotlinx.coroutines.selects.f<R> f54536I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final X2.l<kotlin.coroutines.c<? super R>, Object> f54537J;

    /* JADX WARN: Multi-variable type inference failed */
    public k1(@l3.d kotlinx.coroutines.selects.f<? super R> fVar, @l3.d X2.l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar) {
        this.f54536I = fVar;
        this.f54537J = lVar;
    }

    @Override // X2.l
    public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
        X0(th);
        return kotlin.H0.f51801a;
    }

    @Override // kotlinx.coroutines.G
    public void X0(@l3.e Throwable th) {
        if (this.f54536I.y()) {
            j3.a.c(this.f54537J, this.f54536I.R());
        }
    }
}
