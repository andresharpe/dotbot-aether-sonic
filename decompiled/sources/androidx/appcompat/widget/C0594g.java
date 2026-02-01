package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.RestrictTo;
import androidx.core.view.InterfaceC0814h0;
import d.C2042a;

/* renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0594g extends Button implements InterfaceC0814h0, androidx.core.widget.b, androidx.core.widget.v, N {

    /* renamed from: E, reason: collision with root package name */
    private final C0593f f6199E;

    /* renamed from: F, reason: collision with root package name */
    private final A f6200F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    private C0602o f6201G;

    public C0594g(@androidx.annotation.N Context context) {
        this(context, null);
    }

    @androidx.annotation.N
    private C0602o getEmojiTextViewHelper() {
        if (this.f6201G == null) {
            this.f6201G = new C0602o(this);
        }
        return this.f6201G;
    }

    @Override // androidx.appcompat.widget.N
    public boolean b() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0593f c0593f = this.f6199E;
        if (c0593f != null) {
            c0593f.b();
        }
        A a4 = this.f6200F;
        if (a4 != null) {
            a4.b();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (q0.f6311c) {
            return super.getAutoSizeMaxTextSize();
        }
        A a4 = this.f6200F;
        if (a4 != null) {
            return a4.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (q0.f6311c) {
            return super.getAutoSizeMinTextSize();
        }
        A a4 = this.f6200F;
        if (a4 != null) {
            return a4.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (q0.f6311c) {
            return super.getAutoSizeStepGranularity();
        }
        A a4 = this.f6200F;
        if (a4 != null) {
            return a4.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (q0.f6311c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        A a4 = this.f6200F;
        if (a4 != null) {
            return a4.h();
        }
        return new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (q0.f6311c) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        A a4 = this.f6200F;
        if (a4 == null) {
            return 0;
        }
        return a4.i();
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
        C0593f c0593f = this.f6199E;
        if (c0593f != null) {
            return c0593f.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0593f c0593f = this.f6199E;
        if (c0593f != null) {
            return c0593f.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6200F.j();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6200F.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        A a4 = this.f6200F;
        if (a4 != null) {
            a4.o(z3, i4, i5, i6, i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        A a4 = this.f6200F;
        if (a4 != null && !q0.f6311c && a4.l()) {
            this.f6200F.c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        if (q0.f6311c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        A a4 = this.f6200F;
        if (a4 != null) {
            a4.t(i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@androidx.annotation.N int[] iArr, int i4) throws IllegalArgumentException {
        if (q0.f6311c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        A a4 = this.f6200F;
        if (a4 != null) {
            a4.u(iArr, i4);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (q0.f6311c) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        A a4 = this.f6200F;
        if (a4 != null) {
            a4.v(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.P Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0593f c0593f = this.f6199E;
        if (c0593f != null) {
            c0593f.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC0578v int i4) {
        super.setBackgroundResource(i4);
        C0593f c0593f = this.f6199E;
        if (c0593f != null) {
            c0593f.g(i4);
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

    @Override // android.widget.TextView
    public void setFilters(@androidx.annotation.N InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z3) {
        A a4 = this.f6200F;
        if (a4 != null) {
            a4.s(z3);
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.P ColorStateList colorStateList) {
        C0593f c0593f = this.f6199E;
        if (c0593f != null) {
            c0593f.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        C0593f c0593f = this.f6199E;
        if (c0593f != null) {
            c0593f.j(mode);
        }
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.P ColorStateList colorStateList) {
        this.f6200F.w(colorStateList);
        this.f6200F.b();
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        this.f6200F.x(mode);
        this.f6200F.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        A a4 = this.f6200F;
        if (a4 != null) {
            a4.q(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i4, float f4) {
        if (q0.f6311c) {
            super.setTextSize(i4, f4);
            return;
        }
        A a4 = this.f6200F;
        if (a4 != null) {
            a4.A(i4, f4);
        }
    }

    public C0594g(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.f49266o0);
    }

    public C0594g(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(d0.b(context), attributeSet, i4);
        b0.a(this, getContext());
        C0593f c0593f = new C0593f(this);
        this.f6199E = c0593f;
        c0593f.e(attributeSet, i4);
        A a4 = new A(this);
        this.f6200F = a4;
        a4.m(attributeSet, i4);
        a4.b();
        getEmojiTextViewHelper().c(attributeSet, i4);
    }
}
