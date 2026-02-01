package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.h0;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final q[] f33187a = new q[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f33188b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f33189c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f33190d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f33191e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f33192f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final q f33193g = new q();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f33194h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f33195i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private final Path f33196j = new Path();

    /* renamed from: k, reason: collision with root package name */
    private final Path f33197k = new Path();

    /* renamed from: l, reason: collision with root package name */
    private boolean f33198l = true;

    /* loaded from: classes2.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final p f33199a = new p();

        private a() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public interface b {
        void a(q qVar, Matrix matrix, int i4);

        void b(q qVar, Matrix matrix, int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final o f33200a;

        /* renamed from: b, reason: collision with root package name */
        @N
        public final Path f33201b;

        /* renamed from: c, reason: collision with root package name */
        @N
        public final RectF f33202c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public final b f33203d;

        /* renamed from: e, reason: collision with root package name */
        public final float f33204e;

        c(@N o oVar, float f4, RectF rectF, @P b bVar, Path path) {
            this.f33203d = bVar;
            this.f33200a = oVar;
            this.f33204e = f4;
            this.f33202c = rectF;
            this.f33201b = path;
        }
    }

    public p() {
        for (int i4 = 0; i4 < 4; i4++) {
            this.f33187a[i4] = new q();
            this.f33188b[i4] = new Matrix();
            this.f33189c[i4] = new Matrix();
        }
    }

    private float a(int i4) {
        return (i4 + 1) * 90;
    }

    private void b(@N c cVar, int i4) {
        this.f33194h[0] = this.f33187a[i4].l();
        this.f33194h[1] = this.f33187a[i4].m();
        this.f33188b[i4].mapPoints(this.f33194h);
        if (i4 == 0) {
            Path path = cVar.f33201b;
            float[] fArr = this.f33194h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f33201b;
            float[] fArr2 = this.f33194h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f33187a[i4].d(this.f33188b[i4], cVar.f33201b);
        b bVar = cVar.f33203d;
        if (bVar != null) {
            bVar.a(this.f33187a[i4], this.f33188b[i4], i4);
        }
    }

    private void c(@N c cVar, int i4) {
        int i5 = (i4 + 1) % 4;
        this.f33194h[0] = this.f33187a[i4].j();
        this.f33194h[1] = this.f33187a[i4].k();
        this.f33188b[i4].mapPoints(this.f33194h);
        this.f33195i[0] = this.f33187a[i5].l();
        this.f33195i[1] = this.f33187a[i5].m();
        this.f33188b[i5].mapPoints(this.f33195i);
        float f4 = this.f33194h[0];
        float[] fArr = this.f33195i;
        float max = Math.max(((float) Math.hypot(f4 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float i6 = i(cVar.f33202c, i4);
        this.f33193g.p(0.0f, 0.0f);
        g j4 = j(i4, cVar.f33200a);
        j4.b(max, i6, cVar.f33204e, this.f33193g);
        this.f33196j.reset();
        this.f33193g.d(this.f33189c[i4], this.f33196j);
        if (this.f33198l && (j4.a() || l(this.f33196j, i4) || l(this.f33196j, i5))) {
            Path path = this.f33196j;
            path.op(path, this.f33192f, Path.Op.DIFFERENCE);
            this.f33194h[0] = this.f33193g.l();
            this.f33194h[1] = this.f33193g.m();
            this.f33189c[i4].mapPoints(this.f33194h);
            Path path2 = this.f33191e;
            float[] fArr2 = this.f33194h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f33193g.d(this.f33189c[i4], this.f33191e);
        } else {
            this.f33193g.d(this.f33189c[i4], cVar.f33201b);
        }
        b bVar = cVar.f33203d;
        if (bVar != null) {
            bVar.b(this.f33193g, this.f33189c[i4], i4);
        }
    }

    private void f(int i4, @N RectF rectF, @N PointF pointF) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    pointF.set(rectF.right, rectF.top);
                    return;
                } else {
                    pointF.set(rectF.left, rectF.top);
                    return;
                }
            }
            pointF.set(rectF.left, rectF.bottom);
            return;
        }
        pointF.set(rectF.right, rectF.bottom);
    }

    private d g(int i4, @N o oVar) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return oVar.t();
                }
                return oVar.r();
            }
            return oVar.j();
        }
        return oVar.l();
    }

    private e h(int i4, @N o oVar) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return oVar.s();
                }
                return oVar.q();
            }
            return oVar.i();
        }
        return oVar.k();
    }

    private float i(@N RectF rectF, int i4) {
        float[] fArr = this.f33194h;
        q qVar = this.f33187a[i4];
        fArr[0] = qVar.f33209c;
        fArr[1] = qVar.f33210d;
        this.f33188b[i4].mapPoints(fArr);
        if (i4 != 1 && i4 != 3) {
            return Math.abs(rectF.centerY() - this.f33194h[1]);
        }
        return Math.abs(rectF.centerX() - this.f33194h[0]);
    }

    private g j(int i4, @N o oVar) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return oVar.o();
                }
                return oVar.p();
            }
            return oVar.n();
        }
        return oVar.h();
    }

    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @h0
    public static p k() {
        return a.f33199a;
    }

    @W(19)
    private boolean l(Path path, int i4) {
        this.f33197k.reset();
        this.f33187a[i4].d(this.f33188b[i4], this.f33197k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f33197k.computeBounds(rectF, true);
        path.op(this.f33197k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }

    private void m(@N c cVar, int i4) {
        h(i4, cVar.f33200a).c(this.f33187a[i4], 90.0f, cVar.f33204e, cVar.f33202c, g(i4, cVar.f33200a));
        float a4 = a(i4);
        this.f33188b[i4].reset();
        f(i4, cVar.f33202c, this.f33190d);
        Matrix matrix = this.f33188b[i4];
        PointF pointF = this.f33190d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f33188b[i4].preRotate(a4);
    }

    private void o(int i4) {
        this.f33194h[0] = this.f33187a[i4].j();
        this.f33194h[1] = this.f33187a[i4].k();
        this.f33188b[i4].mapPoints(this.f33194h);
        float a4 = a(i4);
        this.f33189c[i4].reset();
        Matrix matrix = this.f33189c[i4];
        float[] fArr = this.f33194h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f33189c[i4].preRotate(a4);
    }

    public void d(o oVar, float f4, RectF rectF, @N Path path) {
        e(oVar, f4, rectF, null, path);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void e(o oVar, float f4, RectF rectF, b bVar, @N Path path) {
        path.rewind();
        this.f33191e.rewind();
        this.f33192f.rewind();
        this.f33192f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(oVar, f4, rectF, bVar, path);
        for (int i4 = 0; i4 < 4; i4++) {
            m(cVar, i4);
            o(i4);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            b(cVar, i5);
            c(cVar, i5);
        }
        path.close();
        this.f33191e.close();
        if (!this.f33191e.isEmpty()) {
            path.op(this.f33191e, Path.Op.UNION);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(boolean z3) {
        this.f33198l = z3;
    }
}
