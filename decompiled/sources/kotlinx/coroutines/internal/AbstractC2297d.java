package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.G0;

@G0
/* renamed from: kotlinx.coroutines.internal.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2297d<T> extends J {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f54476a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2297d.class, Object.class, "_consensus");

    @l3.d
    private volatile /* synthetic */ Object _consensus = C2296c.f54474a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.J
    @l3.d
    public AbstractC2297d<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.J
    @l3.e
    public final Object c(@l3.e Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C2296c.f54474a) {
            obj2 = e(i(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(T t3, @l3.e Object obj);

    @l3.e
    public final Object e(@l3.e Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C2296c.f54474a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (androidx.concurrent.futures.b.a(f54476a, this, obj3, obj)) {
            return obj;
        }
        return this._consensus;
    }

    @l3.e
    public final Object f() {
        return this._consensus;
    }

    public long g() {
        return 0L;
    }

    public final boolean h() {
        if (this._consensus != C2296c.f54474a) {
            return true;
        }
        return false;
    }

    @l3.e
    public abstract Object i(T t3);
}
