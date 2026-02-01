package kotlin.coroutines;

import X2.p;
import kotlin.Y;
import kotlin.coroutines.d;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;

@Y(version = "1.3")
/* loaded from: classes2.dex */
public interface f {

    /* loaded from: classes2.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kotlin.coroutines.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0462a extends Lambda implements p<f, b, f> {

            /* renamed from: F, reason: collision with root package name */
            public static final C0462a f52050F = new C0462a();

            C0462a() {
                super(2);
            }

            @Override // X2.p
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final f c0(@l3.d f acc, @l3.d b element) {
                CombinedContext combinedContext;
                F.p(acc, "acc");
                F.p(element, "element");
                f b4 = acc.b(element.getKey());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f52041E;
                if (b4 != emptyCoroutineContext) {
                    d.b bVar = d.f52046u;
                    d dVar = (d) b4.a(bVar);
                    if (dVar == null) {
                        combinedContext = new CombinedContext(b4, element);
                    } else {
                        f b5 = b4.b(bVar);
                        if (b5 == emptyCoroutineContext) {
                            return new CombinedContext(element, dVar);
                        }
                        combinedContext = new CombinedContext(new CombinedContext(b5, element), dVar);
                    }
                    return combinedContext;
                }
                return element;
            }
        }

        @l3.d
        public static f a(@l3.d f fVar, @l3.d f context) {
            F.p(context, "context");
            if (context != EmptyCoroutineContext.f52041E) {
                return (f) context.i(fVar, C0462a.f52050F);
            }
            return fVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface b extends f {

        /* loaded from: classes2.dex */
        public static final class a {
            public static <R> R a(@l3.d b bVar, R r4, @l3.d p<? super R, ? super b, ? extends R> operation) {
                F.p(operation, "operation");
                return operation.c0(r4, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @l3.e
            public static <E extends b> E b(@l3.d b bVar, @l3.d c<E> key) {
                F.p(key, "key");
                if (F.g(bVar.getKey(), key)) {
                    F.n(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            @l3.d
            public static f c(@l3.d b bVar, @l3.d c<?> key) {
                F.p(key, "key");
                if (F.g(bVar.getKey(), key)) {
                    return EmptyCoroutineContext.f52041E;
                }
                return bVar;
            }

            @l3.d
            public static f d(@l3.d b bVar, @l3.d f context) {
                F.p(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // kotlin.coroutines.f
        @l3.e
        <E extends b> E a(@l3.d c<E> cVar);

        @Override // kotlin.coroutines.f
        @l3.d
        f b(@l3.d c<?> cVar);

        @l3.d
        c<?> getKey();

        @Override // kotlin.coroutines.f
        <R> R i(R r4, @l3.d p<? super R, ? super b, ? extends R> pVar);
    }

    /* loaded from: classes2.dex */
    public interface c<E extends b> {
    }

    @l3.d
    f A(@l3.d f fVar);

    @l3.e
    <E extends b> E a(@l3.d c<E> cVar);

    @l3.d
    f b(@l3.d c<?> cVar);

    <R> R i(R r4, @l3.d p<? super R, ? super b, ? extends R> pVar);
}
