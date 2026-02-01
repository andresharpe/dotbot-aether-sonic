package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class m extends ConstraintWidget {

    /* renamed from: B1, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f8301B1;

    public m() {
        this.f8301B1 = new ArrayList<>();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void Q1(int i4, int i5) {
        super.Q1(i4, i5);
        int size = this.f8301B1.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f8301B1.get(i6).Q1(Y(), Z());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void R0() {
        this.f8301B1.clear();
        super.R0();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void W0(androidx.constraintlayout.core.c cVar) {
        super.W0(cVar);
        int size = this.f8301B1.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f8301B1.get(i4).W0(cVar);
        }
    }

    public void b(ConstraintWidget constraintWidget) {
        this.f8301B1.add(constraintWidget);
        if (constraintWidget.U() != null) {
            ((m) constraintWidget.U()).o2(constraintWidget);
        }
        constraintWidget.S1(this);
    }

    public void k2(ConstraintWidget... constraintWidgetArr) {
        for (ConstraintWidget constraintWidget : constraintWidgetArr) {
            b(constraintWidget);
        }
    }

    public ArrayList<ConstraintWidget> l2() {
        return this.f8301B1;
    }

    public d m2() {
        d dVar;
        ConstraintWidget U3 = U();
        if (this instanceof d) {
            dVar = (d) this;
        } else {
            dVar = null;
        }
        while (U3 != null) {
            ConstraintWidget U4 = U3.U();
            if (U3 instanceof d) {
                dVar = (d) U3;
            }
            U3 = U4;
        }
        return dVar;
    }

    public void n2() {
        ArrayList<ConstraintWidget> arrayList = this.f8301B1;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget = this.f8301B1.get(i4);
            if (constraintWidget instanceof m) {
                ((m) constraintWidget).n2();
            }
        }
    }

    public void o2(ConstraintWidget constraintWidget) {
        this.f8301B1.remove(constraintWidget);
        constraintWidget.R0();
    }

    public void p2() {
        this.f8301B1.clear();
    }

    public m(int i4, int i5, int i6, int i7) {
        super(i4, i5, i6, i7);
        this.f8301B1 = new ArrayList<>();
    }

    public m(int i4, int i5) {
        super(i4, i5);
        this.f8301B1 = new ArrayList<>();
    }
}
