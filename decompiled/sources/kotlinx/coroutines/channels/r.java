package kotlinx.coroutines.channels;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.Pair;
import kotlin.U;
import kotlin.V;
import kotlinx.coroutines.InterfaceC2239b1;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final String f53135a = "Channel was closed";

    @l3.d
    @U
    public static final <E, R> F<R> J(@l3.d F<? extends E> f4, @l3.d kotlin.coroutines.f fVar, @l3.d X2.p<? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        return u.E(f4, fVar, pVar);
    }

    @l3.d
    @U
    public static final <E, R> F<R> L(@l3.d F<? extends E> f4, @l3.d kotlin.coroutines.f fVar, @l3.d X2.q<? super Integer, ? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return u.G(f4, fVar, qVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final <E> kotlinx.coroutines.selects.d<E> U(@l3.d F<? extends E> f4) {
        return t.h(f4);
    }

    @l3.e
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @V(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final <E> Object V(@l3.d F<? extends E> f4, @l3.d kotlin.coroutines.c<? super E> cVar) {
        return t.i(f4, cVar);
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @V(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void X(@l3.d J<? super E> j4, E e4) {
        s.a(j4, e4);
    }

    @U
    public static final void b(@l3.d F<?> f4, @l3.e Throwable th) {
        t.a(f4, th);
    }

    @InterfaceC2239b1
    public static final <E, R> R c(@l3.d InterfaceC2250i<E> interfaceC2250i, @l3.d X2.l<? super F<? extends E>, ? extends R> lVar) {
        return (R) t.b(interfaceC2250i, lVar);
    }

    public static final <E, R> R d(@l3.d F<? extends E> f4, @l3.d X2.l<? super F<? extends E>, ? extends R> lVar) {
        return (R) t.c(f4, lVar);
    }

    @l3.e
    @InterfaceC2239b1
    public static final <E> Object e(@l3.d InterfaceC2250i<E> interfaceC2250i, @l3.d X2.l<? super E, H0> lVar, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return t.d(interfaceC2250i, lVar, cVar);
    }

    @l3.e
    @U
    public static final <E, C extends J<? super E>> Object e0(@l3.d F<? extends E> f4, @l3.d C c4, @l3.d kotlin.coroutines.c<? super C> cVar) {
        return u.W(f4, c4, cVar);
    }

    @l3.e
    public static final <E> Object f(@l3.d F<? extends E> f4, @l3.d X2.l<? super E, H0> lVar, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return t.e(f4, lVar, cVar);
    }

    @l3.e
    @U
    public static final <E, C extends Collection<? super E>> Object f0(@l3.d F<? extends E> f4, @l3.d C c4, @l3.d kotlin.coroutines.c<? super C> cVar) {
        return u.X(f4, c4, cVar);
    }

    @l3.d
    @U
    public static final X2.l<Throwable, H0> g(@l3.d F<?> f4) {
        return u.b(f4);
    }

    @l3.e
    public static final <E> Object g0(@l3.d F<? extends E> f4, @l3.d kotlin.coroutines.c<? super List<? extends E>> cVar) {
        return t.j(f4, cVar);
    }

    @l3.d
    @U
    public static final X2.l<Throwable, H0> h(@l3.d F<?>... fArr) {
        return u.c(fArr);
    }

    @l3.e
    @U
    public static final <K, V, M extends Map<? super K, ? super V>> Object h0(@l3.d F<? extends Pair<? extends K, ? extends V>> f4, @l3.d M m4, @l3.d kotlin.coroutines.c<? super M> cVar) {
        return u.Y(f4, m4, cVar);
    }

    @l3.d
    @U
    public static final <E, K> F<E> k(@l3.d F<? extends E> f4, @l3.d kotlin.coroutines.f fVar, @l3.d X2.p<? super E, ? super kotlin.coroutines.c<? super K>, ? extends Object> pVar) {
        return u.f(f4, fVar, pVar);
    }

    @l3.e
    @U
    public static final <E> Object k0(@l3.d F<? extends E> f4, @l3.d kotlin.coroutines.c<? super Set<E>> cVar) {
        return u.b0(f4, cVar);
    }

    @l3.d
    public static final <E> Object m0(@l3.d J<? super E> j4, E e4) {
        return s.b(j4, e4);
    }

    @l3.d
    @U
    public static final <E, R, V> F<V> q0(@l3.d F<? extends E> f4, @l3.d F<? extends R> f5, @l3.d kotlin.coroutines.f fVar, @l3.d X2.p<? super E, ? super R, ? extends V> pVar) {
        return u.g0(f4, f5, fVar, pVar);
    }

    @l3.d
    @U
    public static final <E> F<E> s(@l3.d F<? extends E> f4, @l3.d kotlin.coroutines.f fVar, @l3.d X2.p<? super E, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return u.n(f4, fVar, pVar);
    }

    @l3.d
    @U
    public static final <E> F<E> y(@l3.d F<? extends E> f4) {
        return u.t(f4);
    }
}
