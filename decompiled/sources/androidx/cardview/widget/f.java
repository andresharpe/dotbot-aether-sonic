package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.P;
import androidx.annotation.W;

@W(21)
/* loaded from: classes.dex */
class f extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private float f6420a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f6422c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f6423d;

    /* renamed from: e, reason: collision with root package name */
    private float f6424e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f6427h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f6428i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f6429j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6425f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6426g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f6430k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f6421b = new Paint(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(ColorStateList colorStateList, float f4) {
        this.f6420a = f4;
        e(colorStateList);
        this.f6422c = new RectF();
        this.f6423d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f6427h = colorStateList;
        this.f6421b.setColor(colorStateList.getColorForState(getState(), this.f6427h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f6422c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f6423d.set(rect);
        if (this.f6425f) {
            this.f6423d.inset((int) Math.ceil(g.c(this.f6424e, this.f6420a, this.f6426g)), (int) Math.ceil(g.d(this.f6424e, this.f6420a, this.f6426g)));
            this.f6422c.set(this.f6423d);
        }
    }

    public ColorStateList b() {
        return this.f6427h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f6424e;
    }

    public float d() {
        return this.f6420a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z3;
        Paint paint = this.f6421b;
        if (this.f6428i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f6428i);
            z3 = true;
        } else {
            z3 = false;
        }
        RectF rectF = this.f6422c;
        float f4 = this.f6420a;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        if (z3) {
            paint.setColorFilter(null);
        }
    }

    public void f(@P ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(float f4, boolean z3, boolean z4) {
        if (f4 == this.f6424e && this.f6425f == z3 && this.f6426g == z4) {
            return;
        }
        this.f6424e = f4;
        this.f6425f = z3;
        this.f6426g = z4;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f6423d, this.f6420a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(float f4) {
        if (f4 == this.f6420a) {
            return;
        }
        this.f6420a = f4;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f6429j;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || (((colorStateList = this.f6427h) != null && colorStateList.isStateful()) || super.isStateful())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z3;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f6427h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f6421b.getColor()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f6421b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f6429j;
        if (colorStateList2 != null && (mode = this.f6430k) != null) {
            this.f6428i = a(colorStateList2, mode);
            return true;
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f6421b.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6421b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f6429j = colorStateList;
        this.f6428i = a(colorStateList, this.f6430k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f6430k = mode;
        this.f6428i = a(this.f6429j, mode);
        invalidateSelf();
    }
}
