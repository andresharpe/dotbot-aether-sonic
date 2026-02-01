package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.internal.AbstractC2302i;

/* renamed from: kotlinx.coroutines.internal.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2302i<N extends AbstractC2302i<N>> {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f54489a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2302i.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f54490b = AtomicReferenceFieldUpdater.newUpdater(AbstractC2302i.class, Object.class, "_prev");

    @l3.d
    private volatile /* synthetic */ Object _next = null;

    @l3.d
    private volatile /* synthetic */ Object _prev;

    public AbstractC2302i(@l3.e N n4) {
        this._prev = n4;
    }

    private final N c() {
        N f4 = f();
        while (f4 != null && f4.g()) {
            f4 = (N) f4._prev;
        }
        return f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e() {
        return this._next;
    }

    private final N h() {
        N d4 = d();
        kotlin.jvm.internal.F.m(d4);
        while (d4.g()) {
            d4 = (N) d4.d();
            kotlin.jvm.internal.F.m(d4);
        }
        return d4;
    }

    public final void b() {
        f54490b.lazySet(this, null);
    }

    @l3.e
    public final N d() {
        Object e4 = e();
        if (e4 == C2301h.a()) {
            return null;
        }
        return (N) e4;
    }

    @l3.e
    public final N f() {
        return (N) this._prev;
    }

    public abstract boolean g();

    public final boolean i() {
        if (d() == null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return androidx.concurrent.futures.b.a(f54489a, this, null, C2301h.a());
    }

    @l3.e
    public final N k(@l3.d X2.a aVar) {
        Object e4 = e();
        if (e4 != C2301h.a()) {
            return (N) e4;
        }
        aVar.n();
        throw new KotlinNothingValueException();
    }

    public final void l() {
        while (true) {
            N c4 = c();
            N h4 = h();
            h4._prev = c4;
            if (c4 != null) {
                c4._next = h4;
            }
            if (!h4.g() && (c4 == null || !c4.g())) {
                return;
            }
        }
    }

    public final boolean m(@l3.d N n4) {
        return androidx.concurrent.futures.b.a(f54489a, this, null, n4);
    }
}
