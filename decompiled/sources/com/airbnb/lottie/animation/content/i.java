package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.P;
import com.airbnb.lottie.model.content.GradientType;

/* loaded from: classes.dex */
public class i extends a {

    /* renamed from: C, reason: collision with root package name */
    private static final int f21283C = 32;

    /* renamed from: A, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f21284A;

    /* renamed from: B, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.q f21285B;

    /* renamed from: r, reason: collision with root package name */
    private final String f21286r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f21287s;

    /* renamed from: t, reason: collision with root package name */
    private final androidx.collection.h<LinearGradient> f21288t;

    /* renamed from: u, reason: collision with root package name */
    private final androidx.collection.h<RadialGradient> f21289u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f21290v;

    /* renamed from: w, reason: collision with root package name */
    private final GradientType f21291w;

    /* renamed from: x, reason: collision with root package name */
    private final int f21292x;

    /* renamed from: y, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> f21293y;

    /* renamed from: z, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f21294z;

    public i(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.f fVar) {
        super(jVar, bVar, fVar.b().b(), fVar.g().b(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f21288t = new androidx.collection.h<>();
        this.f21289u = new androidx.collection.h<>();
        this.f21290v = new RectF();
        this.f21286r = fVar.j();
        this.f21291w = fVar.f();
        this.f21287s = fVar.n();
        this.f21292x = (int) (jVar.y().d() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> a4 = fVar.e().a();
        this.f21293y = a4;
        a4.a(this);
        bVar.i(a4);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a5 = fVar.l().a();
        this.f21294z = a5;
        a5.a(this);
        bVar.i(a5);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a6 = fVar.d().a();
        this.f21284A = a6;
        a6.a(this);
        bVar.i(a6);
    }

    private int[] j(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.q qVar = this.f21285B;
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

    private int k() {
        int i4;
        int round = Math.round(this.f21294z.f() * this.f21292x);
        int round2 = Math.round(this.f21284A.f() * this.f21292x);
        int round3 = Math.round(this.f21293y.f() * this.f21292x);
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

    private LinearGradient l() {
        long k4 = k();
        LinearGradient i4 = this.f21288t.i(k4);
        if (i4 != null) {
            return i4;
        }
        PointF h4 = this.f21294z.h();
        PointF h5 = this.f21284A.h();
        com.airbnb.lottie.model.content.d h6 = this.f21293y.h();
        LinearGradient linearGradient = new LinearGradient(h4.x, h4.y, h5.x, h5.y, j(h6.a()), h6.b(), Shader.TileMode.CLAMP);
        this.f21288t.p(k4, linearGradient);
        return linearGradient;
    }

    private RadialGradient m() {
        long k4 = k();
        RadialGradient i4 = this.f21289u.i(k4);
        if (i4 != null) {
            return i4;
        }
        PointF h4 = this.f21294z.h();
        PointF h5 = this.f21284A.h();
        com.airbnb.lottie.model.content.d h6 = this.f21293y.h();
        int[] j4 = j(h6.a());
        float[] b4 = h6.b();
        RadialGradient radialGradient = new RadialGradient(h4.x, h4.y, (float) Math.hypot(h5.x - r7, h5.y - r8), j4, b4, Shader.TileMode.CLAMP);
        this.f21289u.p(k4, radialGradient);
        return radialGradient;
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void f(Canvas canvas, Matrix matrix, int i4) {
        Shader m4;
        if (this.f21287s) {
            return;
        }
        d(this.f21290v, matrix, false);
        if (this.f21291w == GradientType.LINEAR) {
            m4 = l();
        } else {
            m4 = m();
        }
        m4.setLocalMatrix(matrix);
        this.f21216i.setShader(m4);
        super.f(canvas, matrix, i4);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f21286r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.model.e
    public <T> void h(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        super.h(t3, jVar);
        if (t3 == com.airbnb.lottie.o.f21824L) {
            com.airbnb.lottie.animation.keyframe.q qVar = this.f21285B;
            if (qVar != null) {
                this.f21213f.G(qVar);
            }
            if (jVar == null) {
                this.f21285B = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f21285B = qVar2;
            qVar2.a(this);
            this.f21213f.i(this.f21285B);
        }
    }
}
