package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

@kotlin.E(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/L;", "", "fillInStackTrace", "()Ljava/lang/Throwable;", com.harman.log.b.f47574c, "()Lkotlinx/coroutines/JobCancellationException;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/coroutines/L0;", androidx.exifinterface.media.a.U4, "Lkotlinx/coroutines/L0;", "job", "message", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/L0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class JobCancellationException extends CancellationException implements L<JobCancellationException> {

    /* renamed from: E, reason: collision with root package name */
    @W2.f
    @l3.d
    public final transient L0 f52939E;

    public JobCancellationException(@l3.d String str, @l3.e Throwable th, @l3.d L0 l02) {
        super(str);
        this.f52939E = l02;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // kotlinx.coroutines.L
    @l3.e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JobCancellationException a() {
        return null;
    }

    public boolean equals(@l3.e Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!kotlin.jvm.internal.F.g(jobCancellationException.getMessage(), getMessage()) || !kotlin.jvm.internal.F.g(jobCancellationException.f52939E, this.f52939E) || !kotlin.jvm.internal.F.g(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @l3.d
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        int i4;
        String message = getMessage();
        kotlin.jvm.internal.F.m(message);
        int hashCode = ((message.hashCode() * 31) + this.f52939E.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i4 = cause.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    @Override // java.lang.Throwable
    @l3.d
    public String toString() {
        return super.toString() + "; job=" + this.f52939E;
    }
}
