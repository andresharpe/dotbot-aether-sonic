package kotlinx.coroutines.scheduling;

/* loaded from: classes2.dex */
public abstract class j implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    @W2.f
    public long f54627E;

    /* renamed from: F, reason: collision with root package name */
    @W2.f
    @l3.d
    public k f54628F;

    public j(long j4, @l3.d k kVar) {
        this.f54627E = j4;
        this.f54628F = kVar;
    }

    public final int a() {
        return this.f54628F.i0();
    }

    public j() {
        this(0L, n.f54639i);
    }
}
