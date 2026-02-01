package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0807f;
import androidx.core.view.C0823k0;
import androidx.core.view.InterfaceC0799c0;
import androidx.core.view.InterfaceC0814h0;
import d.C2042a;

/* renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0600m extends EditText implements InterfaceC0814h0, InterfaceC0799c0, N, androidx.core.widget.v {

    /* renamed from: E, reason: collision with root package name */
    private final C0593f f6265E;

    /* renamed from: F, reason: collision with root package name */
    private final A f6266F;

    /* renamed from: G, reason: collision with root package name */
    private final C0612z f6267G;

    /* renamed from: H, reason: collision with root package name */
    private final androidx.core.widget.s f6268H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    private final C0601n f6269I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.P
    private a f6270J;

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(api = 26)
    /* renamed from: androidx.appcompat.widget.m$a */
    /* loaded from: classes.dex */
    public class a {
        a() {
        }

        @androidx.annotation.P
        public TextClassifier a() {
            return C0600m.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            C0600m.super.setTextClassifier(textClassifier);
        }
    }

    public C0600m(@androidx.annotation.N Context context) {
        this(context, null);
    }

    @androidx.annotation.N
    @androidx.annotation.W(26)
    @androidx.annotation.h0
    private a getSuperCaller() {
        if (this.f6270J == null) {
            this.f6270J = new a();
        }
        return this.f6270J;
    }

    @Override // androidx.core.view.InterfaceC0799c0
    @androidx.annotation.P
    public C0807f a(@androidx.annotation.N C0807f c0807f) {
        return this.f6268H.a(this, c0807f);
    }

    @Override // androidx.appcompat.widget.N
    public boolean b() {
        return this.f6269I.c();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0593f c0593f = this.f6265E;
        if (c0593f != null) {
            c0593f.b();
        }
        A a4 = this.f6266F;
        if (a4 != null) {
            a4.b();
        }
    }

    void e(C0601n c0601n) {
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

    @Override // android.widget.TextView
    @androidx.annotation.P
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.r.G(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0593f c0593f = this.f6265E;
        if (c0593f != null) {
            return c0593f.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0593f c0593f = this.f6265E;
        if (c0593f != null) {
            return c0593f.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6266F.j();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6266F.k();
    }

    @Override // android.widget.TextView
    @androidx.annotation.N
    @androidx.annotation.W(api = 26)
    public TextClassifier getTextClassifier() {
        C0612z c0612z;
        if (Build.VERSION.SDK_INT < 28 && (c0612z = this.f6267G) != null) {
            return c0612z.a();
        }
        return getSuperCaller().a();
    }

    @Override // android.widget.TextView, android.view.View
    @androidx.annotation.P
    public InputConnection onCreateInputConnection(@androidx.annotation.N EditorInfo editorInfo) {
        String[] h02;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f6266F.r(this, onCreateInputConnection, editorInfo);
        InputConnection a4 = C0603p.a(onCreateInputConnection, editorInfo, this);
        if (a4 != null && Build.VERSION.SDK_INT <= 30 && (h02 = C0823k0.h0(this)) != null) {
            androidx.core.view.inputmethod.c.h(editorInfo, h02);
            a4 = androidx.core.view.inputmethod.f.d(this, a4, editorInfo);
        }
        return this.f6269I.e(a4, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C0608v.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i4) {
        if (C0608v.b(this, i4)) {
            return true;
        }
        return super.onTextContextMenuItem(i4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.P Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0593f c0593f = this.f6265E;
        if (c0593f != null) {
            c0593f.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC0578v int i4) {
        super.setBackgroundResource(i4);
        C0593f c0593f = this.f6265E;
        if (c0593f != null) {
            c0593f.g(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.P Drawable drawable, @androidx.annotation.P Drawable drawable2, @androidx.annotation.P Drawable drawable3, @androidx.annotation.P Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        A a4 = this.f6266F;
        if (a4 != null) {
            a4.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.W(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.P Drawable drawable, @androidx.annotation.P Drawable drawable2, @androidx.annotation.P Drawable drawable3, @androidx.annotation.P Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        A a4 = this.f6266F;
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
        this.f6269I.f(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@androidx.annotation.P KeyListener keyListener) {
        super.setKeyListener(this.f6269I.a(keyListener));
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.P ColorStateList colorStateList) {
        C0593f c0593f = this.f6265E;
        if (c0593f != null) {
            c0593f.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        C0593f c0593f = this.f6265E;
        if (c0593f != null) {
            c0593f.j(mode);
        }
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.P ColorStateList colorStateList) {
        this.f6266F.w(colorStateList);
        this.f6266F.b();
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        this.f6266F.x(mode);
        this.f6266F.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        A a4 = this.f6266F;
        if (a4 != null) {
            a4.q(context, i4);
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.W(api = 26)
    public void setTextClassifier(@androidx.annotation.P TextClassifier textClassifier) {
        C0612z c0612z;
        if (Build.VERSION.SDK_INT < 28 && (c0612z = this.f6267G) != null) {
            c0612z.b(textClassifier);
        } else {
            getSuperCaller().b(textClassifier);
        }
    }

    public C0600m(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.f49292t1);
    }

    @Override // android.widget.EditText, android.widget.TextView
    @androidx.annotation.P
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public C0600m(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(d0.b(context), attributeSet, i4);
        b0.a(this, getContext());
        C0593f c0593f = new C0593f(this);
        this.f6265E = c0593f;
        c0593f.e(attributeSet, i4);
        A a4 = new A(this);
        this.f6266F = a4;
        a4.m(attributeSet, i4);
        a4.b();
        this.f6267G = new C0612z(this);
        this.f6268H = new androidx.core.widget.s();
        C0601n c0601n = new C0601n(this);
        this.f6269I = c0601n;
        c0601n.d(attributeSet, i4);
        e(c0601n);
    }
}
