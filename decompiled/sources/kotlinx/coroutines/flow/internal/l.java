package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.f;

/* loaded from: classes2.dex */
public final class l implements kotlin.coroutines.f {

    /* renamed from: E, reason: collision with root package name */
    @W2.f
    @l3.d
    public final Throwable f54243E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ kotlin.coroutines.f f54244F;

    public l(@l3.d Throwable th, @l3.d kotlin.coroutines.f fVar) {
        this.f54243E = th;
        this.f54244F = fVar;
    }

    @Override // kotlin.coroutines.f
    @l3.d
    public kotlin.coroutines.f A(@l3.d kotlin.coroutines.f fVar) {
        return this.f54244F.A(fVar);
    }

    @Override // kotlin.coroutines.f
    @l3.e
    public <E extends f.b> E a(@l3.d f.c<E> cVar) {
        return (E) this.f54244F.a(cVar);
    }

    @Override // kotlin.coroutines.f
    @l3.d
    public kotlin.coroutines.f b(@l3.d f.c<?> cVar) {
        return this.f54244F.b(cVar);
    }

    @Override // kotlin.coroutines.f
    public <R> R i(R r4, @l3.d X2.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) this.f54244F.i(r4, pVar);
    }
}
