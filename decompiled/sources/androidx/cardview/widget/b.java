package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.P;
import androidx.annotation.W;

/* JADX INFO: Access modifiers changed from: package-private */
@W(21)
/* loaded from: classes.dex */
public class b implements e {
    private f p(d dVar) {
        return (f) dVar.f();
    }

    @Override // androidx.cardview.widget.e
    public void a(d dVar, Context context, ColorStateList colorStateList, float f4, float f5, float f6) {
        dVar.c(new f(colorStateList, f4));
        View g4 = dVar.g();
        g4.setClipToOutline(true);
        g4.setElevation(f5);
        o(dVar, f6);
    }

    @Override // androidx.cardview.widget.e
    public void b(d dVar, float f4) {
        p(dVar).h(f4);
    }

    @Override // androidx.cardview.widget.e
    public float c(d dVar) {
        return dVar.g().getElevation();
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return p(dVar).d();
    }

    @Override // androidx.cardview.widget.e
    public void e(d dVar) {
        o(dVar, g(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void f(d dVar, float f4) {
        dVar.g().setElevation(f4);
    }

    @Override // androidx.cardview.widget.e
    public float g(d dVar) {
        return p(dVar).c();
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList h(d dVar) {
        return p(dVar).b();
    }

    @Override // androidx.cardview.widget.e
    public void i(d dVar) {
        if (!dVar.e()) {
            dVar.a(0, 0, 0, 0);
            return;
        }
        float g4 = g(dVar);
        float d4 = d(dVar);
        int ceil = (int) Math.ceil(g.c(g4, d4, dVar.d()));
        int ceil2 = (int) Math.ceil(g.d(g4, d4, dVar.d()));
        dVar.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.e
    public void j() {
    }

    @Override // androidx.cardview.widget.e
    public float k(d dVar) {
        return d(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public float l(d dVar) {
        return d(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public void m(d dVar) {
        o(dVar, g(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, @P ColorStateList colorStateList) {
        p(dVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public void o(d dVar, float f4) {
        p(dVar).g(f4, dVar.e(), dVar.d());
        i(dVar);
    }
}
