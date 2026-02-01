package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes.dex */
public class u {

    /* renamed from: m, reason: collision with root package name */
    private static final int f7335m = 4;

    /* renamed from: n, reason: collision with root package name */
    private static final int f7336n = 10;

    /* renamed from: o, reason: collision with root package name */
    private static final int f7337o = 10;

    /* renamed from: p, reason: collision with root package name */
    private static final int f7338p = 5;

    /* renamed from: a, reason: collision with root package name */
    int[] f7339a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    int[] f7340b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    int f7341c = 0;

    /* renamed from: d, reason: collision with root package name */
    int[] f7342d = new int[10];

    /* renamed from: e, reason: collision with root package name */
    float[] f7343e = new float[10];

    /* renamed from: f, reason: collision with root package name */
    int f7344f = 0;

    /* renamed from: g, reason: collision with root package name */
    int[] f7345g = new int[5];

    /* renamed from: h, reason: collision with root package name */
    String[] f7346h = new String[5];

    /* renamed from: i, reason: collision with root package name */
    int f7347i = 0;

    /* renamed from: j, reason: collision with root package name */
    int[] f7348j = new int[4];

    /* renamed from: k, reason: collision with root package name */
    boolean[] f7349k = new boolean[4];

    /* renamed from: l, reason: collision with root package name */
    int f7350l = 0;

    public void a(int i4, float f4) {
        int i5 = this.f7344f;
        int[] iArr = this.f7342d;
        if (i5 >= iArr.length) {
            this.f7342d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f7343e;
            this.f7343e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f7342d;
        int i6 = this.f7344f;
        iArr2[i6] = i4;
        float[] fArr2 = this.f7343e;
        this.f7344f = i6 + 1;
        fArr2[i6] = f4;
    }

    public void b(int i4, int i5) {
        int i6 = this.f7341c;
        int[] iArr = this.f7339a;
        if (i6 >= iArr.length) {
            this.f7339a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f7340b;
            this.f7340b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f7339a;
        int i7 = this.f7341c;
        iArr3[i7] = i4;
        int[] iArr4 = this.f7340b;
        this.f7341c = i7 + 1;
        iArr4[i7] = i5;
    }

    public void c(int i4, String str) {
        int i5 = this.f7347i;
        int[] iArr = this.f7345g;
        if (i5 >= iArr.length) {
            this.f7345g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f7346h;
            this.f7346h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f7345g;
        int i6 = this.f7347i;
        iArr2[i6] = i4;
        String[] strArr2 = this.f7346h;
        this.f7347i = i6 + 1;
        strArr2[i6] = str;
    }

    public void d(int i4, boolean z3) {
        int i5 = this.f7350l;
        int[] iArr = this.f7348j;
        if (i5 >= iArr.length) {
            this.f7348j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f7349k;
            this.f7349k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f7348j;
        int i6 = this.f7350l;
        iArr2[i6] = i4;
        boolean[] zArr2 = this.f7349k;
        this.f7350l = i6 + 1;
        zArr2[i6] = z3;
    }

    public void e(int i4, String str) {
        if (str != null) {
            c(i4, str);
        }
    }

    public void f(u uVar) {
        for (int i4 = 0; i4 < this.f7341c; i4++) {
            uVar.b(this.f7339a[i4], this.f7340b[i4]);
        }
        for (int i5 = 0; i5 < this.f7344f; i5++) {
            uVar.a(this.f7342d[i5], this.f7343e[i5]);
        }
        for (int i6 = 0; i6 < this.f7347i; i6++) {
            uVar.c(this.f7345g[i6], this.f7346h[i6]);
        }
        for (int i7 = 0; i7 < this.f7350l; i7++) {
            uVar.d(this.f7348j[i7], this.f7349k[i7]);
        }
    }

    public void g(v vVar) {
        for (int i4 = 0; i4 < this.f7341c; i4++) {
            vVar.b(this.f7339a[i4], this.f7340b[i4]);
        }
        for (int i5 = 0; i5 < this.f7344f; i5++) {
            vVar.c(this.f7342d[i5], this.f7343e[i5]);
        }
        for (int i6 = 0; i6 < this.f7347i; i6++) {
            vVar.d(this.f7345g[i6], this.f7346h[i6]);
        }
        for (int i7 = 0; i7 < this.f7350l; i7++) {
            vVar.e(this.f7348j[i7], this.f7349k[i7]);
        }
    }

    public void h() {
        this.f7350l = 0;
        this.f7347i = 0;
        this.f7344f = 0;
        this.f7341c = 0;
    }

    public int i(int i4) {
        for (int i5 = 0; i5 < this.f7341c; i5++) {
            if (this.f7339a[i5] == i4) {
                return this.f7340b[i5];
            }
        }
        return -1;
    }

    public String toString() {
        return "TypedBundle{mCountInt=" + this.f7341c + ", mCountFloat=" + this.f7344f + ", mCountString=" + this.f7347i + ", mCountBoolean=" + this.f7350l + "}";
    }
}
