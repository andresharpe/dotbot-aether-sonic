package androidx.recyclerview.widget;

import androidx.annotation.N;
import androidx.annotation.P;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* loaded from: classes.dex */
public class E<T> {

    /* renamed from: j, reason: collision with root package name */
    public static final int f17441j = -1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f17442k = 10;

    /* renamed from: l, reason: collision with root package name */
    private static final int f17443l = 10;

    /* renamed from: m, reason: collision with root package name */
    private static final int f17444m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f17445n = 2;

    /* renamed from: o, reason: collision with root package name */
    private static final int f17446o = 4;

    /* renamed from: a, reason: collision with root package name */
    T[] f17447a;

    /* renamed from: b, reason: collision with root package name */
    private T[] f17448b;

    /* renamed from: c, reason: collision with root package name */
    private int f17449c;

    /* renamed from: d, reason: collision with root package name */
    private int f17450d;

    /* renamed from: e, reason: collision with root package name */
    private int f17451e;

    /* renamed from: f, reason: collision with root package name */
    private b f17452f;

    /* renamed from: g, reason: collision with root package name */
    private a f17453g;

    /* renamed from: h, reason: collision with root package name */
    private int f17454h;

    /* renamed from: i, reason: collision with root package name */
    private final Class<T> f17455i;

    /* loaded from: classes.dex */
    public static class a<T2> extends b<T2> {

        /* renamed from: a, reason: collision with root package name */
        final b<T2> f17456a;

        /* renamed from: b, reason: collision with root package name */
        private final C0960f f17457b;

        public a(b<T2> bVar) {
            this.f17456a = bVar;
            this.f17457b = new C0960f(bVar);
        }

        @Override // androidx.recyclerview.widget.u
        public void a(int i4, int i5) {
            this.f17457b.a(i4, i5);
        }

        @Override // androidx.recyclerview.widget.u
        public void b(int i4, int i5) {
            this.f17457b.b(i4, i5);
        }

        @Override // androidx.recyclerview.widget.u
        public void c(int i4, int i5) {
            this.f17457b.c(i4, i5);
        }

        @Override // androidx.recyclerview.widget.E.b, java.util.Comparator
        public int compare(T2 t22, T2 t23) {
            return this.f17456a.compare(t22, t23);
        }

        @Override // androidx.recyclerview.widget.E.b, androidx.recyclerview.widget.u
        public void d(int i4, int i5, Object obj) {
            this.f17457b.d(i4, i5, obj);
        }

        @Override // androidx.recyclerview.widget.E.b
        public boolean e(T2 t22, T2 t23) {
            return this.f17456a.e(t22, t23);
        }

        @Override // androidx.recyclerview.widget.E.b
        public boolean f(T2 t22, T2 t23) {
            return this.f17456a.f(t22, t23);
        }

        @Override // androidx.recyclerview.widget.E.b
        @P
        public Object g(T2 t22, T2 t23) {
            return this.f17456a.g(t22, t23);
        }

        @Override // androidx.recyclerview.widget.E.b
        public void h(int i4, int i5) {
            this.f17457b.d(i4, i5, null);
        }

