package kotlinx.coroutines;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.internal.C2306m;
import kotlinx.coroutines.internal.C2317y;

/* renamed from: kotlinx.coroutines.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2338t {
    @G0
    public static final void a(@l3.d InterfaceC2333q<?> interfaceC2333q, @l3.d InterfaceC2328n0 interfaceC2328n0) {
        interfaceC2333q.u(new C2330o0(interfaceC2328n0));
    }

    @l3.d
    public static final <T> r<T> b(@l3.d kotlin.coroutines.c<? super T> cVar) {
        if (!(cVar instanceof C2306m)) {
            return new r<>(cVar, 1);
        }
        r<T> l4 = ((C2306m) cVar).l();
        if (l4 != null) {
            if (!l4.K()) {
                l4 = null;
            }
            if (l4 != null) {
                return l4;
            }
        }
        return new r<>(cVar, 2);
    }

    public static final void c(@l3.d InterfaceC2333q<?> interfaceC2333q, @l3.d C2317y c2317y) {
        interfaceC2333q.u(new d1(c2317y));
    }

    @l3.e
    public static final <T> Object d(@l3.d X2.l<? super InterfaceC2333q<? super T>, kotlin.H0> lVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        r rVar = new r(e4, 1);
        rVar.T();
        lVar.C(rVar);
        Object z3 = rVar.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return z3;
    }

    private static final <T> Object e(X2.l<? super InterfaceC2333q<? super T>, kotlin.H0> lVar, kotlin.coroutines.c<? super T> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        kotlin.jvm.internal.C.e(0);
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        r rVar = new r(e4, 1);
        rVar.T();
        lVar.C(rVar);
        Object z3 = rVar.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        kotlin.jvm.internal.C.e(1);
        return z3;
    }

    @l3.e
    public static final <T> Object f(@l3.d X2.l<? super InterfaceC2333q<? super T>, kotlin.H0> lVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        r b4 = b(e4);
        lVar.C(b4);
        Object z3 = b4.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return z3;
    }

    private static final <T> Object g(X2.l<? super InterfaceC2333q<? super T>, kotlin.H0> lVar, kotlin.coroutines.c<? super T> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        kotlin.jvm.internal.C.e(0);
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        r b4 = b(e4);
        lVar.C(b4);
        Object z3 = b4.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        kotlin.jvm.internal.C.e(1);
        return z3;
    }
}
