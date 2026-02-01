package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.annotation.N;
import androidx.annotation.P;
import com.harman.sdk.message.GestureInfo;

/* loaded from: classes.dex */
public abstract class i extends Drawable {

    /* renamed from: n, reason: collision with root package name */
    private static final int f12525n = 3;

    /* renamed from: a, reason: collision with root package name */
    final Bitmap f12526a;

    /* renamed from: b, reason: collision with root package name */
    private int f12527b;

    /* renamed from: e, reason: collision with root package name */
    private final BitmapShader f12530e;

    /* renamed from: g, reason: collision with root package name */
    private float f12532g;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12536k;

    /* renamed from: l, reason: collision with root package name */
    private int f12537l;

    /* renamed from: m, reason: collision with root package name */
    private int f12538m;

    /* renamed from: c, reason: collision with root package name */
    private int f12528c = 119;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f12529d = new Paint(3);

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f12531f = new Matrix();

    /* renamed from: h, reason: collision with root package name */
    final Rect f12533h = new Rect();

    /* renamed from: i, reason: collision with root package name */
    private final RectF f12534i = new RectF();

    /* renamed from: j, reason: collision with root package name */
    private boolean f12535j = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Resources resources, Bitmap bitmap) {
        this.f12527b = GestureInfo.f48257q0;
        if (resources != null) {
            this.f12527b = resources.getDisplayMetrics().densityDpi;
        }
        this.f12526a = bitmap;
        if (bitmap != null) {
            a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f12530e = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f12538m = -1;
            this.f12537l = -1;
            this.f12530e = null;
        }
    }

    private void a() {
        this.f12537l = this.f12526a.getScaledWidth(this.f12527b);
        this.f12538m = this.f12526a.getScaledHeight(this.f12527b);
    }

    private static boolean j(float f4) {
        return f4 > 0.05f;
    }

    private void s() {
        this.f12532g = Math.min(this.f12538m, this.f12537l) / 2;
    }

    @P
    public final Bitmap b() {
        return this.f12526a;
    }

    public float c() {
        return this.f12532g;
    }

    public int d() {
        return this.f12528c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@N Canvas canvas) {
        Bitmap bitmap = this.f12526a;
        if (bitmap == null) {
            return;
        }
        t();
        if (this.f12529d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f12533h, this.f12529d);
            return;
        }
        RectF rectF = this.f12534i;
        float f4 = this.f12532g;
        canvas.drawRoundRect(rectF, f4, f4, this.f12529d);
    }

    @N
    public final Paint e() {
        return this.f12529d;
    }

    void f(int i4, int i5, int i6, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return this.f12529d.isAntiAlias();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f12529d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f12529d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f12538m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f12537l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        if (this.f12528c != 119 || this.f12536k || (bitmap = this.f12526a) == null || bitmap.hasAlpha() || this.f12529d.getAlpha() < 255 || j(this.f12532g)) {
            return -3;
        }
        return -1;
    }

    public boolean h() {
        throw new UnsupportedOperationException();
    }

    public boolean i() {
        return this.f12536k;
    }

    public void k(boolean z3) {
        this.f12529d.setAntiAlias(z3);
        invalidateSelf();
    }

    public void l(boolean z3) {
        this.f12536k = z3;
        this.f12535j = true;
        if (z3) {
            s();
            this.f12529d.setShader(this.f12530e);
            invalidateSelf();
            return;
        }
        m(0.0f);
    }

    public void m(float f4) {
        if (this.f12532g == f4) {
            return;
        }
        this.f12536k = false;
        if (j(f4)) {
            this.f12529d.setShader(this.f12530e);
        } else {
            this.f12529d.setShader(null);
        }
        this.f12532g = f4;
        invalidateSelf();
    }

    public void n(int i4) {
        if (this.f12528c != i4) {
            this.f12528c = i4;
            this.f12535j = true;
            invalidateSelf();
        }
    }

    public void o(boolean z3) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@N Rect rect) {
        super.onBoundsChange(rect);
        if (this.f12536k) {
            s();
        }
        this.f12535j = true;
    }

    public void p(int i4) {
        if (this.f12527b != i4) {
            if (i4 == 0) {
                i4 = GestureInfo.f48257q0;
            }
            this.f12527b = i4;
            if (this.f12526a != null) {
                a();
            }
            invalidateSelf();
        }
    }

    public void q(@N Canvas canvas) {
        p(canvas.getDensity());
    }

    public void r(@N DisplayMetrics displayMetrics) {
        p(displayMetrics.densityDpi);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (i4 != this.f12529d.getAlpha()) {
            this.f12529d.setAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12529d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z3) {
        this.f12529d.setDither(z3);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z3) {
        this.f12529d.setFilterBitmap(z3);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        if (this.f12535j) {
            if (this.f12536k) {
                int min = Math.min(this.f12537l, this.f12538m);
                f(this.f12528c, min, min, getBounds(), this.f12533h);
                int min2 = Math.min(this.f12533h.width(), this.f12533h.height());
                this.f12533h.inset(Math.max(0, (this.f12533h.width() - min2) / 2), Math.max(0, (this.f12533h.height() - min2) / 2));
                this.f12532g = min2 * 0.5f;
            } else {
                f(this.f12528c, this.f12537l, this.f12538m, getBounds(), this.f12533h);
            }
            this.f12534i.set(this.f12533h);
            if (this.f12530e != null) {
                Matrix matrix = this.f12531f;
                RectF rectF = this.f12534i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f12531f.preScale(this.f12534i.width() / this.f12526a.getWidth(), this.f12534i.height() / this.f12526a.getHeight());
                this.f12530e.setLocalMatrix(this.f12531f);
                this.f12529d.setShader(this.f12530e);
            }
            this.f12535j = false;
        }
    }
}