        public void i() {
            this.f17457b.e();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<T2> implements Comparator<T2>, u {
        @Override // java.util.Comparator
        public abstract int compare(T2 t22, T2 t23);

        public void d(int i4, int i5, Object obj) {
            h(i4, i5);
        }

        public abstract boolean e(T2 t22, T2 t23);

        public abstract boolean f(T2 t22, T2 t23);

        @P
        public Object g(T2 t22, T2 t23) {
            return null;
        }

        public abstract void h(int i4, int i5);
    }

    public E(@N Class<T> cls, @N b<T> bVar) {
        this(cls, bVar, 10);
    }

    private void A(@N T[] tArr) {
        boolean z3 = !(this.f17452f instanceof a);
        if (z3) {
            h();
        }
        this.f17449c = 0;
        this.f17450d = this.f17454h;
        this.f17448b = this.f17447a;
        this.f17451e = 0;
        int D3 = D(tArr);
        this.f17447a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f17455i, D3));
        while (true) {
            int i4 = this.f17451e;
            if (i4 >= D3 && this.f17449c >= this.f17450d) {
                break;
            }
            int i5 = this.f17449c;
            int i6 = this.f17450d;
            if (i5 >= i6) {
                int i7 = D3 - i4;
                System.arraycopy(tArr, i4, this.f17447a, i4, i7);
                this.f17451e += i7;
                this.f17454h += i7;
                this.f17452f.b(i4, i7);
                break;
            }
            if (i4 >= D3) {
                int i8 = i6 - i5;
                this.f17454h -= i8;
                this.f17452f.c(i4, i8);
                break;
            }
            T t3 = this.f17448b[i5];
            T t4 = tArr[i4];
            int compare = this.f17452f.compare(t3, t4);
            if (compare < 0) {
                B();
            } else if (compare > 0) {
                z(t4);
            } else if (!this.f17452f.f(t3, t4)) {
                B();
                z(t4);
            } else {
                T[] tArr2 = this.f17447a;
                int i9 = this.f17451e;
                tArr2[i9] = t4;
                this.f17449c++;
                this.f17451e = i9 + 1;
                if (!this.f17452f.e(t3, t4)) {
                    b bVar = this.f17452f;
                    bVar.d(this.f17451e - 1, 1, bVar.g(t3, t4));
                }
            }
        }
        this.f17448b = null;
        if (z3) {
            k();
        }
    }

    private void B() {
        this.f17454h--;
        this.f17449c++;
        this.f17452f.c(this.f17451e, 1);
    }

