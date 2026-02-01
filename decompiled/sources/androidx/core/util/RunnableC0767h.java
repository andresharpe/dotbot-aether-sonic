package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.H0;
import kotlin.Result;

/* renamed from: androidx.core.util.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC0767h extends AtomicBoolean implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.c<H0> f13018E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC0767h(@l3.d kotlin.coroutines.c<? super H0> continuation) {
        super(false);
        kotlin.jvm.internal.F.p(continuation, "continuation");
        this.f13018E = continuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.c<H0> cVar = this.f13018E;
            Result.a aVar = Result.f51807F;
            cVar.x(Result.b(H0.f51801a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @l3.d
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
