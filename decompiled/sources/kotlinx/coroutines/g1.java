package kotlinx.coroutines;

/* loaded from: classes2.dex */
final class g1 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final N f54391E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final InterfaceC2333q<kotlin.H0> f54392F;

    /* JADX WARN: Multi-variable type inference failed */
    public g1(@l3.d N n4, @l3.d InterfaceC2333q<? super kotlin.H0> interfaceC2333q) {
        this.f54391E = n4;
        this.f54392F = interfaceC2333q;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f54392F.Q(this.f54391E, kotlin.H0.f51801a);
    }
}
