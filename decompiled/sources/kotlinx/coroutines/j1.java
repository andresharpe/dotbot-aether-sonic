package kotlinx.coroutines;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j1<T, R> extends R0 {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final kotlinx.coroutines.selects.f<R> f54530I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final X2.p<T, kotlin.coroutines.c<? super R>, Object> f54531J;

    /* JADX WARN: Multi-variable type inference failed */
    public j1(@l3.d kotlinx.coroutines.selects.f<? super R> fVar, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        this.f54530I = fVar;
        this.f54531J = pVar;
    }

    @Override // X2.l
    public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
        X0(th);
        return kotlin.H0.f51801a;
    }

    @Override // kotlinx.coroutines.G
    public void X0(@l3.e Throwable th) {
        if (this.f54530I.y()) {
            Y0().s1(this.f54530I, this.f54531J);
        }
    }
}
