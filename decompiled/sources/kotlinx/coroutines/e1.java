package kotlinx.coroutines;

import kotlin.Result;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e1<T> extends R0 {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final r<T> f53462I;

    /* JADX WARN: Multi-variable type inference failed */
    public e1(@l3.d r<? super T> rVar) {
        this.f53462I = rVar;
    }

    @Override // X2.l
    public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
        X0(th);
        return kotlin.H0.f51801a;
    }

    @Override // kotlinx.coroutines.G
    public void X0(@l3.e Throwable th) {
        Object P02 = Y0().P0();
        if (P02 instanceof E) {
            r<T> rVar = this.f53462I;
            Result.a aVar = Result.f51807F;
            rVar.x(Result.b(kotlin.W.a(((E) P02).f52925a)));
        } else {
            r<T> rVar2 = this.f53462I;
            Result.a aVar2 = Result.f51807F;
            rVar2.x(Result.b(T0.o(P02)));
        }
    }
}
