package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* loaded from: classes2.dex */
public final class a {
    @W2.i(name = "isSchedulerWorker")
    public static final boolean a(@l3.d Thread thread) {
        return thread instanceof CoroutineScheduler.c;
    }

    @W2.i(name = "mayNotBlock")
    public static final boolean b(@l3.d Thread thread) {
        if ((thread instanceof CoroutineScheduler.c) && ((CoroutineScheduler.c) thread).f54601F == CoroutineScheduler.WorkerState.CPU_ACQUIRED) {
            return true;
        }
        return false;
    }
}
