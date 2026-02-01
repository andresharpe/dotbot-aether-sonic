package kotlinx.coroutines;

import kotlin.Result;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f1 extends R0 {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.c<kotlin.H0> f53472I;

    /* JADX WARN: Multi-variable type inference failed */
    public f1(@l3.d kotlin.coroutines.c<? super kotlin.H0> cVar) {
        this.f53472I = cVar;
    }

    @Override // X2.l
    public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
        X0(th);
        return kotlin.H0.f51801a;
    }

    @Override // kotlinx.coroutines.G
    public void X0(@l3.e Throwable th) {
        kotlin.coroutines.c<kotlin.H0> cVar = this.f53472I;
        Result.a aVar = Result.f51807F;
        cVar.x(Result.b(kotlin.H0.f51801a));
    }
}