    private int D(@N T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f17452f);
        int i4 = 0;
        int i5 = 1;
        for (int i6 = 1; i6 < tArr.length; i6++) {
            T t3 = tArr[i6];
            if (this.f17452f.compare(tArr[i4], t3) == 0) {
                int m4 = m(t3, tArr, i4, i5);
                if (m4 != -1) {
                    tArr[m4] = t3;
                } else {
                    if (i5 != i6) {
                        tArr[i5] = t3;
                    }
                    i5++;
                }
            } else {
                if (i5 != i6) {
                    tArr[i5] = t3;
                }
                i4 = i5;
                i5++;
            }
        }
        return i5;
    }

    private void E() {
        if (this.f17448b == null) {
        } else {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    private int b(T t3, boolean z3) {
        int l4 = l(t3, this.f17447a, 0, this.f17454h, 1);
        if (l4 == -1) {
            l4 = 0;
        } else if (l4 < this.f17454h) {
            T t4 = this.f17447a[l4];
            if (this.f17452f.f(t4, t3)) {
                if (this.f17452f.e(t4, t3)) {
                    this.f17447a[l4] = t3;
                    return l4;
                }
                this.f17447a[l4] = t3;
                b bVar = this.f17452f;
                bVar.d(l4, 1, bVar.g(t4, t3));
                return l4;
            }
        }
        g(l4, t3);
        if (z3) {
            this.f17452f.b(l4, 1);
        }
        return l4;
    }

    private void f(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int D3 = D(tArr);
        if (this.f17454h == 0) {
            this.f17447a = tArr;
            this.f17454h = D3;
            this.f17452f.b(0, D3);
            return;
        }
        q(tArr, D3);
    }

    private void g(int i4, T t3) {
        int i5 = this.f17454h;
        if (i4 <= i5) {
            T[] tArr = this.f17447a;
            if (i5 == tArr.length) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f17455i, tArr.length + 10));
                System.arraycopy(this.f17447a, 0, tArr2, 0, i4);
                tArr2[i4] = t3;
                System.arraycopy(this.f17447a, i4, tArr2, i4 + 1, this.f17454h - i4);
                this.f17447a = tArr2;
            } else {
                System.arraycopy(tArr, i4, tArr, i4 + 1, i5 - i4);
                this.f17447a[i4] = t3;
            }
            this.f17454h++;
            return;
        }
        throw new IndexOutOfBoundsException("cannot add item to " + i4 + " because size is " + this.f17454h);
    }

    private T[] j(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f17455i, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    private int l(T t3, T[] tArr, int i4, int i5, int i6) {
        while (i4 < i5) {
            int i7 = (i4 + i5) / 2;
            T t4 = tArr[i7];
            int compare = this.f17452f.compare(t4, t3);
            if (compare < 0) {
                i4 = i7 + 1;
            } else {
                if (compare == 0) {
                    if (this.f17452f.f(t4, t3)) {
                        return i7;
                    }
                    int p4 = p(t3, i7, i4, i5);
                    if (i6 == 1) {
                        if (p4 != -1) {
                            return p4;
                        }
                        return i7;
                    }
                    return p4;
                }
                i5 = i7;
            }
        }
        if (i6 != 1) {
            return -1;
        }
        return i4;
    }

    private int m(T t3, T[] tArr, int i4, int i5) {
        while (i4 < i5) {
            if (this.f17452f.f(tArr[i4], t3)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    private int p(T t3, int i4, int i5, int i6) {
        T t4;
        for (int i7 = i4 - 1; i7 >= i5; i7--) {
            T t5 = this.f17447a[i7];
            if (this.f17452f.compare(t5, t3) != 0) {
                break;
            }
            if (this.f17452f.f(t5, t3)) {
                return i7;
            }
        }
        do {
            i4++;
            if (i4 < i6) {
                t4 = this.f17447a[i4];
                if (this.f17452f.compare(t4, t3) != 0) {
                    return -1;
                }
            } else {
                return -1;
            }
        } while (!this.f17452f.f(t4, t3));
        return i4;
    }

    private void q(T[] tArr, int i4) {
        boolean z3 = !(this.f17452f instanceof a);
        if (z3) {
            h();
        }
        this.f17448b = this.f17447a;
        int i5 = 0;
        this.f17449c = 0;
        int i6 = this.f17454h;
        this.f17450d = i6;
        this.f17447a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f17455i, i6 + i4 + 10));
        this.f17451e = 0;
        while (true) {
            int i7 = this.f17449c;
            int i8 = this.f17450d;
            if (i7 >= i8 && i5 >= i4) {
                break;
            }
            if (i7 == i8) {
                int i9 = i4 - i5;
                System.arraycopy(tArr, i5, this.f17447a, this.f17451e, i9);
                int i10 = this.f17451e + i9;
                this.f17451e = i10;
                this.f17454h += i9;
                this.f17452f.b(i10 - i9, i9);
                break;
            }
            if (i5 == i4) {
                int i11 = i8 - i7;
                System.arraycopy(this.f17448b, i7, this.f17447a, this.f17451e, i11);
                this.f17451e += i11;
                break;
            }
            T t3 = this.f17448b[i7];
            T t4 = tArr[i5];
            int compare = this.f17452f.compare(t3, t4);
            if (compare > 0) {
                T[] tArr2 = this.f17447a;
                int i12 = this.f17451e;
                this.f17451e = i12 + 1;
                tArr2[i12] = t4;
                this.f17454h++;
                i5++;
                this.f17452f.b(i12, 1);
            } else if (compare == 0 && this.f17452f.f(t3, t4)) {
                T[] tArr3 = this.f17447a;
                int i13 = this.f17451e;
                this.f17451e = i13 + 1;
                tArr3[i13] = t4;
                i5++;
                this.f17449c++;
                if (!this.f17452f.e(t3, t4)) {
                    b bVar = this.f17452f;
                    bVar.d(this.f17451e - 1, 1, bVar.g(t3, t4));
                }
            } else {
                T[] tArr4 = this.f17447a;
                int i14 = this.f17451e;
                this.f17451e = i14 + 1;
                tArr4[i14] = t3;
                this.f17449c++;
            }
        }
        this.f17448b = null;
        if (z3) {
            k();
        }
    }

    private boolean t(T t3, boolean z3) {
        int l4 = l(t3, this.f17447a, 0, this.f17454h, 2);
        if (l4 == -1) {
            return false;
        }
        v(l4, z3);
        return true;
    }

    private void v(int i4, boolean z3) {
        T[] tArr = this.f17447a;
        System.arraycopy(tArr, i4 + 1, tArr, i4, (this.f17454h - i4) - 1);
        int i5 = this.f17454h - 1;
        this.f17454h = i5;
        this.f17447a[i5] = null;
        if (z3) {
            this.f17452f.c(i4, 1);
        }
    }

    private void z(T t3) {
        T[] tArr = this.f17447a;
        int i4 = this.f17451e;
        tArr[i4] = t3;
        this.f17451e = i4 + 1;
        this.f17454h++;
        this.f17452f.b(i4, 1);
    }

    public int C() {
        return this.f17454h;
    }

    public void F(int i4, T t3) {
        boolean z3;
        E();
        T n4 = n(i4);
        if (n4 != t3 && this.f17452f.e(n4, t3)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (n4 != t3 && this.f17452f.compare(n4, t3) == 0) {
            this.f17447a[i4] = t3;
            if (z3) {
                b bVar = this.f17452f;
                bVar.d(i4, 1, bVar.g(n4, t3));
                return;
            }
            return;
        }
        if (z3) {
            b bVar2 = this.f17452f;
            bVar2.d(i4, 1, bVar2.g(n4, t3));
        }
        v(i4, false);
        int b4 = b(t3, false);
        if (i4 != b4) {
            this.f17452f.a(i4, b4);
        }
    }

    public int a(T t3) {
        E();
        return b(t3, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(@N Collection<T> collection) {
        e(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f17455i, collection.size())), true);
    }

    public void d(@N T... tArr) {
        e(tArr, false);
    }

    public void e(@N T[] tArr, boolean z3) {
        E();
        if (tArr.length == 0) {
            return;
        }
        if (z3) {
            f(tArr);
        } else {
            f(j(tArr));
        }
    }

    public void h() {
        E();
        b bVar = this.f17452f;
        if (bVar instanceof a) {
            return;
        }
        if (this.f17453g == null) {
            this.f17453g = new a(bVar);
        }
        this.f17452f = this.f17453g;
    }

    public void i() {
        E();
        int i4 = this.f17454h;
        if (i4 == 0) {
            return;
        }
        Arrays.fill(this.f17447a, 0, i4, (Object) null);
        this.f17454h = 0;
        this.f17452f.c(0, i4);
    }

    public void k() {
        E();
        b bVar = this.f17452f;
        if (bVar instanceof a) {
            ((a) bVar).i();
        }
        b bVar2 = this.f17452f;
        a aVar = this.f17453g;
        if (bVar2 == aVar) {
            this.f17452f = aVar.f17456a;
        }
    }

    public T n(int i4) throws IndexOutOfBoundsException {
        int i5;
        if (i4 < this.f17454h && i4 >= 0) {
            T[] tArr = this.f17448b;
            if (tArr != null && i4 >= (i5 = this.f17451e)) {
                return tArr[(i4 - i5) + this.f17449c];
            }
            return this.f17447a[i4];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i4 + " but size is " + this.f17454h);
    }

    public int o(T t3) {
        if (this.f17448b != null) {
            int l4 = l(t3, this.f17447a, 0, this.f17451e, 4);
            if (l4 != -1) {
                return l4;
            }
            int l5 = l(t3, this.f17448b, this.f17449c, this.f17450d, 4);
            if (l5 == -1) {
                return -1;
            }
            return (l5 - this.f17449c) + this.f17451e;
        }
        return l(t3, this.f17447a, 0, this.f17454h, 4);
    }

    public void r(int i4) {
        E();
        T n4 = n(i4);
        v(i4, false);
        int b4 = b(n4, false);
        if (i4 != b4) {
            this.f17452f.a(i4, b4);
        }
    }

    public boolean s(T t3) {
        E();
        return t(t3, true);
    }

    public T u(int i4) {
        E();
        T n4 = n(i4);
        v(i4, true);
        return n4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w(@N Collection<T> collection) {
        y(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f17455i, collection.size())), true);
    }

    public void x(@N T... tArr) {
        y(tArr, false);
    }

    public void y(@N T[] tArr, boolean z3) {
        E();
        if (z3) {
            A(tArr);
        } else {
            A(j(tArr));
        }
    }

    public E(@N Class<T> cls, @N b<T> bVar, int i4) {
        this.f17455i = cls;
        this.f17447a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i4));
        this.f17452f = bVar;
        this.f17454h = 0;
    }
}
