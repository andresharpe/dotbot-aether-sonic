package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

@kotlin.E(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u000eJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/L;", com.harman.log.b.f47574c, "()Lkotlinx/coroutines/TimeoutCancellationException;", "Lkotlinx/coroutines/L0;", androidx.exifinterface.media.a.U4, "Lkotlinx/coroutines/L0;", "coroutine", "", "message", "<init>", "(Ljava/lang/String;Lkotlinx/coroutines/L0;)V", "(Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class TimeoutCancellationException extends CancellationException implements L<TimeoutCancellationException> {

    /* renamed from: E, reason: collision with root package name */
    @W2.f
    @l3.e
    public final transient L0 f52984E;

    public TimeoutCancellationException(@l3.d String str, @l3.e L0 l02) {
        super(str);
        this.f52984E = l02;
    }

    @Override // kotlinx.coroutines.L
    @l3.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TimeoutCancellationException a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f52984E);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }

    public TimeoutCancellationException(@l3.d String str) {
        this(str, null);
    }
}
