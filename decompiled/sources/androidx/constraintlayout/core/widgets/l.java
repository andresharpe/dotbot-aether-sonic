package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import java.util.HashSet;

/* loaded from: classes.dex */
public class l extends h {

    /* renamed from: D1, reason: collision with root package name */
    private int f8288D1 = 0;

    /* renamed from: E1, reason: collision with root package name */
    private int f8289E1 = 0;

    /* renamed from: F1, reason: collision with root package name */
    private int f8290F1 = 0;

    /* renamed from: G1, reason: collision with root package name */
    private int f8291G1 = 0;

    /* renamed from: H1, reason: collision with root package name */
    private int f8292H1 = 0;

    /* renamed from: I1, reason: collision with root package name */
    private int f8293I1 = 0;

    /* renamed from: J1, reason: collision with root package name */
    private int f8294J1 = 0;

    /* renamed from: K1, reason: collision with root package name */
    private int f8295K1 = 0;

    /* renamed from: L1, reason: collision with root package name */
    private boolean f8296L1 = false;

    /* renamed from: M1, reason: collision with root package name */
    private int f8297M1 = 0;

    /* renamed from: N1, reason: collision with root package name */
    private int f8298N1 = 0;

    /* renamed from: O1, reason: collision with root package name */
    protected b.a f8299O1 = new b.a();

    /* renamed from: P1, reason: collision with root package name */
    b.InterfaceC0060b f8300P1 = null;

    public void A2(int i4, int i5) {
        this.f8297M1 = i4;
        this.f8298N1 = i5;
    }

    public void B2(int i4) {
        this.f8290F1 = i4;
        this.f8288D1 = i4;
        this.f8291G1 = i4;
        this.f8289E1 = i4;
        this.f8292H1 = i4;
        this.f8293I1 = i4;
    }

    public void C2(int i4) {
        this.f8289E1 = i4;
    }

    public void D2(int i4) {
        this.f8293I1 = i4;
    }

    public void E2(int i4) {
        this.f8290F1 = i4;
        this.f8294J1 = i4;
    }

    public void F2(int i4) {
        this.f8291G1 = i4;
        this.f8295K1 = i4;
    }

    public void G2(int i4) {
        this.f8292H1 = i4;
        this.f8294J1 = i4;
        this.f8295K1 = i4;
    }

    public void H2(int i4) {
        this.f8288D1 = i4;
    }

    @Override // androidx.constraintlayout.core.widgets.h, androidx.constraintlayout.core.widgets.g
    public void c(d dVar) {
        n2();
    }

    public void m2(boolean z3) {
        int i4 = this.f8292H1;
        if (i4 > 0 || this.f8293I1 > 0) {
            if (z3) {
                this.f8294J1 = this.f8293I1;
                this.f8295K1 = i4;
            } else {
                this.f8294J1 = i4;
                this.f8295K1 = this.f8293I1;
            }
        }
    }

    public void n2() {
        for (int i4 = 0; i4 < this.f8266C1; i4++) {
            ConstraintWidget constraintWidget = this.f8265B1[i4];
            if (constraintWidget != null) {
                constraintWidget.I1(true);
            }
        }
    }

    public boolean o2(HashSet<ConstraintWidget> hashSet) {
        for (int i4 = 0; i4 < this.f8266C1; i4++) {
            if (hashSet.contains(this.f8265B1[i4])) {
                return true;
            }
        }
        return false;
    }

    public int p2() {
        return this.f8298N1;
    }

    public int q2() {
        return this.f8297M1;
    }

    public int r2() {
        return this.f8289E1;
    }

    public int s2() {
        return this.f8294J1;
    }

    public int t2() {
        return this.f8295K1;
    }

    public int u2() {
        return this.f8288D1;
    }

    public void v2(int i4, int i5, int i6, int i7) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void w2(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i4, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i5) {
        while (this.f8300P1 == null && U() != null) {
            this.f8300P1 = ((d) U()).G2();
        }
        b.a aVar = this.f8299O1;
        aVar.f8048a = dimensionBehaviour;
        aVar.f8049b = dimensionBehaviour2;
        aVar.f8050c = i4;
        aVar.f8051d = i5;
        this.f8300P1.b(constraintWidget, aVar);
        constraintWidget.c2(this.f8299O1.f8052e);
        constraintWidget.y1(this.f8299O1.f8053f);
        constraintWidget.x1(this.f8299O1.f8055h);
        constraintWidget.g1(this.f8299O1.f8054g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean x2() {
        b.InterfaceC0060b interfaceC0060b;
        ConstraintWidget constraintWidget = this.f7974c0;
        if (constraintWidget != null) {
            interfaceC0060b = ((d) constraintWidget).G2();
        } else {
            interfaceC0060b = null;
        }
        if (interfaceC0060b == null) {
            return false;
        }
        for (int i4 = 0; i4 < this.f8266C1; i4++) {
            ConstraintWidget constraintWidget2 = this.f8265B1[i4];
            if (constraintWidget2 != null && !(constraintWidget2 instanceof f)) {
                ConstraintWidget.DimensionBehaviour z3 = constraintWidget2.z(0);
                ConstraintWidget.DimensionBehaviour z4 = constraintWidget2.z(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (z3 != dimensionBehaviour || constraintWidget2.f8013w == 1 || z4 != dimensionBehaviour || constraintWidget2.f8015x == 1) {
                    if (z3 == dimensionBehaviour) {
                        z3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (z4 == dimensionBehaviour) {
                        z4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    b.a aVar = this.f8299O1;
                    aVar.f8048a = z3;
                    aVar.f8049b = z4;
                    aVar.f8050c = constraintWidget2.m0();
                    this.f8299O1.f8051d = constraintWidget2.D();
                    interfaceC0060b.b(constraintWidget2, this.f8299O1);
                    constraintWidget2.c2(this.f8299O1.f8052e);
                    constraintWidget2.y1(this.f8299O1.f8053f);
                    constraintWidget2.g1(this.f8299O1.f8054g);
                }
            }
        }
        return true;
    }

    public boolean y2() {
        return this.f8296L1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z2(boolean z3) {
        this.f8296L1 = z3;
    }
}
