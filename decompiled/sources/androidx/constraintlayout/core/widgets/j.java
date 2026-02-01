package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;

/* loaded from: classes.dex */
public class j extends l {
    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.e eVar, boolean z3) {
        super.g(eVar, z3);
        if (this.f8266C1 > 0) {
            ConstraintWidget constraintWidget = this.f8265B1[0];
            constraintWidget.S0();
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.j(type, this, type);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.j(type2, this, type2);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.j(type3, this, type3);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.j(type4, this, type4);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.l
    public void v2(int i4, int i5, int i6, int i7) {
        int s22 = s2() + t2();
        int u22 = u2() + r2();
        boolean z3 = false;
        if (this.f8266C1 > 0) {
            s22 += this.f8265B1[0].m0();
            u22 += this.f8265B1[0].D();
        }
        int max = Math.max(Q(), s22);
        int max2 = Math.max(P(), u22);
        if (i4 != 1073741824) {
            if (i4 == Integer.MIN_VALUE) {
                i5 = Math.min(max, i5);
            } else if (i4 == 0) {
                i5 = max;
            } else {
                i5 = 0;
            }
        }
        if (i6 != 1073741824) {
            if (i6 == Integer.MIN_VALUE) {
                i7 = Math.min(max2, i7);
            } else if (i6 == 0) {
                i7 = max2;
            } else {
                i7 = 0;
            }
        }
        A2(i5, i7);
        c2(i5);
        y1(i7);
        if (this.f8266C1 > 0) {
            z3 = true;
        }
        z2(z3);
    }
}
