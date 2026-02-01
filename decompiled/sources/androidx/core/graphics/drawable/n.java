package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.W;
import java.lang.reflect.Method;

@W(21)
/* loaded from: classes.dex */
class n extends m {

    /* renamed from: L, reason: collision with root package name */
    private static final String f12547L = "WrappedDrawableApi21";

    /* renamed from: M, reason: collision with root package name */
    private static Method f12548M;

    n(Drawable drawable) {
        super(drawable);
        g();
    }

    private void g() {
        if (f12548M == null) {
            try {
                f12548M = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e4) {
                Log.w(f12547L, "Failed to retrieve Drawable#isProjected() method", e4);
            }
        }
    }

    @Override // androidx.core.graphics.drawable.m
    protected boolean c() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    @N
    public Rect getDirtyBounds() {
        return this.f12546J.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@N Outline outline) {
        this.f12546J.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f12546J;
        if (drawable != null && (method = f12548M) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e4) {
                Log.w(f12547L, "Error calling Drawable#isProjected() method", e4);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f4, float f5) {
        this.f12546J.setHotspot(f4, f5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        this.f12546J.setHotspotBounds(i4, i5, i6, i7);
    }

    @Override // androidx.core.graphics.drawable.m, android.graphics.drawable.Drawable
    public boolean setState(@N int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.m, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTint(int i4) {
        if (c()) {
            super.setTint(i4);
        } else {
            this.f12546J.setTint(i4);
        }
    }

    @Override // androidx.core.graphics.drawable.m, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f12546J.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.m, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintMode(@N PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f12546J.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(o oVar, Resources resources) {
        super(oVar, resources);
        g();
    }
}
