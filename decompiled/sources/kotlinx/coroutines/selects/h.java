package kotlinx.coroutines.selects;

import X2.l;
import kotlin.H0;
import kotlin.jvm.internal.C;

/* loaded from: classes2.dex */
public final class h {
    @l3.e
    public static final <R> Object a(@l3.d l<? super a<? super R>, H0> lVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        Object l4;
        j jVar = new j(cVar);
        try {
            lVar.C(jVar);
        } catch (Throwable th) {
            jVar.c(th);
        }
        Object d4 = jVar.d();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (d4 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return d4;
    }

    private static final <R> Object b(l<? super a<? super R>, H0> lVar, kotlin.coroutines.c<? super R> cVar) {
        Object l4;
        C.e(0);
        j jVar = new j(cVar);
        try {
            lVar.C(jVar);
        } catch (Throwable th) {
            jVar.c(th);
        }
        Object d4 = jVar.d();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (d4 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        C.e(1);
        return d4;
    }
}
