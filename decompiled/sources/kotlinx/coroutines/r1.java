package kotlinx.coroutines;

/* loaded from: classes2.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final r1 f54556a = new r1();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final ThreadLocal<AbstractC2335r0> f54557b = new ThreadLocal<>();

    private r1() {
    }

    @l3.e
    public final AbstractC2335r0 a() {
        return f54557b.get();
    }

    @l3.d
    public final AbstractC2335r0 b() {
        ThreadLocal<AbstractC2335r0> threadLocal = f54557b;
        AbstractC2335r0 abstractC2335r0 = threadLocal.get();
        if (abstractC2335r0 == null) {
            AbstractC2335r0 a4 = C2341u0.a();
            threadLocal.set(a4);
            return a4;
        }
        return abstractC2335r0;
    }

    public final void c() {
        f54557b.set(null);
    }

    public final void d(@l3.d AbstractC2335r0 abstractC2335r0) {
        f54557b.set(abstractC2335r0);
    }
}
