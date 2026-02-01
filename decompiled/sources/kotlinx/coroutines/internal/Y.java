package kotlinx.coroutines.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.f;
import kotlinx.coroutines.p1;

/* loaded from: classes2.dex */
public final class Y<T> implements p1<T> {

    /* renamed from: E, reason: collision with root package name */
    private final T f54465E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final ThreadLocal<T> f54466F;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final f.c<?> f54467G;

    public Y(T t3, @l3.d ThreadLocal<T> threadLocal) {
        this.f54465E = t3;
        this.f54466F = threadLocal;
        this.f54467G = new Z(threadLocal);
    }

    @Override // kotlin.coroutines.f
    @l3.d
    public kotlin.coroutines.f A(@l3.d kotlin.coroutines.f fVar) {
        return p1.a.d(this, fVar);
    }

    @Override // kotlinx.coroutines.p1
    public void B0(@l3.d kotlin.coroutines.f fVar, T t3) {
        this.f54466F.set(t3);
    }

    @Override // kotlin.coroutines.f.b, kotlin.coroutines.f
    @l3.e
    public <E extends f.b> E a(@l3.d f.c<E> cVar) {
        if (kotlin.jvm.internal.F.g(getKey(), cVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlinx.coroutines.p1
    public T a1(@l3.d kotlin.coroutines.f fVar) {
        T t3 = this.f54466F.get();
        this.f54466F.set(this.f54465E);
        return t3;
    }

    @Override // kotlin.coroutines.f.b, kotlin.coroutines.f
    @l3.d
    public kotlin.coroutines.f b(@l3.d f.c<?> cVar) {
        if (kotlin.jvm.internal.F.g(getKey(), cVar)) {
            return EmptyCoroutineContext.f52041E;
        }
        return this;
    }

    @Override // kotlin.coroutines.f.b
    @l3.d
    public f.c<?> getKey() {
        return this.f54467G;
    }

    @Override // kotlin.coroutines.f.b, kotlin.coroutines.f
    public <R> R i(R r4, @l3.d X2.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) p1.a.a(this, r4, pVar);
    }

    @l3.d
    public String toString() {
        return "ThreadLocal(value=" + this.f54465E + ", threadLocal = " + this.f54466F + ')';
    }
}
