package kotlinx.coroutines;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

@G0
/* renamed from: kotlinx.coroutines.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2241c0 {

    /* renamed from: kotlinx.coroutines.c0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @l3.e
        @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        public static Object a(@l3.d InterfaceC2241c0 interfaceC2241c0, long j4, @l3.d kotlin.coroutines.c<? super kotlin.H0> cVar) {
            kotlin.coroutines.c e4;
            Object l4;
            Object l5;
            if (j4 > 0) {
                e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
                r rVar = new r(e4, 1);
                rVar.T();
                interfaceC2241c0.h(j4, rVar);
                Object z3 = rVar.z();
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (z3 == l4) {
                    kotlin.coroutines.jvm.internal.f.c(cVar);
                }
                l5 = kotlin.coroutines.intrinsics.b.l();
                if (z3 == l5) {
                    return z3;
                }
                return kotlin.H0.f51801a;
            }
            return kotlin.H0.f51801a;
        }

        @l3.d
        public static InterfaceC2328n0 b(@l3.d InterfaceC2241c0 interfaceC2241c0, long j4, @l3.d Runnable runnable, @l3.d kotlin.coroutines.f fVar) {
            return Z.a().x0(j4, runnable, fVar);
        }
    }

    void h(long j4, @l3.d InterfaceC2333q<? super kotlin.H0> interfaceC2333q);

    @l3.d
    InterfaceC2328n0 x0(long j4, @l3.d Runnable runnable, @l3.d kotlin.coroutines.f fVar);

    @l3.e
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    Object z0(long j4, @l3.d kotlin.coroutines.c<? super kotlin.H0> cVar);
}
