package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.r;
import androidx.core.graphics.C0734z;
import com.google.android.material.shape.o;
import com.google.android.material.shape.p;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class c extends Drawable {

    /* renamed from: q, reason: collision with root package name */
    private static final float f32375q = 1.3333f;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final Paint f32377b;

    /* renamed from: h, reason: collision with root package name */
    @r
    float f32383h;

    /* renamed from: i, reason: collision with root package name */
    @InterfaceC0569l
    private int f32384i;

    /* renamed from: j, reason: collision with root package name */
    @InterfaceC0569l
    private int f32385j;

    /* renamed from: k, reason: collision with root package name */
    @InterfaceC0569l
    private int f32386k;

    /* renamed from: l, reason: collision with root package name */
    @InterfaceC0569l
    private int f32387l;

    /* renamed from: m, reason: collision with root package name */
    @InterfaceC0569l
    private int f32388m;

    /* renamed from: o, reason: collision with root package name */
    private o f32390o;

    /* renamed from: p, reason: collision with root package name */
    @P
    private ColorStateList f32391p;

    /* renamed from: a, reason: collision with root package name */
    private final p f32376a = p.k();

    /* renamed from: c, reason: collision with root package name */
    private final Path f32378c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final Rect f32379d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final RectF f32380e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    private final RectF f32381f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final b f32382g = new b();

    /* renamed from: n, reason: collision with root package name */
    private boolean f32389n = true;

    /* loaded from: classes2.dex */
    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public Drawable newDrawable() {
            return c.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(o oVar) {
        this.f32390o = oVar;
        Paint paint = new Paint(1);
        this.f32377b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @N
    private Shader a() {
        copyBounds(this.f32379d);
        float height = this.f32383h / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{C0734z.t(this.f32384i, this.f32388m), C0734z.t(this.f32385j, this.f32388m), C0734z.t(C0734z.B(this.f32385j, 0), this.f32388m), C0734z.t(C0734z.B(this.f32387l, 0), this.f32388m), C0734z.t(this.f32387l, this.f32388m), C0734z.t(this.f32386k, this.f32388m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    @N
    protected RectF b() {
        this.f32381f.set(getBounds());
        return this.f32381f;
    }

    public o c() {
        return this.f32390o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(@P ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f32388m = colorStateList.getColorForState(getState(), this.f32388m);
        }
        this.f32391p = colorStateList;
        this.f32389n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@N Canvas canvas) {
        if (this.f32389n) {
            this.f32377b.setShader(a());
            this.f32389n = false;
        }
        float strokeWidth = this.f32377b.getStrokeWidth() / 2.0f;
        copyBounds(this.f32379d);
        this.f32380e.set(this.f32379d);
        float min = Math.min(this.f32390o.r().a(b()), this.f32380e.width() / 2.0f);
        if (this.f32390o.u(b())) {
            this.f32380e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f32380e, min, min, this.f32377b);
        }
    }

    public void e(@r float f4) {
        if (this.f32383h != f4) {
            this.f32383h = f4;
            this.f32377b.setStrokeWidth(f4 * f32375q);
            this.f32389n = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(@InterfaceC0569l int i4, @InterfaceC0569l int i5, @InterfaceC0569l int i6, @InterfaceC0569l int i7) {
        this.f32384i = i4;
        this.f32385j = i5;
        this.f32386k = i6;
        this.f32387l = i7;
    }

    public void g(o oVar) {
        this.f32390o = oVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @P
    public Drawable.ConstantState getConstantState() {
        return this.f32382g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f32383h > 0.0f) {
            return -3;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@N Outline outline) {
        if (this.f32390o.u(b())) {
            outline.setRoundRect(getBounds(), this.f32390o.r().a(b()));
            return;
        }
        copyBounds(this.f32379d);
        this.f32380e.set(this.f32379d);
        this.f32376a.d(this.f32390o, 1.0f, this.f32380e, this.f32378c);
        if (this.f32378c.isConvex()) {
            outline.setConvexPath(this.f32378c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@N Rect rect) {
        if (this.f32390o.u(b())) {
            int round = Math.round(this.f32383h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f32391p;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f32389n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f32391p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f32388m)) != this.f32388m) {
            this.f32389n = true;
            this.f32388m = colorForState;
        }
        if (this.f32389n) {
            invalidateSelf();
        }
        return this.f32389n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@F(from = 0, to = 255) int i4) {
        this.f32377b.setAlpha(i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@P ColorFilter colorFilter) {
        this.f32377b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
