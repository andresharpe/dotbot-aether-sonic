package kotlinx.coroutines;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.C2210p;
import kotlin.Result;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes2.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final List<O> f52953a;

    static {
        kotlin.sequences.m e4;
        List<O> c32;
        e4 = kotlin.sequences.s.e(ServiceLoader.load(O.class, O.class.getClassLoader()).iterator());
        c32 = SequencesKt___SequencesKt.c3(e4);
        f52953a = c32;
    }

    public static final void a(@l3.d kotlin.coroutines.f fVar, @l3.d Throwable th) {
        Iterator<O> it = f52953a.iterator();
        while (it.hasNext()) {
            try {
                it.next().Y0(fVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, Q.c(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            Result.a aVar = Result.f51807F;
            C2210p.a(th, new C2273f0(fVar));
            Result.b(kotlin.H0.f51801a);
        } catch (Throwable th3) {
            Result.a aVar2 = Result.f51807F;
            Result.b(kotlin.W.a(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
