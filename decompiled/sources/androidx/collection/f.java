package androidx.collection;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private int[] f6478a;

    /* renamed from: b, reason: collision with root package name */
    private int f6479b;

    /* renamed from: c, reason: collision with root package name */
    private int f6480c;

    /* renamed from: d, reason: collision with root package name */
    private int f6481d;

    public f() {
        this(8);
    }

    private void d() {
        int[] iArr = this.f6478a;
        int length = iArr.length;
        int i4 = this.f6479b;
        int i5 = length - i4;
        int i6 = length << 1;
        if (i6 >= 0) {
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy(this.f6478a, 0, iArr2, i5, this.f6479b);
            this.f6478a = iArr2;
            this.f6479b = 0;
            this.f6480c = length;
            this.f6481d = i6 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public void a(int i4) {
        int i5 = (this.f6479b - 1) & this.f6481d;
        this.f6479b = i5;
        this.f6478a[i5] = i4;
        if (i5 == this.f6480c) {
            d();
        }
    }

    public void b(int i4) {
        int[] iArr = this.f6478a;
        int i5 = this.f6480c;
        iArr[i5] = i4;
        int i6 = this.f6481d & (i5 + 1);
        this.f6480c = i6;
        if (i6 == this.f6479b) {
            d();
        }
    }

    public void c() {
        this.f6480c = this.f6479b;
    }

    public int e(int i4) {
        if (i4 >= 0 && i4 < m()) {
            return this.f6478a[this.f6481d & (this.f6479b + i4)];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int f() {
        int i4 = this.f6479b;
        if (i4 != this.f6480c) {
            return this.f6478a[i4];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int g() {
        int i4 = this.f6479b;
        int i5 = this.f6480c;
        if (i4 != i5) {
            return this.f6478a[(i5 - 1) & this.f6481d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean h() {
        if (this.f6479b == this.f6480c) {
            return true;
        }
        return false;
    }

    public int i() {
        int i4 = this.f6479b;
        if (i4 != this.f6480c) {
            int i5 = this.f6478a[i4];
            this.f6479b = (i4 + 1) & this.f6481d;
            return i5;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int j() {
        int i4 = this.f6479b;
        int i5 = this.f6480c;
        if (i4 != i5) {
            int i6 = this.f6481d & (i5 - 1);
            int i7 = this.f6478a[i6];
            this.f6480c = i6;
            return i7;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void k(int i4) {
        if (i4 <= 0) {
            return;
        }
        if (i4 <= m()) {
            this.f6480c = this.f6481d & (this.f6480c - i4);
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void l(int i4) {
        if (i4 <= 0) {
            return;
        }
        if (i4 <= m()) {
            this.f6479b = this.f6481d & (this.f6479b + i4);
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int m() {
        return (this.f6480c - this.f6479b) & this.f6481d;
    }

    public f(int i4) {
        if (i4 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i4 <= 1073741824) {
            i4 = Integer.bitCount(i4) != 1 ? Integer.highestOneBit(i4 - 1) << 1 : i4;
            this.f6481d = i4 - 1;
            this.f6478a = new int[i4];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }
}
