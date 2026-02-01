package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2273f0 extends RuntimeException {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.f f53471E;

    public C2273f0(@l3.d kotlin.coroutines.f fVar) {
        this.f53471E = fVar;
    }

    @Override // java.lang.Throwable
    @l3.d
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @l3.d
    public String getLocalizedMessage() {
        return this.f53471E.toString();
    }
}
