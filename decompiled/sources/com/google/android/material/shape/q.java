package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.N;
import androidx.annotation.W;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: j, reason: collision with root package name */
    private static final float f33205j = 270.0f;

    /* renamed from: k, reason: collision with root package name */
    protected static final float f33206k = 180.0f;

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f33207a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f33208b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f33209c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f33210d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f33211e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f33212f;

    /* renamed from: g, reason: collision with root package name */
    private final List<g> f33213g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List<i> f33214h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f33215i;

    /* loaded from: classes2.dex */
    class a extends i {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f33216b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f33217c;

        a(List list, Matrix matrix) {
            this.f33216b = list;
            this.f33217c = matrix;
        }

        @Override // com.google.android.material.shape.q.i
        public void a(Matrix matrix, com.google.android.material.shadow.b bVar, int i4, Canvas canvas) {
            Iterator it = this.f33216b.iterator();
            while (it.hasNext()) {
                ((i) it.next()).a(this.f33217c, bVar, i4, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b extends i {

        /* renamed from: b, reason: collision with root package name */
        private final d f33219b;

        public b(d dVar) {
            this.f33219b = dVar;
        }

        @Override // com.google.android.material.shape.q.i
        public void a(Matrix matrix, @N com.google.android.material.shadow.b bVar, int i4, @N Canvas canvas) {
            bVar.a(canvas, matrix, new RectF(this.f33219b.k(), this.f33219b.o(), this.f33219b.l(), this.f33219b.j()), i4, this.f33219b.m(), this.f33219b.n());
        }
    }

    /* loaded from: classes2.dex */
    static class c extends i {

        /* renamed from: b, reason: collision with root package name */
        private final f f33220b;

        /* renamed from: c, reason: collision with root package name */
        private final float f33221c;

        /* renamed from: d, reason: collision with root package name */
        private final float f33222d;

        public c(f fVar, float f4, float f5) {
            this.f33220b = fVar;
            this.f33221c = f4;
            this.f33222d = f5;
        }

        @Override // com.google.android.material.shape.q.i
        public void a(Matrix matrix, @N com.google.android.material.shadow.b bVar, int i4, @N Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f33220b.f33237c - this.f33222d, this.f33220b.f33236b - this.f33221c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f33221c, this.f33222d);
            matrix2.preRotate(c());
            bVar.b(canvas, matrix2, rectF, i4);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f33220b.f33237c - this.f33222d) / (this.f33220b.f33236b - this.f33221c)));
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends g {

        /* renamed from: h, reason: collision with root package name */
        private static final RectF f33223h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f33224b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f33225c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f33226d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f33227e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f33228f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f33229g;

        public d(float f4, float f5, float f6, float f7) {
            q(f4);
            u(f5);
            r(f6);
            p(f7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f33227e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f33224b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f33226d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f33228f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f33229g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f33225c;
        }

        private void p(float f4) {
            this.f33227e = f4;
        }

        private void q(float f4) {
            this.f33224b = f4;
        }

        private void r(float f4) {
            this.f33226d = f4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f4) {
            this.f33228f = f4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f4) {
            this.f33229g = f4;
        }

        private void u(float f4) {
            this.f33225c = f4;
        }

        @Override // com.google.android.material.shape.q.g
        public void a(@N Matrix matrix, @N Path path) {
            Matrix matrix2 = this.f33238a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f33223h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes2.dex */
    public static class e extends g {

        /* renamed from: b, reason: collision with root package name */
        private float f33230b;

        /* renamed from: c, reason: collision with root package name */
        private float f33231c;

        /* renamed from: d, reason: collision with root package name */
        private float f33232d;

        /* renamed from: e, reason: collision with root package name */
        private float f33233e;

        /* renamed from: f, reason: collision with root package name */
        private float f33234f;

        /* renamed from: g, reason: collision with root package name */
        private float f33235g;

        public e(float f4, float f5, float f6, float f7, float f8, float f9) {
            h(f4);
            j(f5);
            i(f6);
            k(f7);
            l(f8);
            m(f9);
        }

        private float b() {
            return this.f33230b;
        }

        private float c() {
            return this.f33232d;
        }

        private float d() {
            return this.f33231c;
        }

        private float e() {
            return this.f33231c;
        }

        private float f() {
            return this.f33234f;
        }

        private float g() {
            return this.f33235g;
        }

        private void h(float f4) {
            this.f33230b = f4;
        }

        private void i(float f4) {
            this.f33232d = f4;
        }

        private void j(float f4) {
            this.f33231c = f4;
        }

        private void k(float f4) {
            this.f33233e = f4;
        }

        private void l(float f4) {
            this.f33234f = f4;
        }

        private void m(float f4) {
            this.f33235g = f4;
        }

        @Override // com.google.android.material.shape.q.g
        public void a(@N Matrix matrix, @N Path path) {
            Matrix matrix2 = this.f33238a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f33230b, this.f33231c, this.f33232d, this.f33233e, this.f33234f, this.f33235g);
            path.transform(matrix);
        }
    }

    /* loaded from: classes2.dex */
    public static class f extends g {

        /* renamed from: b, reason: collision with root package name */
        private float f33236b;

        /* renamed from: c, reason: collision with root package name */
        private float f33237c;

        @Override // com.google.android.material.shape.q.g
        public void a(@N Matrix matrix, @N Path path) {
            Matrix matrix2 = this.f33238a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f33236b, this.f33237c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        protected final Matrix f33238a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* loaded from: classes2.dex */
    public static class h extends g {

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f33239b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f33240c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f33241d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f33242e;

        private float f() {
            return this.f33239b;
        }

        private float g() {
            return this.f33240c;
        }

        private float h() {
            return this.f33241d;
        }

        private float i() {
            return this.f33242e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(float f4) {
            this.f33239b = f4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(float f4) {
            this.f33240c = f4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(float f4) {
            this.f33241d = f4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(float f4) {
            this.f33242e = f4;
        }

        @Override // com.google.android.material.shape.q.g
        public void a(@N Matrix matrix, @N Path path) {
            Matrix matrix2 = this.f33238a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(f(), g(), h(), i());
            path.transform(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class i {

        /* renamed from: a, reason: collision with root package name */
        static final Matrix f33243a = new Matrix();

        i() {
        }

        public abstract void a(Matrix matrix, com.google.android.material.shadow.b bVar, int i4, Canvas canvas);

        public final void b(com.google.android.material.shadow.b bVar, int i4, Canvas canvas) {
            a(f33243a, bVar, i4, canvas);
        }
    }

    public q() {
        p(0.0f, 0.0f);
    }

    private void b(float f4) {
        if (h() == f4) {
            return;
        }
        float h4 = ((f4 - h()) + 360.0f) % 360.0f;
        if (h4 > f33206k) {
            return;
        }
        d dVar = new d(j(), k(), j(), k());
        dVar.s(h());
        dVar.t(h4);
        this.f33214h.add(new b(dVar));
        r(f4);
    }

    private void c(i iVar, float f4, float f5) {
        b(f4);
        this.f33214h.add(iVar);
        r(f5);
    }

    private float h() {
        return this.f33211e;
    }

    private float i() {
        return this.f33212f;
    }

    private void r(float f4) {
        this.f33211e = f4;
    }

    private void s(float f4) {
        this.f33212f = f4;
    }

    private void t(float f4) {
        this.f33209c = f4;
    }

    private void u(float f4) {
        this.f33210d = f4;
    }

    private void v(float f4) {
        this.f33207a = f4;
    }

    private void w(float f4) {
        this.f33208b = f4;
    }

    public void a(float f4, float f5, float f6, float f7, float f8, float f9) {
        boolean z3;
        float f10;
        d dVar = new d(f4, f5, f6, f7);
        dVar.s(f8);
        dVar.t(f9);
        this.f33213g.add(dVar);
        b bVar = new b(dVar);
        float f11 = f8 + f9;
        if (f9 < 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            f8 = (f8 + f33206k) % 360.0f;
        }
        if (z3) {
            f10 = (f33206k + f11) % 360.0f;
        } else {
            f10 = f11;
        }
        c(bVar, f8, f10);
        double d4 = f11;
        t(((f4 + f6) * 0.5f) + (((f6 - f4) / 2.0f) * ((float) Math.cos(Math.toRadians(d4)))));
        u(((f5 + f7) * 0.5f) + (((f7 - f5) / 2.0f) * ((float) Math.sin(Math.toRadians(d4)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f33213g.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f33213g.get(i4).a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f33215i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public i f(Matrix matrix) {
        b(i());
        return new a(new ArrayList(this.f33214h), new Matrix(matrix));
    }

    @W(21)
    public void g(float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f33213g.add(new e(f4, f5, f6, f7, f8, f9));
        this.f33215i = true;
        t(f8);
        u(f9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f33209c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float k() {
        return this.f33210d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float l() {
        return this.f33207a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float m() {
        return this.f33208b;
    }

    public void n(float f4, float f5) {
        f fVar = new f();
        fVar.f33236b = f4;
        fVar.f33237c = f5;
        this.f33213g.add(fVar);
        c cVar = new c(fVar, j(), k());
        c(cVar, cVar.c() + f33205j, cVar.c() + f33205j);
        t(f4);
        u(f5);
    }

    @W(21)
    public void o(float f4, float f5, float f6, float f7) {
        h hVar = new h();
        hVar.j(f4);
        hVar.k(f5);
        hVar.l(f6);
        hVar.m(f7);
        this.f33213g.add(hVar);
        this.f33215i = true;
        t(f6);
        u(f7);
    }

    public void p(float f4, float f5) {
        q(f4, f5, f33205j, 0.0f);
    }

    public void q(float f4, float f5, float f6, float f7) {
        v(f4);
        w(f5);
        t(f4);
        u(f5);
        r(f6);
        s((f6 + f7) % 360.0f);
        this.f33213g.clear();
        this.f33214h.clear();
        this.f33215i = false;
    }

    public q(float f4, float f5) {
        p(f4, f5);
    }
}
