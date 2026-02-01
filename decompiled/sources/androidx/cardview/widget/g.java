package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.P;
import k.C2075a;

/* loaded from: classes.dex */
class g extends Drawable {

    /* renamed from: q, reason: collision with root package name */
    private static final double f6431q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r, reason: collision with root package name */
    private static final float f6432r = 1.5f;

    /* renamed from: s, reason: collision with root package name */
    static a f6433s;

    /* renamed from: a, reason: collision with root package name */
    private final int f6434a;

    /* renamed from: c, reason: collision with root package name */
    private Paint f6436c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f6437d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f6438e;

    /* renamed from: f, reason: collision with root package name */
    private float f6439f;

    /* renamed from: g, reason: collision with root package name */
    private Path f6440g;

    /* renamed from: h, reason: collision with root package name */
    private float f6441h;

    /* renamed from: i, reason: collision with root package name */
    private float f6442i;

    /* renamed from: j, reason: collision with root package name */
    private float f6443j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f6444k;

    /* renamed from: m, reason: collision with root package name */
    private final int f6446m;

    /* renamed from: n, reason: collision with root package name */
    private final int f6447n;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6445l = true;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6448o = true;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6449p = false;

    /* renamed from: b, reason: collision with root package name */
    private Paint f6435b = new Paint(5);

    /* loaded from: classes.dex */
    interface a {
        void a(Canvas canvas, RectF rectF, float f4, Paint paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Resources resources, ColorStateList colorStateList, float f4, float f5, float f6) {
        this.f6446m = resources.getColor(C2075a.b.f51552d);
        this.f6447n = resources.getColor(C2075a.b.f51551c);
        this.f6434a = resources.getDimensionPixelSize(C2075a.c.f51553a);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f6436c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f6439f = (int) (f4 + 0.5f);
        this.f6438e = new RectF();
        Paint paint2 = new Paint(this.f6436c);
        this.f6437d = paint2;
        paint2.setAntiAlias(false);
        s(f5, f6);
    }

    private void a(Rect rect) {
        float f4 = this.f6441h;
        float f5 = f6432r * f4;
        this.f6438e.set(rect.left + f4, rect.top + f5, rect.right - f4, rect.bottom - f5);
        b();
    }

