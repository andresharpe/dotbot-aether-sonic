package kotlinx.coroutines;

import kotlin.coroutines.f;

/* loaded from: classes2.dex */
public interface p1<S> extends f.b {

    /* loaded from: classes2.dex */
    public static final class a {
        public static <S, R> R a(@l3.d p1<S> p1Var, R r4, @l3.d X2.p<? super R, ? super f.b, ? extends R> pVar) {
            return (R) f.b.a.a(p1Var, r4, pVar);
        }

        @l3.e
        public static <S, E extends f.b> E b(@l3.d p1<S> p1Var, @l3.d f.c<E> cVar) {
            return (E) f.b.a.b(p1Var, cVar);
        }

        @l3.d
        public static <S> kotlin.coroutines.f c(@l3.d p1<S> p1Var, @l3.d f.c<?> cVar) {
            return f.b.a.c(p1Var, cVar);
        }

        @l3.d
        public static <S> kotlin.coroutines.f d(@l3.d p1<S> p1Var, @l3.d kotlin.coroutines.f fVar) {
            return f.b.a.d(p1Var, fVar);
        }
    }

    void B0(@l3.d kotlin.coroutines.f fVar, S s4);

    S a1(@l3.d kotlin.coroutines.f fVar);
}
