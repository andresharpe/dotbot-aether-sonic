package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class h extends androidx.constraintlayout.core.b {

    /* renamed from: o, reason: collision with root package name */
    private static final float f6713o = 1.0E-4f;

    /* renamed from: p, reason: collision with root package name */
    private static final boolean f6714p = false;

    /* renamed from: q, reason: collision with root package name */
    static final int f6715q = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f6716i;

    /* renamed from: j, reason: collision with root package name */
    private SolverVariable[] f6717j;

    /* renamed from: k, reason: collision with root package name */
    private SolverVariable[] f6718k;

    /* renamed from: l, reason: collision with root package name */
    private int f6719l;

    /* renamed from: m, reason: collision with root package name */
    b f6720m;

    /* renamed from: n, reason: collision with root package name */
    c f6721n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Comparator<SolverVariable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f6593G - solverVariable2.f6593G;
        }
    }

    /* loaded from: classes.dex */
    class b {

        /* renamed from: a, reason: collision with root package name */
        SolverVariable f6723a;

        /* renamed from: b, reason: collision with root package name */
        h f6724b;

        b(h hVar) {
            this.f6724b = hVar;
        }

        public void a(SolverVariable solverVariable) {
            for (int i4 = 0; i4 < 9; i4++) {
                float[] fArr = this.f6723a.f6599M;
                float f4 = fArr[i4] + solverVariable.f6599M[i4];
                fArr[i4] = f4;
                if (Math.abs(f4) < 1.0E-4f) {
                    this.f6723a.f6599M[i4] = 0.0f;
                }
            }
        }

        public boolean b(SolverVariable solverVariable, float f4) {
            boolean z3 = true;
            if (this.f6723a.f6591E) {
                for (int i4 = 0; i4 < 9; i4++) {
                    float[] fArr = this.f6723a.f6599M;
                    float f5 = fArr[i4] + (solverVariable.f6599M[i4] * f4);
                    fArr[i4] = f5;
                    if (Math.abs(f5) < 1.0E-4f) {
                        this.f6723a.f6599M[i4] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    h.this.J(this.f6723a);
                }
                return false;
            }
            for (int i5 = 0; i5 < 9; i5++) {
                float f6 = solverVariable.f6599M[i5];
                if (f6 != 0.0f) {
                    float f7 = f6 * f4;
                    if (Math.abs(f7) < 1.0E-4f) {
                        f7 = 0.0f;
                    }
                    this.f6723a.f6599M[i5] = f7;
                } else {
                    this.f6723a.f6599M[i5] = 0.0f;
                }
            }
            return true;
        }

        public void c(SolverVariable solverVariable) {
            this.f6723a = solverVariable;
        }

        public final boolean d() {
            for (int i4 = 8; i4 >= 0; i4--) {
                float f4 = this.f6723a.f6599M[i4];
                if (f4 > 0.0f) {
                    return false;
                }
                if (f4 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e() {
            for (int i4 = 0; i4 < 9; i4++) {
                if (this.f6723a.f6599M[i4] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean f(SolverVariable solverVariable) {
            for (int i4 = 8; i4 >= 0; i4--) {
                float f4 = solverVariable.f6599M[i4];
                float f5 = this.f6723a.f6599M[i4];
                if (f5 != f4) {
                    if (f5 >= f4) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        public void g() {
            Arrays.fill(this.f6723a.f6599M, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f6723a != null) {
                for (int i4 = 0; i4 < 9; i4++) {
                    str = str + this.f6723a.f6599M[i4] + " ";
                }
            }
            return str + "] " + this.f6723a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f6716i = 128;
        this.f6717j = new SolverVariable[128];
        this.f6718k = new SolverVariable[128];
        this.f6719l = 0;
        this.f6720m = new b(this);
        this.f6721n = cVar;
    }

    private void I(SolverVariable solverVariable) {
        int i4;
        int i5 = this.f6719l + 1;
        SolverVariable[] solverVariableArr = this.f6717j;
        if (i5 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f6717j = solverVariableArr2;
            this.f6718k = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f6717j;
        int i6 = this.f6719l;
        solverVariableArr3[i6] = solverVariable;
        int i7 = i6 + 1;
        this.f6719l = i7;
        if (i7 > 1 && solverVariableArr3[i6].f6593G > solverVariable.f6593G) {
            int i8 = 0;
            while (true) {
                i4 = this.f6719l;
                if (i8 >= i4) {
                    break;
                }
                this.f6718k[i8] = this.f6717j[i8];
                i8++;
            }
            Arrays.sort(this.f6718k, 0, i4, new a());
            for (int i9 = 0; i9 < this.f6719l; i9++) {
                this.f6717j[i9] = this.f6718k[i9];
            }
        }
        solverVariable.f6591E = true;
        solverVariable.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(SolverVariable solverVariable) {
        int i4 = 0;
        while (i4 < this.f6719l) {
            if (this.f6717j[i4] == solverVariable) {
                while (true) {
                    int i5 = this.f6719l;
                    if (i4 < i5 - 1) {
                        SolverVariable[] solverVariableArr = this.f6717j;
                        int i6 = i4 + 1;
                        solverVariableArr[i4] = solverVariableArr[i6];
                        i4 = i6;
                    } else {
                        this.f6719l = i5 - 1;
                        solverVariable.f6591E = false;
                        return;
                    }
                }
            } else {
                i4++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public void c(e eVar, androidx.constraintlayout.core.b bVar, boolean z3) {
        SolverVariable solverVariable = bVar.f6625a;
        if (solverVariable == null) {
            return;
        }
        b.a aVar = bVar.f6629e;
        int d4 = aVar.d();
        for (int i4 = 0; i4 < d4; i4++) {
            SolverVariable j4 = aVar.j(i4);
            float m4 = aVar.m(i4);
            this.f6720m.c(j4);
            if (this.f6720m.b(solverVariable, m4)) {
                I(j4);
            }
            this.f6626b += bVar.f6626b * m4;
        }
        J(solverVariable);
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public void clear() {
        this.f6719l = 0;
        this.f6626b = 0.0f;
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public SolverVariable e(e eVar, boolean[] zArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < this.f6719l; i5++) {
            SolverVariable solverVariable = this.f6717j[i5];
            if (!zArr[solverVariable.f6593G]) {
                this.f6720m.c(solverVariable);
                if (i4 == -1) {
                    if (!this.f6720m.d()) {
                    }
                    i4 = i5;
                } else {
                    if (!this.f6720m.f(this.f6717j[i4])) {
                    }
                    i4 = i5;
                }
            }
        }
        if (i4 == -1) {
            return null;
        }
        return this.f6717j[i4];
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public void f(SolverVariable solverVariable) {
        this.f6720m.c(solverVariable);
        this.f6720m.g();
        solverVariable.f6599M[solverVariable.f6595I] = 1.0f;
        I(solverVariable);
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public boolean isEmpty() {
        if (this.f6719l == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b
    public String toString() {
        String str = " goal -> (" + this.f6626b + ") : ";
        for (int i4 = 0; i4 < this.f6719l; i4++) {
            this.f6720m.c(this.f6717j[i4]);
            str = str + this.f6720m + " ";
        }
        return str;
    }
}
