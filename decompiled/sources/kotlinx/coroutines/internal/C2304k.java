package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2304k implements kotlinx.coroutines.U {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.f f54491E;

    public C2304k(@l3.d kotlin.coroutines.f fVar) {
        this.f54491E = fVar;
    }

    @Override // kotlinx.coroutines.U
    @l3.d
    public kotlin.coroutines.f getCoroutineContext() {
        return this.f54491E;
    }

    @l3.d
    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
