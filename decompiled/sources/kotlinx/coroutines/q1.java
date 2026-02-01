package kotlinx.coroutines;

/* loaded from: classes2.dex */
public final class q1 {
    @l3.d
    public static final <T> p1<T> a(@l3.d ThreadLocal<T> threadLocal, T t3) {
        return new kotlinx.coroutines.internal.Y(t3, threadLocal);
    }

    public static /* synthetic */ p1 b(ThreadLocal threadLocal, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = threadLocal.get();
        }
        return a(threadLocal, obj);
    }

    @l3.e
    public static final Object c(@l3.d ThreadLocal<?> threadLocal, @l3.d kotlin.coroutines.c<? super kotlin.H0> cVar) {
        if (cVar.e().a(new kotlinx.coroutines.internal.Z(threadLocal)) != null) {
            return kotlin.H0.f51801a;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + cVar.e()).toString());
    }

    private static final Object d(ThreadLocal<?> threadLocal, kotlin.coroutines.c<? super kotlin.H0> cVar) {
        kotlin.jvm.internal.C.e(3);
        throw null;
    }

    @l3.e
    public static final Object e(@l3.d ThreadLocal<?> threadLocal, @l3.d kotlin.coroutines.c<? super Boolean> cVar) {
        boolean z3;
        if (cVar.e().a(new kotlinx.coroutines.internal.Z(threadLocal)) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        return kotlin.coroutines.jvm.internal.a.a(z3);
    }

    private static final Object f(ThreadLocal<?> threadLocal, kotlin.coroutines.c<? super Boolean> cVar) {
        kotlin.jvm.internal.C.e(3);
        throw null;
    }
}
