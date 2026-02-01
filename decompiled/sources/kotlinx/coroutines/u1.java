package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
final class u1 implements X2.l<Throwable, kotlin.H0> {

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f54741H = AtomicIntegerFieldUpdater.newUpdater(u1.class, "_state");

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final L0 f54742E;

    /* renamed from: G, reason: collision with root package name */
    @l3.e
    private InterfaceC2328n0 f54744G;

    @l3.d
    private volatile /* synthetic */ int _state = 0;

    /* renamed from: F, reason: collision with root package name */
    private final Thread f54743F = Thread.currentThread();

    public u1(@l3.d L0 l02) {
        this.f54742E = l02;
    }

    private final Void d(int i4) {
        throw new IllegalStateException(("Illegal state " + i4).toString());
    }

    @Override // X2.l
    public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
        e(th);
        return kotlin.H0.f51801a;
    }

    public final void c() {
        while (true) {
            int i4 = this._state;
            if (i4 != 0) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        d(i4);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f54741H.compareAndSet(this, i4, 1)) {
                InterfaceC2328n0 interfaceC2328n0 = this.f54744G;
                if (interfaceC2328n0 != null) {
                    interfaceC2328n0.f();
                    return;
                }
                return;
            }
        }
    }

    public void e(@l3.e Throwable th) {
        int i4;
        do {
            i4 = this._state;
            if (i4 != 0) {
                if (i4 != 1 && i4 != 2 && i4 != 3) {
                    d(i4);
                    throw new KotlinNothingValueException();
                }
                return;
            }
        } while (!f54741H.compareAndSet(this, i4, 2));
        this.f54743F.interrupt();
        this._state = 3;
    }

    public final void f() {
        int i4;
        this.f54744G = this.f54742E.p(true, true, this);
        do {
            i4 = this._state;
            if (i4 != 0) {
                if (i4 != 2 && i4 != 3) {
                    d(i4);
                    throw new KotlinNothingValueException();
                }
                return;
            }
        } while (!f54741H.compareAndSet(this, i4, 0));
    }
}
