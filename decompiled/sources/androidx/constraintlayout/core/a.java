package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private static final boolean f6609l = false;

    /* renamed from: m, reason: collision with root package name */
    static final int f6610m = -1;

    /* renamed from: n, reason: collision with root package name */
    private static float f6611n = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final b f6613b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f6614c;

    /* renamed from: a, reason: collision with root package name */
    int f6612a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f6615d = 8;

    /* renamed from: e, reason: collision with root package name */
    private SolverVariable f6616e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f6617f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f6618g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f6619h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f6620i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f6621j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6622k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar, c cVar) {
        this.f6613b = bVar;
        this.f6614c = cVar;
    }

    public int a() {
        return this.f6620i;
    }

    public final int b(int i4) {
        return this.f6617f[i4];
    }

    public final int c(int i4) {
        return this.f6618g[i4];
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void clear() {
        int i4 = this.f6620i;
        for (int i5 = 0; i4 != -1 && i5 < this.f6612a; i5++) {
            SolverVariable solverVariable = this.f6614c.f6634d[this.f6617f[i4]];
            if (solverVariable != null) {
                solverVariable.k(this.f6613b);
            }
            i4 = this.f6618g[i4];
        }
        this.f6620i = -1;
        this.f6621j = -1;
        this.f6622k = false;
        this.f6612a = 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int d() {
        return this.f6612a;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int e(SolverVariable solverVariable) {
        int i4 = this.f6620i;
        if (i4 == -1) {
            return -1;
        }
        for (int i5 = 0; i4 != -1 && i5 < this.f6612a; i5++) {
            if (this.f6617f[i4] == solverVariable.f6593G) {
                return i4;
            }
            i4 = this.f6618g[i4];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void f() {
        int i4 = this.f6612a;
        System.out.print("{ ");
        for (int i5 = 0; i5 < i4; i5++) {
            SolverVariable j4 = j(i5);
            if (j4 != null) {
                System.out.print(j4 + " = " + m(i5) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean g(SolverVariable solverVariable) {
        int i4 = this.f6620i;
        if (i4 == -1) {
            return false;
        }
        for (int i5 = 0; i4 != -1 && i5 < this.f6612a; i5++) {
            if (this.f6617f[i4] == solverVariable.f6593G) {
                return true;
            }
            i4 = this.f6618g[i4];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float h(b bVar, boolean z3) {
        float o4 = o(bVar.f6625a);
        n(bVar.f6625a, z3);
        b.a aVar = bVar.f6629e;
        int d4 = aVar.d();
        for (int i4 = 0; i4 < d4; i4++) {
            SolverVariable j4 = aVar.j(i4);
            k(j4, aVar.o(j4) * o4, z3);
        }
        return o4;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void i(SolverVariable solverVariable, float f4) {
        if (f4 == 0.0f) {
            n(solverVariable, true);
            return;
        }
        int i4 = this.f6620i;
        if (i4 == -1) {
            this.f6620i = 0;
            this.f6619h[0] = f4;
            this.f6617f[0] = solverVariable.f6593G;
            this.f6618g[0] = -1;
            solverVariable.f6603Q++;
            solverVariable.b(this.f6613b);
            this.f6612a++;
            if (!this.f6622k) {
                int i5 = this.f6621j + 1;
                this.f6621j = i5;
                int[] iArr = this.f6617f;
                if (i5 >= iArr.length) {
                    this.f6622k = true;
                    this.f6621j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i6 = -1;
        for (int i7 = 0; i4 != -1 && i7 < this.f6612a; i7++) {
            int i8 = this.f6617f[i4];
            int i9 = solverVariable.f6593G;
            if (i8 == i9) {
                this.f6619h[i4] = f4;
                return;
            }
            if (i8 < i9) {
                i6 = i4;
            }
            i4 = this.f6618g[i4];
        }
        int i10 = this.f6621j;
        int i11 = i10 + 1;
        if (this.f6622k) {
            int[] iArr2 = this.f6617f;
            if (iArr2[i10] != -1) {
                i10 = iArr2.length;
            }
        } else {
            i10 = i11;
        }
        int[] iArr3 = this.f6617f;
        if (i10 >= iArr3.length && this.f6612a < iArr3.length) {
            int i12 = 0;
            while (true) {
                int[] iArr4 = this.f6617f;
                if (i12 >= iArr4.length) {
                    break;
                }
                if (iArr4[i12] == -1) {
                    i10 = i12;
                    break;
                }
                i12++;
            }
        }
        int[] iArr5 = this.f6617f;
        if (i10 >= iArr5.length) {
            i10 = iArr5.length;
            int i13 = this.f6615d * 2;
            this.f6615d = i13;
            this.f6622k = false;
            this.f6621j = i10 - 1;
            this.f6619h = Arrays.copyOf(this.f6619h, i13);
            this.f6617f = Arrays.copyOf(this.f6617f, this.f6615d);
            this.f6618g = Arrays.copyOf(this.f6618g, this.f6615d);
        }
        this.f6617f[i10] = solverVariable.f6593G;
        this.f6619h[i10] = f4;
        if (i6 != -1) {
            int[] iArr6 = this.f6618g;
            iArr6[i10] = iArr6[i6];
            iArr6[i6] = i10;
        } else {
            this.f6618g[i10] = this.f6620i;
            this.f6620i = i10;
        }
        solverVariable.f6603Q++;
        solverVariable.b(this.f6613b);
        int i14 = this.f6612a + 1;
        this.f6612a = i14;
        if (!this.f6622k) {
            this.f6621j++;
        }
        int[] iArr7 = this.f6617f;
        if (i14 >= iArr7.length) {
            this.f6622k = true;
        }
        if (this.f6621j >= iArr7.length) {
            this.f6622k = true;
            this.f6621j = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public SolverVariable j(int i4) {
        int i5 = this.f6620i;
        for (int i6 = 0; i5 != -1 && i6 < this.f6612a; i6++) {
            if (i6 == i4) {
                return this.f6614c.f6634d[this.f6617f[i5]];
            }
            i5 = this.f6618g[i5];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void k(SolverVariable solverVariable, float f4, boolean z3) {
        float f5 = f6611n;
        if (f4 > (-f5) && f4 < f5) {
            return;
        }
        int i4 = this.f6620i;
        if (i4 == -1) {
            this.f6620i = 0;
            this.f6619h[0] = f4;
            this.f6617f[0] = solverVariable.f6593G;
            this.f6618g[0] = -1;
            solverVariable.f6603Q++;
            solverVariable.b(this.f6613b);
            this.f6612a++;
            if (!this.f6622k) {
                int i5 = this.f6621j + 1;
                this.f6621j = i5;
                int[] iArr = this.f6617f;
                if (i5 >= iArr.length) {
                    this.f6622k = true;
                    this.f6621j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i6 = -1;
        for (int i7 = 0; i4 != -1 && i7 < this.f6612a; i7++) {
            int i8 = this.f6617f[i4];
            int i9 = solverVariable.f6593G;
            if (i8 == i9) {
                float[] fArr = this.f6619h;
                float f6 = fArr[i4] + f4;
                float f7 = f6611n;
                if (f6 > (-f7) && f6 < f7) {
                    f6 = 0.0f;
                }
                fArr[i4] = f6;
                if (f6 == 0.0f) {
                    if (i4 == this.f6620i) {
                        this.f6620i = this.f6618g[i4];
                    } else {
                        int[] iArr2 = this.f6618g;
                        iArr2[i6] = iArr2[i4];
                    }
                    if (z3) {
                        solverVariable.k(this.f6613b);
                    }
                    if (this.f6622k) {
                        this.f6621j = i4;
                    }
                    solverVariable.f6603Q--;
                    this.f6612a--;
                    return;
                }
                return;
            }
            if (i8 < i9) {
                i6 = i4;
            }
            i4 = this.f6618g[i4];
        }
        int i10 = this.f6621j;
        int i11 = i10 + 1;
        if (this.f6622k) {
            int[] iArr3 = this.f6617f;
            if (iArr3[i10] != -1) {
                i10 = iArr3.length;
            }
        } else {
            i10 = i11;
        }
        int[] iArr4 = this.f6617f;
        if (i10 >= iArr4.length && this.f6612a < iArr4.length) {
            int i12 = 0;
            while (true) {
                int[] iArr5 = this.f6617f;
                if (i12 >= iArr5.length) {
                    break;
                }
                if (iArr5[i12] == -1) {
                    i10 = i12;
                    break;
                }
                i12++;
            }
        }
        int[] iArr6 = this.f6617f;
        if (i10 >= iArr6.length) {
            i10 = iArr6.length;
            int i13 = this.f6615d * 2;
            this.f6615d = i13;
            this.f6622k = false;
            this.f6621j = i10 - 1;
            this.f6619h = Arrays.copyOf(this.f6619h, i13);
            this.f6617f = Arrays.copyOf(this.f6617f, this.f6615d);
            this.f6618g = Arrays.copyOf(this.f6618g, this.f6615d);
        }
        this.f6617f[i10] = solverVariable.f6593G;
        this.f6619h[i10] = f4;
        if (i6 != -1) {
            int[] iArr7 = this.f6618g;
            iArr7[i10] = iArr7[i6];
            iArr7[i6] = i10;
        } else {
            this.f6618g[i10] = this.f6620i;
            this.f6620i = i10;
        }
        solverVariable.f6603Q++;
        solverVariable.b(this.f6613b);
        this.f6612a++;
        if (!this.f6622k) {
            this.f6621j++;
        }
        int i14 = this.f6621j;
        int[] iArr8 = this.f6617f;
        if (i14 >= iArr8.length) {
            this.f6622k = true;
            this.f6621j = iArr8.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void l() {
        int i4 = this.f6620i;
        for (int i5 = 0; i4 != -1 && i5 < this.f6612a; i5++) {
            float[] fArr = this.f6619h;
            fArr[i4] = fArr[i4] * (-1.0f);
            i4 = this.f6618g[i4];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public float m(int i4) {
        int i5 = this.f6620i;
        for (int i6 = 0; i5 != -1 && i6 < this.f6612a; i6++) {
            if (i6 == i4) {
                return this.f6619h[i5];
            }
            i5 = this.f6618g[i5];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float n(SolverVariable solverVariable, boolean z3) {
        if (this.f6616e == solverVariable) {
            this.f6616e = null;
        }
        int i4 = this.f6620i;
        if (i4 == -1) {
            return 0.0f;
        }
        int i5 = 0;
        int i6 = -1;
        while (i4 != -1 && i5 < this.f6612a) {
            if (this.f6617f[i4] == solverVariable.f6593G) {
                if (i4 == this.f6620i) {
                    this.f6620i = this.f6618g[i4];
                } else {
                    int[] iArr = this.f6618g;
                    iArr[i6] = iArr[i4];
                }
                if (z3) {
                    solverVariable.k(this.f6613b);
                }
                solverVariable.f6603Q--;
                this.f6612a--;
                this.f6617f[i4] = -1;
                if (this.f6622k) {
                    this.f6621j = i4;
                }
                return this.f6619h[i4];
            }
            i5++;
            i6 = i4;
            i4 = this.f6618g[i4];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float o(SolverVariable solverVariable) {
        int i4 = this.f6620i;
        for (int i5 = 0; i4 != -1 && i5 < this.f6612a; i5++) {
            if (this.f6617f[i4] == solverVariable.f6593G) {
                return this.f6619h[i4];
            }
            i4 = this.f6618g[i4];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int p() {
        return (this.f6617f.length * 12) + 36;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void q(float f4) {
        int i4 = this.f6620i;
        for (int i5 = 0; i4 != -1 && i5 < this.f6612a; i5++) {
            float[] fArr = this.f6619h;
            fArr[i4] = fArr[i4] / f4;
            i4 = this.f6618g[i4];
        }
    }

    SolverVariable r() {
        SolverVariable solverVariable = this.f6616e;
        if (solverVariable == null) {
            int i4 = this.f6620i;
            SolverVariable solverVariable2 = null;
            for (int i5 = 0; i4 != -1 && i5 < this.f6612a; i5++) {
                if (this.f6619h[i4] < 0.0f) {
                    SolverVariable solverVariable3 = this.f6614c.f6634d[this.f6617f[i4]];
                    if (solverVariable2 == null || solverVariable2.f6595I < solverVariable3.f6595I) {
                        solverVariable2 = solverVariable3;
                    }
                }
                i4 = this.f6618g[i4];
            }
            return solverVariable2;
        }
        return solverVariable;
    }

    public final float s(int i4) {
        return this.f6619h[i4];
    }

    boolean t() {
        int i4 = this.f6620i;
        for (int i5 = 0; i4 != -1 && i5 < this.f6612a; i5++) {
            if (this.f6619h[i4] > 0.0f) {
                return true;
            }
            i4 = this.f6618g[i4];
        }
        return false;
    }

    public String toString() {
        int i4 = this.f6620i;
        String str = "";
        for (int i5 = 0; i4 != -1 && i5 < this.f6612a; i5++) {
            str = ((str + " -> ") + this.f6619h[i4] + " : ") + this.f6614c.f6634d[this.f6617f[i4]];
            i4 = this.f6618g[i4];
        }
        return str;
    }
}
