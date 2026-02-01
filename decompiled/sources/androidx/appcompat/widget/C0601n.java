package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import d.C2042a;

/* renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0601n {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    private final EditText f6273a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.N
    private final androidx.emoji2.viewsintegration.a f6274b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0601n(@androidx.annotation.N EditText editText) {
        this.f6273a = editText;
        this.f6274b = new androidx.emoji2.viewsintegration.a(editText, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public KeyListener a(@androidx.annotation.P KeyListener keyListener) {
        if (b(keyListener)) {
            return this.f6274b.b(keyListener);
        }
        return keyListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f6274b.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(@androidx.annotation.P AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = this.f6273a.getContext().obtainStyledAttributes(attributeSet, C2042a.m.f50174v0, i4, 0);
        try {
            boolean z3 = true;
            if (obtainStyledAttributes.hasValue(C2042a.m.f50007K0)) {
                z3 = obtainStyledAttributes.getBoolean(C2042a.m.f50007K0, true);
            }
            obtainStyledAttributes.recycle();
            f(z3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public InputConnection e(@androidx.annotation.P InputConnection inputConnection, @androidx.annotation.N EditorInfo editorInfo) {
        return this.f6274b.e(inputConnection, editorInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(boolean z3) {
        this.f6274b.g(z3);
    }
}
