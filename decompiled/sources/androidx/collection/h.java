package androidx.collection;

import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: I, reason: collision with root package name */
    private static final Object f6485I = new Object();

    /* renamed from: E, reason: collision with root package name */
    private boolean f6486E;

    /* renamed from: F, reason: collision with root package name */
    private long[] f6487F;

    /* renamed from: G, reason: collision with root package name */
    private Object[] f6488G;

    /* renamed from: H, reason: collision with root package name */
    private int f6489H;

    public h() {
        this(10);
    }

    private void h() {
        int i4 = this.f6489H;
        long[] jArr = this.f6487F;
        Object[] objArr = this.f6488G;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f6485I) {
                if (i6 != i5) {
                    jArr[i5] = jArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f6486E = false;
        this.f6489H = i5;
    }

    public int A() {
        if (this.f6486E) {
            h();
        }
        return this.f6489H;
    }

    public E B(int i4) {
        if (this.f6486E) {
            h();
        }
        return (E) this.f6488G[i4];
    }

    public void a(long j4, E e4) {
        int i4 = this.f6489H;
        if (i4 != 0 && j4 <= this.f6487F[i4 - 1]) {
            p(j4, e4);
            return;
        }
        if (this.f6486E && i4 >= this.f6487F.length) {
            h();
        }
        int i5 = this.f6489H;
        if (i5 >= this.f6487F.length) {
            int f4 = g.f(i5 + 1);
            long[] jArr = new long[f4];
            Object[] objArr = new Object[f4];
            long[] jArr2 = this.f6487F;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f6488G;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f6487F = jArr;
            this.f6488G = objArr;
        }
        this.f6487F[i5] = j4;
        this.f6488G[i5] = e4;
        this.f6489H = i5 + 1;
    }

    public void b() {
        int i4 = this.f6489H;
        Object[] objArr = this.f6488G;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f6489H = 0;
        this.f6486E = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f6487F = (long[]) this.f6487F.clone();
            hVar.f6488G = (Object[]) this.f6488G.clone();
            return hVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public boolean e(long j4) {
        if (k(j4) >= 0) {
            return true;
        }
        return false;
    }

    public boolean f(E e4) {
        if (l(e4) >= 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void g(long j4) {
        s(j4);
    }

    @P
    public E i(long j4) {
        return j(j4, null);
    }

    public E j(long j4, E e4) {
        E e5;
        int b4 = g.b(this.f6487F, this.f6489H, j4);
        if (b4 >= 0 && (e5 = (E) this.f6488G[b4]) != f6485I) {
            return e5;
        }
        return e4;
    }

    public int k(long j4) {
        if (this.f6486E) {
            h();
        }
        return g.b(this.f6487F, this.f6489H, j4);
    }

    public int l(E e4) {
        if (this.f6486E) {
            h();
        }
        for (int i4 = 0; i4 < this.f6489H; i4++) {
            if (this.f6488G[i4] == e4) {
                return i4;
            }
        }
        return -1;
    }

    public boolean n() {
        if (A() == 0) {
            return true;
        }
        return false;
    }

    public long o(int i4) {
        if (this.f6486E) {
            h();
        }
        return this.f6487F[i4];
    }

    public void p(long j4, E e4) {
        int b4 = g.b(this.f6487F, this.f6489H, j4);
        if (b4 >= 0) {
            this.f6488G[b4] = e4;
            return;
        }
        int i4 = ~b4;
        int i5 = this.f6489H;
        if (i4 < i5) {
            Object[] objArr = this.f6488G;
            if (objArr[i4] == f6485I) {
                this.f6487F[i4] = j4;
                objArr[i4] = e4;
                return;
            }
        }
        if (this.f6486E && i5 >= this.f6487F.length) {
            h();
            i4 = ~g.b(this.f6487F, this.f6489H, j4);
        }
        int i6 = this.f6489H;
        if (i6 >= this.f6487F.length) {
            int f4 = g.f(i6 + 1);
            long[] jArr = new long[f4];
            Object[] objArr2 = new Object[f4];
            long[] jArr2 = this.f6487F;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f6488G;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f6487F = jArr;
            this.f6488G = objArr2;
        }
        int i7 = this.f6489H;
        if (i7 - i4 != 0) {
            long[] jArr3 = this.f6487F;
            int i8 = i4 + 1;
            System.arraycopy(jArr3, i4, jArr3, i8, i7 - i4);
            Object[] objArr4 = this.f6488G;
            System.arraycopy(objArr4, i4, objArr4, i8, this.f6489H - i4);
        }
        this.f6487F[i4] = j4;
        this.f6488G[i4] = e4;
        this.f6489H++;
    }

    public void q(@N h<? extends E> hVar) {
        int A3 = hVar.A();
        for (int i4 = 0; i4 < A3; i4++) {
            p(hVar.o(i4), hVar.B(i4));
        }
    }

    @P
    public E r(long j4, E e4) {
        E i4 = i(j4);
        if (i4 == null) {
            p(j4, e4);
        }
        return i4;
    }

    public void s(long j4) {
        int b4 = g.b(this.f6487F, this.f6489H, j4);
        if (b4 >= 0) {
            Object[] objArr = this.f6488G;
            Object obj = objArr[b4];
            Object obj2 = f6485I;
            if (obj != obj2) {
                objArr[b4] = obj2;
                this.f6486E = true;
            }
        }
    }

    public boolean t(long j4, Object obj) {
        int k4 = k(j4);
        if (k4 >= 0) {
            E B3 = B(k4);
            if (obj == B3 || (obj != null && obj.equals(B3))) {
                u(k4);
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        if (A() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6489H * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f6489H; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(o(i4));
            sb.append('=');
            E B3 = B(i4);
            if (B3 != this) {
                sb.append(B3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void u(int i4) {
        Object[] objArr = this.f6488G;
        Object obj = objArr[i4];
        Object obj2 = f6485I;
        if (obj != obj2) {
            objArr[i4] = obj2;
            this.f6486E = true;
        }
    }

    @P
    public E w(long j4, E e4) {
        int k4 = k(j4);
        if (k4 >= 0) {
            Object[] objArr = this.f6488G;
            E e5 = (E) objArr[k4];
            objArr[k4] = e4;
            return e5;
        }
        return null;
    }

    public boolean x(long j4, E e4, E e5) {
        int k4 = k(j4);
        if (k4 >= 0) {
            Object obj = this.f6488G[k4];
            if (obj == e4 || (e4 != null && e4.equals(obj))) {
                this.f6488G[k4] = e5;
                return true;
            }
            return false;
        }
        return false;
    }

    public void y(int i4, E e4) {
        if (this.f6486E) {
            h();
        }
        this.f6488G[i4] = e4;
    }

    public h(int i4) {
        this.f6486E = false;
        if (i4 == 0) {
            this.f6487F = g.f6483b;
            this.f6488G = g.f6484c;
        } else {
            int f4 = g.f(i4);
            this.f6487F = new long[f4];
            this.f6488G = new Object[f4];
        }
    }
}
