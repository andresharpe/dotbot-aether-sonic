package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C2210p;

/* renamed from: kotlinx.coroutines.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2345w0 {
    @l3.d
    public static final CancellationException a(@l3.e String str, @l3.e Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final void b(@l3.d Throwable th, @l3.d Throwable th2) {
        C2210p.a(th, th2);
    }
}
