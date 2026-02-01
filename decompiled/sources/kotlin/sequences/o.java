package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.H0;
import kotlin.Y;

@Y(version = "1.3")
@kotlin.coroutines.h
/* loaded from: classes2.dex */
public abstract class o<T> {
    @l3.e
    public abstract Object b(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar);

    @l3.e
    public final Object h(@l3.d Iterable<? extends T> iterable, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return H0.f51801a;
        }
        Object i4 = i(iterable.iterator(), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (i4 == l4) {
            return i4;
        }
        return H0.f51801a;
    }

    @l3.e
    public abstract Object i(@l3.d Iterator<? extends T> it, @l3.d kotlin.coroutines.c<? super H0> cVar);

    @l3.e
    public final Object j(@l3.d m<? extends T> mVar, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object i4 = i(mVar.iterator(), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (i4 == l4) {
            return i4;
        }
        return H0.f51801a;
    }
}
