package kotlinx.coroutines;

import kotlin.coroutines.f;

/* loaded from: classes2.dex */
final class z1 implements f.b, f.c<z1> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    public static final z1 f54766E = new z1();

    private z1() {
    }

    @Override // kotlin.coroutines.f
    @l3.d
    public kotlin.coroutines.f A(@l3.d kotlin.coroutines.f fVar) {
        return f.b.a.d(this, fVar);
    }

    @Override // kotlin.coroutines.f.b, kotlin.coroutines.f
    @l3.e
    public <E extends f.b> E a(@l3.d f.c<E> cVar) {
        return (E) f.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.f.b, kotlin.coroutines.f
    @l3.d
    public kotlin.coroutines.f b(@l3.d f.c<?> cVar) {
        return f.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.f.b
    @l3.d
    public f.c<?> getKey() {
        return this;
    }

    @Override // kotlin.coroutines.f.b, kotlin.coroutines.f
    public <R> R i(R r4, @l3.d X2.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) f.b.a.a(this, r4, pVar);
    }
}
