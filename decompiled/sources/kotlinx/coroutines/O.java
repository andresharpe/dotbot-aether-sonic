package kotlinx.coroutines;

import kotlin.coroutines.f;

/* loaded from: classes2.dex */
public interface O extends f.b {

    /* renamed from: v, reason: collision with root package name */
    @l3.d
    public static final b f52951v = b.f52952E;

    /* loaded from: classes2.dex */
    public static final class a {
        public static <R> R a(@l3.d O o4, R r4, @l3.d X2.p<? super R, ? super f.b, ? extends R> pVar) {
            return (R) f.b.a.a(o4, r4, pVar);
        }

        @l3.e
        public static <E extends f.b> E b(@l3.d O o4, @l3.d f.c<E> cVar) {
            return (E) f.b.a.b(o4, cVar);
        }

        @l3.d
        public static kotlin.coroutines.f c(@l3.d O o4, @l3.d f.c<?> cVar) {
            return f.b.a.c(o4, cVar);
        }

        @l3.d
        public static kotlin.coroutines.f d(@l3.d O o4, @l3.d kotlin.coroutines.f fVar) {
            return f.b.a.d(o4, fVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements f.c<O> {

        /* renamed from: E, reason: collision with root package name */
        static final /* synthetic */ b f52952E = new b();

        private b() {
        }
    }

    void Y0(@l3.d kotlin.coroutines.f fVar, @l3.d Throwable th);
}
