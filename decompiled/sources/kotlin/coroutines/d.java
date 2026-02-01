package kotlin.coroutines;

import X2.p;
import kotlin.Y;
import kotlin.coroutines.f;
import kotlin.jvm.internal.F;

@Y(version = "1.3")
/* loaded from: classes2.dex */
public interface d extends f.b {

    /* renamed from: u, reason: collision with root package name */
    @l3.d
    public static final b f52046u = b.f52047E;

    /* loaded from: classes2.dex */
    public static final class a {
        public static <R> R a(@l3.d d dVar, R r4, @l3.d p<? super R, ? super f.b, ? extends R> operation) {
            F.p(operation, "operation");
            return (R) f.b.a.a(dVar, r4, operation);
        }

        @l3.e
        public static <E extends f.b> E b(@l3.d d dVar, @l3.d f.c<E> key) {
            F.p(key, "key");
            if (key instanceof kotlin.coroutines.b) {
                kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
                if (!bVar.a(dVar.getKey())) {
                    return null;
                }
                E e4 = (E) bVar.b(dVar);
                if (!(e4 instanceof f.b)) {
                    return null;
                }
                return e4;
            }
            if (d.f52046u != key) {
                return null;
            }
            F.n(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return dVar;
        }

        @l3.d
        public static f c(@l3.d d dVar, @l3.d f.c<?> key) {
            F.p(key, "key");
            if (key instanceof kotlin.coroutines.b) {
                kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
                if (bVar.a(dVar.getKey()) && bVar.b(dVar) != null) {
                    return EmptyCoroutineContext.f52041E;
                }
                return dVar;
            }
            if (d.f52046u == key) {
                return EmptyCoroutineContext.f52041E;
            }
            return dVar;
        }

        @l3.d
        public static f d(@l3.d d dVar, @l3.d f context) {
            F.p(context, "context");
            return f.b.a.d(dVar, context);
        }

        public static void e(@l3.d d dVar, @l3.d c<?> continuation) {
            F.p(continuation, "continuation");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements f.c<d> {

        /* renamed from: E, reason: collision with root package name */
        static final /* synthetic */ b f52047E = new b();

        private b() {
        }
    }

    @Override // kotlin.coroutines.f.b, kotlin.coroutines.f
    @l3.e
    <E extends f.b> E a(@l3.d f.c<E> cVar);

    @Override // kotlin.coroutines.f.b, kotlin.coroutines.f
    @l3.d
    f b(@l3.d f.c<?> cVar);

    void n(@l3.d c<?> cVar);

    @l3.d
    <T> c<T> v(@l3.d c<? super T> cVar);
}
