package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.O;
import o.InterfaceMenuC2377a;

/* loaded from: classes2.dex */
public abstract class O<S extends O<S>> extends AbstractC2302i<S> {

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f54449d = AtomicIntegerFieldUpdater.newUpdater(O.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    private final long f54450c;

    @l3.d
    private volatile /* synthetic */ int cleanedAndPointers;

    public O(long j4, @l3.e S s4, int i4) {
        super(s4);
        this.f54450c = j4;
        this.cleanedAndPointers = i4 << 16;
    }

    @Override // kotlinx.coroutines.internal.AbstractC2302i
    public boolean g() {
        if (this.cleanedAndPointers == p() && !i()) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (f54449d.addAndGet(this, InterfaceMenuC2377a.f55290c) == p() && !i()) {
            return true;
        }
        return false;
    }

    public final long o() {
        return this.f54450c;
    }

    public abstract int p();

    public final void q() {
        if (f54449d.incrementAndGet(this) == p() && !i()) {
            l();
        }
    }

    public final boolean r() {
        int i4;
        do {
            i4 = this.cleanedAndPointers;
            if (i4 == p() && !i()) {
                return false;
            }
        } while (!f54449d.compareAndSet(this, i4, 65536 + i4));
        return true;
    }
}
