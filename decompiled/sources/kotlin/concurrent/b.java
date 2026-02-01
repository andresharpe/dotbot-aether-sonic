package kotlin.concurrent;

import W2.i;
import kotlin.H0;
import kotlin.internal.f;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.e;

@i(name = "ThreadsKt")
@U({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes2.dex */
public final class b {

    /* loaded from: classes2.dex */
    public static final class a extends Thread {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ X2.a<H0> f52031E;

        a(X2.a<H0> aVar) {
            this.f52031E = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f52031E.n();
        }
    }

    @f
    private static final <T> T a(ThreadLocal<T> threadLocal, X2.a<? extends T> aVar) {
        F.p(threadLocal, "<this>");
        F.p(aVar, "default");
        T t3 = threadLocal.get();
        if (t3 == null) {
            T n4 = aVar.n();
            threadLocal.set(n4);
            return n4;
        }
        return t3;
    }

    @l3.d
    public static final Thread b(boolean z3, boolean z4, @e ClassLoader classLoader, @e String str, int i4, @l3.d X2.a<H0> block) {
        F.p(block, "block");
        a aVar = new a(block);
        if (z4) {
            aVar.setDaemon(true);
        }
        if (i4 > 0) {
            aVar.setPriority(i4);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z3) {
            aVar.start();
        }
        return aVar;
    }

    public static /* synthetic */ Thread c(boolean z3, boolean z4, ClassLoader classLoader, String str, int i4, X2.a aVar, int i5, Object obj) {
        ClassLoader classLoader2;
        String str2;
        if ((i5 & 1) != 0) {
            z3 = true;
        }
        boolean z5 = z3;
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        boolean z6 = z4;
        if ((i5 & 4) != 0) {
            classLoader2 = null;
        } else {
            classLoader2 = classLoader;
        }
        if ((i5 & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i5 & 16) != 0) {
            i4 = -1;
        }
        return b(z5, z6, classLoader2, str2, i4, aVar);
    }
}
