package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b implements e.a {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f6623g = false;

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f6624h = false;

    /* renamed from: e, reason: collision with root package name */
    public a f6629e;

    /* renamed from: a, reason: collision with root package name */
    SolverVariable f6625a = null;

    /* renamed from: b, reason: collision with root package name */
    float f6626b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f6627c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<SolverVariable> f6628d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    boolean f6630f = false;

    /* loaded from: classes.dex */
    public interface a {
        void clear();

        int d();

        int e(SolverVariable solverVariable);

        void f();

        boolean g(SolverVariable solverVariable);

        float h(b bVar, boolean z3);

        void i(SolverVariable solverVariable, float f4);

        SolverVariable j(int i4);

        void k(SolverVariable solverVariable, float f4, boolean z3);

        void l();

        float m(int i4);

        float n(SolverVariable solverVariable, boolean z3);

        float o(SolverVariable solverVariable);

        int p();

        void q(float f4);
    }

    public b() {
    }

    private SolverVariable B(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int d4 = this.f6629e.d();
        SolverVariable solverVariable2 = null;
        float f4 = 0.0f;
        for (int i4 = 0; i4 < d4; i4++) {
            float m4 = this.f6629e.m(i4);
            if (m4 < 0.0f) {
                SolverVariable j4 = this.f6629e.j(i4);
                if ((zArr == null || !zArr[j4.f6593G]) && j4 != solverVariable && (((type = j4.f6600N) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && m4 < f4)) {
                    f4 = m4;
                    solverVariable2 = j4;
                }
            }
        }
        return solverVariable2;
    }

    private boolean z(SolverVariable solverVariable, e eVar) {
        if (solverVariable.f6603Q <= 1) {
            return true;
        }
        return false;
    }

    public SolverVariable A(SolverVariable solverVariable) {
        return B(null, solverVariable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f6625a;
        if (solverVariable2 != null) {
            this.f6629e.i(solverVariable2, -1.0f);
            this.f6625a.f6594H = -1;
            this.f6625a = null;
        }
        float n4 = this.f6629e.n(solverVariable, true) * (-1.0f);
        this.f6625a = solverVariable;
        if (n4 == 1.0f) {
            return;
        }
        this.f6626b /= n4;
        this.f6629e.q(n4);
    }

    public void D() {
        this.f6625a = null;
        this.f6629e.clear();
        this.f6626b = 0.0f;
        this.f6630f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int E() {
        int i4;
        if (this.f6625a != null) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        return i4 + 8 + this.f6629e.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String F() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.b.F():java.lang.String");
    }

    public void G(e eVar, SolverVariable solverVariable, boolean z3) {
        if (solverVariable != null && solverVariable.f6604R) {
            float o4 = this.f6629e.o(solverVariable);
            this.f6626b += solverVariable.f6606T * o4;
            this.f6629e.n(solverVariable, z3);
            if (z3) {
                solverVariable.k(this);
            }
            this.f6629e.k(eVar.f6663n.f6634d[solverVariable.f6605S], o4, z3);
            if (e.f6648y && this.f6629e.d() == 0) {
                this.f6630f = true;
                eVar.f6650a = true;
            }
        }
    }

    @Override // androidx.constraintlayout.core.e.a
    public void a(e eVar, SolverVariable solverVariable, boolean z3) {
        if (solverVariable != null && solverVariable.f6597K) {
            this.f6626b += solverVariable.f6596J * this.f6629e.o(solverVariable);
            this.f6629e.n(solverVariable, z3);
            if (z3) {
                solverVariable.k(this);
            }
            if (e.f6648y && this.f6629e.d() == 0) {
                this.f6630f = true;
                eVar.f6650a = true;
            }
        }
    }

    @Override // androidx.constraintlayout.core.e.a
    public void b(e eVar) {
        if (eVar.f6656g.length == 0) {
            return;
        }
        boolean z3 = false;
        while (!z3) {
            int d4 = this.f6629e.d();
            for (int i4 = 0; i4 < d4; i4++) {
                SolverVariable j4 = this.f6629e.j(i4);
                if (j4.f6594H != -1 || j4.f6597K || j4.f6604R) {
                    this.f6628d.add(j4);
                }
            }
            int size = this.f6628d.size();
            if (size > 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    SolverVariable solverVariable = this.f6628d.get(i5);
                    if (solverVariable.f6597K) {
                        a(eVar, solverVariable, true);
                    } else if (solverVariable.f6604R) {
                        G(eVar, solverVariable, true);
                    } else {
                        c(eVar, eVar.f6656g[solverVariable.f6594H], true);
                    }
                }
                this.f6628d.clear();
            } else {
                z3 = true;
            }
        }
        if (e.f6648y && this.f6625a != null && this.f6629e.d() == 0) {
            this.f6630f = true;
            eVar.f6650a = true;
        }
    }

    @Override // androidx.constraintlayout.core.e.a
    public void c(e eVar, b bVar, boolean z3) {
        this.f6626b += bVar.f6626b * this.f6629e.h(bVar, z3);
        if (z3) {
            bVar.f6625a.k(this);
        }
        if (e.f6648y && this.f6625a != null && this.f6629e.d() == 0) {
            this.f6630f = true;
            eVar.f6650a = true;
        }
    }

    @Override // androidx.constraintlayout.core.e.a
    public void clear() {
        this.f6629e.clear();
        this.f6625a = null;
        this.f6626b = 0.0f;
    }

    @Override // androidx.constraintlayout.core.e.a
    public void d(e.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f6625a = null;
            this.f6629e.clear();
            for (int i4 = 0; i4 < bVar.f6629e.d(); i4++) {
                this.f6629e.k(bVar.f6629e.j(i4), bVar.f6629e.m(i4), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.e.a
    public SolverVariable e(e eVar, boolean[] zArr) {
        return B(zArr, null);
    }

    @Override // androidx.constraintlayout.core.e.a
    public void f(SolverVariable solverVariable) {
        int i4 = solverVariable.f6595I;
        float f4 = 1.0f;
        if (i4 != 1) {
            if (i4 == 2) {
                f4 = 1000.0f;
            } else if (i4 == 3) {
                f4 = 1000000.0f;
            } else if (i4 == 4) {
                f4 = 1.0E9f;
            } else if (i4 == 5) {
                f4 = 1.0E12f;
            }
        }
        this.f6629e.i(solverVariable, f4);
    }

    public b g(e eVar, int i4) {
        this.f6629e.i(eVar.q(i4, "ep"), 1.0f);
        this.f6629e.i(eVar.q(i4, "em"), -1.0f);
        return this;
    }

    @Override // androidx.constraintlayout.core.e.a
    public SolverVariable getKey() {
        return this.f6625a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b h(SolverVariable solverVariable, int i4) {
        this.f6629e.i(solverVariable, i4);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(e eVar) {
        boolean z3;
        SolverVariable j4 = j(eVar);
        if (j4 == null) {
            z3 = true;
        } else {
            C(j4);
            z3 = false;
        }
        if (this.f6629e.d() == 0) {
            this.f6630f = true;
        }
        return z3;
    }

    @Override // androidx.constraintlayout.core.e.a
    public boolean isEmpty() {
        if (this.f6625a == null && this.f6626b == 0.0f && this.f6629e.d() == 0) {
            return true;
        }
        return false;
    }

    SolverVariable j(e eVar) {
        boolean z3;
        boolean z4;
        int d4 = this.f6629e.d();
        SolverVariable solverVariable = null;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z5 = false;
        boolean z6 = false;
        SolverVariable solverVariable2 = null;
        for (int i4 = 0; i4 < d4; i4++) {
            float m4 = this.f6629e.m(i4);
            SolverVariable j4 = this.f6629e.j(i4);
            if (j4.f6600N == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null) {
                    z4 = z(j4, eVar);
                } else if (f4 > m4) {
                    z4 = z(j4, eVar);
                } else if (!z5 && z(j4, eVar)) {
                    f4 = m4;
                    solverVariable = j4;
                    z5 = true;
                }
                z5 = z4;
                f4 = m4;
                solverVariable = j4;
            } else if (solverVariable == null && m4 < 0.0f) {
                if (solverVariable2 == null) {
                    z3 = z(j4, eVar);
                } else if (f5 > m4) {
                    z3 = z(j4, eVar);
                } else if (!z6 && z(j4, eVar)) {
                    f5 = m4;
                    solverVariable2 = j4;
                    z6 = true;
                }
                z6 = z3;
                f5 = m4;
                solverVariable2 = j4;
            }
        }
        if (solverVariable != null) {
            return solverVariable;
        }
        return solverVariable2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b k(SolverVariable solverVariable, SolverVariable solverVariable2, int i4, float f4, SolverVariable solverVariable3, SolverVariable solverVariable4, int i5) {
        if (solverVariable2 == solverVariable3) {
            this.f6629e.i(solverVariable, 1.0f);
            this.f6629e.i(solverVariable4, 1.0f);
            this.f6629e.i(solverVariable2, -2.0f);
            return this;
        }
        if (f4 == 0.5f) {
            this.f6629e.i(solverVariable, 1.0f);
            this.f6629e.i(solverVariable2, -1.0f);
            this.f6629e.i(solverVariable3, -1.0f);
            this.f6629e.i(solverVariable4, 1.0f);
            if (i4 > 0 || i5 > 0) {
                this.f6626b = (-i4) + i5;
            }
        } else if (f4 <= 0.0f) {
            this.f6629e.i(solverVariable, -1.0f);
            this.f6629e.i(solverVariable2, 1.0f);
            this.f6626b = i4;
        } else if (f4 >= 1.0f) {
            this.f6629e.i(solverVariable4, -1.0f);
            this.f6629e.i(solverVariable3, 1.0f);
            this.f6626b = -i5;
        } else {
            float f5 = 1.0f - f4;
            this.f6629e.i(solverVariable, f5 * 1.0f);
            this.f6629e.i(solverVariable2, f5 * (-1.0f));
            this.f6629e.i(solverVariable3, (-1.0f) * f4);
            this.f6629e.i(solverVariable4, 1.0f * f4);
            if (i4 > 0 || i5 > 0) {
                this.f6626b = ((-i4) * f5) + (i5 * f4);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b l(SolverVariable solverVariable, int i4) {
        this.f6625a = solverVariable;
        float f4 = i4;
        solverVariable.f6596J = f4;
        this.f6626b = f4;
        this.f6630f = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b m(SolverVariable solverVariable, SolverVariable solverVariable2, float f4) {
        this.f6629e.i(solverVariable, -1.0f);
        this.f6629e.i(solverVariable2, f4);
        return this;
    }

    public b n(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f4) {
        this.f6629e.i(solverVariable, -1.0f);
        this.f6629e.i(solverVariable2, 1.0f);
        this.f6629e.i(solverVariable3, f4);
        this.f6629e.i(solverVariable4, -f4);
        return this;
    }

    public b o(float f4, float f5, float f6, SolverVariable solverVariable, int i4, SolverVariable solverVariable2, int i5, SolverVariable solverVariable3, int i6, SolverVariable solverVariable4, int i7) {
        if (f5 != 0.0f && f4 != f6) {
            float f7 = (f4 / f5) / (f6 / f5);
            this.f6626b = ((-i4) - i5) + (i6 * f7) + (i7 * f7);
            this.f6629e.i(solverVariable, 1.0f);
            this.f6629e.i(solverVariable2, -1.0f);
            this.f6629e.i(solverVariable4, f7);
            this.f6629e.i(solverVariable3, -f7);
        } else {
            this.f6626b = ((-i4) - i5) + i6 + i7;
            this.f6629e.i(solverVariable, 1.0f);
            this.f6629e.i(solverVariable2, -1.0f);
            this.f6629e.i(solverVariable4, 1.0f);
            this.f6629e.i(solverVariable3, -1.0f);
        }
        return this;
    }

    public b p(float f4, float f5, float f6, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f6626b = 0.0f;
        if (f5 != 0.0f && f4 != f6) {
            if (f4 == 0.0f) {
                this.f6629e.i(solverVariable, 1.0f);
                this.f6629e.i(solverVariable2, -1.0f);
            } else if (f6 == 0.0f) {
                this.f6629e.i(solverVariable3, 1.0f);
                this.f6629e.i(solverVariable4, -1.0f);
            } else {
                float f7 = (f4 / f5) / (f6 / f5);
                this.f6629e.i(solverVariable, 1.0f);
                this.f6629e.i(solverVariable2, -1.0f);
                this.f6629e.i(solverVariable4, f7);
                this.f6629e.i(solverVariable3, -f7);
            }
        } else {
            this.f6629e.i(solverVariable, 1.0f);
            this.f6629e.i(solverVariable2, -1.0f);
            this.f6629e.i(solverVariable4, 1.0f);
            this.f6629e.i(solverVariable3, -1.0f);
        }
        return this;
    }

    public b q(SolverVariable solverVariable, int i4) {
        if (i4 < 0) {
            this.f6626b = i4 * (-1);
            this.f6629e.i(solverVariable, 1.0f);
        } else {
            this.f6626b = i4;
            this.f6629e.i(solverVariable, -1.0f);
        }
        return this;
    }

    public b r(SolverVariable solverVariable, SolverVariable solverVariable2, int i4) {
        boolean z3;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            } else {
                z3 = false;
            }
            this.f6626b = i4;
            if (z3) {
                this.f6629e.i(solverVariable, 1.0f);
                this.f6629e.i(solverVariable2, -1.0f);
                return this;
            }
        }
        this.f6629e.i(solverVariable, -1.0f);
        this.f6629e.i(solverVariable2, 1.0f);
        return this;
    }

    public b s(SolverVariable solverVariable, int i4, SolverVariable solverVariable2) {
        this.f6626b = i4;
        this.f6629e.i(solverVariable, -1.0f);
        return this;
    }

    public b t(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i4) {
        boolean z3;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            } else {
                z3 = false;
            }
            this.f6626b = i4;
            if (z3) {
                this.f6629e.i(solverVariable, 1.0f);
                this.f6629e.i(solverVariable2, -1.0f);
                this.f6629e.i(solverVariable3, -1.0f);
                return this;
            }
        }
        this.f6629e.i(solverVariable, -1.0f);
        this.f6629e.i(solverVariable2, 1.0f);
        this.f6629e.i(solverVariable3, 1.0f);
        return this;
    }

    public String toString() {
        return F();
    }

    public b u(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i4) {
        boolean z3;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            } else {
                z3 = false;
            }
            this.f6626b = i4;
            if (z3) {
                this.f6629e.i(solverVariable, 1.0f);
                this.f6629e.i(solverVariable2, -1.0f);
                this.f6629e.i(solverVariable3, 1.0f);
                return this;
            }
        }
        this.f6629e.i(solverVariable, -1.0f);
        this.f6629e.i(solverVariable2, 1.0f);
        this.f6629e.i(solverVariable3, -1.0f);
        return this;
    }

    public b v(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f4) {
        this.f6629e.i(solverVariable3, 0.5f);
        this.f6629e.i(solverVariable4, 0.5f);
        this.f6629e.i(solverVariable, -0.5f);
        this.f6629e.i(solverVariable2, -0.5f);
        this.f6626b = -f4;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        float f4 = this.f6626b;
        if (f4 < 0.0f) {
            this.f6626b = f4 * (-1.0f);
            this.f6629e.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        SolverVariable solverVariable = this.f6625a;
        if (solverVariable != null && (solverVariable.f6600N == SolverVariable.Type.UNRESTRICTED || this.f6626b >= 0.0f)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y(SolverVariable solverVariable) {
        return this.f6629e.g(solverVariable);
    }

    public b(c cVar) {
        this.f6629e = new androidx.constraintlayout.core.a(this, cVar);
    }
}
