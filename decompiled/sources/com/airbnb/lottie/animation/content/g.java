package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.P;
import com.airbnb.lottie.animation.keyframe.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g implements e, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final Path f21248a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f21249b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f21250c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21251d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21252e;

    /* renamed from: f, reason: collision with root package name */
    private final List<n> f21253f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f21254g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f21255h;

    /* renamed from: i, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f21256i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.j f21257j;

    /* renamed from: k, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f21258k;

    /* renamed from: l, reason: collision with root package name */
    float f21259l;

    /* renamed from: m, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.c f21260m;

    public g(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.j jVar2) {
        Path path = new Path();
        this.f21248a = path;
        this.f21249b = new com.airbnb.lottie.animation.a(1);
        this.f21253f = new ArrayList();
        this.f21250c = bVar;
        this.f21251d = jVar2.d();
        this.f21252e = jVar2.f();
        this.f21257j = jVar;
        if (bVar.v() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a4 = bVar.v().a().a();
            this.f21258k = a4;
            a4.a(this);
            bVar.i(this.f21258k);
        }
        if (bVar.x() != null) {
            this.f21260m = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.x());
        }
        if (jVar2.b() != null && jVar2.e() != null) {
            path.setFillType(jVar2.c());
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a5 = jVar2.b().a();
            this.f21254g = a5;
            a5.a(this);
            bVar.i(a5);
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a6 = jVar2.e().a();
            this.f21255h = a6;
            a6.a(this);
            bVar.i(a6);
            return;
        }
        this.f21254g = null;
        this.f21255h = null;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f21257j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < list2.size(); i4++) {
            c cVar = list2.get(i4);
            if (cVar instanceof n) {
                this.f21253f.add((n) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void c(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.m(dVar, i4, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void d(RectF rectF, Matrix matrix, boolean z3) {
        this.f21248a.reset();
        for (int i4 = 0; i4 < this.f21253f.size(); i4++) {
            this.f21248a.addPath(this.f21253f.get(i4).g(), matrix);
        }
        this.f21248a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(Canvas canvas, Matrix matrix, int i4) {
        if (this.f21252e) {
            return;
        }
        com.airbnb.lottie.e.a("FillContent#draw");
        this.f21249b.setColor(((com.airbnb.lottie.animation.keyframe.b) this.f21254g).p());
        this.f21249b.setAlpha(com.airbnb.lottie.utils.i.d((int) ((((i4 / 255.0f) * this.f21255h.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f21256i;
        if (aVar != null) {
            this.f21249b.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f21258k;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f21249b.setMaskFilter(null);
            } else if (floatValue != this.f21259l) {
                this.f21249b.setMaskFilter(this.f21250c.w(floatValue));
            }
            this.f21259l = floatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f21260m;
        if (cVar != null) {
            cVar.b(this.f21249b);
        }
        this.f21248a.reset();
        for (int i5 = 0; i5 < this.f21253f.size(); i5++) {
            this.f21248a.addPath(this.f21253f.get(i5).g(), matrix);
        }
        canvas.drawPath(this.f21248a, this.f21249b);
        com.airbnb.lottie.e.b("FillContent#draw");
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f21251d;
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void h(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t3 == com.airbnb.lottie.o.f21827a) {
            this.f21254g.n(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21830d) {
            this.f21255h.n(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21823K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f21256i;
            if (aVar != null) {
                this.f21250c.G(aVar);
            }
            if (jVar == null) {
                this.f21256i = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f21256i = qVar;
            qVar.a(this);
            this.f21250c.i(this.f21256i);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21836j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f21258k;
            if (aVar2 != null) {
                aVar2.n(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f21258k = qVar2;
            qVar2.a(this);
            this.f21250c.i(this.f21258k);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21831e && (cVar5 = this.f21260m) != null) {
            cVar5.c(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21819G && (cVar4 = this.f21260m) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21820H && (cVar3 = this.f21260m) != null) {
            cVar3.d(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21821I && (cVar2 = this.f21260m) != null) {
            cVar2.e(jVar);
        } else if (t3 == com.airbnb.lottie.o.f21822J && (cVar = this.f21260m) != null) {
            cVar.g(jVar);
        }
    }
}
