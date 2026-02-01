package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.RestrictTo;
import androidx.core.view.InterfaceC0814h0;
import d.C2042a;
import e.C2046a;

/* renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0596i extends CheckedTextView implements androidx.core.widget.t, InterfaceC0814h0, N, androidx.core.widget.v {

    /* renamed from: E, reason: collision with root package name */
    private final C0597j f6210E;

    /* renamed from: F, reason: collision with root package name */
    private final C0593f f6211F;

    /* renamed from: G, reason: collision with root package name */
    private final A f6212G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    private C0602o f6213H;

    public C0596i(@androidx.annotation.N Context context) {
        this(context, null);
    }

    @androidx.annotation.N
    private C0602o getEmojiTextViewHelper() {
        if (this.f6213H == null) {
            this.f6213H = new C0602o(this);
        }
        return this.f6213H;
    }

    @Override // androidx.appcompat.widget.N
    public boolean b() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        A a4 = this.f6212G;
        if (a4 != null) {
            a4.b();
        }
        C0593f c0593f = this.f6211F;
        if (c0593f != null) {
            c0593f.b();
        }
        C0597j c0597j = this.f6210E;
        if (c0597j != null) {
            c0597j.a();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.P
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.r.G(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0593f c0593f = this.f6211F;
        if (c0593f != null) {
            return c0593f.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0593f c0593f = this.f6211F;
        if (c0593f != null) {
            return c0593f.d();
        }
        return null;
    }

    @Override // androidx.core.widget.t
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCheckMarkTintList() {
        C0597j c0597j = this.f6210E;
        if (c0597j != null) {
            return c0597j.b();
        }
        return null;
    }

    @Override // androidx.core.widget.t
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0597j c0597j = this.f6210E;
        if (c0597j != null) {
            return c0597j.c();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6212G.j();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6212G.k();
    }

    @Override // android.widget.TextView, android.view.View
    @androidx.annotation.P
    public InputConnection onCreateInputConnection(@androidx.annotation.N EditorInfo editorInfo) {
        return C0603p.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.P Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0593f c0593f = this.f6211F;
        if (c0593f != null) {
            c0593f.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC0578v int i4) {
        super.setBackgroundResource(i4);
        C0593f c0593f = this.f6211F;
        if (c0593f != null) {
            c0593f.g(i4);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@androidx.annotation.P Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0597j c0597j = this.f6210E;
        if (c0597j != null) {
            c0597j.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.P Drawable drawable, @androidx.annotation.P Drawable drawable2, @androidx.annotation.P Drawable drawable3, @androidx.annotation.P Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        A a4 = this.f6212G;
        if (a4 != null) {
            a4.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.W(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.P Drawable drawable, @androidx.annotation.P Drawable drawable2, @androidx.annotation.P Drawable drawable3, @androidx.annotation.P Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        A a4 = this.f6212G;
        if (a4 != null) {
            a4.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@androidx.annotation.P ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.r.H(this, callback));
    }

    @Override // androidx.appcompat.widget.N
    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().e(z3);
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.P ColorStateList colorStateList) {
        C0593f c0593f = this.f6211F;
        if (c0593f != null) {
            c0593f.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        C0593f c0593f = this.f6211F;
        if (c0593f != null) {
            c0593f.j(mode);
        }
    }

    @Override // androidx.core.widget.t
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintList(@androidx.annotation.P ColorStateList colorStateList) {
        C0597j c0597j = this.f6210E;
        if (c0597j != null) {
            c0597j.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.t
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        C0597j c0597j = this.f6210E;
        if (c0597j != null) {
            c0597j.g(mode);
        }
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.P ColorStateList colorStateList) {
        this.f6212G.w(colorStateList);
        this.f6212G.b();
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        this.f6212G.x(mode);
        this.f6212G.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(@androidx.annotation.N Context context, int i4) {
        super.setTextAppearance(context, i4);
        A a4 = this.f6212G;
        if (a4 != null) {
            a4.q(context, i4);
        }
    }

    public C0596i(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.f49303w0);
    }

    public C0596i(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(d0.b(context), attributeSet, i4);
        b0.a(this, getContext());
        A a4 = new A(this);
        this.f6212G = a4;
        a4.m(attributeSet, i4);
        a4.b();
        C0593f c0593f = new C0593f(this);
        this.f6211F = c0593f;
        c0593f.e(attributeSet, i4);
        C0597j c0597j = new C0597j(this);
        this.f6210E = c0597j;
        c0597j.d(attributeSet, i4);
        getEmojiTextViewHelper().c(attributeSet, i4);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@InterfaceC0578v int i4) {
        setCheckMarkDrawable(C2046a.b(getContext(), i4));
    }
}
