package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.RestrictTo;
import androidx.core.view.InterfaceC0814h0;
import d.C2042a;
import e.C2046a;

/* loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements androidx.core.widget.u, InterfaceC0814h0, N, androidx.core.widget.v {

    /* renamed from: E, reason: collision with root package name */
    private final C0598k f5609E;

    /* renamed from: F, reason: collision with root package name */
    private final C0593f f5610F;

    /* renamed from: G, reason: collision with root package name */
    private final A f5611G;

    /* renamed from: H, reason: collision with root package name */
    private C0602o f5612H;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    @androidx.annotation.N
    private C0602o getEmojiTextViewHelper() {
        if (this.f5612H == null) {
            this.f5612H = new C0602o(this);
        }
        return this.f5612H;
    }

    @Override // androidx.appcompat.widget.N
    public boolean b() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0593f c0593f = this.f5610F;
        if (c0593f != null) {
            c0593f.b();
        }
        A a4 = this.f5611G;
        if (a4 != null) {
            a4.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0598k c0598k = this.f5609E;
        if (c0598k != null) {
            return c0598k.b(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0593f c0593f = this.f5610F;
        if (c0593f != null) {
            return c0593f.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0593f c0593f = this.f5610F;
        if (c0593f != null) {
            return c0593f.d();
        }
        return null;
    }

    @Override // androidx.core.widget.u
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportButtonTintList() {
        C0598k c0598k = this.f5609E;
        if (c0598k != null) {
            return c0598k.c();
        }
        return null;
    }

    @Override // androidx.core.widget.u
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportButtonTintMode() {
        C0598k c0598k = this.f5609E;
        if (c0598k != null) {
            return c0598k.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5611G.j();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5611G.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.P Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0593f c0593f = this.f5610F;
        if (c0593f != null) {
            c0593f.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC0578v int i4) {
        super.setBackgroundResource(i4);
        C0593f c0593f = this.f5610F;
        if (c0593f != null) {
            c0593f.g(i4);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0598k c0598k = this.f5609E;
        if (c0598k != null) {
            c0598k.f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.P Drawable drawable, @androidx.annotation.P Drawable drawable2, @androidx.annotation.P Drawable drawable3, @androidx.annotation.P Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        A a4 = this.f5611G;
        if (a4 != null) {
            a4.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.W(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.P Drawable drawable, @androidx.annotation.P Drawable drawable2, @androidx.annotation.P Drawable drawable3, @androidx.annotation.P Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        A a4 = this.f5611G;
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
        C0593f c0593f = this.f5610F;
        if (c0593f != null) {
            c0593f.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        C0593f c0593f = this.f5610F;
        if (c0593f != null) {
            c0593f.j(mode);
        }
    }

    @Override // androidx.core.widget.u
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@androidx.annotation.P ColorStateList colorStateList) {
        C0598k c0598k = this.f5609E;
        if (c0598k != null) {
            c0598k.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.u
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        C0598k c0598k = this.f5609E;
        if (c0598k != null) {
            c0598k.h(mode);
        }
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.P ColorStateList colorStateList) {
        this.f5611G.w(colorStateList);
        this.f5611G.b();
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        this.f5611G.x(mode);
        this.f5611G.b();
    }

    public AppCompatRadioButton(Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.f49122H2);
    }

    public AppCompatRadioButton(Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(d0.b(context), attributeSet, i4);
        b0.a(this, getContext());
        C0598k c0598k = new C0598k(this);
        this.f5609E = c0598k;
        c0598k.e(attributeSet, i4);
        C0593f c0593f = new C0593f(this);
        this.f5610F = c0593f;
        c0593f.e(attributeSet, i4);
        A a4 = new A(this);
        this.f5611G = a4;
        a4.m(attributeSet, i4);
        getEmojiTextViewHelper().c(attributeSet, i4);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@InterfaceC0578v int i4) {
        setButtonDrawable(C2046a.b(getContext(), i4));
    }
}
