package kotlinx.coroutines.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class A<E> {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f54403a = AtomicReferenceFieldUpdater.newUpdater(A.class, Object.class, "_cur");

    @l3.d
    private volatile /* synthetic */ Object _cur;

    public A(boolean z3) {
        this._cur = new B(8, z3);
    }

    public final boolean a(@l3.d E e4) {
        while (true) {
            B b4 = (B) this._cur;
            int a4 = b4.a(e4);
            if (a4 == 0) {
                return true;
            }
            if (a4 != 1) {
                if (a4 == 2) {
                    return false;
                }
            } else {
                androidx.concurrent.futures.b.a(f54403a, this, b4, b4.k());
            }
        }
    }

    public final void b() {
        while (true) {
            B b4 = (B) this._cur;
            if (b4.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f54403a, this, b4, b4.k());
            }
        }
    }

    public final int c() {
        return ((B) this._cur).f();
    }

    public final boolean d() {
        return ((B) this._cur).g();
    }

    public final boolean e() {
        return ((B) this._cur).h();
    }

    @l3.d
    public final <R> List<R> f(@l3.d X2.l<? super E, ? extends R> lVar) {
        return ((B) this._cur).i(lVar);
    }

    @l3.e
    public final E g() {
        while (true) {
            B b4 = (B) this._cur;
            E e4 = (E) b4.l();
            if (e4 != B.f54419t) {
                return e4;
            }
            androidx.concurrent.futures.b.a(f54403a, this, b4, b4.k());
        }
    }
}
