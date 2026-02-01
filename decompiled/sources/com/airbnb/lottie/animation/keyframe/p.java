package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.P;
import com.airbnb.lottie.animation.keyframe.a;
import java.util.Collections;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f21402a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f21403b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f21404c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f21405d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f21406e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private a<PointF, PointF> f21407f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private a<?, PointF> f21408g;

    /* renamed from: h, reason: collision with root package name */
    @P
    private a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> f21409h;

    /* renamed from: i, reason: collision with root package name */
    @P
    private a<Float, Float> f21410i;

    /* renamed from: j, reason: collision with root package name */
    @P
    private a<Integer, Integer> f21411j;

    /* renamed from: k, reason: collision with root package name */
    @P
    private d f21412k;

    /* renamed from: l, reason: collision with root package name */
    @P
    private d f21413l;

    /* renamed from: m, reason: collision with root package name */
    @P
    private a<?, Float> f21414m;

    /* renamed from: n, reason: collision with root package name */
    @P
    private a<?, Float> f21415n;

    public p(com.airbnb.lottie.model.animatable.l lVar) {
        a<PointF, PointF> a4;
        a<PointF, PointF> a5;
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> a6;
        a<Float, Float> a7;
        d dVar;
        d dVar2;
        if (lVar.c() == null) {
            a4 = null;
        } else {
            a4 = lVar.c().a();
        }
        this.f21407f = a4;
        if (lVar.f() == null) {
            a5 = null;
        } else {
            a5 = lVar.f().a();
        }
        this.f21408g = a5;
        if (lVar.h() == null) {
            a6 = null;
        } else {
            a6 = lVar.h().a();
        }
        this.f21409h = a6;
        if (lVar.g() == null) {
            a7 = null;
        } else {
            a7 = lVar.g().a();
        }
        this.f21410i = a7;
        if (lVar.i() == null) {
            dVar = null;
        } else {
            dVar = (d) lVar.i().a();
        }
        this.f21412k = dVar;
        if (dVar != null) {
            this.f21403b = new Matrix();
            this.f21404c = new Matrix();
            this.f21405d = new Matrix();
            this.f21406e = new float[9];
        } else {
            this.f21403b = null;
            this.f21404c = null;
            this.f21405d = null;
            this.f21406e = null;
        }
        if (lVar.j() == null) {
            dVar2 = null;
        } else {
            dVar2 = (d) lVar.j().a();
        }
        this.f21413l = dVar2;
        if (lVar.e() != null) {
            this.f21411j = lVar.e().a();
        }
        if (lVar.k() != null) {
            this.f21414m = lVar.k().a();
        } else {
            this.f21414m = null;
        }
        if (lVar.d() != null) {
            this.f21415n = lVar.d().a();
        } else {
            this.f21415n = null;
        }
    }

    private void d() {
        for (int i4 = 0; i4 < 9; i4++) {
            this.f21406e[i4] = 0.0f;
        }
    }

    public void a(com.airbnb.lottie.model.layer.b bVar) {
        bVar.i(this.f21411j);
        bVar.i(this.f21414m);
        bVar.i(this.f21415n);
        bVar.i(this.f21407f);
        bVar.i(this.f21408g);
        bVar.i(this.f21409h);
        bVar.i(this.f21410i);
        bVar.i(this.f21412k);
        bVar.i(this.f21413l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f21411j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f21414m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f21415n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f21407f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f21408g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar6 = this.f21409h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f21410i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f21412k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f21413l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        if (t3 == com.airbnb.lottie.o.f21832f) {
            a<PointF, PointF> aVar = this.f21407f;
            if (aVar == null) {
                this.f21407f = new q(jVar, new PointF());
                return true;
            }
            aVar.n(jVar);
            return true;
        }
        if (t3 == com.airbnb.lottie.o.f21833g) {
            a<?, PointF> aVar2 = this.f21408g;
            if (aVar2 == null) {
                this.f21408g = new q(jVar, new PointF());
                return true;
            }
            aVar2.n(jVar);
            return true;
        }
        if (t3 == com.airbnb.lottie.o.f21834h) {
            a<?, PointF> aVar3 = this.f21408g;
            if (aVar3 instanceof n) {
                ((n) aVar3).r(jVar);
                return true;
            }
        }
        if (t3 == com.airbnb.lottie.o.f21835i) {
            a<?, PointF> aVar4 = this.f21408g;
            if (aVar4 instanceof n) {
                ((n) aVar4).s(jVar);
                return true;
            }
        }
        if (t3 == com.airbnb.lottie.o.f21841o) {
            a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar5 = this.f21409h;
            if (aVar5 == null) {
                this.f21409h = new q(jVar, new com.airbnb.lottie.value.k());
                return true;
            }
            aVar5.n(jVar);
            return true;
        }
        if (t3 == com.airbnb.lottie.o.f21842p) {
            a<Float, Float> aVar6 = this.f21410i;
            if (aVar6 == null) {
                this.f21410i = new q(jVar, Float.valueOf(0.0f));
                return true;
            }
            aVar6.n(jVar);
            return true;
        }
        if (t3 == com.airbnb.lottie.o.f21829c) {
            a<Integer, Integer> aVar7 = this.f21411j;
            if (aVar7 == null) {
                this.f21411j = new q(jVar, 100);
                return true;
            }
            aVar7.n(jVar);
            return true;
        }
        if (t3 == com.airbnb.lottie.o.f21815C) {
            a<?, Float> aVar8 = this.f21414m;
            if (aVar8 == null) {
                this.f21414m = new q(jVar, Float.valueOf(100.0f));
                return true;
            }
            aVar8.n(jVar);
            return true;
        }
        if (t3 == com.airbnb.lottie.o.f21816D) {
            a<?, Float> aVar9 = this.f21415n;
            if (aVar9 == null) {
                this.f21415n = new q(jVar, Float.valueOf(100.0f));
                return true;
            }
            aVar9.n(jVar);
            return true;
        }
        if (t3 == com.airbnb.lottie.o.f21843q) {
            if (this.f21412k == null) {
                this.f21412k = new d(Collections.singletonList(new com.airbnb.lottie.value.a(Float.valueOf(0.0f))));
            }
            this.f21412k.n(jVar);
            return true;
        }
        if (t3 == com.airbnb.lottie.o.f21844r) {
            if (this.f21413l == null) {
                this.f21413l = new d(Collections.singletonList(new com.airbnb.lottie.value.a(Float.valueOf(0.0f))));
            }
            this.f21413l.n(jVar);
            return true;
        }
        return false;
    }

    @P
    public a<?, Float> e() {
        return this.f21415n;
    }

    public Matrix f() {
        float cos;
        float sin;
        float p4;
        this.f21402a.reset();
        a<?, PointF> aVar = this.f21408g;
        if (aVar != null) {
            PointF h4 = aVar.h();
            float f4 = h4.x;
            if (f4 != 0.0f || h4.y != 0.0f) {
                this.f21402a.preTranslate(f4, h4.y);
            }
        }
        a<Float, Float> aVar2 = this.f21410i;
        if (aVar2 != null) {
            if (aVar2 instanceof q) {
                p4 = aVar2.h().floatValue();
            } else {
                p4 = ((d) aVar2).p();
            }
            if (p4 != 0.0f) {
                this.f21402a.preRotate(p4);
            }
        }
        if (this.f21412k != null) {
            if (this.f21413l == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-r3.p()) + 90.0f));
            }
            if (this.f21413l == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-r5.p()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(r0.p()));
            d();
            float[] fArr = this.f21406e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f5 = -sin;
            fArr[3] = f5;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f21403b.setValues(fArr);
            d();
            float[] fArr2 = this.f21406e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f21404c.setValues(fArr2);
            d();
            float[] fArr3 = this.f21406e;
            fArr3[0] = cos;
            fArr3[1] = f5;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f21405d.setValues(fArr3);
            this.f21404c.preConcat(this.f21403b);
            this.f21405d.preConcat(this.f21404c);
            this.f21402a.preConcat(this.f21405d);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar3 = this.f21409h;
        if (aVar3 != null) {
            com.airbnb.lottie.value.k h5 = aVar3.h();
            if (h5.b() != 1.0f || h5.c() != 1.0f) {
                this.f21402a.preScale(h5.b(), h5.c());
            }
        }
        a<PointF, PointF> aVar4 = this.f21407f;
        if (aVar4 != null) {
            PointF h6 = aVar4.h();
            float f6 = h6.x;
            if (f6 != 0.0f || h6.y != 0.0f) {
                this.f21402a.preTranslate(-f6, -h6.y);
            }
        }
        return this.f21402a;
    }

    public Matrix g(float f4) {
        PointF h4;
        com.airbnb.lottie.value.k h5;
        float f5;
        a<?, PointF> aVar = this.f21408g;
        PointF pointF = null;
        if (aVar == null) {
            h4 = null;
        } else {
            h4 = aVar.h();
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar2 = this.f21409h;
        if (aVar2 == null) {
            h5 = null;
        } else {
            h5 = aVar2.h();
        }
        this.f21402a.reset();
        if (h4 != null) {
            this.f21402a.preTranslate(h4.x * f4, h4.y * f4);
        }
        if (h5 != null) {
            double d4 = f4;
            this.f21402a.preScale((float) Math.pow(h5.b(), d4), (float) Math.pow(h5.c(), d4));
        }
        a<Float, Float> aVar3 = this.f21410i;
        if (aVar3 != null) {
            float floatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f21407f;
            if (aVar4 != null) {
                pointF = aVar4.h();
            }
            Matrix matrix = this.f21402a;
            float f6 = floatValue * f4;
            float f7 = 0.0f;
            if (pointF == null) {
                f5 = 0.0f;
            } else {
                f5 = pointF.x;
            }
            if (pointF != null) {
                f7 = pointF.y;
            }
            matrix.preRotate(f6, f5, f7);
        }
        return this.f21402a;
    }

    @P
    public a<?, Integer> h() {
        return this.f21411j;
    }

    @P
    public a<?, Float> i() {
        return this.f21414m;
    }

    public void j(float f4) {
        a<Integer, Integer> aVar = this.f21411j;
        if (aVar != null) {
            aVar.m(f4);
        }
        a<?, Float> aVar2 = this.f21414m;
        if (aVar2 != null) {
            aVar2.m(f4);
        }
        a<?, Float> aVar3 = this.f21415n;
        if (aVar3 != null) {
            aVar3.m(f4);
        }
        a<PointF, PointF> aVar4 = this.f21407f;
        if (aVar4 != null) {
            aVar4.m(f4);
        }
        a<?, PointF> aVar5 = this.f21408g;
        if (aVar5 != null) {
            aVar5.m(f4);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar6 = this.f21409h;
        if (aVar6 != null) {
            aVar6.m(f4);
        }
        a<Float, Float> aVar7 = this.f21410i;
        if (aVar7 != null) {
            aVar7.m(f4);
        }
        d dVar = this.f21412k;
        if (dVar != null) {
            dVar.m(f4);
        }
        d dVar2 = this.f21413l;
        if (dVar2 != null) {
            dVar2.m(f4);
        }
    }
}
