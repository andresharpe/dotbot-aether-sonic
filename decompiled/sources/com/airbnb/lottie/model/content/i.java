package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.annotation.InterfaceC0580x;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.a> f21680a;

    /* renamed from: b, reason: collision with root package name */
    private PointF f21681b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21682c;

    public i(PointF pointF, boolean z3, List<com.airbnb.lottie.model.a> list) {
        this.f21681b = pointF;
        this.f21682c = z3;
        this.f21680a = new ArrayList(list);
    }

    private void e(float f4, float f5) {
        if (this.f21681b == null) {
            this.f21681b = new PointF();
        }
        this.f21681b.set(f4, f5);
    }

    public List<com.airbnb.lottie.model.a> a() {
        return this.f21680a;
    }

    public PointF b() {
        return this.f21681b;
    }

    public void c(i iVar, i iVar2, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        boolean z3;
        if (this.f21681b == null) {
            this.f21681b = new PointF();
        }
        if (!iVar.d() && !iVar2.d()) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f21682c = z3;
        if (iVar.a().size() != iVar2.a().size()) {
            com.airbnb.lottie.utils.f.e("Curves must have the same number of control points. Shape 1: " + iVar.a().size() + "\tShape 2: " + iVar2.a().size());
        }
        int min = Math.min(iVar.a().size(), iVar2.a().size());
        if (this.f21680a.size() < min) {
            for (int size = this.f21680a.size(); size < min; size++) {
                this.f21680a.add(new com.airbnb.lottie.model.a());
            }
        } else if (this.f21680a.size() > min) {
            for (int size2 = this.f21680a.size() - 1; size2 >= min; size2--) {
                List<com.airbnb.lottie.model.a> list = this.f21680a;
                list.remove(list.size() - 1);
            }
        }
        PointF b4 = iVar.b();
        PointF b5 = iVar2.b();
        e(com.airbnb.lottie.utils.i.k(b4.x, b5.x, f4), com.airbnb.lottie.utils.i.k(b4.y, b5.y, f4));
        for (int size3 = this.f21680a.size() - 1; size3 >= 0; size3--) {
            com.airbnb.lottie.model.a aVar = iVar.a().get(size3);
            com.airbnb.lottie.model.a aVar2 = iVar2.a().get(size3);
            PointF a4 = aVar.a();
            PointF b6 = aVar.b();
            PointF c4 = aVar.c();
            PointF a5 = aVar2.a();
            PointF b7 = aVar2.b();
            PointF c5 = aVar2.c();
            this.f21680a.get(size3).d(com.airbnb.lottie.utils.i.k(a4.x, a5.x, f4), com.airbnb.lottie.utils.i.k(a4.y, a5.y, f4));
            this.f21680a.get(size3).e(com.airbnb.lottie.utils.i.k(b6.x, b7.x, f4), com.airbnb.lottie.utils.i.k(b6.y, b7.y, f4));
            this.f21680a.get(size3).f(com.airbnb.lottie.utils.i.k(c4.x, c5.x, f4), com.airbnb.lottie.utils.i.k(c4.y, c5.y, f4));
        }
    }

    public boolean d() {
        return this.f21682c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f21680a.size() + "closed=" + this.f21682c + '}';
    }

    public i() {
        this.f21680a = new ArrayList();
    }
}
