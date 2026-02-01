package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.H0;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2338t;
import kotlinx.coroutines.InterfaceC2328n0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.S;

/* loaded from: classes2.dex */
public class y<T> extends kotlinx.coroutines.flow.internal.a<A> implements s<T>, InterfaceC2276c<T>, kotlinx.coroutines.flow.internal.p<T> {

    /* renamed from: I, reason: collision with root package name */
    private final int f54369I;

    /* renamed from: J, reason: collision with root package name */
    private final int f54370J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final BufferOverflow f54371K;

    /* renamed from: L, reason: collision with root package name */
    @l3.e
    private Object[] f54372L;

    /* renamed from: M, reason: collision with root package name */
    private long f54373M;

    /* renamed from: N, reason: collision with root package name */
    private long f54374N;

    /* renamed from: O, reason: collision with root package name */
    private int f54375O;

    /* renamed from: P, reason: collision with root package name */
    private int f54376P;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC2328n0 {

        /* renamed from: E, reason: collision with root package name */
        @W2.f
        @l3.d
        public final y<?> f54377E;

        /* renamed from: F, reason: collision with root package name */
        @W2.f
        public long f54378F;

        /* renamed from: G, reason: collision with root package name */
        @W2.f
        @l3.e
        public final Object f54379G;

        /* renamed from: H, reason: collision with root package name */
        @W2.f
        @l3.d
        public final kotlin.coroutines.c<H0> f54380H;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@l3.d y<?> yVar, long j4, @l3.e Object obj, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            this.f54377E = yVar;
            this.f54378F = j4;
            this.f54379G = obj;
            this.f54380H = cVar;
        }

