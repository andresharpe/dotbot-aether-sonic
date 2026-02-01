package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.E;
import kotlinx.coroutines.flow.InterfaceC2283j;

@E(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "Lkotlinx/coroutines/flow/j;", androidx.exifinterface.media.a.U4, "Lkotlinx/coroutines/flow/j;", "owner", "<init>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class AbortFlowException extends CancellationException {

    /* renamed from: E, reason: collision with root package name */
    @W2.f
    @l3.d
    public final transient InterfaceC2283j<?> f54115E;

    public AbortFlowException(@l3.d InterfaceC2283j<?> interfaceC2283j) {
        super("Flow was aborted, no more elements needed");
        this.f54115E = interfaceC2283j;
    }

    @Override // java.lang.Throwable
    @l3.d
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
