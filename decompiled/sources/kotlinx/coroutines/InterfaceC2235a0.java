package kotlinx.coroutines;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.coroutines.f;
import kotlinx.coroutines.L0;

/* renamed from: kotlinx.coroutines.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2235a0<T> extends L0 {

    /* renamed from: kotlinx.coroutines.a0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static <T, R> R b(@l3.d InterfaceC2235a0<? extends T> interfaceC2235a0, R r4, @l3.d X2.p<? super R, ? super f.b, ? extends R> pVar) {
            return (R) L0.a.d(interfaceC2235a0, r4, pVar);
        }

        @l3.e
        public static <T, E extends f.b> E c(@l3.d InterfaceC2235a0<? extends T> interfaceC2235a0, @l3.d f.c<E> cVar) {
            return (E) L0.a.e(interfaceC2235a0, cVar);
        }

        @l3.d
        public static <T> kotlin.coroutines.f d(@l3.d InterfaceC2235a0<? extends T> interfaceC2235a0, @l3.d f.c<?> cVar) {
            return L0.a.g(interfaceC2235a0, cVar);
        }

        @l3.d
        public static <T> kotlin.coroutines.f e(@l3.d InterfaceC2235a0<? extends T> interfaceC2235a0, @l3.d kotlin.coroutines.f fVar) {
            return L0.a.h(interfaceC2235a0, fVar);
        }

        @l3.d
        @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> L0 f(@l3.d InterfaceC2235a0<? extends T> interfaceC2235a0, @l3.d L0 l02) {
            return L0.a.i(interfaceC2235a0, l02);
        }
    }

    @l3.d
    kotlinx.coroutines.selects.d<T> D();

    @l3.e
    @A0
    Throwable G();

    @l3.e
    Object c0(@l3.d kotlin.coroutines.c<? super T> cVar);

    @A0
    T t();
}