    private void b() {
        float f4 = this.f6439f;
        RectF rectF = new RectF(-f4, -f4, f4, f4);
        RectF rectF2 = new RectF(rectF);
        float f5 = this.f6442i;
        rectF2.inset(-f5, -f5);
        Path path = this.f6440g;
        if (path == null) {
            this.f6440g = new Path();
        } else {
            path.reset();
        }
        this.f6440g.setFillType(Path.FillType.EVEN_ODD);
        this.f6440g.moveTo(-this.f6439f, 0.0f);
        this.f6440g.rLineTo(-this.f6442i, 0.0f);
        this.f6440g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f6440g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f6440g.close();
        float f6 = this.f6439f;
        float f7 = f6 / (this.f6442i + f6);
        Paint paint = this.f6436c;
        float f8 = this.f6439f + this.f6442i;
        int i4 = this.f6446m;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f8, new int[]{i4, i4, this.f6447n}, new float[]{0.0f, f7, 1.0f}, tileMode));
        Paint paint2 = this.f6437d;
        float f9 = this.f6439f;
        float f10 = this.f6442i;
        float f11 = (-f9) + f10;
        float f12 = (-f9) - f10;
        int i5 = this.f6446m;
        paint2.setShader(new LinearGradient(0.0f, f11, 0.0f, f12, new int[]{i5, i5, this.f6447n}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        this.f6437d.setAntiAlias(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(float f4, float f5, boolean z3) {
        if (z3) {
            return (float) (f4 + ((1.0d - f6431q) * f5));
        }
        return f4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(float f4, float f5, boolean z3) {
        if (z3) {
            return (float) ((f4 * f6432r) + ((1.0d - f6431q) * f5));
        }
        return f4 * f6432r;
    }

    private void e(Canvas canvas) {
        boolean z3;
        boolean z4;
        float f4 = this.f6439f;
        float f5 = (-f4) - this.f6442i;
        float f6 = f4 + this.f6434a + (this.f6443j / 2.0f);
        float f7 = f6 * 2.0f;
        if (this.f6438e.width() - f7 > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f6438e.height() - f7 > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        int save = canvas.save();
        RectF rectF = this.f6438e;
        canvas.translate(rectF.left + f6, rectF.top + f6);
        canvas.drawPath(this.f6440g, this.f6436c);
        if (z3) {
            canvas.drawRect(0.0f, f5, this.f6438e.width() - f7, -this.f6439f, this.f6437d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f6438e;
        canvas.translate(rectF2.right - f6, rectF2.bottom - f6);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f6440g, this.f6436c);
        if (z3) {
            canvas.drawRect(0.0f, f5, this.f6438e.width() - f7, (-this.f6439f) + this.f6442i, this.f6437d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f6438e;
        canvas.translate(rectF3.left + f6, rectF3.bottom - f6);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f6440g, this.f6436c);
        if (z4) {
            canvas.drawRect(0.0f, f5, this.f6438e.height() - f7, -this.f6439f, this.f6437d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f6438e;
        canvas.translate(rectF4.right - f6, rectF4.top + f6);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f6440g, this.f6436c);
        if (z4) {
            canvas.drawRect(0.0f, f5, this.f6438e.height() - f7, -this.f6439f, this.f6437d);
        }
        canvas.restoreToCount(save4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f6444k = colorStateList;
        this.f6435b.setColor(colorStateList.getColorForState(getState(), this.f6444k.getDefaultColor()));
    }

    private void s(float f4, float f5) {
        if (f4 >= 0.0f) {
            if (f5 >= 0.0f) {
                float t3 = t(f4);
                float t4 = t(f5);
                if (t3 > t4) {
                    if (!this.f6449p) {
                        this.f6449p = true;
                    }
                    t3 = t4;
                }
                if (this.f6443j == t3 && this.f6441h == t4) {
                    return;
                }
                this.f6443j = t3;
                this.f6441h = t4;
                this.f6442i = (int) ((t3 * f6432r) + this.f6434a + 0.5f);
                this.f6445l = true;
                invalidateSelf();
                return;
            }
            throw new IllegalArgumentException("Invalid max shadow size " + f5 + ". Must be >= 0");
        }
        throw new IllegalArgumentException("Invalid shadow size " + f4 + ". Must be >= 0");
    }

    private int t(float f4) {
        int i4 = (int) (f4 + 0.5f);
        if (i4 % 2 == 1) {
            return i4 - 1;
        }
        return i4;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f6445l) {
            a(getBounds());
            this.f6445l = false;
        }
        canvas.translate(0.0f, this.f6443j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f6443j) / 2.0f);
        f6433s.a(canvas, this.f6438e, this.f6439f, this.f6435b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.f6444k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.f6439f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(d(this.f6441h, this.f6439f, this.f6448o));
        int ceil2 = (int) Math.ceil(c(this.f6441h, this.f6439f, this.f6448o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Rect rect) {
        getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f6441h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f6444k;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        float f4 = this.f6441h;
        return (Math.max(f4, this.f6439f + this.f6434a + ((f4 * f6432r) / 2.0f)) * 2.0f) + (((this.f6441h * f6432r) + this.f6434a) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float k() {
        float f4 = this.f6441h;
        return (Math.max(f4, this.f6439f + this.f6434a + (f4 / 2.0f)) * 2.0f) + ((this.f6441h + this.f6434a) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float l() {
        return this.f6443j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(boolean z3) {
        this.f6448o = z3;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(@P ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6445l = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f6444k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f6435b.getColor() == colorForState) {
            return false;
        }
        this.f6435b.setColor(colorForState);
        this.f6445l = true;
        invalidateSelf();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(float f4) {
        if (f4 >= 0.0f) {
            float f5 = (int) (f4 + 0.5f);
            if (this.f6439f == f5) {
                return;
            }
            this.f6439f = f5;
            this.f6445l = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f4 + ". Must be >= 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(float f4) {
        s(this.f6443j, f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(float f4) {
        s(f4, this.f6441h);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f6435b.setAlpha(i4);
        this.f6436c.setAlpha(i4);
        this.f6437d.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6435b.setColorFilter(colorFilter);
    }
}
