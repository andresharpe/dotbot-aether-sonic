package com.google.android.material.textfield;

import T0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.C0600m;
import com.google.android.material.internal.w;
import d1.C2044a;

/* loaded from: classes2.dex */
public class TextInputEditText extends C0600m {

    /* renamed from: K, reason: collision with root package name */
    private final Rect f33583K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f33584L;

    public TextInputEditText(@N Context context) {
        this(context, null);
    }

    @N
    private String f(@N TextInputLayout textInputLayout) {
        String str;
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z3 = !TextUtils.isEmpty(text);
        String str2 = "";
        if (!(!TextUtils.isEmpty(hint))) {
            str = "";
        } else {
            str = hint.toString();
        }
        if (z3) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) text);
            if (!TextUtils.isEmpty(str)) {
                str2 = ", " + str;
            }
            sb.append(str2);
            return sb.toString();
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    @P
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @P
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean h(@P TextInputLayout textInputLayout) {
        if (textInputLayout != null && this.f33584L) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return this.f33584L;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@P Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (h(textInputLayout) && rect != null) {
            textInputLayout.getFocusedRect(this.f33583K);
            rect.bottom = this.f33583K.bottom;
        }
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(@P Rect rect, @P Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (h(textInputLayout)) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    @P
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.Z()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.Z() && super.getHint() == null && com.google.android.material.internal.i.c()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.C0600m, android.widget.TextView, android.view.View
    @P
    public InputConnection onCreateInputConnection(@N EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(@P Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (h(textInputLayout) && rect != null) {
            this.f33583K.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.f33583K);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z3) {
        this.f33584L = z3;
    }

    public TextInputEditText(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.o5);
    }

    public TextInputEditText(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(C2044a.c(context, attributeSet, i4, 0), attributeSet, i4);
        this.f33583K = new Rect();
        TypedArray j4 = w.j(context, attributeSet, a.o.Ot, i4, a.n.je, new int[0]);
        setTextInputLayoutFocusedRectEnabled(j4.getBoolean(a.o.Pt, false));
        j4.recycle();
    }
}
