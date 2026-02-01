package kotlinx.coroutines;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.internal.C2306m;
import kotlinx.coroutines.internal.C2307n;

/* loaded from: classes2.dex */
public final class B1 {
    @l3.e
    public static final Object a(@l3.d kotlin.coroutines.c<? super kotlin.H0> cVar) {
        kotlin.coroutines.c e4;
        C2306m c2306m;
        Object l4;
        Object l5;
        Object l6;
        kotlin.coroutines.f e5 = cVar.e();
        O0.z(e5);
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        if (e4 instanceof C2306m) {
            c2306m = (C2306m) e4;
        } else {
            c2306m = null;
        }
        if (c2306m == null) {
            l4 = kotlin.H0.f51801a;
        } else {
            if (c2306m.f54493H.j1(e5)) {
                c2306m.n(e5, kotlin.H0.f51801a);
            } else {
                A1 a12 = new A1();
                kotlin.coroutines.f A3 = e5.A(a12);
                kotlin.H0 h02 = kotlin.H0.f51801a;
                c2306m.n(A3, h02);
                if (a12.f52915F) {
                    l4 = C2307n.h(c2306m) ? kotlin.coroutines.intrinsics.b.l() : h02;
                }
            }
            l4 = kotlin.coroutines.intrinsics.b.l();
        }
        l5 = kotlin.coroutines.intrinsics.b.l();
        if (l4 == l5) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        l6 = kotlin.coroutines.intrinsics.b.l();
        if (l4 == l6) {
            return l4;
        }
        return kotlin.H0.f51801a;
    }
}
