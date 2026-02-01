package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes2.dex */
public class E {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f52924b = AtomicIntegerFieldUpdater.newUpdater(E.class, "_handled");

    @l3.d
    private volatile /* synthetic */ int _handled;

    /* renamed from: a, reason: collision with root package name */
    @W2.f
    @l3.d
    public final Throwable f52925a;

    public E(@l3.d Throwable th, boolean z3) {
        this.f52925a = th;
        this._handled = z3 ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return f52924b.compareAndSet(this, 0, 1);
    }

    @l3.d
    public String toString() {
        return X.a(this) + '[' + this.f52925a + ']';
    }

    public /* synthetic */ E(Throwable th, boolean z3, int i4, C2197u c2197u) {
        this(th, (i4 & 2) != 0 ? false : z3);
    }
}
