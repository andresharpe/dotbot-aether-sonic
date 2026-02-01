package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class e {

    /* renamed from: A, reason: collision with root package name */
    public static boolean f6635A = true;

    /* renamed from: B, reason: collision with root package name */
    public static boolean f6636B = false;

    /* renamed from: C, reason: collision with root package name */
    private static int f6637C = 1000;

    /* renamed from: D, reason: collision with root package name */
    public static f f6638D = null;

    /* renamed from: E, reason: collision with root package name */
    public static long f6639E = 0;

    /* renamed from: F, reason: collision with root package name */
    public static long f6640F = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f6641r = false;

    /* renamed from: s, reason: collision with root package name */
    public static final boolean f6642s = false;

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f6643t = false;

    /* renamed from: u, reason: collision with root package name */
    public static final boolean f6644u = false;

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f6645v = false;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f6646w = false;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f6647x = true;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f6648y = true;

    /* renamed from: z, reason: collision with root package name */
    public static boolean f6649z = true;

    /* renamed from: d, reason: collision with root package name */
    private a f6653d;

    /* renamed from: g, reason: collision with root package name */
    androidx.constraintlayout.core.b[] f6656g;

    /* renamed from: n, reason: collision with root package name */
    final c f6663n;

    /* renamed from: q, reason: collision with root package name */
    private a f6666q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6650a = false;

    /* renamed from: b, reason: collision with root package name */
    int f6651b = 0;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, SolverVariable> f6652c = null;

    /* renamed from: e, reason: collision with root package name */
    private int f6654e = 32;

    /* renamed from: f, reason: collision with root package name */
    private int f6655f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6657h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6658i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean[] f6659j = new boolean[32];

    /* renamed from: k, reason: collision with root package name */
    int f6660k = 1;

    /* renamed from: l, reason: collision with root package name */
    int f6661l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f6662m = 32;

    /* renamed from: o, reason: collision with root package name */
    private SolverVariable[] f6664o = new SolverVariable[f6637C];

    /* renamed from: p, reason: collision with root package name */
    private int f6665p = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a(e eVar, SolverVariable solverVariable, boolean z3);

        void b(e eVar);

        void c(e eVar, androidx.constraintlayout.core.b bVar, boolean z3);

        void clear();

        void d(a aVar);

        SolverVariable e(e eVar, boolean[] zArr);

        void f(SolverVariable solverVariable);

        SolverVariable getKey();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends androidx.constraintlayout.core.b {
        b(c cVar) {
            this.f6629e = new i(this, cVar);
        }
    }

    public e() {
        this.f6656g = null;
        this.f6656g = new androidx.constraintlayout.core.b[32];
        U();
        c cVar = new c();
        this.f6663n = cVar;
        this.f6653d = new h(cVar);
        if (f6636B) {
            this.f6666q = new b(cVar);
        } else {
            this.f6666q = new androidx.constraintlayout.core.b(cVar);
        }
    }

    private int C(a aVar) throws Exception {
        for (int i4 = 0; i4 < this.f6661l; i4++) {
            androidx.constraintlayout.core.b bVar = this.f6656g[i4];
            if (bVar.f6625a.f6600N != SolverVariable.Type.UNRESTRICTED && bVar.f6626b < 0.0f) {
                boolean z3 = false;
                int i5 = 0;
                while (!z3) {
                    f fVar = f6638D;
                    if (fVar != null) {
                        fVar.f6698o++;
                    }
                    i5++;
                    float f4 = Float.MAX_VALUE;
                    int i6 = 0;
                    int i7 = -1;
                    int i8 = -1;
                    int i9 = 0;
                    while (true) {
                        if (i6 >= this.f6661l) {
                            break;
                        }
                        androidx.constraintlayout.core.b bVar2 = this.f6656g[i6];
                        if (bVar2.f6625a.f6600N != SolverVariable.Type.UNRESTRICTED && !bVar2.f6630f && bVar2.f6626b < 0.0f) {
                            int i10 = 9;
                            if (f6635A) {
                                int d4 = bVar2.f6629e.d();
                                int i11 = 0;
                                while (i11 < d4) {
                                    SolverVariable j4 = bVar2.f6629e.j(i11);
                                    float o4 = bVar2.f6629e.o(j4);
                                    if (o4 > 0.0f) {
                                        int i12 = 0;
                                        while (i12 < i10) {
                                            float f5 = j4.f6598L[i12] / o4;
                                            if ((f5 < f4 && i12 == i9) || i12 > i9) {
                                                i9 = i12;
                                                i8 = j4.f6593G;
                                                i7 = i6;
                                                f4 = f5;
                                            }
                                            i12++;
                                            i10 = 9;
                                        }
                                    }
                                    i11++;
                                    i10 = 9;
                                }
                            } else {
                                for (int i13 = 1; i13 < this.f6660k; i13++) {
                                    SolverVariable solverVariable = this.f6663n.f6634d[i13];
                                    float o5 = bVar2.f6629e.o(solverVariable);
                                    if (o5 > 0.0f) {
                                        for (int i14 = 0; i14 < 9; i14++) {
                                            float f6 = solverVariable.f6598L[i14] / o5;
                                            if ((f6 < f4 && i14 == i9) || i14 > i9) {
                                                i9 = i14;
                                                i7 = i6;
                                                i8 = i13;
                                                f4 = f6;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i6++;
                    }
                    if (i7 != -1) {
                        androidx.constraintlayout.core.b bVar3 = this.f6656g[i7];
                        bVar3.f6625a.f6594H = -1;
                        f fVar2 = f6638D;
                        if (fVar2 != null) {
                            fVar2.f6697n++;
                        }
                        bVar3.C(this.f6663n.f6634d[i8]);
                        SolverVariable solverVariable2 = bVar3.f6625a;
                        solverVariable2.f6594H = i7;
                        solverVariable2.r(this, bVar3);
                    } else {
                        z3 = true;
                    }
                    if (i5 > this.f6660k / 2) {
                        z3 = true;
                    }
                }
                return i5;
            }
        }
        return 0;
    }

    private String F(int i4) {
        int i5 = i4 * 4;
        int i6 = i5 / 1024;
        int i7 = i6 / 1024;
        if (i7 > 0) {
            return i7 + " Mb";
        }
        if (i6 > 0) {
            return i6 + " Kb";
        }
        return i5 + " bytes";
    }

    private String G(int i4) {
        if (i4 == 1) {
            return "LOW";
        }
        if (i4 == 2) {
            return "MEDIUM";
        }
        if (i4 == 3) {
            return "HIGH";
        }
        if (i4 == 4) {
            return "HIGHEST";
        }
        if (i4 == 5) {
            return "EQUALITY";
        }
        if (i4 == 8) {
            return "FIXED";
        }
        if (i4 == 6) {
            return "BARRIER";
        }
        return "NONE";
    }

    public static f J() {
        return f6638D;
    }

    private void Q() {
        int i4 = this.f6654e * 2;
        this.f6654e = i4;
        this.f6656g = (androidx.constraintlayout.core.b[]) Arrays.copyOf(this.f6656g, i4);
        c cVar = this.f6663n;
        cVar.f6634d = (SolverVariable[]) Arrays.copyOf(cVar.f6634d, this.f6654e);
        int i5 = this.f6654e;
        this.f6659j = new boolean[i5];
        this.f6655f = i5;
        this.f6662m = i5;
        f fVar = f6638D;
        if (fVar != null) {
            fVar.f6691h++;
            fVar.f6703t = Math.max(fVar.f6703t, i5);
            f fVar2 = f6638D;
            fVar2.f6676J = fVar2.f6703t;
        }
    }

    private int T(a aVar, boolean z3) {
        f fVar = f6638D;
        if (fVar != null) {
            fVar.f6695l++;
        }
        for (int i4 = 0; i4 < this.f6660k; i4++) {
            this.f6659j[i4] = false;
        }
        boolean z4 = false;
        int i5 = 0;
        while (!z4) {
            f fVar2 = f6638D;
            if (fVar2 != null) {
                fVar2.f6696m++;
            }
            i5++;
            if (i5 >= this.f6660k * 2) {
                return i5;
            }
            if (aVar.getKey() != null) {
                this.f6659j[aVar.getKey().f6593G] = true;
            }
            SolverVariable e4 = aVar.e(this, this.f6659j);
            if (e4 != null) {
                boolean[] zArr = this.f6659j;
                int i6 = e4.f6593G;
                if (zArr[i6]) {
                    return i5;
                }
                zArr[i6] = true;
            }
            if (e4 != null) {
                float f4 = Float.MAX_VALUE;
                int i7 = -1;
                for (int i8 = 0; i8 < this.f6661l; i8++) {
                    androidx.constraintlayout.core.b bVar = this.f6656g[i8];
                    if (bVar.f6625a.f6600N != SolverVariable.Type.UNRESTRICTED && !bVar.f6630f && bVar.y(e4)) {
                        float o4 = bVar.f6629e.o(e4);
                        if (o4 < 0.0f) {
                            float f5 = (-bVar.f6626b) / o4;
                            if (f5 < f4) {
                                i7 = i8;
                                f4 = f5;
                            }
                        }
                    }
                }
                if (i7 > -1) {
                    androidx.constraintlayout.core.b bVar2 = this.f6656g[i7];
                    bVar2.f6625a.f6594H = -1;
                    f fVar3 = f6638D;
                    if (fVar3 != null) {
                        fVar3.f6697n++;
                    }
                    bVar2.C(e4);
                    SolverVariable solverVariable = bVar2.f6625a;
                    solverVariable.f6594H = i7;
                    solverVariable.r(this, bVar2);
                }
            } else {
                z4 = true;
            }
        }
        return i5;
    }

    private void U() {
        int i4 = 0;
        if (f6636B) {
            while (i4 < this.f6661l) {
                androidx.constraintlayout.core.b bVar = this.f6656g[i4];
                if (bVar != null) {
                    this.f6663n.f6631a.a(bVar);
                }
                this.f6656g[i4] = null;
                i4++;
            }
            return;
        }
        while (i4 < this.f6661l) {
            androidx.constraintlayout.core.b bVar2 = this.f6656g[i4];
            if (bVar2 != null) {
                this.f6663n.f6632b.a(bVar2);
            }
            this.f6656g[i4] = null;
            i4++;
        }
    }

    private SolverVariable a(SolverVariable.Type type, String str) {
        SolverVariable b4 = this.f6663n.f6633c.b();
        if (b4 == null) {
            b4 = new SolverVariable(type, str);
            b4.p(type, str);
        } else {
            b4.l();
            b4.p(type, str);
        }
        int i4 = this.f6665p;
        int i5 = f6637C;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f6637C = i6;
            this.f6664o = (SolverVariable[]) Arrays.copyOf(this.f6664o, i6);
        }
        SolverVariable[] solverVariableArr = this.f6664o;
        int i7 = this.f6665p;
        this.f6665p = i7 + 1;
        solverVariableArr[i7] = b4;
        return b4;
    }

    private void l(androidx.constraintlayout.core.b bVar) {
        int i4;
        if (f6648y && bVar.f6630f) {
            bVar.f6625a.m(this, bVar.f6626b);
        } else {
            androidx.constraintlayout.core.b[] bVarArr = this.f6656g;
            int i5 = this.f6661l;
            bVarArr[i5] = bVar;
            SolverVariable solverVariable = bVar.f6625a;
            solverVariable.f6594H = i5;
            this.f6661l = i5 + 1;
            solverVariable.r(this, bVar);
        }
        if (f6648y && this.f6650a) {
            int i6 = 0;
            while (i6 < this.f6661l) {
                if (this.f6656g[i6] == null) {
                    System.out.println("WTF");
                }
                androidx.constraintlayout.core.b bVar2 = this.f6656g[i6];
                if (bVar2 != null && bVar2.f6630f) {
                    bVar2.f6625a.m(this, bVar2.f6626b);
                    if (f6636B) {
                        this.f6663n.f6631a.a(bVar2);
                    } else {
                        this.f6663n.f6632b.a(bVar2);
                    }
                    this.f6656g[i6] = null;
                    int i7 = i6 + 1;
                    int i8 = i7;
                    while (true) {
                        i4 = this.f6661l;
                        if (i7 >= i4) {
                            break;
                        }
                        androidx.constraintlayout.core.b[] bVarArr2 = this.f6656g;
                        int i9 = i7 - 1;
                        androidx.constraintlayout.core.b bVar3 = bVarArr2[i7];
                        bVarArr2[i9] = bVar3;
                        SolverVariable solverVariable2 = bVar3.f6625a;
                        if (solverVariable2.f6594H == i7) {
                            solverVariable2.f6594H = i9;
                        }
                        i8 = i7;
                        i7++;
                    }
                    if (i8 < i4) {
                        this.f6656g[i8] = null;
                    }
                    this.f6661l = i4 - 1;
                    i6--;
                }
                i6++;
            }
            this.f6650a = false;
        }
    }

    private void p() {
        for (int i4 = 0; i4 < this.f6661l; i4++) {
            androidx.constraintlayout.core.b bVar = this.f6656g[i4];
            bVar.f6625a.f6596J = bVar.f6626b;
        }
    }

    public static androidx.constraintlayout.core.b u(e eVar, SolverVariable solverVariable, SolverVariable solverVariable2, float f4) {
        return eVar.t().m(solverVariable, solverVariable2, f4);
    }

    private SolverVariable w(String str, SolverVariable.Type type) {
        f fVar = f6638D;
        if (fVar != null) {
            fVar.f6699p++;
        }
        if (this.f6660k + 1 >= this.f6655f) {
            Q();
        }
        SolverVariable a4 = a(type, null);
        a4.n(str);
        int i4 = this.f6651b + 1;
        this.f6651b = i4;
        this.f6660k++;
        a4.f6593G = i4;
        if (this.f6652c == null) {
            this.f6652c = new HashMap<>();
        }
        this.f6652c.put(str, a4);
        this.f6663n.f6634d[this.f6651b] = a4;
        return a4;
    }

    private void y() {
        z();
        String str = "";
        for (int i4 = 0; i4 < this.f6661l; i4++) {
            str = (str + this.f6656g[i4]) + "\n";
        }
        System.out.println(str + this.f6653d + "\n");
    }

    private void z() {
        System.out.println("Display Rows (" + this.f6661l + "x" + this.f6660k + ")\n");
    }

    void A() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.f6654e; i5++) {
            androidx.constraintlayout.core.b bVar = this.f6656g[i5];
            if (bVar != null) {
                i4 += bVar.E();
            }
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.f6661l; i7++) {
            androidx.constraintlayout.core.b bVar2 = this.f6656g[i7];
            if (bVar2 != null) {
                i6 += bVar2.E();
            }
        }
        PrintStream printStream = System.out;
        int i8 = this.f6654e;
        printStream.println("Linear System -> Table size: " + i8 + " (" + F(i8 * i8) + ") -- row sizes: " + F(i4) + ", actual size: " + F(i6) + " rows: " + this.f6661l + "/" + this.f6662m + " cols: " + this.f6660k + "/" + this.f6655f + " 0 occupied cells, " + F(0));
    }

    public void B() {
        z();
        String str = "";
        for (int i4 = 0; i4 < this.f6661l; i4++) {
            androidx.constraintlayout.core.b bVar = this.f6656g[i4];
            if (bVar.f6625a.f6600N == SolverVariable.Type.UNRESTRICTED) {
                str = (str + bVar.F()) + "\n";
            }
        }
        System.out.println(str + this.f6653d + "\n");
    }

    public void D(f fVar) {
        f6638D = fVar;
    }

    public c E() {
        return this.f6663n;
    }

    a H() {
        return this.f6653d;
    }

    public int I() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.f6661l; i5++) {
            androidx.constraintlayout.core.b bVar = this.f6656g[i5];
            if (bVar != null) {
                i4 += bVar.E();
            }
        }
        return i4;
    }

    public int K() {
        return this.f6661l;
    }

    public int L() {
        return this.f6651b;
    }

    public int M(Object obj) {
        SolverVariable j4 = ((ConstraintAnchor) obj).j();
        if (j4 != null) {
            return (int) (j4.f6596J + 0.5f);
        }
        return 0;
    }

    androidx.constraintlayout.core.b N(int i4) {
        return this.f6656g[i4];
    }

    float O(String str) {
        SolverVariable P3 = P(str, SolverVariable.Type.UNRESTRICTED);
        if (P3 == null) {
            return 0.0f;
        }
        return P3.f6596J;
    }

    SolverVariable P(String str, SolverVariable.Type type) {
        if (this.f6652c == null) {
            this.f6652c = new HashMap<>();
        }
        SolverVariable solverVariable = this.f6652c.get(str);
        if (solverVariable == null) {
            return w(str, type);
        }
        return solverVariable;
    }

    public void R() throws Exception {
        f fVar = f6638D;
        if (fVar != null) {
            fVar.f6692i++;
        }
        if (this.f6653d.isEmpty()) {
            p();
            return;
        }
        if (!this.f6657h && !this.f6658i) {
            S(this.f6653d);
            return;
        }
        f fVar2 = f6638D;
        if (fVar2 != null) {
            fVar2.f6705v++;
        }
        for (int i4 = 0; i4 < this.f6661l; i4++) {
            if (!this.f6656g[i4].f6630f) {
                S(this.f6653d);
                return;
            }
        }
        f fVar3 = f6638D;
        if (fVar3 != null) {
            fVar3.f6704u++;
        }
        p();
    }

    void S(a aVar) throws Exception {
        f fVar = f6638D;
        if (fVar != null) {
            fVar.f6709z++;
            fVar.f6667A = Math.max(fVar.f6667A, this.f6660k);
            f fVar2 = f6638D;
            fVar2.f6668B = Math.max(fVar2.f6668B, this.f6661l);
        }
        C(aVar);
        T(aVar, false);
        p();
    }

    public void V(androidx.constraintlayout.core.b bVar) {
        SolverVariable solverVariable;
        int i4;
        if (bVar.f6630f && (solverVariable = bVar.f6625a) != null) {
            int i5 = solverVariable.f6594H;
            if (i5 != -1) {
                while (true) {
                    i4 = this.f6661l;
                    if (i5 >= i4 - 1) {
                        break;
                    }
                    androidx.constraintlayout.core.b[] bVarArr = this.f6656g;
                    int i6 = i5 + 1;
                    androidx.constraintlayout.core.b bVar2 = bVarArr[i6];
                    SolverVariable solverVariable2 = bVar2.f6625a;
                    if (solverVariable2.f6594H == i6) {
                        solverVariable2.f6594H = i5;
                    }
                    bVarArr[i5] = bVar2;
                    i5 = i6;
                }
                this.f6661l = i4 - 1;
            }
            SolverVariable solverVariable3 = bVar.f6625a;
            if (!solverVariable3.f6597K) {
                solverVariable3.m(this, bVar.f6626b);
            }
            if (f6636B) {
                this.f6663n.f6631a.a(bVar);
            } else {
                this.f6663n.f6632b.a(bVar);
            }
        }
    }

    public void W() {
        c cVar;
        int i4 = 0;
        while (true) {
            cVar = this.f6663n;
            SolverVariable[] solverVariableArr = cVar.f6634d;
            if (i4 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i4];
            if (solverVariable != null) {
                solverVariable.l();
            }
            i4++;
        }
        cVar.f6633c.c(this.f6664o, this.f6665p);
        this.f6665p = 0;
        Arrays.fill(this.f6663n.f6634d, (Object) null);
        HashMap<String, SolverVariable> hashMap = this.f6652c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f6651b = 0;
        this.f6653d.clear();
        this.f6660k = 1;
        for (int i5 = 0; i5 < this.f6661l; i5++) {
            androidx.constraintlayout.core.b bVar = this.f6656g[i5];
            if (bVar != null) {
                bVar.f6627c = false;
            }
        }
        U();
        this.f6661l = 0;
        if (f6636B) {
            this.f6666q = new b(this.f6663n);
        } else {
            this.f6666q = new androidx.constraintlayout.core.b(this.f6663n);
        }
    }

    public void b(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f4, int i4) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable s4 = s(constraintWidget.r(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable s5 = s(constraintWidget.r(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable s6 = s(constraintWidget.r(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable s7 = s(constraintWidget.r(type4));
        SolverVariable s8 = s(constraintWidget2.r(type));
        SolverVariable s9 = s(constraintWidget2.r(type2));
        SolverVariable s10 = s(constraintWidget2.r(type3));
        SolverVariable s11 = s(constraintWidget2.r(type4));
        androidx.constraintlayout.core.b t3 = t();
        double d4 = f4;
        double d5 = i4;
        t3.v(s5, s7, s9, s11, (float) (Math.sin(d4) * d5));
        d(t3);
        androidx.constraintlayout.core.b t4 = t();
        t4.v(s4, s6, s8, s10, (float) (Math.cos(d4) * d5));
        d(t4);
    }

    public void c(SolverVariable solverVariable, SolverVariable solverVariable2, int i4, float f4, SolverVariable solverVariable3, SolverVariable solverVariable4, int i5, int i6) {
        androidx.constraintlayout.core.b t3 = t();
        t3.k(solverVariable, solverVariable2, i4, f4, solverVariable3, solverVariable4, i5);
        if (i6 != 8) {
            t3.g(this, i6);
        }
        d(t3);
    }

    public void d(androidx.constraintlayout.core.b bVar) {
        SolverVariable A3;
        if (bVar == null) {
            return;
        }
        f fVar = f6638D;
        if (fVar != null) {
            fVar.f6693j++;
            if (bVar.f6630f) {
                fVar.f6694k++;
            }
        }
        boolean z3 = true;
        if (this.f6661l + 1 >= this.f6662m || this.f6660k + 1 >= this.f6655f) {
            Q();
        }
        if (!bVar.f6630f) {
            bVar.b(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.w();
            if (bVar.i(this)) {
                SolverVariable r4 = r();
                bVar.f6625a = r4;
                int i4 = this.f6661l;
                l(bVar);
                if (this.f6661l == i4 + 1) {
                    this.f6666q.d(bVar);
                    T(this.f6666q, true);
                    if (r4.f6594H == -1) {
                        if (bVar.f6625a == r4 && (A3 = bVar.A(r4)) != null) {
                            f fVar2 = f6638D;
                            if (fVar2 != null) {
                                fVar2.f6697n++;
                            }
                            bVar.C(A3);
                        }
                        if (!bVar.f6630f) {
                            bVar.f6625a.r(this, bVar);
                        }
                        if (f6636B) {
                            this.f6663n.f6631a.a(bVar);
                        } else {
                            this.f6663n.f6632b.a(bVar);
                        }
                        this.f6661l--;
                    }
                    if (!bVar.x() || z3) {
                        return;
                    }
                }
            }
            z3 = false;
            if (!bVar.x()) {
                return;
            } else {
                return;
            }
        }
        l(bVar);
    }

    public androidx.constraintlayout.core.b e(SolverVariable solverVariable, SolverVariable solverVariable2, int i4, int i5) {
        if (f6647x && i5 == 8 && solverVariable2.f6597K && solverVariable.f6594H == -1) {
            solverVariable.m(this, solverVariable2.f6596J + i4);
            return null;
        }
        androidx.constraintlayout.core.b t3 = t();
        t3.r(solverVariable, solverVariable2, i4);
        if (i5 != 8) {
            t3.g(this, i5);
        }
        d(t3);
        return t3;
    }

    public void f(SolverVariable solverVariable, int i4) {
        if (f6647x && solverVariable.f6594H == -1) {
            float f4 = i4;
            solverVariable.m(this, f4);
            for (int i5 = 0; i5 < this.f6651b + 1; i5++) {
                SolverVariable solverVariable2 = this.f6663n.f6634d[i5];
                if (solverVariable2 != null && solverVariable2.f6604R && solverVariable2.f6605S == solverVariable.f6593G) {
                    solverVariable2.m(this, solverVariable2.f6606T + f4);
                }
            }
            return;
        }
        int i6 = solverVariable.f6594H;
        if (i6 != -1) {
            androidx.constraintlayout.core.b bVar = this.f6656g[i6];
            if (bVar.f6630f) {
                bVar.f6626b = i4;
                return;
            }
            if (bVar.f6629e.d() == 0) {
                bVar.f6630f = true;
                bVar.f6626b = i4;
                return;
            } else {
                androidx.constraintlayout.core.b t3 = t();
                t3.q(solverVariable, i4);
                d(t3);
                return;
            }
        }
        androidx.constraintlayout.core.b t4 = t();
        t4.l(solverVariable, i4);
        d(t4);
    }

    public void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i4, boolean z3) {
        androidx.constraintlayout.core.b t3 = t();
        SolverVariable v3 = v();
        v3.f6595I = 0;
        t3.t(solverVariable, solverVariable2, v3, i4);
        d(t3);
    }

    public void h(SolverVariable solverVariable, SolverVariable solverVariable2, int i4, int i5) {
        androidx.constraintlayout.core.b t3 = t();
        SolverVariable v3 = v();
        v3.f6595I = 0;
        t3.t(solverVariable, solverVariable2, v3, i4);
        if (i5 != 8) {
            m(t3, (int) (t3.f6629e.o(v3) * (-1.0f)), i5);
        }
        d(t3);
    }

    public void i(SolverVariable solverVariable, SolverVariable solverVariable2, int i4, boolean z3) {
        androidx.constraintlayout.core.b t3 = t();
        SolverVariable v3 = v();
        v3.f6595I = 0;
        t3.u(solverVariable, solverVariable2, v3, i4);
        d(t3);
    }

    public void j(SolverVariable solverVariable, SolverVariable solverVariable2, int i4, int i5) {
        androidx.constraintlayout.core.b t3 = t();
        SolverVariable v3 = v();
        v3.f6595I = 0;
        t3.u(solverVariable, solverVariable2, v3, i4);
        if (i5 != 8) {
            m(t3, (int) (t3.f6629e.o(v3) * (-1.0f)), i5);
        }
        d(t3);
    }

    public void k(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f4, int i4) {
        androidx.constraintlayout.core.b t3 = t();
        t3.n(solverVariable, solverVariable2, solverVariable3, solverVariable4, f4);
        if (i4 != 8) {
            t3.g(this, i4);
        }
        d(t3);
    }

    void m(androidx.constraintlayout.core.b bVar, int i4, int i5) {
        bVar.h(q(i5, null), i4);
    }

    public void n(SolverVariable solverVariable, SolverVariable solverVariable2, int i4) {
        if (solverVariable.f6594H == -1 && i4 == 0) {
            if (solverVariable2.f6604R) {
                solverVariable2 = this.f6663n.f6634d[solverVariable2.f6605S];
            }
            if (solverVariable.f6604R) {
                SolverVariable solverVariable3 = this.f6663n.f6634d[solverVariable.f6605S];
                return;
            } else {
                solverVariable.o(this, solverVariable2, 0.0f);
                return;
            }
        }
        e(solverVariable, solverVariable2, i4, 8);
    }

    final void o() {
        int i4;
        int i5 = 0;
        while (i5 < this.f6661l) {
            androidx.constraintlayout.core.b bVar = this.f6656g[i5];
            if (bVar.f6629e.d() == 0) {
                bVar.f6630f = true;
            }
            if (bVar.f6630f) {
                SolverVariable solverVariable = bVar.f6625a;
                solverVariable.f6596J = bVar.f6626b;
                solverVariable.k(bVar);
                int i6 = i5;
                while (true) {
                    i4 = this.f6661l;
                    if (i6 >= i4 - 1) {
                        break;
                    }
                    androidx.constraintlayout.core.b[] bVarArr = this.f6656g;
                    int i7 = i6 + 1;
                    bVarArr[i6] = bVarArr[i7];
                    i6 = i7;
                }
                this.f6656g[i4 - 1] = null;
                this.f6661l = i4 - 1;
                i5--;
                if (f6636B) {
                    this.f6663n.f6631a.a(bVar);
                } else {
                    this.f6663n.f6632b.a(bVar);
                }
            }
            i5++;
        }
    }

    public SolverVariable q(int i4, String str) {
        f fVar = f6638D;
        if (fVar != null) {
            fVar.f6700q++;
        }
        if (this.f6660k + 1 >= this.f6655f) {
            Q();
        }
        SolverVariable a4 = a(SolverVariable.Type.ERROR, str);
        int i5 = this.f6651b + 1;
        this.f6651b = i5;
        this.f6660k++;
        a4.f6593G = i5;
        a4.f6595I = i4;
        this.f6663n.f6634d[i5] = a4;
        this.f6653d.f(a4);
        return a4;
    }

    public SolverVariable r() {
        f fVar = f6638D;
        if (fVar != null) {
            fVar.f6702s++;
        }
        if (this.f6660k + 1 >= this.f6655f) {
            Q();
        }
        SolverVariable a4 = a(SolverVariable.Type.SLACK, null);
        int i4 = this.f6651b + 1;
        this.f6651b = i4;
        this.f6660k++;
        a4.f6593G = i4;
        this.f6663n.f6634d[i4] = a4;
        return a4;
    }

    public SolverVariable s(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f6660k + 1 >= this.f6655f) {
            Q();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.j();
            if (solverVariable == null) {
                constraintAnchor.z(this.f6663n);
                solverVariable = constraintAnchor.j();
            }
            int i4 = solverVariable.f6593G;
            if (i4 == -1 || i4 > this.f6651b || this.f6663n.f6634d[i4] == null) {
                if (i4 != -1) {
                    solverVariable.l();
                }
                int i5 = this.f6651b + 1;
                this.f6651b = i5;
                this.f6660k++;
                solverVariable.f6593G = i5;
                solverVariable.f6600N = SolverVariable.Type.UNRESTRICTED;
                this.f6663n.f6634d[i5] = solverVariable;
            }
        }
        return solverVariable;
    }

    public androidx.constraintlayout.core.b t() {
        androidx.constraintlayout.core.b b4;
        if (f6636B) {
            b4 = this.f6663n.f6631a.b();
            if (b4 == null) {
                b4 = new b(this.f6663n);
                f6640F++;
            } else {
                b4.D();
            }
        } else {
            b4 = this.f6663n.f6632b.b();
            if (b4 == null) {
                b4 = new androidx.constraintlayout.core.b(this.f6663n);
                f6639E++;
            } else {
                b4.D();
            }
        }
        SolverVariable.j();
        return b4;
    }

    public SolverVariable v() {
        f fVar = f6638D;
        if (fVar != null) {
            fVar.f6701r++;
        }
        if (this.f6660k + 1 >= this.f6655f) {
            Q();
        }
        SolverVariable a4 = a(SolverVariable.Type.SLACK, null);
        int i4 = this.f6651b + 1;
        this.f6651b = i4;
        this.f6660k++;
        a4.f6593G = i4;
        this.f6663n.f6634d[i4] = a4;
        return a4;
    }

    public void x() {
        z();
        String str = " num vars " + this.f6651b + "\n";
        for (int i4 = 0; i4 < this.f6651b + 1; i4++) {
            SolverVariable solverVariable = this.f6663n.f6634d[i4];
            if (solverVariable != null && solverVariable.f6597K) {
                str = str + " $[" + i4 + "] => " + solverVariable + " = " + solverVariable.f6596J + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i5 = 0; i5 < this.f6651b + 1; i5++) {
            SolverVariable[] solverVariableArr = this.f6663n.f6634d;
            SolverVariable solverVariable2 = solverVariableArr[i5];
            if (solverVariable2 != null && solverVariable2.f6604R) {
                str2 = str2 + " ~[" + i5 + "] => " + solverVariable2 + " = " + solverVariableArr[solverVariable2.f6605S] + " + " + solverVariable2.f6606T + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i6 = 0; i6 < this.f6661l; i6++) {
            str3 = (str3 + this.f6656g[i6].F()) + "\n #  ";
        }
        a aVar = this.f6653d;
        if (aVar != null) {
            str3 = str3 + "Goal: " + aVar + "\n";
        }
        System.out.println(str3);
    }
}
