package kotlinx.coroutines.scheduling;

/* loaded from: classes2.dex */
public final class c extends h {

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    public static final c f54609M = new c();

    private c() {
        super(n.f54633c, n.f54634d, n.f54635e, n.f54631a);
    }

    @Override // kotlinx.coroutines.scheduling.h, kotlinx.coroutines.AbstractC2347x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final void s1() {
        super.close();
    }

    @Override // kotlinx.coroutines.N
    @l3.d
    public String toString() {
        return "Dispatchers.Default";
    }
}
