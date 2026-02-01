package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;

/* loaded from: classes.dex */
class m extends Drawable implements Drawable.Callback, l, k {

    /* renamed from: K, reason: collision with root package name */
    static final PorterDuff.Mode f12540K = PorterDuff.Mode.SRC_IN;

    /* renamed from: E, reason: collision with root package name */
    private int f12541E;

    /* renamed from: F, reason: collision with root package name */
    private PorterDuff.Mode f12542F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f12543G;

    /* renamed from: H, reason: collision with root package name */
    o f12544H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f12545I;

    /* renamed from: J, reason: collision with root package name */
    Drawable f12546J;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(@N o oVar, @P Resources resources) {
        this.f12544H = oVar;
        e(resources);
    }

    @N
    private o d() {
        return new o(this.f12544H);
    }

    private void e(@P Resources resources) {
        Drawable.ConstantState constantState;
        o oVar = this.f12544H;
        if (oVar != null && (constantState = oVar.f12550b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        o oVar = this.f12544H;
        ColorStateList colorStateList = oVar.f12551c;
        PorterDuff.Mode mode = oVar.f12552d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f12543G || colorForState != this.f12541E || mode != this.f12542F) {
                setColorFilter(colorForState, mode);
                this.f12541E = colorForState;
                this.f12542F = mode;
                this.f12543G = true;
                return true;
            }
        } else {
            this.f12543G = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.l
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f12546J;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f12546J = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            o oVar = this.f12544H;
            if (oVar != null) {
                oVar.f12550b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.l
    public final Drawable b() {
        return this.f12546J;
    }

    protected boolean c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@N Canvas canvas) {
        this.f12546J.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int i4;
        int changingConfigurations = super.getChangingConfigurations();
        o oVar = this.f12544H;
        if (oVar != null) {
            i4 = oVar.getChangingConfigurations();
        } else {
            i4 = 0;
        }
        return changingConfigurations | i4 | this.f12546J.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @P
    public Drawable.ConstantState getConstantState() {
        o oVar = this.f12544H;
        if (oVar != null && oVar.a()) {
            this.f12544H.f12549a = getChangingConfigurations();
            return this.f12544H;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @N
    public Drawable getCurrent() {
        return this.f12546J.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f12546J.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f12546J.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @W(23)
    public int getLayoutDirection() {
        return d.f(this.f12546J);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f12546J.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f12546J.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f12546J.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@N Rect rect) {
        return this.f12546J.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @N
    public int[] getState() {
        return this.f12546J.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f12546J.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@N Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @W(19)
    public boolean isAutoMirrored() {
        return d.h(this.f12546J);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        o oVar;
        if (c() && (oVar = this.f12544H) != null) {
            colorStateList = oVar.f12551c;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.f12546J.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f12546J.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @N
    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f12545I && super.mutate() == this) {
            this.f12544H = d();
            Drawable drawable = this.f12546J;
            if (drawable != null) {
                drawable.mutate();
            }
            o oVar = this.f12544H;
            if (oVar != null) {
                Drawable drawable2 = this.f12546J;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                oVar.f12550b = constantState;
            }
            this.f12545I = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f12546J;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @W(23)
    public boolean onLayoutDirectionChanged(int i4) {
        return d.m(this.f12546J, i4);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        return this.f12546J.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@N Drawable drawable, @N Runnable runnable, long j4) {
        scheduleSelf(runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f12546J.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    @W(19)
    public void setAutoMirrored(boolean z3) {
        d.j(this.f12546J, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i4) {
        this.f12546J.setChangingConfigurations(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12546J.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z3) {
        this.f12546J.setDither(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z3) {
        this.f12546J.setFilterBitmap(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@N int[] iArr) {
        boolean state = this.f12546J.setState(iArr);
        if (!f(iArr) && !state) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintList(ColorStateList colorStateList) {
        this.f12544H.f12551c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintMode(@N PorterDuff.Mode mode) {
        this.f12544H.f12552d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        if (!super.setVisible(z3, z4) && !this.f12546J.setVisible(z3, z4)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@N Drawable drawable, @N Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(@P Drawable drawable) {
        this.f12544H = d();
        a(drawable);
    }
}
