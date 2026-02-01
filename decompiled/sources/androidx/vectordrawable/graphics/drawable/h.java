package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.k;

/* loaded from: classes.dex */
abstract class h extends Drawable implements k {

    /* renamed from: E, reason: collision with root package name */
    Drawable f20311E;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.i(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.setLevel(i4);
        }
        return super.onLevelChange(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i4) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.setChangingConfigurations(i4);
        } else {
            super.setChangingConfigurations(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i4, PorterDuff.Mode mode) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.setColorFilter(i4, mode);
        } else {
            super.setColorFilter(i4, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z3) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.setFilterBitmap(z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f4, float f5) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.k(drawable, f4, f5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.l(drawable, i4, i5, i6, i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }
}
