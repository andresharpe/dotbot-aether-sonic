package kotlinx.coroutines;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.coroutines.f;
import kotlinx.coroutines.InterfaceC2235a0;

/* renamed from: kotlinx.coroutines.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2350z<T> extends InterfaceC2235a0<T> {

    /* renamed from: kotlinx.coroutines.z$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static <T, R> R b(@l3.d InterfaceC2350z<T> interfaceC2350z, R r4, @l3.d X2.p<? super R, ? super f.b, ? extends R> pVar) {
            return (R) InterfaceC2235a0.a.b(interfaceC2350z, r4, pVar);
        }

        @l3.e
        public static <T, E extends f.b> E c(@l3.d InterfaceC2350z<T> interfaceC2350z, @l3.d f.c<E> cVar) {
            return (E) InterfaceC2235a0.a.c(interfaceC2350z, cVar);
        }

        @l3.d
        public static <T> kotlin.coroutines.f d(@l3.d InterfaceC2350z<T> interfaceC2350z, @l3.d f.c<?> cVar) {
            return InterfaceC2235a0.a.d(interfaceC2350z, cVar);
        }

        @l3.d
        public static <T> kotlin.coroutines.f e(@l3.d InterfaceC2350z<T> interfaceC2350z, @l3.d kotlin.coroutines.f fVar) {
            return InterfaceC2235a0.a.e(interfaceC2350z, fVar);
        }

        @l3.d
        @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> L0 f(@l3.d InterfaceC2350z<T> interfaceC2350z, @l3.d L0 l02) {
            return InterfaceC2235a0.a.f(interfaceC2350z, l02);
        }
    }

    boolean F0(T t3);

    boolean k(@l3.d Throwable th);
}
