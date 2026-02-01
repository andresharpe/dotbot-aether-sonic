package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class i implements b.a {

    /* renamed from: n, reason: collision with root package name */
    private static final boolean f6726n = false;

    /* renamed from: o, reason: collision with root package name */
    private static final boolean f6727o = true;

    /* renamed from: p, reason: collision with root package name */
    private static float f6728p = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f6729a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f6730b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f6731c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f6732d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f6733e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f6734f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f6735g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f6736h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f6737i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f6738j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f6739k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final b f6740l;

    /* renamed from: m, reason: collision with root package name */
    protected final c f6741m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(b bVar, c cVar) {
        this.f6740l = bVar;
        this.f6741m = cVar;
        clear();
    }

    private void a(SolverVariable solverVariable, int i4) {
        int[] iArr;
        int i5 = solverVariable.f6593G % this.f6731c;
        int[] iArr2 = this.f6732d;
        int i6 = iArr2[i5];
        if (i6 == -1) {
            iArr2[i5] = i4;
        } else {
            while (true) {
                iArr = this.f6733e;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    break;
                } else {
                    i6 = i7;
                }
            }
            iArr[i6] = i4;
        }
        this.f6733e[i4] = -1;
    }

    private void b(int i4, SolverVariable solverVariable, float f4) {
        this.f6734f[i4] = solverVariable.f6593G;
        this.f6735g[i4] = f4;
        this.f6736h[i4] = -1;
        this.f6737i[i4] = -1;
        solverVariable.b(this.f6740l);
        solverVariable.f6603Q++;
        this.f6738j++;
    }

    private void c() {
        for (int i4 = 0; i4 < this.f6731c; i4++) {
            if (this.f6732d[i4] != -1) {
                String str = hashCode() + " hash [" + i4 + "] => ";
                int i5 = this.f6732d[i4];
                boolean z3 = false;
                while (!z3) {
                    str = str + " " + this.f6734f[i5];
                    int i6 = this.f6733e[i5];
                    if (i6 != -1) {
                        i5 = i6;
                    } else {
                        z3 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private int r() {
        for (int i4 = 0; i4 < this.f6730b; i4++) {
            if (this.f6734f[i4] == -1) {
                return i4;
            }
        }
        return -1;
    }

    private void s() {
        int i4 = this.f6730b * 2;
        this.f6734f = Arrays.copyOf(this.f6734f, i4);
        this.f6735g = Arrays.copyOf(this.f6735g, i4);
        this.f6736h = Arrays.copyOf(this.f6736h, i4);
        this.f6737i = Arrays.copyOf(this.f6737i, i4);
        this.f6733e = Arrays.copyOf(this.f6733e, i4);
        for (int i5 = this.f6730b; i5 < i4; i5++) {
            this.f6734f[i5] = -1;
            this.f6733e[i5] = -1;
        }
        this.f6730b = i4;
    }

    private void t(int i4, SolverVariable solverVariable, float f4) {
        int r4 = r();
        b(r4, solverVariable, f4);
        if (i4 != -1) {
            this.f6736h[r4] = i4;
            int[] iArr = this.f6737i;
            iArr[r4] = iArr[i4];
            iArr[i4] = r4;
        } else {
            this.f6736h[r4] = -1;
            if (this.f6738j > 0) {
                this.f6737i[r4] = this.f6739k;
                this.f6739k = r4;
            } else {
                this.f6737i[r4] = -1;
            }
        }
        int i5 = this.f6737i[r4];
        if (i5 != -1) {
            this.f6736h[i5] = r4;
        }
        a(solverVariable, r4);
    }

    private void u(SolverVariable solverVariable) {
        int[] iArr;
        int i4;
        int i5 = solverVariable.f6593G;
        int i6 = i5 % this.f6731c;
        int[] iArr2 = this.f6732d;
        int i7 = iArr2[i6];
        if (i7 == -1) {
            return;
        }
        if (this.f6734f[i7] == i5) {
            int[] iArr3 = this.f6733e;
            iArr2[i6] = iArr3[i7];
            iArr3[i7] = -1;
            return;
        }
        while (true) {
            iArr = this.f6733e;
            i4 = iArr[i7];
            if (i4 == -1 || this.f6734f[i4] == i5) {
                break;
            } else {
                i7 = i4;
            }
        }
        if (i4 != -1 && this.f6734f[i4] == i5) {
            iArr[i7] = iArr[i4];
            iArr[i4] = -1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void clear() {
        int i4 = this.f6738j;
        for (int i5 = 0; i5 < i4; i5++) {
            SolverVariable j4 = j(i5);
            if (j4 != null) {
                j4.k(this.f6740l);
            }
        }
        for (int i6 = 0; i6 < this.f6730b; i6++) {
            this.f6734f[i6] = -1;
            this.f6733e[i6] = -1;
        }
        for (int i7 = 0; i7 < this.f6731c; i7++) {
            this.f6732d[i7] = -1;
        }
        this.f6738j = 0;
        this.f6739k = -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int d() {
        return this.f6738j;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int e(SolverVariable solverVariable) {
        if (this.f6738j != 0 && solverVariable != null) {
            int i4 = solverVariable.f6593G;
            int i5 = this.f6732d[i4 % this.f6731c];
            if (i5 == -1) {
                return -1;
            }
            if (this.f6734f[i5] == i4) {
                return i5;
            }
            do {
                i5 = this.f6733e[i5];
                if (i5 == -1) {
                    break;
                }
            } while (this.f6734f[i5] != i4);
            if (i5 != -1 && this.f6734f[i5] == i4) {
                return i5;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void f() {
        int i4 = this.f6738j;
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
        if (e(solverVariable) != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float h(b bVar, boolean z3) {
        float o4 = o(bVar.f6625a);
        n(bVar.f6625a, z3);
        i iVar = (i) bVar.f6629e;
        int d4 = iVar.d();
        int i4 = 0;
        int i5 = 0;
        while (i4 < d4) {
            int i6 = iVar.f6734f[i5];
            if (i6 != -1) {
                k(this.f6741m.f6634d[i6], iVar.f6735g[i5] * o4, z3);
                i4++;
            }
            i5++;
        }
        return o4;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void i(SolverVariable solverVariable, float f4) {
        float f5 = f6728p;
        if (f4 > (-f5) && f4 < f5) {
            n(solverVariable, true);
            return;
        }
        if (this.f6738j == 0) {
            b(0, solverVariable, f4);
            a(solverVariable, 0);
            this.f6739k = 0;
            return;
        }
        int e4 = e(solverVariable);
        if (e4 != -1) {
            this.f6735g[e4] = f4;
            return;
        }
        if (this.f6738j + 1 >= this.f6730b) {
            s();
        }
        int i4 = this.f6738j;
        int i5 = this.f6739k;
        int i6 = -1;
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = this.f6734f[i5];
            int i9 = solverVariable.f6593G;
            if (i8 == i9) {
                this.f6735g[i5] = f4;
                return;
            }
            if (i8 < i9) {
                i6 = i5;
            }
            i5 = this.f6737i[i5];
            if (i5 == -1) {
                break;
            }
        }
        t(i6, solverVariable, f4);
    }

    @Override // androidx.constraintlayout.core.b.a
    public SolverVariable j(int i4) {
        int i5 = this.f6738j;
        if (i5 == 0) {
            return null;
        }
        int i6 = this.f6739k;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i4 && i6 != -1) {
                return this.f6741m.f6634d[this.f6734f[i6]];
            }
            i6 = this.f6737i[i6];
            if (i6 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void k(SolverVariable solverVariable, float f4, boolean z3) {
        float f5 = f6728p;
        if (f4 > (-f5) && f4 < f5) {
            return;
        }
        int e4 = e(solverVariable);
        if (e4 == -1) {
            i(solverVariable, f4);
            return;
        }
        float[] fArr = this.f6735g;
        float f6 = fArr[e4] + f4;
        fArr[e4] = f6;
        float f7 = f6728p;
        if (f6 > (-f7) && f6 < f7) {
            fArr[e4] = 0.0f;
            n(solverVariable, z3);
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void l() {
        int i4 = this.f6738j;
        int i5 = this.f6739k;
        for (int i6 = 0; i6 < i4; i6++) {
            float[] fArr = this.f6735g;
            fArr[i5] = fArr[i5] * (-1.0f);
            i5 = this.f6737i[i5];
            if (i5 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public float m(int i4) {
        int i5 = this.f6738j;
        int i6 = this.f6739k;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i4) {
                return this.f6735g[i6];
            }
            i6 = this.f6737i[i6];
            if (i6 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float n(SolverVariable solverVariable, boolean z3) {
        int e4 = e(solverVariable);
        if (e4 == -1) {
            return 0.0f;
        }
        u(solverVariable);
        float f4 = this.f6735g[e4];
        if (this.f6739k == e4) {
            this.f6739k = this.f6737i[e4];
        }
        this.f6734f[e4] = -1;
        int[] iArr = this.f6736h;
        int i4 = iArr[e4];
        if (i4 != -1) {
            int[] iArr2 = this.f6737i;
            iArr2[i4] = iArr2[e4];
        }
        int i5 = this.f6737i[e4];
        if (i5 != -1) {
            iArr[i5] = iArr[e4];
        }
        this.f6738j--;
        solverVariable.f6603Q--;
        if (z3) {
            solverVariable.k(this.f6740l);
        }
        return f4;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float o(SolverVariable solverVariable) {
        int e4 = e(solverVariable);
        if (e4 != -1) {
            return this.f6735g[e4];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int p() {
        return 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void q(float f4) {
        int i4 = this.f6738j;
        int i5 = this.f6739k;
        for (int i6 = 0; i6 < i4; i6++) {
            float[] fArr = this.f6735g;
            fArr[i5] = fArr[i5] / f4;
            i5 = this.f6737i[i5];
            if (i5 == -1) {
                return;
            }
        }
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i4 = this.f6738j;
        for (int i5 = 0; i5 < i4; i5++) {
            SolverVariable j4 = j(i5);
            if (j4 != null) {
                String str4 = str3 + j4 + " = " + m(i5) + " ";
                int e4 = e(j4);
                String str5 = str4 + "[p: ";
                int i6 = this.f6736h[e4];
                if (i6 != -1) {
                    str = str5 + this.f6741m.f6634d[this.f6734f[i6]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                int i7 = this.f6737i[e4];
                if (i7 != -1) {
                    str2 = str6 + this.f6741m.f6634d[this.f6734f[i7]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
