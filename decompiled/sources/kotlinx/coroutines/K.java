package kotlinx.coroutines;

import kotlin.coroutines.f;
import kotlinx.coroutines.p1;

@A0
@InterfaceC2271e0
/* loaded from: classes2.dex */
public interface K<S> extends p1<S> {

    /* loaded from: classes2.dex */
    public static final class a {
        public static <S, R> R a(@l3.d K<S> k4, R r4, @l3.d X2.p<? super R, ? super f.b, ? extends R> pVar) {
            return (R) p1.a.a(k4, r4, pVar);
        }

        @l3.e
        public static <S, E extends f.b> E b(@l3.d K<S> k4, @l3.d f.c<E> cVar) {
            return (E) p1.a.b(k4, cVar);
        }

        @l3.d
        public static <S> kotlin.coroutines.f c(@l3.d K<S> k4, @l3.d f.c<?> cVar) {
            return p1.a.c(k4, cVar);
        }

        @l3.d
        public static <S> kotlin.coroutines.f d(@l3.d K<S> k4, @l3.d kotlin.coroutines.f fVar) {
            return p1.a.d(k4, fVar);
        }
    }

    @l3.d
    K<S> y0();

    @l3.d
    kotlin.coroutines.f z(@l3.d f.b bVar);
}
