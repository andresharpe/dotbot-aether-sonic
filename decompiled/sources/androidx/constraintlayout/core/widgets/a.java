package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a extends h {

    /* renamed from: H1, reason: collision with root package name */
    public static final int f8023H1 = 0;

    /* renamed from: I1, reason: collision with root package name */
    public static final int f8024I1 = 1;

    /* renamed from: J1, reason: collision with root package name */
    public static final int f8025J1 = 2;

    /* renamed from: K1, reason: collision with root package name */
    public static final int f8026K1 = 3;

    /* renamed from: L1, reason: collision with root package name */
    private static final boolean f8027L1 = true;

    /* renamed from: M1, reason: collision with root package name */
    private static final boolean f8028M1 = false;

    /* renamed from: D1, reason: collision with root package name */
    private int f8029D1 = 0;

    /* renamed from: E1, reason: collision with root package name */
    private boolean f8030E1 = true;

    /* renamed from: F1, reason: collision with root package name */
    private int f8031F1 = 0;

    /* renamed from: G1, reason: collision with root package name */
    boolean f8032G1 = false;

    public a() {
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean G0() {
        return this.f8032G1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean H0() {
        return this.f8032G1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.e eVar, boolean z3) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ConstraintAnchor[] constraintAnchorArr2 = this.f7967Y;
        constraintAnchorArr2[0] = this.f7955Q;
        constraintAnchorArr2[2] = this.f7957R;
        constraintAnchorArr2[1] = this.f7959S;
        constraintAnchorArr2[3] = this.f7961T;
        int i9 = 0;
        while (true) {
            constraintAnchorArr = this.f7967Y;
            if (i9 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i9];
            constraintAnchor.f7888i = eVar.s(constraintAnchor);
            i9++;
        }
        int i10 = this.f8029D1;
        if (i10 >= 0 && i10 < 4) {
            ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i10];
            if (!this.f8032G1) {
                m2();
            }
            if (this.f8032G1) {
                this.f8032G1 = false;
                int i11 = this.f8029D1;
                if (i11 != 0 && i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        eVar.f(this.f7957R.f7888i, this.f7986i0);
                        eVar.f(this.f7961T.f7888i, this.f7986i0);
                        return;
                    }
                    return;
                }
                eVar.f(this.f7955Q.f7888i, this.f7984h0);
                eVar.f(this.f7959S.f7888i, this.f7984h0);
                return;
            }
            for (int i12 = 0; i12 < this.f8266C1; i12++) {
                ConstraintWidget constraintWidget = this.f8265B1[i12];
                if ((this.f8030E1 || constraintWidget.h()) && ((((i7 = this.f8029D1) == 0 || i7 == 1) && constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f7955Q.f7885f != null && constraintWidget.f7959S.f7885f != null) || (((i8 = this.f8029D1) == 2 || i8 == 3) && constraintWidget.j0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f7957R.f7885f != null && constraintWidget.f7961T.f7885f != null))) {
                    z4 = true;
                    break;
                }
            }
            z4 = false;
            if (!this.f7955Q.m() && !this.f7959S.m()) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!this.f7957R.m() && !this.f7961T.m()) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (!z4 && (((i6 = this.f8029D1) == 0 && z5) || ((i6 == 2 && z6) || ((i6 == 1 && z5) || (i6 == 3 && z6))))) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                i4 = 4;
            } else {
                i4 = 5;
            }
            for (int i13 = 0; i13 < this.f8266C1; i13++) {
                ConstraintWidget constraintWidget2 = this.f8265B1[i13];
                if (this.f8030E1 || constraintWidget2.h()) {
                    SolverVariable s4 = eVar.s(constraintWidget2.f7967Y[this.f8029D1]);
                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.f7967Y;
                    int i14 = this.f8029D1;
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i14];
                    constraintAnchor3.f7888i = s4;
                    ConstraintAnchor constraintAnchor4 = constraintAnchor3.f7885f;
                    if (constraintAnchor4 != null && constraintAnchor4.f7883d == this) {
                        i5 = constraintAnchor3.f7886g;
                    } else {
                        i5 = 0;
                    }
                    if (i14 != 0 && i14 != 2) {
                        eVar.g(constraintAnchor2.f7888i, s4, this.f8031F1 + i5, z4);
                    } else {
                        eVar.i(constraintAnchor2.f7888i, s4, this.f8031F1 - i5, z4);
                    }
                    eVar.e(constraintAnchor2.f7888i, s4, this.f8031F1 + i5, i4);
                }
            }
            int i15 = this.f8029D1;
            if (i15 == 0) {
                eVar.e(this.f7959S.f7888i, this.f7955Q.f7888i, 0, 8);
                eVar.e(this.f7955Q.f7888i, this.f7974c0.f7959S.f7888i, 0, 4);
                eVar.e(this.f7955Q.f7888i, this.f7974c0.f7955Q.f7888i, 0, 0);
                return;
            }
            if (i15 == 1) {
                eVar.e(this.f7955Q.f7888i, this.f7959S.f7888i, 0, 8);
                eVar.e(this.f7955Q.f7888i, this.f7974c0.f7955Q.f7888i, 0, 4);
                eVar.e(this.f7955Q.f7888i, this.f7974c0.f7959S.f7888i, 0, 0);
            } else if (i15 == 2) {
                eVar.e(this.f7961T.f7888i, this.f7957R.f7888i, 0, 8);
                eVar.e(this.f7957R.f7888i, this.f7974c0.f7961T.f7888i, 0, 4);
                eVar.e(this.f7957R.f7888i, this.f7974c0.f7957R.f7888i, 0, 0);
            } else if (i15 == 3) {
                eVar.e(this.f7957R.f7888i, this.f7961T.f7888i, 0, 8);
                eVar.e(this.f7957R.f7888i, this.f7974c0.f7957R.f7888i, 0, 4);
                eVar.e(this.f7957R.f7888i, this.f7974c0.f7961T.f7888i, 0, 0);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean h() {
        return true;
    }

    public boolean m2() {
        int i4;
        int i5;
        int i6;
        boolean z3 = true;
        int i7 = 0;
        while (true) {
            i4 = this.f8266C1;
            if (i7 >= i4) {
                break;
            }
            ConstraintWidget constraintWidget = this.f8265B1[i7];
            if ((this.f8030E1 || constraintWidget.h()) && ((((i5 = this.f8029D1) == 0 || i5 == 1) && !constraintWidget.G0()) || (((i6 = this.f8029D1) == 2 || i6 == 3) && !constraintWidget.H0()))) {
                z3 = false;
            }
            i7++;
        }
        if (!z3 || i4 <= 0) {
            return false;
        }
        int i8 = 0;
        boolean z4 = false;
        for (int i9 = 0; i9 < this.f8266C1; i9++) {
            ConstraintWidget constraintWidget2 = this.f8265B1[i9];
            if (this.f8030E1 || constraintWidget2.h()) {
                if (!z4) {
                    int i10 = this.f8029D1;
                    if (i10 == 0) {
                        i8 = constraintWidget2.r(ConstraintAnchor.Type.LEFT).f();
                    } else if (i10 == 1) {
                        i8 = constraintWidget2.r(ConstraintAnchor.Type.RIGHT).f();
                    } else if (i10 == 2) {
                        i8 = constraintWidget2.r(ConstraintAnchor.Type.TOP).f();
                    } else if (i10 == 3) {
                        i8 = constraintWidget2.r(ConstraintAnchor.Type.BOTTOM).f();
                    }
                    z4 = true;
                }
                int i11 = this.f8029D1;
                if (i11 == 0) {
                    i8 = Math.min(i8, constraintWidget2.r(ConstraintAnchor.Type.LEFT).f());
                } else if (i11 == 1) {
                    i8 = Math.max(i8, constraintWidget2.r(ConstraintAnchor.Type.RIGHT).f());
                } else if (i11 == 2) {
                    i8 = Math.min(i8, constraintWidget2.r(ConstraintAnchor.Type.TOP).f());
                } else if (i11 == 3) {
                    i8 = Math.max(i8, constraintWidget2.r(ConstraintAnchor.Type.BOTTOM).f());
                }
            }
        }
        int i12 = i8 + this.f8031F1;
        int i13 = this.f8029D1;
        if (i13 != 0 && i13 != 1) {
            t1(i12, i12);
        } else {
            q1(i12, i12);
        }
        this.f8032G1 = true;
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.h, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.n(constraintWidget, hashMap);
        a aVar = (a) constraintWidget;
        this.f8029D1 = aVar.f8029D1;
        this.f8030E1 = aVar.f8030E1;
        this.f8031F1 = aVar.f8031F1;
    }

    @Deprecated
    public boolean n2() {
        return this.f8030E1;
    }

    public boolean o2() {
        return this.f8030E1;
    }

    public int p2() {
        return this.f8029D1;
    }

    public int q2() {
        return this.f8031F1;
    }

    public int r2() {
        int i4 = this.f8029D1;
        if (i4 != 0 && i4 != 1) {
            if (i4 == 2 || i4 == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s2() {
        for (int i4 = 0; i4 < this.f8266C1; i4++) {
            ConstraintWidget constraintWidget = this.f8265B1[i4];
            if (this.f8030E1 || constraintWidget.h()) {
                int i5 = this.f8029D1;
                if (i5 != 0 && i5 != 1) {
                    if (i5 == 2 || i5 == 3) {
                        constraintWidget.G1(1, true);
                    }
                } else {
                    constraintWidget.G1(0, true);
                }
            }
        }
    }

    public void t2(boolean z3) {
        this.f8030E1 = z3;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String str = "[Barrier] " + y() + " {";
        for (int i4 = 0; i4 < this.f8266C1; i4++) {
            ConstraintWidget constraintWidget = this.f8265B1[i4];
            if (i4 > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.y();
        }
        return str + "}";
    }

    public void u2(int i4) {
        this.f8029D1 = i4;
    }

    public void v2(int i4) {
        this.f8031F1 = i4;
    }

    public a(String str) {
        j1(str);
    }
}
