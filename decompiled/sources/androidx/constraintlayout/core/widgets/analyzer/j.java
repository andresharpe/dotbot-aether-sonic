package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j extends p {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f7977e.f();
        constraintWidget.f7979f.f();
        this.f8130f = ((androidx.constraintlayout.core.widgets.f) constraintWidget).n2();
    }

    private void u(f fVar) {
        this.f8132h.f8081k.add(fVar);
        fVar.f8082l.add(this.f8132h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        f fVar = this.f8132h;
        if (!fVar.f8073c || fVar.f8080j) {
            return;
        }
        this.f8132h.e((int) ((fVar.f8082l.get(0).f8077g * ((androidx.constraintlayout.core.widgets.f) this.f8126b).r2()) + 0.5f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void d() {
        androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) this.f8126b;
        int o22 = fVar.o2();
        int q22 = fVar.q2();
        fVar.r2();
        if (fVar.n2() == 1) {
            if (o22 != -1) {
                this.f8132h.f8082l.add(this.f8126b.f7974c0.f7977e.f8132h);
                this.f8126b.f7974c0.f7977e.f8132h.f8081k.add(this.f8132h);
                this.f8132h.f8076f = o22;
            } else if (q22 != -1) {
                this.f8132h.f8082l.add(this.f8126b.f7974c0.f7977e.f8133i);
                this.f8126b.f7974c0.f7977e.f8133i.f8081k.add(this.f8132h);
                this.f8132h.f8076f = -q22;
            } else {
                f fVar2 = this.f8132h;
                fVar2.f8072b = true;
                fVar2.f8082l.add(this.f8126b.f7974c0.f7977e.f8133i);
                this.f8126b.f7974c0.f7977e.f8133i.f8081k.add(this.f8132h);
            }
            u(this.f8126b.f7977e.f8132h);
            u(this.f8126b.f7977e.f8133i);
            return;
        }
        if (o22 != -1) {
            this.f8132h.f8082l.add(this.f8126b.f7974c0.f7979f.f8132h);
            this.f8126b.f7974c0.f7979f.f8132h.f8081k.add(this.f8132h);
            this.f8132h.f8076f = o22;
        } else if (q22 != -1) {
            this.f8132h.f8082l.add(this.f8126b.f7974c0.f7979f.f8133i);
            this.f8126b.f7974c0.f7979f.f8133i.f8081k.add(this.f8132h);
            this.f8132h.f8076f = -q22;
        } else {
            f fVar3 = this.f8132h;
            fVar3.f8072b = true;
            fVar3.f8082l.add(this.f8126b.f7974c0.f7979f.f8133i);
            this.f8126b.f7974c0.f7979f.f8133i.f8081k.add(this.f8132h);
        }
        u(this.f8126b.f7979f.f8132h);
        u(this.f8126b.f7979f.f8133i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        if (((androidx.constraintlayout.core.widgets.f) this.f8126b).n2() == 1) {
            this.f8126b.f2(this.f8132h.f8077g);
        } else {
            this.f8126b.g2(this.f8132h.f8077g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void f() {
        this.f8132h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void n() {
        this.f8132h.f8080j = false;
        this.f8133i.f8080j = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public boolean p() {
        return false;
    }
}
