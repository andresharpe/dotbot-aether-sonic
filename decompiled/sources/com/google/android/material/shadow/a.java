package com.google.android.material.shadow;

import T0.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.N;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import androidx.core.content.C0669d;

@Deprecated
/* loaded from: classes2.dex */
public class a extends DrawableWrapper {

    /* renamed from: q, reason: collision with root package name */
    static final double f33053q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r, reason: collision with root package name */
    static final float f33054r = 1.5f;

    /* renamed from: s, reason: collision with root package name */
    static final float f33055s = 0.25f;

    /* renamed from: t, reason: collision with root package name */
    static final float f33056t = 0.5f;

    /* renamed from: u, reason: collision with root package name */
    static final float f33057u = 1.0f;

    /* renamed from: a, reason: collision with root package name */
    @N
    final Paint f33058a;

    /* renamed from: b, reason: collision with root package name */
    @N
    final Paint f33059b;

    /* renamed from: c, reason: collision with root package name */
    @N
    final RectF f33060c;

    /* renamed from: d, reason: collision with root package name */
    float f33061d;

    /* renamed from: e, reason: collision with root package name */
    Path f33062e;

    /* renamed from: f, reason: collision with root package name */
    float f33063f;

    /* renamed from: g, reason: collision with root package name */
    float f33064g;

    /* renamed from: h, reason: collision with root package name */
    float f33065h;

    /* renamed from: i, reason: collision with root package name */
    float f33066i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f33067j;

    /* renamed from: k, reason: collision with root package name */
    private final int f33068k;

    /* renamed from: l, reason: collision with root package name */
    private final int f33069l;

    /* renamed from: m, reason: collision with root package name */
    private final int f33070m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f33071n;

    /* renamed from: o, reason: collision with root package name */
    private float f33072o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f33073p;

    public a(Context context, Drawable drawable, float f4, float f5, float f6) {
        super(drawable);
        this.f33067j = true;
        this.f33071n = true;
        this.f33073p = false;
        this.f33068k = C0669d.f(context, a.e.f2255z0);
        this.f33069l = C0669d.f(context, a.e.f2251y0);
        this.f33070m = C0669d.f(context, a.e.f2247x0);
        Paint paint = new Paint(5);
        this.f33058a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f33061d = Math.round(f4);
        this.f33060c = new RectF();
        Paint paint2 = new Paint(paint);
        this.f33059b = paint2;
        paint2.setAntiAlias(false);
        u(f5, f6);
    }

    private void a(@N Rect rect) {
        float f4 = this.f33064g;
        float f5 = f33054r * f4;
        this.f33060c.set(rect.left + f4, rect.top + f5, rect.right - f4, rect.bottom - f5);
        Drawable wrappedDrawable = getWrappedDrawable();
        RectF rectF = this.f33060c;
        wrappedDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        b();
    }

