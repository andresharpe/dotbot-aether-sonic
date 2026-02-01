package S2;

import java.util.concurrent.CancellationException;
import kotlin.Y;
import kotlin.internal.f;
import kotlin.jvm.internal.U;

@U({"SMAP\nCancellationException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellationException.kt\nkotlin/coroutines/cancellation/CancellationExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* loaded from: classes2.dex */
public final class a {
    @Y(version = "1.4")
    @f
    private static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @Y(version = "1.4")
    @f
    private static final CancellationException b(Throwable th) {
        String str;
        if (th != null) {
            str = th.toString();
        } else {
            str = null;
        }
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @Y(version = "1.4")
    public static /* synthetic */ void c() {
    }
}
