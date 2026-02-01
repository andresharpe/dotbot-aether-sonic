package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.X;

/* loaded from: classes2.dex */
public final class m extends j {

    /* renamed from: G, reason: collision with root package name */
    @W2.f
    @l3.d
    public final Runnable f54630G;

    public m(@l3.d Runnable runnable, long j4, @l3.d k kVar) {
        super(j4, kVar);
        this.f54630G = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f54630G.run();
        } finally {
            this.f54628F.P();
        }
    }

    @l3.d
    public String toString() {
        return "Task[" + X.a(this.f54630G) + '@' + X.b(this.f54630G) + ", " + this.f54627E + ", " + this.f54628F + ']';
    }
}
