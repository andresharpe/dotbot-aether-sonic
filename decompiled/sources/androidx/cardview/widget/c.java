package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.P;
import androidx.cardview.widget.g;

/* loaded from: classes.dex */
class c implements e {

    /* renamed from: a, reason: collision with root package name */
    final RectF f6418a = new RectF();

    /* loaded from: classes.dex */
    class a implements g.a {
        a() {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f4, Paint paint) {
            float f5 = 2.0f * f4;
            float width = (rectF.width() - f5) - 1.0f;
            float height = (rectF.height() - f5) - 1.0f;
            if (f4 >= 1.0f) {
                float f6 = f4 + 0.5f;
                float f7 = -f6;
                c.this.f6418a.set(f7, f7, f6, f6);
                int save = canvas.save();
                canvas.translate(rectF.left + f6, rectF.top + f6);
                canvas.drawArc(c.this.f6418a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f6418a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f6418a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f6418a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f8 = (rectF.left + f6) - 1.0f;
                float f9 = rectF.top;
                canvas.drawRect(f8, f9, (rectF.right - f6) + 1.0f, f9 + f6, paint);
                float f10 = (rectF.left + f6) - 1.0f;
                float f11 = rectF.bottom;
                canvas.drawRect(f10, f11 - f6, (rectF.right - f6) + 1.0f, f11, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f4, rectF.right, rectF.bottom - f4, paint);
        }
    }

    private g p(Context context, ColorStateList colorStateList, float f4, float f5, float f6) {
        return new g(context.getResources(), colorStateList, f4, f5, f6);
    }

    private g q(d dVar) {
        return (g) dVar.f();
    }

    @Override // androidx.cardview.widget.e
    public void a(d dVar, Context context, ColorStateList colorStateList, float f4, float f5, float f6) {
        g p4 = p(context, colorStateList, f4, f5, f6);
        p4.m(dVar.d());
        dVar.c(p4);
        i(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void b(d dVar, float f4) {
        q(dVar).p(f4);
        i(dVar);
    }

    @Override // androidx.cardview.widget.e
    public float c(d dVar) {
        return q(dVar).l();
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return q(dVar).g();
    }

    @Override // androidx.cardview.widget.e
    public void e(d dVar) {
    }

    @Override // androidx.cardview.widget.e
    public void f(d dVar, float f4) {
        q(dVar).r(f4);
    }

    @Override // androidx.cardview.widget.e
    public float g(d dVar) {
        return q(dVar).i();
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList h(d dVar) {
        return q(dVar).f();
    }

    @Override // androidx.cardview.widget.e
    public void i(d dVar) {
        Rect rect = new Rect();
        q(dVar).h(rect);
        dVar.b((int) Math.ceil(l(dVar)), (int) Math.ceil(k(dVar)));
        dVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.e
    public void j() {
        g.f6433s = new a();
    }

    @Override // androidx.cardview.widget.e
    public float k(d dVar) {
        return q(dVar).j();
    }

    @Override // androidx.cardview.widget.e
    public float l(d dVar) {
        return q(dVar).k();
    }

    @Override // androidx.cardview.widget.e
    public void m(d dVar) {
        q(dVar).m(dVar.d());
        i(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, @P ColorStateList colorStateList) {
        q(dVar).o(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public void o(d dVar, float f4) {
        q(dVar).q(f4);
        i(dVar);
    }
}
