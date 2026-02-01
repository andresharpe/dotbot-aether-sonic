package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.P;
import com.airbnb.lottie.animation.keyframe.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d implements e, n, a.b, com.airbnb.lottie.model.e {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f21228a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f21229b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f21230c;

    /* renamed from: d, reason: collision with root package name */
    private final Path f21231d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f21232e;

    /* renamed from: f, reason: collision with root package name */
    private final String f21233f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f21234g;

    /* renamed from: h, reason: collision with root package name */
    private final List<c> f21235h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.j f21236i;

    /* renamed from: j, reason: collision with root package name */
    @P
    private List<n> f21237j;

    /* renamed from: k, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.p f21238k;

    public d(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.k kVar) {
        this(jVar, bVar, kVar.c(), kVar.d(), e(jVar, bVar, kVar.b()), i(kVar.b()));
    }

    private static List<c> e(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar, List<com.airbnb.lottie.model.content.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            c a4 = list.get(i4).a(jVar, bVar);
            if (a4 != null) {
                arrayList.add(a4);
            }
        }
        return arrayList;
    }

    @P
    static com.airbnb.lottie.model.animatable.l i(List<com.airbnb.lottie.model.content.c> list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            com.airbnb.lottie.model.content.c cVar = list.get(i4);
            if (cVar instanceof com.airbnb.lottie.model.animatable.l) {
                return (com.airbnb.lottie.model.animatable.l) cVar;
            }
        }
        return null;
    }

    private boolean l() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.f21235h.size(); i5++) {
            if ((this.f21235h.get(i5) instanceof e) && (i4 = i4 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f21236i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f21235h.size());
        arrayList.addAll(list);
        for (int size = this.f21235h.size() - 1; size >= 0; size--) {
            c cVar = this.f21235h.get(size);
            cVar.b(arrayList, this.f21235h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void c(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        if (!dVar.h(getName(), i4) && !"__container".equals(getName())) {
            return;
        }
        if (!"__container".equals(getName())) {
            dVar2 = dVar2.a(getName());
            if (dVar.c(getName(), i4)) {
                list.add(dVar2.j(this));
            }
        }
        if (dVar.i(getName(), i4)) {
            int e4 = i4 + dVar.e(getName(), i4);
            for (int i5 = 0; i5 < this.f21235h.size(); i5++) {
                c cVar = this.f21235h.get(i5);
                if (cVar instanceof com.airbnb.lottie.model.e) {
                    ((com.airbnb.lottie.model.e) cVar).c(dVar, e4, list, dVar2);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void d(RectF rectF, Matrix matrix, boolean z3) {
        this.f21230c.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.f21238k;
        if (pVar != null) {
            this.f21230c.preConcat(pVar.f());
        }
        this.f21232e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f21235h.size() - 1; size >= 0; size--) {
            c cVar = this.f21235h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).d(this.f21232e, this.f21230c, z3);
                rectF.union(this.f21232e);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(Canvas canvas, Matrix matrix, int i4) {
        boolean z3;
        int intValue;
        if (this.f21234g) {
            return;
        }
        this.f21230c.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.f21238k;
        if (pVar != null) {
            this.f21230c.preConcat(pVar.f());
            if (this.f21238k.h() == null) {
                intValue = 100;
            } else {
                intValue = this.f21238k.h().h().intValue();
            }
            i4 = (int) ((((intValue / 100.0f) * i4) / 255.0f) * 255.0f);
        }
        if (this.f21236i.T() && l() && i4 != 255) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f21229b.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(this.f21229b, this.f21230c, true);
            this.f21228a.setAlpha(i4);
            com.airbnb.lottie.utils.j.n(canvas, this.f21229b, this.f21228a);
        }
        if (z3) {
            i4 = 255;
        }
        for (int size = this.f21235h.size() - 1; size >= 0; size--) {
            c cVar = this.f21235h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).f(canvas, this.f21230c, i4);
            }
        }
        if (z3) {
            canvas.restore();
        }
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path g() {
        this.f21230c.reset();
        com.airbnb.lottie.animation.keyframe.p pVar = this.f21238k;
        if (pVar != null) {
            this.f21230c.set(pVar.f());
        }
        this.f21231d.reset();
        if (this.f21234g) {
            return this.f21231d;
        }
        for (int size = this.f21235h.size() - 1; size >= 0; size--) {
            c cVar = this.f21235h.get(size);
            if (cVar instanceof n) {
                this.f21231d.addPath(((n) cVar).g(), this.f21230c);
            }
        }
        return this.f21231d;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f21233f;
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void h(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.p pVar = this.f21238k;
        if (pVar != null) {
            pVar.c(t3, jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<n> j() {
        if (this.f21237j == null) {
            this.f21237j = new ArrayList();
            for (int i4 = 0; i4 < this.f21235h.size(); i4++) {
                c cVar = this.f21235h.get(i4);
                if (cVar instanceof n) {
                    this.f21237j.add((n) cVar);
                }
            }
        }
        return this.f21237j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Matrix k() {
        com.airbnb.lottie.animation.keyframe.p pVar = this.f21238k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f21230c.reset();
        return this.f21230c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar, String str, boolean z3, List<c> list, @P com.airbnb.lottie.model.animatable.l lVar) {
        this.f21228a = new com.airbnb.lottie.animation.a();
        this.f21229b = new RectF();
        this.f21230c = new Matrix();
        this.f21231d = new Path();
        this.f21232e = new RectF();
        this.f21233f = str;
        this.f21236i = jVar;
        this.f21234g = z3;
        this.f21235h = list;
        if (lVar != null) {
            com.airbnb.lottie.animation.keyframe.p b4 = lVar.b();
            this.f21238k = b4;
            b4.a(bVar);
            this.f21238k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).e(list.listIterator(list.size()));
        }
    }
}
