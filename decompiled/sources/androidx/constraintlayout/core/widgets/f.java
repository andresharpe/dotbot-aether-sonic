package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes.dex */
public class f extends ConstraintWidget {

    /* renamed from: J1, reason: collision with root package name */
    public static final int f8250J1 = 0;

    /* renamed from: K1, reason: collision with root package name */
    public static final int f8251K1 = 1;

    /* renamed from: L1, reason: collision with root package name */
    public static final int f8252L1 = 0;

    /* renamed from: M1, reason: collision with root package name */
    public static final int f8253M1 = 1;

    /* renamed from: N1, reason: collision with root package name */
    public static final int f8254N1 = 2;

    /* renamed from: O1, reason: collision with root package name */
    public static final int f8255O1 = -1;

    /* renamed from: B1, reason: collision with root package name */
    protected float f8256B1 = -1.0f;

    /* renamed from: C1, reason: collision with root package name */
    protected int f8257C1 = -1;

    /* renamed from: D1, reason: collision with root package name */
    protected int f8258D1 = -1;

    /* renamed from: E1, reason: collision with root package name */
    protected boolean f8259E1 = true;

    /* renamed from: F1, reason: collision with root package name */
    private ConstraintAnchor f8260F1 = this.f7957R;

    /* renamed from: G1, reason: collision with root package name */
    private int f8261G1 = 0;

    /* renamed from: H1, reason: collision with root package name */
    private int f8262H1 = 0;

