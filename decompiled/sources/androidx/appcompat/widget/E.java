package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.RestrictTo;
import androidx.core.view.InterfaceC0814h0;

/* loaded from: classes.dex */
public class E extends ToggleButton implements InterfaceC0814h0, N, androidx.core.widget.v {

    /* renamed from: E, reason: collision with root package name */
    private final C0593f f5654E;

    /* renamed from: F, reason: collision with root package name */
    private final A f5655F;

    /* renamed from: G, reason: collision with root package name */
    private C0602o f5656G;

    public E(@androidx.annotation.N Context context) {
        this(context, null);
    }

    @androidx.annotation.N
    private C0602o getEmojiTextViewHelper() {
        if (this.f5656G == null) {
            this.f5656G = new C0602o(this);
        }
        return this.f5656G;
    }

    @Override // androidx.appcompat.widget.N
    public boolean b() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0593f c0593f = this.f5654E;
        if (c0593f != null) {
            c0593f.b();
        }
        A a4 = this.f5655F;
        if (a4 != null) {
            a4.b();
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0593f c0593f = this.f5654E;
        if (c0593f != null) {
            return c0593f.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0593f c0593f = this.f5654E;
        if (c0593f != null) {
            return c0593f.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5655F.j();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5655F.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(@androidx.annotation.P Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0593f c0593f = this.f5654E;
        if (c0593f != null) {
            c0593f.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC0578v int i4) {
        super.setBackgroundResource(i4);
        C0593f c0593f = this.f5654E;
        if (c0593f != null) {
            c0593f.g(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.P Drawable drawable, @androidx.annotation.P Drawable drawable2, @androidx.annotation.P Drawable drawable3, @androidx.annotation.P Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        A a4 = this.f5655F;
        if (a4 != null) {
            a4.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.W(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.P Drawable drawable, @androidx.annotation.P Drawable drawable2, @androidx.annotation.P Drawable drawable3, @androidx.annotation.P Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        A a4 = this.f5655F;
        if (a4 != null) {
            a4.p();
        }
    }

    @Override // androidx.appcompat.widget.N
    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().e(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(@androidx.annotation.N InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.P ColorStateList colorStateList) {
        C0593f c0593f = this.f5654E;
        if (c0593f != null) {
            c0593f.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        C0593f c0593f = this.f5654E;
        if (c0593f != null) {
            c0593f.j(mode);
        }
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.P ColorStateList colorStateList) {
        this.f5655F.w(colorStateList);
        this.f5655F.b();
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        this.f5655F.x(mode);
        this.f5655F.b();
    }

    public E(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public E(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        b0.a(this, getContext());
        C0593f c0593f = new C0593f(this);
        this.f5654E = c0593f;
        c0593f.e(attributeSet, i4);
        A a4 = new A(this);
        this.f5655F = a4;
        a4.m(attributeSet, i4);
        getEmojiTextViewHelper().c(attributeSet, i4);
    }
}