    private void b() {
        float f4 = this.f33061d;
        RectF rectF = new RectF(-f4, -f4, f4, f4);
        RectF rectF2 = new RectF(rectF);
        float f5 = this.f33065h;
        rectF2.inset(-f5, -f5);
        Path path = this.f33062e;
        if (path == null) {
            this.f33062e = new Path();
        } else {
            path.reset();
        }
        this.f33062e.setFillType(Path.FillType.EVEN_ODD);
        this.f33062e.moveTo(-this.f33061d, 0.0f);
        this.f33062e.rLineTo(-this.f33065h, 0.0f);
        this.f33062e.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f33062e.arcTo(rectF, 270.0f, -90.0f, false);
        this.f33062e.close();
        float f6 = -rectF2.top;
        if (f6 > 0.0f) {
            float f7 = this.f33061d / f6;
            this.f33058a.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{0, this.f33068k, this.f33069l, this.f33070m}, new float[]{0.0f, f7, ((1.0f - f7) / 2.0f) + f7, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f33059b.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f33068k, this.f33069l, this.f33070m}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f33059b.setAntiAlias(false);
    }

    public static float c(float f4, float f5, boolean z3) {
        if (z3) {
            return (float) (f4 + ((1.0d - f33053q) * f5));
        }
        return f4;
    }

    public static float d(float f4, float f5, boolean z3) {
        if (z3) {
            return (float) ((f4 * f33054r) + ((1.0d - f33053q) * f5));
        }
        return f4 * f33054r;
    }

    private void f(@N Canvas canvas) {
        boolean z3;
        boolean z4;
        int i4;
        float f4;
        int i5;
        float f5;
        float f6;
        float f7;
        int save = canvas.save();
        canvas.rotate(this.f33072o, this.f33060c.centerX(), this.f33060c.centerY());
        float f8 = this.f33061d;
        float f9 = (-f8) - this.f33065h;
        float f10 = f8 * 2.0f;
        if (this.f33060c.width() - f10 > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f33060c.height() - f10 > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        float f11 = this.f33066i;
        float f12 = f8 / ((f11 - (0.5f * f11)) + f8);
        float f13 = f8 / ((f11 - (f33055s * f11)) + f8);
        float f14 = f8 / ((f11 - (f11 * 1.0f)) + f8);
        int save2 = canvas.save();
        RectF rectF = this.f33060c;
        canvas.translate(rectF.left + f8, rectF.top + f8);
        canvas.scale(f12, f13);
        canvas.drawPath(this.f33062e, this.f33058a);
        if (z3) {
            canvas.scale(1.0f / f12, 1.0f);
            i4 = save2;
            f4 = f14;
            i5 = save;
            f5 = f13;
            canvas.drawRect(0.0f, f9, this.f33060c.width() - f10, -this.f33061d, this.f33059b);
        } else {
            i4 = save2;
            f4 = f14;
            i5 = save;
            f5 = f13;
        }
        canvas.restoreToCount(i4);
        int save3 = canvas.save();
        RectF rectF2 = this.f33060c;
        canvas.translate(rectF2.right - f8, rectF2.bottom - f8);
        float f15 = f4;
        canvas.scale(f12, f15);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f33062e, this.f33058a);
        if (z3) {
            canvas.scale(1.0f / f12, 1.0f);
            f6 = f5;
            f7 = f15;
            canvas.drawRect(0.0f, f9, this.f33060c.width() - f10, (-this.f33061d) + this.f33065h, this.f33059b);
        } else {
            f6 = f5;
            f7 = f15;
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.f33060c;
        canvas.translate(rectF3.left + f8, rectF3.bottom - f8);
        canvas.scale(f12, f7);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f33062e, this.f33058a);
        if (z4) {
            canvas.scale(1.0f / f7, 1.0f);
            canvas.drawRect(0.0f, f9, this.f33060c.height() - f10, -this.f33061d, this.f33059b);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.f33060c;
        canvas.translate(rectF4.right - f8, rectF4.top + f8);
        float f16 = f6;
        canvas.scale(f12, f16);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f33062e, this.f33058a);
        if (z4) {
            canvas.scale(1.0f / f16, 1.0f);
            canvas.drawRect(0.0f, f9, this.f33060c.height() - f10, -this.f33061d, this.f33059b);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(i5);
    }

    private static int v(float f4) {
        int round = Math.round(f4);
        if (round % 2 == 1) {
            return round - 1;
        }
        return round;
    }

    public void e(@N Canvas canvas) {
        if (this.f33067j) {
            a(getBounds());
            this.f33067j = false;
        }
        f(canvas);
        super.draw(canvas);
    }

    public float g() {
        return this.f33061d;
    }

    public float h() {
        return this.f33064g;
    }

    public float i() {
        float f4 = this.f33064g;
        return (Math.max(f4, this.f33061d + ((f4 * f33054r) / 2.0f)) * 2.0f) + (this.f33064g * f33054r * 2.0f);
    }

    public float j() {
        float f4 = this.f33064g;
        return (Math.max(f4, this.f33061d + (f4 / 2.0f)) * 2.0f) + (this.f33064g * 2.0f);
    }

    public int k() {
        return -3;
    }

    public boolean l(@N Rect rect) {
        int ceil = (int) Math.ceil(d(this.f33064g, this.f33061d, this.f33071n));
        int ceil2 = (int) Math.ceil(c(this.f33064g, this.f33061d, this.f33071n));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float m() {
        return this.f33066i;
    }

    protected void n(Rect rect) {
        this.f33067j = true;
    }

    public void o(boolean z3) {
        this.f33071n = z3;
        invalidateSelf();
    }

    public void p(int i4) {
        super.setAlpha(i4);
        this.f33058a.setAlpha(i4);
        this.f33059b.setAlpha(i4);
    }

    public void q(float f4) {
        float round = Math.round(f4);
        if (this.f33061d == round) {
            return;
        }
        this.f33061d = round;
        this.f33067j = true;
        invalidateSelf();
    }

    public void r(float f4) {
        u(this.f33066i, f4);
    }

    public final void s(float f4) {
        if (this.f33072o != f4) {
            this.f33072o = f4;
            invalidateSelf();
        }
    }

    public void t(float f4) {
        u(f4, this.f33064g);
    }

    public void u(float f4, float f5) {
        if (f4 >= 0.0f && f5 >= 0.0f) {
            float v3 = v(f4);
            float v4 = v(f5);
            if (v3 > v4) {
                if (!this.f33073p) {
                    this.f33073p = true;
                }
                v3 = v4;
            }
            if (this.f33066i == v3 && this.f33064g == v4) {
                return;
            }
            this.f33066i = v3;
            this.f33064g = v4;
            this.f33065h = Math.round(v3 * f33054r);
            this.f33063f = v4;
            this.f33067j = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("invalid shadow size");
    }
}
