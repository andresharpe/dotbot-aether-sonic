package kotlinx.coroutines.channels;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlinx.coroutines.channels.F;
import kotlinx.coroutines.channels.J;
import kotlinx.coroutines.internal.U;

/* renamed from: kotlinx.coroutines.channels.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2254m<E> extends J<E>, F<E> {

    /* renamed from: A, reason: collision with root package name */
    public static final int f53112A = -1;

    /* renamed from: B, reason: collision with root package name */
    public static final int f53113B = -2;

    /* renamed from: C, reason: collision with root package name */
    public static final int f53114C = -3;

    /* renamed from: D, reason: collision with root package name */
    @l3.d
    public static final String f53115D = "kotlinx.coroutines.channels.defaultBuffer";

    /* renamed from: x, reason: collision with root package name */
    @l3.d
    public static final b f53116x = b.f53119a;

    /* renamed from: y, reason: collision with root package name */
    public static final int f53117y = Integer.MAX_VALUE;

    /* renamed from: z, reason: collision with root package name */
    public static final int f53118z = 0;

    /* renamed from: kotlinx.coroutines.channels.m$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @l3.d
        public static <E> kotlinx.coroutines.selects.d<E> b(@l3.d InterfaceC2254m<E> interfaceC2254m) {
            return F.a.d(interfaceC2254m);
        }

        @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @V(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@l3.d InterfaceC2254m<E> interfaceC2254m, E e4) {
            return J.a.c(interfaceC2254m, e4);
        }

        @l3.e
        @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @V(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E d(@l3.d InterfaceC2254m<E> interfaceC2254m) {
            return (E) F.a.h(interfaceC2254m);
        }

        @l3.e
        @kotlin.internal.h
        @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @V(expression = "receiveCatching().getOrNull()", imports = {}))
        public static <E> Object e(@l3.d InterfaceC2254m<E> interfaceC2254m, @l3.d kotlin.coroutines.c<? super E> cVar) {
            return F.a.i(interfaceC2254m, cVar);
        }
    }

    /* renamed from: kotlinx.coroutines.channels.m$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final int f53120b = Integer.MAX_VALUE;

        /* renamed from: c, reason: collision with root package name */
        public static final int f53121c = 0;

        /* renamed from: d, reason: collision with root package name */
        public static final int f53122d = -1;

        /* renamed from: e, reason: collision with root package name */
        public static final int f53123e = -2;

        /* renamed from: f, reason: collision with root package name */
        public static final int f53124f = -3;

        /* renamed from: g, reason: collision with root package name */
        @l3.d
        public static final String f53125g = "kotlinx.coroutines.channels.defaultBuffer";

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f53119a = new b();

        /* renamed from: h, reason: collision with root package name */
        private static final int f53126h = U.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private b() {
        }

        public final int a() {
            return f53126h;
        }
    }
}
