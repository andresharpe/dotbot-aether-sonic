package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.H0;

/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt {
    @l3.e
    public static final Object a(@l3.d Lifecycle lifecycle, @l3.d Lifecycle.State state, @l3.d X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        if (state != Lifecycle.State.INITIALIZED) {
            if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                return H0.f51801a;
            }
            Object g4 = kotlinx.coroutines.V.g(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, pVar, null), cVar);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (g4 == l4) {
                return g4;
            }
            return H0.f51801a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    @l3.e
    public static final Object b(@l3.d E e4, @l3.d Lifecycle.State state, @l3.d X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object a4 = a(e4.getLifecycle(), state, pVar, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }
}
