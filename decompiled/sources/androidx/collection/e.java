package androidx.collection;

/* loaded from: classes.dex */
public final class e<E> {

    /* renamed from: a, reason: collision with root package name */
    private E[] f6474a;

    /* renamed from: b, reason: collision with root package name */
    private int f6475b;

    /* renamed from: c, reason: collision with root package name */
    private int f6476c;

    /* renamed from: d, reason: collision with root package name */
    private int f6477d;

    public e() {
        this(8);
    }

    private void d() {
        E[] eArr = this.f6474a;
        int length = eArr.length;
        int i4 = this.f6475b;
        int i5 = length - i4;
        int i6 = length << 1;
        if (i6 >= 0) {
            E[] eArr2 = (E[]) new Object[i6];
            System.arraycopy(eArr, i4, eArr2, 0, i5);
            System.arraycopy(this.f6474a, 0, eArr2, i5, this.f6475b);
            this.f6474a = eArr2;
            this.f6475b = 0;
            this.f6476c = length;
            this.f6477d = i6 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public void a(E e4) {
        int i4 = (this.f6475b - 1) & this.f6477d;
        this.f6475b = i4;
        this.f6474a[i4] = e4;
        if (i4 == this.f6476c) {
            d();
        }
    }

    public void b(E e4) {
        E[] eArr = this.f6474a;
        int i4 = this.f6476c;
        eArr[i4] = e4;
        int i5 = this.f6477d & (i4 + 1);
        this.f6476c = i5;
        if (i5 == this.f6475b) {
            d();
        }
    }

    public void c() {
        l(m());
    }

    public E e(int i4) {
        if (i4 >= 0 && i4 < m()) {
            return this.f6474a[this.f6477d & (this.f6475b + i4)];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E f() {
        int i4 = this.f6475b;
        if (i4 != this.f6476c) {
            return this.f6474a[i4];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E g() {
        int i4 = this.f6475b;
        int i5 = this.f6476c;
        if (i4 != i5) {
            return this.f6474a[(i5 - 1) & this.f6477d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean h() {
        if (this.f6475b == this.f6476c) {
            return true;
        }
        return false;
    }

    public E i() {
        int i4 = this.f6475b;
        if (i4 != this.f6476c) {
            E[] eArr = this.f6474a;
            E e4 = eArr[i4];
            eArr[i4] = null;
            this.f6475b = (i4 + 1) & this.f6477d;
            return e4;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E j() {
        int i4 = this.f6475b;
        int i5 = this.f6476c;
        if (i4 != i5) {
            int i6 = this.f6477d & (i5 - 1);
            E[] eArr = this.f6474a;
            E e4 = eArr[i6];
            eArr[i6] = null;
            this.f6476c = i6;
            return e4;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void k(int i4) {
        int i5;
        int i6;
        if (i4 <= 0) {
            return;
        }
        if (i4 <= m()) {
            int i7 = this.f6476c;
            if (i4 < i7) {
                i5 = i7 - i4;
            } else {
                i5 = 0;
            }
            int i8 = i5;
            while (true) {
                i6 = this.f6476c;
                if (i8 >= i6) {
                    break;
                }
                this.f6474a[i8] = null;
                i8++;
            }
            int i9 = i6 - i5;
            int i10 = i4 - i9;
            this.f6476c = i6 - i9;
            if (i10 > 0) {
                int length = this.f6474a.length;
                this.f6476c = length;
                int i11 = length - i10;
                for (int i12 = i11; i12 < this.f6476c; i12++) {
                    this.f6474a[i12] = null;
                }
                this.f6476c = i11;
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void l(int i4) {
        if (i4 <= 0) {
            return;
        }
        if (i4 <= m()) {
            int length = this.f6474a.length;
            int i5 = this.f6475b;
            if (i4 < length - i5) {
                length = i5 + i4;
            }
            while (i5 < length) {
                this.f6474a[i5] = null;
                i5++;
            }
            int i6 = this.f6475b;
            int i7 = length - i6;
            int i8 = i4 - i7;
            this.f6475b = this.f6477d & (i6 + i7);
            if (i8 > 0) {
                for (int i9 = 0; i9 < i8; i9++) {
                    this.f6474a[i9] = null;
                }
                this.f6475b = i8;
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int m() {
        return (this.f6476c - this.f6475b) & this.f6477d;
    }

    public e(int i4) {
        if (i4 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i4 <= 1073741824) {
            i4 = Integer.bitCount(i4) != 1 ? Integer.highestOneBit(i4 - 1) << 1 : i4;
            this.f6477d = i4 - 1;
            this.f6474a = (E[]) new Object[i4];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }
}
