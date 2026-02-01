package androidx.appcompat.widget;

/* loaded from: classes.dex */
class X {

    /* renamed from: i, reason: collision with root package name */
    public static final int f6012i = Integer.MIN_VALUE;

    /* renamed from: a, reason: collision with root package name */
    private int f6013a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f6014b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f6015c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f6016d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f6017e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f6018f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6019g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6020h = false;

    public int a() {
        if (this.f6019g) {
            return this.f6013a;
        }
        return this.f6014b;
    }

    public int b() {
        return this.f6013a;
    }

    public int c() {
        return this.f6014b;
    }

    public int d() {
        if (this.f6019g) {
            return this.f6014b;
        }
        return this.f6013a;
    }

    public void e(int i4, int i5) {
        this.f6020h = false;
        if (i4 != Integer.MIN_VALUE) {
            this.f6017e = i4;
            this.f6013a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f6018f = i5;
            this.f6014b = i5;
        }
    }

    public void f(boolean z3) {
        if (z3 == this.f6019g) {
            return;
        }
        this.f6019g = z3;
        if (this.f6020h) {
            if (z3) {
                int i4 = this.f6016d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f6017e;
                }
                this.f6013a = i4;
                int i5 = this.f6015c;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = this.f6018f;
                }
                this.f6014b = i5;
                return;
            }
            int i6 = this.f6015c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = this.f6017e;
            }
            this.f6013a = i6;
            int i7 = this.f6016d;
            if (i7 == Integer.MIN_VALUE) {
                i7 = this.f6018f;
            }
            this.f6014b = i7;
            return;
        }
        this.f6013a = this.f6017e;
        this.f6014b = this.f6018f;
    }

    public void g(int i4, int i5) {
        this.f6015c = i4;
        this.f6016d = i5;
        this.f6020h = true;
        if (this.f6019g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f6013a = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f6014b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f6013a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f6014b = i5;
        }
    }
}
