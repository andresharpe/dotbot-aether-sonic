package kotlinx.coroutines.internal;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: kotlinx.coroutines.internal.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2300g {

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private static final Method f54486a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f54486a = method;
    }

    public static /* synthetic */ void a() {
    }

    @l3.d
    public static final <E> Set<E> b(int i4) {
        return Collections.newSetFromMap(new IdentityHashMap(i4));
    }

    public static final boolean c(@l3.d Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor == null || (method = f54486a) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @l3.d
    public static final <E> List<E> d() {
        return new CopyOnWriteArrayList();
    }

    public static final <T> T e(@l3.d ReentrantLock reentrantLock, @l3.d X2.a<? extends T> aVar) {
        reentrantLock.lock();
        try {
            return aVar.n();
        } finally {
            kotlin.jvm.internal.C.d(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.C.c(1);
        }
    }
}
