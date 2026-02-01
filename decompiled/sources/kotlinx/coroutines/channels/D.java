package kotlinx.coroutines.channels;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.J;

/* loaded from: classes2.dex */
public interface D<E> extends U, J<E> {

    /* loaded from: classes2.dex */
    public static final class a {
        @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @V(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean a(@l3.d D<? super E> d4, E e4) {
            return J.a.c(d4, e4);
        }
    }

    @l3.d
    J<E> h();
}
