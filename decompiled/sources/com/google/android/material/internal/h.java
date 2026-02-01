package com.google.android.material.internal;

import T0.a;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.appcompat.widget.LinearLayoutCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class h extends LinearLayoutCompat {

    /* renamed from: i0, reason: collision with root package name */
    @P
    private Drawable f32624i0;

    /* renamed from: j0, reason: collision with root package name */
    private final Rect f32625j0;

    /* renamed from: k0, reason: collision with root package name */
    private final Rect f32626k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f32627l0;

    /* renamed from: m0, reason: collision with root package name */
    protected boolean f32628m0;

    /* renamed from: n0, reason: collision with root package name */
    boolean f32629n0;

    public h(@N Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@N Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f32624i0;
        if (drawable != null) {
            if (this.f32629n0) {
                this.f32629n0 = false;
                Rect rect = this.f32625j0;
                Rect rect2 = this.f32626k0;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f32628m0) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f32627l0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    @W(21)
    public void drawableHotspotChanged(float f4, float f5) {
        super.drawableHotspotChanged(f4, f5);
        Drawable drawable = this.f32624i0;
        if (drawable != null) {
            drawable.setHotspot(f4, f5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f32624i0;
        if (drawable != null && drawable.isStateful()) {
            this.f32624i0.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    @P
    public Drawable getForeground() {
        return this.f32624i0;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f32627l0;
    }

    @Override // android.view.ViewGroup, android.view.View
    @W(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f32624i0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        this.f32629n0 = z3 | this.f32629n0;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f32629n0 = true;
    }

    @Override // android.view.View
    public void setForeground(@P Drawable drawable) {
        Drawable drawable2 = this.f32624i0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f32624i0);
            }
            this.f32624i0 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f32627l0 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i4) {
        if (this.f32627l0 != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= androidx.core.view.C.f13101b;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f32627l0 = i4;
            if (i4 == 119 && this.f32624i0 != null) {
                this.f32624i0.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f32624i0) {
            return false;
        }
        return true;
    }

    public h(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f32625j0 = new Rect();
        this.f32626k0 = new Rect();
        this.f32627l0 = 119;
        this.f32628m0 = true;
        this.f32629n0 = false;
        TypedArray j4 = w.j(context, attributeSet, a.o.eg, i4, 0, new int[0]);
        this.f32627l0 = j4.getInt(a.o.gg, this.f32627l0);
        Drawable drawable = j4.getDrawable(a.o.fg);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f32628m0 = j4.getBoolean(a.o.hg, true);
        j4.recycle();
    }
}