    /* renamed from: I1, reason: collision with root package name */
    private boolean f8263I1;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8264a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f8264a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8264a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8264a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8264a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8264a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8264a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8264a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8264a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8264a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public f() {
        this.f7968Z.clear();
        this.f7968Z.add(this.f8260F1);
        int length = this.f7967Y.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f7967Y[i4] = this.f8260F1;
        }
    }

    public void A2(int i4) {
        z2(i4 / 100.0f);
    }

    public void B2(int i4) {
        this.f8262H1 = i4;
    }

    public void C2(int i4) {
        if (this.f8261G1 == i4) {
            return;
        }
        this.f8261G1 = i4;
        this.f7968Z.clear();
        if (this.f8261G1 == 1) {
            this.f8260F1 = this.f7955Q;
        } else {
            this.f8260F1 = this.f7957R;
        }
        this.f7968Z.add(this.f8260F1);
        int length = this.f7967Y.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.f7967Y[i5] = this.f8260F1;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean G0() {
        return this.f8263I1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean H0() {
        return this.f8263I1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String f0() {
        return "Guideline";
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.e eVar, boolean z3) {
        boolean z4;
        d dVar = (d) U();
        if (dVar == null) {
            return;
        }
        ConstraintAnchor r4 = dVar.r(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor r5 = dVar.r(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.f7974c0;
        boolean z5 = true;
        if (constraintWidget != null && constraintWidget.f7972b0[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f8261G1 == 0) {
            r4 = dVar.r(ConstraintAnchor.Type.TOP);
            r5 = dVar.r(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.f7974c0;
            if (constraintWidget2 == null || constraintWidget2.f7972b0[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z5 = false;
            }
            z4 = z5;
        }
        if (this.f8263I1 && this.f8260F1.o()) {
            SolverVariable s4 = eVar.s(this.f8260F1);
            eVar.f(s4, this.f8260F1.f());
            if (this.f8257C1 != -1) {
                if (z4) {
                    eVar.h(eVar.s(r5), s4, 0, 5);
                }
            } else if (this.f8258D1 != -1 && z4) {
                SolverVariable s5 = eVar.s(r5);
                eVar.h(s4, eVar.s(r4), 0, 5);
                eVar.h(s5, s4, 0, 5);
            }
            this.f8263I1 = false;
            return;
        }
        if (this.f8257C1 != -1) {
            SolverVariable s6 = eVar.s(this.f8260F1);
            eVar.e(s6, eVar.s(r4), this.f8257C1, 8);
            if (z4) {
                eVar.h(eVar.s(r5), s6, 0, 5);
                return;
            }
            return;
        }
        if (this.f8258D1 != -1) {
            SolverVariable s7 = eVar.s(this.f8260F1);
            SolverVariable s8 = eVar.s(r5);
            eVar.e(s7, s8, -this.f8258D1, 8);
            if (z4) {
                eVar.h(s7, eVar.s(r4), 0, 5);
                eVar.h(s8, s7, 0, 5);
                return;
            }
            return;
        }
        if (this.f8256B1 != -1.0f) {
            eVar.d(androidx.constraintlayout.core.e.u(eVar, eVar.s(this.f8260F1), eVar.s(r5), this.f8256B1));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean h() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void j2(androidx.constraintlayout.core.e eVar, boolean z3) {
        if (U() == null) {
            return;
        }
        int M3 = eVar.M(this.f8260F1);
        if (this.f8261G1 == 1) {
            f2(M3);
            g2(0);
            y1(U().D());
            c2(0);
            return;
        }
        f2(0);
        g2(M3);
        c2(U().m0());
        y1(0);
    }

    public void k2() {
        if (this.f8257C1 != -1) {
            u2();
        } else if (this.f8256B1 != -1.0f) {
            t2();
        } else if (this.f8258D1 != -1) {
            s2();
        }
    }

    public ConstraintAnchor l2() {
        return this.f8260F1;
    }

    public int m2() {
        return this.f8262H1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.n(constraintWidget, hashMap);
        f fVar = (f) constraintWidget;
        this.f8256B1 = fVar.f8256B1;
        this.f8257C1 = fVar.f8257C1;
        this.f8258D1 = fVar.f8258D1;
        this.f8259E1 = fVar.f8259E1;
        C2(fVar.f8261G1);
    }

    public int n2() {
        return this.f8261G1;
    }

    public int o2() {
        return this.f8257C1;
    }

    public int p2() {
        if (this.f8256B1 != -1.0f) {
            return 0;
        }
        if (this.f8257C1 != -1) {
            return 1;
        }
        if (this.f8258D1 == -1) {
            return -1;
        }
        return 2;
    }

    public int q2() {
        return this.f8258D1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public ConstraintAnchor r(ConstraintAnchor.Type type) {
        int i4 = a.f8264a[type.ordinal()];
        if (i4 != 1 && i4 != 2) {
            if ((i4 == 3 || i4 == 4) && this.f8261G1 == 0) {
                return this.f8260F1;
            }
            return null;
        }
        if (this.f8261G1 == 1) {
            return this.f8260F1;
        }
        return null;
    }

    public float r2() {
        return this.f8256B1;
    }

    void s2() {
        int o02 = o0();
        if (this.f8261G1 == 0) {
            o02 = p0();
        }
        x2(o02);
    }

    void t2() {
        int m02 = U().m0() - o0();
        if (this.f8261G1 == 0) {
            m02 = U().D() - p0();
        }
        y2(m02);
    }

    void u2() {
        float o02 = o0() / U().m0();
        if (this.f8261G1 == 0) {
            o02 = p0() / U().D();
        }
        z2(o02);
    }

    public boolean v2() {
        if (this.f8256B1 != -1.0f && this.f8257C1 == -1 && this.f8258D1 == -1) {
            return true;
        }
        return false;
    }

    public void w2(int i4) {
        this.f8260F1.A(i4);
        this.f8263I1 = true;
    }

    public void x2(int i4) {
        if (i4 > -1) {
            this.f8256B1 = -1.0f;
            this.f8257C1 = i4;
            this.f8258D1 = -1;
        }
    }

    public void y2(int i4) {
        if (i4 > -1) {
            this.f8256B1 = -1.0f;
            this.f8257C1 = -1;
            this.f8258D1 = i4;
        }
    }

    public void z2(float f4) {
        if (f4 > -1.0f) {
            this.f8256B1 = f4;
            this.f8257C1 = -1;
            this.f8258D1 = -1;
        }
    }
}
