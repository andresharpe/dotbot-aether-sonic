package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.N;
import androidx.annotation.P;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.GradientType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h implements e, a.b, k {

    /* renamed from: v, reason: collision with root package name */
    private static final int f21261v = 32;

    /* renamed from: a, reason: collision with root package name */
    @N
    private final String f21262a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f21263b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f21264c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.collection.h<LinearGradient> f21265d = new androidx.collection.h<>();

    /* renamed from: e, reason: collision with root package name */
    private final androidx.collection.h<RadialGradient> f21266e = new androidx.collection.h<>();

    /* renamed from: f, reason: collision with root package name */
    private final Path f21267f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f21268g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f21269h;

    /* renamed from: i, reason: collision with root package name */
    private final List<n> f21270i;

    /* renamed from: j, reason: collision with root package name */
    private final GradientType f21271j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> f21272k;

    /* renamed from: l, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f21273l;

    /* renamed from: m, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f21274m;

    /* renamed from: n, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f21275n;

    /* renamed from: o, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f21276o;

    /* renamed from: p, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.q f21277p;

    /* renamed from: q, reason: collision with root package name */
    private final com.airbnb.lottie.j f21278q;

    /* renamed from: r, reason: collision with root package name */
    private final int f21279r;

    /* renamed from: s, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f21280s;

    /* renamed from: t, reason: collision with root package name */
    float f21281t;

    /* renamed from: u, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.c f21282u;

    public h(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.e eVar) {
        Path path = new Path();
        this.f21267f = path;
        this.f21268g = new com.airbnb.lottie.animation.a(1);
        this.f21269h = new RectF();
        this.f21270i = new ArrayList();
        this.f21281t = 0.0f;
        this.f21264c = bVar;
        this.f21262a = eVar.f();
        this.f21263b = eVar.i();
        this.f21278q = jVar;
        this.f21271j = eVar.e();
        path.setFillType(eVar.c());
        this.f21279r = (int) (jVar.y().d() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> a4 = eVar.d().a();
        this.f21272k = a4;
        a4.a(this);
        bVar.i(a4);
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a5 = eVar.g().a();
        this.f21273l = a5;
        a5.a(this);
        bVar.i(a5);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a6 = eVar.h().a();
        this.f21274m = a6;
        a6.a(this);
        bVar.i(a6);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a7 = eVar.b().a();
        this.f21275n = a7;
        a7.a(this);
        bVar.i(a7);
        if (bVar.v() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a8 = bVar.v().a().a();
            this.f21280s = a8;
            a8.a(this);
            bVar.i(this.f21280s);
        }
        if (bVar.x() != null) {
            this.f21282u = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.x());
        }
    }

    private int[] e(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.q qVar = this.f21277p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i4 = 0;
            if (iArr.length == numArr.length) {
                while (i4 < iArr.length) {
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i4 < numArr.length) {
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        int i4;
        int round = Math.round(this.f21274m.f() * this.f21279r);
        int round2 = Math.round(this.f21275n.f() * this.f21279r);
        int round3 = Math.round(this.f21272k.f() * this.f21279r);
        if (round != 0) {
            i4 = 527 * round;
        } else {
            i4 = 17;
        }
        if (round2 != 0) {
            i4 = i4 * 31 * round2;
        }
        if (round3 != 0) {
            return i4 * 31 * round3;
        }
        return i4;
    }

    private LinearGradient j() {
        long i4 = i();
        LinearGradient i5 = this.f21265d.i(i4);
        if (i5 != null) {
            return i5;
        }
        PointF h4 = this.f21274m.h();
        PointF h5 = this.f21275n.h();
        com.airbnb.lottie.model.content.d h6 = this.f21272k.h();
        LinearGradient linearGradient = new LinearGradient(h4.x, h4.y, h5.x, h5.y, e(h6.a()), h6.b(), Shader.TileMode.CLAMP);
        this.f21265d.p(i4, linearGradient);
        return linearGradient;
    }

    private RadialGradient k() {
        long i4 = i();
        RadialGradient i5 = this.f21266e.i(i4);
        if (i5 != null) {
            return i5;
        }
        PointF h4 = this.f21274m.h();
        PointF h5 = this.f21275n.h();
        com.airbnb.lottie.model.content.d h6 = this.f21272k.h();
        int[] e4 = e(h6.a());
        float[] b4 = h6.b();
        float f4 = h4.x;
        float f5 = h4.y;
        float hypot = (float) Math.hypot(h5.x - f4, h5.y - f5);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f4, f5, hypot, e4, b4, Shader.TileMode.CLAMP);
        this.f21266e.p(i4, radialGradient);
        return radialGradient;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f21278q.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < list2.size(); i4++) {
            c cVar = list2.get(i4);
            if (cVar instanceof n) {
                this.f21270i.add((n) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void c(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.m(dVar, i4, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void d(RectF rectF, Matrix matrix, boolean z3) {
        this.f21267f.reset();
        for (int i4 = 0; i4 < this.f21270i.size(); i4++) {
            this.f21267f.addPath(this.f21270i.get(i4).g(), matrix);
        }
        this.f21267f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(Canvas canvas, Matrix matrix, int i4) {
        Shader k4;
        if (this.f21263b) {
            return;
        }
        com.airbnb.lottie.e.a("GradientFillContent#draw");
        this.f21267f.reset();
        for (int i5 = 0; i5 < this.f21270i.size(); i5++) {
            this.f21267f.addPath(this.f21270i.get(i5).g(), matrix);
        }
        this.f21267f.computeBounds(this.f21269h, false);
        if (this.f21271j == GradientType.LINEAR) {
            k4 = j();
        } else {
            k4 = k();
        }
        k4.setLocalMatrix(matrix);
        this.f21268g.setShader(k4);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f21276o;
        if (aVar != null) {
            this.f21268g.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f21280s;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f21268g.setMaskFilter(null);
            } else if (floatValue != this.f21281t) {
                this.f21268g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f21281t = floatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f21282u;
        if (cVar != null) {
            cVar.b(this.f21268g);
        }
        this.f21268g.setAlpha(com.airbnb.lottie.utils.i.d((int) ((((i4 / 255.0f) * this.f21273l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f21267f, this.f21268g);
        com.airbnb.lottie.e.b("GradientFillContent#draw");
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f21262a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.e
    public <T> void h(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t3 == com.airbnb.lottie.o.f21830d) {
            this.f21273l.n(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21823K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f21276o;
            if (aVar != null) {
                this.f21264c.G(aVar);
            }
            if (jVar == null) {
                this.f21276o = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f21276o = qVar;
            qVar.a(this);
            this.f21264c.i(this.f21276o);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21824L) {
            com.airbnb.lottie.animation.keyframe.q qVar2 = this.f21277p;
            if (qVar2 != null) {
                this.f21264c.G(qVar2);
            }
            if (jVar == null) {
                this.f21277p = null;
                return;
            }
            this.f21265d.b();
            this.f21266e.b();
            com.airbnb.lottie.animation.keyframe.q qVar3 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f21277p = qVar3;
            qVar3.a(this);
            this.f21264c.i(this.f21277p);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21836j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f21280s;
            if (aVar2 != null) {
                aVar2.n(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar4 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f21280s = qVar4;
            qVar4.a(this);
            this.f21264c.i(this.f21280s);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21831e && (cVar5 = this.f21282u) != null) {
            cVar5.c(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21819G && (cVar4 = this.f21282u) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21820H && (cVar3 = this.f21282u) != null) {
            cVar3.d(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21821I && (cVar2 = this.f21282u) != null) {
            cVar2.e(jVar);
        } else if (t3 == com.airbnb.lottie.o.f21822J && (cVar = this.f21282u) != null) {
            cVar.g(jVar);
        }
    }
}
