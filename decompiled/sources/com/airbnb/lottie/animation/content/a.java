package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.P;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.j f21212e;

    /* renamed from: f, reason: collision with root package name */
    protected final com.airbnb.lottie.model.layer.b f21213f;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f21215h;

    /* renamed from: i, reason: collision with root package name */
    final Paint f21216i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f21217j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Integer> f21218k;

    /* renamed from: l, reason: collision with root package name */
    private final List<com.airbnb.lottie.animation.keyframe.a<?, Float>> f21219l;

    /* renamed from: m, reason: collision with root package name */
    @P
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f21220m;

    /* renamed from: n, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f21221n;

    /* renamed from: o, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f21222o;

    /* renamed from: p, reason: collision with root package name */
    float f21223p;

    /* renamed from: q, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.c f21224q;

    /* renamed from: a, reason: collision with root package name */
    private final PathMeasure f21208a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    private final Path f21209b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f21210c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final RectF f21211d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final List<b> f21214g = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<n> f21225a;

        /* renamed from: b, reason: collision with root package name */
        @P
        private final t f21226b;

        private b(@P t tVar) {
            this.f21225a = new ArrayList();
            this.f21226b = tVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar, Paint.Cap cap, Paint.Join join, float f4, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.b bVar3) {
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a(1);
        this.f21216i = aVar;
        this.f21223p = 0.0f;
        this.f21212e = jVar;
        this.f21213f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f4);
        this.f21218k = dVar.a();
        this.f21217j = bVar2.a();
        if (bVar3 == null) {
            this.f21220m = null;
        } else {
            this.f21220m = bVar3.a();
        }
        this.f21219l = new ArrayList(list.size());
        this.f21215h = new float[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f21219l.add(list.get(i4).a());
        }
        bVar.i(this.f21218k);
        bVar.i(this.f21217j);
        for (int i5 = 0; i5 < this.f21219l.size(); i5++) {
            bVar.i(this.f21219l.get(i5));
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = this.f21220m;
        if (aVar2 != null) {
            bVar.i(aVar2);
        }
        this.f21218k.a(this);
        this.f21217j.a(this);
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.f21219l.get(i6).a(this);
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar3 = this.f21220m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.v() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a4 = bVar.v().a().a();
            this.f21222o = a4;
            a4.a(this);
            bVar.i(this.f21222o);
        }
        if (bVar.x() != null) {
            this.f21224q = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.x());
        }
    }

    private void e(Matrix matrix) {
        float floatValue;
        com.airbnb.lottie.e.a("StrokeContent#applyDashPattern");
        if (this.f21219l.isEmpty()) {
            com.airbnb.lottie.e.b("StrokeContent#applyDashPattern");
            return;
        }
        float g4 = com.airbnb.lottie.utils.j.g(matrix);
        for (int i4 = 0; i4 < this.f21219l.size(); i4++) {
            this.f21215h[i4] = this.f21219l.get(i4).h().floatValue();
            if (i4 % 2 == 0) {
                float[] fArr = this.f21215h;
                if (fArr[i4] < 1.0f) {
                    fArr[i4] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f21215h;
                if (fArr2[i4] < 0.1f) {
                    fArr2[i4] = 0.1f;
                }
            }
            float[] fArr3 = this.f21215h;
            fArr3[i4] = fArr3[i4] * g4;
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f21220m;
        if (aVar == null) {
            floatValue = 0.0f;
        } else {
            floatValue = g4 * aVar.h().floatValue();
        }
        this.f21216i.setPathEffect(new DashPathEffect(this.f21215h, floatValue));
        com.airbnb.lottie.e.b("StrokeContent#applyDashPattern");
    }

    private void i(Canvas canvas, b bVar, Matrix matrix) {
        float f4;
        float f5;
        com.airbnb.lottie.e.a("StrokeContent#applyTrimPath");
        if (bVar.f21226b == null) {
            com.airbnb.lottie.e.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f21209b.reset();
        for (int size = bVar.f21225a.size() - 1; size >= 0; size--) {
            this.f21209b.addPath(((n) bVar.f21225a.get(size)).g(), matrix);
        }
        this.f21208a.setPath(this.f21209b, false);
        float length = this.f21208a.getLength();
        while (this.f21208a.nextContour()) {
            length += this.f21208a.getLength();
        }
        float floatValue = (bVar.f21226b.h().h().floatValue() * length) / 360.0f;
        float floatValue2 = ((bVar.f21226b.i().h().floatValue() / 100.0f) * length) + floatValue;
        float floatValue3 = ((bVar.f21226b.e().h().floatValue() / 100.0f) * length) + floatValue;
        float f6 = 0.0f;
        for (int size2 = bVar.f21225a.size() - 1; size2 >= 0; size2--) {
            this.f21210c.set(((n) bVar.f21225a.get(size2)).g());
            this.f21210c.transform(matrix);
            this.f21208a.setPath(this.f21210c, false);
            float length2 = this.f21208a.getLength();
            float f7 = 1.0f;
            if (floatValue3 > length) {
                float f8 = floatValue3 - length;
                if (f8 < f6 + length2 && f6 < f8) {
                    if (floatValue2 > length) {
                        f5 = (floatValue2 - length) / length2;
                    } else {
                        f5 = 0.0f;
                    }
                    com.airbnb.lottie.utils.j.a(this.f21210c, f5, Math.min(f8 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f21210c, this.f21216i);
                    f6 += length2;
                }
            }
            float f9 = f6 + length2;
            if (f9 >= floatValue2 && f6 <= floatValue3) {
                if (f9 <= floatValue3 && floatValue2 < f6) {
                    canvas.drawPath(this.f21210c, this.f21216i);
                } else {
                    if (floatValue2 < f6) {
                        f4 = 0.0f;
                    } else {
                        f4 = (floatValue2 - f6) / length2;
                    }
                    if (floatValue3 <= f9) {
                        f7 = (floatValue3 - f6) / length2;
                    }
                    com.airbnb.lottie.utils.j.a(this.f21210c, f4, f7, 0.0f);
                    canvas.drawPath(this.f21210c, this.f21216i);
                }
            }
            f6 += length2;
        }
        com.airbnb.lottie.e.b("StrokeContent#applyTrimPath");
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f21212e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        t tVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof t) {
                t tVar2 = (t) cVar;
                if (tVar2.j() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    tVar = tVar2;
                }
            }
        }
        if (tVar != null) {
            tVar.c(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof t) {
                t tVar3 = (t) cVar2;
                if (tVar3.j() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f21214g.add(bVar);
                    }
                    bVar = new b(tVar3);
                    tVar3.c(this);
                }
            }
            if (cVar2 instanceof n) {
                if (bVar == null) {
                    bVar = new b(tVar);
                }
                bVar.f21225a.add((n) cVar2);
            }
        }
        if (bVar != null) {
            this.f21214g.add(bVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void c(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.m(dVar, i4, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void d(RectF rectF, Matrix matrix, boolean z3) {
        com.airbnb.lottie.e.a("StrokeContent#getBounds");
        this.f21209b.reset();
        for (int i4 = 0; i4 < this.f21214g.size(); i4++) {
            b bVar = this.f21214g.get(i4);
            for (int i5 = 0; i5 < bVar.f21225a.size(); i5++) {
                this.f21209b.addPath(((n) bVar.f21225a.get(i5)).g(), matrix);
            }
        }
        this.f21209b.computeBounds(this.f21211d, false);
        float p4 = ((com.airbnb.lottie.animation.keyframe.d) this.f21217j).p();
        RectF rectF2 = this.f21211d;
        float f4 = p4 / 2.0f;
        rectF2.set(rectF2.left - f4, rectF2.top - f4, rectF2.right + f4, rectF2.bottom + f4);
        rectF.set(this.f21211d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.e.b("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(Canvas canvas, Matrix matrix, int i4) {
        com.airbnb.lottie.e.a("StrokeContent#draw");
        if (com.airbnb.lottie.utils.j.h(matrix)) {
            com.airbnb.lottie.e.b("StrokeContent#draw");
            return;
        }
        this.f21216i.setAlpha(com.airbnb.lottie.utils.i.d((int) ((((i4 / 255.0f) * ((com.airbnb.lottie.animation.keyframe.f) this.f21218k).p()) / 100.0f) * 255.0f), 0, 255));
        this.f21216i.setStrokeWidth(((com.airbnb.lottie.animation.keyframe.d) this.f21217j).p() * com.airbnb.lottie.utils.j.g(matrix));
        if (this.f21216i.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.e.b("StrokeContent#draw");
            return;
        }
        e(matrix);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f21221n;
        if (aVar != null) {
            this.f21216i.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f21222o;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f21216i.setMaskFilter(null);
            } else if (floatValue != this.f21223p) {
                this.f21216i.setMaskFilter(this.f21213f.w(floatValue));
            }
            this.f21223p = floatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f21224q;
        if (cVar != null) {
            cVar.b(this.f21216i);
        }
        for (int i5 = 0; i5 < this.f21214g.size(); i5++) {
            b bVar = this.f21214g.get(i5);
            if (bVar.f21226b != null) {
                i(canvas, bVar, matrix);
            } else {
                com.airbnb.lottie.e.a("StrokeContent#buildPath");
                this.f21209b.reset();
                for (int size = bVar.f21225a.size() - 1; size >= 0; size--) {
                    this.f21209b.addPath(((n) bVar.f21225a.get(size)).g(), matrix);
                }
                com.airbnb.lottie.e.b("StrokeContent#buildPath");
                com.airbnb.lottie.e.a("StrokeContent#drawPath");
                canvas.drawPath(this.f21209b, this.f21216i);
                com.airbnb.lottie.e.b("StrokeContent#drawPath");
            }
        }
        com.airbnb.lottie.e.b("StrokeContent#draw");
    }

    @Override // com.airbnb.lottie.model.e
    @InterfaceC0566i
    public <T> void h(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t3 == com.airbnb.lottie.o.f21830d) {
            this.f21218k.n(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21845s) {
            this.f21217j.n(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21823K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f21221n;
            if (aVar != null) {
                this.f21213f.G(aVar);
            }
            if (jVar == null) {
                this.f21221n = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f21221n = qVar;
            qVar.a(this);
            this.f21213f.i(this.f21221n);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21836j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f21222o;
            if (aVar2 != null) {
                aVar2.n(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f21222o = qVar2;
            qVar2.a(this);
            this.f21213f.i(this.f21222o);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21831e && (cVar5 = this.f21224q) != null) {
            cVar5.c(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21819G && (cVar4 = this.f21224q) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21820H && (cVar3 = this.f21224q) != null) {
            cVar3.d(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21821I && (cVar2 = this.f21224q) != null) {
            cVar2.e(jVar);
        } else if (t3 == com.airbnb.lottie.o.f21822J && (cVar = this.f21224q) != null) {
            cVar.g(jVar);
        }
    }
}
