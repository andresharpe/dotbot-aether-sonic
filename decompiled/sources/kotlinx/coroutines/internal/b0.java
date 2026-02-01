package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.H0;
import kotlin.collections.C2100o;
import kotlinx.coroutines.G0;
import kotlinx.coroutines.internal.c0;

@G0
/* loaded from: classes2.dex */
public class b0<T extends c0 & Comparable<? super T>> {

    @l3.d
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private T[] f54473a;

    private final T[] j() {
        T[] tArr = this.f54473a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new c0[4];
            this.f54473a = tArr2;
            return tArr2;
        }
        if (g() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, g() * 2);
            kotlin.jvm.internal.F.o(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((c0[]) copyOf);
            this.f54473a = tArr3;
            return tArr3;
        }
        return tArr;
    }

    private final void o(int i4) {
        this._size = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void p(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.g()
            if (r1 < r2) goto Lb
            return
        Lb:
            T extends kotlinx.coroutines.internal.c0 & java.lang.Comparable<? super T>[] r2 = r5.f54473a
            kotlin.jvm.internal.F.m(r2)
            int r0 = r0 + 2
            int r3 = r5.g()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.F.m(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.F.m(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.F.m(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.F.m(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.r(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.b0.p(int):void");
    }

    private final void q(int i4) {
        while (i4 > 0) {
            T[] tArr = this.f54473a;
            kotlin.jvm.internal.F.m(tArr);
            int i5 = (i4 - 1) / 2;
            T t3 = tArr[i5];
            kotlin.jvm.internal.F.m(t3);
            T t4 = tArr[i4];
            kotlin.jvm.internal.F.m(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            r(i4, i5);
            i4 = i5;
        }
    }

    private final void r(int i4, int i5) {
        T[] tArr = this.f54473a;
        kotlin.jvm.internal.F.m(tArr);
        T t3 = tArr[i5];
        kotlin.jvm.internal.F.m(t3);
        T t4 = tArr[i4];
        kotlin.jvm.internal.F.m(t4);
        tArr[i4] = t3;
        tArr[i5] = t4;
        t3.g(i4);
        t4.g(i5);
    }

    @kotlin.U
    public final void a(@l3.d T t3) {
        t3.b(this);
        T[] j4 = j();
        int g4 = g();
        o(g4 + 1);
        j4[g4] = t3;
        t3.g(g4);
        q(g4);
    }

    public final void b(@l3.d T t3) {
        synchronized (this) {
            a(t3);
            H0 h02 = H0.f51801a;
        }
    }

    public final boolean c(@l3.d T t3, @l3.d X2.l<? super T, Boolean> lVar) {
        boolean z3;
        synchronized (this) {
            try {
                if (lVar.C(f()).booleanValue()) {
                    a(t3);
                    z3 = true;
                } else {
                    z3 = false;
                }
                kotlin.jvm.internal.C.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.C.d(1);
                kotlin.jvm.internal.C.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.C.c(1);
        return z3;
    }

    public final void d() {
        synchronized (this) {
            try {
                T[] tArr = this.f54473a;
                if (tArr != null) {
                    C2100o.V1(tArr, null, 0, 0, 6, null);
                }
                this._size = 0;
                H0 h02 = H0.f51801a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @l3.e
    public final T e(@l3.d X2.l<? super T, Boolean> lVar) {
        T t3;
        synchronized (this) {
            try {
                int g4 = g();
                int i4 = 0;
                while (true) {
                    t3 = null;
                    if (i4 >= g4) {
                        break;
                    }
                    T[] tArr = this.f54473a;
                    if (tArr != null) {
                        t3 = (Object) tArr[i4];
                    }
                    kotlin.jvm.internal.F.m(t3);
                    if (lVar.C(t3).booleanValue()) {
                        break;
                    }
                    i4++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t3;
    }

    @l3.e
    @kotlin.U
    public final T f() {
        T[] tArr = this.f54473a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int g() {
        return this._size;
    }

    public final boolean h() {
        if (g() == 0) {
            return true;
        }
        return false;
    }

    @l3.e
    public final T i() {
        T f4;
        synchronized (this) {
            f4 = f();
        }
        return f4;
    }

    public final boolean k(@l3.d T t3) {
        boolean z3;
        synchronized (this) {
            if (t3.e() == null) {
                z3 = false;
            } else {
                l(t3.k());
                z3 = true;
            }
        }
        return z3;
    }

    @l3.d
    @kotlin.U
    public final T l(int i4) {
        T[] tArr = this.f54473a;
        kotlin.jvm.internal.F.m(tArr);
        o(g() - 1);
        if (i4 < g()) {
            r(i4, g());
            int i5 = (i4 - 1) / 2;
            if (i4 > 0) {
                T t3 = tArr[i4];
                kotlin.jvm.internal.F.m(t3);
                T t4 = tArr[i5];
                kotlin.jvm.internal.F.m(t4);
                if (((Comparable) t3).compareTo(t4) < 0) {
                    r(i4, i5);
                    q(i5);
                }
            }
            p(i4);
        }
        T t5 = tArr[g()];
        kotlin.jvm.internal.F.m(t5);
        t5.b(null);
        t5.g(-1);
        tArr[g()] = null;
        return t5;
    }

    @l3.e
    public final T m(@l3.d X2.l<? super T, Boolean> lVar) {
        synchronized (this) {
            try {
                T f4 = f();
                T t3 = null;
                if (f4 == null) {
                    kotlin.jvm.internal.C.d(2);
                    kotlin.jvm.internal.C.c(2);
                    return null;
                }
                if (lVar.C(f4).booleanValue()) {
                    t3 = l(0);
                }
                kotlin.jvm.internal.C.d(1);
                kotlin.jvm.internal.C.c(1);
                return t3;
            } catch (Throwable th) {
                kotlin.jvm.internal.C.d(1);
                kotlin.jvm.internal.C.c(1);
                throw th;
            }
        }
    }

    @l3.e
    public final T n() {
        T t3;
        synchronized (this) {
            if (g() > 0) {
                t3 = l(0);
            } else {
                t3 = null;
            }
        }
        return t3;
    }
}
