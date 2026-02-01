package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;
import kotlinx.coroutines.internal.X;

/* loaded from: classes2.dex */
public final class e {
    public static final /* synthetic */ InterfaceC2283j a(InterfaceC2283j interfaceC2283j, kotlin.coroutines.f fVar) {
        return e(interfaceC2283j, fVar);
    }

    @l3.d
    public static final <T> d<T> b(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        d<T> dVar;
        if (interfaceC2282i instanceof d) {
            dVar = (d) interfaceC2282i;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return new h(interfaceC2282i, null, 0, null, 14, null);
        }
        return dVar;
    }

    @l3.e
    public static final <T, V> Object c(@l3.d kotlin.coroutines.f fVar, V v3, @l3.d Object obj, @l3.d X2.p<? super V, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        Object l4;
        Object c4 = X.c(fVar, obj);
        try {
            Object c02 = ((X2.p) kotlin.jvm.internal.X.q(pVar, 2)).c0(v3, new v(cVar, fVar));
            X.a(fVar, c4);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (c02 == l4) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return c02;
        } catch (Throwable th) {
            X.a(fVar, c4);
            throw th;
        }
    }

    public static /* synthetic */ Object d(kotlin.coroutines.f fVar, Object obj, Object obj2, X2.p pVar, kotlin.coroutines.c cVar, int i4, Object obj3) {
        if ((i4 & 4) != 0) {
            obj2 = X.b(fVar);
        }
        return c(fVar, obj, obj2, pVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC2283j<T> e(InterfaceC2283j<? super T> interfaceC2283j, kotlin.coroutines.f fVar) {
        if (!(interfaceC2283j instanceof u) && !(interfaceC2283j instanceof r)) {
            return new x(interfaceC2283j, fVar);
        }
        return interfaceC2283j;
    }
}
