package kotlinx.coroutines.flow.internal;

/* loaded from: classes2.dex */
final class v<T> implements kotlin.coroutines.c<T>, kotlin.coroutines.jvm.internal.c {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.c<T> f54259E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.f f54260F;

    /* JADX WARN: Multi-variable type inference failed */
    public v(@l3.d kotlin.coroutines.c<? super T> cVar, @l3.d kotlin.coroutines.f fVar) {
        this.f54259E = cVar;
        this.f54260F = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.e
    public StackTraceElement I() {
        return null;
    }

    @Override // kotlin.coroutines.c
    @l3.d
    public kotlin.coroutines.f e() {
        return this.f54260F;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.e
    public kotlin.coroutines.jvm.internal.c q() {
        kotlin.coroutines.c<T> cVar = this.f54259E;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    public void x(@l3.d Object obj) {
        this.f54259E.x(obj);
    }
}
