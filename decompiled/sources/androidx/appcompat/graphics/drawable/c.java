package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.P;

/* loaded from: classes.dex */
public class c extends Drawable implements Drawable.Callback {

    /* renamed from: E, reason: collision with root package name */
    private Drawable f5087E;

    public c(Drawable drawable) {
        b(drawable);
    }

    @P
    public Drawable a() {
        return this.f5087E;
    }

    public void b(@P Drawable drawable) {
        Drawable drawable2 = this.f5087E;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f5087E = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f5087E.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f5087E.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f5087E.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5087E.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5087E.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f5087E.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f5087E.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f5087E.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f5087E.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f5087E.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f5087E.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return androidx.core.graphics.drawable.d.h(this.f5087E);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f5087E.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f5087E.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f5087E.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        return this.f5087E.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        scheduleSelf(runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f5087E.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z3) {
        androidx.core.graphics.drawable.d.j(this.f5087E, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i4) {
        this.f5087E.setChangingConfigurations(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5087E.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z3) {
        this.f5087E.setDither(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z3) {
        this.f5087E.setFilterBitmap(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f4, float f5) {
        androidx.core.graphics.drawable.d.k(this.f5087E, f4, f5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        androidx.core.graphics.drawable.d.l(this.f5087E, i4, i5, i6, i7);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f5087E.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i4) {
        androidx.core.graphics.drawable.d.n(this.f5087E, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.d.o(this.f5087E, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        androidx.core.graphics.drawable.d.p(this.f5087E, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        if (!super.setVisible(z3, z4) && !this.f5087E.setVisible(z3, z4)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
