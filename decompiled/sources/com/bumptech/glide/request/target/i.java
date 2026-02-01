package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.N;
import androidx.annotation.W;

/* loaded from: classes.dex */
public class i extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f26858a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f26859b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f26860c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f26861d;

    /* renamed from: e, reason: collision with root package name */
    private a f26862e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26863f;

    /* loaded from: classes.dex */
    static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f26864a;

        /* renamed from: b, reason: collision with root package name */
        final int f26865b;

        /* renamed from: c, reason: collision with root package name */
        final int f26866c;

        a(a aVar) {
            this(aVar.f26864a, aVar.f26865b, aVar.f26866c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public Drawable newDrawable() {
            return new i(this, this.f26864a.newDrawable());
        }

        a(Drawable.ConstantState constantState, int i4, int i5) {
            this.f26864a = constantState;
            this.f26865b = i4;
            this.f26866c = i5;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public Drawable newDrawable(Resources resources) {
            return new i(this, this.f26864a.newDrawable(resources));
        }
    }

    public i(Drawable drawable, int i4, int i5) {
        this(new a(drawable.getConstantState(), i4, i5), drawable);
    }

    private void a() {
        this.f26858a.setRectToRect(this.f26859b, this.f26860c, Matrix.ScaleToFit.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f26861d.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@N Canvas canvas) {
        canvas.save();
        canvas.concat(this.f26858a);
        this.f26861d.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @W(19)
    public int getAlpha() {
        return this.f26861d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.f26861d.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f26861d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f26862e;
    }

    @Override // android.graphics.drawable.Drawable
    @N
    public Drawable getCurrent() {
        return this.f26861d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f26862e.f26866c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f26862e.f26865b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f26861d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f26861d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f26861d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@N Rect rect) {
        return this.f26861d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.f26861d.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @N
    public Drawable mutate() {
        if (!this.f26863f && super.mutate() == this) {
            this.f26861d = this.f26861d.mutate();
            this.f26862e = new a(this.f26862e);
            this.f26863f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@N Runnable runnable, long j4) {
        super.scheduleSelf(runnable, j4);
        this.f26861d.scheduleSelf(runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f26861d.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i4, int i5, int i6, int i7) {
        super.setBounds(i4, i5, i6, i7);
        this.f26860c.set(i4, i5, i6, i7);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i4) {
        this.f26861d.setChangingConfigurations(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i4, @N PorterDuff.Mode mode) {
        this.f26861d.setColorFilter(i4, mode);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z3) {
        this.f26861d.setDither(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z3) {
        this.f26861d.setFilterBitmap(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        return this.f26861d.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@N Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f26861d.unscheduleSelf(runnable);
    }

    i(a aVar, Drawable drawable) {
        this.f26862e = (a) com.bumptech.glide.util.l.d(aVar);
        this.f26861d = (Drawable) com.bumptech.glide.util.l.d(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f26858a = new Matrix();
        this.f26859b = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f26860c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f26861d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@N Rect rect) {
        super.setBounds(rect);
        this.f26860c.set(rect);
        a();
    }
}
