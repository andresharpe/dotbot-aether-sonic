package kotlinx.coroutines;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v1<U, T extends U> extends kotlinx.coroutines.internal.N<T> implements Runnable {

    /* renamed from: H, reason: collision with root package name */
    @W2.f
    public final long f54754H;

    public v1(long j4, @l3.d kotlin.coroutines.c<? super U> cVar) {
        super(cVar.e(), cVar);
        this.f54754H = j4;
    }

    @Override // kotlinx.coroutines.AbstractC2234a, kotlinx.coroutines.S0
    @l3.d
    public String g1() {
        return super.g1() + "(timeMillis=" + this.f54754H + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        l0(w1.a(this.f54754H, this));
    }
}
