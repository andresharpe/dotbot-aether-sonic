package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.C2122h0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.G0;

/* loaded from: classes2.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final String f54452a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final String f54453b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";

    /* renamed from: c, reason: collision with root package name */
    private static final String f54454c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f54455d;

    static {
        Object b4;
        Object b5;
        try {
            Result.a aVar = Result.f51807F;
            b4 = Result.b(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            b4 = Result.b(kotlin.W.a(th));
        }
        if (Result.e(b4) != null) {
            b4 = f54452a;
        }
        f54454c = (String) b4;
        try {
            Result.a aVar3 = Result.f51807F;
            b5 = Result.b(Q.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.a aVar4 = Result.f51807F;
            b5 = Result.b(kotlin.W.a(th2));
        }
        if (Result.e(b5) != null) {
            b5 = f54453b;
        }
        f54455d = (String) b5;
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    @l3.d
    @G0
    public static final StackTraceElement d(@l3.d String str) {
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> e(E e4) {
        Throwable cause = e4.getCause();
        if (cause != null && kotlin.jvm.internal.F.g(cause.getClass(), e4.getClass())) {
            StackTraceElement[] stackTrace = e4.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (k(stackTraceElement)) {
                    return C2122h0.a(cause, stackTrace);
                }
            }
            return C2122h0.a(e4, new StackTraceElement[0]);
        }
        return C2122h0.a(e4, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E f(E e4, E e5, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(d("Coroutine boundary"));
        StackTraceElement[] stackTrace = e4.getStackTrace();
        int i4 = i(stackTrace, f54454c);
        int i5 = 0;
        if (i4 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e5.setStackTrace((StackTraceElement[]) array);
                return e5;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + i4];
        for (int i6 = 0; i6 < i4; i6++) {
            stackTraceElementArr[i6] = stackTrace[i6];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i5 + i4] = it.next();
            i5++;
        }
        e5.setStackTrace(stackTraceElementArr);
        return e5;
    }

    private static final ArrayDeque<StackTraceElement> g(kotlin.coroutines.jvm.internal.c cVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement I3 = cVar.I();
        if (I3 != null) {
            arrayDeque.add(I3);
        }
        while (true) {
            cVar = cVar.q();
            if (cVar == null) {
                return arrayDeque;
            }
            StackTraceElement I4 = cVar.I();
            if (I4 != null) {
                arrayDeque.add(I4);
            }
        }
    }

    private static final boolean h(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.F.g(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.F.g(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.F.g(stackTraceElement.getClassName(), stackTraceElement2.getClassName())) {
            return true;
        }
        return false;
    }

    private static final int i(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (kotlin.jvm.internal.F.g(str, stackTraceElementArr[i4].getClassName())) {
                return i4;
            }
        }
        return -1;
    }

    public static final void j(@l3.d Throwable th, @l3.d Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean k(@l3.d StackTraceElement stackTraceElement) {
        boolean s22;
        s22 = kotlin.text.z.s2(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
        return s22;
    }

    private static final void l(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                if (k(stackTraceElementArr[i4])) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        int i5 = i4 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i5 > length2) {
            return;
        }
        while (true) {
            if (h(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 != i5) {
                length2--;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E o(E e4, kotlin.coroutines.jvm.internal.c cVar) {
        Pair e5 = e(e4);
        Throwable th = (Throwable) e5.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) e5.b();
        Throwable s4 = s(th);
        if (s4 == null) {
            return e4;
        }
        ArrayDeque<StackTraceElement> g4 = g(cVar);
        if (g4.isEmpty()) {
            return e4;
        }
        if (th != e4) {
            l(stackTraceElementArr, g4);
        }
        return (E) f(th, s4, g4);
    }

    @l3.d
    public static final <E extends Throwable> E p(@l3.d E e4) {
        return e4;
    }

    @l3.d
    public static final <E extends Throwable> E q(@l3.d E e4, @l3.d kotlin.coroutines.c<?> cVar) {
        return e4;
    }

    private static final <E extends Throwable> E r(E e4) {
        int i4;
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e4.getStackTrace();
        int length = stackTrace.length;
        int i5 = i(stackTrace, f54455d);
        int i6 = i5 + 1;
        int i7 = i(stackTrace, f54454c);
        if (i7 == -1) {
            i4 = 0;
        } else {
            i4 = length - i7;
        }
        int i8 = (length - i5) - i4;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 == 0) {
                stackTraceElement = d("Coroutine boundary");
            } else {
                stackTraceElement = stackTrace[(i6 + i9) - 1];
            }
            stackTraceElementArr[i9] = stackTraceElement;
        }
        e4.setStackTrace(stackTraceElementArr);
        return e4;
    }

    private static final <E extends Throwable> E s(E e4) {
        E e5 = (E) ExceptionsConstructorKt.h(e4);
        if (e5 == null) {
            return null;
        }
        if (!(e4 instanceof kotlinx.coroutines.L) && !kotlin.jvm.internal.F.g(e5.getMessage(), e4.getMessage())) {
            return null;
        }
        return e5;
    }

    @l3.d
    public static final <E extends Throwable> E t(@l3.d E e4) {
        return e4;
    }

    @l3.d
    public static final <E extends Throwable> E u(@l3.d E e4) {
        E e5 = (E) e4.getCause();
        if (e5 != null && kotlin.jvm.internal.F.g(e5.getClass(), e4.getClass())) {
            for (StackTraceElement stackTraceElement : e4.getStackTrace()) {
                if (k(stackTraceElement)) {
                    return e5;
                }
            }
        }
        return e4;
    }

    @l3.e
    public static final Object m(@l3.d Throwable th, @l3.d kotlin.coroutines.c<?> cVar) {
        throw th;
    }

    private static final Object n(Throwable th, kotlin.coroutines.c<?> cVar) {
        throw th;
    }
}
