package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.RestrictTo;
import androidx.core.view.InterfaceC0814h0;
import d.C2042a;
import e.C2046a;

/* loaded from: classes.dex */
public class r extends MultiAutoCompleteTextView implements InterfaceC0814h0, N, androidx.core.widget.v {

    /* renamed from: H, reason: collision with root package name */
    private static final int[] f6312H = {R.attr.popupBackground};

    /* renamed from: E, reason: collision with root package name */
    private final C0593f f6313E;

    /* renamed from: F, reason: collision with root package name */
    private final A f6314F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    private final C0601n f6315G;

    public r(@androidx.annotation.N Context context) {
        this(context, null);
    }

    void a(C0601n c0601n) {
        KeyListener keyListener = getKeyListener();
        if (c0601n.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a4 = c0601n.a(keyListener);
            if (a4 == keyListener) {
                return;
            }
            super.setKeyListener(a4);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // androidx.appcompat.widget.N
    public boolean b() {
        return this.f6315G.c();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0593f c0593f = this.f6313E;
        if (c0593f != null) {
            c0593f.b();
        }
        A a4 = this.f6314F;
        if (a4 != null) {
            a4.b();
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0593f c0593f = this.f6313E;
        if (c0593f != null) {
            return c0593f.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0593f c0593f = this.f6313E;
        if (c0593f != null) {
            return c0593f.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6314F.j();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6314F.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f6315G.e(C0603p.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.P Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0593f c0593f = this.f6313E;
        if (c0593f != null) {
            c0593f.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC0578v int i4) {
        super.setBackgroundResource(i4);
        C0593f c0593f = this.f6313E;
        if (c0593f != null) {
            c0593f.g(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.P Drawable drawable, @androidx.annotation.P Drawable drawable2, @androidx.annotation.P Drawable drawable3, @androidx.annotation.P Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        A a4 = this.f6314F;
        if (a4 != null) {
            a4.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.W(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.P Drawable drawable, @androidx.annotation.P Drawable drawable2, @androidx.annotation.P Drawable drawable3, @androidx.annotation.P Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        A a4 = this.f6314F;
        if (a4 != null) {
            a4.p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@InterfaceC0578v int i4) {
        setDropDownBackgroundDrawable(C2046a.b(getContext(), i4));
    }

    @Override // androidx.appcompat.widget.N
    public void setEmojiCompatEnabled(boolean z3) {
        this.f6315G.f(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@androidx.annotation.P KeyListener keyListener) {
        super.setKeyListener(this.f6315G.a(keyListener));
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.P ColorStateList colorStateList) {
        C0593f c0593f = this.f6313E;
        if (c0593f != null) {
            c0593f.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        C0593f c0593f = this.f6313E;
        if (c0593f != null) {
            c0593f.j(mode);
        }
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.P ColorStateList colorStateList) {
        this.f6314F.w(colorStateList);
        this.f6314F.b();
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        this.f6314F.x(mode);
        this.f6314F.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        A a4 = this.f6314F;
        if (a4 != null) {
            a4.q(context, i4);
        }
    }

    public r(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.f49163S);
    }

    public r(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(d0.b(context), attributeSet, i4);
        b0.a(this, getContext());
        g0 G3 = g0.G(getContext(), attributeSet, f6312H, i4, 0);
        if (G3.C(0)) {
            setDropDownBackgroundDrawable(G3.h(0));
        }
        G3.I();
        C0593f c0593f = new C0593f(this);
        this.f6313E = c0593f;
        c0593f.e(attributeSet, i4);
        A a4 = new A(this);
        this.f6314F = a4;
        a4.m(attributeSet, i4);
        a4.b();
        C0601n c0601n = new C0601n(this);
        this.f6315G = c0601n;
        c0601n.d(attributeSet, i4);
        a(c0601n);
    }
}
