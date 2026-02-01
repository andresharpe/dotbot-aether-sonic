package U2;

import W2.i;
import X2.l;
import kotlin.C2210p;
import kotlin.U;
import kotlin.Y;
import kotlin.internal.f;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.F;
import l3.e;

@i(name = "AutoCloseableKt")
/* loaded from: classes2.dex */
public final class a {
    @U
    @Y(version = "1.2")
    public static final void a(@e AutoCloseable autoCloseable, @e Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                C2210p.a(th, th2);
            }
        }
    }

    @Y(version = "1.2")
    @f
    private static final <T extends AutoCloseable, R> R b(T t3, l<? super T, ? extends R> block) {
        F.p(block, "block");
        try {
            R C3 = block.C(t3);
            C.d(1);
            a(t3, null);
            C.c(1);
            return C3;
        } finally {
        }
    }
}
