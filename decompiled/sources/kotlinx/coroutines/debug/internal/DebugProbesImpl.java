package kotlinx.coroutines.debug.internal;

import X2.p;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C2122h0;
import kotlin.C2231x;
import kotlin.H0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.W;
import kotlin.collections.C2101p;
import kotlin.collections.C2109w;
import kotlin.collections.D;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.X;
import kotlin.ranges.u;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.m;
import kotlin.text.s;
import kotlin.text.z;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.S;
import kotlinx.coroutines.S0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import kotlinx.coroutines.internal.N;
import kotlinx.coroutines.internal.Q;

/* loaded from: classes2.dex */
public final class DebugProbesImpl {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final DebugProbesImpl f53371a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final String f53372b = "Coroutine creation stacktrace";

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static final SimpleDateFormat f53373c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private static Thread f53374d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static final kotlinx.coroutines.debug.internal.c<a<?>, Boolean> f53375e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private static final /* synthetic */ h f53376f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f53377g;

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private static final ReentrantReadWriteLock f53378h;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f53379i;
    private static volatile int installations;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f53380j;

    /* renamed from: k, reason: collision with root package name */
    @l3.e
    private static final X2.l<Boolean, H0> f53381k;

    /* renamed from: l, reason: collision with root package name */
    @l3.d
    private static final kotlinx.coroutines.debug.internal.c<kotlin.coroutines.jvm.internal.c, f> f53382l;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a<T> implements kotlin.coroutines.c<T>, kotlin.coroutines.jvm.internal.c {

        /* renamed from: E, reason: collision with root package name */
        @W2.f
        @l3.d
        public final kotlin.coroutines.c<T> f53383E;

        /* renamed from: F, reason: collision with root package name */
        @W2.f
        @l3.d
        public final f f53384F;

        /* renamed from: G, reason: collision with root package name */
        @l3.e
        private final kotlin.coroutines.jvm.internal.c f53385G;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@l3.d kotlin.coroutines.c<? super T> cVar, @l3.d f fVar, @l3.e kotlin.coroutines.jvm.internal.c cVar2) {
            this.f53383E = cVar;
            this.f53384F = fVar;
            this.f53385G = cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.c
        @l3.e
        public StackTraceElement I() {
            kotlin.coroutines.jvm.internal.c cVar = this.f53385G;
            if (cVar != null) {
                return cVar.I();
            }
            return null;
        }

        @Override // kotlin.coroutines.c
        @l3.d
        public kotlin.coroutines.f e() {
            return this.f53383E.e();
        }

        @Override // kotlin.coroutines.jvm.internal.c
        @l3.e
        public kotlin.coroutines.jvm.internal.c q() {
            kotlin.coroutines.jvm.internal.c cVar = this.f53385G;
            if (cVar != null) {
                return cVar.q();
            }
            return null;
        }

        @l3.d
        public String toString() {
            return this.f53383E.toString();
        }

        @Override // kotlin.coroutines.c
        public void x(@l3.d Object obj) {
            DebugProbesImpl.f53371a.E(this);
            this.f53383E.x(obj);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t3, T t4) {
            int l4;
            l4 = kotlin.comparisons.g.l(Long.valueOf(((a) t3).f53384F.f53433b), Long.valueOf(((a) t4).f53384F.f53433b));
            return l4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.l<a<?>, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f53386F = new c();

        c() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d a<?> aVar) {
            return Boolean.valueOf(!DebugProbesImpl.f53371a.y(aVar));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t3, T t4) {
            int l4;
            l4 = kotlin.comparisons.g.l(Long.valueOf(((a) t3).f53384F.f53433b), Long.valueOf(((a) t4).f53384F.f53433b));
            return l4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements X2.a<H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final e f53388F = new e();

        e() {
            super(0);
        }

        public final void c() {
            DebugProbesImpl.f53382l.o();
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.debug.internal.h] */
    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        f53371a = debugProbesImpl;
        f53373c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f53375e = new kotlinx.coroutines.debug.internal.c<>(false, 1, null);
        final long j4 = 0;
        f53376f = new Object(j4) { // from class: kotlinx.coroutines.debug.internal.h
            volatile long sequenceNumber;

            {
                this.sequenceNumber = j4;
            }
        };
        f53378h = new ReentrantReadWriteLock();
        f53379i = true;
        f53380j = true;
        f53381k = debugProbesImpl.t();
        f53382l = new kotlinx.coroutines.debug.internal.c<>(true);
        f53377g = AtomicLongFieldUpdater.newUpdater(h.class, "sequenceNumber");
    }

    private DebugProbesImpl() {
    }

    private final boolean A(StackTraceElement stackTraceElement) {
        boolean s22;
        s22 = z.s2(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
        return s22;
    }

    private final a<?> B(kotlin.coroutines.c<?> cVar) {
        kotlin.coroutines.jvm.internal.c cVar2;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            cVar2 = (kotlin.coroutines.jvm.internal.c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            return null;
        }
        return C(cVar2);
    }

    private final a<?> C(kotlin.coroutines.jvm.internal.c cVar) {
        while (!(cVar instanceof a)) {
            cVar = cVar.q();
            if (cVar == null) {
                return null;
            }
        }
        return (a) cVar;
    }

    private final void D(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(a<?> aVar) {
        kotlin.coroutines.jvm.internal.c I3;
        f53375e.remove(aVar);
        kotlin.coroutines.jvm.internal.c f4 = aVar.f53384F.f();
        if (f4 != null && (I3 = I(f4)) != null) {
            f53382l.remove(I3);
        }
    }

    private final kotlin.coroutines.jvm.internal.c I(kotlin.coroutines.jvm.internal.c cVar) {
        do {
            cVar = cVar.q();
            if (cVar == null) {
                return null;
            }
        } while (cVar.I() == null);
        return cVar;
    }

    private final <T extends Throwable> List<StackTraceElement> J(T t3) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = t3.getStackTrace();
        int length = stackTrace.length;
        int i4 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i5 = length2 - 1;
                if (F.g(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i4 = length2;
                    break;
                }
                if (i5 < 0) {
                    break;
                }
                length2 = i5;
            }
        }
        if (!f53379i) {
            int i6 = length - i4;
            ArrayList arrayList = new ArrayList(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                if (i7 == 0) {
                    stackTraceElement = Q.d(f53372b);
                } else {
                    stackTraceElement = stackTrace[i7 + i4];
                }
                arrayList.add(stackTraceElement);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i4) + 1);
        arrayList2.add(Q.d(f53372b));
        while (true) {
            i4++;
            while (i4 < length) {
                if (A(stackTrace[i4])) {
                    arrayList2.add(stackTrace[i4]);
                    int i8 = i4 + 1;
                    while (i8 < length && A(stackTrace[i8])) {
                        i8++;
                    }
                    int i9 = i8 - 1;
                    int i10 = i9;
                    while (i10 > i4 && stackTrace[i10].getFileName() == null) {
                        i10--;
                    }
                    if (i10 > i4 && i10 < i9) {
                        arrayList2.add(stackTrace[i10]);
                    }
                    arrayList2.add(stackTrace[i9]);
                    i4 = i8;
                }
            }
            return arrayList2;
            arrayList2.add(stackTrace[i4]);
        }
    }

    private final void M() {
        f53374d = kotlin.concurrent.b.c(false, true, null, "Coroutines Debugger Cleaner", 0, e.f53388F, 21, null);
    }

    private final void N() {
        Thread thread = f53374d;
        if (thread == null) {
            return;
        }
        f53374d = null;
        thread.interrupt();
        thread.join();
    }

    private final l O(List<StackTraceElement> list) {
        l lVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                lVar = new l(lVar, listIterator.previous());
            }
        }
        return lVar;
    }

    private final String P(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(kotlin.text.F.f52746b);
        sb.append(obj);
        sb.append(kotlin.text.F.f52746b);
        return sb.toString();
    }

    private final void R(kotlin.coroutines.jvm.internal.c cVar, String str) {
        kotlin.coroutines.jvm.internal.c cVar2;
        ReentrantReadWriteLock.ReadLock readLock = f53378h.readLock();
        readLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f53371a;
            if (!debugProbesImpl.z()) {
                readLock.unlock();
                return;
            }
            kotlinx.coroutines.debug.internal.c<kotlin.coroutines.jvm.internal.c, f> cVar3 = f53382l;
            f remove = cVar3.remove(cVar);
            if (remove == null) {
                a<?> C3 = debugProbesImpl.C(cVar);
                if (C3 != null && (remove = C3.f53384F) != null) {
                    kotlin.coroutines.jvm.internal.c f4 = remove.f();
                    if (f4 != null) {
                        cVar2 = debugProbesImpl.I(f4);
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        cVar3.remove(cVar2);
                    }
                }
                return;
            }
            remove.j(str, (kotlin.coroutines.c) cVar);
            kotlin.coroutines.jvm.internal.c I3 = debugProbesImpl.I(cVar);
            if (I3 == null) {
                readLock.unlock();
                return;
            }
            cVar3.put(I3, remove);
            H0 h02 = H0.f51801a;
            readLock.unlock();
        } finally {
            readLock.unlock();
        }
    }

    private final void S(kotlin.coroutines.c<?> cVar, String str) {
        kotlin.coroutines.jvm.internal.c cVar2;
        if (!z()) {
            return;
        }
        if (F.g(str, g.f53449b) && C2231x.f52899K.j(1, 3, 30)) {
            if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
                cVar2 = (kotlin.coroutines.jvm.internal.c) cVar;
            } else {
                cVar2 = null;
            }
            if (cVar2 == null) {
                return;
            }
            R(cVar2, str);
            return;
        }
        a<?> B3 = B(cVar);
        if (B3 == null) {
            return;
        }
        T(B3, cVar, str);
    }

    private final void T(a<?> aVar, kotlin.coroutines.c<?> cVar, String str) {
        ReentrantReadWriteLock.ReadLock readLock = f53378h.readLock();
        readLock.lock();
        try {
            if (!f53371a.z()) {
                return;
            }
            aVar.f53384F.j(str, cVar);
            H0 h02 = H0.f51801a;
        } finally {
            readLock.unlock();
        }
    }

    private final void d(L0 l02, Map<L0, f> map, StringBuilder sb, String str) {
        Object G22;
        f fVar = map.get(l02);
        if (fVar != null) {
            G22 = D.G2(fVar.h());
            sb.append(str + r(l02) + ", continuation is " + fVar.g() + " at line " + ((StackTraceElement) G22) + '\n');
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append('\t');
            str = sb2.toString();
        } else if (!(l02 instanceof N)) {
            sb.append(str + r(l02) + '\n');
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append('\t');
            str = sb3.toString();
        }
        Iterator<L0> it = l02.F().iterator();
        while (it.hasNext()) {
            d(it.next(), map, sb, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> kotlin.coroutines.c<T> e(kotlin.coroutines.c<? super T> cVar, l lVar) {
        if (!z()) {
            return cVar;
        }
        a<?> aVar = new a<>(cVar, new f(cVar.e(), lVar, f53377g.incrementAndGet(f53376f)), lVar);
        kotlinx.coroutines.debug.internal.c<a<?>, Boolean> cVar2 = f53375e;
        cVar2.put(aVar, Boolean.TRUE);
        if (!z()) {
            cVar2.clear();
        }
        return aVar;
    }

    private final <R> List<R> i(final p<? super a<?>, ? super kotlin.coroutines.f, ? extends R> pVar) {
        int i4;
        m A12;
        m K22;
        m p12;
        List<R> c32;
        ReentrantReadWriteLock reentrantReadWriteLock = f53378h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i4 = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i4 = 0;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f53371a;
            if (debugProbesImpl.z()) {
                A12 = D.A1(debugProbesImpl.q());
                K22 = SequencesKt___SequencesKt.K2(A12, new b());
                p12 = SequencesKt___SequencesKt.p1(K22, new X2.l<a<?>, R>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // X2.l
                    @l3.e
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final R C(@l3.d DebugProbesImpl.a<?> aVar) {
                        kotlin.coroutines.f c4;
                        if (DebugProbesImpl.f53371a.y(aVar) || (c4 = aVar.f53384F.c()) == null) {
                            return null;
                        }
                        return pVar.c0(aVar, c4);
                    }
                });
                c32 = SequencesKt___SequencesKt.c3(p12);
                return c32;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            C.d(1);
            while (i5 < i4) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
            C.c(1);
        }
    }

    private final void j(PrintStream printStream) {
        int i4;
        m A12;
        m p02;
        m<a> K22;
        String g4;
        ReentrantReadWriteLock reentrantReadWriteLock = f53378h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i4 = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i4 = 0;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f53371a;
            if (debugProbesImpl.z()) {
                printStream.print("Coroutines dump " + f53373c.format(Long.valueOf(System.currentTimeMillis())));
                A12 = D.A1(debugProbesImpl.q());
                p02 = SequencesKt___SequencesKt.p0(A12, c.f53386F);
                K22 = SequencesKt___SequencesKt.K2(p02, new d());
                for (a aVar : K22) {
                    f fVar = aVar.f53384F;
                    List<StackTraceElement> h4 = fVar.h();
                    DebugProbesImpl debugProbesImpl2 = f53371a;
                    List<StackTraceElement> n4 = debugProbesImpl2.n(fVar.g(), fVar.f53436e, h4);
                    if (F.g(fVar.g(), g.f53449b) && n4 == h4) {
                        g4 = fVar.g() + " (Last suspension stacktrace, not an actual stacktrace)";
                    } else {
                        g4 = fVar.g();
                    }
                    printStream.print("\n\nCoroutine " + aVar.f53383E + ", state: " + g4);
                    if (h4.isEmpty()) {
                        printStream.print("\n\tat " + Q.d(f53372b));
                        debugProbesImpl2.D(printStream, fVar.e());
                    } else {
                        debugProbesImpl2.D(printStream, n4);
                    }
                }
                H0 h02 = H0.f51801a;
                while (i5 < i4) {
                    readLock.lock();
                    i5++;
                }
                writeLock.unlock();
                return;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } catch (Throwable th) {
            while (i5 < i4) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    private final List<StackTraceElement> n(String str, Thread thread, List<StackTraceElement> list) {
        Object b4;
        if (F.g(str, g.f53449b) && thread != null) {
            try {
                Result.a aVar = Result.f51807F;
                b4 = Result.b(thread.getStackTrace());
            } catch (Throwable th) {
                Result.a aVar2 = Result.f51807F;
                b4 = Result.b(W.a(th));
            }
            if (Result.i(b4)) {
                b4 = null;
            }
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) b4;
            if (stackTraceElementArr == null) {
                return list;
            }
            int length = stackTraceElementArr.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[i4];
                    if (F.g(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && F.g(stackTraceElement.getMethodName(), "resumeWith") && F.g(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            Pair<Integer, Integer> o4 = o(i4, stackTraceElementArr, list);
            int intValue = o4.a().intValue();
            int intValue2 = o4.b().intValue();
            if (intValue == -1) {
                return list;
            }
            ArrayList arrayList = new ArrayList((((list.size() + i4) - intValue) - 1) - intValue2);
            int i5 = i4 - intValue2;
            for (int i6 = 0; i6 < i5; i6++) {
                arrayList.add(stackTraceElementArr[i6]);
            }
            int size = list.size();
            for (int i7 = intValue + 1; i7 < size; i7++) {
                arrayList.add(list.get(i7));
            }
            return arrayList;
        }
        return list;
    }

    private final Pair<Integer, Integer> o(int i4, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i5 = 0; i5 < 3; i5++) {
            int p4 = f53371a.p((i4 - 1) - i5, stackTraceElementArr, list);
            if (p4 != -1) {
                return C2122h0.a(Integer.valueOf(p4), Integer.valueOf(i5));
            }
        }
        return C2122h0.a(-1, 0);
    }

    private final int p(int i4, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        Object Pe;
        Pe = C2101p.Pe(stackTraceElementArr, i4);
        StackTraceElement stackTraceElement = (StackTraceElement) Pe;
        if (stackTraceElement == null) {
            return -1;
        }
        int i5 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (F.g(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && F.g(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && F.g(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    private final Set<a<?>> q() {
        return f53375e.keySet();
    }

    private final String r(L0 l02) {
        if (l02 instanceof S0) {
            return ((S0) l02).y1();
        }
        return l02.toString();
    }

    private static /* synthetic */ void s(L0 l02) {
    }

    private final X2.l<Boolean, H0> t() {
        Object b4;
        Object newInstance;
        try {
            Result.a aVar = Result.f51807F;
            newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            b4 = Result.b(W.a(th));
        }
        if (newInstance != null) {
            b4 = Result.b((X2.l) X.q(newInstance, 1));
            if (Result.i(b4)) {
                b4 = null;
            }
            return (X2.l) b4;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y(a<?> aVar) {
        L0 l02;
        kotlin.coroutines.f c4 = aVar.f53384F.c();
        if (c4 == null || (l02 = (L0) c4.a(L0.f52941w)) == null || !l02.m()) {
            return false;
        }
        f53375e.remove(aVar);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public final <T> kotlin.coroutines.c<T> F(@l3.d kotlin.coroutines.c<? super T> cVar) {
        l lVar;
        if (!z()) {
            return cVar;
        }
        if (B(cVar) != null) {
            return cVar;
        }
        if (f53380j) {
            lVar = O(J(new Exception()));
        } else {
            lVar = null;
        }
        return e(cVar, lVar);
    }

    public final void G(@l3.d kotlin.coroutines.c<?> cVar) {
        S(cVar, g.f53449b);
    }

    public final void H(@l3.d kotlin.coroutines.c<?> cVar) {
        S(cVar, g.f53450c);
    }

    public final void K(boolean z3) {
        f53380j = z3;
    }

    public final void L(boolean z3) {
        f53379i = z3;
    }

    public final void Q() {
        int i4;
        ReentrantReadWriteLock reentrantReadWriteLock = f53378h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i4 = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i4 = 0;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f53371a;
            if (debugProbesImpl.z()) {
                installations--;
                if (installations != 0) {
                    while (i5 < i4) {
                        readLock.lock();
                        i5++;
                    }
                    writeLock.unlock();
                    return;
                }
                debugProbesImpl.N();
                f53375e.clear();
                f53382l.clear();
                if (kotlinx.coroutines.debug.internal.a.f53397a.a()) {
                    while (i5 < i4) {
                        readLock.lock();
                        i5++;
                    }
                    writeLock.unlock();
                    return;
                }
                X2.l<Boolean, H0> lVar = f53381k;
                if (lVar != null) {
                    lVar.C(Boolean.FALSE);
                }
                H0 h02 = H0.f51801a;
                while (i5 < i4) {
                    readLock.lock();
                    i5++;
                }
                writeLock.unlock();
                return;
            }
            throw new IllegalStateException("Agent was not installed".toString());
        } catch (Throwable th) {
            while (i5 < i4) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void f(@l3.d PrintStream printStream) {
        synchronized (printStream) {
            f53371a.j(printStream);
            H0 h02 = H0.f51801a;
        }
    }

    @l3.d
    public final List<kotlinx.coroutines.debug.internal.e> g() {
        int i4;
        m A12;
        m K22;
        m p12;
        List<kotlinx.coroutines.debug.internal.e> c32;
        ReentrantReadWriteLock reentrantReadWriteLock = f53378h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i4 = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i4 = 0;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f53371a;
            if (debugProbesImpl.z()) {
                A12 = D.A1(debugProbesImpl.q());
                K22 = SequencesKt___SequencesKt.K2(A12, new b());
                p12 = SequencesKt___SequencesKt.p1(K22, new X2.l<a<?>, kotlinx.coroutines.debug.internal.e>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
                    @Override // X2.l
                    @l3.e
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final e C(@l3.d DebugProbesImpl.a<?> aVar) {
                        kotlin.coroutines.f c4;
                        if (DebugProbesImpl.f53371a.y(aVar) || (c4 = aVar.f53384F.c()) == null) {
                            return null;
                        }
                        return new e(aVar.f53384F, c4);
                    }
                });
                c32 = SequencesKt___SequencesKt.c3(p12);
                return c32;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i5 < i4) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
        }
    }

    @l3.d
    public final Object[] h() {
        String m32;
        String str;
        String str2;
        String p4;
        String k12;
        List<kotlinx.coroutines.debug.internal.e> g4 = g();
        int size = g4.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (kotlinx.coroutines.debug.internal.e eVar : g4) {
            kotlin.coroutines.f a4 = eVar.a();
            T t3 = (T) a4.a(T.f52972G);
            Long l4 = null;
            if (t3 != null && (k12 = t3.k1()) != null) {
                str = P(k12);
            } else {
                str = null;
            }
            kotlinx.coroutines.N n4 = (kotlinx.coroutines.N) a4.a(kotlinx.coroutines.N.f52948F);
            if (n4 != null) {
                str2 = P(n4);
            } else {
                str2 = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"name\": ");
            sb.append(str);
            sb.append(",\n                    \"id\": ");
            S s4 = (S) a4.a(S.f52956G);
            if (s4 != null) {
                l4 = Long.valueOf(s4.k1());
            }
            sb.append(l4);
            sb.append(",\n                    \"dispatcher\": ");
            sb.append(str2);
            sb.append(",\n                    \"sequenceNumber\": ");
            sb.append(eVar.f());
            sb.append(",\n                    \"state\": \"");
            sb.append(eVar.g());
            sb.append("\"\n                } \n                ");
            p4 = s.p(sb.toString());
            arrayList3.add(p4);
            arrayList2.add(eVar.d());
            arrayList.add(eVar.e());
        }
        Object[] objArr = new Object[4];
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        m32 = D.m3(arrayList3, null, null, null, 0, null, null, 63, null);
        sb2.append(m32);
        sb2.append(']');
        objArr[0] = sb2.toString();
        Object[] array = arrayList.toArray(new Thread[0]);
        if (array != null) {
            objArr[1] = array;
            Object[] array2 = arrayList2.toArray(new kotlin.coroutines.jvm.internal.c[0]);
            if (array2 != null) {
                objArr[2] = array2;
                Object[] array3 = g4.toArray(new kotlinx.coroutines.debug.internal.e[0]);
                if (array3 != null) {
                    objArr[3] = array3;
                    return objArr;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @l3.d
    public final List<DebuggerInfo> k() {
        int i4;
        m A12;
        m K22;
        m p12;
        List<DebuggerInfo> c32;
        ReentrantReadWriteLock reentrantReadWriteLock = f53378h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i4 = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i4 = 0;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f53371a;
            if (debugProbesImpl.z()) {
                A12 = D.A1(debugProbesImpl.q());
                K22 = SequencesKt___SequencesKt.K2(A12, new b());
                p12 = SequencesKt___SequencesKt.p1(K22, new X2.l<a<?>, DebuggerInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
                    @Override // X2.l
                    @l3.e
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final DebuggerInfo C(@l3.d DebugProbesImpl.a<?> aVar) {
                        kotlin.coroutines.f c4;
                        if (DebugProbesImpl.f53371a.y(aVar) || (c4 = aVar.f53384F.c()) == null) {
                            return null;
                        }
                        return new DebuggerInfo(aVar.f53384F, c4);
                    }
                });
                c32 = SequencesKt___SequencesKt.c3(p12);
                return c32;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i5 < i4) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
        }
    }

    @l3.d
    public final List<StackTraceElement> l(@l3.d kotlinx.coroutines.debug.internal.e eVar, @l3.d List<StackTraceElement> list) {
        return n(eVar.g(), eVar.e(), list);
    }

    @l3.d
    public final String m(@l3.d kotlinx.coroutines.debug.internal.e eVar) {
        String m32;
        String str;
        String p4;
        List<StackTraceElement> l4 = l(eVar, eVar.h());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : l4) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"declaringClass\": \"");
            sb.append(stackTraceElement.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append(stackTraceElement.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            if (fileName != null) {
                str = P(fileName);
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("\n                }\n                ");
            p4 = s.p(sb.toString());
            arrayList.add(p4);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        m32 = D.m3(arrayList, null, null, null, 0, null, null, 63, null);
        sb2.append(m32);
        sb2.append(']');
        return sb2.toString();
    }

    public final boolean u() {
        return f53380j;
    }

    public final boolean v() {
        return f53379i;
    }

    @l3.d
    public final String w(@l3.d L0 l02) {
        int i4;
        int b02;
        int j4;
        int u3;
        ReentrantReadWriteLock reentrantReadWriteLock = f53378h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i4 = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i4 = 0;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f53371a;
            if (debugProbesImpl.z()) {
                Set<a<?>> q4 = debugProbesImpl.q();
                ArrayList arrayList = new ArrayList();
                for (Object obj : q4) {
                    if (((a) obj).f53383E.e().a(L0.f52941w) != null) {
                        arrayList.add(obj);
                    }
                }
                b02 = C2109w.b0(arrayList, 10);
                j4 = kotlin.collections.X.j(b02);
                u3 = u.u(j4, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(O0.B(((a) obj2).f53383E.e()), ((a) obj2).f53384F);
                }
                StringBuilder sb = new StringBuilder();
                f53371a.d(l02, linkedHashMap, sb, "");
                String sb2 = sb.toString();
                F.o(sb2, "StringBuilder().apply(builderAction).toString()");
                while (i5 < i4) {
                    readLock.lock();
                    i5++;
                }
                writeLock.unlock();
                return sb2;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } catch (Throwable th) {
            while (i5 < i4) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void x() {
        int i4;
        ReentrantReadWriteLock reentrantReadWriteLock = f53378h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i4 = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i4 = 0;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            installations++;
            if (installations > 1) {
                while (i5 < i4) {
                    readLock.lock();
                    i5++;
                }
                writeLock.unlock();
                return;
            }
            f53371a.M();
            if (kotlinx.coroutines.debug.internal.a.f53397a.a()) {
                while (i5 < i4) {
                    readLock.lock();
                    i5++;
                }
                writeLock.unlock();
                return;
            }
            X2.l<Boolean, H0> lVar = f53381k;
            if (lVar != null) {
                lVar.C(Boolean.TRUE);
            }
            H0 h02 = H0.f51801a;
            while (i5 < i4) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i5 < i4) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final boolean z() {
        if (installations > 0) {
            return true;
        }
        return false;
    }
}
