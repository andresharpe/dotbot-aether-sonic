package kotlinx.coroutines.channels;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlinx.coroutines.InterfaceC2239b1;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.F;

@InterfaceC2239b1
/* renamed from: kotlinx.coroutines.channels.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2247f<E> extends U, F<E> {

    /* renamed from: kotlinx.coroutines.channels.f$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @l3.d
        public static <E> kotlinx.coroutines.selects.d<E> b(@l3.d InterfaceC2247f<E> interfaceC2247f) {
            return F.a.d(interfaceC2247f);
        }

        @l3.e
        @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @V(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E c(@l3.d InterfaceC2247f<E> interfaceC2247f) {
            return (E) F.a.h(interfaceC2247f);
        }

        @l3.e
        @kotlin.internal.h
        @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @V(expression = "receiveCatching().getOrNull()", imports = {}))
        public static <E> Object d(@l3.d InterfaceC2247f<E> interfaceC2247f, @l3.d kotlin.coroutines.c<? super E> cVar) {
            return F.a.i(interfaceC2247f, cVar);
        }
    }

    @l3.d
    InterfaceC2254m<E> h();
}