        @Override // kotlinx.coroutines.InterfaceC2328n0
        public void f() {
            this.f54377E.F(this);
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54381a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            f54381a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {373, 380, 383}, m = "collect$suspendImpl", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes2.dex */
    public static final class c extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f54382H;

        /* renamed from: I, reason: collision with root package name */
        Object f54383I;

        /* renamed from: J, reason: collision with root package name */
        Object f54384J;

        /* renamed from: K, reason: collision with root package name */
        Object f54385K;

        /* renamed from: L, reason: collision with root package name */
        /* synthetic */ Object f54386L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ y<T> f54387M;

        /* renamed from: N, reason: collision with root package name */
        int f54388N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y<T> yVar, kotlin.coroutines.c<? super c> cVar) {
            super(cVar);
            this.f54387M = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f54386L = obj;
            this.f54388N |= Integer.MIN_VALUE;
            return y.H(this.f54387M, null, this);
        }
    }

    public y(int i4, int i5, @l3.d BufferOverflow bufferOverflow) {
        this.f54369I = i4;
        this.f54370J = i5;
        this.f54371K = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(A a4, kotlin.coroutines.c<? super H0> cVar) {
        kotlin.coroutines.c e4;
        H0 h02;
        Object l4;
        Object l5;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(e4, 1);
        rVar.T();
        synchronized (this) {
            try {
                if (b0(a4) < 0) {
                    a4.f53474b = rVar;
                } else {
                    Result.a aVar = Result.f51807F;
                    rVar.x(Result.b(H0.f51801a));
                }
                h02 = H0.f51801a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object z3 = rVar.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        l5 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l5) {
            return z3;
        }
        return h02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(a aVar) {
        synchronized (this) {
            if (aVar.f54378F < R()) {
                return;
            }
            Object[] objArr = this.f54372L;
            kotlin.jvm.internal.F.m(objArr);
            if (z.c(objArr, aVar.f54378F) != aVar) {
                return;
            }
            z.d(objArr, aVar.f54378F, z.f54389a);
            G();
            H0 h02 = H0.f51801a;
        }
    }

    private final void G() {
        if (this.f54370J == 0 && this.f54376P <= 1) {
            return;
        }
        Object[] objArr = this.f54372L;
        kotlin.jvm.internal.F.m(objArr);
        while (this.f54376P > 0 && z.c(objArr, (R() + X()) - 1) == z.f54389a) {
            this.f54376P--;
            z.d(objArr, R() + X(), null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object H(kotlinx.coroutines.flow.y r8, kotlinx.coroutines.flow.InterfaceC2283j r9, kotlin.coroutines.c r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.H(kotlinx.coroutines.flow.y, kotlinx.coroutines.flow.j, kotlin.coroutines.c):java.lang.Object");
    }

    private final void I(long j4) {
        kotlinx.coroutines.flow.internal.c[] e4;
        if (kotlinx.coroutines.flow.internal.a.d(this) != 0 && (e4 = kotlinx.coroutines.flow.internal.a.e(this)) != null) {
            for (kotlinx.coroutines.flow.internal.c cVar : e4) {
                if (cVar != null) {
                    A a4 = (A) cVar;
                    long j5 = a4.f53473a;
                    if (j5 >= 0 && j5 < j4) {
                        a4.f53473a = j4;
                    }
                }
            }
        }
        this.f54374N = j4;
    }

    private final void L() {
        Object[] objArr = this.f54372L;
        kotlin.jvm.internal.F.m(objArr);
        z.d(objArr, R(), null);
        this.f54375O--;
        long R3 = R() + 1;
        if (this.f54373M < R3) {
            this.f54373M = R3;
        }
        if (this.f54374N < R3) {
            I(R3);
        }
    }

    static /* synthetic */ Object M(y yVar, Object obj, kotlin.coroutines.c cVar) {
        Object l4;
        if (yVar.j(obj)) {
            return H0.f51801a;
        }
        Object N3 = yVar.N(obj, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (N3 == l4) {
            return N3;
        }
        return H0.f51801a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N(T t3, kotlin.coroutines.c<? super H0> cVar) {
        kotlin.coroutines.c e4;
        kotlin.coroutines.c<H0>[] cVarArr;
        a aVar;
        Object l4;
        Object l5;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(e4, 1);
        rVar.T();
        kotlin.coroutines.c<H0>[] cVarArr2 = kotlinx.coroutines.flow.internal.b.f54131a;
        synchronized (this) {
            try {
                if (Z(t3)) {
                    Result.a aVar2 = Result.f51807F;
                    rVar.x(Result.b(H0.f51801a));
                    cVarArr = P(cVarArr2);
                    aVar = null;
                } else {
                    a aVar3 = new a(this, X() + R(), t3, rVar);
                    O(aVar3);
                    this.f54376P++;
                    if (this.f54370J == 0) {
                        cVarArr2 = P(cVarArr2);
                    }
                    cVarArr = cVarArr2;
                    aVar = aVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            C2338t.a(rVar, aVar);
        }
        for (kotlin.coroutines.c<H0> cVar2 : cVarArr) {
            if (cVar2 != null) {
                Result.a aVar4 = Result.f51807F;
                cVar2.x(Result.b(H0.f51801a));
            }
        }
        Object z3 = rVar.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        l5 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l5) {
            return z3;
        }
        return H0.f51801a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(Object obj) {
        int X3 = X();
        Object[] objArr = this.f54372L;
        if (objArr == null) {
            objArr = Y(null, 0, 2);
        } else if (X3 >= objArr.length) {
            objArr = Y(objArr, X3, objArr.length * 2);
        }
        z.d(objArr, R() + X3, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final kotlin.coroutines.c<H0>[] P(kotlin.coroutines.c<H0>[] cVarArr) {
        kotlinx.coroutines.flow.internal.c[] e4;
        A a4;
        kotlin.coroutines.c<? super H0> cVar;
        int length = cVarArr.length;
        if (kotlinx.coroutines.flow.internal.a.d(this) != 0 && (e4 = kotlinx.coroutines.flow.internal.a.e(this)) != null) {
            int length2 = e4.length;
            int i4 = 0;
            cVarArr = cVarArr;
            while (i4 < length2) {
                kotlinx.coroutines.flow.internal.c cVar2 = e4[i4];
                if (cVar2 != null && (cVar = (a4 = (A) cVar2).f53474b) != null && b0(a4) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        kotlin.jvm.internal.F.o(copyOf, "copyOf(this, newSize)");
                        cVarArr = copyOf;
                    }
                    cVarArr[length] = cVar;
                    a4.f53474b = null;
                    length++;
                }
                i4++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    private final long Q() {
        return R() + this.f54375O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long R() {
        return Math.min(this.f54374N, this.f54373M);
    }

    protected static /* synthetic */ void T() {
    }

    private final Object U(long j4) {
        Object[] objArr = this.f54372L;
        kotlin.jvm.internal.F.m(objArr);
        Object c4 = z.c(objArr, j4);
        if (c4 instanceof a) {
            return ((a) c4).f54379G;
        }
        return c4;
    }

    private final long V() {
        return R() + this.f54375O + this.f54376P;
    }

    private final int W() {
        return (int) ((R() + this.f54375O) - this.f54373M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int X() {
        return this.f54375O + this.f54376P;
    }

    private final Object[] Y(Object[] objArr, int i4, int i5) {
        if (i5 > 0) {
            Object[] objArr2 = new Object[i5];
            this.f54372L = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long R3 = R();
            for (int i6 = 0; i6 < i4; i6++) {
                long j4 = i6 + R3;
                z.d(objArr2, j4, z.c(objArr, j4));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Z(T t3) {
        if (p() == 0) {
            return a0(t3);
        }
        if (this.f54375O >= this.f54370J && this.f54374N <= this.f54373M) {
            int i4 = b.f54381a[this.f54371K.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        O(t3);
        int i5 = this.f54375O + 1;
        this.f54375O = i5;
        if (i5 > this.f54370J) {
            L();
        }
        if (W() > this.f54369I) {
            d0(this.f54373M + 1, this.f54374N, Q(), V());
        }
        return true;
    }

    private final boolean a0(T t3) {
        if (this.f54369I == 0) {
            return true;
        }
        O(t3);
        int i4 = this.f54375O + 1;
        this.f54375O = i4;
        if (i4 > this.f54369I) {
            L();
        }
        this.f54374N = R() + this.f54375O;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long b0(A a4) {
        long j4 = a4.f53473a;
        if (j4 < Q()) {
            return j4;
        }
        if (this.f54370J > 0 || j4 > R() || this.f54376P == 0) {
            return -1L;
        }
        return j4;
    }

    private final Object c0(A a4) {
        Object obj;
        kotlin.coroutines.c<H0>[] cVarArr = kotlinx.coroutines.flow.internal.b.f54131a;
        synchronized (this) {
            try {
                long b02 = b0(a4);
                if (b02 < 0) {
                    obj = z.f54389a;
                } else {
                    long j4 = a4.f53473a;
                    Object U3 = U(b02);
                    a4.f53473a = b02 + 1;
                    cVarArr = e0(j4);
                    obj = U3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kotlin.coroutines.c<H0> cVar : cVarArr) {
            if (cVar != null) {
                Result.a aVar = Result.f51807F;
                cVar.x(Result.b(H0.f51801a));
            }
        }
        return obj;
    }

    private final void d0(long j4, long j5, long j6, long j7) {
        long min = Math.min(j5, j4);
        for (long R3 = R(); R3 < min; R3++) {
            Object[] objArr = this.f54372L;
            kotlin.jvm.internal.F.m(objArr);
            z.d(objArr, R3, null);
        }
        this.f54373M = j4;
        this.f54374N = j5;
        this.f54375O = (int) (j6 - min);
        this.f54376P = (int) (j7 - j6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @l3.d
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public A l() {
        return new A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @l3.d
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public A[] m(int i4) {
        return new A[i4];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T S() {
        Object[] objArr = this.f54372L;
        kotlin.jvm.internal.F.m(objArr);
        return (T) z.c(objArr, (this.f54373M + W()) - 1);
    }

    @Override // kotlinx.coroutines.flow.x, kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    public Object a(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<?> cVar) {
        return H(this, interfaceC2283j, cVar);
    }

    @Override // kotlinx.coroutines.flow.x
    @l3.d
    public List<T> b() {
        List<T> H3;
        synchronized (this) {
            int W3 = W();
            if (W3 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            ArrayList arrayList = new ArrayList(W3);
            Object[] objArr = this.f54372L;
            kotlin.jvm.internal.F.m(objArr);
            for (int i4 = 0; i4 < W3; i4++) {
                arrayList.add(z.c(objArr, this.f54373M + i4));
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @l3.d
    public InterfaceC2282i<T> c(@l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        return z.e(this, fVar, i4, bufferOverflow);
    }

    @l3.d
    public final kotlin.coroutines.c<H0>[] e0(long j4) {
        int i4;
        long j5;
        long j6;
        long j7;
        boolean z3;
        long j8;
        kotlinx.coroutines.flow.internal.c[] e4;
        if (j4 > this.f54374N) {
            return kotlinx.coroutines.flow.internal.b.f54131a;
        }
        long R3 = R();
        long j9 = this.f54375O + R3;
        if (this.f54370J == 0 && this.f54376P > 0) {
            j9++;
        }
        if (kotlinx.coroutines.flow.internal.a.d(this) != 0 && (e4 = kotlinx.coroutines.flow.internal.a.e(this)) != null) {
            for (kotlinx.coroutines.flow.internal.c cVar : e4) {
                if (cVar != null) {
                    long j10 = ((A) cVar).f53473a;
                    if (j10 >= 0 && j10 < j9) {
                        j9 = j10;
                    }
                }
            }
        }
        if (j9 <= this.f54374N) {
            return kotlinx.coroutines.flow.internal.b.f54131a;
        }
        long Q3 = Q();
        if (p() > 0) {
            i4 = Math.min(this.f54376P, this.f54370J - ((int) (Q3 - j9)));
        } else {
            i4 = this.f54376P;
        }
        kotlin.coroutines.c<H0>[] cVarArr = kotlinx.coroutines.flow.internal.b.f54131a;
        long j11 = this.f54376P + Q3;
        if (i4 > 0) {
            cVarArr = new kotlin.coroutines.c[i4];
            Object[] objArr = this.f54372L;
            kotlin.jvm.internal.F.m(objArr);
            long j12 = Q3;
            int i5 = 0;
            while (true) {
                if (Q3 < j11) {
                    Object c4 = z.c(objArr, Q3);
                    j5 = j9;
                    S s4 = z.f54389a;
                    if (c4 != s4) {
                        if (c4 != null) {
                            a aVar = (a) c4;
                            int i6 = i5 + 1;
                            j6 = j11;
                            cVarArr[i5] = aVar.f54380H;
                            z.d(objArr, Q3, s4);
                            z.d(objArr, j12, aVar.f54379G);
                            j8 = 1;
                            j12++;
                            if (i6 >= i4) {
                                break;
                            }
                            i5 = i6;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        }
                    } else {
                        j6 = j11;
                        j8 = 1;
                    }
                    Q3 += j8;
                    j9 = j5;
                    j11 = j6;
                } else {
                    j5 = j9;
                    j6 = j11;
                    break;
                }
            }
            Q3 = j12;
        } else {
            j5 = j9;
            j6 = j11;
        }
        int i7 = (int) (Q3 - R3);
        if (p() == 0) {
            j7 = Q3;
        } else {
            j7 = j5;
        }
        long max = Math.max(this.f54373M, Q3 - Math.min(this.f54369I, i7));
        if (this.f54370J == 0 && max < j6) {
            Object[] objArr2 = this.f54372L;
            kotlin.jvm.internal.F.m(objArr2);
            if (kotlin.jvm.internal.F.g(z.c(objArr2, max), z.f54389a)) {
                Q3++;
                max++;
            }
        }
        d0(max, j7, Q3, j6);
        G();
        if (cVarArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return P(cVarArr);
        }
        return cVarArr;
    }

    @Override // kotlinx.coroutines.flow.s, kotlinx.coroutines.flow.InterfaceC2283j
    @l3.e
    public Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return M(this, t3, cVar);
    }

    public final long f0() {
        long j4 = this.f54373M;
        if (j4 < this.f54374N) {
            this.f54374N = j4;
        }
        return j4;
    }

    @Override // kotlinx.coroutines.flow.s
    public void i() {
        synchronized (this) {
            d0(Q(), this.f54374N, Q(), V());
            H0 h02 = H0.f51801a;
        }
    }

    @Override // kotlinx.coroutines.flow.s
    public boolean j(T t3) {
        int i4;
        boolean z3;
        kotlin.coroutines.c<H0>[] cVarArr = kotlinx.coroutines.flow.internal.b.f54131a;
        synchronized (this) {
            if (Z(t3)) {
                cVarArr = P(cVarArr);
                z3 = true;
            } else {
                z3 = false;
            }
        }
        for (kotlin.coroutines.c<H0> cVar : cVarArr) {
            if (cVar != null) {
                Result.a aVar = Result.f51807F;
                cVar.x(Result.b(H0.f51801a));
            }
        }
        return z3;
    }
}
