package kotlin.coroutines;

import X2.p;
import kotlin.Y;
import kotlin.coroutines.f;
import kotlin.jvm.internal.F;

@Y(version = "1.3")
/* loaded from: classes2.dex */
public abstract class a implements f.b {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final f.c<?> f52043E;

    public a(@l3.d f.c<?> key) {
        F.p(key, "key");
        this.f52043E = key;
    }

    @Override // kotlin.coroutines.f
    @l3.d
    public f A(@l3.d f fVar) {
        return f.b.a.d(this, fVar);
    }

    @Override // kotlin.coroutines.f.b, kotlin.coroutines.f
    @l3.e
    public <E extends f.b> E a(@l3.d f.c<E> cVar) {
        return (E) f.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.f.b, kotlin.coroutines.f
    @l3.d
    public f b(@l3.d f.c<?> cVar) {
        return f.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.f.b
    @l3.d
    public f.c<?> getKey() {
        return this.f52043E;
    }

    @Override // kotlin.coroutines.f.b, kotlin.coroutines.f
    public <R> R i(R r4, @l3.d p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) f.b.a.a(this, r4, pVar);
    }
}
