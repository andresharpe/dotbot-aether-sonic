package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f8083m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f8075e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f8075e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public void e(int i4) {
        if (this.f8080j) {
            return;
        }
        this.f8080j = true;
        this.f8077g = i4;
        for (d dVar : this.f8081k) {
            dVar.a(dVar);
        }
    }
}
