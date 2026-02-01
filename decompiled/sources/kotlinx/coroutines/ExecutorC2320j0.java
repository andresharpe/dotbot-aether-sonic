package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: kotlinx.coroutines.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ExecutorC2320j0 implements Executor {

    /* renamed from: E, reason: collision with root package name */
    @W2.f
    @l3.d
    public final N f54529E;

    public ExecutorC2320j0(@l3.d N n4) {
        this.f54529E = n4;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@l3.d Runnable runnable) {
        this.f54529E.h1(EmptyCoroutineContext.f52041E, runnable);
    }

    @l3.d
    public String toString() {
        return this.f54529E.toString();
    }
}
