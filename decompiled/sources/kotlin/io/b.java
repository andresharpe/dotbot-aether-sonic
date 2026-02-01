package kotlin.io;

import java.io.Closeable;
import kotlin.C2210p;
import kotlin.U;
import kotlin.Y;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.F;

@W2.i(name = "CloseableKt")
/* loaded from: classes2.dex */
public final class b {
    @U
    @Y(version = "1.1")
    public static final void a(@l3.e Closeable closeable, @l3.e Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C2210p.a(th, th2);
            }
        }
    }

    @kotlin.internal.f
    private static final <T extends Closeable, R> R b(T t3, X2.l<? super T, ? extends R> block) {
        F.p(block, "block");
        try {
            R C3 = block.C(t3);
            C.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                a(t3, null);
            } else if (t3 != null) {
                t3.close();
            }
            C.c(1);
            return C3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C.d(1);
                if (!kotlin.internal.m.a(1, 1, 0)) {
                    if (t3 != null) {
                        try {
                            t3.close();
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    a(t3, th);
                }
                C.c(1);
                throw th2;
            }
        }
    }
}
