package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.f;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k extends p {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void u(f fVar) {
        this.f8132h.f8081k.add(fVar);
        fVar.f8082l.add(this.f8132h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.f8126b;
        int p22 = aVar.p2();
        Iterator<f> it = this.f8132h.f8082l.iterator();
        int i4 = 0;
        int i5 = -1;
        while (it.hasNext()) {
            int i6 = it.next().f8077g;
            if (i5 == -1 || i6 < i5) {
                i5 = i6;
            }
            if (i4 < i6) {
                i4 = i6;
            }
        }
        if (p22 != 0 && p22 != 2) {
            this.f8132h.e(i4 + aVar.q2());
        } else {
            this.f8132h.e(i5 + aVar.q2());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void d() {
        ConstraintWidget constraintWidget = this.f8126b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            this.f8132h.f8072b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int p22 = aVar.p2();
            boolean o22 = aVar.o2();
            int i4 = 0;
            if (p22 != 0) {
                if (p22 != 1) {
                    if (p22 != 2) {
                        if (p22 == 3) {
                            this.f8132h.f8075e = f.a.BOTTOM;
                            while (i4 < aVar.f8266C1) {
                                ConstraintWidget constraintWidget2 = aVar.f8265B1[i4];
                                if (o22 || constraintWidget2.l0() != 8) {
                                    f fVar = constraintWidget2.f7979f.f8133i;
                                    fVar.f8081k.add(this.f8132h);
                                    this.f8132h.f8082l.add(fVar);
                                }
                                i4++;
                            }
                            u(this.f8126b.f7979f.f8132h);
                            u(this.f8126b.f7979f.f8133i);
                            return;
                        }
                        return;
                    }
                    this.f8132h.f8075e = f.a.TOP;
                    while (i4 < aVar.f8266C1) {
                        ConstraintWidget constraintWidget3 = aVar.f8265B1[i4];
                        if (o22 || constraintWidget3.l0() != 8) {
                            f fVar2 = constraintWidget3.f7979f.f8132h;
                            fVar2.f8081k.add(this.f8132h);
                            this.f8132h.f8082l.add(fVar2);
                        }
                        i4++;
                    }
                    u(this.f8126b.f7979f.f8132h);
                    u(this.f8126b.f7979f.f8133i);
                    return;
                }
                this.f8132h.f8075e = f.a.RIGHT;
                while (i4 < aVar.f8266C1) {
                    ConstraintWidget constraintWidget4 = aVar.f8265B1[i4];
                    if (o22 || constraintWidget4.l0() != 8) {
                        f fVar3 = constraintWidget4.f7977e.f8133i;
                        fVar3.f8081k.add(this.f8132h);
                        this.f8132h.f8082l.add(fVar3);
                    }
                    i4++;
                }
                u(this.f8126b.f7977e.f8132h);
                u(this.f8126b.f7977e.f8133i);
                return;
            }
            this.f8132h.f8075e = f.a.LEFT;
            while (i4 < aVar.f8266C1) {
                ConstraintWidget constraintWidget5 = aVar.f8265B1[i4];
                if (o22 || constraintWidget5.l0() != 8) {
                    f fVar4 = constraintWidget5.f7977e.f8132h;
                    fVar4.f8081k.add(this.f8132h);
                    this.f8132h.f8082l.add(fVar4);
                }
                i4++;
            }
            u(this.f8126b.f7977e.f8132h);
            u(this.f8126b.f7977e.f8133i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        ConstraintWidget constraintWidget = this.f8126b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int p22 = ((androidx.constraintlayout.core.widgets.a) constraintWidget).p2();
            if (p22 != 0 && p22 != 1) {
                this.f8126b.g2(this.f8132h.f8077g);
            } else {
                this.f8126b.f2(this.f8132h.f8077g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void f() {
        this.f8127c = null;
        this.f8132h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void n() {
        this.f8132h.f8080j = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public boolean p() {
        return false;
    }
}
