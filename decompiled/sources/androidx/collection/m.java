package androidx.collection;

import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes.dex */
public class m<E> implements Cloneable {

    /* renamed from: I, reason: collision with root package name */
    private static final Object f6529I = new Object();

    /* renamed from: E, reason: collision with root package name */
    private boolean f6530E;

    /* renamed from: F, reason: collision with root package name */
    private int[] f6531F;

    /* renamed from: G, reason: collision with root package name */
    private Object[] f6532G;

    /* renamed from: H, reason: collision with root package name */
    private int f6533H;

    public m() {
        this(10);
    }

    private void h() {
        int i4 = this.f6533H;
        int[] iArr = this.f6531F;
        Object[] objArr = this.f6532G;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f6529I) {
                if (i6 != i5) {
                    iArr[i5] = iArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f6530E = false;
        this.f6533H = i5;
    }

    public void A(int i4, E e4) {
        if (this.f6530E) {
            h();
        }
        this.f6532G[i4] = e4;
    }

    public int B() {
        if (this.f6530E) {
            h();
        }
        return this.f6533H;
    }

    public E C(int i4) {
        if (this.f6530E) {
            h();
        }
        return (E) this.f6532G[i4];
    }

    public void a(int i4, E e4) {
        int i5 = this.f6533H;
        if (i5 != 0 && i4 <= this.f6531F[i5 - 1]) {
            p(i4, e4);
            return;
        }
        if (this.f6530E && i5 >= this.f6531F.length) {
            h();
        }
        int i6 = this.f6533H;
        if (i6 >= this.f6531F.length) {
            int e5 = g.e(i6 + 1);
            int[] iArr = new int[e5];
            Object[] objArr = new Object[e5];
            int[] iArr2 = this.f6531F;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f6532G;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f6531F = iArr;
            this.f6532G = objArr;
        }
        this.f6531F[i6] = i4;
        this.f6532G[i6] = e4;
        this.f6533H = i6 + 1;
    }

    public void b() {
        int i4 = this.f6533H;
        Object[] objArr = this.f6532G;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f6533H = 0;
        this.f6530E = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public m<E> clone() {
        try {
            m<E> mVar = (m) super.clone();
            mVar.f6531F = (int[]) this.f6531F.clone();
            mVar.f6532G = (Object[]) this.f6532G.clone();
            return mVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public boolean e(int i4) {
        if (k(i4) >= 0) {
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
    public void g(int i4) {
        s(i4);
    }

    @P
    public E i(int i4) {
        return j(i4, null);
    }

    public E j(int i4, E e4) {
        E e5;
        int a4 = g.a(this.f6531F, this.f6533H, i4);
        if (a4 >= 0 && (e5 = (E) this.f6532G[a4]) != f6529I) {
            return e5;
        }
        return e4;
    }

    public int k(int i4) {
        if (this.f6530E) {
            h();
        }
        return g.a(this.f6531F, this.f6533H, i4);
    }

    public int l(E e4) {
        if (this.f6530E) {
            h();
        }
        for (int i4 = 0; i4 < this.f6533H; i4++) {
            if (this.f6532G[i4] == e4) {
                return i4;
            }
        }
        return -1;
    }

    public boolean n() {
        if (B() == 0) {
            return true;
        }
        return false;
    }

    public int o(int i4) {
        if (this.f6530E) {
            h();
        }
        return this.f6531F[i4];
    }

    public void p(int i4, E e4) {
        int a4 = g.a(this.f6531F, this.f6533H, i4);
        if (a4 >= 0) {
            this.f6532G[a4] = e4;
            return;
        }
        int i5 = ~a4;
        int i6 = this.f6533H;
        if (i5 < i6) {
            Object[] objArr = this.f6532G;
            if (objArr[i5] == f6529I) {
                this.f6531F[i5] = i4;
                objArr[i5] = e4;
                return;
            }
        }
        if (this.f6530E && i6 >= this.f6531F.length) {
            h();
            i5 = ~g.a(this.f6531F, this.f6533H, i4);
        }
        int i7 = this.f6533H;
        if (i7 >= this.f6531F.length) {
            int e5 = g.e(i7 + 1);
            int[] iArr = new int[e5];
            Object[] objArr2 = new Object[e5];
            int[] iArr2 = this.f6531F;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f6532G;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f6531F = iArr;
            this.f6532G = objArr2;
        }
        int i8 = this.f6533H;
        if (i8 - i5 != 0) {
            int[] iArr3 = this.f6531F;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8 - i5);
            Object[] objArr4 = this.f6532G;
            System.arraycopy(objArr4, i5, objArr4, i9, this.f6533H - i5);
        }
        this.f6531F[i5] = i4;
        this.f6532G[i5] = e4;
        this.f6533H++;
    }

    public void q(@N m<? extends E> mVar) {
        int B3 = mVar.B();
        for (int i4 = 0; i4 < B3; i4++) {
            p(mVar.o(i4), mVar.C(i4));
        }
    }

    @P
    public E r(int i4, E e4) {
        E i5 = i(i4);
        if (i5 == null) {
            p(i4, e4);
        }
        return i5;
    }

    public void s(int i4) {
        int a4 = g.a(this.f6531F, this.f6533H, i4);
        if (a4 >= 0) {
            Object[] objArr = this.f6532G;
            Object obj = objArr[a4];
            Object obj2 = f6529I;
            if (obj != obj2) {
                objArr[a4] = obj2;
                this.f6530E = true;
            }
        }
    }

    public boolean t(int i4, Object obj) {
        int k4 = k(i4);
        if (k4 >= 0) {
            E C3 = C(k4);
            if (obj == C3 || (obj != null && obj.equals(C3))) {
                u(k4);
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        if (B() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6533H * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f6533H; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(o(i4));
            sb.append('=');
            E C3 = C(i4);
            if (C3 != this) {
                sb.append(C3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void u(int i4) {
        Object[] objArr = this.f6532G;
        Object obj = objArr[i4];
        Object obj2 = f6529I;
        if (obj != obj2) {
            objArr[i4] = obj2;
            this.f6530E = true;
        }
    }

    public void w(int i4, int i5) {
        int min = Math.min(this.f6533H, i5 + i4);
        while (i4 < min) {
            u(i4);
            i4++;
        }
    }

    @P
    public E x(int i4, E e4) {
        int k4 = k(i4);
        if (k4 >= 0) {
            Object[] objArr = this.f6532G;
            E e5 = (E) objArr[k4];
            objArr[k4] = e4;
            return e5;
        }
        return null;
    }

    public boolean y(int i4, E e4, E e5) {
        int k4 = k(i4);
        if (k4 >= 0) {
            Object obj = this.f6532G[k4];
            if (obj == e4 || (e4 != null && e4.equals(obj))) {
                this.f6532G[k4] = e5;
                return true;
            }
            return false;
        }
        return false;
    }

    public m(int i4) {
        this.f6530E = false;
        if (i4 == 0) {
            this.f6531F = g.f6482a;
            this.f6532G = g.f6484c;
        } else {
            int e4 = g.e(i4);
            this.f6531F = new int[e4];
            this.f6532G = new Object[e4];
        }
    }
}
