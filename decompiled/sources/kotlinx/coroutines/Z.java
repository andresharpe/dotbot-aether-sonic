package kotlinx.coroutines;

/* loaded from: classes2.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f53007a = kotlinx.coroutines.internal.U.e("kotlinx.coroutines.main.delay", false);

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final InterfaceC2241c0 f53008b = b();

    @l3.d
    public static final InterfaceC2241c0 a() {
        return f53008b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final InterfaceC2241c0 b() {
        if (!f53007a) {
            return Y.f52996L;
        }
        W0 e4 = C2322k0.e();
        if (!kotlinx.coroutines.internal.F.d(e4) && (e4 instanceof InterfaceC2241c0)) {
            return (InterfaceC2241c0) e4;
        }
        return Y.f52996L;
    }
}
